grammar T_semantics;


@members {
	THelper th = new THelper();
}


ANDOR : ('and'|'or');
NOT : 'not';
INT : ('-')? ('0'..'9')+  ; 
ID : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')* ;
STRING : ('\'') ('a'..'z'|'A'..'Z'|'0'..'9') ('a'..'z'|'A'..'Z'|'0'..'9')* ('\'') ;  // string can be anything excluding the 'and' and 'or'     
OP : '==' | '!=' | '<' | '<=' | '>' | '>=';


// consume whitespace
WS  :   (' '|'\t'|'\n'|'\r')+ {skip();} ;

// consume comments
COMMENTS  :   ('//')~('\n'|'\r')* {skip();} ; 

prog : (stmt)+;

stmt
	: list_top
	| list_concatenation
	| list_slicing
	| simplified
	| print_list
	| list_assign
	;


print_list
	: 'print' '(' ID ')'  { th.printList($ID.text); }
	;

type returns [Object val]
	: INT 
	{ $val = $INT.text;}
	| STRING  
	{ $val = $STRING.text;}
	| ID
	{ $val = $ID.text; }
	;


// takes the elements of the list form 'list'
list_top 
	: ID '=' list  { th.addList( $ID.text, $list.lis); }
	;

list_assign 
	: ID '[' INT ']' '=' type  { th.changeInList( $ID.text , new Integer($INT.text).intValue(), $type.val); }
	;


// returns lista to list_top so it can be used in function addList
list returns [ArrayList<Object> lis]
	: '[' (list_element)? ']' { $lis = $list_element.lista;}
	;


// takes Array list lista from 'list' to add elements to it
list_element returns [ArrayList<Object> lista]
	: { $lista = new ArrayList<Object>();} x1=type { th.addToList(lista, $x1.val); } (',' x2=type { th.addToList(lista, $x2.val); } )*  
	;


// either concatenate 2 lists or more
list_concatenation 
	: {ArrayList<Object> li = new ArrayList<Object>();} 
	ID '=' v1=list {th.addToList(li, $v1.lis);} '+' v2=list {th.addToList(li, $v2.lis);} ('+' v3=list {th.addToList(li, $v3.lis);})* 
	{ th.listConcatenation( $ID.text, li); }
	| {ArrayList<String> arrstr = new ArrayList<String>(); } f0=ID '=' f1=ID { arrstr.add($f1.text) ;} '+' f2=ID {arrstr.add($f2.text) ;} ('+' f3=ID { arrstr.add($f3.text);})* 
	{ th.listConcatenationByID($f0.text, arrstr);} 
	;                			


list_slicing 
	: i1=ID '=' i2=ID '[' t1=INT ':' t2=INT ']'  { th.slicing( $i1.text, $i2.text , new Integer($t1.text).intValue() , new Integer($t2.text).intValue()); }
	| i1=ID '=' i2=ID '[' INT ':' ']'  { th.slicingTotheEnd($i1.text, $i2.text, new Integer($INT.text).intValue());}
	| i1=ID '=' i2=ID '[' ':' INT ']' { th.slicing( $i1.text, $i2.text, 0, new Integer($INT.text).intValue() );}
	; 					  // slice from one index to the other, index to end, begenning to index.



simplified 
	: tt1=ID '=' '[' 'for' x1=ID 'in' tt2=ID 'if' condition[$tt2.text, $x1.text] ']' {th.listComprehension($tt1.text, $tt2.text, $condition.result);}
	;



condition[String listt, String x] returns [ArrayList<Boolean> result]
	: '(' c1=condition[$listt, $x] ANDOR c2=condition[$listt, $x] ')' 
	{$result = th.evaluateAndOr($c1.result, $c2.result, $ANDOR.text);}
	|  NOT c3=condition[$listt, $x]
	{$result = th.evaluateNot($c3.result, $NOT.text);}
	| '(' o1=operand OP o2=operand ')' 
	{$result = th.comparison($listt, $o1.val.toString(), $o2.val.toString(), $OP.text, $x);}
	;			             


operand returns [Object val]
	: ID		{$val = new String($ID.text);}
	| INT 		{$val = new Integer($INT.text);}
	;



