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
		PYCOMMA=18, COMMA=19, COLON=20, ASSIGN=21, GT=22, LT=23, LE=24, GE=25, 
		EQUAL=26, ADD=27, SUB=28, MUL=29, DIV=30, TRUE=31, FALSE=32, NUMBER=33, 
		STRING=34, IDENT=35, WS=36, COMMENT=37, BLOCK_COMMENT=38, Number=39, String=40, 
		Identifier=41;
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
			"'['", "']'", "';'", "','", "':'", "'='", "'>'", "'<'", "'<='", "'>='", 
			"'=='", "'+'", "'-'", "'*'", "'/'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LET", "RETURN", "FN", "PUTS", "IF", "ELSE", "LEN", "FIRST", "LAST", 
			"REST", "PUSH", "L_PAREN", "R_PAREN", "L_BRACE", "R_BRACE", "L_BRACK", 
			"R_BRACK", "PYCOMMA", "COMMA", "COLON", "ASSIGN", "GT", "LT", "LE", "GE", 
			"EQUAL", "ADD", "SUB", "MUL", "DIV", "TRUE", "FALSE", "NUMBER", "STRING", 
			"IDENT", "WS", "COMMENT", "BLOCK_COMMENT", "Number", "String", "Identifier"
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << RETURN) | (1L << FN) | (1L << PUTS) | (1L << IF) | (1L << LEN) | (1L << FIRST) | (1L << LAST) | (1L << REST) | (1L << PUSH) | (1L << L_PAREN) | (1L << L_BRACE) | (1L << L_BRACK) | (1L << TRUE) | (1L << FALSE) | (1L << Number) | (1L << String) | (1L << Identifier))) != 0)) {
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
		public TerminalNode LET() { return getToken(MonkeyParser.LET, 0); }
		public LetStatementContext letStatement() {
			return getRuleContext(LetStatementContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(MonkeyParser.RETURN, 0); }
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitStatement(this);
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
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(LET);
				setState(63);
				letStatement();
				}
				break;
			case RETURN:
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
			case Number:
			case String:
			case Identifier:
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
		public TerminalNode IDENT() { return getToken(MonkeyParser.IDENT, 0); }
		public TerminalNode ASSIGN() { return getToken(MonkeyParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PYCOMMA() { return getToken(MonkeyParser.PYCOMMA, 0); }
		public LetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitLetStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetStatementContext letStatement() throws RecognitionException {
		LetStatementContext _localctx = new LetStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_letStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(IDENT);
			setState(70);
			match(ASSIGN);
			setState(71);
			expression();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PYCOMMA) {
				{
				setState(72);
				match(PYCOMMA);
				}
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PYCOMMA() { return getToken(MonkeyParser.PYCOMMA, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			expression();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PYCOMMA) {
				{
				setState(76);
				match(PYCOMMA);
				}
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PYCOMMA() { return getToken(MonkeyParser.PYCOMMA, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			expression();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PYCOMMA) {
				{
				setState(80);
				match(PYCOMMA);
				}
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
		public AdditionExpressionContext additionExpression() {
			return getRuleContext(AdditionExpressionContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			additionExpression();
			setState(84);
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
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE) | (1L << EQUAL))) != 0)) {
				{
				{
				setState(86);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE) | (1L << EQUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(87);
				additionExpression();
				}
				}
				setState(92);
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
		public MultiplicationExpressionContext multiplicationExpression() {
			return getRuleContext(MultiplicationExpressionContext.class,0);
		}
		public AdditionFactorContext additionFactor() {
			return getRuleContext(AdditionFactorContext.class,0);
		}
		public AdditionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitAdditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionExpressionContext additionExpression() throws RecognitionException {
		AdditionExpressionContext _localctx = new AdditionExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_additionExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			multiplicationExpression();
			setState(94);
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
		public AdditionFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionFactor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitAdditionFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionFactorContext additionFactor() throws RecognitionException {
		AdditionFactorContext _localctx = new AdditionFactorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_additionFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(96);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(97);
				multiplicationExpression();
				}
				}
				setState(102);
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
		public ElementExpressionContext elementExpression() {
			return getRuleContext(ElementExpressionContext.class,0);
		}
		public MultiplicationFactorContext multiplicationFactor() {
			return getRuleContext(MultiplicationFactorContext.class,0);
		}
		public MultiplicationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicationExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitMultiplicationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicationExpressionContext multiplicationExpression() throws RecognitionException {
		MultiplicationExpressionContext _localctx = new MultiplicationExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_multiplicationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			elementExpression();
			setState(104);
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
		public MultiplicationFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicationFactor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitMultiplicationFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicationFactorContext multiplicationFactor() throws RecognitionException {
		MultiplicationFactorContext _localctx = new MultiplicationFactorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_multiplicationFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				{
				setState(106);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(107);
				elementExpression();
				}
				}
				setState(112);
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
		public PrimitiveExpressionContext primitiveExpression() {
			return getRuleContext(PrimitiveExpressionContext.class,0);
		}
		public ElementAccessContext elementAccess() {
			return getRuleContext(ElementAccessContext.class,0);
		}
		public CallExpressionContext callExpression() {
			return getRuleContext(CallExpressionContext.class,0);
		}
		public ElementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitElementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementExpressionContext elementExpression() throws RecognitionException {
		ElementExpressionContext _localctx = new ElementExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			primitiveExpression();
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(114);
				elementAccess();
				}
				break;
			case 2:
				{
				setState(115);
				callExpression();
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
		public TerminalNode L_BRACK() { return getToken(MonkeyParser.L_BRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_BRACK() { return getToken(MonkeyParser.R_BRACK, 0); }
		public ElementAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementAccess; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitElementAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementAccessContext elementAccess() throws RecognitionException {
		ElementAccessContext _localctx = new ElementAccessContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elementAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(L_BRACK);
			setState(119);
			expression();
			setState(120);
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
		public TerminalNode L_PAREN() { return getToken(MonkeyParser.L_PAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(MonkeyParser.R_PAREN, 0); }
		public CallExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallExpressionContext callExpression() throws RecognitionException {
		CallExpressionContext _localctx = new CallExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_callExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(L_PAREN);
			setState(123);
			expressionList();
			setState(124);
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
		public TerminalNode Number() { return getToken(MonkeyParser.Number, 0); }
		public TerminalNode String() { return getToken(MonkeyParser.String, 0); }
		public TerminalNode Identifier() { return getToken(MonkeyParser.Identifier, 0); }
		public TerminalNode TRUE() { return getToken(MonkeyParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MonkeyParser.FALSE, 0); }
		public TerminalNode L_PAREN() { return getToken(MonkeyParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(MonkeyParser.R_PAREN, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayFunctionsContext arrayFunctions() {
			return getRuleContext(ArrayFunctionsContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunctionLiteralContext functionLiteral() {
			return getRuleContext(FunctionLiteralContext.class,0);
		}
		public HashLiteralContext hashLiteral() {
			return getRuleContext(HashLiteralContext.class,0);
		}
		public PrintExpressionContext printExpression() {
			return getRuleContext(PrintExpressionContext.class,0);
		}
		public IfExpressionContext ifExpression() {
			return getRuleContext(IfExpressionContext.class,0);
		}
		public PrimitiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitPrimitiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveExpressionContext primitiveExpression() throws RecognitionException {
		PrimitiveExpressionContext _localctx = new PrimitiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_primitiveExpression);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(Number);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(String);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				match(Identifier);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(130);
				match(FALSE);
				}
				break;
			case L_PAREN:
				enterOuterAlt(_localctx, 6);
				{
				setState(131);
				match(L_PAREN);
				setState(132);
				expression();
				setState(133);
				match(R_PAREN);
				}
				break;
			case L_BRACK:
				enterOuterAlt(_localctx, 7);
				{
				setState(135);
				arrayLiteral();
				}
				break;
			case LEN:
			case FIRST:
			case LAST:
			case REST:
			case PUSH:
				enterOuterAlt(_localctx, 8);
				{
				setState(136);
				arrayFunctions();
				setState(137);
				match(L_PAREN);
				setState(138);
				expressionList();
				setState(139);
				match(R_PAREN);
				}
				break;
			case FN:
				enterOuterAlt(_localctx, 9);
				{
				setState(141);
				functionLiteral();
				}
				break;
			case L_BRACE:
				enterOuterAlt(_localctx, 10);
				{
				setState(142);
				hashLiteral();
				}
				break;
			case PUTS:
				enterOuterAlt(_localctx, 11);
				{
				setState(143);
				printExpression();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 12);
				{
				setState(144);
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
		public TerminalNode LEN() { return getToken(MonkeyParser.LEN, 0); }
		public TerminalNode FIRST() { return getToken(MonkeyParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(MonkeyParser.LAST, 0); }
		public TerminalNode REST() { return getToken(MonkeyParser.REST, 0); }
		public TerminalNode PUSH() { return getToken(MonkeyParser.PUSH, 0); }
		public ArrayFunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayFunctions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitArrayFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayFunctionsContext arrayFunctions() throws RecognitionException {
		ArrayFunctionsContext _localctx = new ArrayFunctionsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayFunctions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEN) | (1L << FIRST) | (1L << LAST) | (1L << REST) | (1L << PUSH))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode L_BRACK() { return getToken(MonkeyParser.L_BRACK, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode R_BRACK() { return getToken(MonkeyParser.R_BRACK, 0); }
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arrayLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(L_BRACK);
			setState(150);
			expressionList();
			setState(151);
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
		public TerminalNode FN() { return getToken(MonkeyParser.FN, 0); }
		public TerminalNode L_PAREN() { return getToken(MonkeyParser.L_PAREN, 0); }
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(MonkeyParser.R_PAREN, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public FunctionLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitFunctionLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionLiteralContext functionLiteral() throws RecognitionException {
		FunctionLiteralContext _localctx = new FunctionLiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(FN);
			setState(154);
			match(L_PAREN);
			setState(155);
			functionParameters();
			setState(156);
			match(R_PAREN);
			setState(157);
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
		public TerminalNode Identifier() { return getToken(MonkeyParser.Identifier, 0); }
		public MoreIdentifiersContext moreIdentifiers() {
			return getRuleContext(MoreIdentifiersContext.class,0);
		}
		public FunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParametersContext functionParameters() throws RecognitionException {
		FunctionParametersContext _localctx = new FunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_functionParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(Identifier);
			setState(160);
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
		public List<TerminalNode> COMMA() { return getTokens(MonkeyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MonkeyParser.COMMA, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(MonkeyParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MonkeyParser.Identifier, i);
		}
		public MoreIdentifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreIdentifiers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitMoreIdentifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoreIdentifiersContext moreIdentifiers() throws RecognitionException {
		MoreIdentifiersContext _localctx = new MoreIdentifiersContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_moreIdentifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(162);
				match(COMMA);
				setState(163);
				match(Identifier);
				}
				}
				setState(168);
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
		public TerminalNode L_BRACE() { return getToken(MonkeyParser.L_BRACE, 0); }
		public HashContentContext hashContent() {
			return getRuleContext(HashContentContext.class,0);
		}
		public MoreHashContentContext moreHashContent() {
			return getRuleContext(MoreHashContentContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(MonkeyParser.R_BRACE, 0); }
		public HashLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hashLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitHashLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HashLiteralContext hashLiteral() throws RecognitionException {
		HashLiteralContext _localctx = new HashLiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_hashLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(L_BRACE);
			setState(170);
			hashContent();
			setState(171);
			moreHashContent();
			setState(172);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(MonkeyParser.COLON, 0); }
		public HashContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hashContent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitHashContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HashContentContext hashContent() throws RecognitionException {
		HashContentContext _localctx = new HashContentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_hashContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			expression();
			setState(175);
			match(COLON);
			setState(176);
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
		public MoreHashContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreHashContent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitMoreHashContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoreHashContentContext moreHashContent() throws RecognitionException {
		MoreHashContentContext _localctx = new MoreHashContentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_moreHashContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(178);
				match(COMMA);
				setState(179);
				hashContent();
				}
				}
				setState(184);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MoreExpressionsContext moreExpressions() {
			return getRuleContext(MoreExpressionsContext.class,0);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expressionList);
		try {
			setState(189);
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
			case Number:
			case String:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				expression();
				setState(186);
				moreExpressions();
				}
				break;
			case R_PAREN:
			case R_BRACK:
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
		public MoreExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreExpressions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitMoreExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoreExpressionsContext moreExpressions() throws RecognitionException {
		MoreExpressionsContext _localctx = new MoreExpressionsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_moreExpressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(191);
				match(COMMA);
				setState(192);
				expression();
				}
				}
				setState(197);
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
		public TerminalNode PUTS() { return getToken(MonkeyParser.PUTS, 0); }
		public TerminalNode L_PAREN() { return getToken(MonkeyParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(MonkeyParser.R_PAREN, 0); }
		public PrintExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitPrintExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintExpressionContext printExpression() throws RecognitionException {
		PrintExpressionContext _localctx = new PrintExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_printExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(PUTS);
			setState(199);
			match(L_PAREN);
			setState(200);
			expression();
			setState(201);
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
		public IfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitIfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExpressionContext ifExpression() throws RecognitionException {
		IfExpressionContext _localctx = new IfExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ifExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(IF);
			setState(204);
			expression();
			setState(205);
			blockStatement();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(206);
				match(ELSE);
				setState(207);
				blockStatement();
				}
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
		public TerminalNode L_BRACE() { return getToken(MonkeyParser.L_BRACE, 0); }
		public TerminalNode R_BRACE() { return getToken(MonkeyParser.R_BRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MonkeyParserVisitor ) return ((MonkeyParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(L_BRACE);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << RETURN) | (1L << FN) | (1L << PUTS) | (1L << IF) | (1L << LEN) | (1L << FIRST) | (1L << LAST) | (1L << REST) | (1L << PUSH) | (1L << L_PAREN) | (1L << L_BRACE) | (1L << L_BRACK) | (1L << TRUE) | (1L << FALSE) | (1L << Number) | (1L << String) | (1L << Identifier))) != 0)) {
				{
				{
				setState(211);
				statement();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00de\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\7\2<\n\2\f\2\16\2?\13\2\3"+
		"\3\3\3\3\3\3\3\3\3\5\3F\n\3\3\4\3\4\3\4\3\4\5\4L\n\4\3\5\3\5\5\5P\n\5"+
		"\3\6\3\6\5\6T\n\6\3\7\3\7\3\7\3\b\3\b\7\b[\n\b\f\b\16\b^\13\b\3\t\3\t"+
		"\3\t\3\n\3\n\7\ne\n\n\f\n\16\nh\13\n\3\13\3\13\3\13\3\f\3\f\7\fo\n\f\f"+
		"\f\16\fr\13\f\3\r\3\r\3\r\5\rw\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0094\n\20\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\7\25\u00a7"+
		"\n\25\f\25\16\25\u00aa\13\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\7\30\u00b7\n\30\f\30\16\30\u00ba\13\30\3\31\3\31\3\31\3"+
		"\31\5\31\u00c0\n\31\3\32\3\32\7\32\u00c4\n\32\f\32\16\32\u00c7\13\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\5\34\u00d3\n\34\3\35"+
		"\3\35\7\35\u00d7\n\35\f\35\16\35\u00da\13\35\3\35\3\35\3\35\2\2\36\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\6\3\2\30\34"+
		"\3\2\35\36\3\2\37 \3\2\t\r\2\u00dd\2=\3\2\2\2\4E\3\2\2\2\6G\3\2\2\2\b"+
		"M\3\2\2\2\nQ\3\2\2\2\fU\3\2\2\2\16\\\3\2\2\2\20_\3\2\2\2\22f\3\2\2\2\24"+
		"i\3\2\2\2\26p\3\2\2\2\30s\3\2\2\2\32x\3\2\2\2\34|\3\2\2\2\36\u0093\3\2"+
		"\2\2 \u0095\3\2\2\2\"\u0097\3\2\2\2$\u009b\3\2\2\2&\u00a1\3\2\2\2(\u00a8"+
		"\3\2\2\2*\u00ab\3\2\2\2,\u00b0\3\2\2\2.\u00b8\3\2\2\2\60\u00bf\3\2\2\2"+
		"\62\u00c5\3\2\2\2\64\u00c8\3\2\2\2\66\u00cd\3\2\2\28\u00d4\3\2\2\2:<\5"+
		"\4\3\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\3\3\2\2\2?=\3\2\2\2@A"+
		"\7\3\2\2AF\5\6\4\2BC\7\4\2\2CF\5\b\5\2DF\5\n\6\2E@\3\2\2\2EB\3\2\2\2E"+
		"D\3\2\2\2F\5\3\2\2\2GH\7%\2\2HI\7\27\2\2IK\5\f\7\2JL\7\24\2\2KJ\3\2\2"+
		"\2KL\3\2\2\2L\7\3\2\2\2MO\5\f\7\2NP\7\24\2\2ON\3\2\2\2OP\3\2\2\2P\t\3"+
		"\2\2\2QS\5\f\7\2RT\7\24\2\2SR\3\2\2\2ST\3\2\2\2T\13\3\2\2\2UV\5\20\t\2"+
		"VW\5\16\b\2W\r\3\2\2\2XY\t\2\2\2Y[\5\20\t\2ZX\3\2\2\2[^\3\2\2\2\\Z\3\2"+
		"\2\2\\]\3\2\2\2]\17\3\2\2\2^\\\3\2\2\2_`\5\24\13\2`a\5\22\n\2a\21\3\2"+
		"\2\2bc\t\3\2\2ce\5\24\13\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\23"+
		"\3\2\2\2hf\3\2\2\2ij\5\30\r\2jk\5\26\f\2k\25\3\2\2\2lm\t\4\2\2mo\5\30"+
		"\r\2nl\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\27\3\2\2\2rp\3\2\2\2sv\5"+
		"\36\20\2tw\5\32\16\2uw\5\34\17\2vt\3\2\2\2vu\3\2\2\2vw\3\2\2\2w\31\3\2"+
		"\2\2xy\7\22\2\2yz\5\f\7\2z{\7\23\2\2{\33\3\2\2\2|}\7\16\2\2}~\5\60\31"+
		"\2~\177\7\17\2\2\177\35\3\2\2\2\u0080\u0094\7)\2\2\u0081\u0094\7*\2\2"+
		"\u0082\u0094\7+\2\2\u0083\u0094\7!\2\2\u0084\u0094\7\"\2\2\u0085\u0086"+
		"\7\16\2\2\u0086\u0087\5\f\7\2\u0087\u0088\7\17\2\2\u0088\u0094\3\2\2\2"+
		"\u0089\u0094\5\"\22\2\u008a\u008b\5 \21\2\u008b\u008c\7\16\2\2\u008c\u008d"+
		"\5\60\31\2\u008d\u008e\7\17\2\2\u008e\u0094\3\2\2\2\u008f\u0094\5$\23"+
		"\2\u0090\u0094\5*\26\2\u0091\u0094\5\64\33\2\u0092\u0094\5\66\34\2\u0093"+
		"\u0080\3\2\2\2\u0093\u0081\3\2\2\2\u0093\u0082\3\2\2\2\u0093\u0083\3\2"+
		"\2\2\u0093\u0084\3\2\2\2\u0093\u0085\3\2\2\2\u0093\u0089\3\2\2\2\u0093"+
		"\u008a\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0090\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0093\u0092\3\2\2\2\u0094\37\3\2\2\2\u0095\u0096\t\5\2\2\u0096!\3"+
		"\2\2\2\u0097\u0098\7\22\2\2\u0098\u0099\5\60\31\2\u0099\u009a\7\23\2\2"+
		"\u009a#\3\2\2\2\u009b\u009c\7\5\2\2\u009c\u009d\7\16\2\2\u009d\u009e\5"+
		"&\24\2\u009e\u009f\7\17\2\2\u009f\u00a0\58\35\2\u00a0%\3\2\2\2\u00a1\u00a2"+
		"\7+\2\2\u00a2\u00a3\5(\25\2\u00a3\'\3\2\2\2\u00a4\u00a5\7\25\2\2\u00a5"+
		"\u00a7\7+\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9)\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac"+
		"\7\20\2\2\u00ac\u00ad\5,\27\2\u00ad\u00ae\5.\30\2\u00ae\u00af\7\21\2\2"+
		"\u00af+\3\2\2\2\u00b0\u00b1\5\f\7\2\u00b1\u00b2\7\26\2\2\u00b2\u00b3\5"+
		"\f\7\2\u00b3-\3\2\2\2\u00b4\u00b5\7\25\2\2\u00b5\u00b7\5,\27\2\u00b6\u00b4"+
		"\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"/\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\5\f\7\2\u00bc\u00bd\5\62\32"+
		"\2\u00bd\u00c0\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00be"+
		"\3\2\2\2\u00c0\61\3\2\2\2\u00c1\u00c2\7\25\2\2\u00c2\u00c4\5\f\7\2\u00c3"+
		"\u00c1\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\63\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7\6\2\2\u00c9\u00ca"+
		"\7\16\2\2\u00ca\u00cb\5\f\7\2\u00cb\u00cc\7\17\2\2\u00cc\65\3\2\2\2\u00cd"+
		"\u00ce\7\7\2\2\u00ce\u00cf\5\f\7\2\u00cf\u00d2\58\35\2\u00d0\u00d1\7\b"+
		"\2\2\u00d1\u00d3\58\35\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\67\3\2\2\2\u00d4\u00d8\7\20\2\2\u00d5\u00d7\5\4\3\2\u00d6\u00d5\3\2\2"+
		"\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db"+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\7\21\2\2\u00dc9\3\2\2\2\22=E"+
		"KOS\\fpv\u0093\u00a8\u00b8\u00bf\u00c5\u00d2\u00d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}