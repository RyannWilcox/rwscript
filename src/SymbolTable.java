import java.util.*;
public class SymbolTable{
    private SymbolTableScope globalScope = new SymbolTableScope(null);
    private SymbolTableScope currentScope = globalScope;
    
    //Test
    private SymbolTableScope stackScope = new SymbolTableScope(null);

    public SymbolTableScope getCurrentScope() {
		return this.currentScope;
    }

    public void setCurrentScope(SymbolTableScope scope) {
		this.currentScope = scope;
    }

    public SymbolTableScope  pushScope() {
		currentScope = new SymbolTableScope(currentScope);
		return currentScope;
    }

    public SymbolTableScope popScope() {
		currentScope = currentScope.getParentScope();
		return currentScope;
    }
    
	/*Variable related*/
	public void declareVariable(String symbol, Integer value){
		if(currentScope.lookupSymbol(symbol) == null){
			currentScope.enterVariable(symbol,value);
		}
		else{
			System.err.println("Error: variable already declared in current scope");
			System.exit(1);
		}
	}
	
	//TEST
	public void declareStack(String symbol,Stack st){
		stackScope.enterStack(symbol,st);
	}
	
	public Stack lookupStack(String symbol){
		SymbolTableScope tempScope = stackScope;
		Stack value = tempScope.lookupStackSymbol(symbol);
			 if (tempScope == null) {
				System.err.println
				("Error: stack not declared.");
				System.exit(1);
				return null;
	    		}
		
		return (Stack) value;
	}
	
	public void updateStack(String symbol,Stack newValue){
			stackScope.enterStack(symbol,newValue);	
	}
	
	
	public Integer lookupVariable(String symbol){
		SymbolTableScope tempScope = currentScope;
		Object value = tempScope.lookupSymbol(symbol);
		
		if(value != null){
			return (Integer) value;
		}
		else{
			while(value == null){
			tempScope = tempScope.getParentScope();
	    		if (tempScope == null) {
					System.err.println
					("Error: function not declared.");
					System.exit(1);
					return null;
	    		}
	    value = tempScope.lookupSymbol(symbol);
	   		}
	   	if (tempScope.lookupKind(symbol).equals(SymbolTableScope.VAR)) {
	    	return (Integer) value;
		}
		else {
			System.err.println("Error: symbol is not a functions.");
			System.exit(1);
			return null;
		}
		}
	}
	
	public void updateVariable(String symbol,Integer newVal){
		SymbolTableScope tempScope = currentScope;
		Object value = tempScope.lookupSymbol(symbol);

	while (value == null) {
	    tempScope = tempScope.getParentScope();
	    if (tempScope == null) {
		System.err.println("Error: variable not declared.");
		System.exit(1);
	    }
	    value = tempScope.lookupSymbol(symbol);
	}

	if (tempScope.lookupKind(symbol).equals(SymbolTableScope.VAR)) {
	    tempScope.enterVariable(symbol,newVal);
	}
	else {
		System.err.println("Error: symbol is not a variable.");
		System.exit(1);
	}
	}


	/*Function related */
	public void declareFunction(String symbol, Function value){
			if(currentScope.lookupSymbol(symbol) == null){
			currentScope.enterFunction(symbol,value);
		}
		else{
			System.err.println("Error: function already declared in current scope");
			System.exit(1);
		}
	}
	
	public Function lookupFunction(String symbol){
		SymbolTableScope tempScope = currentScope;
		Object value = tempScope.lookupSymbol(symbol);
		
				
		if(value != null){
			return (Function) value;
		}
		else{
			while(value == null){
			tempScope = tempScope.getParentScope();
	    		if (tempScope == null) {
					System.err.println
					("Error: function not declared.");
					System.exit(1);
					return null;
	    		}
	    value = tempScope.lookupSymbol(symbol);
	   		}
	   	if (tempScope.lookupKind(symbol).equals(SymbolTableScope.FUNC)) {
	    	return (Function) value;
		}
		else {
			System.err.println("Error: symbol is not a functions.");
			System.exit(1);
			return null;
		}
		}
	}
	
	
	
}