public class DrawingStmt extends Stmt{
	public static final int SQUARE = 10;
	public static final int CIRCLE = 20;
	
	private int drawingChoice;
	
	public DrawingStmt(int choice,Expr e1,Expr e2, Expr e3, Expr e4){
		drawingChoice = choice;
		this.addAST(e1);
		this.addAST(e2);
		this.addAST(e3);
		this.addAST(e4);
	}

	public int getDrawingChoice(){
		return drawingChoice;
	}
}