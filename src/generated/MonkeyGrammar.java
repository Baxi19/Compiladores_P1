// Generated from C:/Users/Baxi/Desktop/Compiladores_P1\MonkeyGrammar.g4 by ANTLR 4.8
package generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MonkeyGrammar extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LET=1, RETURN=2, FN=3, PUTS=4, IF=5, ELSE=6, LEN=7, FIRST=8, LAST=9, REST=10, 
		PUSH=11, INTEGER=12, STRING=13, TRUE=14, FALSE=15, BooleanLiteral=16, 
		L_PAREN=17, R_PAREN=18, L_BRACE=19, R_BRACE=20, L_BRACK=21, R_BRACK=22, 
		PYCOMMA=23, COMMA=24, DOT=25, COLON=26, Number=27, String=28, Identifier=29, 
		ASSIGN=30, GT=31, LT=32, LE=33, GE=34, EQUAL=35, ADD=36, SUB=37, MUL=38, 
		DIV=39, WS=40, COMMENT=41, BLOCK_COMMENT=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LET", "RETURN", "FN", "PUTS", "IF", "ELSE", "LEN", "FIRST", "LAST", 
			"REST", "PUSH", "INTEGER", "STRING", "TRUE", "FALSE", "BooleanLiteral", 
			"L_PAREN", "R_PAREN", "L_BRACE", "R_BRACE", "L_BRACK", "R_BRACK", "PYCOMMA", 
			"COMMA", "DOT", "COLON", "Number", "String", "Identifier", "ASSIGN", 
			"GT", "LT", "LE", "GE", "EQUAL", "ADD", "SUB", "MUL", "DIV", "WS", "COMMENT", 
			"BLOCK_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "'return'", "'fn'", "'puts'", "'if'", "'else'", "'len'", 
			"'first'", "'last'", "'rest'", "'push'", "'Integer'", "'String'", "'true'", 
			"'false'", null, "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", 
			"'.'", "':'", null, null, null, "'='", "'>'", "'<'", "'<='", "'>='", 
			"'=='", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LET", "RETURN", "FN", "PUTS", "IF", "ELSE", "LEN", "FIRST", "LAST", 
			"REST", "PUSH", "INTEGER", "STRING", "TRUE", "FALSE", "BooleanLiteral", 
			"L_PAREN", "R_PAREN", "L_BRACE", "R_BRACE", "L_BRACK", "R_BRACK", "PYCOMMA", 
			"COMMA", "DOT", "COLON", "Number", "String", "Identifier", "ASSIGN", 
			"GT", "LT", "LE", "GE", "EQUAL", "ADD", "SUB", "MUL", "DIV", "WS", "COMMENT", 
			"BLOCK_COMMENT"
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


	public MonkeyGrammar(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MonkeyGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0114\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00af\n\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\6\34\u00c6\n\34\r\34\16\34\u00c7\3\35\3\35\6\35\u00cc\n\35"+
		"\r\35\16\35\u00cd\3\35\3\35\3\36\3\36\7\36\u00d4\n\36\f\36\16\36\u00d7"+
		"\13\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3"+
		"&\3\'\3\'\3(\3(\3)\6)\u00f1\n)\r)\16)\u00f2\3)\3)\3*\3*\3*\3*\7*\u00fb"+
		"\n*\f*\16*\u00fe\13*\3*\5*\u0101\n*\3*\3*\3*\3*\3+\3+\3+\3+\7+\u010b\n"+
		"+\f+\16+\u010e\13+\3+\3+\3+\3+\3+\3\u010c\2,\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,\3\2\b\3\2\62;\3\2$$\3\2c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f"+
		"\f\17\17\2\u011b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5[\3\2\2\2\7b\3\2\2\2\te\3\2\2\2"+
		"\13j\3\2\2\2\rm\3\2\2\2\17r\3\2\2\2\21v\3\2\2\2\23|\3\2\2\2\25\u0081\3"+
		"\2\2\2\27\u0086\3\2\2\2\31\u008b\3\2\2\2\33\u0093\3\2\2\2\35\u009a\3\2"+
		"\2\2\37\u009f\3\2\2\2!\u00ae\3\2\2\2#\u00b0\3\2\2\2%\u00b2\3\2\2\2\'\u00b4"+
		"\3\2\2\2)\u00b6\3\2\2\2+\u00b8\3\2\2\2-\u00ba\3\2\2\2/\u00bc\3\2\2\2\61"+
		"\u00be\3\2\2\2\63\u00c0\3\2\2\2\65\u00c2\3\2\2\2\67\u00c5\3\2\2\29\u00c9"+
		"\3\2\2\2;\u00d1\3\2\2\2=\u00d8\3\2\2\2?\u00da\3\2\2\2A\u00dc\3\2\2\2C"+
		"\u00de\3\2\2\2E\u00e1\3\2\2\2G\u00e4\3\2\2\2I\u00e7\3\2\2\2K\u00e9\3\2"+
		"\2\2M\u00eb\3\2\2\2O\u00ed\3\2\2\2Q\u00f0\3\2\2\2S\u00f6\3\2\2\2U\u0106"+
		"\3\2\2\2WX\7n\2\2XY\7g\2\2YZ\7v\2\2Z\4\3\2\2\2[\\\7t\2\2\\]\7g\2\2]^\7"+
		"v\2\2^_\7w\2\2_`\7t\2\2`a\7p\2\2a\6\3\2\2\2bc\7h\2\2cd\7p\2\2d\b\3\2\2"+
		"\2ef\7r\2\2fg\7w\2\2gh\7v\2\2hi\7u\2\2i\n\3\2\2\2jk\7k\2\2kl\7h\2\2l\f"+
		"\3\2\2\2mn\7g\2\2no\7n\2\2op\7u\2\2pq\7g\2\2q\16\3\2\2\2rs\7n\2\2st\7"+
		"g\2\2tu\7p\2\2u\20\3\2\2\2vw\7h\2\2wx\7k\2\2xy\7t\2\2yz\7u\2\2z{\7v\2"+
		"\2{\22\3\2\2\2|}\7n\2\2}~\7c\2\2~\177\7u\2\2\177\u0080\7v\2\2\u0080\24"+
		"\3\2\2\2\u0081\u0082\7t\2\2\u0082\u0083\7g\2\2\u0083\u0084\7u\2\2\u0084"+
		"\u0085\7v\2\2\u0085\26\3\2\2\2\u0086\u0087\7r\2\2\u0087\u0088\7w\2\2\u0088"+
		"\u0089\7u\2\2\u0089\u008a\7j\2\2\u008a\30\3\2\2\2\u008b\u008c\7K\2\2\u008c"+
		"\u008d\7p\2\2\u008d\u008e\7v\2\2\u008e\u008f\7g\2\2\u008f\u0090\7i\2\2"+
		"\u0090\u0091\7g\2\2\u0091\u0092\7t\2\2\u0092\32\3\2\2\2\u0093\u0094\7"+
		"U\2\2\u0094\u0095\7v\2\2\u0095\u0096\7t\2\2\u0096\u0097\7k\2\2\u0097\u0098"+
		"\7p\2\2\u0098\u0099\7i\2\2\u0099\34\3\2\2\2\u009a\u009b\7v\2\2\u009b\u009c"+
		"\7t\2\2\u009c\u009d\7w\2\2\u009d\u009e\7g\2\2\u009e\36\3\2\2\2\u009f\u00a0"+
		"\7h\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7u\2\2\u00a3"+
		"\u00a4\7g\2\2\u00a4 \3\2\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7t\2\2\u00a7"+
		"\u00a8\7w\2\2\u00a8\u00af\7g\2\2\u00a9\u00aa\7h\2\2\u00aa\u00ab\7c\2\2"+
		"\u00ab\u00ac\7n\2\2\u00ac\u00ad\7u\2\2\u00ad\u00af\7g\2\2\u00ae\u00a5"+
		"\3\2\2\2\u00ae\u00a9\3\2\2\2\u00af\"\3\2\2\2\u00b0\u00b1\7*\2\2\u00b1"+
		"$\3\2\2\2\u00b2\u00b3\7+\2\2\u00b3&\3\2\2\2\u00b4\u00b5\7}\2\2\u00b5("+
		"\3\2\2\2\u00b6\u00b7\7\177\2\2\u00b7*\3\2\2\2\u00b8\u00b9\7]\2\2\u00b9"+
		",\3\2\2\2\u00ba\u00bb\7_\2\2\u00bb.\3\2\2\2\u00bc\u00bd\7=\2\2\u00bd\60"+
		"\3\2\2\2\u00be\u00bf\7.\2\2\u00bf\62\3\2\2\2\u00c0\u00c1\7\60\2\2\u00c1"+
		"\64\3\2\2\2\u00c2\u00c3\7<\2\2\u00c3\66\3\2\2\2\u00c4\u00c6\t\2\2\2\u00c5"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c88\3\2\2\2\u00c9\u00cb\7$\2\2\u00ca\u00cc\n\3\2\2\u00cb\u00ca"+
		"\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d0\7$\2\2\u00d0:\3\2\2\2\u00d1\u00d5\t\4\2\2\u00d2"+
		"\u00d4\t\5\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6<\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9"+
		"\7?\2\2\u00d9>\3\2\2\2\u00da\u00db\7@\2\2\u00db@\3\2\2\2\u00dc\u00dd\7"+
		">\2\2\u00ddB\3\2\2\2\u00de\u00df\7>\2\2\u00df\u00e0\7?\2\2\u00e0D\3\2"+
		"\2\2\u00e1\u00e2\7@\2\2\u00e2\u00e3\7?\2\2\u00e3F\3\2\2\2\u00e4\u00e5"+
		"\7?\2\2\u00e5\u00e6\7?\2\2\u00e6H\3\2\2\2\u00e7\u00e8\7-\2\2\u00e8J\3"+
		"\2\2\2\u00e9\u00ea\7/\2\2\u00eaL\3\2\2\2\u00eb\u00ec\7,\2\2\u00ecN\3\2"+
		"\2\2\u00ed\u00ee\7\61\2\2\u00eeP\3\2\2\2\u00ef\u00f1\t\6\2\2\u00f0\u00ef"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f5\b)\2\2\u00f5R\3\2\2\2\u00f6\u00f7\7\61\2\2"+
		"\u00f7\u00f8\7\61\2\2\u00f8\u00fc\3\2\2\2\u00f9\u00fb\n\7\2\2\u00fa\u00f9"+
		"\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0101\7\17\2\2\u0100\u00ff\3"+
		"\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\7\f\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0105\b*\2\2\u0105T\3\2\2\2\u0106\u0107\7\61\2\2"+
		"\u0107\u0108\7,\2\2\u0108\u010c\3\2\2\2\u0109\u010b\13\2\2\2\u010a\u0109"+
		"\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010d\3\2\2\2\u010c\u010a\3\2\2\2\u010d"+
		"\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\7,\2\2\u0110\u0111\7\61"+
		"\2\2\u0111\u0112\3\2\2\2\u0112\u0113\b+\2\2\u0113V\3\2\2\2\f\2\u00ae\u00c7"+
		"\u00cd\u00d3\u00d5\u00f2\u00fc\u0100\u010c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}