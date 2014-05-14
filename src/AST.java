import java.util.*;
public abstract class AST {
	private ArrayList<AST> theChildren = new ArrayList<AST>();
	
	public final void addAST(AST child){
		theChildren.add(child);
	}
	public final void putAST(int r, AST child){
		theChildren.set(r,child);
	}
	
	public final AST getAST(int r){
		return theChildren.get(r);
	}
	
	public int size(){
		return theChildren.size();
	}
}