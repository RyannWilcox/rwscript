public class BuiltInExpr extends Expr{
	public static final int GREATEST = 10;
	public static final int LEAST = 20;
	public static final int LEN = 30;	
	private int theFunction;
	private String words;
	public BuiltInExpr(int f,String str){
		theFunction = f;
		words = str;
		
	}
	
	public BuiltInExpr(int f,Expr e1,Expr e2, Expr e3){
		theFunction = f;
		this.addAST(e1);
		this.addAST(e2);
		this.addAST(e3);
	}
	
	public int getBuiltInFuncName(){
		return theFunction;
	}
	
	public String getWords(){
		return words;
	}
	}