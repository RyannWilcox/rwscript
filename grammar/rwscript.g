grammar rwscript;

@members{

public void reportError(RecognitionException e) {
    displayRecognitionError(this.getTokenNames(), e);
    System.exit(1);
}
}

prog returns [AST ast]
	: {$ast = new StmtList();} (s=stmt {$ast.addAST($s.ast);})+ ;

stmt returns [Stmt ast]
	: 	'Stack' VAR ';'	{$ast = new StackDeclStmt($VAR.text);}
	|	'$' VAR '=' e=exp ';'
			{$ast = new VarDeclStmt($VAR.text, $e.ast);}
	|	'$' VAR ';'
			{$ast = new VarDeclStmt( $VAR.text,new NumExpr(0));}
	|	VAR '=' e=exp ';'
			{$ast = new AssignStmt($VAR.text,$e.ast);}
	|	'#'  VAR '(' ')' s1=stmt 
		{$ast = new FuncDeclStmt($VAR.text,new Function(new ArgList(),$s1.ast));}
	|	'#'  VAR '(' fpl=parameterList ')'	s1=stmt
		{$ast = new FuncDeclStmt($VAR.text,new Function($fpl.ast,$s1.ast));}
	|	VAR '(' ')' ';' {$ast = new CallStmt($VAR.text);}
	|	VAR '(' apl=actualParameterList ')' ';' {$ast = new CallStmt($VAR.text,$apl.ast);}
	|	'return' exp ';' {$ast = new ReturnStmt($exp.ast);}
	|	'return' ';'	{$ast = new ReturnStmt();}
	|	'print.ToConsole' '(' e=exp ')' ';' 
							{$ast = new PrintStmt($e.ast);}
	|	'input :=' VAR ';' 
							{$ast = new InputStmt($VAR.text);}
	|	'while' '('exp')' s=stmt 
							{$ast = new WhileStmt($exp.ast,$s.ast);}
	|	'do' st=stmt 'while' '('exp')'
							 {$ast = new DoWhileStmt($exp.ast,$st.ast);}
	|	'if' '('exp')' s1=stmt 
							{$ast= new IfStmt($exp.ast,$s1.ast);}
		('else' s2=stmt 	{$ast.addAST($s2.ast);})?
	|	VAR '.stackSort()' ';' 
							{$ast = new StackStmt(StackStmt.SORT,$VAR.text);}
	|	VAR '.pop()' ';' 
							{$ast = new StackStmt(StackStmt.POP,$VAR.text);}
	|	VAR '.push''('exp')' ';' 
							{$ast = new StackStmt(StackStmt.PUSH,$VAR.text,$exp.ast);}
	|   VAR '.printStack()' ';' 
							{$ast = new StackStmt(StackStmt.PRINT,$VAR.text);}
	|	'drawSquare' '(' e1=exp ',' e2=exp ',' e3=exp ',' e4=exp')' ';'
		{$ast = new DrawingStmt(DrawingStmt.SQUARE,$e1.ast,$e2.ast,$e3.ast,$e4.ast);}
	|	'drawCircle' '(' e1=exp ',' e2=exp ',' e3=exp ',' e4=exp')' ';'
		{$ast = new DrawingStmt(DrawingStmt.CIRCLE,$e1.ast,$e2.ast,$e3.ast,$e4.ast);}
	|	'CreateFile()' ';'
		{$ast = new FileManipulationStmt(FileManipulationStmt.CREATE);}
	|	'WriteToFile(' exp ')' ';'
		{$ast = new FileManipulationStmt(FileManipulationStmt.WRITE,$exp.ast);}
	|	'ViewFile()' ';'
		{$ast = new FileManipulationStmt(FileManipulationStmt.VIEW);}
	|	'{'{$ast = new BlockStmt();} (s1=stmt {$ast.addAST($s1.ast);})+ '}' 
	;
	
thestring returns [String text]
	: removeQuotes {$text = $removeQuotes.text;};
	
	
parameterList returns [ArgList ast]
	: var1=VAR {$ast = new ArgList(new VarExpr($var1.text));}
	(
	',' var2=VAR {$ast.addAST(new VarExpr($var2.text));}
	)*
	;
	
actualParameterList returns [ArgList ast]
	:e1=exp {$ast = new ArgList($e1.ast);} (',' e2=exp {$ast.addAST($e2.ast);})*
	;
	
exp returns [Expr ast]	:	logexp {$ast = $logexp.ast;};
	
logexp returns [Expr ast]
	:	e1=relexp {$ast = $e1.ast;}
	(
		('&' e2=relexp {$ast = new BinopExpr(BinopExpr.AND,$ast,$e2.ast);}) |
		('|' e3=relexp {$ast = new BinopExpr(BinopExpr.OR, $ast,$e3.ast);})
	)*
	;	

relexp returns [Expr ast]
	:	e1=addexp {$ast = $e1.ast;}
	(
		('==' e2=addexp {$ast = new BinopExpr(BinopExpr.EQ,$ast,$e2.ast);})|
		('<=' e3=addexp {$ast = new BinopExpr(BinopExpr.LEQ,$ast,$e3.ast);})
	)*
	;

addexp returns [Expr ast]
	:	e1=mulexp {$ast = $e1.ast;}
	(
		('+' e2=mulexp){$ast = new BinopExpr(BinopExpr.ADD,$ast,$e2.ast);}|
		('-' e3=mulexp {$ast = new BinopExpr(BinopExpr.SUB,$ast,$e3.ast);})
	)* 
	;

mulexp returns [Expr ast]
	:	e1=atom {$ast = $e1.ast;}
	(
		('*' e2=atom{$ast = new BinopExpr(BinopExpr.MULT,$ast,$e2.ast);})|
		('/' e3=atom{$ast = new BinopExpr(BinopExpr.DIV,$ast,$e3.ast);} )
	)* 
	;

atom returns [Expr ast]
	: VAR '('apl=actualParameterList ')' {$ast = new CallExpr($VAR.text,$apl.ast);}
	| VAR '(' ')'	{$ast = new CallExpr($VAR.text);}
	| VAR '.stackSize()' {$ast = new StackExpr(StackExpr.STSIZE,$VAR.text);}
	| VAR '.pop()'		 {$ast = new StackExpr(StackExpr.POP,$VAR.text);} 
	| VAR			     {$ast = new VarExpr($VAR.text);}
	| 'GREATEST(' e1=exp ',' e2=exp ',' e3=exp ')'    
	{$ast = new BuiltInExpr(BuiltInExpr.GREATEST,$e1.ast,$e2.ast,$e3.ast);}
	| 'LEAST(' e1=exp ',' e2=exp ',' e3=exp ')'     
	{$ast = new BuiltInExpr(BuiltInExpr.LEAST,$e1.ast,$e2.ast,$e3.ast);}
	| 'LEN(' rq=removeQuotes ')'    {$ast = new BuiltInExpr(BuiltInExpr.LEN,$rq.text);}
	| NUM			     {$ast = new NumExpr($NUM.text);}
	| '-' NUM		     {$ast = new NumExpr('-'+$NUM.text);}
	;


removeQuotes returns [String text]
	:	STRING	
		   {
		      // get rid of the quotes in the string
		      int size = $STRING.text.length();
		      $text = $STRING.text.substring(1,size-1);
		   } 
	;

	
/*lexical things*/
STRING	: '"' ( ESC_SEQ | ~('\\'|'\'') )* '"';
VAR  	:	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
NUM 	:	'0'..'9'+;
fragment
ESC_SEQ	:   	'\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\');
COMMENT	:   	'//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;};
WS  	:   	( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};