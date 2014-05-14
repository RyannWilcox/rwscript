public class DoWhileStmt extends Stmt{
	public DoWhileStmt(Expr e, Stmt statement){
		this.addAST(e);
		this.addAST(statement);
	}
}