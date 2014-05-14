public class FileManipulationStmt extends Stmt{
	public static final int CREATE = 10;
	public  static final int WRITE = 20;
	public static final int VIEW = 30;
	
	private String filePath ="";
	private String insertText = "";
	private int choice = 0;
    
    // if we are creating a file
    public FileManipulationStmt(int c){
        choice = c;
    }
	public FileManipulationStmt(int c,Expr d){
		choice = c;
        this.addAST(d);
	}

	public int getChoice(){
		return choice;
	}
	
	public String getInsertText(){
		return insertText;
	}
}