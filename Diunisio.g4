//Nombre del lenguaje: Diunisio
grammar Diunisio;

//Simbolo inicial
algoritmo
 : ALGORITMO IDENTIFICADOR (PAREN_AP lista_ids PAREN_CI)? DOSPUNTOS bloque* TERMINA
 ;

//Lista de identificadores
lista_ids
 : IDENTIFICADOR (COMA IDENTIFICADOR)*
 |
 ;


//Expresiones simples
exp_simple
 : PAREN_AP exp_simple PAREN_CI
 | (op=(SUMA | MENOS))? termino (op2=(SUMA | MENOS | O) termino)*
 | termino
 ;

//Expresiones compuestas
expresion
 : PAREN_AP expresion PAREN_CI
 | exp_simple op=(IGUAL | DIFERENTE | MEN_IGUAL | MAY_IGUAL | MENOR | MAYOR) exp_simple
 | PAREN_AP exp_simple PAREN_CI
 | exp_simple
 | NO expresion
 ;

//Definicion de variable
variable
 : IDENTIFICADOR conjunto
 | IDENTIFICADOR
 ;

//Definicion de termino
termino
 : PAREN_AP termino PAREN_CI
 | factor (op=(MULT | DIV | MOD | Y | O | POTENCIA) factor)*
 | NO termino
 | factor
 ;

//Definicion de factor
factor
 : ENTERO
 | REAL
 | CADENA
 | COMPLEJO
 | NULO
 | variable
 | IDENTIFICADOR lista_parsv?
 | IDENTIFICADOR (ANGIZ factor ANGDE)+
 | IDENTIFICADOR
 | NO factor
 | VERDADERO
 | FALSO
 | conjunto
 | PAREN_AP expresion PAREN_CI
 ;

//Lista de parametros
lista_parsv
 : PAREN_AP (expresion | variable | IDENTIFICADOR) (COMA (expresion | variable | IDENTIFICADOR ))* PAREN_CI
 | PAREN_AP PAREN_CI
 ;

//Definicion de conjunto
conjunto
 : LLAVEIZ (expresion (COMA expresion)*)? LLAVEDE
 ;

//Identificador de tipo de retorno
tipo
 : INT | FLOAT | STRING | BOOL | MATRIZ | VECTOR
 ;

tipoclase
 : CLASE
 ;

//Bloque
bloque
 : LLAVEIZ LLAVEDE
 | LLAVEIZ decl_clases LLAVEDE
 | LLAVEIZ sec_proposiciones LLAVEDE
 ;

 
 
 //declaracion de clases
decl_clases
: CLASE nameClass  '{'  sec_proposiciones  '}' 
;
nameClass
 : IDENTIFICADOR
 ;

metodos
: SET IDENTIFICADOR PAREN_AP PAREN_CI LLAVEIZ asignacion LLAVEDE PCOMA 
| GET IDENTIFICADOR PAREN_AP PAREN_CI LLAVEIZ RETORNAR IDENTIFICADOR  LLAVEDE PCOMA 
| metodos estruc_control
;
//Secuenciacion
sec_proposiciones
 : (proposicion)* proposicion
 ;


//Conjunto de posibles sentencias
proposicion
 : RETORNAR expresion PCOMA
 | fun_senten
 | proc_senten
 | si_senten
 | seleccionar_senten
 | mientras_senten
 | para_senten
 | hacer_mientras_senten
 | asignacion PCOMA
 | IDENTIFICADOR lista_parsv PCOMA //Llamar funcion o procedimiento
 | LLAVEIZ sec_proposiciones LLAVEDE
 | OTRO {System.err.println("Caracter desconocido: " + $OTRO.text);}
 ;
 


//Modo de asignacion
asignacion
 : IDENTIFICADOR ASIGNAR expresion  #asigNum
 | IDENTIFICADOR ASIGNAR conjunto   #asigVec
 ;

