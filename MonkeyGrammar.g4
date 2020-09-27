//-------------------------------------------------------------------------------------------------------------------
//                                      Lexer Rules
lexer grammar MonkeyGrammar;
//-------------------------------------------------------------------------------------------------------------------



//-------------------------------------------------------------------------------------------------------------------
//Reserved words
//-------------------------------------------------------------------------------------------------------------------
LET     : 'let';
RETURN  : 'return';
FN      :'fn';
PUTS    :'puts';
IF      :'if';
ELSE    :'else';

//Arrays Funtions
LEN     : 'len';
FIRST   : 'first';
LAST    : 'last';
REST    : 'rest';
PUSH    : 'push';

//Types
INTEGER : 'Integer';
STRING  : 'String';
TRUE    : 'true';
FALSE   : 'false';

//-------------------------------------------------------------------------------------------------------------------*/
//Literals
//-------------------------------------------------------------------------------------------------------------------*/
//-------------------------------------------------------------------------------------------------------------------
//  Boolean Literals
BooleanLiteral
	:	'true'
	|	'false'
	;

//-------------------------------------------------------------------------------------------------------------------
// Separators
//-------------------------------------------------------------------------------------------------------------------
L_PAREN : '(';
R_PAREN : ')';
L_BRACE : '{';
R_BRACE : '}';
L_BRACK : '[';
R_BRACK : ']';
PYCOMMA : ';';
COMMA   : ',';
DOT     : '.';
COLON   : ':';



//-------------------------------------------------------------------------------------------------------------------
//  Identifiers (must appear after all keywords in the grammar)
//-------------------------------------------------------------------------------------------------------------------
Number : [0-9]+;

String : '"' (~["])+ '"';

Identifier
	:	[a-z]([a-zA-Z]|[0-9]|'_')*//IdentifierStart IdentifierPart*
	;



//-------------------------------------------------------------------------------------------------------------------
//  Operators
//-------------------------------------------------------------------------------------------------------------------
ASSIGN : '=';
GT : '>';
LT : '<';
LE : '<=';
GE : '>=';
EQUAL : '==';
//NOTEQUAL : '!=';

//basics
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';


//-------------------------------------------------------------------------------------------------------------------
// Skiped Reg Exp
//-------------------------------------------------------------------------------------------------------------------
WS : [ \r\t\n]+ -> skip ;
COMMENT : '//' ~[\r\n]* '\r'? '\n' -> skip ;
BLOCK_COMMENT : '/*' .*? '*/' -> skip;