// Generated from Diunisio.g4 by ANTLR 4.7
package classes;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DiunisioParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMENTARIO=1, ALGORITMO=2, TERMINA=3, ENTONCES=4, O=5, Y=6, IGUAL=7, DIFERENTE=8, 
		MAYOR=9, MENOR=10, MAY_IGUAL=11, MEN_IGUAL=12, SUMA=13, MENOS=14, MULT=15, 
		DIV=16, MOD=17, POTENCIA=18, NO=19, DEF=20, RETORNAR=21, INT=22, FLOAT=23, 
		STRING=24, BOOL=25, MATRIZ=26, VECTOR=27, PCOMA=28, ASIGNAR=29, PAREN_AP=30, 
		PAREN_CI=31, LLAVEIZ=32, LLAVEDE=33, ANGIZ=34, ANGDE=35, COMA=36, DOSPUNTOS=37, 
		VERDADERO=38, FALSO=39, NULO=40, SI=41, SI_NO=42, MIENTRAS=43, SELECCIONAR=44, 
		CASO=45, ROMPER=46, HACER=47, PARA=48, DEFECTO=49, CLASE=50, IDENTIFICADOR=51, 
		ENTERO=52, REAL=53, COMPLEJO=54, CADENA=55, ESPACIO=56, OTRO=57;
	public static final int
		RULE_algoritmo = 0, RULE_lista_ids = 1, RULE_exp_simple = 2, RULE_expresion = 3, 
		RULE_variable = 4, RULE_termino = 5, RULE_factor = 6, RULE_lista_parsv = 7, 
		RULE_conjunto = 8, RULE_tipo = 9, RULE_tipoclase = 10, RULE_bloque = 11, 
		RULE_decl_clases = 12, RULE_sec_proposiciones = 13, RULE_proposicion = 14, 
		RULE_asignacion = 15, RULE_si_senten = 16, RULE_bloque_condicional = 17, 
		RULE_mientras_senten = 18, RULE_hacer_mientras_senten = 19, RULE_seleccionar_senten = 20, 
		RULE_casos = 21, RULE_para_senten = 22, RULE_fun_senten = 23, RULE_proc_senten = 24, 
		RULE_funcion = 25;
	public static final String[] ruleNames = {
		"algoritmo", "lista_ids", "exp_simple", "expresion", "variable", "termino", 
		"factor", "lista_parsv", "conjunto", "tipo", "tipoclase", "bloque", "decl_clases", 
		"sec_proposiciones", "proposicion", "asignacion", "si_senten", "bloque_condicional", 
		"mientras_senten", "hacer_mientras_senten", "seleccionar_senten", "casos", 
		"para_senten", "fun_senten", "proc_senten", "funcion"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'ALGORITMO'", "'.'", "'entonces'", "'||'", "'&&'", "'=='", 
		"'!='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"'^'", "'!'", "'def'", "'retornar'", "'entero'", "'decimal'", "'cadena'", 
		"'booleano'", "'matriz'", "'vector'", "';'", "'='", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "','", "':'", "'verdadero'", "'falso'", "'nulo'", 
		"'si'", "'si_no'", "'mientras'", "'seleccionar'", "'caso'", "'romper'", 
		"'hacer'", "'para'", "'defecto'", "'clase'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMENTARIO", "ALGORITMO", "TERMINA", "ENTONCES", "O", "Y", "IGUAL", 
		"DIFERENTE", "MAYOR", "MENOR", "MAY_IGUAL", "MEN_IGUAL", "SUMA", "MENOS", 
		"MULT", "DIV", "MOD", "POTENCIA", "NO", "DEF", "RETORNAR", "INT", "FLOAT", 
		"STRING", "BOOL", "MATRIZ", "VECTOR", "PCOMA", "ASIGNAR", "PAREN_AP", 
		"PAREN_CI", "LLAVEIZ", "LLAVEDE", "ANGIZ", "ANGDE", "COMA", "DOSPUNTOS", 
		"VERDADERO", "FALSO", "NULO", "SI", "SI_NO", "MIENTRAS", "SELECCIONAR", 
		"CASO", "ROMPER", "HACER", "PARA", "DEFECTO", "CLASE", "IDENTIFICADOR", 
		"ENTERO", "REAL", "COMPLEJO", "CADENA", "ESPACIO", "OTRO"
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

	@Override
	public String getGrammarFileName() { return "Diunisio.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DiunisioParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AlgoritmoContext extends ParserRuleContext {
		public TerminalNode ALGORITMO() { return getToken(DiunisioParser.ALGORITMO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(DiunisioParser.DOSPUNTOS, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode TERMINA() { return getToken(DiunisioParser.TERMINA, 0); }
		public TerminalNode PAREN_AP() { return getToken(DiunisioParser.PAREN_AP, 0); }
		public Lista_idsContext lista_ids() {
			return getRuleContext(Lista_idsContext.class,0);
		}
		public TerminalNode PAREN_CI() { return getToken(DiunisioParser.PAREN_CI, 0); }
		public AlgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterAlgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitAlgoritmo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitAlgoritmo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgoritmoContext algoritmo() throws RecognitionException {
		AlgoritmoContext _localctx = new AlgoritmoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_algoritmo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(ALGORITMO);
			setState(53);
			match(IDENTIFICADOR);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAREN_AP) {
				{
				setState(54);
				match(PAREN_AP);
				setState(55);
				lista_ids();
				setState(56);
				match(PAREN_CI);
				}
			}

			setState(60);
			match(DOSPUNTOS);
			setState(61);
			bloque();
			setState(62);
			match(TERMINA);
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

	public static class Lista_idsContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(DiunisioParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(DiunisioParser.IDENTIFICADOR, i);
		}
		public List<TerminalNode> COMA() { return getTokens(DiunisioParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(DiunisioParser.COMA, i);
		}
		public Lista_idsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_ids; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterLista_ids(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitLista_ids(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitLista_ids(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_idsContext lista_ids() throws RecognitionException {
		Lista_idsContext _localctx = new Lista_idsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lista_ids);
		int _la;
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(IDENTIFICADOR);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(65);
					match(COMA);
					setState(66);
					match(IDENTIFICADOR);
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case PAREN_CI:
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

	public static class Exp_simpleContext extends ParserRuleContext {
		public Token op;
		public Token op2;
		public TerminalNode PAREN_AP() { return getToken(DiunisioParser.PAREN_AP, 0); }
		public Exp_simpleContext exp_simple() {
			return getRuleContext(Exp_simpleContext.class,0);
		}
		public TerminalNode PAREN_CI() { return getToken(DiunisioParser.PAREN_CI, 0); }
		public List<TerminoContext> termino() {
			return getRuleContexts(TerminoContext.class);
		}
		public TerminoContext termino(int i) {
			return getRuleContext(TerminoContext.class,i);
		}
		public List<TerminalNode> SUMA() { return getTokens(DiunisioParser.SUMA); }
		public TerminalNode SUMA(int i) {
			return getToken(DiunisioParser.SUMA, i);
		}
		public List<TerminalNode> MENOS() { return getTokens(DiunisioParser.MENOS); }
		public TerminalNode MENOS(int i) {
			return getToken(DiunisioParser.MENOS, i);
		}
		public List<TerminalNode> O() { return getTokens(DiunisioParser.O); }
		public TerminalNode O(int i) {
			return getToken(DiunisioParser.O, i);
		}
		public Exp_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterExp_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitExp_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitExp_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_simpleContext exp_simple() throws RecognitionException {
		Exp_simpleContext _localctx = new Exp_simpleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exp_simple);
		int _la;
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(PAREN_AP);
				setState(76);
				exp_simple();
				setState(77);
				match(PAREN_CI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUMA || _la==MENOS) {
					{
					setState(79);
					((Exp_simpleContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==SUMA || _la==MENOS) ) {
						((Exp_simpleContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(82);
				termino();
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << O) | (1L << SUMA) | (1L << MENOS))) != 0)) {
					{
					{
					setState(83);
					((Exp_simpleContext)_localctx).op2 = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << O) | (1L << SUMA) | (1L << MENOS))) != 0)) ) {
						((Exp_simpleContext)_localctx).op2 = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(84);
					termino();
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				termino();
				}
				break;
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

	public static class ExpresionContext extends ParserRuleContext {
		public Token op;
		public TerminalNode PAREN_AP() { return getToken(DiunisioParser.PAREN_AP, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAREN_CI() { return getToken(DiunisioParser.PAREN_CI, 0); }
		public List<Exp_simpleContext> exp_simple() {
			return getRuleContexts(Exp_simpleContext.class);
		}
		public Exp_simpleContext exp_simple(int i) {
			return getRuleContext(Exp_simpleContext.class,i);
		}
		public TerminalNode IGUAL() { return getToken(DiunisioParser.IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(DiunisioParser.DIFERENTE, 0); }
		public TerminalNode MEN_IGUAL() { return getToken(DiunisioParser.MEN_IGUAL, 0); }
		public TerminalNode MAY_IGUAL() { return getToken(DiunisioParser.MAY_IGUAL, 0); }
		public TerminalNode MENOR() { return getToken(DiunisioParser.MENOR, 0); }
		public TerminalNode MAYOR() { return getToken(DiunisioParser.MAYOR, 0); }
		public TerminalNode NO() { return getToken(DiunisioParser.NO, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expresion);
		int _la;
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(PAREN_AP);
				setState(94);
				expresion();
				setState(95);
				match(PAREN_CI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				exp_simple();
				setState(98);
				((ExpresionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << DIFERENTE) | (1L << MAYOR) | (1L << MENOR) | (1L << MAY_IGUAL) | (1L << MEN_IGUAL))) != 0)) ) {
					((ExpresionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(99);
				exp_simple();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				match(PAREN_AP);
				setState(102);
				exp_simple();
				setState(103);
				match(PAREN_CI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				exp_simple();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				match(NO);
				setState(107);
				expresion();
				}
				break;
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public ConjuntoContext conjunto() {
			return getRuleContext(ConjuntoContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(IDENTIFICADOR);
				setState(111);
				conjunto();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(IDENTIFICADOR);
				}
				break;
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

	public static class TerminoContext extends ParserRuleContext {
		public Token op;
		public TerminalNode PAREN_AP() { return getToken(DiunisioParser.PAREN_AP, 0); }
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public TerminalNode PAREN_CI() { return getToken(DiunisioParser.PAREN_CI, 0); }
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(DiunisioParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(DiunisioParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(DiunisioParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(DiunisioParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(DiunisioParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(DiunisioParser.MOD, i);
		}
		public List<TerminalNode> Y() { return getTokens(DiunisioParser.Y); }
		public TerminalNode Y(int i) {
			return getToken(DiunisioParser.Y, i);
		}
		public List<TerminalNode> O() { return getTokens(DiunisioParser.O); }
		public TerminalNode O(int i) {
			return getToken(DiunisioParser.O, i);
		}
		public List<TerminalNode> POTENCIA() { return getTokens(DiunisioParser.POTENCIA); }
		public TerminalNode POTENCIA(int i) {
			return getToken(DiunisioParser.POTENCIA, i);
		}
		public TerminalNode NO() { return getToken(DiunisioParser.NO, 0); }
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitTermino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_termino);
		int _la;
		try {
			int _alt;
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(PAREN_AP);
				setState(116);
				termino();
				setState(117);
				match(PAREN_CI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				factor();
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(120);
						((TerminoContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << O) | (1L << Y) | (1L << MULT) | (1L << DIV) | (1L << MOD) | (1L << POTENCIA))) != 0)) ) {
							((TerminoContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(121);
						factor();
						}
						} 
					}
					setState(126);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				match(NO);
				setState(128);
				termino();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				factor();
				}
				break;
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(DiunisioParser.ENTERO, 0); }
		public TerminalNode REAL() { return getToken(DiunisioParser.REAL, 0); }
		public TerminalNode CADENA() { return getToken(DiunisioParser.CADENA, 0); }
		public TerminalNode COMPLEJO() { return getToken(DiunisioParser.COMPLEJO, 0); }
		public TerminalNode NULO() { return getToken(DiunisioParser.NULO, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public Lista_parsvContext lista_parsv() {
			return getRuleContext(Lista_parsvContext.class,0);
		}
		public List<TerminalNode> ANGIZ() { return getTokens(DiunisioParser.ANGIZ); }
		public TerminalNode ANGIZ(int i) {
			return getToken(DiunisioParser.ANGIZ, i);
		}
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> ANGDE() { return getTokens(DiunisioParser.ANGDE); }
		public TerminalNode ANGDE(int i) {
			return getToken(DiunisioParser.ANGDE, i);
		}
		public TerminalNode NO() { return getToken(DiunisioParser.NO, 0); }
		public TerminalNode VERDADERO() { return getToken(DiunisioParser.VERDADERO, 0); }
		public TerminalNode FALSO() { return getToken(DiunisioParser.FALSO, 0); }
		public ConjuntoContext conjunto() {
			return getRuleContext(ConjuntoContext.class,0);
		}
		public TerminalNode PAREN_AP() { return getToken(DiunisioParser.PAREN_AP, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAREN_CI() { return getToken(DiunisioParser.PAREN_CI, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_factor);
		int _la;
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(ENTERO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(REAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(CADENA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				match(COMPLEJO);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(136);
				match(NULO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(137);
				variable();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(138);
				match(IDENTIFICADOR);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PAREN_AP) {
					{
					setState(139);
					lista_parsv();
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(142);
				match(IDENTIFICADOR);
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(143);
					match(ANGIZ);
					setState(144);
					factor();
					setState(145);
					match(ANGDE);
					}
					}
					setState(149); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ANGIZ );
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(151);
				match(IDENTIFICADOR);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(152);
				match(NO);
				setState(153);
				factor();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(154);
				match(VERDADERO);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(155);
				match(FALSO);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(156);
				conjunto();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(157);
				match(PAREN_AP);
				setState(158);
				expresion();
				setState(159);
				match(PAREN_CI);
				}
				break;
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

	public static class Lista_parsvContext extends ParserRuleContext {
		public TerminalNode PAREN_AP() { return getToken(DiunisioParser.PAREN_AP, 0); }
		public TerminalNode PAREN_CI() { return getToken(DiunisioParser.PAREN_CI, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(DiunisioParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(DiunisioParser.IDENTIFICADOR, i);
		}
		public List<TerminalNode> COMA() { return getTokens(DiunisioParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(DiunisioParser.COMA, i);
		}
		public Lista_parsvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_parsv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterLista_parsv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitLista_parsv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitLista_parsv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_parsvContext lista_parsv() throws RecognitionException {
		Lista_parsvContext _localctx = new Lista_parsvContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lista_parsv);
		int _la;
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(PAREN_AP);
				setState(167);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(164);
					expresion();
					}
					break;
				case 2:
					{
					setState(165);
					variable();
					}
					break;
				case 3:
					{
					setState(166);
					match(IDENTIFICADOR);
					}
					break;
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(169);
					match(COMA);
					setState(173);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(170);
						expresion();
						}
						break;
					case 2:
						{
						setState(171);
						variable();
						}
						break;
					case 3:
						{
						setState(172);
						match(IDENTIFICADOR);
						}
						break;
					}
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(180);
				match(PAREN_CI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(PAREN_AP);
				setState(182);
				match(PAREN_CI);
				}
				break;
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

	public static class ConjuntoContext extends ParserRuleContext {
		public TerminalNode LLAVEIZ() { return getToken(DiunisioParser.LLAVEIZ, 0); }
		public TerminalNode LLAVEDE() { return getToken(DiunisioParser.LLAVEDE, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(DiunisioParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(DiunisioParser.COMA, i);
		}
		public ConjuntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterConjunto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitConjunto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitConjunto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjuntoContext conjunto() throws RecognitionException {
		ConjuntoContext _localctx = new ConjuntoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conjunto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(LLAVEIZ);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << MENOS) | (1L << NO) | (1L << PAREN_AP) | (1L << LLAVEIZ) | (1L << VERDADERO) | (1L << FALSO) | (1L << NULO) | (1L << IDENTIFICADOR) | (1L << ENTERO) | (1L << REAL) | (1L << COMPLEJO) | (1L << CADENA))) != 0)) {
				{
				setState(186);
				expresion();
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(187);
					match(COMA);
					setState(188);
					expresion();
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(196);
			match(LLAVEDE);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DiunisioParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(DiunisioParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(DiunisioParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(DiunisioParser.BOOL, 0); }
		public TerminalNode MATRIZ() { return getToken(DiunisioParser.MATRIZ, 0); }
		public TerminalNode VECTOR() { return getToken(DiunisioParser.VECTOR, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOL) | (1L << MATRIZ) | (1L << VECTOR))) != 0)) ) {
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

	public static class TipoclaseContext extends ParserRuleContext {
		public TerminalNode CLASE() { return getToken(DiunisioParser.CLASE, 0); }
		public TipoclaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoclase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterTipoclase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitTipoclase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitTipoclase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoclaseContext tipoclase() throws RecognitionException {
		TipoclaseContext _localctx = new TipoclaseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipoclase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(CLASE);
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

	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LLAVEIZ() { return getToken(DiunisioParser.LLAVEIZ, 0); }
		public TerminalNode LLAVEDE() { return getToken(DiunisioParser.LLAVEDE, 0); }
		public Sec_proposicionesContext sec_proposiciones() {
			return getRuleContext(Sec_proposicionesContext.class,0);
		}
		public List<Decl_clasesContext> decl_clases() {
			return getRuleContexts(Decl_clasesContext.class);
		}
		public Decl_clasesContext decl_clases(int i) {
			return getRuleContext(Decl_clasesContext.class,i);
		}
		public List<ProposicionContext> proposicion() {
			return getRuleContexts(ProposicionContext.class);
		}
		public ProposicionContext proposicion(int i) {
			return getRuleContext(ProposicionContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bloque);
		int _la;
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(LLAVEIZ);
				setState(203);
				match(LLAVEDE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(LLAVEIZ);
				setState(205);
				sec_proposiciones();
				setState(206);
				match(LLAVEDE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				match(LLAVEIZ);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CLASE) {
					{
					{
					setState(209);
					decl_clases();
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(216); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(215);
					proposicion();
					}
					}
					setState(218); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEF) | (1L << RETORNAR) | (1L << LLAVEIZ) | (1L << SI) | (1L << MIENTRAS) | (1L << SELECCIONAR) | (1L << HACER) | (1L << PARA) | (1L << IDENTIFICADOR) | (1L << OTRO))) != 0) );
				setState(220);
				match(LLAVEDE);
				}
				break;
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

	public static class Decl_clasesContext extends ParserRuleContext {
		public TipoclaseContext tipoclase() {
			return getRuleContext(TipoclaseContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public TerminalNode LLAVEIZ() { return getToken(DiunisioParser.LLAVEIZ, 0); }
		public Sec_proposicionesContext sec_proposiciones() {
			return getRuleContext(Sec_proposicionesContext.class,0);
		}
		public TerminalNode LLAVEDE() { return getToken(DiunisioParser.LLAVEDE, 0); }
		public Decl_clasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_clases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterDecl_clases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitDecl_clases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitDecl_clases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_clasesContext decl_clases() throws RecognitionException {
		Decl_clasesContext _localctx = new Decl_clasesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_decl_clases);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			tipoclase();
			setState(225);
			match(IDENTIFICADOR);
			setState(226);
			match(LLAVEIZ);
			setState(227);
			sec_proposiciones();
			setState(228);
			match(LLAVEDE);
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

	public static class Sec_proposicionesContext extends ParserRuleContext {
		public List<ProposicionContext> proposicion() {
			return getRuleContexts(ProposicionContext.class);
		}
		public ProposicionContext proposicion(int i) {
			return getRuleContext(ProposicionContext.class,i);
		}
		public Sec_proposicionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sec_proposiciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterSec_proposiciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitSec_proposiciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitSec_proposiciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sec_proposicionesContext sec_proposiciones() throws RecognitionException {
		Sec_proposicionesContext _localctx = new Sec_proposicionesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sec_proposiciones);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(230);
					proposicion();
					}
					} 
				}
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(236);
			proposicion();
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

	public static class ProposicionContext extends ParserRuleContext {
		public Token OTRO;
		public TerminalNode RETORNAR() { return getToken(DiunisioParser.RETORNAR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PCOMA() { return getToken(DiunisioParser.PCOMA, 0); }
		public Fun_sentenContext fun_senten() {
			return getRuleContext(Fun_sentenContext.class,0);
		}
		public Proc_sentenContext proc_senten() {
			return getRuleContext(Proc_sentenContext.class,0);
		}
		public Si_sentenContext si_senten() {
			return getRuleContext(Si_sentenContext.class,0);
		}
		public Seleccionar_sentenContext seleccionar_senten() {
			return getRuleContext(Seleccionar_sentenContext.class,0);
		}
		public Mientras_sentenContext mientras_senten() {
			return getRuleContext(Mientras_sentenContext.class,0);
		}
		public Para_sentenContext para_senten() {
			return getRuleContext(Para_sentenContext.class,0);
		}
		public Hacer_mientras_sentenContext hacer_mientras_senten() {
			return getRuleContext(Hacer_mientras_sentenContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public Lista_parsvContext lista_parsv() {
			return getRuleContext(Lista_parsvContext.class,0);
		}
		public TerminalNode LLAVEIZ() { return getToken(DiunisioParser.LLAVEIZ, 0); }
		public Sec_proposicionesContext sec_proposiciones() {
			return getRuleContext(Sec_proposicionesContext.class,0);
		}
		public TerminalNode LLAVEDE() { return getToken(DiunisioParser.LLAVEDE, 0); }
		public TerminalNode OTRO() { return getToken(DiunisioParser.OTRO, 0); }
		public ProposicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proposicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterProposicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitProposicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitProposicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProposicionContext proposicion() throws RecognitionException {
		ProposicionContext _localctx = new ProposicionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_proposicion);
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(RETORNAR);
				setState(239);
				expresion();
				setState(240);
				match(PCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				fun_senten();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				proc_senten();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				si_senten();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(245);
				seleccionar_senten();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(246);
				mientras_senten();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(247);
				para_senten();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(248);
				hacer_mientras_senten();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(249);
				asignacion();
				setState(250);
				match(PCOMA);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(252);
				match(IDENTIFICADOR);
				setState(253);
				lista_parsv();
				setState(254);
				match(PCOMA);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(256);
				match(LLAVEIZ);
				setState(257);
				sec_proposiciones();
				setState(258);
				match(LLAVEDE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(260);
				((ProposicionContext)_localctx).OTRO = match(OTRO);
				System.err.println("Caracter desconocido: " + (((ProposicionContext)_localctx).OTRO!=null?((ProposicionContext)_localctx).OTRO.getText():null));
				}
				break;
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

	public static class AsignacionContext extends ParserRuleContext {
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	 
		public AsignacionContext() { }
		public void copyFrom(AsignacionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AsigVecContext extends AsignacionContext {
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public TerminalNode ASIGNAR() { return getToken(DiunisioParser.ASIGNAR, 0); }
		public ConjuntoContext conjunto() {
			return getRuleContext(ConjuntoContext.class,0);
		}
		public AsigVecContext(AsignacionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterAsigVec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitAsigVec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitAsigVec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AsigNumContext extends AsignacionContext {
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public TerminalNode ASIGNAR() { return getToken(DiunisioParser.ASIGNAR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsigNumContext(AsignacionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterAsigNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitAsigNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitAsigNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_asignacion);
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new AsigNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(IDENTIFICADOR);
				setState(265);
				match(ASIGNAR);
				setState(266);
				expresion();
				}
				break;
			case 2:
				_localctx = new AsigVecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(IDENTIFICADOR);
				setState(268);
				match(ASIGNAR);
				setState(269);
				conjunto();
				}
				break;
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

	public static class Si_sentenContext extends ParserRuleContext {
		public List<TerminalNode> SI() { return getTokens(DiunisioParser.SI); }
		public TerminalNode SI(int i) {
			return getToken(DiunisioParser.SI, i);
		}
		public List<Bloque_condicionalContext> bloque_condicional() {
			return getRuleContexts(Bloque_condicionalContext.class);
		}
		public Bloque_condicionalContext bloque_condicional(int i) {
			return getRuleContext(Bloque_condicionalContext.class,i);
		}
		public List<TerminalNode> SI_NO() { return getTokens(DiunisioParser.SI_NO); }
		public TerminalNode SI_NO(int i) {
			return getToken(DiunisioParser.SI_NO, i);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode ENTONCES() { return getToken(DiunisioParser.ENTONCES, 0); }
		public Si_sentenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si_senten; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterSi_senten(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitSi_senten(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitSi_senten(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Si_sentenContext si_senten() throws RecognitionException {
		Si_sentenContext _localctx = new Si_sentenContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_si_senten);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(SI);
			setState(273);
			bloque_condicional();
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(274);
					match(SI_NO);
					setState(275);
					match(SI);
					setState(276);
					bloque_condicional();
					}
					} 
				}
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SI_NO) {
				{
				setState(282);
				match(SI_NO);
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENTONCES) {
					{
					setState(283);
					match(ENTONCES);
					}
				}

				setState(286);
				bloque();
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

	public static class Bloque_condicionalContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode ENTONCES() { return getToken(DiunisioParser.ENTONCES, 0); }
		public Bloque_condicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterBloque_condicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitBloque_condicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitBloque_condicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_condicionalContext bloque_condicional() throws RecognitionException {
		Bloque_condicionalContext _localctx = new Bloque_condicionalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bloque_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			expresion();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENTONCES) {
				{
				setState(290);
				match(ENTONCES);
				}
			}

			setState(293);
			bloque();
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

	public static class Mientras_sentenContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(DiunisioParser.MIENTRAS, 0); }
		public Bloque_condicionalContext bloque_condicional() {
			return getRuleContext(Bloque_condicionalContext.class,0);
		}
		public Mientras_sentenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras_senten; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterMientras_senten(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitMientras_senten(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitMientras_senten(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mientras_sentenContext mientras_senten() throws RecognitionException {
		Mientras_sentenContext _localctx = new Mientras_sentenContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mientras_senten);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(MIENTRAS);
			setState(296);
			bloque_condicional();
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

	public static class Hacer_mientras_sentenContext extends ParserRuleContext {
		public TerminalNode HACER() { return getToken(DiunisioParser.HACER, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode MIENTRAS() { return getToken(DiunisioParser.MIENTRAS, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Hacer_mientras_sentenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hacer_mientras_senten; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterHacer_mientras_senten(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitHacer_mientras_senten(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitHacer_mientras_senten(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hacer_mientras_sentenContext hacer_mientras_senten() throws RecognitionException {
		Hacer_mientras_sentenContext _localctx = new Hacer_mientras_sentenContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_hacer_mientras_senten);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(HACER);
			setState(299);
			bloque();
			setState(300);
			match(MIENTRAS);
			setState(301);
			expresion();
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

	public static class Seleccionar_sentenContext extends ParserRuleContext {
		public TerminalNode SELECCIONAR() { return getToken(DiunisioParser.SELECCIONAR, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public TerminalNode LLAVEIZ() { return getToken(DiunisioParser.LLAVEIZ, 0); }
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public TerminalNode LLAVEDE() { return getToken(DiunisioParser.LLAVEDE, 0); }
		public Seleccionar_sentenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seleccionar_senten; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterSeleccionar_senten(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitSeleccionar_senten(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitSeleccionar_senten(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Seleccionar_sentenContext seleccionar_senten() throws RecognitionException {
		Seleccionar_sentenContext _localctx = new Seleccionar_sentenContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_seleccionar_senten);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(SELECCIONAR);
			setState(304);
			match(IDENTIFICADOR);
			setState(305);
			match(LLAVEIZ);
			setState(306);
			casos();
			setState(307);
			match(LLAVEDE);
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

	public static class CasosContext extends ParserRuleContext {
		public CasosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casos; }
	 
		public CasosContext() { }
		public void copyFrom(CasosContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CasosDefContext extends CasosContext {
		public TerminalNode DEFECTO() { return getToken(DiunisioParser.DEFECTO, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(DiunisioParser.DOSPUNTOS, 0); }
		public Sec_proposicionesContext sec_proposiciones() {
			return getRuleContext(Sec_proposicionesContext.class,0);
		}
		public CasosDefContext(CasosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterCasosDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitCasosDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitCasosDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CasosGenContext extends CasosContext {
		public TerminalNode CASO() { return getToken(DiunisioParser.CASO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode DOSPUNTOS() { return getToken(DiunisioParser.DOSPUNTOS, 0); }
		public Sec_proposicionesContext sec_proposiciones() {
			return getRuleContext(Sec_proposicionesContext.class,0);
		}
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public TerminalNode ROMPER() { return getToken(DiunisioParser.ROMPER, 0); }
		public TerminalNode PCOMA() { return getToken(DiunisioParser.PCOMA, 0); }
		public CasosGenContext(CasosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterCasosGen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitCasosGen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitCasosGen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasosContext casos() throws RecognitionException {
		CasosContext _localctx = new CasosContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_casos);
		int _la;
		try {
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASO:
				_localctx = new CasosGenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				match(CASO);
				setState(310);
				expresion();
				setState(311);
				match(DOSPUNTOS);
				setState(312);
				sec_proposiciones();
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROMPER) {
					{
					setState(313);
					match(ROMPER);
					setState(314);
					match(PCOMA);
					}
				}

				setState(317);
				casos();
				}
				break;
			case DEFECTO:
				_localctx = new CasosDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				match(DEFECTO);
				setState(320);
				match(DOSPUNTOS);
				setState(321);
				sec_proposiciones();
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

	public static class Para_sentenContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(DiunisioParser.PARA, 0); }
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<TerminalNode> PCOMA() { return getTokens(DiunisioParser.PCOMA); }
		public TerminalNode PCOMA(int i) {
			return getToken(DiunisioParser.PCOMA, i);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public List<TerminalNode> COMA() { return getTokens(DiunisioParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(DiunisioParser.COMA, i);
		}
		public TerminalNode PAREN_AP() { return getToken(DiunisioParser.PAREN_AP, 0); }
		public TerminalNode PAREN_CI() { return getToken(DiunisioParser.PAREN_CI, 0); }
		public Para_sentenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para_senten; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterPara_senten(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitPara_senten(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitPara_senten(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Para_sentenContext para_senten() throws RecognitionException {
		Para_sentenContext _localctx = new Para_sentenContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_para_senten);
		int _la;
		try {
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				match(PARA);
				setState(325);
				asignacion();
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(326);
					match(COMA);
					setState(327);
					asignacion();
					}
					}
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(333);
				match(PCOMA);
				setState(334);
				expresion();
				setState(335);
				match(PCOMA);
				setState(336);
				asignacion();
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(337);
					match(COMA);
					setState(338);
					asignacion();
					}
					}
					setState(343);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(344);
				bloque();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				match(PARA);
				setState(347);
				match(PAREN_AP);
				setState(348);
				asignacion();
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(349);
					match(COMA);
					setState(350);
					asignacion();
					}
					}
					setState(355);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(356);
				match(PCOMA);
				setState(357);
				expresion();
				setState(358);
				match(PCOMA);
				setState(359);
				asignacion();
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(360);
					match(COMA);
					setState(361);
					asignacion();
					}
					}
					setState(366);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(367);
				match(PAREN_CI);
				setState(368);
				bloque();
				}
				break;
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

	public static class Fun_sentenContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(DiunisioParser.DEF, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public TerminalNode PAREN_AP() { return getToken(DiunisioParser.PAREN_AP, 0); }
		public Lista_idsContext lista_ids() {
			return getRuleContext(Lista_idsContext.class,0);
		}
		public TerminalNode PAREN_CI() { return getToken(DiunisioParser.PAREN_CI, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Fun_sentenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_senten; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterFun_senten(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitFun_senten(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitFun_senten(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fun_sentenContext fun_senten() throws RecognitionException {
		Fun_sentenContext _localctx = new Fun_sentenContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_fun_senten);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(DEF);
			setState(373);
			tipo();
			setState(374);
			match(IDENTIFICADOR);
			setState(375);
			match(PAREN_AP);
			setState(376);
			lista_ids();
			setState(377);
			match(PAREN_CI);
			setState(378);
			bloque();
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

	public static class Proc_sentenContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(DiunisioParser.DEF, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public TerminalNode PAREN_AP() { return getToken(DiunisioParser.PAREN_AP, 0); }
		public Lista_idsContext lista_ids() {
			return getRuleContext(Lista_idsContext.class,0);
		}
		public TerminalNode PAREN_CI() { return getToken(DiunisioParser.PAREN_CI, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Proc_sentenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_senten; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterProc_senten(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitProc_senten(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitProc_senten(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_sentenContext proc_senten() throws RecognitionException {
		Proc_sentenContext _localctx = new Proc_sentenContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_proc_senten);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(DEF);
			setState(381);
			match(IDENTIFICADOR);
			setState(382);
			match(PAREN_AP);
			setState(383);
			lista_ids();
			setState(384);
			match(PAREN_CI);
			setState(385);
			bloque();
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

	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode LLAVEIZ() { return getToken(DiunisioParser.LLAVEIZ, 0); }
		public Sec_proposicionesContext sec_proposiciones() {
			return getRuleContext(Sec_proposicionesContext.class,0);
		}
		public TerminalNode PCOMA() { return getToken(DiunisioParser.PCOMA, 0); }
		public TerminalNode LLAVEDE() { return getToken(DiunisioParser.LLAVEDE, 0); }
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(LLAVEIZ);
			setState(388);
			sec_proposiciones();
			setState(389);
			match(PCOMA);
			setState(390);
			match(LLAVEDE);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u018b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\5\2=\n\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\7\3F\n\3\f\3\16\3I\13\3\3\3\5\3L\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\5\4S\n\4\3\4\3\4\3\4\7\4X\n\4\f\4\16\4[\13\4\3\4\5\4^\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5o\n\5\3\6\3\6\3\6"+
		"\5\6t\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7}\n\7\f\7\16\7\u0080\13\7\3\7"+
		"\3\7\3\7\5\7\u0085\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008f\n\b\3"+
		"\b\3\b\3\b\3\b\3\b\6\b\u0096\n\b\r\b\16\b\u0097\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u00a4\n\b\3\t\3\t\3\t\3\t\5\t\u00aa\n\t\3\t\3\t"+
		"\3\t\3\t\5\t\u00b0\n\t\7\t\u00b2\n\t\f\t\16\t\u00b5\13\t\3\t\3\t\3\t\5"+
		"\t\u00ba\n\t\3\n\3\n\3\n\3\n\7\n\u00c0\n\n\f\n\16\n\u00c3\13\n\5\n\u00c5"+
		"\n\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00d5"+
		"\n\r\f\r\16\r\u00d8\13\r\3\r\6\r\u00db\n\r\r\r\16\r\u00dc\3\r\3\r\5\r"+
		"\u00e1\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\7\17\u00ea\n\17\f\17\16"+
		"\17\u00ed\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u0109\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0111\n\21\3"+
		"\22\3\22\3\22\3\22\3\22\7\22\u0118\n\22\f\22\16\22\u011b\13\22\3\22\3"+
		"\22\5\22\u011f\n\22\3\22\5\22\u0122\n\22\3\23\3\23\5\23\u0126\n\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u013e\n\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u0145\n\27\3\30\3\30\3\30\3\30\7\30\u014b\n\30\f\30\16\30\u014e"+
		"\13\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0156\n\30\f\30\16\30\u0159"+
		"\13\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0162\n\30\f\30\16\30\u0165"+
		"\13\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u016d\n\30\f\30\16\30\u0170"+
		"\13\30\3\30\3\30\3\30\5\30\u0175\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\2\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2"+
		"\7\3\2\17\20\4\2\7\7\17\20\3\2\t\16\4\2\7\b\21\24\3\2\30\35\2\u01b3\2"+
		"\66\3\2\2\2\4K\3\2\2\2\6]\3\2\2\2\bn\3\2\2\2\ns\3\2\2\2\f\u0084\3\2\2"+
		"\2\16\u00a3\3\2\2\2\20\u00b9\3\2\2\2\22\u00bb\3\2\2\2\24\u00c8\3\2\2\2"+
		"\26\u00ca\3\2\2\2\30\u00e0\3\2\2\2\32\u00e2\3\2\2\2\34\u00eb\3\2\2\2\36"+
		"\u0108\3\2\2\2 \u0110\3\2\2\2\"\u0112\3\2\2\2$\u0123\3\2\2\2&\u0129\3"+
		"\2\2\2(\u012c\3\2\2\2*\u0131\3\2\2\2,\u0144\3\2\2\2.\u0174\3\2\2\2\60"+
		"\u0176\3\2\2\2\62\u017e\3\2\2\2\64\u0185\3\2\2\2\66\67\7\4\2\2\67<\7\65"+
		"\2\289\7 \2\29:\5\4\3\2:;\7!\2\2;=\3\2\2\2<8\3\2\2\2<=\3\2\2\2=>\3\2\2"+
		"\2>?\7\'\2\2?@\5\30\r\2@A\7\5\2\2A\3\3\2\2\2BG\7\65\2\2CD\7&\2\2DF\7\65"+
		"\2\2EC\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HL\3\2\2\2IG\3\2\2\2JL\3\2"+
		"\2\2KB\3\2\2\2KJ\3\2\2\2L\5\3\2\2\2MN\7 \2\2NO\5\6\4\2OP\7!\2\2P^\3\2"+
		"\2\2QS\t\2\2\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2TY\5\f\7\2UV\t\3\2\2VX\5\f"+
		"\7\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z^\3\2\2\2[Y\3\2\2\2\\^\5"+
		"\f\7\2]M\3\2\2\2]R\3\2\2\2]\\\3\2\2\2^\7\3\2\2\2_`\7 \2\2`a\5\b\5\2ab"+
		"\7!\2\2bo\3\2\2\2cd\5\6\4\2de\t\4\2\2ef\5\6\4\2fo\3\2\2\2gh\7 \2\2hi\5"+
		"\6\4\2ij\7!\2\2jo\3\2\2\2ko\5\6\4\2lm\7\25\2\2mo\5\b\5\2n_\3\2\2\2nc\3"+
		"\2\2\2ng\3\2\2\2nk\3\2\2\2nl\3\2\2\2o\t\3\2\2\2pq\7\65\2\2qt\5\22\n\2"+
		"rt\7\65\2\2sp\3\2\2\2sr\3\2\2\2t\13\3\2\2\2uv\7 \2\2vw\5\f\7\2wx\7!\2"+
		"\2x\u0085\3\2\2\2y~\5\16\b\2z{\t\5\2\2{}\5\16\b\2|z\3\2\2\2}\u0080\3\2"+
		"\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0085\3\2\2\2\u0080~\3\2\2\2\u0081\u0082"+
		"\7\25\2\2\u0082\u0085\5\f\7\2\u0083\u0085\5\16\b\2\u0084u\3\2\2\2\u0084"+
		"y\3\2\2\2\u0084\u0081\3\2\2\2\u0084\u0083\3\2\2\2\u0085\r\3\2\2\2\u0086"+
		"\u00a4\7\66\2\2\u0087\u00a4\7\67\2\2\u0088\u00a4\79\2\2\u0089\u00a4\7"+
		"8\2\2\u008a\u00a4\7*\2\2\u008b\u00a4\5\n\6\2\u008c\u008e\7\65\2\2\u008d"+
		"\u008f\5\20\t\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u00a4\3"+
		"\2\2\2\u0090\u0095\7\65\2\2\u0091\u0092\7$\2\2\u0092\u0093\5\16\b\2\u0093"+
		"\u0094\7%\2\2\u0094\u0096\3\2\2\2\u0095\u0091\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u00a4\3\2\2\2\u0099"+
		"\u00a4\7\65\2\2\u009a\u009b\7\25\2\2\u009b\u00a4\5\16\b\2\u009c\u00a4"+
		"\7(\2\2\u009d\u00a4\7)\2\2\u009e\u00a4\5\22\n\2\u009f\u00a0\7 \2\2\u00a0"+
		"\u00a1\5\b\5\2\u00a1\u00a2\7!\2\2\u00a2\u00a4\3\2\2\2\u00a3\u0086\3\2"+
		"\2\2\u00a3\u0087\3\2\2\2\u00a3\u0088\3\2\2\2\u00a3\u0089\3\2\2\2\u00a3"+
		"\u008a\3\2\2\2\u00a3\u008b\3\2\2\2\u00a3\u008c\3\2\2\2\u00a3\u0090\3\2"+
		"\2\2\u00a3\u0099\3\2\2\2\u00a3\u009a\3\2\2\2\u00a3\u009c\3\2\2\2\u00a3"+
		"\u009d\3\2\2\2\u00a3\u009e\3\2\2\2\u00a3\u009f\3\2\2\2\u00a4\17\3\2\2"+
		"\2\u00a5\u00a9\7 \2\2\u00a6\u00aa\5\b\5\2\u00a7\u00aa\5\n\6\2\u00a8\u00aa"+
		"\7\65\2\2\u00a9\u00a6\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2"+
		"\u00aa\u00b3\3\2\2\2\u00ab\u00af\7&\2\2\u00ac\u00b0\5\b\5\2\u00ad\u00b0"+
		"\5\n\6\2\u00ae\u00b0\7\65\2\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2"+
		"\u00af\u00ae\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00ab\3\2\2\2\u00b2\u00b5"+
		"\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00ba\7!\2\2\u00b7\u00b8\7 \2\2\u00b8\u00ba\7!\2"+
		"\2\u00b9\u00a5\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\21\3\2\2\2\u00bb\u00c4"+
		"\7\"\2\2\u00bc\u00c1\5\b\5\2\u00bd\u00be\7&\2\2\u00be\u00c0\5\b\5\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00bc\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7#\2\2\u00c7\23\3\2\2\2"+
		"\u00c8\u00c9\t\6\2\2\u00c9\25\3\2\2\2\u00ca\u00cb\7\64\2\2\u00cb\27\3"+
		"\2\2\2\u00cc\u00cd\7\"\2\2\u00cd\u00e1\7#\2\2\u00ce\u00cf\7\"\2\2\u00cf"+
		"\u00d0\5\34\17\2\u00d0\u00d1\7#\2\2\u00d1\u00e1\3\2\2\2\u00d2\u00d6\7"+
		"\"\2\2\u00d3\u00d5\5\32\16\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d9\u00db\5\36\20\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\7#"+
		"\2\2\u00df\u00e1\3\2\2\2\u00e0\u00cc\3\2\2\2\u00e0\u00ce\3\2\2\2\u00e0"+
		"\u00d2\3\2\2\2\u00e1\31\3\2\2\2\u00e2\u00e3\5\26\f\2\u00e3\u00e4\7\65"+
		"\2\2\u00e4\u00e5\7\"\2\2\u00e5\u00e6\5\34\17\2\u00e6\u00e7\7#\2\2\u00e7"+
		"\33\3\2\2\2\u00e8\u00ea\5\36\20\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\u00ef\5\36\20\2\u00ef\35\3\2\2\2\u00f0\u00f1\7\27"+
		"\2\2\u00f1\u00f2\5\b\5\2\u00f2\u00f3\7\36\2\2\u00f3\u0109\3\2\2\2\u00f4"+
		"\u0109\5\60\31\2\u00f5\u0109\5\62\32\2\u00f6\u0109\5\"\22\2\u00f7\u0109"+
		"\5*\26\2\u00f8\u0109\5&\24\2\u00f9\u0109\5.\30\2\u00fa\u0109\5(\25\2\u00fb"+
		"\u00fc\5 \21\2\u00fc\u00fd\7\36\2\2\u00fd\u0109\3\2\2\2\u00fe\u00ff\7"+
		"\65\2\2\u00ff\u0100\5\20\t\2\u0100\u0101\7\36\2\2\u0101\u0109\3\2\2\2"+
		"\u0102\u0103\7\"\2\2\u0103\u0104\5\34\17\2\u0104\u0105\7#\2\2\u0105\u0109"+
		"\3\2\2\2\u0106\u0107\7;\2\2\u0107\u0109\b\20\1\2\u0108\u00f0\3\2\2\2\u0108"+
		"\u00f4\3\2\2\2\u0108\u00f5\3\2\2\2\u0108\u00f6\3\2\2\2\u0108\u00f7\3\2"+
		"\2\2\u0108\u00f8\3\2\2\2\u0108\u00f9\3\2\2\2\u0108\u00fa\3\2\2\2\u0108"+
		"\u00fb\3\2\2\2\u0108\u00fe\3\2\2\2\u0108\u0102\3\2\2\2\u0108\u0106\3\2"+
		"\2\2\u0109\37\3\2\2\2\u010a\u010b\7\65\2\2\u010b\u010c\7\37\2\2\u010c"+
		"\u0111\5\b\5\2\u010d\u010e\7\65\2\2\u010e\u010f\7\37\2\2\u010f\u0111\5"+
		"\22\n\2\u0110\u010a\3\2\2\2\u0110\u010d\3\2\2\2\u0111!\3\2\2\2\u0112\u0113"+
		"\7+\2\2\u0113\u0119\5$\23\2\u0114\u0115\7,\2\2\u0115\u0116\7+\2\2\u0116"+
		"\u0118\5$\23\2\u0117\u0114\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u0119\u011a\3\2\2\2\u011a\u0121\3\2\2\2\u011b\u0119\3\2\2\2\u011c"+
		"\u011e\7,\2\2\u011d\u011f\7\6\2\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120\u0122\5\30\r\2\u0121\u011c\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122#\3\2\2\2\u0123\u0125\5\b\5\2\u0124\u0126\7\6\2\2"+
		"\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128"+
		"\5\30\r\2\u0128%\3\2\2\2\u0129\u012a\7-\2\2\u012a\u012b\5$\23\2\u012b"+
		"\'\3\2\2\2\u012c\u012d\7\61\2\2\u012d\u012e\5\30\r\2\u012e\u012f\7-\2"+
		"\2\u012f\u0130\5\b\5\2\u0130)\3\2\2\2\u0131\u0132\7.\2\2\u0132\u0133\7"+
		"\65\2\2\u0133\u0134\7\"\2\2\u0134\u0135\5,\27\2\u0135\u0136\7#\2\2\u0136"+
		"+\3\2\2\2\u0137\u0138\7/\2\2\u0138\u0139\5\b\5\2\u0139\u013a\7\'\2\2\u013a"+
		"\u013d\5\34\17\2\u013b\u013c\7\60\2\2\u013c\u013e\7\36\2\2\u013d\u013b"+
		"\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\5,\27\2\u0140"+
		"\u0145\3\2\2\2\u0141\u0142\7\63\2\2\u0142\u0143\7\'\2\2\u0143\u0145\5"+
		"\34\17\2\u0144\u0137\3\2\2\2\u0144\u0141\3\2\2\2\u0145-\3\2\2\2\u0146"+
		"\u0147\7\62\2\2\u0147\u014c\5 \21\2\u0148\u0149\7&\2\2\u0149\u014b\5 "+
		"\21\2\u014a\u0148\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0150\7\36"+
		"\2\2\u0150\u0151\5\b\5\2\u0151\u0152\7\36\2\2\u0152\u0157\5 \21\2\u0153"+
		"\u0154\7&\2\2\u0154\u0156\5 \21\2\u0155\u0153\3\2\2\2\u0156\u0159\3\2"+
		"\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u015a\u015b\5\30\r\2\u015b\u0175\3\2\2\2\u015c\u015d\7"+
		"\62\2\2\u015d\u015e\7 \2\2\u015e\u0163\5 \21\2\u015f\u0160\7&\2\2\u0160"+
		"\u0162\5 \21\2\u0161\u015f\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2"+
		"\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166"+
		"\u0167\7\36\2\2\u0167\u0168\5\b\5\2\u0168\u0169\7\36\2\2\u0169\u016e\5"+
		" \21\2\u016a\u016b\7&\2\2\u016b\u016d\5 \21\2\u016c\u016a\3\2\2\2\u016d"+
		"\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171\3\2"+
		"\2\2\u0170\u016e\3\2\2\2\u0171\u0172\7!\2\2\u0172\u0173\5\30\r\2\u0173"+
		"\u0175\3\2\2\2\u0174\u0146\3\2\2\2\u0174\u015c\3\2\2\2\u0175/\3\2\2\2"+
		"\u0176\u0177\7\26\2\2\u0177\u0178\5\24\13\2\u0178\u0179\7\65\2\2\u0179"+
		"\u017a\7 \2\2\u017a\u017b\5\4\3\2\u017b\u017c\7!\2\2\u017c\u017d\5\30"+
		"\r\2\u017d\61\3\2\2\2\u017e\u017f\7\26\2\2\u017f\u0180\7\65\2\2\u0180"+
		"\u0181\7 \2\2\u0181\u0182\5\4\3\2\u0182\u0183\7!\2\2\u0183\u0184\5\30"+
		"\r\2\u0184\63\3\2\2\2\u0185\u0186\7\"\2\2\u0186\u0187\5\34\17\2\u0187"+
		"\u0188\7\36\2\2\u0188\u0189\7#\2\2\u0189\65\3\2\2\2&<GKRY]ns~\u0084\u008e"+
		"\u0097\u00a3\u00a9\u00af\u00b3\u00b9\u00c1\u00c4\u00d6\u00dc\u00e0\u00eb"+
		"\u0108\u0110\u0119\u011e\u0121\u0125\u013d\u0144\u014c\u0157\u0163\u016e"+
		"\u0174";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}