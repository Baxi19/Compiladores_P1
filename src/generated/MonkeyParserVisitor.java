// Generated from C:/Users/Baxi/Desktop/Compiladores_P1\MonkeyParser.g4 by ANTLR 4.8
package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MonkeyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MonkeyParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code program_AST}
	 * labeled alternative in {@link MonkeyParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_AST(MonkeyParser.Program_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statement_LetAST}
	 * labeled alternative in {@link MonkeyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_LetAST(MonkeyParser.Statement_LetASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statement_returnAST}
	 * labeled alternative in {@link MonkeyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_returnAST(MonkeyParser.Statement_returnASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callExpressionStatementAST}
	 * labeled alternative in {@link MonkeyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpressionStatementAST(MonkeyParser.CallExpressionStatementASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letStatement_AST}
	 * labeled alternative in {@link MonkeyParser#letStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetStatement_AST(MonkeyParser.LetStatement_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatement_AST}
	 * labeled alternative in {@link MonkeyParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement_AST(MonkeyParser.ReturnStatement_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionStatement_AST}
	 * labeled alternative in {@link MonkeyParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement_AST(MonkeyParser.ExpressionStatement_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_AST}
	 * labeled alternative in {@link MonkeyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_AST(MonkeyParser.Expression_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison_AST}
	 * labeled alternative in {@link MonkeyParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_AST(MonkeyParser.Comparison_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additionExpression_AST}
	 * labeled alternative in {@link MonkeyParser#additionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionExpression_AST(MonkeyParser.AdditionExpression_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additionFactor_AST}
	 * labeled alternative in {@link MonkeyParser#additionFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionFactor_AST(MonkeyParser.AdditionFactor_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpression_AST}
	 * labeled alternative in {@link MonkeyParser#multiplicationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpression_AST(MonkeyParser.MultiplicationExpression_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationFactor_AST}
	 * labeled alternative in {@link MonkeyParser#multiplicationFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationFactor_AST(MonkeyParser.MultiplicationFactor_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementExpression_AST}
	 * labeled alternative in {@link MonkeyParser#elementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementExpression_AST(MonkeyParser.ElementExpression_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementAccess_AST}
	 * labeled alternative in {@link MonkeyParser#elementAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementAccess_AST(MonkeyParser.ElementAccess_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callExpression_AST}
	 * labeled alternative in {@link MonkeyParser#callExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpression_AST(MonkeyParser.CallExpression_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpression_numberAST}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpression_numberAST(MonkeyParser.PrimitiveExpression_numberASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpression_stringAST}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpression_stringAST(MonkeyParser.PrimitiveExpression_stringASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpression_identAST}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpression_identAST(MonkeyParser.PrimitiveExpression_identASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpression_trueAST}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpression_trueAST(MonkeyParser.PrimitiveExpression_trueASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpression_falseAST}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpression_falseAST(MonkeyParser.PrimitiveExpression_falseASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpression_expressionAST}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpression_expressionAST(MonkeyParser.PrimitiveExpression_expressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpression_literalAST}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpression_literalAST(MonkeyParser.PrimitiveExpression_literalASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpression_ArrayFunctionsAST}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpression_ArrayFunctionsAST(MonkeyParser.PrimitiveExpression_ArrayFunctionsASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpression_FunctionLiteral_AST}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpression_FunctionLiteral_AST(MonkeyParser.PrimitiveExpression_FunctionLiteral_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpression_HashLiteral_AST}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpression_HashLiteral_AST(MonkeyParser.PrimitiveExpression_HashLiteral_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpression_PrintExpressionAST}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpression_PrintExpressionAST(MonkeyParser.PrimitiveExpression_PrintExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpression_IfExpression}
	 * labeled alternative in {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpression_IfExpression(MonkeyParser.PrimitiveExpression_IfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayFunctions_lenAST}
	 * labeled alternative in {@link MonkeyParser#arrayFunctions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayFunctions_lenAST(MonkeyParser.ArrayFunctions_lenASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayFunctions_firstAST}
	 * labeled alternative in {@link MonkeyParser#arrayFunctions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayFunctions_firstAST(MonkeyParser.ArrayFunctions_firstASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayFunctions_lastAST}
	 * labeled alternative in {@link MonkeyParser#arrayFunctions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayFunctions_lastAST(MonkeyParser.ArrayFunctions_lastASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayFunctions_restAST}
	 * labeled alternative in {@link MonkeyParser#arrayFunctions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayFunctions_restAST(MonkeyParser.ArrayFunctions_restASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayFunctions_pushAST}
	 * labeled alternative in {@link MonkeyParser#arrayFunctions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayFunctions_pushAST(MonkeyParser.ArrayFunctions_pushASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLiteral_AST}
	 * labeled alternative in {@link MonkeyParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral_AST(MonkeyParser.ArrayLiteral_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionLiteral_AST}
	 * labeled alternative in {@link MonkeyParser#functionLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionLiteral_AST(MonkeyParser.FunctionLiteral_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionParameters_AST}
	 * labeled alternative in {@link MonkeyParser#functionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameters_AST(MonkeyParser.FunctionParameters_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moreIdentifiers_AST}
	 * labeled alternative in {@link MonkeyParser#moreIdentifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreIdentifiers_AST(MonkeyParser.MoreIdentifiers_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hashLiteral_AST}
	 * labeled alternative in {@link MonkeyParser#hashLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashLiteral_AST(MonkeyParser.HashLiteral_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hashContent_AST}
	 * labeled alternative in {@link MonkeyParser#hashContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashContent_AST(MonkeyParser.HashContent_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moreHashContent_AST}
	 * labeled alternative in {@link MonkeyParser#moreHashContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreHashContent_AST(MonkeyParser.MoreHashContent_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionList_expressionAST}
	 * labeled alternative in {@link MonkeyParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList_expressionAST(MonkeyParser.ExpressionList_expressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionList_nullAST}
	 * labeled alternative in {@link MonkeyParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList_nullAST(MonkeyParser.ExpressionList_nullASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moreExpressions_AST}
	 * labeled alternative in {@link MonkeyParser#moreExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreExpressions_AST(MonkeyParser.MoreExpressions_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpression_AST}
	 * labeled alternative in {@link MonkeyParser#printExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpression_AST(MonkeyParser.PrintExpression_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifExpression_AST}
	 * labeled alternative in {@link MonkeyParser#ifExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpression_AST(MonkeyParser.IfExpression_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStatement_AST}
	 * labeled alternative in {@link MonkeyParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement_AST(MonkeyParser.BlockStatement_ASTContext ctx);
}