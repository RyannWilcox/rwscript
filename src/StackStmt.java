public class StackStmt extends Stmt{
	public static final int POP = 10;
	public static final int PUSH = 20;
	public static final int SORT = 30;
	public static final int PRINT = 40;

	private String varName="";
	private int funChosen;
	
	
	public StackStmt(int funcChosen,String n){
		varName = n;
		funChosen = funcChosen;
	}
	
	public StackStmt(int funcChosen,String n, Expr e){
		varName = n;
		funChosen = funcChosen;
		this.addAST(e);
	}
	
	public String getName(){
		return varName;
	}
	
	public int getFunctionChosen(){
		return funChosen;
	}
	
	public Expr getExpr(){
		return (Expr) this.getAST(0);
	}
}