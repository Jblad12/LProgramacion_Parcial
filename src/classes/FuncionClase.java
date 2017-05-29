package classes;

import java.util.ArrayList;

//Clase que almacenara las clases
public class FuncionClase extends Valor {
	public ArrayList<String> parametros = new ArrayList<>();
    
	public String tipoClase;
    public DiunisioParser.BloqueContext bloque;
    //Constructor
    public FuncionClase(Object value){
        super(value);
    }
}
