import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;

public class RwscriptVisitor{
	private Scanner Input = new Scanner(System.in); // for input Statement
	private void initializeParameters(ArgList functionParameters, ArgList actualParameters)
										throws ReturnValueException{
        // Do both lists have equal parameters?
        if (functionParameters.size() != actualParameters.size()) {
            System.err.println("Error: Parameter lists do not have equal amounts.");
            System.exit(1);
        }
        for(int i = 0; i < functionParameters.size(); i++){
            VarExpr funcVar = (VarExpr) functionParameters.getAST(i);
            String funcName = funcVar.getVariableName();
                        
            Integer paramVal = this.dispatch(actualParameters.getAST(i));
            
            RwscriptMain.symbolTable.declareVariable(funcName,paramVal);
               
        }
	}
	
	public Integer dispatch(AST ast) throws ReturnValueException{
		if(ast.getClass() == AssignStmt.class) return interp((AssignStmt)ast);
	else if	(ast.getClass() == BlockStmt.class) return interp((BlockStmt)ast);
	else if (ast.getClass() == StmtList.class) return interp((StmtList)ast);
	else if (ast.getClass() == CallStmt.class) return interp((CallStmt)ast);
	else if (ast.getClass() == DoWhileStmt.class) return interp((DoWhileStmt)ast);
    	else if (ast.getClass() == DrawingStmt.class) return interp((DrawingStmt)ast);
    	else if (ast.getClass() == FileManipulationStmt.class)return interp ((FileManipulationStmt)ast);
    	else if (ast.getClass() == FuncDeclStmt.class) return interp((FuncDeclStmt)ast);
    	else if (ast.getClass() == IfStmt.class) return interp((IfStmt)ast);
    	else if (ast.getClass() == InputStmt.class) return interp((InputStmt)ast);
    	else if (ast.getClass() == PrintStmt.class) return interp((PrintStmt)ast);
	else if (ast.getClass() == ReturnStmt.class) return interp((ReturnStmt)ast);
    	else if (ast.getClass() == StackDeclStmt.class) return interp((StackDeclStmt)ast);
    	else if (ast.getClass() == StackStmt.class) return interp((StackStmt)ast);
    	else if (ast.getClass() == VarDeclStmt.class) return interp((VarDeclStmt)ast);
    	else if (ast.getClass() == WhileStmt.class) return interp((WhileStmt)ast);
    	else if (ast.getClass() == BinopExpr.class) return interp((BinopExpr)ast);
    	else if (ast.getClass() == BuiltInExpr.class) return interp((BuiltInExpr)ast);
    	else if (ast.getClass() == CallExpr.class) return interp((CallExpr)ast);
    	else if (ast.getClass() == StackExpr.class) return interp((StackExpr)ast);
    	else if (ast.getClass() == NumExpr.class) return interp((NumExpr)ast);
    	else if (ast.getClass() == VarExpr.class) return interp((VarExpr)ast);
    	else{
    		System.out.println("Error: dispatch cannot find class");
    		System.exit(1);
    		return null;

    	}
	}
    
    /************* 
    ****STATEMENTS
    **************
    */
    public Integer interp(AssignStmt ast) throws ReturnValueException{
   		//get value to be assigned
        Integer assignExpr = this.dispatch(ast.getAST(0));
        //assign the value from above
        RwscriptMain.symbolTable.updateVariable(ast.getLVariable(),assignExpr);
        return null;
    }
    
    public Integer interp(BlockStmt ast) throws ReturnValueException{
        RwscriptMain.symbolTable.pushScope(); // add new scope
        // interpret statements in the block statement
        for(int i = 0; i < ast.size();i++){
            this.dispatch(ast.getAST(i));
        }
        
        RwscriptMain.symbolTable.popScope(); // get rid of scope when done
        return null;
    }

    public Integer interp(CallStmt ast) throws ReturnValueException{
    	Function funcValue = RwscriptMain.symbolTable.lookupFunction(ast.getFuncName());
    	
    	//save top of stack
    	SymbolTableScope topStack = RwscriptMain.symbolTable.getCurrentScope();
    	
    	//push new scope onto stack
    	RwscriptMain.symbolTable.pushScope();
    	
    	initializeParameters(funcValue.getFParameters(),ast.getActualParameters());
    	RwscriptMain.symbolTable.getCurrentScope().setParentScope(funcValue.getParentScope());
    	
    	//call and execute function
    	this.dispatch(funcValue.getFuncBody());
    	
    	//pop stack
    	RwscriptMain.symbolTable.popScope();
    	RwscriptMain.symbolTable.setCurrentScope(topStack);
    	return null;
    }
    
