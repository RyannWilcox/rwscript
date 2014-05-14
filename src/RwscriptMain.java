import org.antlr.runtime.*;
import java.util.*;

public class RwscriptMain {
	public static SymbolTable symbolTable = new SymbolTable();
	
	public static void main(String[] args) throws Exception {
	
	if (args.length == 0) {
	    System.out.println("Usage: java Interpret <input file>");
	    System.exit(1);
	} 
	else {
	    System.out.println("Interpreting: " + args[0]);
	}
	
    ANTLRFileStream input = new ANTLRFileStream(args[0]);
    rwscriptLexer lexer = new rwscriptLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    rwscriptParser parser = new rwscriptParser(tokens);
    
    //create AST for program
     AST ast = parser.prog();


	// interpret the ast that was created
	RwscriptVisitor visitor = new RwscriptVisitor();
	visitor.dispatch(ast);
    }
}