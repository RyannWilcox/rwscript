public class Function extends AST{

	private SymbolTableScope  parentScope = null;
	
	public Function(ArgList fParameters, Stmt funcBody){
		this.addAST(fParameters);
		this.addAST(funcBody);
	}
	
	public Function(Stmt funcBody){
		this.addAST(new ArgList());
		this.addAST(funcBody);
	}
	
	public ArgList getFParameters(){
		return (ArgList) this.getAST(0);
	}
	
	public Stmt getFuncBody(){
		return (Stmt) this.getAST(1);
	}
	
	public void setParentScope(SymbolTableScope ps){
		this.parentScope = ps;
	}
	
	public SymbolTableScope getParentScope(){
		return this.parentScope;
	}
}