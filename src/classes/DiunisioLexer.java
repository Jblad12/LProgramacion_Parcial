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
		DIV=16, MOD=17, POTENCIA=18, NO=19, SET=20, GET=21, DEF=22, RETORNAR=23, 
		INT=24, FLOAT=25, STRING=26, BOOL=27, MATRIZ=28, VECTOR=29, PCOMA=30, 
		ASIGNAR=31, PAREN_AP=32, PAREN_CI=33, LLAVEIZ=34, LLAVEDE=35, ANGIZ=36, 
		ANGDE=37, COMA=38, DOSPUNTOS=39, VERDADERO=40, FALSO=41, NULO=42, SI=43, 
		SI_NO=44, MIENTRAS=45, SELECCIONAR=46, CASO=47, ROMPER=48, HACER=49, PARA=50, 
		DEFECTO=51, CLASE=52, IDENTIFICADOR=53, ENTERO=54, REAL=55, COMPLEJO=56, 
		CADENA=57, ESPACIO=58, OTRO=59;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"COMENTARIO", "ALGORITMO", "TERMINA", "ENTONCES", "O", "Y", "IGUAL", "DIFERENTE", 
		"MAYOR", "MENOR", "MAY_IGUAL", "MEN_IGUAL", "SUMA", "MENOS", "MULT", "DIV", 
		"MOD", "POTENCIA", "NO", "SET", "GET", "DEF", "RETORNAR", "INT", "FLOAT", 
		"STRING", "BOOL", "MATRIZ", "VECTOR", "PCOMA", "ASIGNAR", "PAREN_AP", 
		"PAREN_CI", "LLAVEIZ", "LLAVEDE", "ANGIZ", "ANGDE", "COMA", "DOSPUNTOS", 
		"VERDADERO", "FALSO", "NULO", "SI", "SI_NO", "MIENTRAS", "SELECCIONAR", 
		"CASO", "ROMPER", "HACER", "PARA", "DEFECTO", "CLASE", "IDENTIFICADOR", 
		"ENTERO", "REAL", "COMPLEJO", "CADENA", "ESPACIO", "OTRO"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'ALGORITMO'", "'.'", "'entonces'", "'||'", "'&&'", "'=='", 
		"'!='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"'^'", "'!'", "'set'", "'get'", "'def'", "'retornar'", "'entero'", "'decimal'", 
		"'cadena'", "'booleano'", "'matriz'", "'vector'", "';'", "'='", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "','", "':'", "'verdadero'", "'falso'", 
		"'nulo'", "'si'", "'si_no'", "'mientras'", "'seleccionar'", "'caso'", 
		"'romper'", "'hacer'", "'para'", "'defecto'", "'clase'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMENTARIO", "ALGORITMO", "TERMINA", "ENTONCES", "O", "Y", "IGUAL", 
		"DIFERENTE", "MAYOR", "MENOR", "MAY_IGUAL", "MEN_IGUAL", "SUMA", "MENOS", 
		"MULT", "DIV", "MOD", "POTENCIA", "NO", "SET", "GET", "DEF", "RETORNAR", 
		"INT", "FLOAT", "STRING", "BOOL", "MATRIZ", "VECTOR", "PCOMA", "ASIGNAR", 
		"PAREN_AP", "PAREN_CI", "LLAVEIZ", "LLAVEDE", "ANGIZ", "ANGDE", "COMA", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2=\u01b6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\7\2|\n\2\f\2\16\2\177\13\2\3\2\3\2\3\2\3\2\7\2\u0085\n\2\f\2\16\2\u0088"+
		"\13\2\3\2\3\2\5\2\u008c\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3"+
		"-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\7\66\u0179\n\66\f\66"+
		"\16\66\u017c\13\66\3\67\6\67\u017f\n\67\r\67\16\67\u0180\38\78\u0184\n"+
		"8\f8\168\u0187\138\38\38\78\u018b\n8\f8\168\u018e\138\38\38\58\u0192\n"+
		"8\38\68\u0195\n8\r8\168\u0196\58\u0199\n8\39\39\59\u019d\n9\39\39\39\5"+
		"9\u01a2\n9\39\39\3:\3:\3:\3:\7:\u01aa\n:\f:\16:\u01ad\13:\3:\3:\3;\3;"+
		"\3;\3;\3<\3<\3\u0086\2=\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62"+
		"c\63e\64g\65i\66k\67m8o9q:s;u<w=\3\2\13\4\2\f\f\17\17\5\2C\\aac|\6\2\62"+
		";C\\aac|\3\2\62;\4\2GGgg\4\2--//\5\2--//~~\5\2\f\f\17\17$$\5\2\13\f\17"+
		"\17\"\"\2\u01c4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2"+
		"\2\3\u008b\3\2\2\2\5\u008f\3\2\2\2\7\u0099\3\2\2\2\t\u009b\3\2\2\2\13"+
		"\u00a4\3\2\2\2\r\u00a7\3\2\2\2\17\u00aa\3\2\2\2\21\u00ad\3\2\2\2\23\u00b0"+
		"\3\2\2\2\25\u00b2\3\2\2\2\27\u00b4\3\2\2\2\31\u00b7\3\2\2\2\33\u00ba\3"+
		"\2\2\2\35\u00bc\3\2\2\2\37\u00be\3\2\2\2!\u00c0\3\2\2\2#\u00c2\3\2\2\2"+
		"%\u00c4\3\2\2\2\'\u00c6\3\2\2\2)\u00c8\3\2\2\2+\u00cc\3\2\2\2-\u00d0\3"+
		"\2\2\2/\u00d4\3\2\2\2\61\u00dd\3\2\2\2\63\u00e4\3\2\2\2\65\u00ec\3\2\2"+
		"\2\67\u00f3\3\2\2\29\u00fc\3\2\2\2;\u0103\3\2\2\2=\u010a\3\2\2\2?\u010c"+
		"\3\2\2\2A\u010e\3\2\2\2C\u0110\3\2\2\2E\u0112\3\2\2\2G\u0114\3\2\2\2I"+
		"\u0116\3\2\2\2K\u0118\3\2\2\2M\u011a\3\2\2\2O\u011c\3\2\2\2Q\u011e\3\2"+
		"\2\2S\u0128\3\2\2\2U\u012e\3\2\2\2W\u0133\3\2\2\2Y\u0136\3\2\2\2[\u013c"+
		"\3\2\2\2]\u0145\3\2\2\2_\u0151\3\2\2\2a\u0156\3\2\2\2c\u015d\3\2\2\2e"+
		"\u0163\3\2\2\2g\u0168\3\2\2\2i\u0170\3\2\2\2k\u0176\3\2\2\2m\u017e\3\2"+
		"\2\2o\u0185\3\2\2\2q\u019c\3\2\2\2s\u01a5\3\2\2\2u\u01b0\3\2\2\2w\u01b4"+
		"\3\2\2\2y}\7%\2\2z|\n\2\2\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2"+
		"~\u008c\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\61\2\2\u0081\u0082\7,\2\2\u0082"+
		"\u0086\3\2\2\2\u0083\u0085\13\2\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0089\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0089\u008a\7,\2\2\u008a\u008c\7\61\2\2\u008by\3\2\2\2"+
		"\u008b\u0080\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\b\2\2\2\u008e\4\3"+
		"\2\2\2\u008f\u0090\7C\2\2\u0090\u0091\7N\2\2\u0091\u0092\7I\2\2\u0092"+
		"\u0093\7Q\2\2\u0093\u0094\7T\2\2\u0094\u0095\7K\2\2\u0095\u0096\7V\2\2"+
		"\u0096\u0097\7O\2\2\u0097\u0098\7Q\2\2\u0098\6\3\2\2\2\u0099\u009a\7\60"+
		"\2\2\u009a\b\3\2\2\2\u009b\u009c\7g\2\2\u009c\u009d\7p\2\2\u009d\u009e"+
		"\7v\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7e\2\2\u00a1"+
		"\u00a2\7g\2\2\u00a2\u00a3\7u\2\2\u00a3\n\3\2\2\2\u00a4\u00a5\7~\2\2\u00a5"+
		"\u00a6\7~\2\2\u00a6\f\3\2\2\2\u00a7\u00a8\7(\2\2\u00a8\u00a9\7(\2\2\u00a9"+
		"\16\3\2\2\2\u00aa\u00ab\7?\2\2\u00ab\u00ac\7?\2\2\u00ac\20\3\2\2\2\u00ad"+
		"\u00ae\7#\2\2\u00ae\u00af\7?\2\2\u00af\22\3\2\2\2\u00b0\u00b1\7@\2\2\u00b1"+
		"\24\3\2\2\2\u00b2\u00b3\7>\2\2\u00b3\26\3\2\2\2\u00b4\u00b5\7@\2\2\u00b5"+
		"\u00b6\7?\2\2\u00b6\30\3\2\2\2\u00b7\u00b8\7>\2\2\u00b8\u00b9\7?\2\2\u00b9"+
		"\32\3\2\2\2\u00ba\u00bb\7-\2\2\u00bb\34\3\2\2\2\u00bc\u00bd\7/\2\2\u00bd"+
		"\36\3\2\2\2\u00be\u00bf\7,\2\2\u00bf \3\2\2\2\u00c0\u00c1\7\61\2\2\u00c1"+
		"\"\3\2\2\2\u00c2\u00c3\7\'\2\2\u00c3$\3\2\2\2\u00c4\u00c5\7`\2\2\u00c5"+
		"&\3\2\2\2\u00c6\u00c7\7#\2\2\u00c7(\3\2\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca"+
		"\7g\2\2\u00ca\u00cb\7v\2\2\u00cb*\3\2\2\2\u00cc\u00cd\7i\2\2\u00cd\u00ce"+
		"\7g\2\2\u00ce\u00cf\7v\2\2\u00cf,\3\2\2\2\u00d0\u00d1\7f\2\2\u00d1\u00d2"+
		"\7g\2\2\u00d2\u00d3\7h\2\2\u00d3.\3\2\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6"+
		"\7g\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7t\2\2\u00d9"+
		"\u00da\7p\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7t\2\2\u00dc\60\3\2\2\2\u00dd"+
		"\u00de\7g\2\2\u00de\u00df\7p\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7g\2\2"+
		"\u00e1\u00e2\7t\2\2\u00e2\u00e3\7q\2\2\u00e3\62\3\2\2\2\u00e4\u00e5\7"+
		"f\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7e\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9"+
		"\7o\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7n\2\2\u00eb\64\3\2\2\2\u00ec\u00ed"+
		"\7e\2\2\u00ed\u00ee\7c\2\2\u00ee\u00ef\7f\2\2\u00ef\u00f0\7g\2\2\u00f0"+
		"\u00f1\7p\2\2\u00f1\u00f2\7c\2\2\u00f2\66\3\2\2\2\u00f3\u00f4\7d\2\2\u00f4"+
		"\u00f5\7q\2\2\u00f5\u00f6\7q\2\2\u00f6\u00f7\7n\2\2\u00f7\u00f8\7g\2\2"+
		"\u00f8\u00f9\7c\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb\7q\2\2\u00fb8\3\2\2"+
		"\2\u00fc\u00fd\7o\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100"+
		"\7t\2\2\u0100\u0101\7k\2\2\u0101\u0102\7|\2\2\u0102:\3\2\2\2\u0103\u0104"+
		"\7x\2\2\u0104\u0105\7g\2\2\u0105\u0106\7e\2\2\u0106\u0107\7v\2\2\u0107"+
		"\u0108\7q\2\2\u0108\u0109\7t\2\2\u0109<\3\2\2\2\u010a\u010b\7=\2\2\u010b"+
		">\3\2\2\2\u010c\u010d\7?\2\2\u010d@\3\2\2\2\u010e\u010f\7*\2\2\u010fB"+
		"\3\2\2\2\u0110\u0111\7+\2\2\u0111D\3\2\2\2\u0112\u0113\7}\2\2\u0113F\3"+
		"\2\2\2\u0114\u0115\7\177\2\2\u0115H\3\2\2\2\u0116\u0117\7]\2\2\u0117J"+
		"\3\2\2\2\u0118\u0119\7_\2\2\u0119L\3\2\2\2\u011a\u011b\7.\2\2\u011bN\3"+
		"\2\2\2\u011c\u011d\7<\2\2\u011dP\3\2\2\2\u011e\u011f\7x\2\2\u011f\u0120"+
		"\7g\2\2\u0120\u0121\7t\2\2\u0121\u0122\7f\2\2\u0122\u0123\7c\2\2\u0123"+
		"\u0124\7f\2\2\u0124\u0125\7g\2\2\u0125\u0126\7t\2\2\u0126\u0127\7q\2\2"+
		"\u0127R\3\2\2\2\u0128\u0129\7h\2\2\u0129\u012a\7c\2\2\u012a\u012b\7n\2"+
		"\2\u012b\u012c\7u\2\2\u012c\u012d\7q\2\2\u012dT\3\2\2\2\u012e\u012f\7"+
		"p\2\2\u012f\u0130\7w\2\2\u0130\u0131\7n\2\2\u0131\u0132\7q\2\2\u0132V"+
		"\3\2\2\2\u0133\u0134\7u\2\2\u0134\u0135\7k\2\2\u0135X\3\2\2\2\u0136\u0137"+
		"\7u\2\2\u0137\u0138\7k\2\2\u0138\u0139\7a\2\2\u0139\u013a\7p\2\2\u013a"+
		"\u013b\7q\2\2\u013bZ\3\2\2\2\u013c\u013d\7o\2\2\u013d\u013e\7k\2\2\u013e"+
		"\u013f\7g\2\2\u013f\u0140\7p\2\2\u0140\u0141\7v\2\2\u0141\u0142\7t\2\2"+
		"\u0142\u0143\7c\2\2\u0143\u0144\7u\2\2\u0144\\\3\2\2\2\u0145\u0146\7u"+
		"\2\2\u0146\u0147\7g\2\2\u0147\u0148\7n\2\2\u0148\u0149\7g\2\2\u0149\u014a"+
		"\7e\2\2\u014a\u014b\7e\2\2\u014b\u014c\7k\2\2\u014c\u014d\7q\2\2\u014d"+
		"\u014e\7p\2\2\u014e\u014f\7c\2\2\u014f\u0150\7t\2\2\u0150^\3\2\2\2\u0151"+
		"\u0152\7e\2\2\u0152\u0153\7c\2\2\u0153\u0154\7u\2\2\u0154\u0155\7q\2\2"+
		"\u0155`\3\2\2\2\u0156\u0157\7t\2\2\u0157\u0158\7q\2\2\u0158\u0159\7o\2"+
		"\2\u0159\u015a\7r\2\2\u015a\u015b\7g\2\2\u015b\u015c\7t\2\2\u015cb\3\2"+
		"\2\2\u015d\u015e\7j\2\2\u015e\u015f\7c\2\2\u015f\u0160\7e\2\2\u0160\u0161"+
		"\7g\2\2\u0161\u0162\7t\2\2\u0162d\3\2\2\2\u0163\u0164\7r\2\2\u0164\u0165"+
		"\7c\2\2\u0165\u0166\7t\2\2\u0166\u0167\7c\2\2\u0167f\3\2\2\2\u0168\u0169"+
		"\7f\2\2\u0169\u016a\7g\2\2\u016a\u016b\7h\2\2\u016b\u016c\7g\2\2\u016c"+
		"\u016d\7e\2\2\u016d\u016e\7v\2\2\u016e\u016f\7q\2\2\u016fh\3\2\2\2\u0170"+
		"\u0171\7e\2\2\u0171\u0172\7n\2\2\u0172\u0173\7c\2\2\u0173\u0174\7u\2\2"+
		"\u0174\u0175\7g\2\2\u0175j\3\2\2\2\u0176\u017a\t\3\2\2\u0177\u0179\t\4"+
		"\2\2\u0178\u0177\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017bl\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017f\t\5\2\2"+
		"\u017e\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181"+
		"\3\2\2\2\u0181n\3\2\2\2\u0182\u0184\t\5\2\2\u0183\u0182\3\2\2\2\u0184"+
		"\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\3\2"+
		"\2\2\u0187\u0185\3\2\2\2\u0188\u018c\7\60\2\2\u0189\u018b\t\5\2\2\u018a"+
		"\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2"+
		"\2\2\u018d\u0198\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0191\t\6\2\2\u0190"+
		"\u0192\t\7\2\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194\3\2"+
		"\2\2\u0193\u0195\t\5\2\2\u0194\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199\3\2\2\2\u0198\u018f\3\2"+
		"\2\2\u0198\u0199\3\2\2\2\u0199p\3\2\2\2\u019a\u019d\5m\67\2\u019b\u019d"+
		"\5o8\2\u019c\u019a\3\2\2\2\u019c\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u01a1\t\b\2\2\u019f\u01a2\5m\67\2\u01a0\u01a2\5o8\2\u01a1\u019f\3\2\2"+
		"\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4"+
		"\7k\2\2\u01a4r\3\2\2\2\u01a5\u01ab\7$\2\2\u01a6\u01aa\n\t\2\2\u01a7\u01a8"+
		"\7$\2\2\u01a8\u01aa\7$\2\2\u01a9\u01a6\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa"+
		"\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2"+
		"\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01af\7$\2\2\u01aft\3\2\2\2\u01b0\u01b1"+
		"\t\n\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\b;\2\2\u01b3v\3\2\2\2\u01b4\u01b5"+
		"\13\2\2\2\u01b5x\3\2\2\2\21\2}\u0086\u008b\u017a\u0180\u0185\u018c\u0191"+
		"\u0196\u0198\u019c\u01a1\u01a9\u01ab\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}