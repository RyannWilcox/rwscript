import java.util.*;
public class StackDeclStmt extends Stmt{
	private String stName;
	private Stack<Integer> st = new Stack<Integer>();
	public StackDeclStmt(String n){
		stName = n;
	}
	
	public String getName(){
		return stName;
	}
	
	public Stack getStack(){
		return st;
	}
}