// $ANTLR 3.5.2 T_semantics.g 2020-11-30 11:33:47

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class T_semanticsParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANDOR", "COMMENTS", "ID", "INT", 
		"NOT", "OP", "STRING", "WS", "'('", "')'", "'+'", "','", "':'", "'='", 
		"'['", "']'", "'for'", "'if'", "'in'", "'print'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public T_semanticsParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public T_semanticsParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return T_semanticsParser.tokenNames; }
	@Override public String getGrammarFileName() { return "T_semantics.g"; }


		THelper th = new THelper();



	// $ANTLR start "prog"
	// T_semantics.g:23:1: prog : ( stmt )+ ;
	public final void prog() throws RecognitionException {
		try {
			// T_semantics.g:23:6: ( ( stmt )+ )
			// T_semantics.g:23:8: ( stmt )+
			{
			// T_semantics.g:23:8: ( stmt )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==23) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// T_semantics.g:23:9: stmt
					{
					pushFollow(FOLLOW_stmt_in_prog211);
					stmt();
					state._fsp--;

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
	}
	// $ANTLR end "prog"



	// $ANTLR start "stmt"
	// T_semantics.g:25:1: stmt : ( list_top | list_concatenation | list_slicing | simplified | print_list | list_assign );
	public final void stmt() throws RecognitionException {
		try {
			// T_semantics.g:26:2: ( list_top | list_concatenation | list_slicing | simplified | print_list | list_assign )
			int alt2=6;
			alt2 = dfa2.predict(input);
			switch (alt2) {
				case 1 :
					// T_semantics.g:26:4: list_top
					{
					pushFollow(FOLLOW_list_top_in_stmt222);
					list_top();
					state._fsp--;

					}
					break;
				case 2 :
					// T_semantics.g:27:4: list_concatenation
					{
					pushFollow(FOLLOW_list_concatenation_in_stmt227);
					list_concatenation();
					state._fsp--;

					}
					break;
				case 3 :
					// T_semantics.g:28:4: list_slicing
					{
					pushFollow(FOLLOW_list_slicing_in_stmt232);
					list_slicing();
					state._fsp--;

					}
					break;
				case 4 :
					// T_semantics.g:29:4: simplified
					{
					pushFollow(FOLLOW_simplified_in_stmt237);
					simplified();
					state._fsp--;

					}
					break;
				case 5 :
					// T_semantics.g:30:4: print_list
					{
					pushFollow(FOLLOW_print_list_in_stmt242);
					print_list();
					state._fsp--;

					}
					break;
				case 6 :
					// T_semantics.g:31:4: list_assign
					{
					pushFollow(FOLLOW_list_assign_in_stmt247);
					list_assign();
					state._fsp--;

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
	}
	// $ANTLR end "stmt"



	// $ANTLR start "print_list"
	// T_semantics.g:35:1: print_list : 'print' '(' ID ')' ;
	public final void print_list() throws RecognitionException {
		Token ID1=null;

		try {
			// T_semantics.g:36:2: ( 'print' '(' ID ')' )
			// T_semantics.g:36:4: 'print' '(' ID ')'
			{
			match(input,23,FOLLOW_23_in_print_list259); 
			match(input,12,FOLLOW_12_in_print_list261); 
			ID1=(Token)match(input,ID,FOLLOW_ID_in_print_list263); 
			match(input,13,FOLLOW_13_in_print_list265); 
			 th.printList((ID1!=null?ID1.getText():null)); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "print_list"



	// $ANTLR start "type"
	// T_semantics.g:39:1: type returns [Object val] : ( INT | STRING | ID );
	public final Object type() throws RecognitionException {
		Object val = null;


		Token INT2=null;
		Token STRING3=null;
		Token ID4=null;

		try {
			// T_semantics.g:40:2: ( INT | STRING | ID )
			int alt3=3;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt3=1;
				}
				break;
			case STRING:
				{
				alt3=2;
				}
				break;
			case ID:
				{
				alt3=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// T_semantics.g:40:4: INT
					{
					INT2=(Token)match(input,INT,FOLLOW_INT_in_type283); 
					 val = (INT2!=null?INT2.getText():null);
					}
					break;
				case 2 :
					// T_semantics.g:42:4: STRING
					{
					STRING3=(Token)match(input,STRING,FOLLOW_STRING_in_type292); 
					 val = (STRING3!=null?STRING3.getText():null);
					}
					break;
				case 3 :
					// T_semantics.g:44:4: ID
					{
					ID4=(Token)match(input,ID,FOLLOW_ID_in_type302); 
					 val = (ID4!=null?ID4.getText():null); 
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
		return val;
	}
	// $ANTLR end "type"



	// $ANTLR start "list_top"
	// T_semantics.g:50:1: list_top : ID '=' list ;
	public final void list_top() throws RecognitionException {
		Token ID5=null;
		ArrayList<Object> list6 =null;

		try {
			// T_semantics.g:51:2: ( ID '=' list )
			// T_semantics.g:51:4: ID '=' list
			{
			ID5=(Token)match(input,ID,FOLLOW_ID_in_list_top319); 
			match(input,17,FOLLOW_17_in_list_top321); 
			pushFollow(FOLLOW_list_in_list_top323);
			list6=list();
			state._fsp--;

			 th.addList( (ID5!=null?ID5.getText():null), list6); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "list_top"



	// $ANTLR start "list_assign"
	// T_semantics.g:54:1: list_assign : ID '[' INT ']' '=' type ;
	public final void list_assign() throws RecognitionException {
		Token ID7=null;
		Token INT8=null;
		Object type9 =null;

		try {
			// T_semantics.g:55:2: ( ID '[' INT ']' '=' type )
			// T_semantics.g:55:4: ID '[' INT ']' '=' type
			{
			ID7=(Token)match(input,ID,FOLLOW_ID_in_list_assign338); 
			match(input,18,FOLLOW_18_in_list_assign340); 
			INT8=(Token)match(input,INT,FOLLOW_INT_in_list_assign342); 
			match(input,19,FOLLOW_19_in_list_assign344); 
			match(input,17,FOLLOW_17_in_list_assign346); 
			pushFollow(FOLLOW_type_in_list_assign348);
			type9=type();
			state._fsp--;

			 th.changeInList( (ID7!=null?ID7.getText():null) , new Integer((INT8!=null?INT8.getText():null)).intValue(), type9); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "list_assign"



	// $ANTLR start "list"
	// T_semantics.g:60:1: list returns [ArrayList<Object> lis] : '[' ( list_element )? ']' ;
	public final ArrayList<Object> list() throws RecognitionException {
		ArrayList<Object> lis = null;


		ArrayList<Object> list_element10 =null;

		try {
			// T_semantics.g:61:2: ( '[' ( list_element )? ']' )
			// T_semantics.g:61:4: '[' ( list_element )? ']'
			{
			match(input,18,FOLLOW_18_in_list368); 
			// T_semantics.g:61:8: ( list_element )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= ID && LA4_0 <= INT)||LA4_0==STRING) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// T_semantics.g:61:9: list_element
					{
					pushFollow(FOLLOW_list_element_in_list371);
					list_element10=list_element();
					state._fsp--;

					}
					break;

			}

			match(input,19,FOLLOW_19_in_list375); 
			 lis = list_element10;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lis;
	}
	// $ANTLR end "list"



	// $ANTLR start "list_element"
	// T_semantics.g:66:1: list_element returns [ArrayList<Object> lista] :x1= type ( ',' x2= type )* ;
	public final ArrayList<Object> list_element() throws RecognitionException {
		ArrayList<Object> lista = null;


		Object x1 =null;
		Object x2 =null;

		try {
			// T_semantics.g:67:2: (x1= type ( ',' x2= type )* )
			// T_semantics.g:67:4: x1= type ( ',' x2= type )*
			{
			 lista = new ArrayList<Object>();
			pushFollow(FOLLOW_type_in_list_element398);
			x1=type();
			state._fsp--;

			 th.addToList(lista, x1); 
			// T_semantics.g:67:83: ( ',' x2= type )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==15) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// T_semantics.g:67:84: ',' x2= type
					{
					match(input,15,FOLLOW_15_in_list_element403); 
					pushFollow(FOLLOW_type_in_list_element407);
					x2=type();
					state._fsp--;

					 th.addToList(lista, x2); 
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
		return lista;
	}
	// $ANTLR end "list_element"



	// $ANTLR start "list_concatenation"
	// T_semantics.g:72:1: list_concatenation : ( ID '=' v1= list '+' v2= list ( '+' v3= list )* |f0= ID '=' f1= ID '+' f2= ID ( '+' f3= ID )* );
	public final void list_concatenation() throws RecognitionException {
		Token f0=null;
		Token f1=null;
		Token f2=null;
		Token f3=null;
		Token ID11=null;
		ArrayList<Object> v1 =null;
		ArrayList<Object> v2 =null;
		ArrayList<Object> v3 =null;

		try {
			// T_semantics.g:73:2: ( ID '=' v1= list '+' v2= list ( '+' v3= list )* |f0= ID '=' f1= ID '+' f2= ID ( '+' f3= ID )* )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==ID) ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1==17) ) {
					int LA8_2 = input.LA(3);
					if ( (LA8_2==ID) ) {
						alt8=2;
					}
					else if ( (LA8_2==18) ) {
						alt8=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 8, 2, input);
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
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// T_semantics.g:73:4: ID '=' v1= list '+' v2= list ( '+' v3= list )*
					{
					ArrayList<Object> li = new ArrayList<Object>();
					ID11=(Token)match(input,ID,FOLLOW_ID_in_list_concatenation432); 
					match(input,17,FOLLOW_17_in_list_concatenation434); 
					pushFollow(FOLLOW_list_in_list_concatenation438);
					v1=list();
					state._fsp--;

					th.addToList(li, v1);
					match(input,14,FOLLOW_14_in_list_concatenation442); 
					pushFollow(FOLLOW_list_in_list_concatenation446);
					v2=list();
					state._fsp--;

					th.addToList(li, v2);
					// T_semantics.g:74:87: ( '+' v3= list )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==14) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// T_semantics.g:74:88: '+' v3= list
							{
							match(input,14,FOLLOW_14_in_list_concatenation451); 
							pushFollow(FOLLOW_list_in_list_concatenation455);
							v3=list();
							state._fsp--;

							th.addToList(li, v3);
							}
							break;

						default :
							break loop6;
						}
					}

					 th.listConcatenation( (ID11!=null?ID11.getText():null), li); 
					}
					break;
				case 2 :
					// T_semantics.g:76:4: f0= ID '=' f1= ID '+' f2= ID ( '+' f3= ID )*
					{
					ArrayList<String> arrstr = new ArrayList<String>(); 
					f0=(Token)match(input,ID,FOLLOW_ID_in_list_concatenation472); 
					match(input,17,FOLLOW_17_in_list_concatenation474); 
					f1=(Token)match(input,ID,FOLLOW_ID_in_list_concatenation478); 
					 arrstr.add((f1!=null?f1.getText():null)) ;
					match(input,14,FOLLOW_14_in_list_concatenation482); 
					f2=(Token)match(input,ID,FOLLOW_ID_in_list_concatenation486); 
					arrstr.add((f2!=null?f2.getText():null)) ;
					// T_semantics.g:76:136: ( '+' f3= ID )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==14) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// T_semantics.g:76:137: '+' f3= ID
							{
							match(input,14,FOLLOW_14_in_list_concatenation491); 
							f3=(Token)match(input,ID,FOLLOW_ID_in_list_concatenation495); 
							 arrstr.add((f3!=null?f3.getText():null));
							}
							break;

						default :
							break loop7;
						}
					}

					 th.listConcatenationByID((f0!=null?f0.getText():null), arrstr);
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
	}
	// $ANTLR end "list_concatenation"



	// $ANTLR start "list_slicing"
	// T_semantics.g:81:1: list_slicing : (i1= ID '=' i2= ID '[' t1= INT ':' t2= INT ']' |i1= ID '=' i2= ID '[' INT ':' ']' |i1= ID '=' i2= ID '[' ':' INT ']' );
	public final void list_slicing() throws RecognitionException {
		Token i1=null;
		Token i2=null;
		Token t1=null;
		Token t2=null;
		Token INT12=null;
		Token INT13=null;

		try {
			// T_semantics.g:82:2: (i1= ID '=' i2= ID '[' t1= INT ':' t2= INT ']' |i1= ID '=' i2= ID '[' INT ':' ']' |i1= ID '=' i2= ID '[' ':' INT ']' )
			int alt9=3;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==ID) ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1==17) ) {
					int LA9_2 = input.LA(3);
					if ( (LA9_2==ID) ) {
						int LA9_3 = input.LA(4);
						if ( (LA9_3==18) ) {
							int LA9_4 = input.LA(5);
							if ( (LA9_4==INT) ) {
								int LA9_5 = input.LA(6);
								if ( (LA9_5==16) ) {
									int LA9_7 = input.LA(7);
									if ( (LA9_7==INT) ) {
										alt9=1;
									}
									else if ( (LA9_7==19) ) {
										alt9=2;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 9, 7, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 9, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}
							else if ( (LA9_4==16) ) {
								alt9=3;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 9, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 9, 3, input);
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
								new NoViableAltException("", 9, 2, input);
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
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// T_semantics.g:82:4: i1= ID '=' i2= ID '[' t1= INT ':' t2= INT ']'
					{
					i1=(Token)match(input,ID,FOLLOW_ID_in_list_slicing538); 
					match(input,17,FOLLOW_17_in_list_slicing540); 
					i2=(Token)match(input,ID,FOLLOW_ID_in_list_slicing544); 
					match(input,18,FOLLOW_18_in_list_slicing546); 
					t1=(Token)match(input,INT,FOLLOW_INT_in_list_slicing550); 
					match(input,16,FOLLOW_16_in_list_slicing552); 
					t2=(Token)match(input,INT,FOLLOW_INT_in_list_slicing556); 
					match(input,19,FOLLOW_19_in_list_slicing558); 
					 th.slicing( (i1!=null?i1.getText():null), (i2!=null?i2.getText():null) , new Integer((t1!=null?t1.getText():null)).intValue() , new Integer((t2!=null?t2.getText():null)).intValue()); 
					}
					break;
				case 2 :
					// T_semantics.g:83:4: i1= ID '=' i2= ID '[' INT ':' ']'
					{
					i1=(Token)match(input,ID,FOLLOW_ID_in_list_slicing568); 
					match(input,17,FOLLOW_17_in_list_slicing570); 
					i2=(Token)match(input,ID,FOLLOW_ID_in_list_slicing574); 
					match(input,18,FOLLOW_18_in_list_slicing576); 
					INT12=(Token)match(input,INT,FOLLOW_INT_in_list_slicing578); 
					match(input,16,FOLLOW_16_in_list_slicing580); 
					match(input,19,FOLLOW_19_in_list_slicing582); 
					 th.slicingTotheEnd((i1!=null?i1.getText():null), (i2!=null?i2.getText():null), new Integer((INT12!=null?INT12.getText():null)).intValue());
					}
					break;
				case 3 :
					// T_semantics.g:84:4: i1= ID '=' i2= ID '[' ':' INT ']'
					{
					i1=(Token)match(input,ID,FOLLOW_ID_in_list_slicing592); 
					match(input,17,FOLLOW_17_in_list_slicing594); 
					i2=(Token)match(input,ID,FOLLOW_ID_in_list_slicing598); 
					match(input,18,FOLLOW_18_in_list_slicing600); 
					match(input,16,FOLLOW_16_in_list_slicing602); 
					INT13=(Token)match(input,INT,FOLLOW_INT_in_list_slicing604); 
					match(input,19,FOLLOW_19_in_list_slicing606); 
					 th.slicing( (i1!=null?i1.getText():null), (i2!=null?i2.getText():null), 0, new Integer((INT13!=null?INT13.getText():null)).intValue() );
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
	}
	// $ANTLR end "list_slicing"



	// $ANTLR start "simplified"
	// T_semantics.g:89:1: simplified : tt1= ID '=' '[' 'for' x1= ID 'in' tt2= ID 'if' condition[$tt2.text, $x1.text] ']' ;
	public final void simplified() throws RecognitionException {
		Token tt1=null;
		Token x1=null;
		Token tt2=null;
		ArrayList<Boolean> condition14 =null;

		try {
			// T_semantics.g:90:2: (tt1= ID '=' '[' 'for' x1= ID 'in' tt2= ID 'if' condition[$tt2.text, $x1.text] ']' )
			// T_semantics.g:90:4: tt1= ID '=' '[' 'for' x1= ID 'in' tt2= ID 'if' condition[$tt2.text, $x1.text] ']'
			{
			tt1=(Token)match(input,ID,FOLLOW_ID_in_simplified632); 
			match(input,17,FOLLOW_17_in_simplified634); 
			match(input,18,FOLLOW_18_in_simplified636); 
			match(input,20,FOLLOW_20_in_simplified638); 
			x1=(Token)match(input,ID,FOLLOW_ID_in_simplified642); 
			match(input,22,FOLLOW_22_in_simplified644); 
			tt2=(Token)match(input,ID,FOLLOW_ID_in_simplified648); 
			match(input,21,FOLLOW_21_in_simplified650); 
			pushFollow(FOLLOW_condition_in_simplified652);
			condition14=condition((tt2!=null?tt2.getText():null), (x1!=null?x1.getText():null));
			state._fsp--;

			match(input,19,FOLLOW_19_in_simplified655); 
			th.listComprehension((tt1!=null?tt1.getText():null), (tt2!=null?tt2.getText():null), condition14);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "simplified"



	// $ANTLR start "condition"
	// T_semantics.g:95:1: condition[String listt, String x] returns [ArrayList<Boolean> result] : ( '(' c1= condition[$listt, $x] ANDOR c2= condition[$listt, $x] ')' | NOT c3= condition[$listt, $x] | '(' o1= operand OP o2= operand ')' );
	public final ArrayList<Boolean> condition(String listt, String x) throws RecognitionException {
		ArrayList<Boolean> result = null;


		Token ANDOR15=null;
		Token NOT16=null;
		Token OP17=null;
		ArrayList<Boolean> c1 =null;
		ArrayList<Boolean> c2 =null;
		ArrayList<Boolean> c3 =null;
		Object o1 =null;
		Object o2 =null;

		try {
			// T_semantics.g:96:2: ( '(' c1= condition[$listt, $x] ANDOR c2= condition[$listt, $x] ')' | NOT c3= condition[$listt, $x] | '(' o1= operand OP o2= operand ')' )
			int alt10=3;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==12) ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1==NOT||LA10_1==12) ) {
					alt10=1;
				}
				else if ( ((LA10_1 >= ID && LA10_1 <= INT)) ) {
					alt10=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA10_0==NOT) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// T_semantics.g:96:4: '(' c1= condition[$listt, $x] ANDOR c2= condition[$listt, $x] ')'
					{
					match(input,12,FOLLOW_12_in_condition675); 
					pushFollow(FOLLOW_condition_in_condition679);
					c1=condition(listt, x);
					state._fsp--;

					ANDOR15=(Token)match(input,ANDOR,FOLLOW_ANDOR_in_condition682); 
					pushFollow(FOLLOW_condition_in_condition686);
					c2=condition(listt, x);
					state._fsp--;

					match(input,13,FOLLOW_13_in_condition689); 
					result = th.evaluateAndOr(c1, c2, (ANDOR15!=null?ANDOR15.getText():null));
					}
					break;
				case 2 :
					// T_semantics.g:98:5: NOT c3= condition[$listt, $x]
					{
					NOT16=(Token)match(input,NOT,FOLLOW_NOT_in_condition699); 
					pushFollow(FOLLOW_condition_in_condition703);
					c3=condition(listt, x);
					state._fsp--;

					result = th.evaluateNot(c3, (NOT16!=null?NOT16.getText():null));
					}
					break;
				case 3 :
					// T_semantics.g:100:4: '(' o1= operand OP o2= operand ')'
					{
					match(input,12,FOLLOW_12_in_condition712); 
					pushFollow(FOLLOW_operand_in_condition716);
					o1=operand();
					state._fsp--;

					OP17=(Token)match(input,OP,FOLLOW_OP_in_condition718); 
					pushFollow(FOLLOW_operand_in_condition722);
					o2=operand();
					state._fsp--;

					match(input,13,FOLLOW_13_in_condition724); 
					result = th.comparison(listt, o1.toString(), o2.toString(), (OP17!=null?OP17.getText():null), x);
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
		return result;
	}
	// $ANTLR end "condition"



	// $ANTLR start "operand"
	// T_semantics.g:105:1: operand returns [Object val] : ( ID | INT );
	public final Object operand() throws RecognitionException {
		Object val = null;


		Token ID18=null;
		Token INT19=null;

		try {
			// T_semantics.g:106:2: ( ID | INT )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ID) ) {
				alt11=1;
			}
			else if ( (LA11_0==INT) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// T_semantics.g:106:4: ID
					{
					ID18=(Token)match(input,ID,FOLLOW_ID_in_operand760); 
					val = new String((ID18!=null?ID18.getText():null));
					}
					break;
				case 2 :
					// T_semantics.g:107:4: INT
					{
					INT19=(Token)match(input,INT,FOLLOW_INT_in_operand768); 
					val = new Integer((INT19!=null?INT19.getText():null));
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
		return val;
	}
	// $ANTLR end "operand"

	// Delegated rules


	protected DFA2 dfa2 = new DFA2(this);
	static final String DFA2_eotS =
		"\23\uffff";
	static final String DFA2_eofS =
		"\15\uffff\1\17\5\uffff";
	static final String DFA2_minS =
		"\1\6\1\21\1\uffff\1\6\1\uffff\1\16\1\6\3\uffff\3\17\2\6\1\uffff\3\17";
	static final String DFA2_maxS =
		"\1\27\1\22\1\uffff\1\22\1\uffff\1\22\1\24\3\uffff\3\23\1\27\1\12\1\uffff"+
		"\3\23";
	static final String DFA2_acceptS =
		"\2\uffff\1\5\1\uffff\1\6\2\uffff\1\3\1\2\1\4\5\uffff\1\1\3\uffff";
	static final String DFA2_specialS =
		"\23\uffff}>";
	static final String[] DFA2_transitionS = {
			"\1\1\20\uffff\1\2",
			"\1\3\1\4",
			"",
			"\1\5\13\uffff\1\6",
			"",
			"\1\10\3\uffff\1\7",
			"\1\14\1\12\2\uffff\1\13\10\uffff\1\15\1\11",
			"",
			"",
			"",
			"\1\16\3\uffff\1\15",
			"\1\16\3\uffff\1\15",
			"\1\16\3\uffff\1\15",
			"\1\17\7\uffff\1\10\10\uffff\1\17",
			"\1\22\1\20\2\uffff\1\21",
			"",
			"\1\16\3\uffff\1\15",
			"\1\16\3\uffff\1\15",
			"\1\16\3\uffff\1\15"
	};

	static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
	static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
	static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
	static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
	static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
	static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
	static final short[][] DFA2_transition;

	static {
		int numStates = DFA2_transitionS.length;
		DFA2_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
		}
	}

	protected class DFA2 extends DFA {

		public DFA2(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 2;
			this.eot = DFA2_eot;
			this.eof = DFA2_eof;
			this.min = DFA2_min;
			this.max = DFA2_max;
			this.accept = DFA2_accept;
			this.special = DFA2_special;
			this.transition = DFA2_transition;
		}
		@Override
		public String getDescription() {
			return "25:1: stmt : ( list_top | list_concatenation | list_slicing | simplified | print_list | list_assign );";
		}
	}

	public static final BitSet FOLLOW_stmt_in_prog211 = new BitSet(new long[]{0x0000000000800042L});
	public static final BitSet FOLLOW_list_top_in_stmt222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_concatenation_in_stmt227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_slicing_in_stmt232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simplified_in_stmt237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_list_in_stmt242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_assign_in_stmt247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_print_list259 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_print_list261 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_print_list263 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_print_list265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_type292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_type302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_list_top319 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_list_top321 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_list_in_list_top323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_list_assign338 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_list_assign340 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_INT_in_list_assign342 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_list_assign344 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_list_assign346 = new BitSet(new long[]{0x00000000000004C0L});
	public static final BitSet FOLLOW_type_in_list_assign348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_list368 = new BitSet(new long[]{0x00000000000804C0L});
	public static final BitSet FOLLOW_list_element_in_list371 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_list375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_list_element398 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_15_in_list_element403 = new BitSet(new long[]{0x00000000000004C0L});
	public static final BitSet FOLLOW_type_in_list_element407 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_ID_in_list_concatenation432 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_list_concatenation434 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_list_in_list_concatenation438 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_list_concatenation442 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_list_in_list_concatenation446 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_14_in_list_concatenation451 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_list_in_list_concatenation455 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_ID_in_list_concatenation472 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_list_concatenation474 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_list_concatenation478 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_list_concatenation482 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_list_concatenation486 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_14_in_list_concatenation491 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_list_concatenation495 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_ID_in_list_slicing538 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_list_slicing540 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_list_slicing544 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_list_slicing546 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_INT_in_list_slicing550 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_list_slicing552 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_INT_in_list_slicing556 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_list_slicing558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_list_slicing568 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_list_slicing570 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_list_slicing574 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_list_slicing576 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_INT_in_list_slicing578 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_list_slicing580 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_list_slicing582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_list_slicing592 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_list_slicing594 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_list_slicing598 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_list_slicing600 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_list_slicing602 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_INT_in_list_slicing604 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_list_slicing606 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_simplified632 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_simplified634 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_simplified636 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_simplified638 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_simplified642 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_simplified644 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_simplified648 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_simplified650 = new BitSet(new long[]{0x0000000000001100L});
	public static final BitSet FOLLOW_condition_in_simplified652 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_simplified655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_condition675 = new BitSet(new long[]{0x0000000000001100L});
	public static final BitSet FOLLOW_condition_in_condition679 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANDOR_in_condition682 = new BitSet(new long[]{0x0000000000001100L});
	public static final BitSet FOLLOW_condition_in_condition686 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_condition689 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_condition699 = new BitSet(new long[]{0x0000000000001100L});
	public static final BitSet FOLLOW_condition_in_condition703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_condition712 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_operand_in_condition716 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_OP_in_condition718 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_operand_in_condition722 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_condition724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_operand760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_operand768 = new BitSet(new long[]{0x0000000000000002L});
}
