parser grammar MonkeyParser;

options {
    tokenVocab = MonkeyGrammar;
}


program  	: statement*;

statement  	: LET letStatement
            | RETURN returnStatement
            | expressionStatement;

letStatement : Identifier EQUAL expression (PYCOMMA | );

returnStatement	: expression (PYCOMMA | );

expressionStatement 	: expression ( PYCOMMA | );

expression             	: additionExpression comparison;

comparison            	: ((LT|GT|LE|GE|EQUAL) additionExpression)*;

additionExpression	: multiplicationExpression additionFactor;

additionFactor      : ((ADD|SUB) multiplicationExpression)*;

multiplicationExpression : elementExpression multiplicationFactor;

multiplicationFactor	: ((MUL|DIV) elementExpression)*;

elementExpression 	: primitiveExpression (elementAccess | callExpression | );

elementAccess       	: L_BRACK expression R_BRACK;

callExpression	: L_PAREN expressionList R_PAREN;

primitiveExpression	: Number
                    | String
                    | Identifier
                    | TRUE
                    | FALSE
                    | L_PAREN expression R_PAREN
                    | arrayLiteral
                    | arrayFunctions L_PAREN expressionList R_PAREN
                    | functionLiteral
                    | hashLiteral
                    | printExpression
                    | ifExpression;


arrayFunctions	:   LEN
                    | FIRST
                    | LAST
                    | REST
                    | PUSH;

arrayLiteral    : L_BRACK expressionList R_BRACK;

functionLiteral	: FN L_PAREN functionParameters R_PAREN blockStatement;

functionParameters	: Identifier moreIdentifiers;

moreIdentifiers	: (COMMA Identifier)*;

hashLiteral		: L_BRACE hashContent moreHashContent R_BRACE;

hashContent	: expression COLON expression;

moreHashContent	: (COMMA hashContent)*;

expressionList  : expression moreExpressions | ;

moreExpressions  : (COMMA expression)*;

printExpression  : PUTS L_PAREN expression R_PAREN;

ifExpression	: IF expression blockStatement (ELSE blockStatement | );

blockStatement	: L_BRACE statement* R_BRACE;


