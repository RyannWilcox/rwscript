import java.util.*;

public class VarExpr extends Expr{
	private String varName;
	
	public VarExpr(String vn){
	varName = vn;
	}
	
	public String getVariableName(){
		return varName;
	}
}