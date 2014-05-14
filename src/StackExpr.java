import java.util.*;
public class StackExpr extends Expr{
	public static final int STSIZE = 10;
	public static final int POP = 20;
	
	private String varName;
	private int funChoice;
	
	public StackExpr(int funcChoice,String vn){
		varName = vn;
		funChoice = funcChoice;
	}
	
	public String getVarName(){
		return varName;
	}
	
	public int getFunChoice(){
		return funChoice;
	}
}