import java.util.*;

public class SymbolTableScope{
	public static final Integer VAR  = new Integer(10);
	public static final Integer FUNC = new Integer(20);
	public static final Integer STACK = new Integer(30);
	
	private SymbolTableScope parentScope = null;
	
	private HashMap<String,Object> value = new HashMap<String,Object>();
	private HashMap<String,Integer> kind = new HashMap<String,Integer>();
	
	//TEST
	private HashMap<String,Stack> stackStore = new HashMap<String,Stack>(); 
	
	public SymbolTableScope(SymbolTableScope ps){
		parentScope = ps;
	}
	
	public SymbolTableScope getParentScope(){
		return parentScope;
	}
	public void setParentScope(SymbolTableScope ps){
		parentScope = ps;
	}
	
	public void enterVariable(String name, Integer val) {
	this.value.put(name,val);
	this.kind.put(name,VAR);
    }
    
    //TEST
    public void enterStack(String name,Stack st){
    this.stackStore.put(name,st);
    }
    
    public Stack lookupStackSymbol(String name){
    return stackStore.get(name);
    }
    

    public void enterFunction(String name, Function val) {
	this.value.put(name,val);
	this.kind.put(name,FUNC);
    }

    public Object lookupSymbol(String name) {
	return value.get(name);
    }

    public Integer lookupKind(String name) {
	return kind.get(name);
    }
}