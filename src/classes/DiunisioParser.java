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
		DIV=16, MOD=17, POTENCIA=18, NO=19, SET=20, GET=21, DEF=22, RETORNAR=23, 
		INT=24, FLOAT=25, STRING=26, BOOL=27, MATRIZ=28, VECTOR=29, PCOMA=30, 
		ASIGNAR=31, PAREN_AP=32, PAREN_CI=33, LLAVEIZ=34, LLAVEDE=35, ANGIZ=36, 
		ANGDE=37, COMA=38, DOSPUNTOS=39, VERDADERO=40, FALSO=41, NULO=42, SI=43, 
		SI_NO=44, MIENTRAS=45, SELECCIONAR=46, CASO=47, ROMPER=48, HACER=49, PARA=50, 
		DEFECTO=51, CLASE=52, IDENTIFICADOR=53, ENTERO=54, REAL=55, COMPLEJO=56, 
		CADENA=57, ESPACIO=58, OTRO=59;
	public static final int
		RULE_algoritmo = 0, RULE_lista_ids = 1, RULE_exp_simple = 2, RULE_expresion = 3, 
		RULE_variable = 4, RULE_termino = 5, RULE_factor = 6, RULE_lista_parsv = 7, 
		RULE_conjunto = 8, RULE_tipo = 9, RULE_tipoclase = 10, RULE_bloque = 11, 
		RULE_decl_clases = 12, RULE_metodos = 13, RULE_sec_proposiciones = 14, 
		RULE_proposicion = 15, RULE_asignacion = 16, RULE_si_senten = 17, RULE_bloque_condicional = 18, 
		RULE_mientras_senten = 19, RULE_hacer_mientras_senten = 20, RULE_seleccionar_senten = 21, 
		RULE_casos = 22, RULE_para_senten = 23, RULE_estruc_control = 24, RULE_fun_senten = 25, 
		RULE_proc_senten = 26, RULE_funcion = 27;
	public static final String[] ruleNames = {
		"algoritmo", "lista_ids", "exp_simple", "expresion", "variable", "termino", 
		"factor", "lista_parsv", "conjunto", "tipo", "tipoclase", "bloque", "decl_clases", 
		"metodos", "sec_proposiciones", "proposicion", "asignacion", "si_senten", 
		"bloque_condicional", "mientras_senten", "hacer_mientras_senten", "seleccionar_senten", 
		"casos", "para_senten", "estruc_control", "fun_senten", "proc_senten", 
		"funcion"
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
			setState(56);
			match(ALGORITMO);
			setState(57);
			match(IDENTIFICADOR);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAREN_AP) {
				{
				setState(58);
				match(PAREN_AP);
				setState(59);
				lista_ids();
				setState(60);
				match(PAREN_CI);
				}
			}

			setState(64);
			match(DOSPUNTOS);
			setState(65);
			bloque();
			setState(66);
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
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(IDENTIFICADOR);
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(69);
					match(COMA);
					setState(70);
					match(IDENTIFICADOR);
					}
					}
					setState(75);
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
			int _alt;
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(PAREN_AP);
				setState(80);
				exp_simple();
				setState(81);
				match(PAREN_CI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUMA || _la==MENOS) {
					{
					setState(83);
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

				setState(86);
				termino();
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(87);
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
						setState(88);
						termino();
						}
						} 
					}
					setState(93);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
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
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(PAREN_AP);
				setState(98);
				expresion();
				setState(99);
				match(PAREN_CI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				exp_simple();
				setState(102);
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
				setState(103);
				exp_simple();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				match(PAREN_AP);
				setState(106);
				exp_simple();
				setState(107);
				match(PAREN_CI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				exp_simple();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				match(NO);
				setState(111);
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
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(IDENTIFICADOR);
				setState(115);
				conjunto();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
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
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(PAREN_AP);
				setState(120);
				termino();
				setState(121);
				match(PAREN_CI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				factor();
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(124);
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
						setState(125);
						factor();
						}
						} 
					}
					setState(130);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				match(NO);
				setState(132);
				termino();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
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
		try {
			int _alt;
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(ENTERO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(REAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(CADENA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				match(COMPLEJO);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				match(NULO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(141);
				variable();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(142);
				match(IDENTIFICADOR);
				setState(144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(143);
					lista_parsv();
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(146);
				match(IDENTIFICADOR);
				setState(151); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(147);
						match(ANGIZ);
						setState(148);
						factor();
						setState(149);
						match(ANGDE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(153); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(155);
				match(IDENTIFICADOR);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(156);
				match(NO);
				setState(157);
				factor();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(158);
				match(VERDADERO);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(159);
				match(FALSO);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(160);
				conjunto();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(161);
				match(PAREN_AP);
				setState(162);
				expresion();
				setState(163);
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
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(PAREN_AP);
				setState(171);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(168);
					expresion();
					}
					break;
				case 2:
					{
					setState(169);
					variable();
					}
					break;
				case 3:
					{
					setState(170);
					match(IDENTIFICADOR);
					}
					break;
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(173);
					match(COMA);
					setState(177);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(174);
						expresion();
						}
						break;
					case 2:
						{
						setState(175);
						variable();
						}
						break;
					case 3:
						{
						setState(176);
						match(IDENTIFICADOR);
						}
						break;
					}
					}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(184);
				match(PAREN_CI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(PAREN_AP);
				setState(186);
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
			setState(189);
			match(LLAVEIZ);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << MENOS) | (1L << NO) | (1L << PAREN_AP) | (1L << LLAVEIZ) | (1L << VERDADERO) | (1L << FALSO) | (1L << NULO) | (1L << IDENTIFICADOR) | (1L << ENTERO) | (1L << REAL) | (1L << COMPLEJO) | (1L << CADENA))) != 0)) {
				{
				setState(190);
				expresion();
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(191);
					match(COMA);
					setState(192);
					expresion();
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(200);
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
			setState(202);
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
			setState(204);
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
		public Decl_clasesContext decl_clases() {
			return getRuleContext(Decl_clasesContext.class,0);
		}
		public Sec_proposicionesContext sec_proposiciones() {
			return getRuleContext(Sec_proposicionesContext.class,0);
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
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(LLAVEIZ);
				setState(207);
				match(LLAVEDE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(LLAVEIZ);
				setState(209);
				decl_clases();
				setState(210);
				match(LLAVEDE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(LLAVEIZ);
				setState(213);
				sec_proposiciones();
				setState(214);
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
		public TerminalNode CLASE() { return getToken(DiunisioParser.CLASE, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(DiunisioParser.IDENTIFICADOR, 0); }
		public List<Sec_proposicionesContext> sec_proposiciones() {
			return getRuleContexts(Sec_proposicionesContext.class);
		}
		public Sec_proposicionesContext sec_proposiciones(int i) {
			return getRuleContext(Sec_proposicionesContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(CLASE);
			setState(219);
			match(IDENTIFICADOR);
			setState(220);
			match(LLAVEIZ);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEF) | (1L << RETORNAR) | (1L << LLAVEIZ) | (1L << SI) | (1L << MIENTRAS) | (1L << SELECCIONAR) | (1L << HACER) | (1L << PARA) | (1L << IDENTIFICADOR) | (1L << OTRO))) != 0)) {
				{
				{
				setState(221);
				sec_proposiciones();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
			match(LLAVEDE);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEF) | (1L << RETORNAR) | (1L << LLAVEIZ) | (1L << SI) | (1L << MIENTRAS) | (1L << SELECCIONAR) | (1L << HACER) | (1L << PARA) | (1L << IDENTIFICADOR) | (1L << OTRO))) != 0)) {
				{
				{
				setState(228);
				sec_proposiciones();
				}
				}
				setState(233);
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

	public static class MetodosContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(DiunisioParser.SET, 0); }
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(DiunisioParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(DiunisioParser.IDENTIFICADOR, i);
		}
		public TerminalNode PAREN_AP() { return getToken(DiunisioParser.PAREN_AP, 0); }
		public TerminalNode PAREN_CI() { return getToken(DiunisioParser.PAREN_CI, 0); }
		public TerminalNode LLAVEIZ() { return getToken(DiunisioParser.LLAVEIZ, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode LLAVEDE() { return getToken(DiunisioParser.LLAVEDE, 0); }
		public TerminalNode PCOMA() { return getToken(DiunisioParser.PCOMA, 0); }
		public TerminalNode GET() { return getToken(DiunisioParser.GET, 0); }
		public TerminalNode RETORNAR() { return getToken(DiunisioParser.RETORNAR, 0); }
		public MetodosContext metodos() {
			return getRuleContext(MetodosContext.class,0);
		}
		public Estruc_controlContext estruc_control() {
			return getRuleContext(Estruc_controlContext.class,0);
		}
		public MetodosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterMetodos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitMetodos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitMetodos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetodosContext metodos() throws RecognitionException {
		return metodos(0);
	}

	private MetodosContext metodos(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MetodosContext _localctx = new MetodosContext(_ctx, _parentState);
		MetodosContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_metodos, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				{
				setState(235);
				match(SET);
				setState(236);
				match(IDENTIFICADOR);
				setState(237);
				match(PAREN_AP);
				setState(238);
				match(PAREN_CI);
				setState(239);
				match(LLAVEIZ);
				setState(240);
				asignacion();
				setState(241);
				match(LLAVEDE);
				setState(242);
				match(PCOMA);
				}
				break;
			case GET:
				{
				setState(244);
				match(GET);
				setState(245);
				match(IDENTIFICADOR);
				setState(246);
				match(PAREN_AP);
				setState(247);
				match(PAREN_CI);
				setState(248);
				match(LLAVEIZ);
				setState(249);
				match(RETORNAR);
				setState(250);
				match(IDENTIFICADOR);
				setState(251);
				match(LLAVEDE);
				setState(252);
				match(PCOMA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MetodosContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_metodos);
					setState(255);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(256);
					estruc_control();
					}
					} 
				}
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
		enterRule(_localctx, 28, RULE_sec_proposiciones);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(262);
					proposicion();
					}
					} 
				}
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(268);
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
		enterRule(_localctx, 30, RULE_proposicion);
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(RETORNAR);
				setState(271);
				expresion();
				setState(272);
				match(PCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				fun_senten();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				proc_senten();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				si_senten();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(277);
				seleccionar_senten();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(278);
				mientras_senten();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(279);
				para_senten();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(280);
				hacer_mientras_senten();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(281);
				asignacion();
				setState(282);
				match(PCOMA);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(284);
				match(IDENTIFICADOR);
				setState(285);
				lista_parsv();
				setState(286);
				match(PCOMA);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(288);
				match(LLAVEIZ);
				setState(289);
				sec_proposiciones();
				setState(290);
				match(LLAVEDE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(292);
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
		enterRule(_localctx, 32, RULE_asignacion);
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new AsigNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(IDENTIFICADOR);
				setState(297);
				match(ASIGNAR);
				setState(298);
				expresion();
				}
				break;
			case 2:
				_localctx = new AsigVecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(IDENTIFICADOR);
				setState(300);
				match(ASIGNAR);
				setState(301);
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
		enterRule(_localctx, 34, RULE_si_senten);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(SI);
			setState(305);
			bloque_condicional();
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(306);
					match(SI_NO);
					setState(307);
					match(SI);
					setState(308);
					bloque_condicional();
					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(314);
				match(SI_NO);
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENTONCES) {
					{
					setState(315);
					match(ENTONCES);
					}
				}

				setState(318);
				bloque();
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
		enterRule(_localctx, 36, RULE_bloque_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			expresion();
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENTONCES) {
				{
				setState(322);
				match(ENTONCES);
				}
			}

			setState(325);
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
		enterRule(_localctx, 38, RULE_mientras_senten);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(MIENTRAS);
			setState(328);
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
		enterRule(_localctx, 40, RULE_hacer_mientras_senten);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(HACER);
			setState(331);
			bloque();
			setState(332);
			match(MIENTRAS);
			setState(333);
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
		enterRule(_localctx, 42, RULE_seleccionar_senten);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(SELECCIONAR);
			setState(336);
			match(IDENTIFICADOR);
			setState(337);
			match(LLAVEIZ);
			setState(338);
			casos();
			setState(339);
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
		enterRule(_localctx, 44, RULE_casos);
		int _la;
		try {
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASO:
				_localctx = new CasosGenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				match(CASO);
				setState(342);
				expresion();
				setState(343);
				match(DOSPUNTOS);
				setState(344);
				sec_proposiciones();
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROMPER) {
					{
					setState(345);
					match(ROMPER);
					setState(346);
					match(PCOMA);
					}
				}

				setState(349);
				casos();
				}
				break;
			case DEFECTO:
				_localctx = new CasosDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				match(DEFECTO);
				setState(352);
				match(DOSPUNTOS);
				setState(353);
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
		enterRule(_localctx, 46, RULE_para_senten);
		int _la;
		try {
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				match(PARA);
				setState(357);
				asignacion();
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(358);
					match(COMA);
					setState(359);
					asignacion();
					}
					}
					setState(364);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(365);
				match(PCOMA);
				setState(366);
				expresion();
				setState(367);
				match(PCOMA);
				setState(368);
				asignacion();
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(369);
					match(COMA);
					setState(370);
					asignacion();
					}
					}
					setState(375);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(376);
				bloque();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				match(PARA);
				setState(379);
				match(PAREN_AP);
				setState(380);
				asignacion();
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(381);
					match(COMA);
					setState(382);
					asignacion();
					}
					}
					setState(387);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(388);
				match(PCOMA);
				setState(389);
				expresion();
				setState(390);
				match(PCOMA);
				setState(391);
				asignacion();
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(392);
					match(COMA);
					setState(393);
					asignacion();
					}
					}
					setState(398);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(399);
				match(PAREN_CI);
				setState(400);
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

	public static class Estruc_controlContext extends ParserRuleContext {
		public Si_sentenContext si_senten() {
			return getRuleContext(Si_sentenContext.class,0);
		}
		public Bloque_condicionalContext bloque_condicional() {
			return getRuleContext(Bloque_condicionalContext.class,0);
		}
		public Mientras_sentenContext mientras_senten() {
			return getRuleContext(Mientras_sentenContext.class,0);
		}
		public Hacer_mientras_sentenContext hacer_mientras_senten() {
			return getRuleContext(Hacer_mientras_sentenContext.class,0);
		}
		public Seleccionar_sentenContext seleccionar_senten() {
			return getRuleContext(Seleccionar_sentenContext.class,0);
		}
		public Para_sentenContext para_senten() {
			return getRuleContext(Para_sentenContext.class,0);
		}
		public Estruc_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estruc_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).enterEstruc_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiunisioListener ) ((DiunisioListener)listener).exitEstruc_control(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiunisioVisitor ) return ((DiunisioVisitor<? extends T>)visitor).visitEstruc_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Estruc_controlContext estruc_control() throws RecognitionException {
		Estruc_controlContext _localctx = new Estruc_controlContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_estruc_control);
		try {
			setState(410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SI:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				si_senten();
				}
				break;
			case SUMA:
			case MENOS:
			case NO:
			case PAREN_AP:
			case LLAVEIZ:
			case VERDADERO:
			case FALSO:
			case NULO:
			case IDENTIFICADOR:
			case ENTERO:
			case REAL:
			case COMPLEJO:
			case CADENA:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				bloque_condicional();
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 3);
				{
				setState(406);
				mientras_senten();
				}
				break;
			case HACER:
				enterOuterAlt(_localctx, 4);
				{
				setState(407);
				hacer_mientras_senten();
				}
				break;
			case SELECCIONAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(408);
				seleccionar_senten();
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 6);
				{
				setState(409);
				para_senten();
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
		enterRule(_localctx, 50, RULE_fun_senten);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(DEF);
			setState(413);
			tipo();
			setState(414);
			match(IDENTIFICADOR);
			setState(415);
			match(PAREN_AP);
			setState(416);
			lista_ids();
			setState(417);
			match(PAREN_CI);
			setState(418);
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
		enterRule(_localctx, 52, RULE_proc_senten);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(DEF);
			setState(421);
			match(IDENTIFICADOR);
			setState(422);
			match(PAREN_AP);
			setState(423);
			lista_ids();
			setState(424);
			match(PAREN_CI);
			setState(425);
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
		enterRule(_localctx, 54, RULE_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(LLAVEIZ);
			setState(428);
			sec_proposiciones();
			setState(429);
			match(PCOMA);
			setState(430);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return metodos_sempred((MetodosContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean metodos_sempred(MetodosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u01b3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2\5\2A"+
		"\n\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3J\n\3\f\3\16\3M\13\3\3\3\5\3P\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\5\4W\n\4\3\4\3\4\3\4\7\4\\\n\4\f\4\16\4_\13\4\3\4"+
		"\5\4b\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5s\n\5\3\6\3\6\3\6\5\6x\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0081\n"+
		"\7\f\7\16\7\u0084\13\7\3\7\3\7\3\7\5\7\u0089\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u0093\n\b\3\b\3\b\3\b\3\b\3\b\6\b\u009a\n\b\r\b\16\b\u009b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a8\n\b\3\t\3\t\3\t\3\t"+
		"\5\t\u00ae\n\t\3\t\3\t\3\t\3\t\5\t\u00b4\n\t\7\t\u00b6\n\t\f\t\16\t\u00b9"+
		"\13\t\3\t\3\t\3\t\5\t\u00be\n\t\3\n\3\n\3\n\3\n\7\n\u00c4\n\n\f\n\16\n"+
		"\u00c7\13\n\5\n\u00c9\n\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u00db\n\r\3\16\3\16\3\16\3\16\7\16\u00e1\n"+
		"\16\f\16\16\16\u00e4\13\16\3\16\3\16\7\16\u00e8\n\16\f\16\16\16\u00eb"+
		"\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0100\n\17\3\17\3\17\7\17\u0104\n"+
		"\17\f\17\16\17\u0107\13\17\3\20\7\20\u010a\n\20\f\20\16\20\u010d\13\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0129"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0131\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\7\23\u0138\n\23\f\23\16\23\u013b\13\23\3\23\3\23\5\23\u013f\n\23"+
		"\3\23\5\23\u0142\n\23\3\24\3\24\5\24\u0146\n\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\5\30\u015e\n\30\3\30\3\30\3\30\3\30\3\30\5\30\u0165"+
		"\n\30\3\31\3\31\3\31\3\31\7\31\u016b\n\31\f\31\16\31\u016e\13\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\7\31\u0176\n\31\f\31\16\31\u0179\13\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0182\n\31\f\31\16\31\u0185\13\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u018d\n\31\f\31\16\31\u0190\13\31"+
		"\3\31\3\31\3\31\5\31\u0195\n\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u019d"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\2\3\34\36\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\7\3\2\17\20\4\2\7\7\17\20\3"+
		"\2\t\16\4\2\7\b\21\24\3\2\32\37\2\u01e0\2:\3\2\2\2\4O\3\2\2\2\6a\3\2\2"+
		"\2\br\3\2\2\2\nw\3\2\2\2\f\u0088\3\2\2\2\16\u00a7\3\2\2\2\20\u00bd\3\2"+
		"\2\2\22\u00bf\3\2\2\2\24\u00cc\3\2\2\2\26\u00ce\3\2\2\2\30\u00da\3\2\2"+
		"\2\32\u00dc\3\2\2\2\34\u00ff\3\2\2\2\36\u010b\3\2\2\2 \u0128\3\2\2\2\""+
		"\u0130\3\2\2\2$\u0132\3\2\2\2&\u0143\3\2\2\2(\u0149\3\2\2\2*\u014c\3\2"+
		"\2\2,\u0151\3\2\2\2.\u0164\3\2\2\2\60\u0194\3\2\2\2\62\u019c\3\2\2\2\64"+
		"\u019e\3\2\2\2\66\u01a6\3\2\2\28\u01ad\3\2\2\2:;\7\4\2\2;@\7\67\2\2<="+
		"\7\"\2\2=>\5\4\3\2>?\7#\2\2?A\3\2\2\2@<\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC"+
		"\7)\2\2CD\5\30\r\2DE\7\5\2\2E\3\3\2\2\2FK\7\67\2\2GH\7(\2\2HJ\7\67\2\2"+
		"IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LP\3\2\2\2MK\3\2\2\2NP\3\2\2\2"+
		"OF\3\2\2\2ON\3\2\2\2P\5\3\2\2\2QR\7\"\2\2RS\5\6\4\2ST\7#\2\2Tb\3\2\2\2"+
		"UW\t\2\2\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2\2X]\5\f\7\2YZ\t\3\2\2Z\\\5\f\7"+
		"\2[Y\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^b\3\2\2\2_]\3\2\2\2`b\5\f"+
		"\7\2aQ\3\2\2\2aV\3\2\2\2a`\3\2\2\2b\7\3\2\2\2cd\7\"\2\2de\5\b\5\2ef\7"+
		"#\2\2fs\3\2\2\2gh\5\6\4\2hi\t\4\2\2ij\5\6\4\2js\3\2\2\2kl\7\"\2\2lm\5"+
		"\6\4\2mn\7#\2\2ns\3\2\2\2os\5\6\4\2pq\7\25\2\2qs\5\b\5\2rc\3\2\2\2rg\3"+
		"\2\2\2rk\3\2\2\2ro\3\2\2\2rp\3\2\2\2s\t\3\2\2\2tu\7\67\2\2ux\5\22\n\2"+
		"vx\7\67\2\2wt\3\2\2\2wv\3\2\2\2x\13\3\2\2\2yz\7\"\2\2z{\5\f\7\2{|\7#\2"+
		"\2|\u0089\3\2\2\2}\u0082\5\16\b\2~\177\t\5\2\2\177\u0081\5\16\b\2\u0080"+
		"~\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2"+
		"\u0083\u0089\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7\25\2\2\u0086\u0089"+
		"\5\f\7\2\u0087\u0089\5\16\b\2\u0088y\3\2\2\2\u0088}\3\2\2\2\u0088\u0085"+
		"\3\2\2\2\u0088\u0087\3\2\2\2\u0089\r\3\2\2\2\u008a\u00a8\78\2\2\u008b"+
		"\u00a8\79\2\2\u008c\u00a8\7;\2\2\u008d\u00a8\7:\2\2\u008e\u00a8\7,\2\2"+
		"\u008f\u00a8\5\n\6\2\u0090\u0092\7\67\2\2\u0091\u0093\5\20\t\2\u0092\u0091"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u00a8\3\2\2\2\u0094\u0099\7\67\2\2"+
		"\u0095\u0096\7&\2\2\u0096\u0097\5\16\b\2\u0097\u0098\7\'\2\2\u0098\u009a"+
		"\3\2\2\2\u0099\u0095\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u00a8\3\2\2\2\u009d\u00a8\7\67\2\2\u009e\u009f\7"+
		"\25\2\2\u009f\u00a8\5\16\b\2\u00a0\u00a8\7*\2\2\u00a1\u00a8\7+\2\2\u00a2"+
		"\u00a8\5\22\n\2\u00a3\u00a4\7\"\2\2\u00a4\u00a5\5\b\5\2\u00a5\u00a6\7"+
		"#\2\2\u00a6\u00a8\3\2\2\2\u00a7\u008a\3\2\2\2\u00a7\u008b\3\2\2\2\u00a7"+
		"\u008c\3\2\2\2\u00a7\u008d\3\2\2\2\u00a7\u008e\3\2\2\2\u00a7\u008f\3\2"+
		"\2\2\u00a7\u0090\3\2\2\2\u00a7\u0094\3\2\2\2\u00a7\u009d\3\2\2\2\u00a7"+
		"\u009e\3\2\2\2\u00a7\u00a0\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a2\3\2"+
		"\2\2\u00a7\u00a3\3\2\2\2\u00a8\17\3\2\2\2\u00a9\u00ad\7\"\2\2\u00aa\u00ae"+
		"\5\b\5\2\u00ab\u00ae\5\n\6\2\u00ac\u00ae\7\67\2\2\u00ad\u00aa\3\2\2\2"+
		"\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b7\3\2\2\2\u00af\u00b3"+
		"\7(\2\2\u00b0\u00b4\5\b\5\2\u00b1\u00b4\5\n\6\2\u00b2\u00b4\7\67\2\2\u00b3"+
		"\u00b0\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b6\3\2"+
		"\2\2\u00b5\u00af\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00be\7#"+
		"\2\2\u00bb\u00bc\7\"\2\2\u00bc\u00be\7#\2\2\u00bd\u00a9\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\21\3\2\2\2\u00bf\u00c8\7$\2\2\u00c0\u00c5\5\b\5\2"+
		"\u00c1\u00c2\7(\2\2\u00c2\u00c4\5\b\5\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7"+
		"\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00c0\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cb\7%\2\2\u00cb\23\3\2\2\2\u00cc\u00cd\t\6\2\2\u00cd\25"+
		"\3\2\2\2\u00ce\u00cf\7\66\2\2\u00cf\27\3\2\2\2\u00d0\u00d1\7$\2\2\u00d1"+
		"\u00db\7%\2\2\u00d2\u00d3\7$\2\2\u00d3\u00d4\5\32\16\2\u00d4\u00d5\7%"+
		"\2\2\u00d5\u00db\3\2\2\2\u00d6\u00d7\7$\2\2\u00d7\u00d8\5\36\20\2\u00d8"+
		"\u00d9\7%\2\2\u00d9\u00db\3\2\2\2\u00da\u00d0\3\2\2\2\u00da\u00d2\3\2"+
		"\2\2\u00da\u00d6\3\2\2\2\u00db\31\3\2\2\2\u00dc\u00dd\7\66\2\2\u00dd\u00de"+
		"\7\67\2\2\u00de\u00e2\7$\2\2\u00df\u00e1\5\36\20\2\u00e0\u00df\3\2\2\2"+
		"\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e9\7%\2\2\u00e6\u00e8\5\36\20\2"+
		"\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea"+
		"\3\2\2\2\u00ea\33\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\b\17\1\2\u00ed"+
		"\u00ee\7\26\2\2\u00ee\u00ef\7\67\2\2\u00ef\u00f0\7\"\2\2\u00f0\u00f1\7"+
		"#\2\2\u00f1\u00f2\7$\2\2\u00f2\u00f3\5\"\22\2\u00f3\u00f4\7%\2\2\u00f4"+
		"\u00f5\7 \2\2\u00f5\u0100\3\2\2\2\u00f6\u00f7\7\27\2\2\u00f7\u00f8\7\67"+
		"\2\2\u00f8\u00f9\7\"\2\2\u00f9\u00fa\7#\2\2\u00fa\u00fb\7$\2\2\u00fb\u00fc"+
		"\7\31\2\2\u00fc\u00fd\7\67\2\2\u00fd\u00fe\7%\2\2\u00fe\u0100\7 \2\2\u00ff"+
		"\u00ec\3\2\2\2\u00ff\u00f6\3\2\2\2\u0100\u0105\3\2\2\2\u0101\u0102\f\3"+
		"\2\2\u0102\u0104\5\62\32\2\u0103\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\35\3\2\2\2\u0107\u0105\3\2\2"+
		"\2\u0108\u010a\5 \21\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109"+
		"\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e"+
		"\u010f\5 \21\2\u010f\37\3\2\2\2\u0110\u0111\7\31\2\2\u0111\u0112\5\b\5"+
		"\2\u0112\u0113\7 \2\2\u0113\u0129\3\2\2\2\u0114\u0129\5\64\33\2\u0115"+
		"\u0129\5\66\34\2\u0116\u0129\5$\23\2\u0117\u0129\5,\27\2\u0118\u0129\5"+
		"(\25\2\u0119\u0129\5\60\31\2\u011a\u0129\5*\26\2\u011b\u011c\5\"\22\2"+
		"\u011c\u011d\7 \2\2\u011d\u0129\3\2\2\2\u011e\u011f\7\67\2\2\u011f\u0120"+
		"\5\20\t\2\u0120\u0121\7 \2\2\u0121\u0129\3\2\2\2\u0122\u0123\7$\2\2\u0123"+
		"\u0124\5\36\20\2\u0124\u0125\7%\2\2\u0125\u0129\3\2\2\2\u0126\u0127\7"+
		"=\2\2\u0127\u0129\b\21\1\2\u0128\u0110\3\2\2\2\u0128\u0114\3\2\2\2\u0128"+
		"\u0115\3\2\2\2\u0128\u0116\3\2\2\2\u0128\u0117\3\2\2\2\u0128\u0118\3\2"+
		"\2\2\u0128\u0119\3\2\2\2\u0128\u011a\3\2\2\2\u0128\u011b\3\2\2\2\u0128"+
		"\u011e\3\2\2\2\u0128\u0122\3\2\2\2\u0128\u0126\3\2\2\2\u0129!\3\2\2\2"+
		"\u012a\u012b\7\67\2\2\u012b\u012c\7!\2\2\u012c\u0131\5\b\5\2\u012d\u012e"+
		"\7\67\2\2\u012e\u012f\7!\2\2\u012f\u0131\5\22\n\2\u0130\u012a\3\2\2\2"+
		"\u0130\u012d\3\2\2\2\u0131#\3\2\2\2\u0132\u0133\7-\2\2\u0133\u0139\5&"+
		"\24\2\u0134\u0135\7.\2\2\u0135\u0136\7-\2\2\u0136\u0138\5&\24\2\u0137"+
		"\u0134\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\u0141\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013e\7.\2\2\u013d"+
		"\u013f\7\6\2\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u0142\5\30\r\2\u0141\u013c\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"%\3\2\2\2\u0143\u0145\5\b\5\2\u0144\u0146\7\6\2\2\u0145\u0144\3\2\2\2"+
		"\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\5\30\r\2\u0148\'"+
		"\3\2\2\2\u0149\u014a\7/\2\2\u014a\u014b\5&\24\2\u014b)\3\2\2\2\u014c\u014d"+
		"\7\63\2\2\u014d\u014e\5\30\r\2\u014e\u014f\7/\2\2\u014f\u0150\5\b\5\2"+
		"\u0150+\3\2\2\2\u0151\u0152\7\60\2\2\u0152\u0153\7\67\2\2\u0153\u0154"+
		"\7$\2\2\u0154\u0155\5.\30\2\u0155\u0156\7%\2\2\u0156-\3\2\2\2\u0157\u0158"+
		"\7\61\2\2\u0158\u0159\5\b\5\2\u0159\u015a\7)\2\2\u015a\u015d\5\36\20\2"+
		"\u015b\u015c\7\62\2\2\u015c\u015e\7 \2\2\u015d\u015b\3\2\2\2\u015d\u015e"+
		"\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\5.\30\2\u0160\u0165\3\2\2\2\u0161"+
		"\u0162\7\65\2\2\u0162\u0163\7)\2\2\u0163\u0165\5\36\20\2\u0164\u0157\3"+
		"\2\2\2\u0164\u0161\3\2\2\2\u0165/\3\2\2\2\u0166\u0167\7\64\2\2\u0167\u016c"+
		"\5\"\22\2\u0168\u0169\7(\2\2\u0169\u016b\5\"\22\2\u016a\u0168\3\2\2\2"+
		"\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f"+
		"\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0170\7 \2\2\u0170\u0171\5\b\5\2\u0171"+
		"\u0172\7 \2\2\u0172\u0177\5\"\22\2\u0173\u0174\7(\2\2\u0174\u0176\5\""+
		"\22\2\u0175\u0173\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\5\30"+
		"\r\2\u017b\u0195\3\2\2\2\u017c\u017d\7\64\2\2\u017d\u017e\7\"\2\2\u017e"+
		"\u0183\5\"\22\2\u017f\u0180\7(\2\2\u0180\u0182\5\"\22\2\u0181\u017f\3"+
		"\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0186\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187\7 \2\2\u0187\u0188\5\b"+
		"\5\2\u0188\u0189\7 \2\2\u0189\u018e\5\"\22\2\u018a\u018b\7(\2\2\u018b"+
		"\u018d\5\"\22\2\u018c\u018a\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3"+
		"\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u018e\3\2\2\2\u0191"+
		"\u0192\7#\2\2\u0192\u0193\5\30\r\2\u0193\u0195\3\2\2\2\u0194\u0166\3\2"+
		"\2\2\u0194\u017c\3\2\2\2\u0195\61\3\2\2\2\u0196\u019d\5$\23\2\u0197\u019d"+
		"\5&\24\2\u0198\u019d\5(\25\2\u0199\u019d\5*\26\2\u019a\u019d\5,\27\2\u019b"+
		"\u019d\5\60\31\2\u019c\u0196\3\2\2\2\u019c\u0197\3\2\2\2\u019c\u0198\3"+
		"\2\2\2\u019c\u0199\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019b\3\2\2\2\u019d"+
		"\63\3\2\2\2\u019e\u019f\7\30\2\2\u019f\u01a0\5\24\13\2\u01a0\u01a1\7\67"+
		"\2\2\u01a1\u01a2\7\"\2\2\u01a2\u01a3\5\4\3\2\u01a3\u01a4\7#\2\2\u01a4"+
		"\u01a5\5\30\r\2\u01a5\65\3\2\2\2\u01a6\u01a7\7\30\2\2\u01a7\u01a8\7\67"+
		"\2\2\u01a8\u01a9\7\"\2\2\u01a9\u01aa\5\4\3\2\u01aa\u01ab\7#\2\2\u01ab"+
		"\u01ac\5\30\r\2\u01ac\67\3\2\2\2\u01ad\u01ae\7$\2\2\u01ae\u01af\5\36\20"+
		"\2\u01af\u01b0\7 \2\2\u01b0\u01b1\7%\2\2\u01b19\3\2\2\2)@KOV]arw\u0082"+
		"\u0088\u0092\u009b\u00a7\u00ad\u00b3\u00b7\u00bd\u00c5\u00c8\u00da\u00e2"+
		"\u00e9\u00ff\u0105\u010b\u0128\u0130\u0139\u013e\u0141\u0145\u015d\u0164"+
		"\u016c\u0177\u0183\u018e\u0194\u019c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}