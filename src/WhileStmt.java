public class WhileStmt extends Stmt{
	public WhileStmt(Expr e,Stmt statement){
		this.addAST(e);
		this.addAST(statement);	
	}
}