public class IfStmt extends Stmt{

	public IfStmt(Expr e, Stmt statement1){
		this.addAST(e);
		this.addAST(statement1);
	}
	
	public IfStmt(Expr e,Stmt statement1, Stmt statement2){
		this.addAST(e);
		this.addAST(statement1);
		this.addAST(statement2);
	}
}