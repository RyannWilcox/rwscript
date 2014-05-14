public class ReturnStmt extends Stmt{
	public ReturnStmt(){}
	
	public ReturnStmt(Expr e){
		this.addAST(e);
	}

	public Expr getExpr(){
		return (Expr) this.getAST(0);
	}
}