public class BinopExpr extends Expr{
	public static final int AND = 10;  public static final int OR = 20;
	public static final int ADD = 30; public static final int SUB = 40;
	public static final int MULT = 50; public static final int DIV = 60;
	public static final int EQ = 70;   public static final int LEQ = 80;
    public static final int GEQ = 90;
	
	private int operation = 0;
	
	public BinopExpr(int op, Expr e1, Expr e2){
		operation = op;
		
		this.addAST(e1);
		this.addAST(e2);
	}

	public int getOperation(){
		return operation;
	}
}