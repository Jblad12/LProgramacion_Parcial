package classes;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Stream;

import classes.DiunisioParser.Decl_clasesContext;



public class EvalVisitor extends DiunisioBaseVisitor<Valor> {

    private static final double VALOR_PEQUENO = 0.00000000001;

    //Tablas de símbolos: Globales y Locales (por el alcance)
    private HashMap<String, Valor> globales = new HashMap<>();
    private HashMap<Integer, HashMap<String, Valor>> locales = new HashMap<>();

    private int alcanceActual = 0;
    private HashMap<Integer, String> casos = new HashMap<>();
    private boolean retornar = false;
    private Valor variable = null;

    //Visitor de las producciones de Algoritmo
    @Override
    public Valor visitAlgoritmo(DiunisioParser.AlgoritmoContext ctx) {
        Main.algoritmo = ctx.IDENTIFICADOR().getText();
        //Recibe los parámetros obtenidos de la clase Main y los inicializa
        if(ctx.lista_ids().getChildCount() > 0 && Main.parametros != null){
            int numParametro = 0;
            for(int i = 0; i < ctx.lista_ids().getChildCount(); i++){
                String x = ctx.lista_ids().getChild(i).getText();
                if(x.equals(","))
                    continue;
                Object valor = null;
                try{
                    valor = Double.parseDouble(Main.parametros[numParametro]);
                } catch (Exception e){
                    try{
                        valor = Complejo.parseComplejo(Main.parametros[numParametro]);
                    } catch (Exception e2){
                        try {
                            valor = Main.parametros[numParametro];
                        } catch (Exception e3){
                            System.out.println("No se pudo inicializar " + x);
                        }
                    }
                }
                numParametro++;
                globales.put(x, new Valor(valor));
            }
        }
        return this.visit(ctx.bloque());
    }

