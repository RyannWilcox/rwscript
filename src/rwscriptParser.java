// $ANTLR 3.5 rwscript.g 2013-12-16 14:01:34

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class rwscriptParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "ESC_SEQ", "NUM", "STRING", 
		"VAR", "WS", "'#'", "'$'", "'&'", "'('", "')'", "'*'", "'+'", "','", "'-'", 
		"'.pop()'", "'.printStack()'", "'.push'", "'.stackSize()'", "'.stackSort()'", 
		"'/'", "';'", "'<='", "'='", "'=='", "'CreateFile()'", "'GREATEST('", 
		"'LEAST('", "'LEN('", "'Stack'", "'ViewFile()'", "'WriteToFile('", "'do'", 
		"'drawCircle'", "'drawSquare'", "'else'", "'if'", "'input :='", "'print.ToConsole'", 
		"'return'", "'while'", "'{'", "'|'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int COMMENT=4;
	public static final int ESC_SEQ=5;
	public static final int NUM=6;
	public static final int STRING=7;
	public static final int VAR=8;
	public static final int WS=9;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public rwscriptParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public rwscriptParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return rwscriptParser.tokenNames; }
	@Override public String getGrammarFileName() { return "rwscript.g"; }



	public void reportError(RecognitionException e) {
	    displayRecognitionError(this.getTokenNames(), e);
	    System.exit(1);
	}



	// $ANTLR start "prog"
	// rwscript.g:11:1: prog returns [AST ast] : (s= stmt )+ ;
	public final AST prog() throws RecognitionException {
		AST ast = null;


		Stmt s =null;

		try {
			// rwscript.g:12:2: ( (s= stmt )+ )
			// rwscript.g:12:4: (s= stmt )+
			{
			ast = new StmtList();
			// rwscript.g:12:29: (s= stmt )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==VAR||(LA1_0 >= 10 && LA1_0 <= 11)||LA1_0==29||(LA1_0 >= 33 && LA1_0 <= 38)||(LA1_0 >= 40 && LA1_0 <= 45)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// rwscript.g:12:30: s= stmt
					{
					pushFollow(FOLLOW_stmt_in_prog25);
					s=stmt();
					state._fsp--;

					ast.addAST(s);
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "prog"



	// $ANTLR start "stmt"
	// rwscript.g:14:1: stmt returns [Stmt ast] : ( 'Stack' VAR ';' | '$' VAR '=' e= exp ';' | '$' VAR ';' | VAR '=' e= exp ';' | '#' VAR '(' ')' s1= stmt | '#' VAR '(' fpl= parameterList ')' s1= stmt | VAR '(' ')' ';' | VAR '(' apl= actualParameterList ')' ';' | 'return' exp ';' | 'return' ';' | 'print.ToConsole' '(' e= exp ')' ';' | 'input :=' VAR ';' | 'while' '(' exp ')' s= stmt | 'do' st= stmt 'while' '(' exp ')' | 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )? | VAR '.stackSort()' ';' | VAR '.pop()' ';' | VAR '.push' '(' exp ')' ';' | VAR '.printStack()' ';' | 'drawSquare' '(' e1= exp ',' e2= exp ',' e3= exp ',' e4= exp ')' ';' | 'drawCircle' '(' e1= exp ',' e2= exp ',' e3= exp ',' e4= exp ')' ';' | 'CreateFile()' ';' | 'WriteToFile(' exp ')' ';' | 'ViewFile()' ';' | '{' (s1= stmt )+ '}' );
	public final Stmt stmt() throws RecognitionException {
		Stmt ast = null;


		Token VAR1=null;
		Token VAR2=null;
		Token VAR3=null;
		Token VAR4=null;
		Token VAR5=null;
		Token VAR6=null;
		Token VAR7=null;
		Token VAR8=null;
		Token VAR10=null;
		Token VAR14=null;
		Token VAR15=null;
		Token VAR16=null;
		Token VAR18=null;
		Expr e =null;
		Stmt s1 =null;
		ArgList fpl =null;
		ArgList apl =null;
		Stmt s =null;
		Stmt st =null;
		Stmt s2 =null;
		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;
		Expr e4 =null;
		Expr exp9 =null;
		Expr exp11 =null;
		Expr exp12 =null;
		Expr exp13 =null;
		Expr exp17 =null;
		Expr exp19 =null;

		try {
			// rwscript.g:15:2: ( 'Stack' VAR ';' | '$' VAR '=' e= exp ';' | '$' VAR ';' | VAR '=' e= exp ';' | '#' VAR '(' ')' s1= stmt | '#' VAR '(' fpl= parameterList ')' s1= stmt | VAR '(' ')' ';' | VAR '(' apl= actualParameterList ')' ';' | 'return' exp ';' | 'return' ';' | 'print.ToConsole' '(' e= exp ')' ';' | 'input :=' VAR ';' | 'while' '(' exp ')' s= stmt | 'do' st= stmt 'while' '(' exp ')' | 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )? | VAR '.stackSort()' ';' | VAR '.pop()' ';' | VAR '.push' '(' exp ')' ';' | VAR '.printStack()' ';' | 'drawSquare' '(' e1= exp ',' e2= exp ',' e3= exp ',' e4= exp ')' ';' | 'drawCircle' '(' e1= exp ',' e2= exp ',' e3= exp ',' e4= exp ')' ';' | 'CreateFile()' ';' | 'WriteToFile(' exp ')' ';' | 'ViewFile()' ';' | '{' (s1= stmt )+ '}' )
			int alt4=25;
			switch ( input.LA(1) ) {
			case 33:
				{
				alt4=1;
				}
				break;
			case 11:
				{
				int LA4_2 = input.LA(2);
				if ( (LA4_2==VAR) ) {
					int LA4_17 = input.LA(3);
					if ( (LA4_17==27) ) {
						alt4=2;
					}
					else if ( (LA4_17==25) ) {
						alt4=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 17, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case VAR:
				{
				switch ( input.LA(2) ) {
				case 27:
					{
					alt4=4;
					}
					break;
				case 13:
					{
					int LA4_19 = input.LA(3);
					if ( (LA4_19==14) ) {
						alt4=7;
					}
					else if ( (LA4_19==NUM||LA4_19==VAR||LA4_19==18||(LA4_19 >= 30 && LA4_19 <= 32)) ) {
						alt4=8;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 19, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 23:
					{
					alt4=16;
					}
					break;
				case 19:
					{
					alt4=17;
					}
					break;
				case 21:
					{
					alt4=18;
					}
					break;
				case 20:
					{
					alt4=19;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 10:
				{
				int LA4_4 = input.LA(2);
				if ( (LA4_4==VAR) ) {
					int LA4_24 = input.LA(3);
					if ( (LA4_24==13) ) {
						int LA4_31 = input.LA(4);
						if ( (LA4_31==14) ) {
							alt4=5;
						}
						else if ( (LA4_31==VAR) ) {
							alt4=6;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 4, 31, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 24, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 43:
				{
				int LA4_5 = input.LA(2);
				if ( (LA4_5==25) ) {
					alt4=10;
				}
				else if ( (LA4_5==NUM||LA4_5==VAR||LA4_5==18||(LA4_5 >= 30 && LA4_5 <= 32)) ) {
					alt4=9;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 42:
				{
				alt4=11;
				}
				break;
			case 41:
				{
				alt4=12;
				}
				break;
			case 44:
				{
				alt4=13;
				}
				break;
			case 36:
				{
				alt4=14;
				}
				break;
			case 40:
				{
				alt4=15;
				}
				break;
			case 38:
				{
				alt4=20;
				}
				break;
			case 37:
				{
				alt4=21;
				}
				break;
			case 29:
				{
				alt4=22;
				}
				break;
			case 35:
				{
				alt4=23;
				}
				break;
			case 34:
				{
				alt4=24;
				}
				break;
			case 45:
				{
				alt4=25;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// rwscript.g:15:5: 'Stack' VAR ';'
					{
					match(input,33,FOLLOW_33_in_stmt44); 
					VAR1=(Token)match(input,VAR,FOLLOW_VAR_in_stmt46); 
					match(input,25,FOLLOW_25_in_stmt48); 
					ast = new StackDeclStmt((VAR1!=null?VAR1.getText():null));
					}
					break;
				case 2 :
					// rwscript.g:16:4: '$' VAR '=' e= exp ';'
					{
					match(input,11,FOLLOW_11_in_stmt55); 
					VAR2=(Token)match(input,VAR,FOLLOW_VAR_in_stmt57); 
					match(input,27,FOLLOW_27_in_stmt59); 
					pushFollow(FOLLOW_exp_in_stmt63);
					e=exp();
					state._fsp--;

					match(input,25,FOLLOW_25_in_stmt65); 
					ast = new VarDeclStmt((VAR2!=null?VAR2.getText():null), e);
					}
					break;
				case 3 :
					// rwscript.g:18:4: '$' VAR ';'
					{
					match(input,11,FOLLOW_11_in_stmt75); 
					VAR3=(Token)match(input,VAR,FOLLOW_VAR_in_stmt77); 
					match(input,25,FOLLOW_25_in_stmt79); 
					ast = new VarDeclStmt( (VAR3!=null?VAR3.getText():null),new NumExpr(0));
					}
					break;
				case 4 :
					// rwscript.g:20:4: VAR '=' e= exp ';'
					{
					VAR4=(Token)match(input,VAR,FOLLOW_VAR_in_stmt89); 
					match(input,27,FOLLOW_27_in_stmt91); 
					pushFollow(FOLLOW_exp_in_stmt95);
					e=exp();
					state._fsp--;

					match(input,25,FOLLOW_25_in_stmt97); 
					ast = new AssignStmt((VAR4!=null?VAR4.getText():null),e);
					}
					break;
				case 5 :
					// rwscript.g:22:4: '#' VAR '(' ')' s1= stmt
					{
					match(input,10,FOLLOW_10_in_stmt107); 
					VAR5=(Token)match(input,VAR,FOLLOW_VAR_in_stmt110); 
					match(input,13,FOLLOW_13_in_stmt112); 
					match(input,14,FOLLOW_14_in_stmt114); 
					pushFollow(FOLLOW_stmt_in_stmt118);
					s1=stmt();
					state._fsp--;

					ast = new FuncDeclStmt((VAR5!=null?VAR5.getText():null),new Function(new ArgList(),s1));
					}
					break;
				case 6 :
					// rwscript.g:24:4: '#' VAR '(' fpl= parameterList ')' s1= stmt
					{
					match(input,10,FOLLOW_10_in_stmt128); 
					VAR6=(Token)match(input,VAR,FOLLOW_VAR_in_stmt131); 
					match(input,13,FOLLOW_13_in_stmt133); 
					pushFollow(FOLLOW_parameterList_in_stmt137);
					fpl=parameterList();
					state._fsp--;

					match(input,14,FOLLOW_14_in_stmt139); 
					pushFollow(FOLLOW_stmt_in_stmt143);
					s1=stmt();
					state._fsp--;

					ast = new FuncDeclStmt((VAR6!=null?VAR6.getText():null),new Function(fpl,s1));
					}
					break;
				case 7 :
					// rwscript.g:26:4: VAR '(' ')' ';'
					{
					VAR7=(Token)match(input,VAR,FOLLOW_VAR_in_stmt152); 
					match(input,13,FOLLOW_13_in_stmt154); 
					match(input,14,FOLLOW_14_in_stmt156); 
					match(input,25,FOLLOW_25_in_stmt158); 
					ast = new CallStmt((VAR7!=null?VAR7.getText():null));
					}
					break;
				case 8 :
					// rwscript.g:27:4: VAR '(' apl= actualParameterList ')' ';'
					{
					VAR8=(Token)match(input,VAR,FOLLOW_VAR_in_stmt165); 
					match(input,13,FOLLOW_13_in_stmt167); 
					pushFollow(FOLLOW_actualParameterList_in_stmt171);
					apl=actualParameterList();
					state._fsp--;

					match(input,14,FOLLOW_14_in_stmt173); 
					match(input,25,FOLLOW_25_in_stmt175); 
					ast = new CallStmt((VAR8!=null?VAR8.getText():null),apl);
					}
					break;
				case 9 :
					// rwscript.g:28:4: 'return' exp ';'
					{
					match(input,43,FOLLOW_43_in_stmt182); 
					pushFollow(FOLLOW_exp_in_stmt184);
					exp9=exp();
					state._fsp--;

					match(input,25,FOLLOW_25_in_stmt186); 
					ast = new ReturnStmt(exp9);
					}
					break;
				case 10 :
					// rwscript.g:29:4: 'return' ';'
					{
					match(input,43,FOLLOW_43_in_stmt193); 
					match(input,25,FOLLOW_25_in_stmt195); 
					ast = new ReturnStmt();
					}
					break;
				case 11 :
					// rwscript.g:30:4: 'print.ToConsole' '(' e= exp ')' ';'
					{
					match(input,42,FOLLOW_42_in_stmt202); 
					match(input,13,FOLLOW_13_in_stmt204); 
					pushFollow(FOLLOW_exp_in_stmt208);
					e=exp();
					state._fsp--;

					match(input,14,FOLLOW_14_in_stmt210); 
					match(input,25,FOLLOW_25_in_stmt212); 
					ast = new PrintStmt(e);
					}
					break;
				case 12 :
					// rwscript.g:32:4: 'input :=' VAR ';'
					{
					match(input,41,FOLLOW_41_in_stmt227); 
					VAR10=(Token)match(input,VAR,FOLLOW_VAR_in_stmt229); 
					match(input,25,FOLLOW_25_in_stmt231); 
					ast = new InputStmt((VAR10!=null?VAR10.getText():null));
					}
					break;
				case 13 :
					// rwscript.g:34:4: 'while' '(' exp ')' s= stmt
					{
					match(input,44,FOLLOW_44_in_stmt246); 
					match(input,13,FOLLOW_13_in_stmt248); 
					pushFollow(FOLLOW_exp_in_stmt249);
					exp11=exp();
					state._fsp--;

					match(input,14,FOLLOW_14_in_stmt250); 
					pushFollow(FOLLOW_stmt_in_stmt254);
					s=stmt();
					state._fsp--;

					ast = new WhileStmt(exp11,s);
					}
					break;
				case 14 :
					// rwscript.g:36:4: 'do' st= stmt 'while' '(' exp ')'
					{
					match(input,36,FOLLOW_36_in_stmt269); 
					pushFollow(FOLLOW_stmt_in_stmt273);
					st=stmt();
					state._fsp--;

					match(input,44,FOLLOW_44_in_stmt275); 
					match(input,13,FOLLOW_13_in_stmt277); 
					pushFollow(FOLLOW_exp_in_stmt278);
					exp12=exp();
					state._fsp--;

					match(input,14,FOLLOW_14_in_stmt279); 
					ast = new DoWhileStmt(exp12,st);
					}
					break;
				case 15 :
					// rwscript.g:38:4: 'if' '(' exp ')' s1= stmt ( 'else' s2= stmt )?
					{
					match(input,40,FOLLOW_40_in_stmt294); 
					match(input,13,FOLLOW_13_in_stmt296); 
					pushFollow(FOLLOW_exp_in_stmt297);
					exp13=exp();
					state._fsp--;

					match(input,14,FOLLOW_14_in_stmt298); 
					pushFollow(FOLLOW_stmt_in_stmt302);
					s1=stmt();
					state._fsp--;

					ast = new IfStmt(exp13,s1);
					// rwscript.g:40:3: ( 'else' s2= stmt )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==39) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// rwscript.g:40:4: 'else' s2= stmt
							{
							match(input,39,FOLLOW_39_in_stmt317); 
							pushFollow(FOLLOW_stmt_in_stmt321);
							s2=stmt();
							state._fsp--;

							ast.addAST(s2);
							}
							break;

					}

					}
					break;
				case 16 :
					// rwscript.g:41:4: VAR '.stackSort()' ';'
					{
					VAR14=(Token)match(input,VAR,FOLLOW_VAR_in_stmt331); 
					match(input,23,FOLLOW_23_in_stmt333); 
					match(input,25,FOLLOW_25_in_stmt335); 
					ast = new StackStmt(StackStmt.SORT,(VAR14!=null?VAR14.getText():null));
					}
					break;
				case 17 :
					// rwscript.g:43:4: VAR '.pop()' ';'
					{
					VAR15=(Token)match(input,VAR,FOLLOW_VAR_in_stmt350); 
					match(input,19,FOLLOW_19_in_stmt352); 
					match(input,25,FOLLOW_25_in_stmt354); 
					ast = new StackStmt(StackStmt.POP,(VAR15!=null?VAR15.getText():null));
					}
					break;
				case 18 :
					// rwscript.g:45:4: VAR '.push' '(' exp ')' ';'
					{
					VAR16=(Token)match(input,VAR,FOLLOW_VAR_in_stmt369); 
					match(input,21,FOLLOW_21_in_stmt371); 
					match(input,13,FOLLOW_13_in_stmt372); 
					pushFollow(FOLLOW_exp_in_stmt373);
					exp17=exp();
					state._fsp--;

					match(input,14,FOLLOW_14_in_stmt374); 
					match(input,25,FOLLOW_25_in_stmt376); 
					ast = new StackStmt(StackStmt.PUSH,(VAR16!=null?VAR16.getText():null),exp17);
					}
					break;
				case 19 :
					// rwscript.g:47:6: VAR '.printStack()' ';'
					{
					VAR18=(Token)match(input,VAR,FOLLOW_VAR_in_stmt393); 
					match(input,20,FOLLOW_20_in_stmt395); 
					match(input,25,FOLLOW_25_in_stmt397); 
					ast = new StackStmt(StackStmt.PRINT,(VAR18!=null?VAR18.getText():null));
					}
					break;
				case 20 :
					// rwscript.g:49:4: 'drawSquare' '(' e1= exp ',' e2= exp ',' e3= exp ',' e4= exp ')' ';'
					{
					match(input,38,FOLLOW_38_in_stmt412); 
					match(input,13,FOLLOW_13_in_stmt414); 
					pushFollow(FOLLOW_exp_in_stmt418);
					e1=exp();
					state._fsp--;

					match(input,17,FOLLOW_17_in_stmt420); 
					pushFollow(FOLLOW_exp_in_stmt424);
					e2=exp();
					state._fsp--;

					match(input,17,FOLLOW_17_in_stmt426); 
					pushFollow(FOLLOW_exp_in_stmt430);
					e3=exp();
					state._fsp--;

					match(input,17,FOLLOW_17_in_stmt432); 
					pushFollow(FOLLOW_exp_in_stmt436);
					e4=exp();
					state._fsp--;

					match(input,14,FOLLOW_14_in_stmt437); 
					match(input,25,FOLLOW_25_in_stmt439); 
					ast = new DrawingStmt(DrawingStmt.SQUARE,e1,e2,e3,e4);
					}
					break;
				case 21 :
					// rwscript.g:51:4: 'drawCircle' '(' e1= exp ',' e2= exp ',' e3= exp ',' e4= exp ')' ';'
					{
					match(input,37,FOLLOW_37_in_stmt448); 
					match(input,13,FOLLOW_13_in_stmt450); 
					pushFollow(FOLLOW_exp_in_stmt454);
					e1=exp();
					state._fsp--;

					match(input,17,FOLLOW_17_in_stmt456); 
					pushFollow(FOLLOW_exp_in_stmt460);
					e2=exp();
					state._fsp--;

					match(input,17,FOLLOW_17_in_stmt462); 
					pushFollow(FOLLOW_exp_in_stmt466);
					e3=exp();
					state._fsp--;

					match(input,17,FOLLOW_17_in_stmt468); 
					pushFollow(FOLLOW_exp_in_stmt472);
					e4=exp();
					state._fsp--;

					match(input,14,FOLLOW_14_in_stmt473); 
					match(input,25,FOLLOW_25_in_stmt475); 
					ast = new DrawingStmt(DrawingStmt.CIRCLE,e1,e2,e3,e4);
					}
					break;
				case 22 :
					// rwscript.g:53:4: 'CreateFile()' ';'
					{
					match(input,29,FOLLOW_29_in_stmt484); 
					match(input,25,FOLLOW_25_in_stmt486); 
					ast = new FileManipulationStmt(FileManipulationStmt.CREATE);
					}
					break;
				case 23 :
					// rwscript.g:55:4: 'WriteToFile(' exp ')' ';'
					{
					match(input,35,FOLLOW_35_in_stmt495); 
					pushFollow(FOLLOW_exp_in_stmt497);
					exp19=exp();
					state._fsp--;

					match(input,14,FOLLOW_14_in_stmt499); 
					match(input,25,FOLLOW_25_in_stmt501); 
					ast = new FileManipulationStmt(FileManipulationStmt.WRITE,exp19);
					}
					break;
				case 24 :
					// rwscript.g:57:4: 'ViewFile()' ';'
					{
					match(input,34,FOLLOW_34_in_stmt510); 
					match(input,25,FOLLOW_25_in_stmt512); 
					ast = new FileManipulationStmt(FileManipulationStmt.VIEW);
					}
					break;
				case 25 :
					// rwscript.g:59:4: '{' (s1= stmt )+ '}'
					{
					match(input,45,FOLLOW_45_in_stmt521); 
					ast = new BlockStmt();
					// rwscript.g:59:33: (s1= stmt )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==VAR||(LA3_0 >= 10 && LA3_0 <= 11)||LA3_0==29||(LA3_0 >= 33 && LA3_0 <= 38)||(LA3_0 >= 40 && LA3_0 <= 45)) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// rwscript.g:59:34: s1= stmt
							{
							pushFollow(FOLLOW_stmt_in_stmt527);
							s1=stmt();
							state._fsp--;

							ast.addAST(s1);
							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					match(input,47,FOLLOW_47_in_stmt533); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "stmt"



	// $ANTLR start "thestring"
	// rwscript.g:62:1: thestring returns [String text] : removeQuotes ;
	public final String thestring() throws RecognitionException {
		String text = null;


		String removeQuotes20 =null;

		try {
			// rwscript.g:63:2: ( removeQuotes )
			// rwscript.g:63:4: removeQuotes
			{
			pushFollow(FOLLOW_removeQuotes_in_thestring550);
			removeQuotes20=removeQuotes();
			state._fsp--;

			text = removeQuotes20;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return text;
	}
	// $ANTLR end "thestring"



	// $ANTLR start "parameterList"
	// rwscript.g:66:1: parameterList returns [ArgList ast] : var1= VAR ( ',' var2= VAR )* ;
	public final ArgList parameterList() throws RecognitionException {
		ArgList ast = null;


		Token var1=null;
		Token var2=null;

		try {
			// rwscript.g:67:2: (var1= VAR ( ',' var2= VAR )* )
			// rwscript.g:67:4: var1= VAR ( ',' var2= VAR )*
			{
			var1=(Token)match(input,VAR,FOLLOW_VAR_in_parameterList570); 
			ast = new ArgList(new VarExpr((var1!=null?var1.getText():null)));
			// rwscript.g:68:2: ( ',' var2= VAR )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==17) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// rwscript.g:69:2: ',' var2= VAR
					{
					match(input,17,FOLLOW_17_in_parameterList578); 
					var2=(Token)match(input,VAR,FOLLOW_VAR_in_parameterList582); 
					ast.addAST(new VarExpr((var2!=null?var2.getText():null)));
					}
					break;

				default :
					break loop5;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "parameterList"



	// $ANTLR start "actualParameterList"
	// rwscript.g:73:1: actualParameterList returns [ArgList ast] : e1= exp ( ',' e2= exp )* ;
	public final ArgList actualParameterList() throws RecognitionException {
		ArgList ast = null;


		Expr e1 =null;
		Expr e2 =null;

		try {
			// rwscript.g:74:2: (e1= exp ( ',' e2= exp )* )
			// rwscript.g:74:3: e1= exp ( ',' e2= exp )*
			{
			pushFollow(FOLLOW_exp_in_actualParameterList605);
			e1=exp();
			state._fsp--;

			ast = new ArgList(e1);
			// rwscript.g:74:41: ( ',' e2= exp )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==17) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// rwscript.g:74:42: ',' e2= exp
					{
					match(input,17,FOLLOW_17_in_actualParameterList610); 
					pushFollow(FOLLOW_exp_in_actualParameterList614);
					e2=exp();
					state._fsp--;

					ast.addAST(e2);
					}
					break;

				default :
					break loop6;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "actualParameterList"



	// $ANTLR start "exp"
	// rwscript.g:77:1: exp returns [Expr ast] : logexp ;
	public final Expr exp() throws RecognitionException {
		Expr ast = null;


		Expr logexp21 =null;

		try {
			// rwscript.g:77:24: ( logexp )
			// rwscript.g:77:26: logexp
			{
			pushFollow(FOLLOW_logexp_in_exp633);
			logexp21=logexp();
			state._fsp--;

			ast = logexp21;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "exp"



	// $ANTLR start "logexp"
	// rwscript.g:79:1: logexp returns [Expr ast] : e1= relexp ( ( '&' e2= relexp ) | ( '|' e3= relexp ) )* ;
	public final Expr logexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// rwscript.g:80:2: (e1= relexp ( ( '&' e2= relexp ) | ( '|' e3= relexp ) )* )
			// rwscript.g:80:4: e1= relexp ( ( '&' e2= relexp ) | ( '|' e3= relexp ) )*
			{
			pushFollow(FOLLOW_relexp_in_logexp651);
			e1=relexp();
			state._fsp--;

			ast = e1;
			// rwscript.g:81:2: ( ( '&' e2= relexp ) | ( '|' e3= relexp ) )*
			loop7:
			while (true) {
				int alt7=3;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==12) ) {
					alt7=1;
				}
				else if ( (LA7_0==46) ) {
					alt7=2;
				}

				switch (alt7) {
				case 1 :
					// rwscript.g:82:3: ( '&' e2= relexp )
					{
					// rwscript.g:82:3: ( '&' e2= relexp )
					// rwscript.g:82:4: '&' e2= relexp
					{
					match(input,12,FOLLOW_12_in_logexp661); 
					pushFollow(FOLLOW_relexp_in_logexp665);
					e2=relexp();
					state._fsp--;

					ast = new BinopExpr(BinopExpr.AND,ast,e2);
					}

					}
					break;
				case 2 :
					// rwscript.g:83:3: ( '|' e3= relexp )
					{
					// rwscript.g:83:3: ( '|' e3= relexp )
					// rwscript.g:83:4: '|' e3= relexp
					{
					match(input,46,FOLLOW_46_in_logexp675); 
					pushFollow(FOLLOW_relexp_in_logexp679);
					e3=relexp();
					state._fsp--;

					ast = new BinopExpr(BinopExpr.OR, ast,e3);
					}

					}
					break;

				default :
					break loop7;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "logexp"



	// $ANTLR start "relexp"
	// rwscript.g:87:1: relexp returns [Expr ast] : e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )* ;
	public final Expr relexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// rwscript.g:88:2: (e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )* )
			// rwscript.g:88:4: e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )*
			{
			pushFollow(FOLLOW_addexp_in_relexp704);
			e1=addexp();
			state._fsp--;

			ast = e1;
			// rwscript.g:89:2: ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )*
			loop8:
			while (true) {
				int alt8=3;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==28) ) {
					alt8=1;
				}
				else if ( (LA8_0==26) ) {
					alt8=2;
				}

				switch (alt8) {
				case 1 :
					// rwscript.g:90:3: ( '==' e2= addexp )
					{
					// rwscript.g:90:3: ( '==' e2= addexp )
					// rwscript.g:90:4: '==' e2= addexp
					{
					match(input,28,FOLLOW_28_in_relexp714); 
					pushFollow(FOLLOW_addexp_in_relexp718);
					e2=addexp();
					state._fsp--;

					ast = new BinopExpr(BinopExpr.EQ,ast,e2);
					}

					}
					break;
				case 2 :
					// rwscript.g:91:3: ( '<=' e3= addexp )
					{
					// rwscript.g:91:3: ( '<=' e3= addexp )
					// rwscript.g:91:4: '<=' e3= addexp
					{
					match(input,26,FOLLOW_26_in_relexp727); 
					pushFollow(FOLLOW_addexp_in_relexp731);
					e3=addexp();
					state._fsp--;

					ast = new BinopExpr(BinopExpr.LEQ,ast,e3);
					}

					}
					break;

				default :
					break loop8;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "relexp"



	// $ANTLR start "addexp"
	// rwscript.g:95:1: addexp returns [Expr ast] : e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )* ;
	public final Expr addexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// rwscript.g:96:2: (e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )* )
			// rwscript.g:96:4: e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )*
			{
			pushFollow(FOLLOW_mulexp_in_addexp755);
			e1=mulexp();
			state._fsp--;

			ast = e1;
			// rwscript.g:97:2: ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )*
			loop9:
			while (true) {
				int alt9=3;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==16) ) {
					alt9=1;
				}
				else if ( (LA9_0==18) ) {
					alt9=2;
				}

				switch (alt9) {
				case 1 :
					// rwscript.g:98:3: ( '+' e2= mulexp )
					{
					// rwscript.g:98:3: ( '+' e2= mulexp )
					// rwscript.g:98:4: '+' e2= mulexp
					{
					match(input,16,FOLLOW_16_in_addexp765); 
					pushFollow(FOLLOW_mulexp_in_addexp769);
					e2=mulexp();
					state._fsp--;

					}

					ast = new BinopExpr(BinopExpr.ADD,ast,e2);
					}
					break;
				case 2 :
					// rwscript.g:99:3: ( '-' e3= mulexp )
					{
					// rwscript.g:99:3: ( '-' e3= mulexp )
					// rwscript.g:99:4: '-' e3= mulexp
					{
					match(input,18,FOLLOW_18_in_addexp777); 
					pushFollow(FOLLOW_mulexp_in_addexp781);
					e3=mulexp();
					state._fsp--;

					ast = new BinopExpr(BinopExpr.SUB,ast,e3);
					}

					}
					break;

				default :
					break loop9;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "addexp"



	// $ANTLR start "mulexp"
	// rwscript.g:103:1: mulexp returns [Expr ast] : e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )* ;
	public final Expr mulexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// rwscript.g:104:2: (e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )* )
			// rwscript.g:104:4: e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )*
			{
			pushFollow(FOLLOW_atom_in_mulexp806);
			e1=atom();
			state._fsp--;

			ast = e1;
			// rwscript.g:105:2: ( ( '*' e2= atom ) | ( '/' e3= atom ) )*
			loop10:
			while (true) {
				int alt10=3;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==15) ) {
					alt10=1;
				}
				else if ( (LA10_0==24) ) {
					alt10=2;
				}

				switch (alt10) {
				case 1 :
					// rwscript.g:106:3: ( '*' e2= atom )
					{
					// rwscript.g:106:3: ( '*' e2= atom )
					// rwscript.g:106:4: '*' e2= atom
					{
					match(input,15,FOLLOW_15_in_mulexp816); 
					pushFollow(FOLLOW_atom_in_mulexp820);
					e2=atom();
					state._fsp--;

					ast = new BinopExpr(BinopExpr.MULT,ast,e2);
					}

					}
					break;
				case 2 :
					// rwscript.g:107:3: ( '/' e3= atom )
					{
					// rwscript.g:107:3: ( '/' e3= atom )
					// rwscript.g:107:4: '/' e3= atom
					{
					match(input,24,FOLLOW_24_in_mulexp828); 
					pushFollow(FOLLOW_atom_in_mulexp832);
					e3=atom();
					state._fsp--;

					ast = new BinopExpr(BinopExpr.DIV,ast,e3);
					}

					}
					break;

				default :
					break loop10;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "mulexp"



	// $ANTLR start "atom"
	// rwscript.g:111:1: atom returns [Expr ast] : ( VAR '(' apl= actualParameterList ')' | VAR '(' ')' | VAR '.stackSize()' | VAR '.pop()' | VAR | 'GREATEST(' e1= exp ',' e2= exp ',' e3= exp ')' | 'LEAST(' e1= exp ',' e2= exp ',' e3= exp ')' | 'LEN(' rq= removeQuotes ')' | NUM | '-' NUM );
	public final Expr atom() throws RecognitionException {
		Expr ast = null;


		Token VAR22=null;
		Token VAR23=null;
		Token VAR24=null;
		Token VAR25=null;
		Token VAR26=null;
		Token NUM27=null;
		Token NUM28=null;
		ArgList apl =null;
		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;
		String rq =null;

		try {
			// rwscript.g:112:2: ( VAR '(' apl= actualParameterList ')' | VAR '(' ')' | VAR '.stackSize()' | VAR '.pop()' | VAR | 'GREATEST(' e1= exp ',' e2= exp ',' e3= exp ')' | 'LEAST(' e1= exp ',' e2= exp ',' e3= exp ')' | 'LEN(' rq= removeQuotes ')' | NUM | '-' NUM )
			int alt11=10;
			switch ( input.LA(1) ) {
			case VAR:
				{
				switch ( input.LA(2) ) {
				case 13:
					{
					int LA11_7 = input.LA(3);
					if ( (LA11_7==14) ) {
						alt11=2;
					}
					else if ( (LA11_7==NUM||LA11_7==VAR||LA11_7==18||(LA11_7 >= 30 && LA11_7 <= 32)) ) {
						alt11=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 22:
					{
					alt11=3;
					}
					break;
				case 19:
					{
					alt11=4;
					}
					break;
				case 12:
				case 14:
				case 15:
				case 16:
				case 17:
				case 18:
				case 24:
				case 25:
				case 26:
				case 28:
				case 46:
					{
					alt11=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 30:
				{
				alt11=6;
				}
				break;
			case 31:
				{
				alt11=7;
				}
				break;
			case 32:
				{
				alt11=8;
				}
				break;
			case NUM:
				{
				alt11=9;
				}
				break;
			case 18:
				{
				alt11=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// rwscript.g:112:4: VAR '(' apl= actualParameterList ')'
					{
					VAR22=(Token)match(input,VAR,FOLLOW_VAR_in_atom855); 
					match(input,13,FOLLOW_13_in_atom857); 
					pushFollow(FOLLOW_actualParameterList_in_atom860);
					apl=actualParameterList();
					state._fsp--;

					match(input,14,FOLLOW_14_in_atom862); 
					ast = new CallExpr((VAR22!=null?VAR22.getText():null),apl);
					}
					break;
				case 2 :
					// rwscript.g:113:4: VAR '(' ')'
					{
					VAR23=(Token)match(input,VAR,FOLLOW_VAR_in_atom869); 
					match(input,13,FOLLOW_13_in_atom871); 
					match(input,14,FOLLOW_14_in_atom873); 
					ast = new CallExpr((VAR23!=null?VAR23.getText():null));
					}
					break;
				case 3 :
					// rwscript.g:114:4: VAR '.stackSize()'
					{
					VAR24=(Token)match(input,VAR,FOLLOW_VAR_in_atom880); 
					match(input,22,FOLLOW_22_in_atom882); 
					ast = new StackExpr(StackExpr.STSIZE,(VAR24!=null?VAR24.getText():null));
					}
					break;
				case 4 :
					// rwscript.g:115:4: VAR '.pop()'
					{
					VAR25=(Token)match(input,VAR,FOLLOW_VAR_in_atom889); 
					match(input,19,FOLLOW_19_in_atom891); 
					ast = new StackExpr(StackExpr.POP,(VAR25!=null?VAR25.getText():null));
					}
					break;
				case 5 :
					// rwscript.g:116:4: VAR
					{
					VAR26=(Token)match(input,VAR,FOLLOW_VAR_in_atom901); 
					ast = new VarExpr((VAR26!=null?VAR26.getText():null));
					}
					break;
				case 6 :
					// rwscript.g:117:4: 'GREATEST(' e1= exp ',' e2= exp ',' e3= exp ')'
					{
					match(input,30,FOLLOW_30_in_atom915); 
					pushFollow(FOLLOW_exp_in_atom919);
					e1=exp();
					state._fsp--;

					match(input,17,FOLLOW_17_in_atom921); 
					pushFollow(FOLLOW_exp_in_atom925);
					e2=exp();
					state._fsp--;

					match(input,17,FOLLOW_17_in_atom927); 
					pushFollow(FOLLOW_exp_in_atom931);
					e3=exp();
					state._fsp--;

					match(input,14,FOLLOW_14_in_atom933); 
					ast = new BuiltInExpr(BuiltInExpr.GREATEST,e1,e2,e3);
					}
					break;
				case 7 :
					// rwscript.g:119:4: 'LEAST(' e1= exp ',' e2= exp ',' e3= exp ')'
					{
					match(input,31,FOLLOW_31_in_atom945); 
					pushFollow(FOLLOW_exp_in_atom949);
					e1=exp();
					state._fsp--;

					match(input,17,FOLLOW_17_in_atom951); 
					pushFollow(FOLLOW_exp_in_atom955);
					e2=exp();
					state._fsp--;

					match(input,17,FOLLOW_17_in_atom957); 
					pushFollow(FOLLOW_exp_in_atom961);
					e3=exp();
					state._fsp--;

					match(input,14,FOLLOW_14_in_atom963); 
					ast = new BuiltInExpr(BuiltInExpr.LEAST,e1,e2,e3);
					}
					break;
				case 8 :
					// rwscript.g:121:4: 'LEN(' rq= removeQuotes ')'
					{
					match(input,32,FOLLOW_32_in_atom976); 
					pushFollow(FOLLOW_removeQuotes_in_atom980);
					rq=removeQuotes();
					state._fsp--;

					match(input,14,FOLLOW_14_in_atom982); 
					ast = new BuiltInExpr(BuiltInExpr.LEN,rq);
					}
					break;
				case 9 :
					// rwscript.g:122:4: NUM
					{
					NUM27=(Token)match(input,NUM,FOLLOW_NUM_in_atom992); 
					ast = new NumExpr((NUM27!=null?NUM27.getText():null));
					}
					break;
				case 10 :
					// rwscript.g:123:4: '-' NUM
					{
					match(input,18,FOLLOW_18_in_atom1006); 
					NUM28=(Token)match(input,NUM,FOLLOW_NUM_in_atom1008); 
					ast = new NumExpr('-'+(NUM28!=null?NUM28.getText():null));
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "atom"



	// $ANTLR start "removeQuotes"
	// rwscript.g:127:1: removeQuotes returns [String text] : STRING ;
	public final String removeQuotes() throws RecognitionException {
		String text = null;


		Token STRING29=null;

		try {
			// rwscript.g:128:2: ( STRING )
			// rwscript.g:128:4: STRING
			{
			STRING29=(Token)match(input,STRING,FOLLOW_STRING_in_removeQuotes1032); 

					      // get rid of the quotes in the string
					      int size = (STRING29!=null?STRING29.getText():null).length();
					      text = (STRING29!=null?STRING29.getText():null).substring(1,size-1);
					   
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return text;
	}
	// $ANTLR end "removeQuotes"

	// Delegated rules



	public static final BitSet FOLLOW_stmt_in_prog25 = new BitSet(new long[]{0x00003F7E20000D02L});
	public static final BitSet FOLLOW_33_in_stmt44 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt46 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt48 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_stmt55 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt57 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_stmt59 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_exp_in_stmt63 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt65 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_stmt75 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt77 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt79 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_stmt89 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_stmt91 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_exp_in_stmt95 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt97 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_stmt107 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt110 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_stmt112 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_stmt114 = new BitSet(new long[]{0x00003F7E20000D00L});
	public static final BitSet FOLLOW_stmt_in_stmt118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_stmt128 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt131 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_stmt133 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_parameterList_in_stmt137 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_stmt139 = new BitSet(new long[]{0x00003F7E20000D00L});
	public static final BitSet FOLLOW_stmt_in_stmt143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_stmt152 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_stmt154 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_stmt156 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_stmt165 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_stmt167 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_actualParameterList_in_stmt171 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_stmt173 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_stmt182 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_exp_in_stmt184 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_stmt193 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_stmt202 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_stmt204 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_exp_in_stmt208 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_stmt210 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_stmt227 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_stmt229 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_stmt246 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_stmt248 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_exp_in_stmt249 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_stmt250 = new BitSet(new long[]{0x00003F7E20000D00L});
	public static final BitSet FOLLOW_stmt_in_stmt254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_stmt269 = new BitSet(new long[]{0x00003F7E20000D00L});
	public static final BitSet FOLLOW_stmt_in_stmt273 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_stmt275 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_stmt277 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_exp_in_stmt278 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_stmt279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_stmt294 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_stmt296 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_exp_in_stmt297 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_stmt298 = new BitSet(new long[]{0x00003F7E20000D00L});
	public static final BitSet FOLLOW_stmt_in_stmt302 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_stmt317 = new BitSet(new long[]{0x00003F7E20000D00L});
	public static final BitSet FOLLOW_stmt_in_stmt321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_stmt331 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_stmt333 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_stmt350 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_stmt352 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_stmt369 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_stmt371 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_stmt372 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_exp_in_stmt373 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_stmt374 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_stmt393 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_stmt395 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_stmt412 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_stmt414 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_exp_in_stmt418 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_stmt420 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_exp_in_stmt424 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_stmt426 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_exp_in_stmt430 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_stmt432 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_exp_in_stmt436 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_stmt437 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_stmt448 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_stmt450 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_exp_in_stmt454 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_stmt456 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_exp_in_stmt460 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_stmt462 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_exp_in_stmt466 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_stmt468 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_exp_in_stmt472 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_stmt473 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_stmt484 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_stmt495 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_exp_in_stmt497 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_stmt499 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_stmt510 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_stmt521 = new BitSet(new long[]{0x00003F7E20000D00L});
	public static final BitSet FOLLOW_stmt_in_stmt527 = new BitSet(new long[]{0x0000BF7E20000D00L});
	public static final BitSet FOLLOW_47_in_stmt533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_removeQuotes_in_thestring550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_parameterList570 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_parameterList578 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_VAR_in_parameterList582 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_exp_in_actualParameterList605 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_actualParameterList610 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_exp_in_actualParameterList614 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_logexp_in_exp633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relexp_in_logexp651 = new BitSet(new long[]{0x0000400000001002L});
	public static final BitSet FOLLOW_12_in_logexp661 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_relexp_in_logexp665 = new BitSet(new long[]{0x0000400000001002L});
	public static final BitSet FOLLOW_46_in_logexp675 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_relexp_in_logexp679 = new BitSet(new long[]{0x0000400000001002L});
	public static final BitSet FOLLOW_addexp_in_relexp704 = new BitSet(new long[]{0x0000000014000002L});
	public static final BitSet FOLLOW_28_in_relexp714 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_addexp_in_relexp718 = new BitSet(new long[]{0x0000000014000002L});
	public static final BitSet FOLLOW_26_in_relexp727 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_addexp_in_relexp731 = new BitSet(new long[]{0x0000000014000002L});
	public static final BitSet FOLLOW_mulexp_in_addexp755 = new BitSet(new long[]{0x0000000000050002L});
	public static final BitSet FOLLOW_16_in_addexp765 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_mulexp_in_addexp769 = new BitSet(new long[]{0x0000000000050002L});
	public static final BitSet FOLLOW_18_in_addexp777 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_mulexp_in_addexp781 = new BitSet(new long[]{0x0000000000050002L});
	public static final BitSet FOLLOW_atom_in_mulexp806 = new BitSet(new long[]{0x0000000001008002L});
	public static final BitSet FOLLOW_15_in_mulexp816 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_atom_in_mulexp820 = new BitSet(new long[]{0x0000000001008002L});
	public static final BitSet FOLLOW_24_in_mulexp828 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_atom_in_mulexp832 = new BitSet(new long[]{0x0000000001008002L});
	public static final BitSet FOLLOW_VAR_in_atom855 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_atom857 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_actualParameterList_in_atom860 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_atom862 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atom869 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_atom871 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_atom873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atom880 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_atom882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atom889 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_atom891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_atom901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_atom915 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_exp_in_atom919 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_atom921 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_exp_in_atom925 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_atom927 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_exp_in_atom931 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_atom933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_atom945 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_exp_in_atom949 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_atom951 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_exp_in_atom955 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_atom957 = new BitSet(new long[]{0x00000001C0040140L});
	public static final BitSet FOLLOW_exp_in_atom961 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_atom963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_atom976 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_removeQuotes_in_atom980 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_atom982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_in_atom992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_atom1006 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_NUM_in_atom1008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_removeQuotes1032 = new BitSet(new long[]{0x0000000000000002L});
}
