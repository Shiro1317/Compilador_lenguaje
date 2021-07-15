// Generated from Lenguaje.g4 by ANTLR 4.8
package isidro.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LenguajeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LIBRERIA=1, CLASE=2, TIPO_DATO=3, PRINT=4, IF=5, ELSE=6, WHILE=7, MASMAS=8, 
		MENOSMENOS=9, AND=10, OR=11, NOT=12, VERDADERO=13, FALSO=14, ID=15, STRING=16, 
		LINE_COMMENT=17, COMMENT=18, MAYOR_QUE=19, MENOR_QUE=20, MAYOR_IGUAL=21, 
		MENOR_IGUAL=22, IGUAL_IGUAL=23, DIFERENTE_QUE=24, IGUAL=25, POR=26, DIV=27, 
		MAS=28, MENOS=29, FLOTA=30, INT=31, LLAVE_A=32, LLAVE_C=33, PAR_A=34, 
		PAR_C=35, PYC=36, NUM=37, ESPACIOS=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LIBRERIA", "CLASE", "TIPO_DATO", "PRINT", "IF", "ELSE", "WHILE", "MASMAS", 
			"MENOSMENOS", "AND", "OR", "NOT", "VERDADERO", "FALSO", "ID", "STRING", 
			"ESC", "LINE_COMMENT", "COMMENT", "MAYOR_QUE", "MENOR_QUE", "MAYOR_IGUAL", 
			"MENOR_IGUAL", "IGUAL_IGUAL", "DIFERENTE_QUE", "IGUAL", "POR", "DIV", 
			"MAS", "MENOS", "FLOTA", "INT", "LLAVE_A", "LLAVE_C", "PAR_A", "PAR_C", 
			"PYC", "NUM", "ESPACIOS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'libreria principal'", "'clase'", null, "'print'", "'if'", "'else'", 
			"'while'", "'++'", "'--'", "'&&'", "'||'", "'!'", "'true'", "'false'", 
			null, null, null, null, "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", 
			"'='", "'*'", "'/'", "'+'", "'-'", null, null, "'{'", "'}'", "'('", "')'", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LIBRERIA", "CLASE", "TIPO_DATO", "PRINT", "IF", "ELSE", "WHILE", 
			"MASMAS", "MENOSMENOS", "AND", "OR", "NOT", "VERDADERO", "FALSO", "ID", 
			"STRING", "LINE_COMMENT", "COMMENT", "MAYOR_QUE", "MENOR_QUE", "MAYOR_IGUAL", 
			"MENOR_IGUAL", "IGUAL_IGUAL", "DIFERENTE_QUE", "IGUAL", "POR", "DIV", 
			"MAS", "MENOS", "FLOTA", "INT", "LLAVE_A", "LLAVE_C", "PAR_A", "PAR_C", 
			"PYC", "NUM", "ESPACIOS"
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


	public LenguajeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lenguaje.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0123\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4\177\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\6\20\u00af\n\20\r\20\16\20\u00b0\3\21\3\21\3\21\7"+
		"\21\u00b6\n\21\f\21\16\21\u00b9\13\21\3\21\3\21\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\7\23\u00c4\n\23\f\23\16\23\u00c7\13\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\7\24\u00d1\n\24\f\24\16\24\u00d4\13\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3"+
		"\37\3\37\3 \6 \u00f6\n \r \16 \u00f7\3 \3 \7 \u00fc\n \f \16 \u00ff\13"+
		" \3 \3 \6 \u0103\n \r \16 \u0104\5 \u0107\n \3!\6!\u010a\n!\r!\16!\u010b"+
		"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\6\'\u0119\n\'\r\'\16\'\u011a\3(\6"+
		"(\u011e\n(\r(\16(\u011f\3(\3(\5\u00b7\u00c5\u00d2\2)\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\2%\23\'"+
		"\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%K"+
		"&M\'O(\3\2\7\4\2C\\c|\b\2$$^^ddppttvv\3\2\62;\5\2\60\60\62\62;;\5\2\13"+
		"\f\17\17\"\"\2\u0130\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5d"+
		"\3\2\2\2\7~\3\2\2\2\t\u0080\3\2\2\2\13\u0086\3\2\2\2\r\u0089\3\2\2\2\17"+
		"\u008e\3\2\2\2\21\u0094\3\2\2\2\23\u0097\3\2\2\2\25\u009a\3\2\2\2\27\u009d"+
		"\3\2\2\2\31\u00a0\3\2\2\2\33\u00a2\3\2\2\2\35\u00a7\3\2\2\2\37\u00ae\3"+
		"\2\2\2!\u00b2\3\2\2\2#\u00bc\3\2\2\2%\u00bf\3\2\2\2\'\u00cc\3\2\2\2)\u00da"+
		"\3\2\2\2+\u00dc\3\2\2\2-\u00de\3\2\2\2/\u00e1\3\2\2\2\61\u00e4\3\2\2\2"+
		"\63\u00e7\3\2\2\2\65\u00ea\3\2\2\2\67\u00ec\3\2\2\29\u00ee\3\2\2\2;\u00f0"+
		"\3\2\2\2=\u00f2\3\2\2\2?\u0106\3\2\2\2A\u0109\3\2\2\2C\u010d\3\2\2\2E"+
		"\u010f\3\2\2\2G\u0111\3\2\2\2I\u0113\3\2\2\2K\u0115\3\2\2\2M\u0118\3\2"+
		"\2\2O\u011d\3\2\2\2QR\7n\2\2RS\7k\2\2ST\7d\2\2TU\7t\2\2UV\7g\2\2VW\7t"+
		"\2\2WX\7k\2\2XY\7c\2\2YZ\7\"\2\2Z[\7r\2\2[\\\7t\2\2\\]\7k\2\2]^\7p\2\2"+
		"^_\7e\2\2_`\7k\2\2`a\7r\2\2ab\7c\2\2bc\7n\2\2c\4\3\2\2\2de\7e\2\2ef\7"+
		"n\2\2fg\7c\2\2gh\7u\2\2hi\7g\2\2i\6\3\2\2\2jk\7k\2\2kl\7p\2\2l\177\7v"+
		"\2\2mn\7h\2\2no\7n\2\2op\7q\2\2pq\7c\2\2q\177\7v\2\2rs\7U\2\2st\7v\2\2"+
		"tu\7t\2\2uv\7k\2\2vw\7p\2\2w\177\7i\2\2xy\7F\2\2yz\7q\2\2z{\7w\2\2{|\7"+
		"d\2\2|}\7n\2\2}\177\7g\2\2~j\3\2\2\2~m\3\2\2\2~r\3\2\2\2~x\3\2\2\2\177"+
		"\b\3\2\2\2\u0080\u0081\7r\2\2\u0081\u0082\7t\2\2\u0082\u0083\7k\2\2\u0083"+
		"\u0084\7p\2\2\u0084\u0085\7v\2\2\u0085\n\3\2\2\2\u0086\u0087\7k\2\2\u0087"+
		"\u0088\7h\2\2\u0088\f\3\2\2\2\u0089\u008a\7g\2\2\u008a\u008b\7n\2\2\u008b"+
		"\u008c\7u\2\2\u008c\u008d\7g\2\2\u008d\16\3\2\2\2\u008e\u008f\7y\2\2\u008f"+
		"\u0090\7j\2\2\u0090\u0091\7k\2\2\u0091\u0092\7n\2\2\u0092\u0093\7g\2\2"+
		"\u0093\20\3\2\2\2\u0094\u0095\7-\2\2\u0095\u0096\7-\2\2\u0096\22\3\2\2"+
		"\2\u0097\u0098\7/\2\2\u0098\u0099\7/\2\2\u0099\24\3\2\2\2\u009a\u009b"+
		"\7(\2\2\u009b\u009c\7(\2\2\u009c\26\3\2\2\2\u009d\u009e\7~\2\2\u009e\u009f"+
		"\7~\2\2\u009f\30\3\2\2\2\u00a0\u00a1\7#\2\2\u00a1\32\3\2\2\2\u00a2\u00a3"+
		"\7v\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7w\2\2\u00a5\u00a6\7g\2\2\u00a6"+
		"\34\3\2\2\2\u00a7\u00a8\7h\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7n\2\2\u00aa"+
		"\u00ab\7u\2\2\u00ab\u00ac\7g\2\2\u00ac\36\3\2\2\2\u00ad\u00af\t\2\2\2"+
		"\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1"+
		"\3\2\2\2\u00b1 \3\2\2\2\u00b2\u00b7\7$\2\2\u00b3\u00b6\5#\22\2\u00b4\u00b6"+
		"\13\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2"+
		"\u00b7\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00ba\u00bb\7$\2\2\u00bb\"\3\2\2\2\u00bc\u00bd\7^\2\2\u00bd\u00be"+
		"\t\3\2\2\u00be$\3\2\2\2\u00bf\u00c0\7\61\2\2\u00c0\u00c1\7\61\2\2\u00c1"+
		"\u00c5\3\2\2\2\u00c2\u00c4\13\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3"+
		"\2\2\2\u00c5\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00c9\7\f\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\b\23"+
		"\2\2\u00cb&\3\2\2\2\u00cc\u00cd\7\61\2\2\u00cd\u00ce\7,\2\2\u00ce\u00d2"+
		"\3\2\2\2\u00cf\u00d1\13\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2"+
		"\u00d2\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d5\u00d6\7,\2\2\u00d6\u00d7\7\61\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00d9\b\24\2\2\u00d9(\3\2\2\2\u00da\u00db\7@\2\2\u00db*\3\2\2\2\u00dc"+
		"\u00dd\7>\2\2\u00dd,\3\2\2\2\u00de\u00df\7@\2\2\u00df\u00e0\7?\2\2\u00e0"+
		".\3\2\2\2\u00e1\u00e2\7>\2\2\u00e2\u00e3\7?\2\2\u00e3\60\3\2\2\2\u00e4"+
		"\u00e5\7?\2\2\u00e5\u00e6\7?\2\2\u00e6\62\3\2\2\2\u00e7\u00e8\7#\2\2\u00e8"+
		"\u00e9\7?\2\2\u00e9\64\3\2\2\2\u00ea\u00eb\7?\2\2\u00eb\66\3\2\2\2\u00ec"+
		"\u00ed\7,\2\2\u00ed8\3\2\2\2\u00ee\u00ef\7\61\2\2\u00ef:\3\2\2\2\u00f0"+
		"\u00f1\7-\2\2\u00f1<\3\2\2\2\u00f2\u00f3\7/\2\2\u00f3>\3\2\2\2\u00f4\u00f6"+
		"\t\4\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fd\7\60\2\2\u00fa\u00fc\t"+
		"\4\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0107\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0102\7\60"+
		"\2\2\u0101\u0103\t\5\2\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u00f5\3\2"+
		"\2\2\u0106\u0100\3\2\2\2\u0107@\3\2\2\2\u0108\u010a\t\4\2\2\u0109\u0108"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"B\3\2\2\2\u010d\u010e\7}\2\2\u010eD\3\2\2\2\u010f\u0110\7\177\2\2\u0110"+
		"F\3\2\2\2\u0111\u0112\7*\2\2\u0112H\3\2\2\2\u0113\u0114\7+\2\2\u0114J"+
		"\3\2\2\2\u0115\u0116\7=\2\2\u0116L\3\2\2\2\u0117\u0119\t\4\2\2\u0118\u0117"+
		"\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"N\3\2\2\2\u011c\u011e\t\6\2\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2"+
		"\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122"+
		"\b(\2\2\u0122P\3\2\2\2\20\2~\u00b0\u00b5\u00b7\u00c5\u00d2\u00f7\u00fd"+
		"\u0104\u0106\u010b\u011a\u011f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}