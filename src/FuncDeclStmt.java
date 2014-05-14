public class FuncDeclStmt extends Stmt{
	private String name;
	
	public FuncDeclStmt(String n, Function func){
		this.name = n;
		this.addAST(func);
	}
	
	public String getName(){
		return name;
	}
	
	public Function getFValue(){
		return (Function) this.getAST(0);
	}
	
}