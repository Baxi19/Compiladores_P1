//-------------------------------------------------------------------------------------------------------------------
//                                    Parser
parser grammar MonkeyParser;

options {
    tokenVocab = MonkeyScanner;
}

//-------------------------------------------------------------------------------------------------------------------
//                               Grammar for Monkey Language
//-------------------------------------------------------------------------------------------------------------------
program  	                    : statement*                                                                            #program_AST;

//-------------------------------------------------------------------------------------------------------------------
statement  	                    : LET letStatement                                                                      #statement_LetAST
                                | RETURN returnStatement                                                                #statement_returnAST
                                | expressionStatement                                                                   #callExpressionStatementAST;

//-------------------------------------------------------------------------------------------------------------------
letStatement                    : IDENT ASSIGN expression (PYCOMMA | )                                                  #letStatement_AST;

//-------------------------------------------------------------------------------------------------------------------
returnStatement	                : expression (PYCOMMA | )                                                               #returnStatement_AST;

//-------------------------------------------------------------------------------------------------------------------
expressionStatement             : expression (PYCOMMA | )                                                               #expressionStatement_AST;

//-------------------------------------------------------------------------------------------------------------------
expression                      : additionExpression comparison                                                         #expression_AST;

//-------------------------------------------------------------------------------------------------------------------
comparison                      : ((LT|GT|LE|GE|EQUAL) additionExpression)*                                             #comparison_AST;

//-------------------------------------------------------------------------------------------------------------------
additionExpression	            : multiplicationExpression additionFactor                                               #additionExpression_AST;

//-------------------------------------------------------------------------------------------------------------------
additionFactor                  : ((ADD|SUB) multiplicationExpression)*                                                 #additionFactor_AST;

//-------------------------------------------------------------------------------------------------------------------
multiplicationExpression        : elementExpression multiplicationFactor                                                #multiplicationExpression_AST;

//-------------------------------------------------------------------------------------------------------------------
multiplicationFactor            : ((MUL|DIV) elementExpression)*                                                        #multiplicationFactor_AST;

//-------------------------------------------------------------------------------------------------------------------
elementExpression               : primitiveExpression (elementAccess | callExpression | )                               #elementExpression_AST;

//-------------------------------------------------------------------------------------------------------------------
//[...]
elementAccess                   : L_BRACK expression R_BRACK                                                            #elementAccess_AST;

//-------------------------------------------------------------------------------------------------------------------
//(...)
callExpression	                : L_PAREN expressionList R_PAREN                                                        #callExpression_AST;

//-------------------------------------------------------------------------------------------------------------------
primitiveExpression	            : NUMBER                                                                                #primitiveExpression_numberAST
                                | STRING                                                                                #primitiveExpression_stringAST
                                | IDENT                                                                                 #primitiveExpression_identAST
                                | TRUE                                                                                  #primitiveExpression_trueAST
                                | FALSE                                                                                 #primitiveExpression_falseAST
                                | L_PAREN expression R_PAREN                                                            #primitiveExpression_expressionAST
                                | arrayLiteral                                                                          #primitiveExpression_literalAST
                                | arrayFunctions L_PAREN expressionList R_PAREN                                         #primitiveExpression_ArrayFunctionsAST
                                | functionLiteral                                                                       #primitiveExpression_FunctionLiteral_AST
                                | hashLiteral                                                                           #primitiveExpression_HashLiteral_AST
                                | printExpression                                                                       #primitiveExpression_PrintExpressionAST
                                | ifExpression                                                                          #primitiveExpression_IfExpression;

//-------------------------------------------------------------------------------------------------------------------
arrayFunctions	                : LEN                                                                                   #arrayFunctions_lenAST
                                | FIRST                                                                                 #arrayFunctions_firstAST
                                | LAST                                                                                  #arrayFunctions_lastAST
                                | REST                                                                                  #arrayFunctions_restAST
                                | PUSH                                                                                  #arrayFunctions_pushAST;

//-------------------------------------------------------------------------------------------------------------------
//[...]
arrayLiteral                    : L_BRACK expressionList R_BRACK                                                        #arrayLiteral_AST;

//-------------------------------------------------------------------------------------------------------------------
//fn (...){...}
functionLiteral	                : FN L_PAREN functionParameters R_PAREN blockStatement                                  #functionLiteral_AST;

//-------------------------------------------------------------------------------------------------------------------
//
functionParameters	            : IDENT moreIdentifiers                                                                 #functionParameters_AST;

//-------------------------------------------------------------------------------------------------------------------
moreIdentifiers	                : (COMMA IDENT)*                                                                        #moreIdentifiers_AST;

//-------------------------------------------------------------------------------------------------------------------
//{...}
hashLiteral		                : L_BRACE hashContent moreHashContent R_BRACE                                           #hashLiteral_AST;

//-------------------------------------------------------------------------------------------------------------------
//
hashContent	                    : expression COLON expression                                                           #hashContent_AST;

//-------------------------------------------------------------------------------------------------------------------

moreHashContent	                : (COMMA hashContent)*                                                                  #moreHashContent_AST;

//-------------------------------------------------------------------------------------------------------------------
expressionList                  : expression moreExpressions                                                            #expressionList_expressionAST
                                |                                                                                       #expressionList_nullAST
                                ;

//-------------------------------------------------------------------------------------------------------------------
moreExpressions                 : (COMMA expression)*                                                                   #moreExpressions_AST;

//-------------------------------------------------------------------------------------------------------------------
//puts ( ... )
printExpression                 : PUTS L_PAREN expression R_PAREN                                                       #printExpression_AST;

//-------------------------------------------------------------------------------------------------------------------
//if
ifExpression	                : IF expression blockStatement (ELSE blockStatement| )                                  #ifExpression_AST;

//-------------------------------------------------------------------------------------------------------------------
//{ ... }
blockStatement	                : L_BRACE statement* R_BRACE                                                            #blockStatement_AST;

//-------------------------------------------------------------------------------------------------------------------