//Seleccion IF
si_senten
 : SI bloque_condicional (SI_NO SI bloque_condicional)* (SI_NO ENTONCES? bloque)?
 ;

//Expresion a evaluar y bloque de sentencias a ejecutar
bloque_condicional
 : expresion ENTONCES? bloque
 ;

//Iteracion WHILE
mientras_senten
 : MIENTRAS bloque_condicional
 ;

//Iteracion DO WHILE
hacer_mientras_senten
 : HACER bloque MIENTRAS expresion
 ;

//Seleccion SWITCH
seleccionar_senten
 : SELECCIONAR IDENTIFICADOR LLAVEIZ casos LLAVEDE
 ;

//Bloque de casos del SWITCH
casos
 : CASO expresion DOSPUNTOS sec_proposiciones (ROMPER PCOMA)? casos     #casosGen
 | DEFECTO DOSPUNTOS sec_proposiciones                                  #casosDef
 ;

//Iteracion FOR
para_senten
 : PARA asignacion (COMA asignacion)* PCOMA expresion PCOMA asignacion (COMA asignacion)* bloque
 | PARA PAREN_AP asignacion (COMA asignacion)* PCOMA expresion PCOMA asignacion (COMA asignacion)* PAREN_CI bloque
 ;
//estructuras de control
estruc_control
: si_senten
| bloque_condicional
| mientras_senten
| hacer_mientras_senten
| seleccionar_senten
| para_senten
;

//Funcion
fun_senten
 : DEF tipo IDENTIFICADOR PAREN_AP lista_ids PAREN_CI bloque
 ;

//Procedimiento
proc_senten
 : DEF IDENTIFICADOR PAREN_AP lista_ids PAREN_CI bloque
 ;

//Sentencias de función
funcion
 : LLAVEIZ sec_proposiciones PCOMA LLAVEDE
 ;

//Expresiones regulares para tokens
COMENTARIO : ('#' ~[\r\n]*  | '/*' .*? '*/') -> skip;
ALGORITMO : 'ALGORITMO';
TERMINA : '.';
ENTONCES : 'entonces';
O : '||';
Y : '&&';
IGUAL : '==';
DIFERENTE : '!=';
MAYOR : '>';
MENOR : '<';
MAY_IGUAL : '>=';
MEN_IGUAL : '<=';
SUMA : '+';
MENOS : '-';
MULT : '*';
DIV : '/';
MOD : '%';
POTENCIA : '^';
NO : '!';
SET : 'set';
GET : 'get';
DEF : 'def';
RETORNAR : 'retornar';
INT : 'entero';
FLOAT : 'decimal';
STRING : 'cadena';
BOOL : 'booleano';
MATRIZ : 'matriz';
VECTOR : 'vector';
PCOMA : ';';
ASIGNAR : '=';
PAREN_AP : '(';
PAREN_CI : ')';
LLAVEIZ : '{';
LLAVEDE : '}';
ANGIZ : '[';
ANGDE : ']';
COMA : ',';
DOSPUNTOS : ':';
VERDADERO : 'verdadero';
FALSO : 'falso';
NULO : 'nulo';
SI : 'si';
SI_NO : 'si_no';
MIENTRAS : 'mientras';
SELECCIONAR : 'seleccionar';
CASO: 'caso';
ROMPER: 'romper';
HACER: 'hacer';
PARA : 'para';
DEFECTO : 'defecto';
CLASE : 'clase';
IDENTIFICADOR : [a-zA-Z_] [a-zA-Z_0-9]*;
ENTERO : [0-9]+;
REAL : [0-9]* '.' [0-9]* ([eE] [+-]? [0-9]+)?;
COMPLEJO : (ENTERO|REAL) [+|-] (ENTERO|REAL)? 'i';
CADENA : '"' (~["\r\n] | '""')* '"';
ESPACIO : [ \t\r\n] -> skip;
OTRO : .;
