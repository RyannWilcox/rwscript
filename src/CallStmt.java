public class CallStmt extends Stmt{
	private String funcName;
	
	public CallStmt(String fn, ArgList al){
		funcName = fn;
		this.addAST(al);
	
	}
	
	public CallStmt(String fn){
		funcName = fn;
		this.addAST(new ArgList());
	}
	
	public String getFuncName(){
		return funcName;
	}
	
	public ArgList getActualParameters(){
		return (ArgList) this.getAST(0);
	}


}