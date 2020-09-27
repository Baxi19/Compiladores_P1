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
	 * Visit a parse tree produced by {@link MonkeyParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MonkeyParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MonkeyParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyParser#letStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetStatement(MonkeyParser.LetStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(MonkeyParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(MonkeyParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MonkeyParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(MonkeyParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyParser#additionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionExpression(MonkeyParser.AdditionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyParser#additionFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionFactor(MonkeyParser.AdditionFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyParser#multiplicationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpression(MonkeyParser.MultiplicationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyParser#multiplicationFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationFactor(MonkeyParser.MultiplicationFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyParser#elementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementExpression(MonkeyParser.ElementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyParser#elementAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementAccess(MonkeyParser.ElementAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyParser#callExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpression(MonkeyParser.CallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpression(MonkeyParser.PrimitiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyParser#arrayFunctions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayFunctions(MonkeyParser.ArrayFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(MonkeyParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyParser#functionLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionLiteral(MonkeyParser.FunctionLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyParser#functionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameters(MonkeyParser.FunctionParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyParser#moreIdentifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreIdentifiers(MonkeyParser.MoreIdentifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyParser#hashLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashLiteral(MonkeyParser.HashLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyParser#hashContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashContent(MonkeyParser.HashContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyParser#moreHashContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreHashContent(MonkeyParser.MoreHashContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(MonkeyParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyParser#moreExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreExpressions(MonkeyParser.MoreExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyParser#printExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpression(MonkeyParser.PrintExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyParser#ifExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpression(MonkeyParser.IfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MonkeyParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(MonkeyParser.BlockStatementContext ctx);
}