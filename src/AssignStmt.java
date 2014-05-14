public class AssignStmt extends Stmt{
	private String variable;
	public AssignStmt(String var,Expr exp){
		variable = var;
		this.addAST(exp);
	}
		
	public String getLVariable (){
		return variable;
	}
}