    public Integer interp(DoWhileStmt ast) throws ReturnValueException{
    	Integer expVal;
    	do{
    		//evaluate expVal before checking again
    		expVal = this.dispatch(ast.getAST(0));
    		this.dispatch(ast.getAST(1)); // execute stmts in loop
    	}while(expVal.intValue() != 0);
    	
    	return null;
    }
    
    public Integer interp(StmtList ast) throws ReturnValueException{
    	// will go through all statements in the list
    	for(int i = 0; i < ast.size();i++){
    		this.dispatch(ast.getAST(i)); 
    	}
    	return null;
    }
	
	/*
	*	Using JFrame and paint(Graphics g) for 
	*	drawing the circle and square
	*/
    public Integer interp(DrawingStmt ast) throws ReturnValueException{
    // location on JFrame
    Integer locX = this.dispatch(ast.getAST(0));
    Integer locY = this.dispatch(ast.getAST(1));
    
    Integer height = this.dispatch(ast.getAST(2));
    Integer width = this.dispatch(ast.getAST(3));
    int choice = ast.getDrawingChoice();
    
    switch(choice){
    case DrawingStmt.SQUARE:
    System.out.println("Printing a square on JFrame");
    //Object created to create and paint
    DrawSquareInJFrame s = new DrawSquareInJFrame(locX,locY,height,width);
    break;
    case DrawingStmt.CIRCLE:
    System.out.println("Printing a circle on JFrame");
    //Object created to create and paint
	DrawCircleInJFrame c = new DrawCircleInJFrame(locX,locY,height,width);
    break;
    default:
    	System.out.println("Error:  Unknown choice");
    	System.exit(1);
    	return null;
    }
    return null;
    }
    
    public Integer interp(FileManipulationStmt ast) throws ReturnValueException{
    	int choice = ast.getChoice();
    	
    	switch(choice){
    	case FileManipulationStmt.CREATE:
    	try {
    	  System.out.println
    	  			("Please type a name for the file that is being created -> ");
    	  String fileName = Input.nextLine();
    	  //file to be
	      File file = new File(fileName); 
	      BufferedWriter output = new BufferedWriter(new FileWriter(file));
	      output.write("");
	      output.close();
	      System.out.println("File named || "+fileName+" || has been created");
	    } catch ( IOException e ) {
	       e.printStackTrace();
	    }
    	break;
    	case FileManipulationStmt.WRITE:
			try {
			System.out.println("Please type the name of the file to add content to -> ");
			String fName = Input.nextLine();
			Integer content = this.dispatch(ast.getAST(0));
			 //content to be added to file
			String contentStr = Integer.toString(content);
			File file = new File(fName);

			// if file does not exist, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
			BufferedWriter bw = new BufferedWriter(fw);
			//content is written to file
			bw.write(contentStr + "\n");
			//stream closed
			bw.close();

			System.out.println("Content has been written to the file");
		}
		 	catch (IOException e) {
			e.printStackTrace();
		}
    	break;
    	case FileManipulationStmt.VIEW:
    		try{
    		System.out.println("Please type the name of the file you would like to view");
    		String fileN = Input.nextLine();
			BufferedReader br = new BufferedReader(new FileReader(fileN));
	 		String line = null;
				 while ((line = br.readLine()) != null) {
	  				 System.out.println(line); // print file line by line
				 }
			br.close(); // close stream
			}catch(IOException e){
			e.printStackTrace();
			}
    	break;
    	default:
    		System.out.println("Error: unknown file manipulation choice");
    		System.exit(1);
    		return null;
    	}
    	return null;
    }

    public Integer interp(FuncDeclStmt ast){
    	//get function value
    	Function functionValue = ast.getFValue();
    	functionValue.setParentScope(RwscriptMain.symbolTable.getCurrentScope());
    	// store function in symbol table
    	RwscriptMain.symbolTable.declareFunction(ast.getName(),functionValue);
    	return null;
    }
	
