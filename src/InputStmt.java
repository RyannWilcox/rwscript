public class InputStmt extends Stmt{
	private String variable="";
	
	public InputStmt(String var){
	variable = var;
	}
	
	public String getVariable(){
		return variable;
	}
}