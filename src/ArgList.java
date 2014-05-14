public class ArgList extends AST{
	public ArgList(){}
	
	public ArgList(Expr e){
		this.addAST(e);
	}
}