// Generated from Lenguaje.g4 by ANTLR 4.8
package isidro.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LenguajeParser extends Parser {
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
	public static final int
		RULE_inicio = 0, RULE_bloque = 1, RULE_llave_A = 2, RULE_llave_C = 3, 
		RULE_instrucciones = 4, RULE_if_condicion = 5, RULE_condicion = 6, RULE_bloque_condicion = 7, 
		RULE_incremento = 8, RULE_declarar_y_asignar = 9, RULE_declaracion = 10, 
		RULE_asignacion = 11, RULE_ciclo_while = 12, RULE_impresion = 13, RULE_strings = 14, 
		RULE_operaciones = 15, RULE_expr = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "bloque", "llave_A", "llave_C", "instrucciones", "if_condicion", 
			"condicion", "bloque_condicion", "incremento", "declarar_y_asignar", 
			"declaracion", "asignacion", "ciclo_while", "impresion", "strings", "operaciones", 
			"expr"
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

	@Override
	public String getGrammarFileName() { return "Lenguaje.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LenguajeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InicioContext extends ParserRuleContext {
		public TerminalNode CLASE() { return getToken(LenguajeParser.CLASE, 0); }
		public TerminalNode ID() { return getToken(LenguajeParser.ID, 0); }
		public TerminalNode PAR_A() { return getToken(LenguajeParser.PAR_A, 0); }
		public TerminalNode PAR_C() { return getToken(LenguajeParser.PAR_C, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode LIBRERIA() { return getToken(LenguajeParser.LIBRERIA, 0); }
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIBRERIA) {
				{
				setState(34);
				match(LIBRERIA);
				}
			}

			setState(37);
			match(CLASE);
			setState(38);
			match(ID);
			setState(39);
			match(PAR_A);
			setState(40);
			match(PAR_C);
			setState(41);
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

	public static class BloqueContext extends ParserRuleContext {
		public Llave_AContext llave_A() {
			return getRuleContext(Llave_AContext.class,0);
		}
		public Llave_CContext llave_C() {
			return getRuleContext(Llave_CContext.class,0);
		}
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			llave_A();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO_DATO) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << ID) | (1L << LLAVE_A))) != 0)) {
				{
				{
				setState(44);
				instrucciones();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			llave_C();
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

	public static class Llave_AContext extends ParserRuleContext {
		public TerminalNode LLAVE_A() { return getToken(LenguajeParser.LLAVE_A, 0); }
		public Llave_AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llave_A; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitLlave_A(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llave_AContext llave_A() throws RecognitionException {
		Llave_AContext _localctx = new Llave_AContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_llave_A);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(LLAVE_A);
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

	public static class Llave_CContext extends ParserRuleContext {
		public TerminalNode LLAVE_C() { return getToken(LenguajeParser.LLAVE_C, 0); }
		public Llave_CContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llave_C; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitLlave_C(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llave_CContext llave_C() throws RecognitionException {
		Llave_CContext _localctx = new Llave_CContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_llave_C);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(LLAVE_C);
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

	public static class InstruccionesContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public ImpresionContext impresion() {
			return getRuleContext(ImpresionContext.class,0);
		}
		public If_condicionContext if_condicion() {
			return getRuleContext(If_condicionContext.class,0);
		}
		public Ciclo_whileContext ciclo_while() {
			return getRuleContext(Ciclo_whileContext.class,0);
		}
		public Declarar_y_asignarContext declarar_y_asignar() {
			return getRuleContext(Declarar_y_asignarContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instrucciones);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				declaracion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				asignacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				impresion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				if_condicion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				ciclo_while();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(61);
				declarar_y_asignar();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(62);
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

	public static class If_condicionContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(LenguajeParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(LenguajeParser.IF, i);
		}
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(LenguajeParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(LenguajeParser.ELSE, i);
		}
		public Bloque_condicionContext bloque_condicion() {
			return getRuleContext(Bloque_condicionContext.class,0);
		}
		public If_condicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_condicion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitIf_condicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_condicionContext if_condicion() throws RecognitionException {
		If_condicionContext _localctx = new If_condicionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_if_condicion);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(IF);
			setState(66);
			condicion();
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(67);
					match(ELSE);
					setState(68);
					match(IF);
					setState(69);
					condicion();
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(75);
				match(ELSE);
				setState(76);
				bloque_condicion();
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

	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode PAR_A() { return getToken(LenguajeParser.PAR_A, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_C() { return getToken(LenguajeParser.PAR_C, 0); }
		public Bloque_condicionContext bloque_condicion() {
			return getRuleContext(Bloque_condicionContext.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(PAR_A);
			setState(80);
			expr(0);
			setState(81);
			match(PAR_C);
			setState(82);
			bloque_condicion();
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

	public static class Bloque_condicionContext extends ParserRuleContext {
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Bloque_condicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_condicion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitBloque_condicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_condicionContext bloque_condicion() throws RecognitionException {
		Bloque_condicionContext _localctx = new Bloque_condicionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bloque_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
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

	public static class IncrementoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LenguajeParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MASMAS() { return getToken(LenguajeParser.MASMAS, 0); }
		public TerminalNode PYC() { return getToken(LenguajeParser.PYC, 0); }
		public IncrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incremento; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitIncremento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementoContext incremento() throws RecognitionException {
		IncrementoContext _localctx = new IncrementoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_incremento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(ID);
			setState(87);
			expr(0);
			setState(88);
			match(MASMAS);
			setState(89);
			match(PYC);
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

	public static class Declarar_y_asignarContext extends ParserRuleContext {
		public TerminalNode TIPO_DATO() { return getToken(LenguajeParser.TIPO_DATO, 0); }
		public TerminalNode ID() { return getToken(LenguajeParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(LenguajeParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PYC() { return getToken(LenguajeParser.PYC, 0); }
		public Declarar_y_asignarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarar_y_asignar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitDeclarar_y_asignar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declarar_y_asignarContext declarar_y_asignar() throws RecognitionException {
		Declarar_y_asignarContext _localctx = new Declarar_y_asignarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declarar_y_asignar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(TIPO_DATO);
			setState(92);
			match(ID);
			setState(93);
			match(IGUAL);
			setState(94);
			expr(0);
			setState(95);
			match(PYC);
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

	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode TIPO_DATO() { return getToken(LenguajeParser.TIPO_DATO, 0); }
		public TerminalNode ID() { return getToken(LenguajeParser.ID, 0); }
		public TerminalNode PYC() { return getToken(LenguajeParser.PYC, 0); }
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(TIPO_DATO);
			setState(98);
			match(ID);
			setState(99);
			match(PYC);
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
		public TerminalNode ID() { return getToken(LenguajeParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(LenguajeParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PYC() { return getToken(LenguajeParser.PYC, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(ID);
			setState(102);
			match(IGUAL);
			setState(103);
			expr(0);
			setState(104);
			match(PYC);
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

	public static class Ciclo_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(LenguajeParser.WHILE, 0); }
		public TerminalNode PAR_A() { return getToken(LenguajeParser.PAR_A, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_C() { return getToken(LenguajeParser.PAR_C, 0); }
		public Bloque_condicionContext bloque_condicion() {
			return getRuleContext(Bloque_condicionContext.class,0);
		}
		public Ciclo_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_while; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitCiclo_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_whileContext ciclo_while() throws RecognitionException {
		Ciclo_whileContext _localctx = new Ciclo_whileContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ciclo_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(WHILE);
			setState(107);
			match(PAR_A);
			setState(108);
			expr(0);
			setState(109);
			match(PAR_C);
			setState(110);
			bloque_condicion();
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

	public static class ImpresionContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(LenguajeParser.PRINT, 0); }
		public TerminalNode PYC() { return getToken(LenguajeParser.PYC, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public StringsContext strings() {
			return getRuleContext(StringsContext.class,0);
		}
		public ImpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitImpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpresionContext impresion() throws RecognitionException {
		ImpresionContext _localctx = new ImpresionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_impresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(PRINT);
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(113);
				operaciones();
				}
				break;
			case 2:
				{
				setState(114);
				strings();
				}
				break;
			}
			setState(117);
			match(PYC);
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

	public static class StringsContext extends ParserRuleContext {
		public StringsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strings; }
	 
		public StringsContext() { }
		public void copyFrom(StringsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImprimirContext extends StringsContext {
		public TerminalNode PAR_A() { return getToken(LenguajeParser.PAR_A, 0); }
		public TerminalNode STRING() { return getToken(LenguajeParser.STRING, 0); }
		public TerminalNode PAR_C() { return getToken(LenguajeParser.PAR_C, 0); }
		public ImprimirContext(StringsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringsContext strings() throws RecognitionException {
		StringsContext _localctx = new StringsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_strings);
		try {
			_localctx = new ImprimirContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(PAR_A);
			setState(120);
			match(STRING);
			setState(121);
			match(PAR_C);
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

	public static class OperacionesContext extends ParserRuleContext {
		public OperacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operaciones; }
	 
		public OperacionesContext() { }
		public void copyFrom(OperacionesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Imprimir2Context extends OperacionesContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Imprimir2Context(OperacionesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitImprimir2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionesContext operaciones() throws RecognitionException {
		OperacionesContext _localctx = new OperacionesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operaciones);
		try {
			_localctx = new Imprimir2Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprNotContext extends ExprContext {
		public TerminalNode NOT() { return getToken(LenguajeParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprNotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitExprNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VerdadContext extends ExprContext {
		public TerminalNode VERDADERO() { return getToken(LenguajeParser.VERDADERO, 0); }
		public VerdadContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitVerdad(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expresion_RelacionalContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MENOR_QUE() { return getToken(LenguajeParser.MENOR_QUE, 0); }
		public TerminalNode MAYOR_QUE() { return getToken(LenguajeParser.MAYOR_QUE, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(LenguajeParser.MENOR_IGUAL, 0); }
		public TerminalNode MAYOR_IGUAL() { return getToken(LenguajeParser.MAYOR_IGUAL, 0); }
		public Expresion_RelacionalContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitExpresion_Relacional(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatContext extends ExprContext {
		public TerminalNode FLOTA() { return getToken(LenguajeParser.FLOTA, 0); }
		public FloatContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expresion_igualContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IGUAL_IGUAL() { return getToken(LenguajeParser.IGUAL_IGUAL, 0); }
		public TerminalNode DIFERENTE_QUE() { return getToken(LenguajeParser.DIFERENTE_QUE, 0); }
		public Expresion_igualContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitExpresion_igual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentesisExprContext extends ExprContext {
		public TerminalNode PAR_A() { return getToken(LenguajeParser.PAR_A, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_C() { return getToken(LenguajeParser.PAR_C, 0); }
		public ParentesisExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitParentesisExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(LenguajeParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POR() { return getToken(LenguajeParser.POR, 0); }
		public TerminalNode DIV() { return getToken(LenguajeParser.DIV, 0); }
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprOrContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(LenguajeParser.OR, 0); }
		public ExprOrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitExprOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumResContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MAS() { return getToken(LenguajeParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(LenguajeParser.MENOS, 0); }
		public SumResContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitSumRes(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAndContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(LenguajeParser.AND, 0); }
		public ExprAndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitExprAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expresion_negativaContext extends ExprContext {
		public TerminalNode MENOS() { return getToken(LenguajeParser.MENOS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expresion_negativaContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitExpresion_negativa(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FakeContext extends ExprContext {
		public TerminalNode FALSO() { return getToken(LenguajeParser.FALSO, 0); }
		public FakeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitFake(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(LenguajeParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MENOS:
				{
				_localctx = new Expresion_negativaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(126);
				match(MENOS);
				setState(127);
				expr(14);
				}
				break;
			case NOT:
				{
				_localctx = new ExprNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				match(NOT);
				setState(129);
				expr(13);
				}
				break;
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				match(INT);
				}
				break;
			case FLOTA:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				match(FLOTA);
				}
				break;
			case VERDADERO:
				{
				_localctx = new VerdadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				match(VERDADERO);
				}
				break;
			case FALSO:
				{
				_localctx = new FakeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				match(FALSO);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				match(ID);
				}
				break;
			case PAR_A:
				{
				_localctx = new ParentesisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				match(PAR_A);
				setState(136);
				expr(0);
				setState(137);
				match(PAR_C);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(159);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(141);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(142);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==POR || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(143);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new SumResContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(144);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(145);
						((SumResContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MAS || _la==MENOS) ) {
							((SumResContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(146);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new Expresion_RelacionalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(147);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(148);
						((Expresion_RelacionalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYOR_QUE) | (1L << MENOR_QUE) | (1L << MAYOR_IGUAL) | (1L << MENOR_IGUAL))) != 0)) ) {
							((Expresion_RelacionalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(149);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new Expresion_igualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(150);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(151);
						((Expresion_igualContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==IGUAL_IGUAL || _la==DIFERENTE_QUE) ) {
							((Expresion_igualContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(152);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new ExprAndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(153);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(154);
						match(AND);
						setState(155);
						expr(9);
						}
						break;
					case 6:
						{
						_localctx = new ExprOrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(156);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(157);
						match(OR);
						setState(158);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00a7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\5\2&\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\7\3\60\n\3\f\3\16\3\63\13"+
		"\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6B\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\7\7I\n\7\f\7\16\7L\13\7\3\7\3\7\5\7P\n\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\5\17v\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u008e\n\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u00a2\n\22\f\22\16\22\u00a5\13\22\3\22\2\3\""+
		"\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\6\3\2\34\35\3\2\36\37"+
		"\3\2\25\30\3\2\31\32\2\u00ad\2%\3\2\2\2\4-\3\2\2\2\6\66\3\2\2\2\b8\3\2"+
		"\2\2\nA\3\2\2\2\fC\3\2\2\2\16Q\3\2\2\2\20V\3\2\2\2\22X\3\2\2\2\24]\3\2"+
		"\2\2\26c\3\2\2\2\30g\3\2\2\2\32l\3\2\2\2\34r\3\2\2\2\36y\3\2\2\2 }\3\2"+
		"\2\2\"\u008d\3\2\2\2$&\7\3\2\2%$\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\'(\7\4\2"+
		"\2()\7\21\2\2)*\7$\2\2*+\7%\2\2+,\5\4\3\2,\3\3\2\2\2-\61\5\6\4\2.\60\5"+
		"\n\6\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2"+
		"\63\61\3\2\2\2\64\65\5\b\5\2\65\5\3\2\2\2\66\67\7\"\2\2\67\7\3\2\2\28"+
		"9\7#\2\29\t\3\2\2\2:B\5\26\f\2;B\5\30\r\2<B\5\34\17\2=B\5\f\7\2>B\5\32"+
		"\16\2?B\5\24\13\2@B\5\4\3\2A:\3\2\2\2A;\3\2\2\2A<\3\2\2\2A=\3\2\2\2A>"+
		"\3\2\2\2A?\3\2\2\2A@\3\2\2\2B\13\3\2\2\2CD\7\7\2\2DJ\5\16\b\2EF\7\b\2"+
		"\2FG\7\7\2\2GI\5\16\b\2HE\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KO\3\2"+
		"\2\2LJ\3\2\2\2MN\7\b\2\2NP\5\20\t\2OM\3\2\2\2OP\3\2\2\2P\r\3\2\2\2QR\7"+
		"$\2\2RS\5\"\22\2ST\7%\2\2TU\5\20\t\2U\17\3\2\2\2VW\5\4\3\2W\21\3\2\2\2"+
		"XY\7\21\2\2YZ\5\"\22\2Z[\7\n\2\2[\\\7&\2\2\\\23\3\2\2\2]^\7\5\2\2^_\7"+
		"\21\2\2_`\7\33\2\2`a\5\"\22\2ab\7&\2\2b\25\3\2\2\2cd\7\5\2\2de\7\21\2"+
		"\2ef\7&\2\2f\27\3\2\2\2gh\7\21\2\2hi\7\33\2\2ij\5\"\22\2jk\7&\2\2k\31"+
		"\3\2\2\2lm\7\t\2\2mn\7$\2\2no\5\"\22\2op\7%\2\2pq\5\20\t\2q\33\3\2\2\2"+
		"ru\7\6\2\2sv\5 \21\2tv\5\36\20\2us\3\2\2\2ut\3\2\2\2vw\3\2\2\2wx\7&\2"+
		"\2x\35\3\2\2\2yz\7$\2\2z{\7\22\2\2{|\7%\2\2|\37\3\2\2\2}~\5\"\22\2~!\3"+
		"\2\2\2\177\u0080\b\22\1\2\u0080\u0081\7\37\2\2\u0081\u008e\5\"\22\20\u0082"+
		"\u0083\7\16\2\2\u0083\u008e\5\"\22\17\u0084\u008e\7!\2\2\u0085\u008e\7"+
		" \2\2\u0086\u008e\7\17\2\2\u0087\u008e\7\20\2\2\u0088\u008e\7\21\2\2\u0089"+
		"\u008a\7$\2\2\u008a\u008b\5\"\22\2\u008b\u008c\7%\2\2\u008c\u008e\3\2"+
		"\2\2\u008d\177\3\2\2\2\u008d\u0082\3\2\2\2\u008d\u0084\3\2\2\2\u008d\u0085"+
		"\3\2\2\2\u008d\u0086\3\2\2\2\u008d\u0087\3\2\2\2\u008d\u0088\3\2\2\2\u008d"+
		"\u0089\3\2\2\2\u008e\u00a3\3\2\2\2\u008f\u0090\f\16\2\2\u0090\u0091\t"+
		"\2\2\2\u0091\u00a2\5\"\22\17\u0092\u0093\f\r\2\2\u0093\u0094\t\3\2\2\u0094"+
		"\u00a2\5\"\22\16\u0095\u0096\f\f\2\2\u0096\u0097\t\4\2\2\u0097\u00a2\5"+
		"\"\22\r\u0098\u0099\f\13\2\2\u0099\u009a\t\5\2\2\u009a\u00a2\5\"\22\f"+
		"\u009b\u009c\f\n\2\2\u009c\u009d\7\f\2\2\u009d\u00a2\5\"\22\13\u009e\u009f"+
		"\f\t\2\2\u009f\u00a0\7\r\2\2\u00a0\u00a2\5\"\22\n\u00a1\u008f\3\2\2\2"+
		"\u00a1\u0092\3\2\2\2\u00a1\u0095\3\2\2\2\u00a1\u0098\3\2\2\2\u00a1\u009b"+
		"\3\2\2\2\u00a1\u009e\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4#\3\2\2\2\u00a5\u00a3\3\2\2\2\13%\61AJOu\u008d\u00a1"+
		"\u00a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}