// Generated from CookParser.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CookParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FLOAT=1, NUMERO=2, ESTADO=3, STRING=4, PALABRA=5, CONSEJOS=6, SALTOLINEA=7, 
		ESPACIO=8, TABULACION=9, PREPARARINGREDIENTES=10, FINCOCINA=11, SINO=12, 
		WAITING=13, ENDWAIT=14, SI=15, MEDICION=16, CONDIMENTO_TYPE=17, DECLARACION=18, 
		CARNE_TYPE=19, VEGETAL_TYPE=20, LEGUMBRE_TYPE=21, PESCADO_TYPE=22, LIQUID_TYPE=23, 
		RECIPIENTE_TYPE=24, CORTE_TYPE=25, MEDIDAS_TIEMPO=26, APARATO_TYPE=27, 
		PORCION_TYPE=28, ESCRIBIR=29, LEER=30, PAR_DE=31, PAR_IZ=32, COMA=33, 
		PTOCOMA=34, CORDER=35, CORIZQ=36, AND=37, OR=38, MAS=39, MENOS=40, PARTIR=41, 
		PELAR=42, ENCEDER=43, PREHOT=44, HERVIR=45, MACERAR=46, AMASAR=47, GIRO=48, 
		MOLER=49, SERVIR=50, UNTAR=51, EMPANIZAR=52, IGUALAR=53, DISTINGUIR=54, 
		MAYOR=55, MENOR=56, MAYEQ=57, MENEQ=58, ASIGNACION=59, PUNTO=60, RANDOM=61, 
		NUMBER=62, COMMA=63, ABS=64, CUADRADO=65, RAIZ=66, OPER=67, VAR=68, PTOCOMMA=69, 
		CONST=70, INT_TYPE=71, REAL_TYPE=72, STRING_TYPE=73, BOOL_TYPE=74, BOOLEAN=75, 
		READ_RW=76, WRITE_RW=77, IF=78, ELIF=79, ELSE=80, EQUAL=81, DIST=82, WHILE=83, 
		FOR=84, CASH=85;
	public static final String[] tokenNames = {
		"<INVALID>", "FLOAT", "NUMERO", "ESTADO", "STRING", "PALABRA", "CONSEJOS", 
		"'\n'", "ESPACIO", "TABULACION", "'COMMENCER_LA_RECETTE'", "'ACHEVEMENT_RECETTE'", 
		"'MAIS'", "'ATTENDRE'", "'RETOUR'", "'OUI'", "MEDICION", "'CONDIMENTOS'", 
		"'INGREDIENT'", "'CARNE'", "'VEGETAL'", "'LEGUMBRE'", "'PESCADO'", "'LIQUIDO'", 
		"'RECIPIENTE'", "'CORTE'", "MEDIDAS_TIEMPO", "'APARATO'", "PORCION_TYPE", 
		"'ANOTAR'", "'INGRESE'", "')'", "'('", "','", "';'", "']'", "'['", "'Y'", 
		"'O'", "'AGREGAR'", "'QUITAR'", "'PARTIR'", "'PELAR'", "'ENCENDER'", "'PRECALENTAR'", 
		"'HERVIR'", "'MACERAR'", "'AMASAR'", "'MEZCLAR'", "'MOLER'", "'SERVIR'", 
		"UNTAR", "'EMPANIZAR'", "'='", "'!='", "'>'", "'<'", "'>='", "'<='", "'$'", 
		"PUNTO", "RANDOM", "NUMBER", "COMMA", "ABS", "CUADRADO", "RAIZ", "OPER", 
		"VAR", "PTOCOMMA", "CONST", "INT_TYPE", "REAL_TYPE", "STRING_TYPE", "BOOL_TYPE", 
		"BOOLEAN", "READ_RW", "WRITE_RW", "IF", "ELIF", "ELSE", "EQUAL", "DIST", 
		"WHILE", "FOR", "CASH"
	};
	public static final int
		RULE_receta = 0, RULE_tiempo = 1, RULE_porciones = 2, RULE_ingredientes = 3, 
		RULE_tipo_ingrediente = 4, RULE_tipo_utencilio = 5, RULE_accion = 6, RULE_iniciar_cocina = 7, 
		RULE_finalizar_cocina = 8, RULE_operacion = 9, RULE_operacion_logica = 10, 
		RULE_declarar = 11, RULE_asignacion = 12, RULE_tipo_variable = 13, RULE_valores = 14, 
		RULE_lectura = 15, RULE_escribe = 16, RULE_quehacersi = 17, RULE_condicion = 18, 
		RULE_comparacion = 19, RULE_ciclosinfin = 20, RULE_cicloconfin = 21, RULE_condicionfor = 22, 
		RULE_mientras = 23;
	public static final String[] ruleNames = {
		"receta", "tiempo", "porciones", "ingredientes", "tipo_ingrediente", "tipo_utencilio", 
		"accion", "iniciar_cocina", "finalizar_cocina", "operacion", "operacion_logica", 
		"declarar", "asignacion", "tipo_variable", "valores", "lectura", "escribe", 
		"quehacersi", "condicion", "comparacion", "ciclosinfin", "cicloconfin", 
		"condicionfor", "mientras"
	};

	@Override
	public String getGrammarFileName() { return "CookParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CookParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RecetaContext extends ParserRuleContext {
		public List<AccionContext> accion() {
			return getRuleContexts(AccionContext.class);
		}
		public PorcionesContext porciones() {
			return getRuleContext(PorcionesContext.class,0);
		}
		public IngredientesContext ingredientes() {
			return getRuleContext(IngredientesContext.class,0);
		}
		public AccionContext accion(int i) {
			return getRuleContext(AccionContext.class,i);
		}
		public Iniciar_cocinaContext iniciar_cocina() {
			return getRuleContext(Iniciar_cocinaContext.class,0);
		}
		public Finalizar_cocinaContext finalizar_cocina() {
			return getRuleContext(Finalizar_cocinaContext.class,0);
		}
		public TiempoContext tiempo() {
			return getRuleContext(TiempoContext.class,0);
		}
		public RecetaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receta; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitReceta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecetaContext receta() throws RecognitionException {
		RecetaContext _localctx = new RecetaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_receta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); iniciar_cocina();
			setState(49); tiempo();
			setState(50); porciones();
			setState(51); ingredientes();
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52); accion();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PALABRA || _la==RANDOM || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ABS - 64)) | (1L << (CUADRADO - 64)) | (1L << (RAIZ - 64)) | (1L << (VAR - 64)) | (1L << (CONST - 64)) | (1L << (READ_RW - 64)) | (1L << (WRITE_RW - 64)) | (1L << (IF - 64)) | (1L << (WHILE - 64)) | (1L << (FOR - 64)))) != 0) );
			setState(57); finalizar_cocina();
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

	public static class TiempoContext extends ParserRuleContext {
		public TerminalNode MEDIDAS_TIEMPO() { return getToken(CookParserParser.MEDIDAS_TIEMPO, 0); }
		public TerminalNode NUMERO() { return getToken(CookParserParser.NUMERO, 0); }
		public TerminalNode PUNTO() { return getToken(CookParserParser.PUNTO, 0); }
		public TiempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tiempo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitTiempo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TiempoContext tiempo() throws RecognitionException {
		TiempoContext _localctx = new TiempoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tiempo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); match(NUMERO);
			setState(60); match(MEDIDAS_TIEMPO);
			setState(61); match(PUNTO);
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

	public static class PorcionesContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(CookParserParser.NUMERO, 0); }
		public TerminalNode PORCION_TYPE() { return getToken(CookParserParser.PORCION_TYPE, 0); }
		public PorcionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_porciones; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitPorciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PorcionesContext porciones() throws RecognitionException {
		PorcionesContext _localctx = new PorcionesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_porciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); match(NUMERO);
			setState(64); match(PORCION_TYPE);
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

	public static class IngredientesContext extends ParserRuleContext {
		public TerminalNode DECLARACION() { return getToken(CookParserParser.DECLARACION, 0); }
		public TerminalNode NUMERO() { return getToken(CookParserParser.NUMERO, 0); }
		public TerminalNode MEDICION() { return getToken(CookParserParser.MEDICION, 0); }
		public Tipo_ingredienteContext tipo_ingrediente() {
			return getRuleContext(Tipo_ingredienteContext.class,0);
		}
		public IngredientesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ingredientes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitIngredientes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IngredientesContext ingredientes() throws RecognitionException {
		IngredientesContext _localctx = new IngredientesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ingredientes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); match(DECLARACION);
			setState(67); tipo_ingrediente();
			setState(68); match(NUMERO);
			setState(69); match(MEDICION);
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

	public static class Tipo_ingredienteContext extends ParserRuleContext {
		public TerminalNode LEGUMBRE_TYPE() { return getToken(CookParserParser.LEGUMBRE_TYPE, 0); }
		public TerminalNode LIQUID_TYPE() { return getToken(CookParserParser.LIQUID_TYPE, 0); }
		public TerminalNode CONDIMENTO_TYPE() { return getToken(CookParserParser.CONDIMENTO_TYPE, 0); }
		public TerminalNode PESCADO_TYPE() { return getToken(CookParserParser.PESCADO_TYPE, 0); }
		public TerminalNode VEGETAL_TYPE() { return getToken(CookParserParser.VEGETAL_TYPE, 0); }
		public TerminalNode CARNE_TYPE() { return getToken(CookParserParser.CARNE_TYPE, 0); }
		public Tipo_ingredienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_ingrediente; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitTipo_ingrediente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_ingredienteContext tipo_ingrediente() throws RecognitionException {
		Tipo_ingredienteContext _localctx = new Tipo_ingredienteContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo_ingrediente);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONDIMENTO_TYPE) | (1L << CARNE_TYPE) | (1L << VEGETAL_TYPE) | (1L << LEGUMBRE_TYPE) | (1L << PESCADO_TYPE) | (1L << LIQUID_TYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Tipo_utencilioContext extends ParserRuleContext {
		public TerminalNode APARATO_TYPE() { return getToken(CookParserParser.APARATO_TYPE, 0); }
		public TerminalNode RECIPIENTE_TYPE() { return getToken(CookParserParser.RECIPIENTE_TYPE, 0); }
		public Tipo_utencilioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_utencilio; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitTipo_utencilio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_utencilioContext tipo_utencilio() throws RecognitionException {
		Tipo_utencilioContext _localctx = new Tipo_utencilioContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo_utencilio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_la = _input.LA(1);
			if ( !(_la==RECIPIENTE_TYPE || _la==APARATO_TYPE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class AccionContext extends ParserRuleContext {
		public EscribeContext escribe() {
			return getRuleContext(EscribeContext.class,0);
		}
		public CicloconfinContext cicloconfin() {
			return getRuleContext(CicloconfinContext.class,0);
		}
		public QuehacersiContext quehacersi() {
			return getRuleContext(QuehacersiContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public LecturaContext lectura() {
			return getRuleContext(LecturaContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public DeclararContext declarar() {
			return getRuleContext(DeclararContext.class,0);
		}
		public Operacion_logicaContext operacion_logica() {
			return getRuleContext(Operacion_logicaContext.class,0);
		}
		public CiclosinfinContext ciclosinfin() {
			return getRuleContext(CiclosinfinContext.class,0);
		}
		public AccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitAccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccionContext accion() throws RecognitionException {
		AccionContext _localctx = new AccionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_accion);
		try {
			setState(84);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75); declarar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76); operacion(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77); lectura();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(78); escribe();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(79); quehacersi();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(80); asignacion();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(81); operacion_logica();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(82); ciclosinfin();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(83); cicloconfin();
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

	public static class Iniciar_cocinaContext extends ParserRuleContext {
		public TerminalNode PREPARARINGREDIENTES() { return getToken(CookParserParser.PREPARARINGREDIENTES, 0); }
		public Iniciar_cocinaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iniciar_cocina; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitIniciar_cocina(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Iniciar_cocinaContext iniciar_cocina() throws RecognitionException {
		Iniciar_cocinaContext _localctx = new Iniciar_cocinaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_iniciar_cocina);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(PREPARARINGREDIENTES);
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

	public static class Finalizar_cocinaContext extends ParserRuleContext {
		public TerminalNode FINCOCINA() { return getToken(CookParserParser.FINCOCINA, 0); }
		public Finalizar_cocinaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalizar_cocina; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitFinalizar_cocina(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Finalizar_cocinaContext finalizar_cocina() throws RecognitionException {
		Finalizar_cocinaContext _localctx = new Finalizar_cocinaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_finalizar_cocina);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); match(FINCOCINA);
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

	public static class OperacionContext extends ParserRuleContext {
		public TerminalNode NUMBER(int i) {
			return getToken(CookParserParser.NUMBER, i);
		}
		public TerminalNode PAR_IZ() { return getToken(CookParserParser.PAR_IZ, 0); }
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public TerminalNode ABS() { return getToken(CookParserParser.ABS, 0); }
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public TerminalNode PALABRA() { return getToken(CookParserParser.PALABRA, 0); }
		public TerminalNode OPER() { return getToken(CookParserParser.OPER, 0); }
		public TerminalNode CUADRADO() { return getToken(CookParserParser.CUADRADO, 0); }
		public TerminalNode RAIZ() { return getToken(CookParserParser.RAIZ, 0); }
		public TerminalNode RANDOM() { return getToken(CookParserParser.RANDOM, 0); }
		public TerminalNode PAR_DE() { return getToken(CookParserParser.PAR_DE, 0); }
		public TerminalNode COMMA() { return getToken(CookParserParser.COMMA, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(CookParserParser.NUMBER); }
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		return operacion(0);
	}

	private OperacionContext operacion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperacionContext _localctx = new OperacionContext(_ctx, _parentState);
		OperacionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_operacion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			switch (_input.LA(1)) {
			case PALABRA:
				{
				setState(91); match(PALABRA);
				}
				break;
			case RANDOM:
				{
				setState(92); match(RANDOM);
				setState(93); match(PAR_IZ);
				setState(94); match(NUMBER);
				setState(95); match(COMMA);
				setState(96); match(NUMBER);
				setState(97); match(PAR_DE);
				}
				break;
			case ABS:
				{
				setState(98); match(ABS);
				setState(99); match(PAR_IZ);
				setState(100); operacion(0);
				setState(101); match(PAR_DE);
				}
				break;
			case CUADRADO:
				{
				setState(103); match(CUADRADO);
				setState(104); match(PAR_IZ);
				setState(105); operacion(0);
				setState(106); match(PAR_DE);
				}
				break;
			case RAIZ:
				{
				setState(108); match(RAIZ);
				setState(109); match(PAR_IZ);
				setState(110); operacion(0);
				setState(111); match(PAR_DE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OperacionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_operacion);
					setState(115);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(116); match(OPER);
					setState(117); operacion(6);
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class Operacion_logicaContext extends ParserRuleContext {
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public TerminalNode AND() { return getToken(CookParserParser.AND, 0); }
		public TerminalNode OR() { return getToken(CookParserParser.OR, 0); }
		public Operacion_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion_logica; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitOperacion_logica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operacion_logicaContext operacion_logica() throws RecognitionException {
		Operacion_logicaContext _localctx = new Operacion_logicaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operacion_logica);
		try {
			setState(131);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123); operacion(0);
				setState(124); match(AND);
				setState(125); operacion(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127); operacion(0);
				setState(128); match(OR);
				setState(129); operacion(0);
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

	public static class DeclararContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(CookParserParser.CONST, 0); }
		public TerminalNode VAR() { return getToken(CookParserParser.VAR, 0); }
		public Tipo_variableContext tipo_variable() {
			return getRuleContext(Tipo_variableContext.class,0);
		}
		public TerminalNode PTOCOMMA() { return getToken(CookParserParser.PTOCOMMA, 0); }
		public TerminalNode PALABRA() { return getToken(CookParserParser.PALABRA, 0); }
		public DeclararContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitDeclarar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararContext declarar() throws RecognitionException {
		DeclararContext _localctx = new DeclararContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declarar);
		try {
			setState(143);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(133); match(VAR);
				setState(134); tipo_variable();
				setState(135); match(PALABRA);
				setState(136); match(PTOCOMMA);
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(138); match(CONST);
				setState(139); tipo_variable();
				setState(140); match(PALABRA);
				setState(141); match(PTOCOMMA);
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

	public static class AsignacionContext extends ParserRuleContext {
		public ValoresContext valores() {
			return getRuleContext(ValoresContext.class,0);
		}
		public TerminalNode ASIGNACION() { return getToken(CookParserParser.ASIGNACION, 0); }
		public TerminalNode PALABRA() { return getToken(CookParserParser.PALABRA, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); match(PALABRA);
			setState(146); match(ASIGNACION);
			setState(147); valores();
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

	public static class Tipo_variableContext extends ParserRuleContext {
		public TerminalNode REAL_TYPE() { return getToken(CookParserParser.REAL_TYPE, 0); }
		public TerminalNode INT_TYPE() { return getToken(CookParserParser.INT_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(CookParserParser.STRING_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(CookParserParser.BOOL_TYPE, 0); }
		public Tipo_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitTipo_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_variableContext tipo_variable() throws RecognitionException {
		Tipo_variableContext _localctx = new Tipo_variableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipo_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_la = _input.LA(1);
			if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (INT_TYPE - 71)) | (1L << (REAL_TYPE - 71)) | (1L << (STRING_TYPE - 71)) | (1L << (BOOL_TYPE - 71)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ValoresContext extends ParserRuleContext {
		public TerminalNode PALABRA() { return getToken(CookParserParser.PALABRA, 0); }
		public TerminalNode STRING() { return getToken(CookParserParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(CookParserParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(CookParserParser.BOOLEAN, 0); }
		public TerminalNode FLOAT() { return getToken(CookParserParser.FLOAT, 0); }
		public ValoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valores; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitValores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValoresContext valores() throws RecognitionException {
		ValoresContext _localctx = new ValoresContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_valores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOAT) | (1L << STRING) | (1L << PALABRA) | (1L << NUMBER))) != 0) || _la==BOOLEAN) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class LecturaContext extends ParserRuleContext {
		public TerminalNode PAR_DE() { return getToken(CookParserParser.PAR_DE, 0); }
		public TerminalNode PAR_IZ() { return getToken(CookParserParser.PAR_IZ, 0); }
		public TerminalNode PTOCOMMA() { return getToken(CookParserParser.PTOCOMMA, 0); }
		public TerminalNode PALABRA() { return getToken(CookParserParser.PALABRA, 0); }
		public TerminalNode READ_RW() { return getToken(CookParserParser.READ_RW, 0); }
		public LecturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lectura; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitLectura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LecturaContext lectura() throws RecognitionException {
		LecturaContext _localctx = new LecturaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lectura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); match(READ_RW);
			setState(154); match(PAR_IZ);
			setState(155); match(PALABRA);
			setState(156); match(PAR_DE);
			setState(157); match(PTOCOMMA);
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

	public static class EscribeContext extends ParserRuleContext {
		public TerminalNode WRITE_RW() { return getToken(CookParserParser.WRITE_RW, 0); }
		public TerminalNode PAR_DE() { return getToken(CookParserParser.PAR_DE, 0); }
		public TerminalNode PAR_IZ() { return getToken(CookParserParser.PAR_IZ, 0); }
		public TerminalNode PTOCOMMA() { return getToken(CookParserParser.PTOCOMMA, 0); }
		public TerminalNode PALABRA() { return getToken(CookParserParser.PALABRA, 0); }
		public EscribeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escribe; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitEscribe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscribeContext escribe() throws RecognitionException {
		EscribeContext _localctx = new EscribeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_escribe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); match(WRITE_RW);
			setState(160); match(PAR_IZ);
			setState(161); match(PALABRA);
			setState(162); match(PAR_DE);
			setState(163); match(PTOCOMMA);
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

	public static class QuehacersiContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(CookParserParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(CookParserParser.IF, 0); }
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public TerminalNode CORDER(int i) {
			return getToken(CookParserParser.CORDER, i);
		}
		public List<TerminalNode> PAR_IZ() { return getTokens(CookParserParser.PAR_IZ); }
		public List<AccionContext> accion() {
			return getRuleContexts(AccionContext.class);
		}
		public TerminalNode PAR_DE(int i) {
			return getToken(CookParserParser.PAR_DE, i);
		}
		public TerminalNode PAR_IZ(int i) {
			return getToken(CookParserParser.PAR_IZ, i);
		}
		public List<TerminalNode> ELIF() { return getTokens(CookParserParser.ELIF); }
		public List<TerminalNode> PAR_DE() { return getTokens(CookParserParser.PAR_DE); }
		public List<TerminalNode> CORIZQ() { return getTokens(CookParserParser.CORIZQ); }
		public List<TerminalNode> CORDER() { return getTokens(CookParserParser.CORDER); }
		public TerminalNode CORIZQ(int i) {
			return getToken(CookParserParser.CORIZQ, i);
		}
		public TerminalNode ELIF(int i) {
			return getToken(CookParserParser.ELIF, i);
		}
		public AccionContext accion(int i) {
			return getRuleContext(AccionContext.class,i);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public QuehacersiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quehacersi; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitQuehacersi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuehacersiContext quehacersi() throws RecognitionException {
		QuehacersiContext _localctx = new QuehacersiContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_quehacersi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165); match(IF);
			setState(166); match(PAR_IZ);
			setState(167); condicion();
			setState(168); match(PAR_DE);
			setState(169); match(CORIZQ);
			setState(170); accion();
			setState(171); match(CORDER);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(172); match(ELIF);
				setState(173); match(PAR_IZ);
				setState(174); condicion();
				setState(175); match(PAR_DE);
				setState(176); match(CORIZQ);
				setState(177); accion();
				setState(178); match(CORDER);
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(185); match(ELSE);
				setState(186); match(CORIZQ);
				setState(187); accion();
				setState(188); match(CORDER);
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
		public TerminalNode NUMBER(int i) {
			return getToken(CookParserParser.NUMBER, i);
		}
		public TerminalNode STRING(int i) {
			return getToken(CookParserParser.STRING, i);
		}
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public List<TerminalNode> PALABRA() { return getTokens(CookParserParser.PALABRA); }
		public TerminalNode PALABRA(int i) {
			return getToken(CookParserParser.PALABRA, i);
		}
		public List<TerminalNode> STRING() { return getTokens(CookParserParser.STRING); }
		public List<TerminalNode> NUMBER() { return getTokens(CookParserParser.NUMBER); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_condicion);
		try {
			setState(213);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192); operacion(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193); match(STRING);
				setState(194); comparacion();
				setState(195); match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(197); match(NUMBER);
				setState(198); comparacion();
				setState(199); match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(201); match(PALABRA);
				setState(202); comparacion();
				setState(203); match(PALABRA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(205); match(PALABRA);
				setState(206); comparacion();
				setState(207); match(NUMBER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(209); match(NUMBER);
				setState(210); comparacion();
				setState(211); match(PALABRA);
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

	public static class ComparacionContext extends ParserRuleContext {
		public TerminalNode DIST() { return getToken(CookParserParser.DIST, 0); }
		public TerminalNode EQUAL() { return getToken(CookParserParser.EQUAL, 0); }
		public TerminalNode MAYOR() { return getToken(CookParserParser.MAYOR, 0); }
		public TerminalNode MAYEQ() { return getToken(CookParserParser.MAYEQ, 0); }
		public TerminalNode MENEQ() { return getToken(CookParserParser.MENEQ, 0); }
		public TerminalNode MENOR() { return getToken(CookParserParser.MENOR, 0); }
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitComparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comparacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !(((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & ((1L << (MAYOR - 55)) | (1L << (MENOR - 55)) | (1L << (MAYEQ - 55)) | (1L << (MENEQ - 55)) | (1L << (EQUAL - 55)) | (1L << (DIST - 55)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class CiclosinfinContext extends ParserRuleContext {
		public TerminalNode PAR_DE() { return getToken(CookParserParser.PAR_DE, 0); }
		public TerminalNode CORIZQ() { return getToken(CookParserParser.CORIZQ, 0); }
		public TerminalNode CORDER() { return getToken(CookParserParser.CORDER, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PAR_IZ() { return getToken(CookParserParser.PAR_IZ, 0); }
		public AccionContext accion() {
			return getRuleContext(AccionContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(CookParserParser.WHILE, 0); }
		public CiclosinfinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclosinfin; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitCiclosinfin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CiclosinfinContext ciclosinfin() throws RecognitionException {
		CiclosinfinContext _localctx = new CiclosinfinContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ciclosinfin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217); match(WHILE);
			setState(218); match(PAR_IZ);
			setState(219); condicion();
			setState(220); match(PAR_DE);
			setState(221); match(CORIZQ);
			setState(222); accion();
			setState(223); match(CORDER);
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

	public static class CicloconfinContext extends ParserRuleContext {
		public TerminalNode PAR_DE() { return getToken(CookParserParser.PAR_DE, 0); }
		public TerminalNode CORIZQ() { return getToken(CookParserParser.CORIZQ, 0); }
		public TerminalNode CORDER() { return getToken(CookParserParser.CORDER, 0); }
		public TerminalNode PAR_IZ() { return getToken(CookParserParser.PAR_IZ, 0); }
		public AccionContext accion() {
			return getRuleContext(AccionContext.class,0);
		}
		public CondicionforContext condicionfor() {
			return getRuleContext(CondicionforContext.class,0);
		}
		public TerminalNode FOR() { return getToken(CookParserParser.FOR, 0); }
		public CicloconfinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cicloconfin; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitCicloconfin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloconfinContext cicloconfin() throws RecognitionException {
		CicloconfinContext _localctx = new CicloconfinContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cicloconfin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225); match(FOR);
			setState(226); match(PAR_IZ);
			setState(227); condicionfor();
			setState(228); match(PAR_DE);
			setState(229); match(CORIZQ);
			setState(230); accion();
			setState(231); match(CORDER);
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

	public static class CondicionforContext extends ParserRuleContext {
		public List<TerminalNode> MENOS() { return getTokens(CookParserParser.MENOS); }
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public List<TerminalNode> MAS() { return getTokens(CookParserParser.MAS); }
		public TerminalNode MENOS(int i) {
			return getToken(CookParserParser.MENOS, i);
		}
		public TerminalNode CASH(int i) {
			return getToken(CookParserParser.CASH, i);
		}
		public TerminalNode PALABRA() { return getToken(CookParserParser.PALABRA, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode MAS(int i) {
			return getToken(CookParserParser.MAS, i);
		}
		public List<TerminalNode> CASH() { return getTokens(CookParserParser.CASH); }
		public CondicionforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionfor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitCondicionfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionforContext condicionfor() throws RecognitionException {
		CondicionforContext _localctx = new CondicionforContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_condicionfor);
		try {
			setState(249);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233); asignacion();
				setState(234); match(CASH);
				setState(235); mientras();
				setState(236); match(CASH);
				setState(237); match(PALABRA);
				setState(238); match(MAS);
				setState(239); match(MAS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241); asignacion();
				setState(242); match(CASH);
				setState(243); mientras();
				setState(244); match(CASH);
				setState(245); match(PALABRA);
				setState(246); match(MENOS);
				setState(247); match(MENOS);
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

	public static class MientrasContext extends ParserRuleContext {
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public List<TerminalNode> PALABRA() { return getTokens(CookParserParser.PALABRA); }
		public TerminalNode PALABRA(int i) {
			return getToken(CookParserParser.PALABRA, i);
		}
		public TerminalNode NUMBER() { return getToken(CookParserParser.NUMBER, 0); }
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251); match(PALABRA);
			setState(252); comparacion();
			setState(253);
			_la = _input.LA(1);
			if ( !(_la==PALABRA || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		case 9: return operacion_sempred((OperacionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operacion_sempred(OperacionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3W\u0102\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\2\6\28\n\2\r\2\16\29\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\bW\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13t\n\13\3\13\3\13\3\13\7\13y\n\13\f\13\16\13|\13\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0086\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u0092\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00b7"+
		"\n\23\f\23\16\23\u00ba\13\23\3\23\3\23\3\23\3\23\3\23\5\23\u00c1\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00d8\n\24\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u00fc\n\30\3\31\3\31\3\31\3\31\3\31\2\3\24\32\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\b\4\2\23\23\25\31\4\2\32"+
		"\32\35\35\3\2IL\6\2\3\3\6\7@@MM\4\29<ST\4\2\7\7@@\u0101\2\62\3\2\2\2\4"+
		"=\3\2\2\2\6A\3\2\2\2\bD\3\2\2\2\nI\3\2\2\2\fK\3\2\2\2\16V\3\2\2\2\20X"+
		"\3\2\2\2\22Z\3\2\2\2\24s\3\2\2\2\26\u0085\3\2\2\2\30\u0091\3\2\2\2\32"+
		"\u0093\3\2\2\2\34\u0097\3\2\2\2\36\u0099\3\2\2\2 \u009b\3\2\2\2\"\u00a1"+
		"\3\2\2\2$\u00a7\3\2\2\2&\u00d7\3\2\2\2(\u00d9\3\2\2\2*\u00db\3\2\2\2,"+
		"\u00e3\3\2\2\2.\u00fb\3\2\2\2\60\u00fd\3\2\2\2\62\63\5\20\t\2\63\64\5"+
		"\4\3\2\64\65\5\6\4\2\65\67\5\b\5\2\668\5\16\b\2\67\66\3\2\2\289\3\2\2"+
		"\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\5\22\n\2<\3\3\2\2\2=>\7\4\2\2>?\7"+
		"\34\2\2?@\7>\2\2@\5\3\2\2\2AB\7\4\2\2BC\7\36\2\2C\7\3\2\2\2DE\7\24\2\2"+
		"EF\5\n\6\2FG\7\4\2\2GH\7\22\2\2H\t\3\2\2\2IJ\t\2\2\2J\13\3\2\2\2KL\t\3"+
		"\2\2L\r\3\2\2\2MW\5\30\r\2NW\5\24\13\2OW\5 \21\2PW\5\"\22\2QW\5$\23\2"+
		"RW\5\32\16\2SW\5\26\f\2TW\5*\26\2UW\5,\27\2VM\3\2\2\2VN\3\2\2\2VO\3\2"+
		"\2\2VP\3\2\2\2VQ\3\2\2\2VR\3\2\2\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2W\17\3"+
		"\2\2\2XY\7\f\2\2Y\21\3\2\2\2Z[\7\r\2\2[\23\3\2\2\2\\]\b\13\1\2]t\7\7\2"+
		"\2^_\7?\2\2_`\7\"\2\2`a\7@\2\2ab\7A\2\2bc\7@\2\2ct\7!\2\2de\7B\2\2ef\7"+
		"\"\2\2fg\5\24\13\2gh\7!\2\2ht\3\2\2\2ij\7C\2\2jk\7\"\2\2kl\5\24\13\2l"+
		"m\7!\2\2mt\3\2\2\2no\7D\2\2op\7\"\2\2pq\5\24\13\2qr\7!\2\2rt\3\2\2\2s"+
		"\\\3\2\2\2s^\3\2\2\2sd\3\2\2\2si\3\2\2\2sn\3\2\2\2tz\3\2\2\2uv\f\7\2\2"+
		"vw\7E\2\2wy\5\24\13\bxu\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\25\3\2"+
		"\2\2|z\3\2\2\2}~\5\24\13\2~\177\7\'\2\2\177\u0080\5\24\13\2\u0080\u0086"+
		"\3\2\2\2\u0081\u0082\5\24\13\2\u0082\u0083\7(\2\2\u0083\u0084\5\24\13"+
		"\2\u0084\u0086\3\2\2\2\u0085}\3\2\2\2\u0085\u0081\3\2\2\2\u0086\27\3\2"+
		"\2\2\u0087\u0088\7F\2\2\u0088\u0089\5\34\17\2\u0089\u008a\7\7\2\2\u008a"+
		"\u008b\7G\2\2\u008b\u0092\3\2\2\2\u008c\u008d\7H\2\2\u008d\u008e\5\34"+
		"\17\2\u008e\u008f\7\7\2\2\u008f\u0090\7G\2\2\u0090\u0092\3\2\2\2\u0091"+
		"\u0087\3\2\2\2\u0091\u008c\3\2\2\2\u0092\31\3\2\2\2\u0093\u0094\7\7\2"+
		"\2\u0094\u0095\7=\2\2\u0095\u0096\5\36\20\2\u0096\33\3\2\2\2\u0097\u0098"+
		"\t\4\2\2\u0098\35\3\2\2\2\u0099\u009a\t\5\2\2\u009a\37\3\2\2\2\u009b\u009c"+
		"\7N\2\2\u009c\u009d\7\"\2\2\u009d\u009e\7\7\2\2\u009e\u009f\7!\2\2\u009f"+
		"\u00a0\7G\2\2\u00a0!\3\2\2\2\u00a1\u00a2\7O\2\2\u00a2\u00a3\7\"\2\2\u00a3"+
		"\u00a4\7\7\2\2\u00a4\u00a5\7!\2\2\u00a5\u00a6\7G\2\2\u00a6#\3\2\2\2\u00a7"+
		"\u00a8\7P\2\2\u00a8\u00a9\7\"\2\2\u00a9\u00aa\5&\24\2\u00aa\u00ab\7!\2"+
		"\2\u00ab\u00ac\7&\2\2\u00ac\u00ad\5\16\b\2\u00ad\u00b8\7%\2\2\u00ae\u00af"+
		"\7Q\2\2\u00af\u00b0\7\"\2\2\u00b0\u00b1\5&\24\2\u00b1\u00b2\7!\2\2\u00b2"+
		"\u00b3\7&\2\2\u00b3\u00b4\5\16\b\2\u00b4\u00b5\7%\2\2\u00b5\u00b7\3\2"+
		"\2\2\u00b6\u00ae\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00c0\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7R"+
		"\2\2\u00bc\u00bd\7&\2\2\u00bd\u00be\5\16\b\2\u00be\u00bf\7%\2\2\u00bf"+
		"\u00c1\3\2\2\2\u00c0\u00bb\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1%\3\2\2\2"+
		"\u00c2\u00d8\5\24\13\2\u00c3\u00c4\7\6\2\2\u00c4\u00c5\5(\25\2\u00c5\u00c6"+
		"\7\6\2\2\u00c6\u00d8\3\2\2\2\u00c7\u00c8\7@\2\2\u00c8\u00c9\5(\25\2\u00c9"+
		"\u00ca\7@\2\2\u00ca\u00d8\3\2\2\2\u00cb\u00cc\7\7\2\2\u00cc\u00cd\5(\25"+
		"\2\u00cd\u00ce\7\7\2\2\u00ce\u00d8\3\2\2\2\u00cf\u00d0\7\7\2\2\u00d0\u00d1"+
		"\5(\25\2\u00d1\u00d2\7@\2\2\u00d2\u00d8\3\2\2\2\u00d3\u00d4\7@\2\2\u00d4"+
		"\u00d5\5(\25\2\u00d5\u00d6\7\7\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00c2\3\2"+
		"\2\2\u00d7\u00c3\3\2\2\2\u00d7\u00c7\3\2\2\2\u00d7\u00cb\3\2\2\2\u00d7"+
		"\u00cf\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d8\'\3\2\2\2\u00d9\u00da\t\6\2\2"+
		"\u00da)\3\2\2\2\u00db\u00dc\7U\2\2\u00dc\u00dd\7\"\2\2\u00dd\u00de\5&"+
		"\24\2\u00de\u00df\7!\2\2\u00df\u00e0\7&\2\2\u00e0\u00e1\5\16\b\2\u00e1"+
		"\u00e2\7%\2\2\u00e2+\3\2\2\2\u00e3\u00e4\7V\2\2\u00e4\u00e5\7\"\2\2\u00e5"+
		"\u00e6\5.\30\2\u00e6\u00e7\7!\2\2\u00e7\u00e8\7&\2\2\u00e8\u00e9\5\16"+
		"\b\2\u00e9\u00ea\7%\2\2\u00ea-\3\2\2\2\u00eb\u00ec\5\32\16\2\u00ec\u00ed"+
		"\7W\2\2\u00ed\u00ee\5\60\31\2\u00ee\u00ef\7W\2\2\u00ef\u00f0\7\7\2\2\u00f0"+
		"\u00f1\7)\2\2\u00f1\u00f2\7)\2\2\u00f2\u00fc\3\2\2\2\u00f3\u00f4\5\32"+
		"\16\2\u00f4\u00f5\7W\2\2\u00f5\u00f6\5\60\31\2\u00f6\u00f7\7W\2\2\u00f7"+
		"\u00f8\7\7\2\2\u00f8\u00f9\7*\2\2\u00f9\u00fa\7*\2\2\u00fa\u00fc\3\2\2"+
		"\2\u00fb\u00eb\3\2\2\2\u00fb\u00f3\3\2\2\2\u00fc/\3\2\2\2\u00fd\u00fe"+
		"\7\7\2\2\u00fe\u00ff\5(\25\2\u00ff\u0100\t\7\2\2\u0100\61\3\2\2\2\f9V"+
		"sz\u0085\u0091\u00b8\u00c0\u00d7\u00fb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}