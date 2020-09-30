//-------------------------------------------------------------------------------------------------------------------
//                                    Parser
parser grammar MonkeyParser;

options {
    tokenVocab = MonkeyGrammar;
}

//-------------------------------------------------------------------------------------------------------------------
//                               Grammar for Monkey Language
//-------------------------------------------------------------------------------------------------------------------
program  	                    : statement*                                                                            #program_StatementAST;

//-------------------------------------------------------------------------------------------------------------------
statement  	                    : LET letStatement                                                                      #statement_let_LetStatementAST
                                | RETURN returnStatement                                                                #statement_return_ReturnStatementAST
                                | expressionStatement                                                                   #statement_ExpressionStatementAST;

//-------------------------------------------------------------------------------------------------------------------
letStatement                    : IDENT ASSIGN expression PYCOMMA ?                                                     #letStatement_ident_assing_Expression_pycommaAST;

//-------------------------------------------------------------------------------------------------------------------
returnStatement	                : expression PYCOMMA ?                                                                  #returnStatement_Expression_pycommaAST;

//-------------------------------------------------------------------------------------------------------------------
expressionStatement             : expression PYCOMMA ?                                                                  #expressionStatement_Expression_pycommaAST;

//-------------------------------------------------------------------------------------------------------------------
expression                      : additionExpression comparison                                                         #expression_AdditionExpression_ComparisonAST;

//-------------------------------------------------------------------------------------------------------------------
comparison                      : ((LT|GT|LE|GE|EQUAL) additionExpression)*                                             #comparison_simbols_AdditionExpressionAST;

//-------------------------------------------------------------------------------------------------------------------
additionExpression	            : multiplicationExpression additionFactor                                               #additionExpression_MultiplicationExpression_AdditionFactorAST;

//-------------------------------------------------------------------------------------------------------------------
additionFactor                  : ((ADD|SUB) multiplicationExpression)*                                                 #additionFactor_add_v_sub_MultiplicationExpressionAST;

//-------------------------------------------------------------------------------------------------------------------
multiplicationExpression        : elementExpression multiplicationFactor                                                #multiplicationExpression_ElementExpression_MultiplicationFactorAST;

//-------------------------------------------------------------------------------------------------------------------
multiplicationFactor            : ((MUL|DIV) elementExpression)*                                                        #multiplicationFactor_mul_v_div_ElementExpressionAST;

//-------------------------------------------------------------------------------------------------------------------
elementExpression               : primitiveExpression (elementAccess | callExpression) ?                                #elementExpression_PrimitiveExpression_ElementAccess_v_CallExpressionAST;

//-------------------------------------------------------------------------------------------------------------------
elementAccess                   : L_BRACK expression R_BRACK                                                            ;

//-------------------------------------------------------------------------------------------------------------------
callExpression	                : L_PAREN expressionList R_PAREN;

//-------------------------------------------------------------------------------------------------------------------
primitiveExpression	            : NUMBER
                                | STRING
                                | IDENT
                                | TRUE
                                | FALSE
                                | L_PAREN expression R_PAREN
                                | arrayLiteral
                                | arrayFunctions L_PAREN expressionList R_PAREN
                                | functionLiteral
                                | hashLiteral
                                | printExpression
                                | ifExpression;

//-------------------------------------------------------------------------------------------------------------------
arrayFunctions	                : LEN
                                | FIRST
                                | LAST
                                | REST
                                | PUSH;

//-------------------------------------------------------------------------------------------------------------------
arrayLiteral                    : L_BRACK expressionList R_BRACK;

//-------------------------------------------------------------------------------------------------------------------
functionLiteral	                : FN L_PAREN functionParameters R_PAREN blockStatement;

//-------------------------------------------------------------------------------------------------------------------
functionParameters	            : IDENT moreIdentifiers;

//-------------------------------------------------------------------------------------------------------------------
moreIdentifiers	                : (COMMA IDENT)*;

//-------------------------------------------------------------------------------------------------------------------
hashLiteral		                : L_BRACE hashContent moreHashContent R_BRACE;

//-------------------------------------------------------------------------------------------------------------------
hashContent	                    : expression COLON expression;

//-------------------------------------------------------------------------------------------------------------------
moreHashContent	                : (COMMA hashContent)*;

//-------------------------------------------------------------------------------------------------------------------
expressionList                  : expression moreExpressions | ;

//-------------------------------------------------------------------------------------------------------------------
moreExpressions                 : (COMMA expression)*;

//-------------------------------------------------------------------------------------------------------------------
printExpression                 : PUTS L_PAREN expression R_PAREN;

//-------------------------------------------------------------------------------------------------------------------
ifExpression	                : IF expression blockStatement (ELSE blockStatement) ?;

//-------------------------------------------------------------------------------------------------------------------
blockStatement	                : L_BRACE statement* R_BRACE;

//-------------------------------------------------------------------------------------------------------------------

