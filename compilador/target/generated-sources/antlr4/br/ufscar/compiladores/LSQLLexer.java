// Generated from br/ufscar/compiladores/LSQL.g4 by ANTLR 4.3
package br.ufscar.compiladores;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LSQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INICIO=1, FIM=2, OP_MAIS=3, OP_MENOS=4, OP_MULT=5, OP_DIV=6, OP_MAIOR=7, 
		OP_MENOR=8, OP_MAIOR_IGUAL=9, OP_MENOR_IGUAL=10, OP_DIFERENTE=11, OP_IGUAL=12, 
		ABRE_PARENTESE=13, FECHA_PARENTESE=14, VIRGULA=15, PONTO=16, ABRE_COLCHETE=17, 
		FECHA_COLCHETE=18, SETA=19, VERDADEIRO=20, FALSO=21, OP_OU=22, OP_E=23, 
		NAO=24, VARCHAR=25, TEXTO=26, INTEIRO=27, REAL=28, LOGICO=29, MOSTRA=30, 
		CRIA=31, ATUALIZA=32, APAGA=33, INSERE=34, TODOS=35, ONDE=36, PARA=37, 
		IDENT=38, COMENTARIO=39, ESC_SEQ=40, CADEIA=41, NUM_INT=42, NUM_REAL=43, 
		WS=44, UNDEFINED_CHAR=45;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'"
	};
	public static final String[] ruleNames = {
		"INICIO", "FIM", "OP_MAIS", "OP_MENOS", "OP_MULT", "OP_DIV", "OP_MAIOR", 
		"OP_MENOR", "OP_MAIOR_IGUAL", "OP_MENOR_IGUAL", "OP_DIFERENTE", "OP_IGUAL", 
		"ABRE_PARENTESE", "FECHA_PARENTESE", "VIRGULA", "PONTO", "ABRE_COLCHETE", 
		"FECHA_COLCHETE", "SETA", "VERDADEIRO", "FALSO", "OP_OU", "OP_E", "NAO", 
		"VARCHAR", "TEXTO", "INTEIRO", "REAL", "LOGICO", "MOSTRA", "CRIA", "ATUALIZA", 
		"APAGA", "INSERE", "TODOS", "ONDE", "PARA", "IDENT", "COMENTARIO", "ESC_SEQ", 
		"CADEIA", "NUM_INT", "NUM_REAL", "WS", "UNDEFINED_CHAR"
	};


	public LSQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LSQL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 43: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2/\u0132\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"&\3\'\3\'\7\'\u00ff\n\'\f\'\16\'\u0102\13\'\3(\3(\7(\u0106\n(\f(\16(\u0109"+
		"\13(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\7*\u0115\n*\f*\16*\u0118\13*\3*\3*"+
		"\3+\6+\u011d\n+\r+\16+\u011e\3,\6,\u0122\n,\r,\16,\u0123\3,\3,\6,\u0128"+
		"\n,\r,\16,\u0129\5,\u012c\n,\3-\3-\3-\3.\3.\2\2/\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\5\2\f\f\17\17\177\177\4"+
		"\2\f\f$$\5\2\13\f\17\17\"\"\u0139\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\3]\3\2\2\2\5d\3\2\2\2\7h\3\2\2\2\tj\3\2\2\2\13l\3\2\2\2\rn\3\2"+
		"\2\2\17p\3\2\2\2\21r\3\2\2\2\23t\3\2\2\2\25w\3\2\2\2\27z\3\2\2\2\31}\3"+
		"\2\2\2\33\177\3\2\2\2\35\u0081\3\2\2\2\37\u0083\3\2\2\2!\u0085\3\2\2\2"+
		"#\u0087\3\2\2\2%\u0089\3\2\2\2\'\u008b\3\2\2\2)\u008e\3\2\2\2+\u0099\3"+
		"\2\2\2-\u009f\3\2\2\2/\u00a2\3\2\2\2\61\u00a4\3\2\2\2\63\u00a8\3\2\2\2"+
		"\65\u00b0\3\2\2\2\67\u00b6\3\2\2\29\u00be\3\2\2\2;\u00c3\3\2\2\2=\u00ca"+
		"\3\2\2\2?\u00d1\3\2\2\2A\u00d6\3\2\2\2C\u00df\3\2\2\2E\u00e5\3\2\2\2G"+
		"\u00ec\3\2\2\2I\u00f2\3\2\2\2K\u00f7\3\2\2\2M\u00fc\3\2\2\2O\u0103\3\2"+
		"\2\2Q\u010e\3\2\2\2S\u0111\3\2\2\2U\u011c\3\2\2\2W\u0121\3\2\2\2Y\u012d"+
		"\3\2\2\2[\u0130\3\2\2\2]^\7k\2\2^_\7p\2\2_`\7k\2\2`a\7e\2\2ab\7k\2\2b"+
		"c\7q\2\2c\4\3\2\2\2de\7h\2\2ef\7k\2\2fg\7o\2\2g\6\3\2\2\2hi\7-\2\2i\b"+
		"\3\2\2\2jk\7/\2\2k\n\3\2\2\2lm\7,\2\2m\f\3\2\2\2no\7\61\2\2o\16\3\2\2"+
		"\2pq\7@\2\2q\20\3\2\2\2rs\7>\2\2s\22\3\2\2\2tu\7@\2\2uv\7?\2\2v\24\3\2"+
		"\2\2wx\7>\2\2xy\7?\2\2y\26\3\2\2\2z{\7>\2\2{|\7@\2\2|\30\3\2\2\2}~\7?"+
		"\2\2~\32\3\2\2\2\177\u0080\7*\2\2\u0080\34\3\2\2\2\u0081\u0082\7+\2\2"+
		"\u0082\36\3\2\2\2\u0083\u0084\7.\2\2\u0084 \3\2\2\2\u0085\u0086\7\60\2"+
		"\2\u0086\"\3\2\2\2\u0087\u0088\7]\2\2\u0088$\3\2\2\2\u0089\u008a\7_\2"+
		"\2\u008a&\3\2\2\2\u008b\u008c\7/\2\2\u008c\u008d\7@\2\2\u008d(\3\2\2\2"+
		"\u008e\u008f\7x\2\2\u008f\u0090\7g\2\2\u0090\u0091\7t\2\2\u0091\u0092"+
		"\7f\2\2\u0092\u0093\7c\2\2\u0093\u0094\7f\2\2\u0094\u0095\7g\2\2\u0095"+
		"\u0096\7k\2\2\u0096\u0097\7t\2\2\u0097\u0098\7q\2\2\u0098*\3\2\2\2\u0099"+
		"\u009a\7h\2\2\u009a\u009b\7c\2\2\u009b\u009c\7n\2\2\u009c\u009d\7u\2\2"+
		"\u009d\u009e\7q\2\2\u009e,\3\2\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7w\2"+
		"\2\u00a1.\3\2\2\2\u00a2\u00a3\7g\2\2\u00a3\60\3\2\2\2\u00a4\u00a5\7p\2"+
		"\2\u00a5\u00a6\7\u00e5\2\2\u00a6\u00a7\7q\2\2\u00a7\62\3\2\2\2\u00a8\u00a9"+
		"\7x\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7e\2\2\u00ac"+
		"\u00ad\7j\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7t\2\2\u00af\64\3\2\2\2\u00b0"+
		"\u00b1\7v\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7z\2\2\u00b3\u00b4\7v\2\2"+
		"\u00b4\u00b5\7q\2\2\u00b5\66\3\2\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7"+
		"p\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc"+
		"\7t\2\2\u00bc\u00bd\7q\2\2\u00bd8\3\2\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0"+
		"\7g\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7n\2\2\u00c2:\3\2\2\2\u00c3\u00c4"+
		"\7n\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6\7i\2\2\u00c6\u00c7\7k\2\2\u00c7"+
		"\u00c8\7e\2\2\u00c8\u00c9\7q\2\2\u00c9<\3\2\2\2\u00ca\u00cb\7o\2\2\u00cb"+
		"\u00cc\7q\2\2\u00cc\u00cd\7u\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7t\2\2"+
		"\u00cf\u00d0\7c\2\2\u00d0>\3\2\2\2\u00d1\u00d2\7e\2\2\u00d2\u00d3\7t\2"+
		"\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7c\2\2\u00d5@\3\2\2\2\u00d6\u00d7\7"+
		"c\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9\7w\2\2\u00d9\u00da\7c\2\2\u00da\u00db"+
		"\7n\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7|\2\2\u00dd\u00de\7c\2\2\u00de"+
		"B\3\2\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7r\2\2\u00e1\u00e2\7c\2\2\u00e2"+
		"\u00e3\7i\2\2\u00e3\u00e4\7c\2\2\u00e4D\3\2\2\2\u00e5\u00e6\7k\2\2\u00e6"+
		"\u00e7\7p\2\2\u00e7\u00e8\7u\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7t\2\2"+
		"\u00ea\u00eb\7g\2\2\u00ebF\3\2\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee\7q\2"+
		"\2\u00ee\u00ef\7f\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1\7u\2\2\u00f1H\3\2"+
		"\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7f\2\2\u00f5\u00f6"+
		"\7g\2\2\u00f6J\3\2\2\2\u00f7\u00f8\7r\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa"+
		"\7t\2\2\u00fa\u00fb\7c\2\2\u00fbL\3\2\2\2\u00fc\u0100\t\2\2\2\u00fd\u00ff"+
		"\t\3\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101N\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0107\7}\2\2\u0104"+
		"\u0106\n\4\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a"+
		"\u010b\7\177\2\2\u010b\u010c\3\2\2\2\u010c\u010d\b(\2\2\u010dP\3\2\2\2"+
		"\u010e\u010f\7^\2\2\u010f\u0110\7$\2\2\u0110R\3\2\2\2\u0111\u0116\7$\2"+
		"\2\u0112\u0115\5Q)\2\u0113\u0115\n\5\2\2\u0114\u0112\3\2\2\2\u0114\u0113"+
		"\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\7$\2\2\u011aT\3\2\2\2\u011b"+
		"\u011d\4\62;\2\u011c\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2"+
		"\2\2\u011e\u011f\3\2\2\2\u011fV\3\2\2\2\u0120\u0122\4\62;\2\u0121\u0120"+
		"\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u012b\3\2\2\2\u0125\u0127\7\60\2\2\u0126\u0128\4\62;\2\u0127\u0126\3"+
		"\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012c\3\2\2\2\u012b\u0125\3\2\2\2\u012b\u012c\3\2\2\2\u012cX\3\2\2\2"+
		"\u012d\u012e\t\6\2\2\u012e\u012f\b-\3\2\u012fZ\3\2\2\2\u0130\u0131\13"+
		"\2\2\2\u0131\\\3\2\2\2\13\2\u0100\u0107\u0114\u0116\u011e\u0123\u0129"+
		"\u012b\4\b\2\2\3-\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}