// Generated from Diunisio.g4 by ANTLR 4.7
package classes;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DiunisioLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMENTARIO=1, ALGORITMO=2, TERMINA=3, ENTONCES=4, O=5, Y=6, IGUAL=7, DIFERENTE=8, 
		MAYOR=9, MENOR=10, MAY_IGUAL=11, MEN_IGUAL=12, SUMA=13, MENOS=14, MULT=15, 
		DIV=16, MOD=17, POTENCIA=18, NO=19, DEF=20, RETORNAR=21, INT=22, FLOAT=23, 
		STRING=24, BOOL=25, MATRIZ=26, VECTOR=27, PCOMA=28, ASIGNAR=29, PAREN_AP=30, 
		PAREN_CI=31, LLAVEIZ=32, LLAVEDE=33, ANGIZ=34, ANGDE=35, COMA=36, FINCLASE=37, 
		DOSPUNTOS=38, VERDADERO=39, FALSO=40, NULO=41, SI=42, SI_NO=43, MIENTRAS=44, 
		SELECCIONAR=45, CASO=46, ROMPER=47, HACER=48, PARA=49, DEFECTO=50, CLASE=51, 
		IDENTIFICADOR=52, ENTERO=53, REAL=54, COMPLEJO=55, CADENA=56, ESPACIO=57, 
		OTRO=58;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"COMENTARIO", "ALGORITMO", "TERMINA", "ENTONCES", "O", "Y", "IGUAL", "DIFERENTE", 
		"MAYOR", "MENOR", "MAY_IGUAL", "MEN_IGUAL", "SUMA", "MENOS", "MULT", "DIV", 
		"MOD", "POTENCIA", "NO", "DEF", "RETORNAR", "INT", "FLOAT", "STRING", 
		"BOOL", "MATRIZ", "VECTOR", "PCOMA", "ASIGNAR", "PAREN_AP", "PAREN_CI", 
		"LLAVEIZ", "LLAVEDE", "ANGIZ", "ANGDE", "COMA", "FINCLASE", "DOSPUNTOS", 
		"VERDADERO", "FALSO", "NULO", "SI", "SI_NO", "MIENTRAS", "SELECCIONAR", 
		"CASO", "ROMPER", "HACER", "PARA", "DEFECTO", "CLASE", "IDENTIFICADOR", 
		"ENTERO", "REAL", "COMPLEJO", "CADENA", "ESPACIO", "OTRO"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'ALGORITMO'", "'.'", "'entonces'", "'||'", "'&&'", "'=='", 
		"'!='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"'^'", "'!'", "'def'", "'retornar'", "'entero'", "'decimal'", "'cadena'", 
		"'booleano'", "'matriz'", "'vector'", "';'", "'='", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "','", "'_'", "':'", "'verdadero'", "'falso'", "'nulo'", 
		"'si'", "'si_no'", "'mientras'", "'seleccionar'", "'caso'", "'romper'", 
		"'hacer'", "'para'", "'defecto'", "'clase'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMENTARIO", "ALGORITMO", "TERMINA", "ENTONCES", "O", "Y", "IGUAL", 
		"DIFERENTE", "MAYOR", "MENOR", "MAY_IGUAL", "MEN_IGUAL", "SUMA", "MENOS", 
		"MULT", "DIV", "MOD", "POTENCIA", "NO", "DEF", "RETORNAR", "INT", "FLOAT", 
		"STRING", "BOOL", "MATRIZ", "VECTOR", "PCOMA", "ASIGNAR", "PAREN_AP", 
		"PAREN_CI", "LLAVEIZ", "LLAVEDE", "ANGIZ", "ANGDE", "COMA", "FINCLASE", 
		"DOSPUNTOS", "VERDADERO", "FALSO", "NULO", "SI", "SI_NO", "MIENTRAS", 
		"SELECCIONAR", "CASO", "ROMPER", "HACER", "PARA", "DEFECTO", "CLASE", 
		"IDENTIFICADOR", "ENTERO", "REAL", "COMPLEJO", "CADENA", "ESPACIO", "OTRO"
	};
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


	public DiunisioLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Diunisio.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u01ae\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\7\2"+
		"z\n\2\f\2\16\2}\13\2\3\2\3\2\3\2\3\2\7\2\u0083\n\2\f\2\16\2\u0086\13\2"+
		"\3\2\3\2\5\2\u008a\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3"+
		"%\3%\3&\3&\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*"+
		"\3*\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\65\3\65\7\65\u0171\n\65\f\65\16\65\u0174\13\65\3\66\6\66\u0177\n\66\r"+
		"\66\16\66\u0178\3\67\7\67\u017c\n\67\f\67\16\67\u017f\13\67\3\67\3\67"+
		"\7\67\u0183\n\67\f\67\16\67\u0186\13\67\3\67\3\67\5\67\u018a\n\67\3\67"+
		"\6\67\u018d\n\67\r\67\16\67\u018e\5\67\u0191\n\67\38\38\58\u0195\n8\3"+
		"8\38\38\58\u019a\n8\38\38\39\39\39\39\79\u01a2\n9\f9\169\u01a5\139\39"+
		"\39\3:\3:\3:\3:\3;\3;\3\u0084\2<\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<\3\2\13\4\2\f\f\17\17\5\2C\\aac"+
		"|\6\2\62;C\\aac|\3\2\62;\4\2GGgg\4\2--//\5\2--//~~\5\2\f\f\17\17$$\5\2"+
		"\13\f\17\17\"\"\2\u01bc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\3"+
		"\u0089\3\2\2\2\5\u008d\3\2\2\2\7\u0097\3\2\2\2\t\u0099\3\2\2\2\13\u00a2"+
		"\3\2\2\2\r\u00a5\3\2\2\2\17\u00a8\3\2\2\2\21\u00ab\3\2\2\2\23\u00ae\3"+
		"\2\2\2\25\u00b0\3\2\2\2\27\u00b2\3\2\2\2\31\u00b5\3\2\2\2\33\u00b8\3\2"+
		"\2\2\35\u00ba\3\2\2\2\37\u00bc\3\2\2\2!\u00be\3\2\2\2#\u00c0\3\2\2\2%"+
		"\u00c2\3\2\2\2\'\u00c4\3\2\2\2)\u00c6\3\2\2\2+\u00ca\3\2\2\2-\u00d3\3"+
		"\2\2\2/\u00da\3\2\2\2\61\u00e2\3\2\2\2\63\u00e9\3\2\2\2\65\u00f2\3\2\2"+
		"\2\67\u00f9\3\2\2\29\u0100\3\2\2\2;\u0102\3\2\2\2=\u0104\3\2\2\2?\u0106"+
		"\3\2\2\2A\u0108\3\2\2\2C\u010a\3\2\2\2E\u010c\3\2\2\2G\u010e\3\2\2\2I"+
		"\u0110\3\2\2\2K\u0112\3\2\2\2M\u0114\3\2\2\2O\u0116\3\2\2\2Q\u0120\3\2"+
		"\2\2S\u0126\3\2\2\2U\u012b\3\2\2\2W\u012e\3\2\2\2Y\u0134\3\2\2\2[\u013d"+
		"\3\2\2\2]\u0149\3\2\2\2_\u014e\3\2\2\2a\u0155\3\2\2\2c\u015b\3\2\2\2e"+
		"\u0160\3\2\2\2g\u0168\3\2\2\2i\u016e\3\2\2\2k\u0176\3\2\2\2m\u017d\3\2"+
		"\2\2o\u0194\3\2\2\2q\u019d\3\2\2\2s\u01a8\3\2\2\2u\u01ac\3\2\2\2w{\7%"+
		"\2\2xz\n\2\2\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\u008a\3\2\2\2"+
		"}{\3\2\2\2~\177\7\61\2\2\177\u0080\7,\2\2\u0080\u0084\3\2\2\2\u0081\u0083"+
		"\13\2\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0085\3\2\2\2"+
		"\u0084\u0082\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088"+
		"\7,\2\2\u0088\u008a\7\61\2\2\u0089w\3\2\2\2\u0089~\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u008c\b\2\2\2\u008c\4\3\2\2\2\u008d\u008e\7C\2\2\u008e"+
		"\u008f\7N\2\2\u008f\u0090\7I\2\2\u0090\u0091\7Q\2\2\u0091\u0092\7T\2\2"+
		"\u0092\u0093\7K\2\2\u0093\u0094\7V\2\2\u0094\u0095\7O\2\2\u0095\u0096"+
		"\7Q\2\2\u0096\6\3\2\2\2\u0097\u0098\7\60\2\2\u0098\b\3\2\2\2\u0099\u009a"+
		"\7g\2\2\u009a\u009b\7p\2\2\u009b\u009c\7v\2\2\u009c\u009d\7q\2\2\u009d"+
		"\u009e\7p\2\2\u009e\u009f\7e\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7u\2\2"+
		"\u00a1\n\3\2\2\2\u00a2\u00a3\7~\2\2\u00a3\u00a4\7~\2\2\u00a4\f\3\2\2\2"+
		"\u00a5\u00a6\7(\2\2\u00a6\u00a7\7(\2\2\u00a7\16\3\2\2\2\u00a8\u00a9\7"+
		"?\2\2\u00a9\u00aa\7?\2\2\u00aa\20\3\2\2\2\u00ab\u00ac\7#\2\2\u00ac\u00ad"+
		"\7?\2\2\u00ad\22\3\2\2\2\u00ae\u00af\7@\2\2\u00af\24\3\2\2\2\u00b0\u00b1"+
		"\7>\2\2\u00b1\26\3\2\2\2\u00b2\u00b3\7@\2\2\u00b3\u00b4\7?\2\2\u00b4\30"+
		"\3\2\2\2\u00b5\u00b6\7>\2\2\u00b6\u00b7\7?\2\2\u00b7\32\3\2\2\2\u00b8"+
		"\u00b9\7-\2\2\u00b9\34\3\2\2\2\u00ba\u00bb\7/\2\2\u00bb\36\3\2\2\2\u00bc"+
		"\u00bd\7,\2\2\u00bd \3\2\2\2\u00be\u00bf\7\61\2\2\u00bf\"\3\2\2\2\u00c0"+
		"\u00c1\7\'\2\2\u00c1$\3\2\2\2\u00c2\u00c3\7`\2\2\u00c3&\3\2\2\2\u00c4"+
		"\u00c5\7#\2\2\u00c5(\3\2\2\2\u00c6\u00c7\7f\2\2\u00c7\u00c8\7g\2\2\u00c8"+
		"\u00c9\7h\2\2\u00c9*\3\2\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7g\2\2\u00cc"+
		"\u00cd\7v\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7p\2\2"+
		"\u00d0\u00d1\7c\2\2\u00d1\u00d2\7t\2\2\u00d2,\3\2\2\2\u00d3\u00d4\7g\2"+
		"\2\u00d4\u00d5\7p\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8"+
		"\7t\2\2\u00d8\u00d9\7q\2\2\u00d9.\3\2\2\2\u00da\u00db\7f\2\2\u00db\u00dc"+
		"\7g\2\2\u00dc\u00dd\7e\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7o\2\2\u00df"+
		"\u00e0\7c\2\2\u00e0\u00e1\7n\2\2\u00e1\60\3\2\2\2\u00e2\u00e3\7e\2\2\u00e3"+
		"\u00e4\7c\2\2\u00e4\u00e5\7f\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7p\2\2"+
		"\u00e7\u00e8\7c\2\2\u00e8\62\3\2\2\2\u00e9\u00ea\7d\2\2\u00ea\u00eb\7"+
		"q\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef"+
		"\7c\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7q\2\2\u00f1\64\3\2\2\2\u00f2\u00f3"+
		"\7o\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7t\2\2\u00f6"+
		"\u00f7\7k\2\2\u00f7\u00f8\7|\2\2\u00f8\66\3\2\2\2\u00f9\u00fa\7x\2\2\u00fa"+
		"\u00fb\7g\2\2\u00fb\u00fc\7e\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe\7q\2\2"+
		"\u00fe\u00ff\7t\2\2\u00ff8\3\2\2\2\u0100\u0101\7=\2\2\u0101:\3\2\2\2\u0102"+
		"\u0103\7?\2\2\u0103<\3\2\2\2\u0104\u0105\7*\2\2\u0105>\3\2\2\2\u0106\u0107"+
		"\7+\2\2\u0107@\3\2\2\2\u0108\u0109\7}\2\2\u0109B\3\2\2\2\u010a\u010b\7"+
		"\177\2\2\u010bD\3\2\2\2\u010c\u010d\7]\2\2\u010dF\3\2\2\2\u010e\u010f"+
		"\7_\2\2\u010fH\3\2\2\2\u0110\u0111\7.\2\2\u0111J\3\2\2\2\u0112\u0113\7"+
		"a\2\2\u0113L\3\2\2\2\u0114\u0115\7<\2\2\u0115N\3\2\2\2\u0116\u0117\7x"+
		"\2\2\u0117\u0118\7g\2\2\u0118\u0119\7t\2\2\u0119\u011a\7f\2\2\u011a\u011b"+
		"\7c\2\2\u011b\u011c\7f\2\2\u011c\u011d\7g\2\2\u011d\u011e\7t\2\2\u011e"+
		"\u011f\7q\2\2\u011fP\3\2\2\2\u0120\u0121\7h\2\2\u0121\u0122\7c\2\2\u0122"+
		"\u0123\7n\2\2\u0123\u0124\7u\2\2\u0124\u0125\7q\2\2\u0125R\3\2\2\2\u0126"+
		"\u0127\7p\2\2\u0127\u0128\7w\2\2\u0128\u0129\7n\2\2\u0129\u012a\7q\2\2"+
		"\u012aT\3\2\2\2\u012b\u012c\7u\2\2\u012c\u012d\7k\2\2\u012dV\3\2\2\2\u012e"+
		"\u012f\7u\2\2\u012f\u0130\7k\2\2\u0130\u0131\7a\2\2\u0131\u0132\7p\2\2"+
		"\u0132\u0133\7q\2\2\u0133X\3\2\2\2\u0134\u0135\7o\2\2\u0135\u0136\7k\2"+
		"\2\u0136\u0137\7g\2\2\u0137\u0138\7p\2\2\u0138\u0139\7v\2\2\u0139\u013a"+
		"\7t\2\2\u013a\u013b\7c\2\2\u013b\u013c\7u\2\2\u013cZ\3\2\2\2\u013d\u013e"+
		"\7u\2\2\u013e\u013f\7g\2\2\u013f\u0140\7n\2\2\u0140\u0141\7g\2\2\u0141"+
		"\u0142\7e\2\2\u0142\u0143\7e\2\2\u0143\u0144\7k\2\2\u0144\u0145\7q\2\2"+
		"\u0145\u0146\7p\2\2\u0146\u0147\7c\2\2\u0147\u0148\7t\2\2\u0148\\\3\2"+
		"\2\2\u0149\u014a\7e\2\2\u014a\u014b\7c\2\2\u014b\u014c\7u\2\2\u014c\u014d"+
		"\7q\2\2\u014d^\3\2\2\2\u014e\u014f\7t\2\2\u014f\u0150\7q\2\2\u0150\u0151"+
		"\7o\2\2\u0151\u0152\7r\2\2\u0152\u0153\7g\2\2\u0153\u0154\7t\2\2\u0154"+
		"`\3\2\2\2\u0155\u0156\7j\2\2\u0156\u0157\7c\2\2\u0157\u0158\7e\2\2\u0158"+
		"\u0159\7g\2\2\u0159\u015a\7t\2\2\u015ab\3\2\2\2\u015b\u015c\7r\2\2\u015c"+
		"\u015d\7c\2\2\u015d\u015e\7t\2\2\u015e\u015f\7c\2\2\u015fd\3\2\2\2\u0160"+
		"\u0161\7f\2\2\u0161\u0162\7g\2\2\u0162\u0163\7h\2\2\u0163\u0164\7g\2\2"+
		"\u0164\u0165\7e\2\2\u0165\u0166\7v\2\2\u0166\u0167\7q\2\2\u0167f\3\2\2"+
		"\2\u0168\u0169\7e\2\2\u0169\u016a\7n\2\2\u016a\u016b\7c\2\2\u016b\u016c"+
		"\7u\2\2\u016c\u016d\7g\2\2\u016dh\3\2\2\2\u016e\u0172\t\3\2\2\u016f\u0171"+
		"\t\4\2\2\u0170\u016f\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172"+
		"\u0173\3\2\2\2\u0173j\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0177\t\5\2\2"+
		"\u0176\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179"+
		"\3\2\2\2\u0179l\3\2\2\2\u017a\u017c\t\5\2\2\u017b\u017a\3\2\2\2\u017c"+
		"\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2"+
		"\2\2\u017f\u017d\3\2\2\2\u0180\u0184\7\60\2\2\u0181\u0183\t\5\2\2\u0182"+
		"\u0181\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2"+
		"\2\2\u0185\u0190\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0189\t\6\2\2\u0188"+
		"\u018a\t\7\2\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\3\2"+
		"\2\2\u018b\u018d\t\5\2\2\u018c\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u0187\3\2"+
		"\2\2\u0190\u0191\3\2\2\2\u0191n\3\2\2\2\u0192\u0195\5k\66\2\u0193\u0195"+
		"\5m\67\2\u0194\u0192\3\2\2\2\u0194\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u0199\t\b\2\2\u0197\u019a\5k\66\2\u0198\u019a\5m\67\2\u0199\u0197\3\2"+
		"\2\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"\u019c\7k\2\2\u019cp\3\2\2\2\u019d\u01a3\7$\2\2\u019e\u01a2\n\t\2\2\u019f"+
		"\u01a0\7$\2\2\u01a0\u01a2\7$\2\2\u01a1\u019e\3\2\2\2\u01a1\u019f\3\2\2"+
		"\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6"+
		"\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a7\7$\2\2\u01a7r\3\2\2\2\u01a8\u01a9"+
		"\t\n\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\b:\2\2\u01abt\3\2\2\2\u01ac\u01ad"+
		"\13\2\2\2\u01adv\3\2\2\2\21\2{\u0084\u0089\u0172\u0178\u017d\u0184\u0189"+
		"\u018e\u0190\u0194\u0199\u01a1\u01a3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}