	public Integer interp(IfStmt ast) throws ReturnValueException{
		Integer exp = this.dispatch(ast.getAST(0));
		
		if(exp == 1){
			this.dispatch(ast.getAST(1));
		}
		else if(ast.size() >= 3){ //else clause only if exp size is larger then
			this.dispatch(ast.getAST(2)); //stmt in else clause
		}
		return null;
	}
	
	public Integer interp(InputStmt ast){
		System.out.print("choose a value for ->" + ast.getVariable());
		//store input in val
		Integer val = Integer.valueOf(Input.nextLine());
		//update in symbol table
		RwscriptMain.symbolTable.updateVariable(ast.getVariable(),val);
		
		return null;
	} 
	
	public Integer interp(PrintStmt ast) throws ReturnValueException{
		Integer output = this.dispatch(ast.getAST(0));
		System.out.println("->" +output.toString());
		return null;
	}
	
	public Integer interp(ReturnStmt ast) throws ReturnValueException{
		if(ast.size() > 0) { //proves there is a return value
			Integer returnv = this.dispatch(ast.getExpr());
			throw new ReturnValueException(returnv);
		}
		else{
			throw new ReturnValueException(null);
		}
	}
	
	public Integer interp(StackDeclStmt ast){
		String stName = ast.getName();
		//new stack created
		Stack<Integer> st = ast.getStack();
		//stored in symbol table
		RwscriptMain.symbolTable.declareStack(stName,st);
		
		return null;
	}
	
	public Integer interp(StackStmt ast) throws ReturnValueException{
		int funcChosen = ast.getFunctionChosen();
		
		switch(funcChosen){
		case StackStmt.POP:
			//stack stored in tempStack
			Stack<Integer> tempStack = RwscriptMain.symbolTable.lookupStack(ast.getName());
			//popped value stored in val
			Integer val = new Integer(tempStack.pop());
			System.out.println("Stack pop ->" + val);
			//put tempStack into symboltable
			RwscriptMain.symbolTable.updateStack(ast.getName(),tempStack);
		break;
		case StackStmt.PUSH:
			Stack<Integer> tempStack2 = new Stack<Integer>();
			//current stack stored in tempStack2
			tempStack2 = RwscriptMain.symbolTable.lookupStack(ast.getName());
			// get value to be pushed
			Integer exp = new Integer(this.dispatch(ast.getAST(0)));
			System.out.println("Stack push ->" + exp);
			tempStack2.push(exp);
			//update
			RwscriptMain.symbolTable.updateStack(ast.getName(),tempStack2);
		break;
		case StackStmt.SORT:
			Stack<Integer> tempStack3 = RwscriptMain.symbolTable.lookupStack(ast.getName());
			//Stack that will contain sorted values
			Stack<Integer> sortedStack = new Stack<Integer>();
			while (!tempStack3.isEmpty()) {
				//value from unsorted stack stored
				Integer value = tempStack3.pop();
				while (!sortedStack.isEmpty() && value < sortedStack.peek())
						tempStack3.push(sortedStack.pop());
			sortedStack.push(value); 
			//push value onto second stack when while stmt is done
			}
			RwscriptMain.symbolTable.updateStack(ast.getName(),sortedStack);
		break;
		case StackStmt.PRINT:
			//lookup stack
			Stack<Integer> tempStack4 = RwscriptMain.symbolTable.lookupStack(ast.getName());
			System.out.println("Stack print -> "+ tempStack4);
		break;
		default:
			System.err.print("not a a stack function");
			System.exit(1);
		}
		return null;
	}
    
    public Integer interp(VarDeclStmt ast) throws ReturnValueException{
    	Integer varVal = this.dispatch(ast.getAST(0));
    	RwscriptMain.symbolTable.declareVariable(ast.getVar(),varVal);
    	return null;
    }
    
    public Integer interp(WhileStmt ast)throws ReturnValueException{
    	Integer exp = this.dispatch(ast.getAST(0));
    	
    	while(exp != 0){ //while expression is still true
    		this.dispatch(ast.getAST(1)); //stmts to be interpreted 
    		//re check the expression
    		exp = this.dispatch(ast.getAST(0));
    	}
    	return null;
    }
    
    /**************
    ****EXPRESSIONS**
    ****************/
    
