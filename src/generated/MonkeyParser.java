// Generated from C:/Users/Baxi/Desktop/Compiladores_P1\MonkeyParser.g4 by ANTLR 4.8
package generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MonkeyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LET=1, RETURN=2, FN=3, PUTS=4, IF=5, ELSE=6, LEN=7, FIRST=8, LAST=9, REST=10, 
		PUSH=11, L_PAREN=12, R_PAREN=13, L_BRACE=14, R_BRACE=15, L_BRACK=16, R_BRACK=17, 
		PYCOMMA=18, COMMA=19, COLON=20, LE=21, GE=22, EQUAL=23, GT=24, LT=25, 
		ASSIGN=26, ADD=27, SUB=28, MUL=29, DIV=30, TRUE=31, FALSE=32, NUMBER=33, 
		STRING=34, IDENT=35, WS=36, BLOCK_COMMENT=37, SINGLE_COMMENT=38;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_letStatement = 2, RULE_returnStatement = 3, 
		RULE_expressionStatement = 4, RULE_expression = 5, RULE_comparison = 6, 
		RULE_additionExpression = 7, RULE_additionFactor = 8, RULE_multiplicationExpression = 9, 
		RULE_multiplicationFactor = 10, RULE_elementExpression = 11, RULE_elementAccess = 12, 
		RULE_callExpression = 13, RULE_primitiveExpression = 14, RULE_arrayFunctions = 15, 
		RULE_arrayLiteral = 16, RULE_functionLiteral = 17, RULE_functionParameters = 18, 
		RULE_moreIdentifiers = 19, RULE_hashLiteral = 20, RULE_hashContent = 21, 
		RULE_moreHashContent = 22, RULE_expressionList = 23, RULE_moreExpressions = 24, 
		RULE_printExpression = 25, RULE_ifExpression = 26, RULE_blockStatement = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "letStatement", "returnStatement", "expressionStatement", 
			"expression", "comparison", "additionExpression", "additionFactor", "multiplicationExpression", 
			"multiplicationFactor", "elementExpression", "elementAccess", "callExpression", 
			"primitiveExpression", "arrayFunctions", "arrayLiteral", "functionLiteral", 
			"functionParameters", "moreIdentifiers", "hashLiteral", "hashContent", 
			"moreHashContent", "expressionList", "moreExpressions", "printExpression", 
			"ifExpression", "blockStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "'return'", "'fn'", "'puts'", "'if'", "'else'", "'len'", 
			"'first'", "'last'", "'rest'", "'push'", "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "';'", "','", "':'", "'<='", "'>='", "'=='", "'>'", "'<'", 
			"'='", "'+'", "'-'", "'*'", "'/'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LET", "RETURN", "FN", "PUTS", "IF", "ELSE", "LEN", "FIRST", "LAST", 
			"REST", "PUSH", "L_PAREN", "R_PAREN", "L_BRACE", "R_BRACE", "L_BRACK", 
			"R_BRACK", "PYCOMMA", "COMMA", "COLON", "LE", "GE", "EQUAL", "GT", "LT", 
			"ASSIGN", "ADD", "SUB", "MUL", "DIV", "TRUE", "FALSE", "NUMBER", "STRING", 
			"IDENT", "WS", "BLOCK_COMMENT", "SINGLE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MonkeyParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MonkeyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Program_ASTContext extends ProgramContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Program_ASTContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitProgram_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new Program_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << RETURN) | (1L << FN) | (1L << PUTS) | (1L << IF) | (1L << LEN) | (1L << FIRST) | (1L << LAST) | (1L << REST) | (1L << PUSH) | (1L << L_PAREN) | (1L << L_BRACE) | (1L << L_BRACK) | (1L << TRUE) | (1L << FALSE) | (1L << NUMBER) | (1L << STRING) | (1L << IDENT))) != 0)) {
				{
				{
				setState(56);
				statement();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CallExpressionStatementASTContext extends StatementContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public CallExpressionStatementASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitCallExpressionStatementAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Statement_LetASTContext extends StatementContext {
		public TerminalNode LET() { return getToken(MonkeyParser.LET, 0); }
		public LetStatementContext letStatement() {
			return getRuleContext(LetStatementContext.class,0);
		}
		public Statement_LetASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitStatement_LetAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Statement_returnASTContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(MonkeyParser.RETURN, 0); }
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public Statement_returnASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitStatement_returnAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				_localctx = new Statement_LetASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(LET);
				setState(63);
				letStatement();
				}
				break;
			case RETURN:
				_localctx = new Statement_returnASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(RETURN);
				setState(65);
				returnStatement();
				}
				break;
			case FN:
			case PUTS:
			case IF:
			case LEN:
			case FIRST:
			case LAST:
			case REST:
			case PUSH:
			case L_PAREN:
			case L_BRACE:
			case L_BRACK:
			case TRUE:
			case FALSE:
			case NUMBER:
			case STRING:
			case IDENT:
				_localctx = new CallExpressionStatementASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				expressionStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetStatementContext extends ParserRuleContext {
		public LetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letStatement; }
	 
		public LetStatementContext() { }
		public void copyFrom(LetStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LetStatement_ASTContext extends LetStatementContext {
		public TerminalNode IDENT() { return getToken(MonkeyParser.IDENT, 0); }
		public TerminalNode ASSIGN() { return getToken(MonkeyParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PYCOMMA() { return getToken(MonkeyParser.PYCOMMA, 0); }
		public LetStatement_ASTContext(LetStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitLetStatement_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetStatementContext letStatement() throws RecognitionException {
		LetStatementContext _localctx = new LetStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_letStatement);
		try {
			_localctx = new LetStatement_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(IDENT);
			setState(70);
			match(ASSIGN);
			setState(71);
			expression();
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PYCOMMA:
				{
				setState(72);
				match(PYCOMMA);
				}
				break;
			case EOF:
			case LET:
			case RETURN:
			case FN:
			case PUTS:
			case IF:
			case LEN:
			case FIRST:
			case LAST:
			case REST:
			case PUSH:
			case L_PAREN:
			case L_BRACE:
			case R_BRACE:
			case L_BRACK:
			case TRUE:
			case FALSE:
			case NUMBER:
			case STRING:
			case IDENT:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	 
		public ReturnStatementContext() { }
		public void copyFrom(ReturnStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnStatement_ASTContext extends ReturnStatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PYCOMMA() { return getToken(MonkeyParser.PYCOMMA, 0); }
		public ReturnStatement_ASTContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitReturnStatement_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_returnStatement);
		try {
			_localctx = new ReturnStatement_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			expression();
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PYCOMMA:
				{
				setState(77);
				match(PYCOMMA);
				}
				break;
			case EOF:
			case LET:
			case RETURN:
			case FN:
			case PUTS:
			case IF:
			case LEN:
			case FIRST:
			case LAST:
			case REST:
			case PUSH:
			case L_PAREN:
			case L_BRACE:
			case R_BRACE:
			case L_BRACK:
			case TRUE:
			case FALSE:
			case NUMBER:
			case STRING:
			case IDENT:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	 
		public ExpressionStatementContext() { }
		public void copyFrom(ExpressionStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionStatement_ASTContext extends ExpressionStatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PYCOMMA() { return getToken(MonkeyParser.PYCOMMA, 0); }
		public ExpressionStatement_ASTContext(ExpressionStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitExpressionStatement_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expressionStatement);
		try {
			_localctx = new ExpressionStatement_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			expression();
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PYCOMMA:
				{
				setState(82);
				match(PYCOMMA);
				}
				break;
			case EOF:
			case LET:
			case RETURN:
			case FN:
			case PUTS:
			case IF:
			case LEN:
			case FIRST:
			case LAST:
			case REST:
			case PUSH:
			case L_PAREN:
			case L_BRACE:
			case R_BRACE:
			case L_BRACK:
			case TRUE:
			case FALSE:
			case NUMBER:
			case STRING:
			case IDENT:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Expression_ASTContext extends ExpressionContext {
		public AdditionExpressionContext additionExpression() {
			return getRuleContext(AdditionExpressionContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public Expression_ASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitExpression_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		try {
			_localctx = new Expression_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			additionExpression();
			setState(87);
			comparison();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonContext extends ParserRuleContext {
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	 
		public ComparisonContext() { }
		public void copyFrom(ComparisonContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Comparison_ASTContext extends ComparisonContext {
		public List<AdditionExpressionContext> additionExpression() {
			return getRuleContexts(AdditionExpressionContext.class);
		}
		public AdditionExpressionContext additionExpression(int i) {
			return getRuleContext(AdditionExpressionContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(MonkeyParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(MonkeyParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(MonkeyParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(MonkeyParser.GT, i);
		}
		public List<TerminalNode> LE() { return getTokens(MonkeyParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(MonkeyParser.LE, i);
		}
		public List<TerminalNode> GE() { return getTokens(MonkeyParser.GE); }
		public TerminalNode GE(int i) {
			return getToken(MonkeyParser.GE, i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(MonkeyParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(MonkeyParser.EQUAL, i);
		}
		public Comparison_ASTContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitComparison_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comparison);
		int _la;
		try {
			_localctx = new Comparison_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LE) | (1L << GE) | (1L << EQUAL) | (1L << GT) | (1L << LT))) != 0)) {
				{
				{
				setState(89);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LE) | (1L << GE) | (1L << EQUAL) | (1L << GT) | (1L << LT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(90);
				additionExpression();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditionExpressionContext extends ParserRuleContext {
		public AdditionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionExpression; }
	 
		public AdditionExpressionContext() { }
		public void copyFrom(AdditionExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AdditionExpression_ASTContext extends AdditionExpressionContext {
		public MultiplicationExpressionContext multiplicationExpression() {
			return getRuleContext(MultiplicationExpressionContext.class,0);
		}
		public AdditionFactorContext additionFactor() {
			return getRuleContext(AdditionFactorContext.class,0);
		}
		public AdditionExpression_ASTContext(AdditionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitAdditionExpression_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionExpressionContext additionExpression() throws RecognitionException {
		AdditionExpressionContext _localctx = new AdditionExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_additionExpression);
		try {
			_localctx = new AdditionExpression_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			multiplicationExpression();
			setState(97);
			additionFactor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditionFactorContext extends ParserRuleContext {
		public AdditionFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionFactor; }
	 
		public AdditionFactorContext() { }
		public void copyFrom(AdditionFactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AdditionFactor_ASTContext extends AdditionFactorContext {
		public List<MultiplicationExpressionContext> multiplicationExpression() {
			return getRuleContexts(MultiplicationExpressionContext.class);
		}
		public MultiplicationExpressionContext multiplicationExpression(int i) {
			return getRuleContext(MultiplicationExpressionContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(MonkeyParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(MonkeyParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(MonkeyParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(MonkeyParser.SUB, i);
		}
		public AdditionFactor_ASTContext(AdditionFactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitAdditionFactor_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionFactorContext additionFactor() throws RecognitionException {
		AdditionFactorContext _localctx = new AdditionFactorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_additionFactor);
		int _la;
		try {
			_localctx = new AdditionFactor_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(99);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(100);
				multiplicationExpression();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicationExpressionContext extends ParserRuleContext {
		public MultiplicationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicationExpression; }
	 
		public MultiplicationExpressionContext() { }
		public void copyFrom(MultiplicationExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiplicationExpression_ASTContext extends MultiplicationExpressionContext {
		public ElementExpressionContext elementExpression() {
			return getRuleContext(ElementExpressionContext.class,0);
		}
		public MultiplicationFactorContext multiplicationFactor() {
			return getRuleContext(MultiplicationFactorContext.class,0);
		}
		public MultiplicationExpression_ASTContext(MultiplicationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitMultiplicationExpression_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicationExpressionContext multiplicationExpression() throws RecognitionException {
		MultiplicationExpressionContext _localctx = new MultiplicationExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_multiplicationExpression);
		try {
			_localctx = new MultiplicationExpression_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			elementExpression();
			setState(107);
			multiplicationFactor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicationFactorContext extends ParserRuleContext {
		public MultiplicationFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicationFactor; }
	 
		public MultiplicationFactorContext() { }
		public void copyFrom(MultiplicationFactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiplicationFactor_ASTContext extends MultiplicationFactorContext {
		public List<ElementExpressionContext> elementExpression() {
			return getRuleContexts(ElementExpressionContext.class);
		}
		public ElementExpressionContext elementExpression(int i) {
			return getRuleContext(ElementExpressionContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(MonkeyParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(MonkeyParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(MonkeyParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(MonkeyParser.DIV, i);
		}
		public MultiplicationFactor_ASTContext(MultiplicationFactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitMultiplicationFactor_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicationFactorContext multiplicationFactor() throws RecognitionException {
		MultiplicationFactorContext _localctx = new MultiplicationFactorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_multiplicationFactor);
		int _la;
		try {
			_localctx = new MultiplicationFactor_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				{
				setState(109);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(110);
				elementExpression();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementExpressionContext extends ParserRuleContext {
		public ElementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementExpression; }
	 
		public ElementExpressionContext() { }
		public void copyFrom(ElementExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElementExpression_ASTContext extends ElementExpressionContext {
		public PrimitiveExpressionContext primitiveExpression() {
			return getRuleContext(PrimitiveExpressionContext.class,0);
		}
		public ElementAccessContext elementAccess() {
			return getRuleContext(ElementAccessContext.class,0);
		}
		public CallExpressionContext callExpression() {
			return getRuleContext(CallExpressionContext.class,0);
		}
		public ElementExpression_ASTContext(ElementExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitElementExpression_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementExpressionContext elementExpression() throws RecognitionException {
		ElementExpressionContext _localctx = new ElementExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elementExpression);
		try {
			_localctx = new ElementExpression_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			primitiveExpression();
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(117);
				elementAccess();
				}
				break;
			case 2:
				{
				setState(118);
				callExpression();
				}
				break;
			case 3:
				{
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementAccessContext extends ParserRuleContext {
		public ElementAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementAccess; }
	 
		public ElementAccessContext() { }
		public void copyFrom(ElementAccessContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElementAccess_ASTContext extends ElementAccessContext {
		public TerminalNode L_BRACK() { return getToken(MonkeyParser.L_BRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_BRACK() { return getToken(MonkeyParser.R_BRACK, 0); }
		public ElementAccess_ASTContext(ElementAccessContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitElementAccess_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementAccessContext elementAccess() throws RecognitionException {
		ElementAccessContext _localctx = new ElementAccessContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elementAccess);
		try {
			_localctx = new ElementAccess_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(L_BRACK);
			setState(123);
			expression();
			setState(124);
			match(R_BRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallExpressionContext extends ParserRuleContext {
		public CallExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callExpression; }
	 
		public CallExpressionContext() { }
		public void copyFrom(CallExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CallExpression_ASTContext extends CallExpressionContext {
		public TerminalNode L_PAREN() { return getToken(MonkeyParser.L_PAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(MonkeyParser.R_PAREN, 0); }
		public CallExpression_ASTContext(CallExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitCallExpression_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallExpressionContext callExpression() throws RecognitionException {
		CallExpressionContext _localctx = new CallExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_callExpression);
		try {
			_localctx = new CallExpression_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(L_PAREN);
			setState(127);
			expressionList();
			setState(128);
			match(R_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveExpressionContext extends ParserRuleContext {
		public PrimitiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveExpression; }
	 
		public PrimitiveExpressionContext() { }
		public void copyFrom(PrimitiveExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrimitiveExpression_literalASTContext extends PrimitiveExpressionContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public PrimitiveExpression_literalASTContext(PrimitiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitPrimitiveExpression_literalAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveExpression_identASTContext extends PrimitiveExpressionContext {
		public TerminalNode IDENT() { return getToken(MonkeyParser.IDENT, 0); }
		public PrimitiveExpression_identASTContext(PrimitiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitPrimitiveExpression_identAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveExpression_trueASTContext extends PrimitiveExpressionContext {
		public TerminalNode TRUE() { return getToken(MonkeyParser.TRUE, 0); }
		public PrimitiveExpression_trueASTContext(PrimitiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitPrimitiveExpression_trueAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveExpression_numberASTContext extends PrimitiveExpressionContext {
		public TerminalNode NUMBER() { return getToken(MonkeyParser.NUMBER, 0); }
		public PrimitiveExpression_numberASTContext(PrimitiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitPrimitiveExpression_numberAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveExpression_ArrayFunctionsASTContext extends PrimitiveExpressionContext {
		public ArrayFunctionsContext arrayFunctions() {
			return getRuleContext(ArrayFunctionsContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(MonkeyParser.L_PAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(MonkeyParser.R_PAREN, 0); }
		public PrimitiveExpression_ArrayFunctionsASTContext(PrimitiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitPrimitiveExpression_ArrayFunctionsAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveExpression_FunctionLiteral_ASTContext extends PrimitiveExpressionContext {
		public FunctionLiteralContext functionLiteral() {
			return getRuleContext(FunctionLiteralContext.class,0);
		}
		public PrimitiveExpression_FunctionLiteral_ASTContext(PrimitiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitPrimitiveExpression_FunctionLiteral_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveExpression_IfExpressionContext extends PrimitiveExpressionContext {
		public IfExpressionContext ifExpression() {
			return getRuleContext(IfExpressionContext.class,0);
		}
		public PrimitiveExpression_IfExpressionContext(PrimitiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitPrimitiveExpression_IfExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveExpression_stringASTContext extends PrimitiveExpressionContext {
		public TerminalNode STRING() { return getToken(MonkeyParser.STRING, 0); }
		public PrimitiveExpression_stringASTContext(PrimitiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitPrimitiveExpression_stringAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveExpression_falseASTContext extends PrimitiveExpressionContext {
		public TerminalNode FALSE() { return getToken(MonkeyParser.FALSE, 0); }
		public PrimitiveExpression_falseASTContext(PrimitiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitPrimitiveExpression_falseAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveExpression_expressionASTContext extends PrimitiveExpressionContext {
		public TerminalNode L_PAREN() { return getToken(MonkeyParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(MonkeyParser.R_PAREN, 0); }
		public PrimitiveExpression_expressionASTContext(PrimitiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitPrimitiveExpression_expressionAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveExpression_HashLiteral_ASTContext extends PrimitiveExpressionContext {
		public HashLiteralContext hashLiteral() {
			return getRuleContext(HashLiteralContext.class,0);
		}
		public PrimitiveExpression_HashLiteral_ASTContext(PrimitiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitPrimitiveExpression_HashLiteral_AST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveExpression_PrintExpressionASTContext extends PrimitiveExpressionContext {
		public PrintExpressionContext printExpression() {
			return getRuleContext(PrintExpressionContext.class,0);
		}
		public PrimitiveExpression_PrintExpressionASTContext(PrimitiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitPrimitiveExpression_PrintExpressionAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveExpressionContext primitiveExpression() throws RecognitionException {
		PrimitiveExpressionContext _localctx = new PrimitiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_primitiveExpression);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new PrimitiveExpression_numberASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(NUMBER);
				}
				break;
			case STRING:
				_localctx = new PrimitiveExpression_stringASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(STRING);
				}
				break;
			case IDENT:
				_localctx = new PrimitiveExpression_identASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(IDENT);
				}
				break;
			case TRUE:
				_localctx = new PrimitiveExpression_trueASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new PrimitiveExpression_falseASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				match(FALSE);
				}
				break;
			case L_PAREN:
				_localctx = new PrimitiveExpression_expressionASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				match(L_PAREN);
				setState(136);
				expression();
				setState(137);
				match(R_PAREN);
				}
				break;
			case L_BRACK:
				_localctx = new PrimitiveExpression_literalASTContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(139);
				arrayLiteral();
				}
				break;
			case LEN:
			case FIRST:
			case LAST:
			case REST:
			case PUSH:
				_localctx = new PrimitiveExpression_ArrayFunctionsASTContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(140);
				arrayFunctions();
				setState(141);
				match(L_PAREN);
				setState(142);
				expressionList();
				setState(143);
				match(R_PAREN);
				}
				break;
			case FN:
				_localctx = new PrimitiveExpression_FunctionLiteral_ASTContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(145);
				functionLiteral();
				}
				break;
			case L_BRACE:
				_localctx = new PrimitiveExpression_HashLiteral_ASTContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(146);
				hashLiteral();
				}
				break;
			case PUTS:
				_localctx = new PrimitiveExpression_PrintExpressionASTContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(147);
				printExpression();
				}
				break;
			case IF:
				_localctx = new PrimitiveExpression_IfExpressionContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(148);
				ifExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayFunctionsContext extends ParserRuleContext {
		public ArrayFunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayFunctions; }
	 
		public ArrayFunctionsContext() { }
		public void copyFrom(ArrayFunctionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayFunctions_lenASTContext extends ArrayFunctionsContext {
		public TerminalNode LEN() { return getToken(MonkeyParser.LEN, 0); }
		public ArrayFunctions_lenASTContext(ArrayFunctionsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitArrayFunctions_lenAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayFunctions_restASTContext extends ArrayFunctionsContext {
		public TerminalNode REST() { return getToken(MonkeyParser.REST, 0); }
		public ArrayFunctions_restASTContext(ArrayFunctionsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitArrayFunctions_restAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayFunctions_pushASTContext extends ArrayFunctionsContext {
		public TerminalNode PUSH() { return getToken(MonkeyParser.PUSH, 0); }
		public ArrayFunctions_pushASTContext(ArrayFunctionsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitArrayFunctions_pushAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayFunctions_lastASTContext extends ArrayFunctionsContext {
		public TerminalNode LAST() { return getToken(MonkeyParser.LAST, 0); }
		public ArrayFunctions_lastASTContext(ArrayFunctionsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitArrayFunctions_lastAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayFunctions_firstASTContext extends ArrayFunctionsContext {
		public TerminalNode FIRST() { return getToken(MonkeyParser.FIRST, 0); }
		public ArrayFunctions_firstASTContext(ArrayFunctionsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitArrayFunctions_firstAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayFunctionsContext arrayFunctions() throws RecognitionException {
		ArrayFunctionsContext _localctx = new ArrayFunctionsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayFunctions);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEN:
				_localctx = new ArrayFunctions_lenASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(LEN);
				}
				break;
			case FIRST:
				_localctx = new ArrayFunctions_firstASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(FIRST);
				}
				break;
			case LAST:
				_localctx = new ArrayFunctions_lastASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(LAST);
				}
				break;
			case REST:
				_localctx = new ArrayFunctions_restASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				match(REST);
				}
				break;
			case PUSH:
				_localctx = new ArrayFunctions_pushASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				match(PUSH);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLiteralContext extends ParserRuleContext {
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
	 
		public ArrayLiteralContext() { }
		public void copyFrom(ArrayLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayLiteral_ASTContext extends ArrayLiteralContext {
		public TerminalNode L_BRACK() { return getToken(MonkeyParser.L_BRACK, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode R_BRACK() { return getToken(MonkeyParser.R_BRACK, 0); }
		public ArrayLiteral_ASTContext(ArrayLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitArrayLiteral_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arrayLiteral);
		try {
			_localctx = new ArrayLiteral_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(L_BRACK);
			setState(159);
			expressionList();
			setState(160);
			match(R_BRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionLiteralContext extends ParserRuleContext {
		public FunctionLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionLiteral; }
	 
		public FunctionLiteralContext() { }
		public void copyFrom(FunctionLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionLiteral_ASTContext extends FunctionLiteralContext {
		public TerminalNode FN() { return getToken(MonkeyParser.FN, 0); }
		public TerminalNode L_PAREN() { return getToken(MonkeyParser.L_PAREN, 0); }
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(MonkeyParser.R_PAREN, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public FunctionLiteral_ASTContext(FunctionLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitFunctionLiteral_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionLiteralContext functionLiteral() throws RecognitionException {
		FunctionLiteralContext _localctx = new FunctionLiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionLiteral);
		try {
			_localctx = new FunctionLiteral_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(FN);
			setState(163);
			match(L_PAREN);
			setState(164);
			functionParameters();
			setState(165);
			match(R_PAREN);
			setState(166);
			blockStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionParametersContext extends ParserRuleContext {
		public FunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameters; }
	 
		public FunctionParametersContext() { }
		public void copyFrom(FunctionParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionParameters_ASTContext extends FunctionParametersContext {
		public TerminalNode IDENT() { return getToken(MonkeyParser.IDENT, 0); }
		public MoreIdentifiersContext moreIdentifiers() {
			return getRuleContext(MoreIdentifiersContext.class,0);
		}
		public FunctionParameters_ASTContext(FunctionParametersContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitFunctionParameters_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParametersContext functionParameters() throws RecognitionException {
		FunctionParametersContext _localctx = new FunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_functionParameters);
		try {
			_localctx = new FunctionParameters_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(IDENT);
			setState(169);
			moreIdentifiers();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MoreIdentifiersContext extends ParserRuleContext {
		public MoreIdentifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreIdentifiers; }
	 
		public MoreIdentifiersContext() { }
		public void copyFrom(MoreIdentifiersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MoreIdentifiers_ASTContext extends MoreIdentifiersContext {
		public List<TerminalNode> COMMA() { return getTokens(MonkeyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MonkeyParser.COMMA, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(MonkeyParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(MonkeyParser.IDENT, i);
		}
		public MoreIdentifiers_ASTContext(MoreIdentifiersContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitMoreIdentifiers_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoreIdentifiersContext moreIdentifiers() throws RecognitionException {
		MoreIdentifiersContext _localctx = new MoreIdentifiersContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_moreIdentifiers);
		int _la;
		try {
			_localctx = new MoreIdentifiers_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(171);
				match(COMMA);
				setState(172);
				match(IDENT);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HashLiteralContext extends ParserRuleContext {
		public HashLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hashLiteral; }
	 
		public HashLiteralContext() { }
		public void copyFrom(HashLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HashLiteral_ASTContext extends HashLiteralContext {
		public TerminalNode L_BRACE() { return getToken(MonkeyParser.L_BRACE, 0); }
		public HashContentContext hashContent() {
			return getRuleContext(HashContentContext.class,0);
		}
		public MoreHashContentContext moreHashContent() {
			return getRuleContext(MoreHashContentContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(MonkeyParser.R_BRACE, 0); }
		public HashLiteral_ASTContext(HashLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitHashLiteral_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HashLiteralContext hashLiteral() throws RecognitionException {
		HashLiteralContext _localctx = new HashLiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_hashLiteral);
		try {
			_localctx = new HashLiteral_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(L_BRACE);
			setState(179);
			hashContent();
			setState(180);
			moreHashContent();
			setState(181);
			match(R_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HashContentContext extends ParserRuleContext {
		public HashContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hashContent; }
	 
		public HashContentContext() { }
		public void copyFrom(HashContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HashContent_ASTContext extends HashContentContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(MonkeyParser.COLON, 0); }
		public HashContent_ASTContext(HashContentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitHashContent_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HashContentContext hashContent() throws RecognitionException {
		HashContentContext _localctx = new HashContentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_hashContent);
		try {
			_localctx = new HashContent_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			expression();
			setState(184);
			match(COLON);
			setState(185);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MoreHashContentContext extends ParserRuleContext {
		public MoreHashContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreHashContent; }
	 
		public MoreHashContentContext() { }
		public void copyFrom(MoreHashContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MoreHashContent_ASTContext extends MoreHashContentContext {
		public List<TerminalNode> COMMA() { return getTokens(MonkeyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MonkeyParser.COMMA, i);
		}
		public List<HashContentContext> hashContent() {
			return getRuleContexts(HashContentContext.class);
		}
		public HashContentContext hashContent(int i) {
			return getRuleContext(HashContentContext.class,i);
		}
		public MoreHashContent_ASTContext(MoreHashContentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitMoreHashContent_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoreHashContentContext moreHashContent() throws RecognitionException {
		MoreHashContentContext _localctx = new MoreHashContentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_moreHashContent);
		int _la;
		try {
			_localctx = new MoreHashContent_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(187);
				match(COMMA);
				setState(188);
				hashContent();
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	 
		public ExpressionListContext() { }
		public void copyFrom(ExpressionListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionList_expressionASTContext extends ExpressionListContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MoreExpressionsContext moreExpressions() {
			return getRuleContext(MoreExpressionsContext.class,0);
		}
		public ExpressionList_expressionASTContext(ExpressionListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitExpressionList_expressionAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionList_nullASTContext extends ExpressionListContext {
		public ExpressionList_nullASTContext(ExpressionListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitExpressionList_nullAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expressionList);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FN:
			case PUTS:
			case IF:
			case LEN:
			case FIRST:
			case LAST:
			case REST:
			case PUSH:
			case L_PAREN:
			case L_BRACE:
			case L_BRACK:
			case TRUE:
			case FALSE:
			case NUMBER:
			case STRING:
			case IDENT:
				_localctx = new ExpressionList_expressionASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				expression();
				setState(195);
				moreExpressions();
				}
				break;
			case R_PAREN:
			case R_BRACK:
				_localctx = new ExpressionList_nullASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MoreExpressionsContext extends ParserRuleContext {
		public MoreExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreExpressions; }
	 
		public MoreExpressionsContext() { }
		public void copyFrom(MoreExpressionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MoreExpressions_ASTContext extends MoreExpressionsContext {
		public List<TerminalNode> COMMA() { return getTokens(MonkeyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MonkeyParser.COMMA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MoreExpressions_ASTContext(MoreExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitMoreExpressions_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoreExpressionsContext moreExpressions() throws RecognitionException {
		MoreExpressionsContext _localctx = new MoreExpressionsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_moreExpressions);
		int _la;
		try {
			_localctx = new MoreExpressions_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(200);
				match(COMMA);
				setState(201);
				expression();
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintExpressionContext extends ParserRuleContext {
		public PrintExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printExpression; }
	 
		public PrintExpressionContext() { }
		public void copyFrom(PrintExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintExpression_ASTContext extends PrintExpressionContext {
		public TerminalNode PUTS() { return getToken(MonkeyParser.PUTS, 0); }
		public TerminalNode L_PAREN() { return getToken(MonkeyParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(MonkeyParser.R_PAREN, 0); }
		public PrintExpression_ASTContext(PrintExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitPrintExpression_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintExpressionContext printExpression() throws RecognitionException {
		PrintExpressionContext _localctx = new PrintExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_printExpression);
		try {
			_localctx = new PrintExpression_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(PUTS);
			setState(208);
			match(L_PAREN);
			setState(209);
			expression();
			setState(210);
			match(R_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfExpressionContext extends ParserRuleContext {
		public IfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpression; }
	 
		public IfExpressionContext() { }
		public void copyFrom(IfExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfExpression_ASTContext extends IfExpressionContext {
		public TerminalNode IF() { return getToken(MonkeyParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MonkeyParser.ELSE, 0); }
		public IfExpression_ASTContext(IfExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitIfExpression_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExpressionContext ifExpression() throws RecognitionException {
		IfExpressionContext _localctx = new IfExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ifExpression);
		try {
			_localctx = new IfExpression_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(IF);
			setState(213);
			expression();
			setState(214);
			blockStatement();
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				{
				setState(215);
				match(ELSE);
				setState(216);
				blockStatement();
				}
				break;
			case EOF:
			case LET:
			case RETURN:
			case FN:
			case PUTS:
			case IF:
			case LEN:
			case FIRST:
			case LAST:
			case REST:
			case PUSH:
			case L_PAREN:
			case R_PAREN:
			case L_BRACE:
			case R_BRACE:
			case L_BRACK:
			case R_BRACK:
			case PYCOMMA:
			case COMMA:
			case COLON:
			case LE:
			case GE:
			case EQUAL:
			case GT:
			case LT:
			case ADD:
			case SUB:
			case MUL:
			case DIV:
			case TRUE:
			case FALSE:
			case NUMBER:
			case STRING:
			case IDENT:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
	 
		public BlockStatementContext() { }
		public void copyFrom(BlockStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockStatement_ASTContext extends BlockStatementContext {
		public TerminalNode L_BRACE() { return getToken(MonkeyParser.L_BRACE, 0); }
		public TerminalNode R_BRACE() { return getToken(MonkeyParser.R_BRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockStatement_ASTContext(BlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitBlockStatement_AST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_blockStatement);
		int _la;
		try {
			_localctx = new BlockStatement_ASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(L_BRACE);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << RETURN) | (1L << FN) | (1L << PUTS) | (1L << IF) | (1L << LEN) | (1L << FIRST) | (1L << LAST) | (1L << REST) | (1L << PUSH) | (1L << L_PAREN) | (1L << L_BRACE) | (1L << L_BRACK) | (1L << TRUE) | (1L << FALSE) | (1L << NUMBER) | (1L << STRING) | (1L << IDENT))) != 0)) {
				{
				{
				setState(221);
				statement();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
			match(R_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00e8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\7\2<\n\2\f\2\16\2?\13\2\3"+
		"\3\3\3\3\3\3\3\3\3\5\3F\n\3\3\4\3\4\3\4\3\4\3\4\5\4M\n\4\3\5\3\5\3\5\5"+
		"\5R\n\5\3\6\3\6\3\6\5\6W\n\6\3\7\3\7\3\7\3\b\3\b\7\b^\n\b\f\b\16\ba\13"+
		"\b\3\t\3\t\3\t\3\n\3\n\7\nh\n\n\f\n\16\nk\13\n\3\13\3\13\3\13\3\f\3\f"+
		"\7\fr\n\f\f\f\16\fu\13\f\3\r\3\r\3\r\3\r\5\r{\n\r\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0098\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u009f\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\7\25\u00b0\n\25\f\25\16\25\u00b3\13"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\7\30\u00c0"+
		"\n\30\f\30\16\30\u00c3\13\30\3\31\3\31\3\31\3\31\5\31\u00c9\n\31\3\32"+
		"\3\32\7\32\u00cd\n\32\f\32\16\32\u00d0\13\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00dd\n\34\3\35\3\35\7\35\u00e1\n"+
		"\35\f\35\16\35\u00e4\13\35\3\35\3\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\5\3\2\27\33\3\2\35\36\3\2\37"+
		" \2\u00eb\2=\3\2\2\2\4E\3\2\2\2\6G\3\2\2\2\bN\3\2\2\2\nS\3\2\2\2\fX\3"+
		"\2\2\2\16_\3\2\2\2\20b\3\2\2\2\22i\3\2\2\2\24l\3\2\2\2\26s\3\2\2\2\30"+
		"v\3\2\2\2\32|\3\2\2\2\34\u0080\3\2\2\2\36\u0097\3\2\2\2 \u009e\3\2\2\2"+
		"\"\u00a0\3\2\2\2$\u00a4\3\2\2\2&\u00aa\3\2\2\2(\u00b1\3\2\2\2*\u00b4\3"+
		"\2\2\2,\u00b9\3\2\2\2.\u00c1\3\2\2\2\60\u00c8\3\2\2\2\62\u00ce\3\2\2\2"+
		"\64\u00d1\3\2\2\2\66\u00d6\3\2\2\28\u00de\3\2\2\2:<\5\4\3\2;:\3\2\2\2"+
		"<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\3\3\2\2\2?=\3\2\2\2@A\7\3\2\2AF\5\6\4"+
		"\2BC\7\4\2\2CF\5\b\5\2DF\5\n\6\2E@\3\2\2\2EB\3\2\2\2ED\3\2\2\2F\5\3\2"+
		"\2\2GH\7%\2\2HI\7\34\2\2IL\5\f\7\2JM\7\24\2\2KM\3\2\2\2LJ\3\2\2\2LK\3"+
		"\2\2\2M\7\3\2\2\2NQ\5\f\7\2OR\7\24\2\2PR\3\2\2\2QO\3\2\2\2QP\3\2\2\2R"+
		"\t\3\2\2\2SV\5\f\7\2TW\7\24\2\2UW\3\2\2\2VT\3\2\2\2VU\3\2\2\2W\13\3\2"+
		"\2\2XY\5\20\t\2YZ\5\16\b\2Z\r\3\2\2\2[\\\t\2\2\2\\^\5\20\t\2][\3\2\2\2"+
		"^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\17\3\2\2\2a_\3\2\2\2bc\5\24\13\2cd\5\22"+
		"\n\2d\21\3\2\2\2ef\t\3\2\2fh\5\24\13\2ge\3\2\2\2hk\3\2\2\2ig\3\2\2\2i"+
		"j\3\2\2\2j\23\3\2\2\2ki\3\2\2\2lm\5\30\r\2mn\5\26\f\2n\25\3\2\2\2op\t"+
		"\4\2\2pr\5\30\r\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\27\3\2\2\2"+
		"us\3\2\2\2vz\5\36\20\2w{\5\32\16\2x{\5\34\17\2y{\3\2\2\2zw\3\2\2\2zx\3"+
		"\2\2\2zy\3\2\2\2{\31\3\2\2\2|}\7\22\2\2}~\5\f\7\2~\177\7\23\2\2\177\33"+
		"\3\2\2\2\u0080\u0081\7\16\2\2\u0081\u0082\5\60\31\2\u0082\u0083\7\17\2"+
		"\2\u0083\35\3\2\2\2\u0084\u0098\7#\2\2\u0085\u0098\7$\2\2\u0086\u0098"+
		"\7%\2\2\u0087\u0098\7!\2\2\u0088\u0098\7\"\2\2\u0089\u008a\7\16\2\2\u008a"+
		"\u008b\5\f\7\2\u008b\u008c\7\17\2\2\u008c\u0098\3\2\2\2\u008d\u0098\5"+
		"\"\22\2\u008e\u008f\5 \21\2\u008f\u0090\7\16\2\2\u0090\u0091\5\60\31\2"+
		"\u0091\u0092\7\17\2\2\u0092\u0098\3\2\2\2\u0093\u0098\5$\23\2\u0094\u0098"+
		"\5*\26\2\u0095\u0098\5\64\33\2\u0096\u0098\5\66\34\2\u0097\u0084\3\2\2"+
		"\2\u0097\u0085\3\2\2\2\u0097\u0086\3\2\2\2\u0097\u0087\3\2\2\2\u0097\u0088"+
		"\3\2\2\2\u0097\u0089\3\2\2\2\u0097\u008d\3\2\2\2\u0097\u008e\3\2\2\2\u0097"+
		"\u0093\3\2\2\2\u0097\u0094\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2"+
		"\2\2\u0098\37\3\2\2\2\u0099\u009f\7\t\2\2\u009a\u009f\7\n\2\2\u009b\u009f"+
		"\7\13\2\2\u009c\u009f\7\f\2\2\u009d\u009f\7\r\2\2\u009e\u0099\3\2\2\2"+
		"\u009e\u009a\3\2\2\2\u009e\u009b\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009d"+
		"\3\2\2\2\u009f!\3\2\2\2\u00a0\u00a1\7\22\2\2\u00a1\u00a2\5\60\31\2\u00a2"+
		"\u00a3\7\23\2\2\u00a3#\3\2\2\2\u00a4\u00a5\7\5\2\2\u00a5\u00a6\7\16\2"+
		"\2\u00a6\u00a7\5&\24\2\u00a7\u00a8\7\17\2\2\u00a8\u00a9\58\35\2\u00a9"+
		"%\3\2\2\2\u00aa\u00ab\7%\2\2\u00ab\u00ac\5(\25\2\u00ac\'\3\2\2\2\u00ad"+
		"\u00ae\7\25\2\2\u00ae\u00b0\7%\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2)\3\2\2\2\u00b3\u00b1"+
		"\3\2\2\2\u00b4\u00b5\7\20\2\2\u00b5\u00b6\5,\27\2\u00b6\u00b7\5.\30\2"+
		"\u00b7\u00b8\7\21\2\2\u00b8+\3\2\2\2\u00b9\u00ba\5\f\7\2\u00ba\u00bb\7"+
		"\26\2\2\u00bb\u00bc\5\f\7\2\u00bc-\3\2\2\2\u00bd\u00be\7\25\2\2\u00be"+
		"\u00c0\5,\27\2\u00bf\u00bd\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2/\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5"+
		"\5\f\7\2\u00c5\u00c6\5\62\32\2\u00c6\u00c9\3\2\2\2\u00c7\u00c9\3\2\2\2"+
		"\u00c8\u00c4\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\61\3\2\2\2\u00ca\u00cb"+
		"\7\25\2\2\u00cb\u00cd\5\f\7\2\u00cc\u00ca\3\2\2\2\u00cd\u00d0\3\2\2\2"+
		"\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\63\3\2\2\2\u00d0\u00ce"+
		"\3\2\2\2\u00d1\u00d2\7\6\2\2\u00d2\u00d3\7\16\2\2\u00d3\u00d4\5\f\7\2"+
		"\u00d4\u00d5\7\17\2\2\u00d5\65\3\2\2\2\u00d6\u00d7\7\7\2\2\u00d7\u00d8"+
		"\5\f\7\2\u00d8\u00dc\58\35\2\u00d9\u00da\7\b\2\2\u00da\u00dd\58\35\2\u00db"+
		"\u00dd\3\2\2\2\u00dc\u00d9\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\67\3\2\2"+
		"\2\u00de\u00e2\7\20\2\2\u00df\u00e1\5\4\3\2\u00e0\u00df\3\2\2\2\u00e1"+
		"\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2"+
		"\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7\21\2\2\u00e69\3\2\2\2\23=ELQV_"+
		"isz\u0097\u009e\u00b1\u00c1\u00c8\u00ce\u00dc\u00e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}