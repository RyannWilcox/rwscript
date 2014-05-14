// $ANTLR 3.5 rwscript.g 2013-12-16 14:01:35

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class rwscriptLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public rwscriptLexer() {} 
	public rwscriptLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public rwscriptLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "rwscript.g"; }

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:2:7: ( '#' )
			// rwscript.g:2:9: '#'
			{
			match('#'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:3:7: ( '$' )
			// rwscript.g:3:9: '$'
			{
			match('$'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:4:7: ( '&' )
			// rwscript.g:4:9: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:5:7: ( '(' )
			// rwscript.g:5:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:6:7: ( ')' )
			// rwscript.g:6:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:7:7: ( '*' )
			// rwscript.g:7:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:8:7: ( '+' )
			// rwscript.g:8:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:9:7: ( ',' )
			// rwscript.g:9:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:10:7: ( '-' )
			// rwscript.g:10:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:11:7: ( '.pop()' )
			// rwscript.g:11:9: '.pop()'
			{
			match(".pop()"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:12:7: ( '.printStack()' )
			// rwscript.g:12:9: '.printStack()'
			{
			match(".printStack()"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:13:7: ( '.push' )
			// rwscript.g:13:9: '.push'
			{
			match(".push"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:14:7: ( '.stackSize()' )
			// rwscript.g:14:9: '.stackSize()'
			{
			match(".stackSize()"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:15:7: ( '.stackSort()' )
			// rwscript.g:15:9: '.stackSort()'
			{
			match(".stackSort()"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:16:7: ( '/' )
			// rwscript.g:16:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:17:7: ( ';' )
			// rwscript.g:17:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:18:7: ( '<=' )
			// rwscript.g:18:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:19:7: ( '=' )
			// rwscript.g:19:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:20:7: ( '==' )
			// rwscript.g:20:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:21:7: ( 'CreateFile()' )
			// rwscript.g:21:9: 'CreateFile()'
			{
			match("CreateFile()"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:22:7: ( 'GREATEST(' )
			// rwscript.g:22:9: 'GREATEST('
			{
			match("GREATEST("); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:23:7: ( 'LEAST(' )
			// rwscript.g:23:9: 'LEAST('
			{
			match("LEAST("); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:24:7: ( 'LEN(' )
			// rwscript.g:24:9: 'LEN('
			{
			match("LEN("); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:25:7: ( 'Stack' )
			// rwscript.g:25:9: 'Stack'
			{
			match("Stack"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:26:7: ( 'ViewFile()' )
			// rwscript.g:26:9: 'ViewFile()'
			{
			match("ViewFile()"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:27:7: ( 'WriteToFile(' )
			// rwscript.g:27:9: 'WriteToFile('
			{
			match("WriteToFile("); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:28:7: ( 'do' )
			// rwscript.g:28:9: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:29:7: ( 'drawCircle' )
			// rwscript.g:29:9: 'drawCircle'
			{
			match("drawCircle"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:30:7: ( 'drawSquare' )
			// rwscript.g:30:9: 'drawSquare'
			{
			match("drawSquare"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:31:7: ( 'else' )
			// rwscript.g:31:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:32:7: ( 'if' )
			// rwscript.g:32:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:33:7: ( 'input :=' )
			// rwscript.g:33:9: 'input :='
			{
			match("input :="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:34:7: ( 'print.ToConsole' )
			// rwscript.g:34:9: 'print.ToConsole'
			{
			match("print.ToConsole"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:35:7: ( 'return' )
			// rwscript.g:35:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:36:7: ( 'while' )
			// rwscript.g:36:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:37:7: ( '{' )
			// rwscript.g:37:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:38:7: ( '|' )
			// rwscript.g:38:9: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:39:7: ( '}' )
			// rwscript.g:39:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:138:8: ( '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )* '\\'' )
			// rwscript.g:138:10: '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )* '\\''
			{
			match('\''); 
			// rwscript.g:138:15: ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )*
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='\\') ) {
					alt1=1;
				}
				else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '&')||(LA1_0 >= '(' && LA1_0 <= '[')||(LA1_0 >= ']' && LA1_0 <= '\uFFFF')) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// rwscript.g:138:17: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// rwscript.g:138:27: ~ ( '\\\\' | '\\'' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:141:7: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// rwscript.g:141:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// rwscript.g:141:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// rwscript.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "NUM"
	public final void mNUM() throws RecognitionException {
		try {
			int _type = NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:142:6: ( ( '0' .. '9' )+ )
			// rwscript.g:142:8: ( '0' .. '9' )+
			{
			// rwscript.g:142:8: ( '0' .. '9' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// rwscript.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUM"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// rwscript.g:145:9: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
			// rwscript.g:145:14: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
			{
			match('\\'); 
			if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:145:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// rwscript.g:145:14: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// rwscript.g:145:19: (~ ( '\\n' | '\\r' ) )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\t')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '\uFFFF')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// rwscript.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop4;
				}
			}

			// rwscript.g:145:33: ( '\\r' )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='\r') ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// rwscript.g:145:33: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// rwscript.g:146:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// rwscript.g:146:11: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// rwscript.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | STRING | VAR | NUM | COMMENT | WS )
		int alt6=43;
		alt6 = dfa6.predict(input);
		switch (alt6) {
			case 1 :
				// rwscript.g:1:10: T__10
				{
				mT__10(); 

				}
				break;
			case 2 :
				// rwscript.g:1:16: T__11
				{
				mT__11(); 

				}
				break;
			case 3 :
				// rwscript.g:1:22: T__12
				{
				mT__12(); 

				}
				break;
			case 4 :
				// rwscript.g:1:28: T__13
				{
				mT__13(); 

				}
				break;
			case 5 :
				// rwscript.g:1:34: T__14
				{
				mT__14(); 

				}
				break;
			case 6 :
				// rwscript.g:1:40: T__15
				{
				mT__15(); 

				}
				break;
			case 7 :
				// rwscript.g:1:46: T__16
				{
				mT__16(); 

				}
				break;
			case 8 :
				// rwscript.g:1:52: T__17
				{
				mT__17(); 

				}
				break;
			case 9 :
				// rwscript.g:1:58: T__18
				{
				mT__18(); 

				}
				break;
			case 10 :
				// rwscript.g:1:64: T__19
				{
				mT__19(); 

				}
				break;
			case 11 :
				// rwscript.g:1:70: T__20
				{
				mT__20(); 

				}
				break;
			case 12 :
				// rwscript.g:1:76: T__21
				{
				mT__21(); 

				}
				break;
			case 13 :
				// rwscript.g:1:82: T__22
				{
				mT__22(); 

				}
				break;
			case 14 :
				// rwscript.g:1:88: T__23
				{
				mT__23(); 

				}
				break;
			case 15 :
				// rwscript.g:1:94: T__24
				{
				mT__24(); 

				}
				break;
			case 16 :
				// rwscript.g:1:100: T__25
				{
				mT__25(); 

				}
				break;
			case 17 :
				// rwscript.g:1:106: T__26
				{
				mT__26(); 

				}
				break;
			case 18 :
				// rwscript.g:1:112: T__27
				{
				mT__27(); 

				}
				break;
			case 19 :
				// rwscript.g:1:118: T__28
				{
				mT__28(); 

				}
				break;
			case 20 :
				// rwscript.g:1:124: T__29
				{
				mT__29(); 

				}
				break;
			case 21 :
				// rwscript.g:1:130: T__30
				{
				mT__30(); 

				}
				break;
			case 22 :
				// rwscript.g:1:136: T__31
				{
				mT__31(); 

				}
				break;
			case 23 :
				// rwscript.g:1:142: T__32
				{
				mT__32(); 

				}
				break;
			case 24 :
				// rwscript.g:1:148: T__33
				{
				mT__33(); 

				}
				break;
			case 25 :
				// rwscript.g:1:154: T__34
				{
				mT__34(); 

				}
				break;
			case 26 :
				// rwscript.g:1:160: T__35
				{
				mT__35(); 

				}
				break;
			case 27 :
				// rwscript.g:1:166: T__36
				{
				mT__36(); 

				}
				break;
			case 28 :
				// rwscript.g:1:172: T__37
				{
				mT__37(); 

				}
				break;
			case 29 :
				// rwscript.g:1:178: T__38
				{
				mT__38(); 

				}
				break;
			case 30 :
				// rwscript.g:1:184: T__39
				{
				mT__39(); 

				}
				break;
			case 31 :
				// rwscript.g:1:190: T__40
				{
				mT__40(); 

				}
				break;
			case 32 :
				// rwscript.g:1:196: T__41
				{
				mT__41(); 

				}
				break;
			case 33 :
				// rwscript.g:1:202: T__42
				{
				mT__42(); 

				}
				break;
			case 34 :
				// rwscript.g:1:208: T__43
				{
				mT__43(); 

				}
				break;
			case 35 :
				// rwscript.g:1:214: T__44
				{
				mT__44(); 

				}
				break;
			case 36 :
				// rwscript.g:1:220: T__45
				{
				mT__45(); 

				}
				break;
			case 37 :
				// rwscript.g:1:226: T__46
				{
				mT__46(); 

				}
				break;
			case 38 :
				// rwscript.g:1:232: T__47
				{
				mT__47(); 

				}
				break;
			case 39 :
				// rwscript.g:1:238: STRING
				{
				mSTRING(); 

				}
				break;
			case 40 :
				// rwscript.g:1:245: VAR
				{
				mVAR(); 

				}
				break;
			case 41 :
				// rwscript.g:1:249: NUM
				{
				mNUM(); 

				}
				break;
			case 42 :
				// rwscript.g:1:253: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 43 :
				// rwscript.g:1:261: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA6 dfa6 = new DFA6(this);
	static final String DFA6_eotS =
		"\13\uffff\1\45\2\uffff\1\47\14\37\15\uffff\6\37\1\101\2\37\1\104\4\37"+
		"\4\uffff\7\37\1\uffff\2\37\1\uffff\4\37\1\uffff\3\37\1\uffff\4\37\1\140"+
		"\4\37\1\uffff\3\37\1\151\4\37\1\uffff\3\37\1\161\1\uffff\2\37\2\uffff"+
		"\4\37\2\uffff\1\171\2\uffff\6\37\3\uffff\7\37\2\uffff\5\37\1\u008e\1\u008f"+
		"\1\uffff\1\37\3\uffff";
	static final String DFA6_eofS =
		"\u0091\uffff";
	static final String DFA6_minS =
		"\1\11\11\uffff\1\160\1\57\2\uffff\1\75\1\162\1\122\1\105\1\164\1\151\1"+
		"\162\1\157\1\154\1\146\1\162\1\145\1\150\7\uffff\1\157\1\164\4\uffff\1"+
		"\145\1\105\1\101\1\141\1\145\1\151\1\60\1\141\1\163\1\60\1\160\1\151\1"+
		"\164\1\151\3\uffff\2\141\1\101\1\123\1\50\1\143\1\167\1\164\1\uffff\1"+
		"\167\1\145\1\uffff\1\165\1\156\1\165\1\154\1\143\1\164\2\124\1\uffff\1"+
		"\153\1\106\1\145\1\103\1\60\2\164\1\162\1\145\1\153\1\145\1\105\1\50\1"+
		"\60\1\151\1\124\1\151\1\161\1\uffff\1\40\1\56\1\156\1\60\1\123\1\106\1"+
		"\123\2\uffff\1\154\1\157\1\162\1\165\2\uffff\1\60\1\uffff\2\151\1\124"+
		"\1\145\1\106\1\143\1\141\3\uffff\1\154\2\50\1\151\1\154\1\162\1\145\2"+
		"\uffff\1\154\2\145\1\50\1\145\2\60\1\uffff\1\50\3\uffff";
	static final String DFA6_maxS =
		"\1\175\11\uffff\1\163\1\57\2\uffff\1\75\1\162\1\122\1\105\1\164\1\151"+
		"\2\162\1\154\1\156\1\162\1\145\1\150\7\uffff\1\165\1\164\4\uffff\1\145"+
		"\1\105\1\116\1\141\1\145\1\151\1\172\1\141\1\163\1\172\1\160\1\151\1\164"+
		"\1\151\3\uffff\2\141\1\101\1\123\1\50\1\143\1\167\1\164\1\uffff\1\167"+
		"\1\145\1\uffff\1\165\1\156\1\165\1\154\1\143\1\164\2\124\1\uffff\1\153"+
		"\1\106\1\145\1\123\1\172\2\164\1\162\1\145\1\153\1\145\1\105\1\50\1\172"+
		"\1\151\1\124\1\151\1\161\1\uffff\1\40\1\56\1\156\1\172\1\123\1\106\1\123"+
		"\2\uffff\1\154\1\157\1\162\1\165\2\uffff\1\172\1\uffff\1\157\1\151\1\124"+
		"\1\145\1\106\1\143\1\141\3\uffff\1\154\2\50\1\151\1\154\1\162\1\145\2"+
		"\uffff\1\154\2\145\1\50\1\145\2\172\1\uffff\1\50\3\uffff";
	static final String DFA6_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\2\uffff\1\20\1\21\15\uffff"+
		"\1\44\1\45\1\46\1\47\1\50\1\51\1\53\2\uffff\1\52\1\17\1\23\1\22\16\uffff"+
		"\1\12\1\13\1\14\10\uffff\1\33\2\uffff\1\37\10\uffff\1\27\22\uffff\1\36"+
		"\7\uffff\1\26\1\30\4\uffff\1\40\1\41\1\uffff\1\43\7\uffff\1\42\1\15\1"+
		"\16\7\uffff\1\25\1\31\7\uffff\1\24\1\uffff\1\34\1\35\1\32";
	static final String DFA6_specialS =
		"\u0091\uffff}>";
	static final String[] DFA6_transitionS = {
			"\2\41\2\uffff\1\41\22\uffff\1\41\2\uffff\1\1\1\2\1\uffff\1\3\1\36\1\4"+
			"\1\5\1\6\1\7\1\10\1\11\1\12\1\13\12\40\1\uffff\1\14\1\15\1\16\3\uffff"+
			"\2\37\1\17\3\37\1\20\4\37\1\21\6\37\1\22\2\37\1\23\1\24\3\37\4\uffff"+
			"\1\37\1\uffff\3\37\1\25\1\26\3\37\1\27\6\37\1\30\1\37\1\31\4\37\1\32"+
			"\3\37\1\33\1\34\1\35",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\42\2\uffff\1\43",
			"\1\44",
			"",
			"",
			"\1\46",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56\2\uffff\1\57",
			"\1\60",
			"\1\61\7\uffff\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\66\2\uffff\1\67\2\uffff\1\70",
			"\1\71",
			"",
			"",
			"",
			"",
			"\1\72",
			"\1\73",
			"\1\74\14\uffff\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\102",
			"\1\103",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"",
			"",
			"",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"",
			"\1\121",
			"\1\122",
			"",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136\17\uffff\1\137",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"",
			"\1\156",
			"\1\157",
			"\1\160",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\162",
			"\1\163",
			"\1\164",
			"",
			"",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"\1\172\5\uffff\1\173",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"",
			"",
			"",
			"\1\u0082",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"",
			"",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"\1\u0090",
			"",
			"",
			""
	};

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | STRING | VAR | NUM | COMMENT | WS );";
		}
	}

}