    //Visitor de las producciones de la Secuencia de Proposiciones
    @Override
    public Valor visitSec_proposiciones(DiunisioParser.Sec_proposicionesContext ctx) {
        for (DiunisioParser.ProposicionContext propCtx : ctx.proposicion()) {
            //Si encuentra la sentencia RETORNAR, retorna la variable adjunta
            if (propCtx.RETORNAR() != null) {
                variable = this.visit(propCtx.expresion());
                retornar = true;
                //Si retorna desde el alcance global, genera un archivo con el valor retornado
                if(alcanceActual == 0){
                    System.out.println("Algoritmo " + Main.algoritmo + " = " + variable);
                    try(  PrintWriter out = new PrintWriter( Main.algoritmo+"Retorno.txt" )  ){
                        out.println(variable);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
                return variable;
            }
            this.visit(propCtx);
        }
        return new Valor(null);
    }

    //Visitor de las producciones de Bloque
    @Override
    public Valor visitBloque(DiunisioParser.BloqueContext ctx) {
        if(ctx.sec_proposiciones() != null)
            return this.visit(ctx.sec_proposiciones());
        else if (ctx.bloqueclases()!=null)
        	return this.visit(ctx.bloqueclases());
        else
            return new Valor(null);
    }

    //Visitor de las producciones del Bloque de la Función
    private Valor visitBloqFun(DiunisioParser.BloqueContext ctx) {
        for(DiunisioParser.ProposicionContext propCtx : ctx.sec_proposiciones().proposicion()){
            //Retorna si encuentra la sentencia RETORNAR
            if(propCtx.RETORNAR() != null) {
                return this.visit(propCtx.expresion());
            }
            this.visit(propCtx);
        }
        return new Valor(null);
    }

    //Visitor de las producciones de un Factor
    @Override
    public Valor visitFactor(DiunisioParser.FactorContext ctx) {
        //Si encuentra una expresión la visita
        if(ctx.expresion() != null) {
            return this.visit(ctx.expresion());
        }
        //Si el valor es un número, lo retorna
        if (ctx.ENTERO() != null || ctx.REAL() != null) {
            return new Valor(Double.valueOf(ctx.getText()));
        }
        //Si el valor es una cadena, la retorna removiendo las comillas
        else if (ctx.CADENA() != null) {
            String cadena = ctx.getText();
            cadena = cadena.substring(1, cadena.length() - 1).replace("\"\"", "\"");
            return new Valor(cadena);
        }
        //Si el valor es un valor de verdad verdadero, lo retorna
        else if (ctx.VERDADERO() != null) {
            return new Valor(true);
        }
        //Si el valor es un valor de verdad falso, lo retorna
        else if (ctx.FALSO() != null) {
            return new Valor(false);
        }
        //Si el valor es un valor nulo, lo retorna
        else if (ctx.NULO() != null) {
            return new Valor(null);
        }
        //Si el valor es un complejo, lo retorna
        else if (ctx.COMPLEJO() != null) {
            return new Valor(Complejo.parseComplejo(ctx.COMPLEJO().getText()));
        }
        //Si el valor es una negación, la retorna
        else if (ctx.NO() != null) {
            return new Valor(!this.visit(ctx.factor(0)).aBoolean());
        }
        //Si tiene una lista de parámetros, entonces es una función
        else if (ctx.lista_parsv() != null) {
            Valor aux = this.visit(ctx.lista_parsv().expresion(0));

            //Función para saber el tamaño de un conjunto
            if (ctx.IDENTIFICADOR().getText().equals("tamano")) {
                if (aux.esVector() || aux.esMatriz())
                    return new Valor(aux.aVector().size());
            }

            //Funciones trigonométricas
            if (ctx.IDENTIFICADOR().getText().equals("abs")) {
                if (aux.esDouble())
                    return new Valor(Math.abs(aux.aDouble()));
            }
            if (ctx.IDENTIFICADOR().getText().equals("sen")) {
                if (aux.esDouble())
                    return new Valor(Math.sin(aux.aDouble()));
                else if (aux.esComplejo())
                    return new Valor(Complejo.sen(aux.aComplejo()));
            }
            if (ctx.IDENTIFICADOR().getText().equals("cos")) {
                if (aux.esDouble())
                    return new Valor(Math.cos(aux.aDouble()));
                else if (aux.esComplejo())
                    return new Valor(Complejo.cos(aux.aComplejo()));
            }
            if (ctx.IDENTIFICADOR().getText().equals("tan")) {
                if (aux.esDouble())
                    return new Valor(Math.tan(aux.aDouble()));
                else if (aux.esComplejo())
                    return new Valor(Complejo.tan(aux.aComplejo()));
            }
            if (ctx.IDENTIFICADOR().getText().equals("sec")) {
                if (aux.esDouble())
                    return new Valor(1 / Math.cos(aux.aDouble()));
                else if (aux.esComplejo())
                    return new Valor(Complejo.sec(aux.aComplejo()));
            }
            if (ctx.IDENTIFICADOR().getText().equals("csc")) {
                if (aux.esDouble())
                    return new Valor(1 / Math.sin(aux.aDouble()));
                else if (aux.esComplejo())
                    return new Valor(Complejo.csc(aux.aComplejo()));
            }
            if (ctx.IDENTIFICADOR().getText().equals("ctg")) {
                if (aux.esDouble())
                    return new Valor(1 / Math.tan(aux.aDouble()));
                else if (aux.esComplejo())
                    return new Valor(Complejo.cot(aux.aComplejo()));
            }

            //Función de subcadena
            if (ctx.IDENTIFICADOR().getText().equals("subcadena")) {
                return new Valor(aux.aString().substring((int) Double.parseDouble(this.visit(ctx.lista_parsv().expresion(1)).toString()), (int) Double.parseDouble(this.visit(ctx.lista_parsv().expresion(2)).toString())));
            }

            //Lectura de teclado
            if (ctx.IDENTIFICADOR().getText().equals("leerTeclado")) {
                Valor obj;
                try {
                    System.out.print(this.visit(ctx.lista_parsv().expresion(1)));
                } catch (Exception ignored){

                }
                Scanner sc = new Scanner(new FilterInputStream(System.in){public void close(){}});
                Scanner keyboard = sc;
                String v = keyboard.nextLine();
                if(this.visit(ctx.lista_parsv().expresion(0)).aString().equals("entero")){
                    obj = new Valor(Integer.parseInt(v));
                }
                else if(this.visit(ctx.lista_parsv().expresion(0)).aString().equals("real")){
                    obj = new Valor(Double.parseDouble(v));
                }
                else if(this.visit(ctx.lista_parsv().expresion(0)).aString().equals("cadena")){
                    obj = new Valor(v);
                }
                else if(this.visit(ctx.lista_parsv().expresion(0)).aString().equals("complejo")){
                    obj = new Valor(Complejo.parseComplejo(v));
                }
                else{
                    obj = new Valor(null);
                }
                keyboard.close();
                return obj;
            }

            //Función para leer un archivo
            if (ctx.IDENTIFICADOR().getText().equals("leerArchivo")) {
                try (Stream<String> lineas = Files.lines(Paths.get(this.visit(ctx.lista_parsv().expresion(0)).toString()))) {
                    String valor = lineas.skip(this.visit(ctx.lista_parsv().expresion(1)).aDouble().longValue()).findFirst().get();
                    Object temporal = null;
                    try {
                        temporal = Double.parseDouble(valor);
                        return new Valor(temporal);
                    } catch (Exception e) {

                    }
                    try {
                        temporal = Complejo.parseComplejo(valor);
                        return new Valor(temporal);
                    } catch (Exception e) {

                    }
                    return new Valor(valor);
                } catch (Exception e) {
                    System.err.println("¡Archivo no encontrado o línea no encontrada!");
                }
                return new Valor(null);
            }

            //Función para conocer el número de líneas de un archivo
            if (ctx.IDENTIFICADOR().getText().equals("tamanoArchivo")) {
                return tamanoArchivo(this.visit(ctx.lista_parsv().expresion(0)).toString());
            }

            //Función que genera números aleatorios uniformes
            if (ctx.IDENTIFICADOR().getText().equals("aleatorio")) {
                return new Valor(Math.random() * (this.visit(ctx.lista_parsv().expresion(1)).aDouble() - this.visit(ctx.lista_parsv().expresion(0)).aDouble()) + this.visit(ctx.lista_parsv().expresion(0)).aDouble());
            }

            //Si no es una función predefinida, intenta encontrar una función creada en tiempo de ejecución
            int numParametros = 0;
            HashMap<String, Valor> memoria = campo(encontrar(ctx.IDENTIFICADOR().getText()));
            if (memoria.containsKey(ctx.IDENTIFICADOR().getText())) {
                try {
                    FunctionValor f = (FunctionValor) memoria.get(ctx.IDENTIFICADOR().getText());
                    alcanceActual++;
                    for (int i = 0; i < ctx.lista_parsv().children.size(); i++) {

                        if (ctx.lista_parsv().children.get(i).getText().equals(",") || ctx.lista_parsv().children.get(i).getText().equals("(") || ctx.lista_parsv().children.get(i).getText().equals(")"))
                            continue;
                        memoria = alcance();
                        memoria.put(f.parametros.get(numParametros++), this.visit(ctx.lista_parsv().children.get(i)));
                    }
                    if (numParametros != f.parametros.size()) {
                        System.out.println("Error: recibidos " + numParametros + " parámetros de " + f.parametros.size());
                        return new Valor(null);
                    }
                    Valor res = null;
                    if(f.tipo.equals("funcion")) {
                        res = visitBloqFun(f.bloque);
                    }
                    else
                        visitBloqFun(f.bloque);
                    locales.remove(alcanceActual);
                    alcanceActual--;
                    return res;
                } catch (Exception e) {
                    System.out.println("Función no definida " + e );
                }
            } else {
                System.out.println("Función o procedimiento no definido");
            }
        }
        //Si es un vector o matriz, lo retorna
        else if (ctx.IDENTIFICADOR() != null) {
            HashMap<String, Valor> mem = campo(encontrar(ctx.IDENTIFICADOR().getText()));
            if (ctx.factor().size() == 1)
                return new Valor(mem.get(ctx.IDENTIFICADOR().getText()).aVector().get(this.visit(ctx.factor(0)).aDouble().intValue()));
            ArrayList aux = mem.get(ctx.IDENTIFICADOR().getText()).aMatriz();
            for (int i = 0; i < ctx.factor().size(); i++) {
                if (i == ctx.factor().size() - 1) {
                    return new Valor(aux.get(this.visit(ctx.factor(i)).aDouble().intValue()));
                }
                aux = (ArrayList) aux.get(this.visit(ctx.factor(i)).aDouble().intValue());
            }
            if (ctx.factor().size() == 1)
                return new Valor(mem.get(ctx.IDENTIFICADOR().getText()).aVector().get(this.visit(ctx.factor(0)).aDouble().intValue()));
            return new Valor(mem.get(ctx.IDENTIFICADOR().getText()).aMatriz().get(this.visit(ctx.factor(0)).aDouble().intValue()));
        }
        //Si es una variable, la retorna
        else if (ctx.variable() != null) {
            HashMap<String, Valor> mem = campo(encontrar(ctx.variable().getText()));
            if(mem == null)
                return new Valor(null);
            return mem.get(ctx.variable().getText());
        }
        //Si es un conjunto, lo retorna
        else if (ctx.conjunto() != null) {
            return this.visit(ctx.conjunto());
        }
        //Si no es nada, retorna un valor nulo
        return new Valor(null);
    }

    //Visitor de las producciones de una Proposición
    @Override
    public Valor visitProposicion(DiunisioParser.ProposicionContext ctx) {
        if (ctx.IDENTIFICADOR() != null) {
            //Imprime en consola
            if (ctx.IDENTIFICADOR().getText().equals("imprimirPantalla")) {
                System.out.println(this.visit(ctx.lista_parsv().expresion(0)));
                return new Valor(null);
            }
            //Imprime la matriz en consola
            if (ctx.IDENTIFICADOR().getText().equals("imprimirMatriz")) {
                for (ArrayList x : this.visit(ctx.lista_parsv().expresion(0)).aMatriz()) {
                    System.out.println(x);
                }
                return new Valor(null);
            }
            //Imprime el valor en el archivo
            if (ctx.IDENTIFICADOR().getText().equals("imprimirArchivo")) {
                Valor aux = this.visit(ctx.lista_parsv().expresion(1));
                Object temp = null;
                if (aux.esDouble())
                    temp = aux.aDouble();
                else if (aux.esMatriz()) {
                    temp = aux.aMatriz();
                } else if (aux.esVector()) {
                    temp = aux.aVector();
                } else if (aux.esComplejo()) {
                    temp = aux.aComplejo();
                } else {
                    temp = aux.aString();
                }
                escribirArchivo(this.visit(ctx.lista_parsv().expresion(0)).aString(), temp, true);
                return new Valor(null);
            }
            //Elimina el contenido del archivo
            if (ctx.IDENTIFICADOR().getText().equals("limpiarArchivo")) {
                PrintWriter writer = null;
                try {
                    writer = new PrintWriter(this.visit(ctx.lista_parsv().expresion(0)).aString());
                    writer.print("");
                    writer.close();
                } catch (FileNotFoundException e) {
                    System.err.println("¡Archivo no encontrado!");
                }
                return new Valor(null);
            }
            //Llama una función o procedimiento
            else {
                try {
                    int u = 0;
                    HashMap<String, Valor> mem = campo(encontrar(ctx.IDENTIFICADOR().getText()));
                    FunctionValor f = (FunctionValor) mem.get(ctx.IDENTIFICADOR().getText());
                    alcanceActual++;
                    for (int i = 0; i < ctx.lista_parsv().children.size(); i++) {
                        if (ctx.lista_parsv().children.get(i).getText().equals(",") || ctx.lista_parsv().children.get(i).getText().equals("(") || ctx.lista_parsv().children.get(i).getText().equals(")"))
                            continue;
                        mem = alcance();
                        mem.put(f.parametros.get(u++), this.visit(ctx.lista_parsv().children.get(i)));
                    }
                    if (u != f.parametros.size()) {
                        System.out.println("Error: recibidos " + u + " parámetros de " + f.parametros.size());
                        return new Valor(null);
                    }
                    Valor res = null;
                    if(f.tipo.equals("funcion")) {
                        res = visitBloqFun(f.bloque);
                    }
                    else
                        visitBloqFun(f.bloque);
                    locales.remove(alcanceActual);
                    alcanceActual--;
                } catch (Exception e) {
                    System.out.println("Función no definida " + e );
                }
                return new Valor(null);
            }
        }
        //Retorna la ejecución de las sentencias de selección e iteración
        else if (ctx.mientras_senten() != null) {
            return this.visit(ctx.mientras_senten());
        } else if (ctx.asignacion() != null) {
            return this.visit(ctx.asignacion());
        } else if (ctx.si_senten() != null) {
            return this.visit(ctx.si_senten());
        } else if (ctx.para_senten() != null) {
            return this.visit(ctx.para_senten());
        } else if (ctx.hacer_mientras_senten() != null) {
            return this.visit(ctx.hacer_mientras_senten());
        } else if (ctx.seleccionar_senten() != null) {
            l++;
            return this.visit(ctx.seleccionar_senten());
        } else if (ctx.proc_senten() != null) {
            return this.visit(ctx.proc_senten());
        } else if (ctx.fun_senten() != null) {
            return this.visit(ctx.fun_senten());
        }
        //Si encuentra la sentencia RETORNAR, retorna la expresión
        else if (ctx.RETORNAR() != null) {
            retornar = true;
            return this.visit(ctx.expresion());
        }
        return this.visit(ctx);
    }

    //Visitor de las producciones de una definición de un Procedimiento
    @Override
    public Valor visitProc_senten(DiunisioParser.Proc_sentenContext ctx) {
        FunctionValor funcion = new FunctionValor(null);
        funcion.bloque = ctx.bloque();
        funcion.tipo = "procedimiento";
        for (int i = 0; i < ctx.lista_ids().IDENTIFICADOR().size(); i++) {
            funcion.parametros.add(ctx.lista_ids().IDENTIFICADOR(i).getText());
        }
        HashMap<String, Valor> memoria = globales;
        memoria.put(ctx.IDENTIFICADOR().getText(), funcion);
        return new Valor(null);
    }

    //Visitor de las producciones de una definición de Función
    @Override
    public Valor visitFun_senten(DiunisioParser.Fun_sentenContext ctx) {
        FunctionValor funcion = new FunctionValor(null);
        funcion.bloque = ctx.bloque();
        funcion.tipo = "funcion";
        for (int i = 0; i < ctx.lista_ids().IDENTIFICADOR().size(); i++) {
            funcion.parametros.add(ctx.lista_ids().IDENTIFICADOR(i).getText());
        }
        HashMap<String, Valor> memoria = globales;
        memoria.put(ctx.IDENTIFICADOR().getText(), funcion);
        return new Valor(null);
    }

    //Visitor de las producciones de una Función
    @Override
    public Valor visitFuncion(DiunisioParser.FuncionContext ctx) {
        alcanceActual++;
        this.visit(ctx.sec_proposiciones());
        return this.visit(ctx.sec_proposiciones());
    }

    //Visitor de las producciones de la selección SI
    @Override
    public Valor visitSi_senten(DiunisioParser.Si_sentenContext ctx) {
        for (int i = 0; i < ctx.bloque_condicional().size(); i++) {
            if (this.visit(ctx.bloque_condicional(i).expresion()).aBoolean()) {
                alcanceActual++;
                if(ctx.bloque_condicional(i).bloque() != null)
                    this.visit(ctx.bloque_condicional(i).bloque());
                alcanceActual--;
                return new Valor(null);
            }
        }
        if (ctx.bloque() != null) {
            alcanceActual++;
            this.visit(ctx.bloque());
        }
        alcanceActual--;
        return new Valor(null);
    }

    //Visitor de las producciones de la iteración MIENTRAS
    @Override
    public Valor visitMientras_senten(DiunisioParser.Mientras_sentenContext ctx) {
        while (this.visit(ctx.bloque_condicional().expresion()).aBoolean()) {
            alcanceActual++;
            if(ctx.bloque_condicional().bloque() != null)
                this.visit(ctx.bloque_condicional().bloque());
            alcanceActual--;
        }
        return new Valor(null);
    }

    //Visitor de las producciones de la iteración HACER_MIENTRAS
    @Override
    public Valor visitHacer_mientras_senten(DiunisioParser.Hacer_mientras_sentenContext ctx) {
        do {
            alcanceActual++;
            this.visit(ctx.bloque().sec_proposiciones());
            alcanceActual--;
        } while (this.visit(ctx.expresion()).aBoolean());
        return new Valor(null);
    }

    //Visitor de las producciones de una selección SELECCIONAR
    int l = 0;
    @Override
    public Valor visitCasosGen(DiunisioParser.CasosGenContext ctx) {
        if (!casos.containsKey(l)) {
            casos.put(l, ctx.getParent().getChild(1).getText());
        }
        HashMap<String, Valor> memoria = campo(encontrar(casos.get(l)));
        if (this.visit(ctx.expresion()).valor.equals(memoria.get(casos.get(l)).valor)) {
            alcanceActual++;
            this.visit(ctx.sec_proposiciones());
            if (ctx.ROMPER() != null) {
                alcanceActual--;
                return new Valor(null);
            }
            alcanceActual--;
        }
        return this.visit(ctx.casos());
    }

    //Visitor de las producciones de los casos de una selección SELECCIONAR
    @Override
    public Valor visitCasosDef(DiunisioParser.CasosDefContext ctx) {
        l = 0;
        alcanceActual++;
        this.visit(ctx.sec_proposiciones());
        alcanceActual--;
        return new Valor(null);
    }

    //Visitor de las producciones de una iteración PARA
    @Override
    public Valor visitPara_senten(DiunisioParser.Para_sentenContext ctx) {
        int j = 0;
        alcanceActual++;
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i) instanceof DiunisioParser.AsigNumContext) {
                j++;
            }
            if (ctx.children.get(i) instanceof DiunisioParser.ExpresionContext) {
                break;
            }
        }
        for (int i = 0; i < j; i++) {
            this.visit(ctx.asignacion(i));
        }
        while (this.visit(ctx.expresion()).aBoolean()) {
            alcanceActual++;
            this.visit(ctx.bloque());
            alcanceActual--;
            for (int i = j; i < ctx.asignacion().size(); i++) {
                this.visit(ctx.asignacion(i));
            }
        }
        alcanceActual--;
        return new Valor(null);
    }

    //Visitor de las producciones de la creación de un conjunto
    @Override
    public Valor visitConjunto(DiunisioParser.ConjuntoContext ctx) {
        if (!ctx.getText().contains("{{")) {
            ArrayList vector = new ArrayList<>();
            for (DiunisioParser.ExpresionContext i : ctx.expresion()) {
                vector.add(this.visit(i).aDouble());
            }
            return new Valor(vector);
        } else {
            ArrayList<ArrayList> matrix = new ArrayList<>();
            for (DiunisioParser.ExpresionContext k : ctx.expresion()) {
                matrix.add(this.visit(k).aVector());
            }
            return new Valor(matrix);
        }
    }

    //Visitor de las producciones de consulta de una variable almacenada
    @Override
    public Valor visitVariable(DiunisioParser.VariableContext ctx) {
        HashMap<String, Valor> mem = campo(encontrar(ctx.IDENTIFICADOR().getText()));
        return mem.get(ctx.IDENTIFICADOR().getText());
    }

    //Visitor de las producciones de la asignación de un número
    @Override
    public Valor visitAsigNum(DiunisioParser.AsigNumContext ctx) {
        String id = ctx.IDENTIFICADOR().getText();
        Valor valor = this.visit(ctx.expresion());
        HashMap<String, Valor> mem;
        if (encontrar(id) == -1) {
            if (alcanceActual == 0)
                mem = globales;
            else {
                if(!locales.containsKey(alcanceActual))
                    locales.put(alcanceActual, new HashMap<>());
                mem = alcance();
            }
        } else {
            mem = campo(encontrar(id));
        }
        if (retornar) {
            retornar = false;
            return mem.put(id, variable);
        }
        return mem.put(id, valor);
    }

    //Visitor de las producciones de la evaluación de una expresión
    @Override
    public Valor visitExpresion(DiunisioParser.ExpresionContext ctx) {
        if (ctx.NO() != null) {
            return new Valor(!(this.visit(ctx.expresion())).aBoolean());
        }
        if(ctx.expresion() != null){
            return this.visit(ctx.expresion());
        }
        if (ctx.op != null) {
            switch (ctx.op.getText()) {
                case ">":
                    return new Valor(this.visit(ctx.exp_simple(0)).aDouble() > this.visit(ctx.exp_simple(1)).aDouble());
                case "<":
                    return new Valor(this.visit(ctx.exp_simple(0)).aDouble() < this.visit(ctx.exp_simple(1)).aDouble());
                case "==":
                    return new Valor(Math.abs(this.visit(ctx.exp_simple(0)).aDouble() - this.visit(ctx.exp_simple(1)).aDouble()) <= VALOR_PEQUENO);
                case "!=":
                    return new Valor(Math.abs(this.visit(ctx.exp_simple(0)).aDouble() - this.visit(ctx.exp_simple(1)).aDouble()) >= VALOR_PEQUENO);
                case "<=":
                    return new Valor(this.visit(ctx.exp_simple(0)).aDouble() <= this.visit(ctx.exp_simple(1)).aDouble());
                case ">=":
                    return new Valor(this.visit(ctx.exp_simple(0)).aDouble() >= this.visit(ctx.exp_simple(1)).aDouble());
                default:
                    break;
            }
        }
        try{
            return this.visit(ctx.expresion());
        } catch (Exception e){
            try{
                return this.visit(ctx.exp_simple(0));
            } catch (Exception ignored){
            }
        }
        return new Valor(null);
    }

    //Visitor de las producciones de una expresión simple
    @Override
    public Valor visitExp_simple(DiunisioParser.Exp_simpleContext ctx) {
        Valor total = new Valor(null);
        try {
            if (ctx.termino(0) != null) {
                total = this.visit(ctx.termino(0));
            } else if (ctx.exp_simple() != null) {
                total = this.visit(ctx.exp_simple());
            } else {
                total = new Valor(null);
            }
        } catch (Exception ignored) {
        }
        int suma = 0, menos = 0, o = 0;
        if (ctx.getChild(0).getText().equals("-")) {
            total = new Valor(-1 * total.aDouble());
            menos++;
        }
        for (int i = 1; i < ctx.termino().size(); i++) {
            if (ctx.SUMA(suma) != null) {
                try {
                    total = new Valor(total.aDouble() + this.visit(ctx.termino(i)).aDouble());
                } catch (Exception e) {
                    try {
                        total = new Valor(sumaV(total.aVector(), this.visit(ctx.termino(i)).aVector()));
                    } catch (Exception e1) {
                        try {
                            total = new Valor(suma(total.aMatriz(), this.visit(ctx.termino(i)).aMatriz()));
                        } catch (Exception e2) {

                            try {
                                total = new Valor(Complejo.suma(total.aComplejo(), this.visit(ctx.termino(i)).aComplejo()));
                            } catch (Exception e3) {
                                total = new Valor(total.aString() + this.visit(ctx.termino(i)).aString());
                            }
                        }
                    }
                }
                suma++;
            } else if (ctx.MENOS(menos) != null) {
                try {
                    total = new Valor(total.aDouble() - this.visit(ctx.termino(i)).aDouble());
                } catch (Exception e) {
                    try {
                        total = new Valor(restaV(total.aVector(), this.visit(ctx.termino(i)).aVector()));
                    } catch (Exception e1) {
                        try {
                            total = new Valor(resta(total.aMatriz(), this.visit(ctx.termino(i)).aMatriz()));
                        } catch (Exception e2) {
                            try {
                                total = new Valor(Complejo.resta(total.aComplejo(), this.visit(ctx.termino(i)).aComplejo()));
                            } catch (Exception e3) {
                                return new Valor(null);
                            }
                        }
                    }
                }
                menos++;
            } else if (ctx.O(o) != null) {
                total = new Valor(total.aDouble() + this.visit(ctx.termino(i)).aDouble());
                o++;
            }
        }
        return total;
    }

    //Visitor de las producciones de un término
    @Override
    public Valor visitTermino(DiunisioParser.TerminoContext ctx) {
        if(ctx.NO() != null) {
            return new Valor(!(this.visit(ctx.termino())).aBoolean());
        }
        if(ctx.PAREN_AP() != null){
            return this.visit(ctx.termino());
        }
        Valor total = this.visit(ctx.factor(0));
        int producto = 0, division = 0, modulo = 0, y = 0, o = 0, potencia = 0;
        for (int i = 1; i < ctx.factor().size(); i++) {
            if (ctx.MULT(producto) != null) {
                if (total.esDouble())
                    total = new Valor(total.aDouble() * this.visit(ctx.factor(i)).aDouble());
                if (total.esMatriz())
                    total = new Valor(producto(total.aMatriz(), this.visit(ctx.factor(i)).aMatriz()));
                if (total.esComplejo())
                    total = new Valor(Complejo.producto(total.aComplejo(), this.visit(ctx.factor(i)).aComplejo()));
                if (total.esVector())
                    total = new Valor(punto(total.aVector(), this.visit(ctx.factor(i)).aVector()));
                producto++;
            } else if (ctx.DIV(division) != null) {
                if (total.esDouble())
                    total = new Valor(total.aDouble() / this.visit(ctx.factor(i)).aDouble());
                if (total.esComplejo())
                    total = new Valor(Complejo.division(total.aComplejo(), this.visit(ctx.factor(i)).aComplejo()));
                division++;
            } else if (ctx.MOD(modulo) != null) {
                if (total.esDouble())
                    total = new Valor(total.aDouble() % this.visit(ctx.factor(i)).aDouble());
                if (total.esComplejo())
                    total = new Valor(Complejo.division(total.aComplejo(), this.visit(ctx.factor(i)).aComplejo()));
                modulo++;
            } else if (ctx.POTENCIA(potencia) != null) {
                if (total.esDouble())
                    total = new Valor(Math.pow(total.aDouble(),this.visit(ctx.factor(i)).aDouble()));
                if (total.esComplejo())
                    total = new Valor(Complejo.pow(total.aComplejo(), this.visit(ctx.factor(i)).aDouble().intValue()));
                potencia++;
            } else if (ctx.Y(y) != null) {
                total = new Valor(total.aBoolean() && this.visit(ctx.factor(i)).aBoolean());
                y++;
            } else if (ctx.O(o) != null) {
                total = new Valor(total.aBoolean() || this.visit(ctx.factor(i)).aBoolean());
                o++;
            }
        }
        return total;
    }

    //Función para hallar la tabla de símbolos en un alcance dado, lo crea si no existe
    private HashMap<String, Valor> alcance() {
        if (alcanceActual == 0)
            return globales;
        else {
            if (!locales.containsKey(alcanceActual)) {
                locales.put(alcanceActual, new HashMap<>());
            }
            return locales.get(alcanceActual);
        }
    }

    //Función para hallar el alcance en que se encuentra una variable almacenada
    private int encontrar(String var) {
        int i = alcanceActual;
        HashMap<String, Valor> auxiliar;
        while (i > 0) {
            auxiliar = locales.get(i);
            if (auxiliar == null) {
                locales.put(alcanceActual, new HashMap<>());
                auxiliar = locales.get(i);
            }
            if (auxiliar.containsKey(var))
                return i;
            i--;
        }
        if (i == 0) {
            if (globales.containsKey(var))
                return 0;
        }
        return -1;
    }

    //Función para retornar la tabla de símbolos en un alcance dado
    private HashMap<String, Valor> campo(int i) {
        if (i == 0)
            return globales;
        else
            return locales.get(i);
    }

    //Función para sumar vectores
    private ArrayList<Double> sumaV(ArrayList<Double> a, ArrayList<Double> b) {
        ArrayList<Double> res = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            res.add(a.get(i) + b.get(i));
        }
        return res;
    }

    //Función para restar vectores
    private ArrayList<Double> restaV(ArrayList<Double> a, ArrayList<Double> b) {
        ArrayList<Double> res = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            res.add(a.get(i) - b.get(i));
        }
        return res;
    }

    //Función para sumar matrices
    public ArrayList<ArrayList> suma(ArrayList<ArrayList> a, ArrayList<ArrayList> b) {
        ArrayList<ArrayList> res = new ArrayList<>();
        ArrayList aux;
        for (int i = 0; i < a.size(); i++) {
            aux = new ArrayList<>();
            for (int j = 0; j < a.get(0).size(); j++) {
                aux.add((Double) a.get(i).get(j) + (Double) b.get(i).get(j));
            }
            res.add(aux);
        }
        return res;
    }

    //Función para restar matrices
    private ArrayList<ArrayList> resta(ArrayList<ArrayList> a, ArrayList<ArrayList> b) {
        ArrayList<ArrayList> res = new ArrayList<>();
        ArrayList aux;
        for (int i = 0; i < a.size(); i++) {
            aux = new ArrayList<>();
            for (int j = 0; j < a.get(0).size(); j++) {
                aux.add((Double) a.get(i).get(j) - (Double) b.get(i).get(j));
            }
            res.add(aux);
        }
        return res;
    }

    //Función para hacer el producto cruz entre matricez
    private ArrayList<ArrayList> producto(ArrayList<ArrayList> a, ArrayList<ArrayList> b) {
        ArrayList<ArrayList> res = new ArrayList<>();
        ArrayList aux;

        int m1rows = a.size();
        int m1cols = a.get(0).size();
        int m2rows = b.size();
        int m2cols = b.get(0).size();
        if (m1cols != m2rows)
            throw new IllegalArgumentException("Las matrices no se pueden multiplicar: " + m1cols + " != " + m2rows);

        double n;
        for (int i = 0; i < m1rows; i++) {
            aux = new ArrayList<>();
            for (int j = 0; j < m2cols; j++) {
                n = 0;
                for (int k = 0; k < m1cols; k++) {
                    n += (Double) a.get(i).get(k) * (Double) b.get(k).get(j);
                }
                aux.add(n);
            }
            res.add(aux);
        }
        return res;
    }

    //Función para hacer el producto punto
    private double punto(ArrayList a, ArrayList b) {
        double res = 0;
        for (int i = 0; i < b.size(); i++){
            res += (Double) a.get(i) * (Double) b.get(i);
        }
        return res;
    }

    //Función para escribir un dato en un archivo
    private void escribirArchivo(String filename, Object dato, boolean sobreescribir) {
        try {
            FileWriter fw = new FileWriter(filename, sobreescribir);
            fw.write(dato + "\n");
            fw.close();
        } catch (IOException ioe) {
            System.err.println("ESExcepción: " + ioe.getMessage());
        }
    }

    //Función para conocer el número de líneas de un archivo
    private Valor tamanoArchivo(String filename) {
        LineNumberReader lnr = null;
        try {
            lnr = new LineNumberReader(new FileReader(new File(filename)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            lnr.skip(Long.MAX_VALUE);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            lnr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Valor((double) (lnr.getLineNumber()));
    }
   @Override
public Valor visitDecl_clases(Decl_clasesContext ctx) {
	   
	return super.visitDecl_clases(ctx);
} 

}