    public Integer interp(BinopExpr ast) throws ReturnValueException{
    	Integer left = this.dispatch(ast.getAST(0));
    	Integer right = this.dispatch(ast.getAST(1));
    	
    	int choice = ast.getOperation();
    	
    	switch(choice){
    		case BinopExpr.ADD:
    			return new Integer(left.intValue() + right.intValue());
    		case BinopExpr.SUB:
    			return new Integer(left.intValue() - right.intValue());
    		case BinopExpr.MULT:
    			return new Integer(left.intValue() * right.intValue());
    		case BinopExpr.DIV:
    			return new Integer(left.intValue() / right.intValue());
    		case BinopExpr.EQ:
    			return new Integer((left.intValue() == right.intValue())?1:0);
    		case BinopExpr.LEQ:
    			return new Integer((left.intValue() <= right.intValue())?1:0);
    		case BinopExpr.GEQ:
    			return new Integer((left.intValue() >= right.intValue())?1:0);
    		case BinopExpr.AND:
    			if(left.intValue() == 0){return new Integer(0);}
    			else{return new Integer(1);}
    		case BinopExpr.OR:
    			if(left.intValue() == 1 || right.intValue() == 1)
    			{return new Integer(1);}
    			else if(left.intValue() == 0 && right.intValue() == 0)
    			{return new Integer(0);}
    		default: 
    			System.out.println("Interpreter error: Unknown binary op exp");
    			System.exit(1);
    			return null;
    	}
    }
    
	public Integer interp(BuiltInExpr ast) throws ReturnValueException{
		int choice = ast.getBuiltInFuncName();
		Integer vOne = this.dispatch(ast.getAST(0));
		Integer	vTwo = this.dispatch(ast.getAST(1));
		Integer vThree = this.dispatch(ast.getAST(2));
		Integer largest = 0;
		Integer smallest = 0;
		switch(choice){
			case BuiltInExpr.GREATEST:
				if(vOne >= vTwo ){
					largest = vOne;
				}//since vOne is smaller than vTwo
				else{largest = vTwo;}
				
				if(vThree >= largest){
					largest = vThree;
					return largest;
				}//since vThree is smaller than vTwo
				else{return largest;}
			case BuiltInExpr.LEAST:
				if(vOne <= vTwo ){
					smallest = vOne;
				}//since vOne is larger than vTwo
				else{smallest = vTwo;}
				
				if(vThree <= largest){
					smallest = vThree;
					return smallest;
				}//since vTwo is smaller than vThree
				else{return smallest;}
			case BuiltInExpr.LEN:
				//get string from ast
				String theStr = ast.getWords();
				//use length() to get length of string
				Integer total = theStr.length();
				return total;				
			default:
				System.out.println("Error: Not a built in function");
				System.exit(1);
				return null; 
		}			
	}
	
	public Integer interp(CallExpr ast) throws ReturnValueException{
		Function funcVal = RwscriptMain.symbolTable.lookupFunction(ast.getFuncName());
		Integer returnVal = null;
		
		SymbolTableScope topStack = RwscriptMain.symbolTable.getCurrentScope();
		RwscriptMain.symbolTable.pushScope();
		initializeParameters(funcVal.getFParameters(),ast.getActualParameters());
		RwscriptMain.symbolTable.getCurrentScope().setParentScope(funcVal.getParentScope());
		
		try{
			this.dispatch(funcVal.getFuncBody());
		}
		catch(ReturnValueException e){
			returnVal = e.getReturnValue();
		}
		
		RwscriptMain.symbolTable.popScope();
		RwscriptMain.symbolTable.setCurrentScope(topStack);
	return returnVal;	
	}
	
	public Integer interp(StackExpr ast){
		int choice = ast.getFunChoice();
		switch(choice){
			case StackExpr.STSIZE:
				Stack<Integer>tempStack = RwscriptMain.symbolTable.lookupStack(ast.getVarName());
				Integer stackSize = tempStack.size();
				return stackSize;
			case StackExpr.POP:
				Stack<Integer>tempStack2 = RwscriptMain.symbolTable.lookupStack(ast.getVarName());
				Integer stackValue = tempStack2.pop();
				//stored stackValue is stored in symbol table
				RwscriptMain.symbolTable.updateStack(ast.getVarName(),tempStack2);
				return stackValue;
			default:
				System.out.println("Error: Not a stack expr choice");
				System.exit(1);
				return null;
		}
	}
	
	public Integer interp(NumExpr ast){
		return new Integer(ast.getValue());
	}
	
	public Integer interp(VarExpr ast){
		return RwscriptMain.symbolTable.lookupVariable(ast.getVariableName());
	}
}
