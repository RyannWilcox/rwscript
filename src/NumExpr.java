public class NumExpr extends Expr{
	private int value;
	
	public NumExpr(String val){
		value = Integer.parseInt(val);
	}
	
	public NumExpr(int val){
		value = val;
	}
	
	public int getValue(){
		return value;
	}
}
