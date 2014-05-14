public class CallExpr extends Expr{

	private String funcName;
	
	public CallExpr(String fn){
		funcName = fn;
	}
	
	public CallExpr(String fn,ArgList al){
		funcName = fn;
		this.addAST(al);	
	}


	public String getFuncName(){
		return funcName;
	}
	
	public ArgList getActualParameters(){
		return (ArgList) this.getAST(0);
	}
}