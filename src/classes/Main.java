package classes;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileInputStream;

import org.antlr.v4.runtime.*;

public class Main {
    public static String[] parametros;
    public static String algoritmo;

    public static void main(String[] args) throws Exception {
    	System.setIn(new FileInputStream(new File("Ejemplo1.txt")));
		ANTLRInputStream input = new ANTLRInputStream(System.in);
    	DiunisioLexer lexer  = new DiunisioLexer(input);
    	CommonTokenStream tokens = new CommonTokenStream(lexer);
    	DiunisioParser parser = new DiunisioParser(tokens);
    	ParseTree tree = parser.algoritmo();
        EvalVisitor visitor = new EvalVisitor();
        visitor.visit(tree);
    }
}