public class VarDeclStmt extends Stmt{

	private String varName;
	
	public VarDeclStmt( String vn, Expr e){
		this.varName = vn;
		this.addAST(e);
	}
	
	public VarDeclStmt(String vn, Function e){
		varName = vn;
		this.addAST(e);
	}
	
    public String getVar() {
        return varName;
    }

    public Expr getValue() {
        return (Expr) this.getAST(0);
    }
}