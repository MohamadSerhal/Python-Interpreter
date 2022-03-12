// $ANTLR 3.5.2 T_semantics.g 2020-11-30 11:33:47

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class T_semanticsLexer extends Lexer {
	public static final int EOF=-1;
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
	public static final int ANDOR=4;
	public static final int COMMENTS=5;
	public static final int ID=6;
	public static final int INT=7;
	public static final int NOT=8;
	public static final int OP=9;
	public static final int STRING=10;
	public static final int WS=11;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public T_semanticsLexer() {} 
	public T_semanticsLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public T_semanticsLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "T_semantics.g"; }

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T_semantics.g:2:7: ( '(' )
			// T_semantics.g:2:9: '('
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
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T_semantics.g:3:7: ( ')' )
			// T_semantics.g:3:9: ')'
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
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T_semantics.g:4:7: ( '+' )
			// T_semantics.g:4:9: '+'
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
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T_semantics.g:5:7: ( ',' )
			// T_semantics.g:5:9: ','
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
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T_semantics.g:6:7: ( ':' )
			// T_semantics.g:6:9: ':'
			{
			match(':'); 
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
			// T_semantics.g:7:7: ( '=' )
			// T_semantics.g:7:9: '='
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
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T_semantics.g:8:7: ( '[' )
			// T_semantics.g:8:9: '['
			{
			match('['); 
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
			// T_semantics.g:9:7: ( ']' )
			// T_semantics.g:9:9: ']'
			{
			match(']'); 
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
			// T_semantics.g:10:7: ( 'for' )
			// T_semantics.g:10:9: 'for'
			{
			match("for"); 

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
			// T_semantics.g:11:7: ( 'if' )
			// T_semantics.g:11:9: 'if'
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
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T_semantics.g:12:7: ( 'in' )
			// T_semantics.g:12:9: 'in'
			{
			match("in"); 

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
			// T_semantics.g:13:7: ( 'print' )
			// T_semantics.g:13:9: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "ANDOR"
	public final void mANDOR() throws RecognitionException {
		try {
			int _type = ANDOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T_semantics.g:9:7: ( ( 'and' | 'or' ) )
			// T_semantics.g:9:9: ( 'and' | 'or' )
			{
			// T_semantics.g:9:9: ( 'and' | 'or' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='a') ) {
				alt1=1;
			}
			else if ( (LA1_0=='o') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// T_semantics.g:9:10: 'and'
					{
					match("and"); 

					}
					break;
				case 2 :
					// T_semantics.g:9:16: 'or'
					{
					match("or"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ANDOR"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T_semantics.g:10:5: ( 'not' )
			// T_semantics.g:10:7: 'not'
			{
			match("not"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T_semantics.g:11:5: ( ( '-' )? ( '0' .. '9' )+ )
			// T_semantics.g:11:7: ( '-' )? ( '0' .. '9' )+
			{
			// T_semantics.g:11:7: ( '-' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='-') ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// T_semantics.g:11:8: '-'
					{
					match('-'); 
					}
					break;

			}

			// T_semantics.g:11:14: ( '0' .. '9' )+
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
					// T_semantics.g:
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
	// $ANTLR end "INT"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T_semantics.g:12:4: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// T_semantics.g:12:6: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// T_semantics.g:12:26: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// T_semantics.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T_semantics.g:13:8: ( ( '\\'' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* ( '\\'' ) )
			// T_semantics.g:13:10: ( '\\'' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* ( '\\'' )
			{
			// T_semantics.g:13:10: ( '\\'' )
			// T_semantics.g:13:11: '\\''
			{
			match('\''); 
			}

			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// T_semantics.g:13:46: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// T_semantics.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop5;
				}
			}

			// T_semantics.g:13:76: ( '\\'' )
			// T_semantics.g:13:77: '\\''
			{
			match('\''); 
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "OP"
	public final void mOP() throws RecognitionException {
		try {
			int _type = OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T_semantics.g:14:4: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
			int alt6=6;
			switch ( input.LA(1) ) {
			case '=':
				{
				alt6=1;
				}
				break;
			case '!':
				{
				alt6=2;
				}
				break;
			case '<':
				{
				int LA6_3 = input.LA(2);
				if ( (LA6_3=='=') ) {
					alt6=4;
				}

				else {
					alt6=3;
				}

				}
				break;
			case '>':
				{
				int LA6_4 = input.LA(2);
				if ( (LA6_4=='=') ) {
					alt6=6;
				}

				else {
					alt6=5;
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// T_semantics.g:14:6: '=='
					{
					match("=="); 

					}
					break;
				case 2 :
					// T_semantics.g:14:13: '!='
					{
					match("!="); 

					}
					break;
				case 3 :
					// T_semantics.g:14:20: '<'
					{
					match('<'); 
					}
					break;
				case 4 :
					// T_semantics.g:14:26: '<='
					{
					match("<="); 

					}
					break;
				case 5 :
					// T_semantics.g:14:33: '>'
					{
					match('>'); 
					}
					break;
				case 6 :
					// T_semantics.g:14:39: '>='
					{
					match(">="); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T_semantics.g:18:5: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// T_semantics.g:18:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// T_semantics.g:18:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '\t' && LA7_0 <= '\n')||LA7_0=='\r'||LA7_0==' ') ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// T_semantics.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMMENTS"
	public final void mCOMMENTS() throws RecognitionException {
		try {
			int _type = COMMENTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T_semantics.g:21:11: ( ( '//' ) (~ ( '\\n' | '\\r' ) )* )
			// T_semantics.g:21:15: ( '//' ) (~ ( '\\n' | '\\r' ) )*
			{
			// T_semantics.g:21:15: ( '//' )
			// T_semantics.g:21:16: '//'
			{
			match("//"); 

			}

			// T_semantics.g:21:21: (~ ( '\\n' | '\\r' ) )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '\u0000' && LA8_0 <= '\t')||(LA8_0 >= '\u000B' && LA8_0 <= '\f')||(LA8_0 >= '\u000E' && LA8_0 <= '\uFFFF')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// T_semantics.g:
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
					break loop8;
				}
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENTS"

	@Override
	public void mTokens() throws RecognitionException {
		// T_semantics.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | ANDOR | NOT | INT | ID | STRING | OP | WS | COMMENTS )
		int alt9=20;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt9=1;
			}
			break;
		case ')':
			{
			alt9=2;
			}
			break;
		case '+':
			{
			alt9=3;
			}
			break;
		case ',':
			{
			alt9=4;
			}
			break;
		case ':':
			{
			alt9=5;
			}
			break;
		case '=':
			{
			int LA9_6 = input.LA(2);
			if ( (LA9_6=='=') ) {
				alt9=18;
			}

			else {
				alt9=6;
			}

			}
			break;
		case '[':
			{
			alt9=7;
			}
			break;
		case ']':
			{
			alt9=8;
			}
			break;
		case 'f':
			{
			int LA9_9 = input.LA(2);
			if ( (LA9_9=='o') ) {
				int LA9_22 = input.LA(3);
				if ( (LA9_22=='r') ) {
					int LA9_29 = input.LA(4);
					if ( ((LA9_29 >= '0' && LA9_29 <= '9')||(LA9_29 >= 'A' && LA9_29 <= 'Z')||(LA9_29 >= 'a' && LA9_29 <= 'z')) ) {
						alt9=16;
					}

					else {
						alt9=9;
					}

				}

				else {
					alt9=16;
				}

			}

			else {
				alt9=16;
			}

			}
			break;
		case 'i':
			{
			switch ( input.LA(2) ) {
			case 'f':
				{
				int LA9_23 = input.LA(3);
				if ( ((LA9_23 >= '0' && LA9_23 <= '9')||(LA9_23 >= 'A' && LA9_23 <= 'Z')||(LA9_23 >= 'a' && LA9_23 <= 'z')) ) {
					alt9=16;
				}

				else {
					alt9=10;
				}

				}
				break;
			case 'n':
				{
				int LA9_24 = input.LA(3);
				if ( ((LA9_24 >= '0' && LA9_24 <= '9')||(LA9_24 >= 'A' && LA9_24 <= 'Z')||(LA9_24 >= 'a' && LA9_24 <= 'z')) ) {
					alt9=16;
				}

				else {
					alt9=11;
				}

				}
				break;
			default:
				alt9=16;
			}
			}
			break;
		case 'p':
			{
			int LA9_11 = input.LA(2);
			if ( (LA9_11=='r') ) {
				int LA9_25 = input.LA(3);
				if ( (LA9_25=='i') ) {
					int LA9_32 = input.LA(4);
					if ( (LA9_32=='n') ) {
						int LA9_37 = input.LA(5);
						if ( (LA9_37=='t') ) {
							int LA9_39 = input.LA(6);
							if ( ((LA9_39 >= '0' && LA9_39 <= '9')||(LA9_39 >= 'A' && LA9_39 <= 'Z')||(LA9_39 >= 'a' && LA9_39 <= 'z')) ) {
								alt9=16;
							}

							else {
								alt9=12;
							}

						}

						else {
							alt9=16;
						}

					}

					else {
						alt9=16;
					}

				}

				else {
					alt9=16;
				}

			}

			else {
				alt9=16;
			}

			}
			break;
		case 'a':
			{
			int LA9_12 = input.LA(2);
			if ( (LA9_12=='n') ) {
				int LA9_26 = input.LA(3);
				if ( (LA9_26=='d') ) {
					int LA9_33 = input.LA(4);
					if ( ((LA9_33 >= '0' && LA9_33 <= '9')||(LA9_33 >= 'A' && LA9_33 <= 'Z')||(LA9_33 >= 'a' && LA9_33 <= 'z')) ) {
						alt9=16;
					}

					else {
						alt9=13;
					}

				}

				else {
					alt9=16;
				}

			}

			else {
				alt9=16;
			}

			}
			break;
		case 'o':
			{
			int LA9_13 = input.LA(2);
			if ( (LA9_13=='r') ) {
				int LA9_27 = input.LA(3);
				if ( ((LA9_27 >= '0' && LA9_27 <= '9')||(LA9_27 >= 'A' && LA9_27 <= 'Z')||(LA9_27 >= 'a' && LA9_27 <= 'z')) ) {
					alt9=16;
				}

				else {
					alt9=13;
				}

			}

			else {
				alt9=16;
			}

			}
			break;
		case 'n':
			{
			int LA9_14 = input.LA(2);
			if ( (LA9_14=='o') ) {
				int LA9_28 = input.LA(3);
				if ( (LA9_28=='t') ) {
					int LA9_35 = input.LA(4);
					if ( ((LA9_35 >= '0' && LA9_35 <= '9')||(LA9_35 >= 'A' && LA9_35 <= 'Z')||(LA9_35 >= 'a' && LA9_35 <= 'z')) ) {
						alt9=16;
					}

					else {
						alt9=14;
					}

				}

				else {
					alt9=16;
				}

			}

			else {
				alt9=16;
			}

			}
			break;
		case '-':
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt9=15;
			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt9=16;
			}
			break;
		case '\'':
			{
			alt9=17;
			}
			break;
		case '!':
		case '<':
		case '>':
			{
			alt9=18;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt9=19;
			}
			break;
		case '/':
			{
			alt9=20;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 9, 0, input);
			throw nvae;
		}
		switch (alt9) {
			case 1 :
				// T_semantics.g:1:10: T__12
				{
				mT__12(); 

				}
				break;
			case 2 :
				// T_semantics.g:1:16: T__13
				{
				mT__13(); 

				}
				break;
			case 3 :
				// T_semantics.g:1:22: T__14
				{
				mT__14(); 

				}
				break;
			case 4 :
				// T_semantics.g:1:28: T__15
				{
				mT__15(); 

				}
				break;
			case 5 :
				// T_semantics.g:1:34: T__16
				{
				mT__16(); 

				}
				break;
			case 6 :
				// T_semantics.g:1:40: T__17
				{
				mT__17(); 

				}
				break;
			case 7 :
				// T_semantics.g:1:46: T__18
				{
				mT__18(); 

				}
				break;
			case 8 :
				// T_semantics.g:1:52: T__19
				{
				mT__19(); 

				}
				break;
			case 9 :
				// T_semantics.g:1:58: T__20
				{
				mT__20(); 

				}
				break;
			case 10 :
				// T_semantics.g:1:64: T__21
				{
				mT__21(); 

				}
				break;
			case 11 :
				// T_semantics.g:1:70: T__22
				{
				mT__22(); 

				}
				break;
			case 12 :
				// T_semantics.g:1:76: T__23
				{
				mT__23(); 

				}
				break;
			case 13 :
				// T_semantics.g:1:82: ANDOR
				{
				mANDOR(); 

				}
				break;
			case 14 :
				// T_semantics.g:1:88: NOT
				{
				mNOT(); 

				}
				break;
			case 15 :
				// T_semantics.g:1:92: INT
				{
				mINT(); 

				}
				break;
			case 16 :
				// T_semantics.g:1:96: ID
				{
				mID(); 

				}
				break;
			case 17 :
				// T_semantics.g:1:99: STRING
				{
				mSTRING(); 

				}
				break;
			case 18 :
				// T_semantics.g:1:106: OP
				{
				mOP(); 

				}
				break;
			case 19 :
				// T_semantics.g:1:109: WS
				{
				mWS(); 

				}
				break;
			case 20 :
				// T_semantics.g:1:112: COMMENTS
				{
				mCOMMENTS(); 

				}
				break;

		}
	}



}
