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
		WAITING=13, DO=14, STOP=15, ENDWAIT=16, SI=17, MEDICION=18, CONDIMENTO_TYPE=19, 
		DECLARACION=20, CARNE_TYPE=21, VEGETAL_TYPE=22, LEGUMBRE_TYPE=23, PESCADO_TYPE=24, 
		LIQUID_TYPE=25, LACTEO_TYPE=26, RECIPIENTE_TYPE=27, CORTE_TYPE=28, MEDIDAS_TIEMPO=29, 
		APARATO_TYPE=30, PORCION_TYPE=31, UTENCILIO_TYPE=32, CUCHILLO=33, ESCRIBIR=34, 
		LEER=35, PAR_DE=36, PAR_IZ=37, COMA=38, PTOCOMA=39, CORDER=40, CORIZQ=41, 
		LLAVEIZQ=42, LLAVEDER=43, AND=44, OR=45, MAS=46, MENOS=47, PARTIR=48, 
		PELAR=49, ENCEDER=50, PREHOT=51, HERVIR=52, MACERAR=53, AMASAR=54, GIRO=55, 
		MOLER=56, SERVIR=57, UNTAR=58, EMPANIZAR=59, DUELO_A_MUERTE_CON_CUCHILLOS=60, 
		IGUALAR=61, DISTINGUIR=62, MAYOR=63, MENOR=64, MAYEQ=65, MENEQ=66, NOMBREVAR=67, 
		PUNTO=68;
	public static final String[] tokenNames = {
		"<INVALID>", "FLOAT", "NUMERO", "ESTADO", "STRING", "PALABRA", "CONSEJOS", 
		"'\n'", "ESPACIO", "TABULACION", "'COMMENCER_LA_RECETTE'", "'ACHEVEMENT_RECETTE'", 
		"'AUTRE'", "'ATTENDRE'", "'FAIRE'", "'ARRETEZ'", "'RETOUR'", "'SI'", "MEDICION", 
		"'CONDIMENTOS'", "'INGREDIENT'", "'CARNE'", "'VEGETAL'", "'LEGUMBRE'", 
		"'PESCADO'", "'LIQUIDO'", "'LACTEO'", "'RECIPIENTE'", "'CORTE'", "MEDIDAS_TIEMPO", 
		"'APARATO'", "PORCION_TYPE", "'UTENCILIO'", "CUCHILLO", "'ANOTAR'", "'INGRESE'", 
		"')'", "'('", "','", "';'", "']'", "'['", "'{'", "'}'", "'Y'", "'O'", 
		"'AGREGAR'", "'QUITAR'", "'PARTIR'", "'PELAR'", "'ENCENDER'", "'PRECALENTAR'", 
		"'HERVIR'", "'MACERAR'", "'AMASAR'", "'MEZCLAR'", "'MOLER'", "'SERVIR'", 
		"UNTAR", "'EMPANIZAR'", "'�DUELO-A-MUERTE-CON-CUCHILLOS?'", "'='", "'!='", 
		"'>'", "'<'", "'>='", "'<='", "'$'", "PUNTO"
	};
	public static final int
		RULE_receta = 0, RULE_tiempo = 1, RULE_porciones = 2, RULE_ingrediente = 3, 
		RULE_tipo_ingrediente = 4, RULE_aparato = 5, RULE_recipiente = 6, RULE_utencilio = 7, 
		RULE_accion = 8, RULE_iniciar_cocina = 9, RULE_finalizar_cocina = 10, 
		RULE_operaciones = 11, RULE_mezclar = 12, RULE_moler = 13, RULE_pelar = 14, 
		RULE_servir = 15, RULE_hervir = 16, RULE_yo_creo_que_van_a_pelear_con_cuchillos = 17, 
		RULE_condicion = 18, RULE_quehacersi = 19, RULE_ciclosinfin = 20;
	public static final String[] ruleNames = {
		"receta", "tiempo", "porciones", "ingrediente", "tipo_ingrediente", "aparato", 
		"recipiente", "utencilio", "accion", "iniciar_cocina", "finalizar_cocina", 
		"operaciones", "mezclar", "moler", "pelar", "servir", "hervir", "yo_creo_que_van_a_pelear_con_cuchillos", 
		"condicion", "quehacersi", "ciclosinfin"
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
		public List<AparatoContext> aparato() {
			return getRuleContexts(AparatoContext.class);
		}
		public List<RecipienteContext> recipiente() {
			return getRuleContexts(RecipienteContext.class);
		}
		public RecipienteContext recipiente(int i) {
			return getRuleContext(RecipienteContext.class,i);
		}
		public List<IngredienteContext> ingrediente() {
			return getRuleContexts(IngredienteContext.class);
		}
		public IngredienteContext ingrediente(int i) {
			return getRuleContext(IngredienteContext.class,i);
		}
		public List<AccionContext> accion() {
			return getRuleContexts(AccionContext.class);
		}
		public List<UtencilioContext> utencilio() {
			return getRuleContexts(UtencilioContext.class);
		}
		public Iniciar_cocinaContext iniciar_cocina() {
			return getRuleContext(Iniciar_cocinaContext.class,0);
		}
		public TiempoContext tiempo() {
			return getRuleContext(TiempoContext.class,0);
		}
		public UtencilioContext utencilio(int i) {
			return getRuleContext(UtencilioContext.class,i);
		}
		public PorcionesContext porciones() {
			return getRuleContext(PorcionesContext.class,0);
		}
		public AparatoContext aparato(int i) {
			return getRuleContext(AparatoContext.class,i);
		}
		public AccionContext accion(int i) {
			return getRuleContext(AccionContext.class,i);
		}
		public Finalizar_cocinaContext finalizar_cocina() {
			return getRuleContext(Finalizar_cocinaContext.class,0);
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
			setState(42); iniciar_cocina();
			setState(43); tiempo();
			setState(44); porciones();
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(45); ingrediente();
				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DECLARACION );
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50); utencilio();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==UTENCILIO_TYPE );
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55); aparato();
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==APARATO_TYPE );
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60); recipiente();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RECIPIENTE_TYPE );
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65); accion();
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WAITING) | (1L << SI) | (1L << PELAR) | (1L << HERVIR) | (1L << GIRO) | (1L << MOLER) | (1L << SERVIR) | (1L << DUELO_A_MUERTE_CON_CUCHILLOS))) != 0) );
			setState(70); finalizar_cocina();
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
			setState(72); match(NUMERO);
			setState(73); match(MEDIDAS_TIEMPO);
			setState(74); match(PUNTO);
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
			setState(76); match(NUMERO);
			setState(77); match(PORCION_TYPE);
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

	public static class IngredienteContext extends ParserRuleContext {
		public TerminalNode DECLARACION() { return getToken(CookParserParser.DECLARACION, 0); }
		public TerminalNode SALTOLINEA() { return getToken(CookParserParser.SALTOLINEA, 0); }
		public TerminalNode NUMERO() { return getToken(CookParserParser.NUMERO, 0); }
		public TerminalNode PALABRA() { return getToken(CookParserParser.PALABRA, 0); }
		public TerminalNode MEDICION() { return getToken(CookParserParser.MEDICION, 0); }
		public Tipo_ingredienteContext tipo_ingrediente() {
			return getRuleContext(Tipo_ingredienteContext.class,0);
		}
		public IngredienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ingrediente; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitIngrediente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IngredienteContext ingrediente() throws RecognitionException {
		IngredienteContext _localctx = new IngredienteContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ingrediente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); match(DECLARACION);
			setState(80); tipo_ingrediente();
			setState(81); match(NUMERO);
			setState(82); match(MEDICION);
			setState(83); match(PALABRA);
			setState(84); match(SALTOLINEA);
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
			setState(86);
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

	public static class AparatoContext extends ParserRuleContext {
		public TerminalNode APARATO_TYPE() { return getToken(CookParserParser.APARATO_TYPE, 0); }
		public TerminalNode PALABRA() { return getToken(CookParserParser.PALABRA, 0); }
		public AparatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aparato; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitAparato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AparatoContext aparato() throws RecognitionException {
		AparatoContext _localctx = new AparatoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_aparato);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); match(APARATO_TYPE);
			setState(89); match(PALABRA);
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

	public static class RecipienteContext extends ParserRuleContext {
		public TerminalNode PALABRA() { return getToken(CookParserParser.PALABRA, 0); }
		public TerminalNode RECIPIENTE_TYPE() { return getToken(CookParserParser.RECIPIENTE_TYPE, 0); }
		public RecipienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recipiente; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitRecipiente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecipienteContext recipiente() throws RecognitionException {
		RecipienteContext _localctx = new RecipienteContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_recipiente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); match(RECIPIENTE_TYPE);
			setState(92); match(PALABRA);
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

	public static class UtencilioContext extends ParserRuleContext {
		public TerminalNode UTENCILIO_TYPE() { return getToken(CookParserParser.UTENCILIO_TYPE, 0); }
		public TerminalNode PALABRA() { return getToken(CookParserParser.PALABRA, 0); }
		public UtencilioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_utencilio; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitUtencilio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UtencilioContext utencilio() throws RecognitionException {
		UtencilioContext _localctx = new UtencilioContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_utencilio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); match(UTENCILIO_TYPE);
			setState(95); match(PALABRA);
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
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public QuehacersiContext quehacersi() {
			return getRuleContext(QuehacersiContext.class,0);
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
		enterRule(_localctx, 16, RULE_accion);
		try {
			setState(100);
			switch (_input.LA(1)) {
			case PELAR:
			case HERVIR:
			case GIRO:
			case MOLER:
			case SERVIR:
			case DUELO_A_MUERTE_CON_CUCHILLOS:
				enterOuterAlt(_localctx, 1);
				{
				setState(97); operaciones();
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 2);
				{
				setState(98); quehacersi();
				}
				break;
			case WAITING:
				enterOuterAlt(_localctx, 3);
				{
				setState(99); ciclosinfin();
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
		enterRule(_localctx, 18, RULE_iniciar_cocina);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); match(PREPARARINGREDIENTES);
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
		enterRule(_localctx, 20, RULE_finalizar_cocina);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); match(FINCOCINA);
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
		public MezclarContext mezclar() {
			return getRuleContext(MezclarContext.class,0);
		}
		public Yo_creo_que_van_a_pelear_con_cuchillosContext yo_creo_que_van_a_pelear_con_cuchillos() {
			return getRuleContext(Yo_creo_que_van_a_pelear_con_cuchillosContext.class,0);
		}
		public HervirContext hervir() {
			return getRuleContext(HervirContext.class,0);
		}
		public PelarContext pelar() {
			return getRuleContext(PelarContext.class,0);
		}
		public MolerContext moler() {
			return getRuleContext(MolerContext.class,0);
		}
		public ServirContext servir() {
			return getRuleContext(ServirContext.class,0);
		}
		public OperacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operaciones; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitOperaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionesContext operaciones() throws RecognitionException {
		OperacionesContext _localctx = new OperacionesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operaciones);
		try {
			setState(112);
			switch (_input.LA(1)) {
			case HERVIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(106); hervir();
				}
				break;
			case GIRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(107); mezclar();
				}
				break;
			case DUELO_A_MUERTE_CON_CUCHILLOS:
				enterOuterAlt(_localctx, 3);
				{
				setState(108); yo_creo_que_van_a_pelear_con_cuchillos();
				}
				break;
			case MOLER:
				enterOuterAlt(_localctx, 4);
				{
				setState(109); moler();
				}
				break;
			case PELAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(110); pelar();
				}
				break;
			case SERVIR:
				enterOuterAlt(_localctx, 6);
				{
				setState(111); servir();
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

	public static class MezclarContext extends ParserRuleContext {
		public TerminalNode IGUALAR() { return getToken(CookParserParser.IGUALAR, 0); }
		public TerminalNode PAR_DE() { return getToken(CookParserParser.PAR_DE, 0); }
		public TerminalNode PAR_IZ() { return getToken(CookParserParser.PAR_IZ, 0); }
		public TerminalNode SALTOLINEA() { return getToken(CookParserParser.SALTOLINEA, 0); }
		public TerminalNode GIRO() { return getToken(CookParserParser.GIRO, 0); }
		public List<TerminalNode> PALABRA() { return getTokens(CookParserParser.PALABRA); }
		public TerminalNode PALABRA(int i) {
			return getToken(CookParserParser.PALABRA, i);
		}
		public TerminalNode COMA(int i) {
			return getToken(CookParserParser.COMA, i);
		}
		public List<TerminalNode> COMA() { return getTokens(CookParserParser.COMA); }
		public MezclarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mezclar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitMezclar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MezclarContext mezclar() throws RecognitionException {
		MezclarContext _localctx = new MezclarContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mezclar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(GIRO);
			setState(115); match(PAR_IZ);
			setState(116); match(PALABRA);
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(117); match(COMA);
				setState(118); match(PALABRA);
				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMA );
			setState(123); match(PAR_DE);
			setState(124); match(IGUALAR);
			setState(125); match(PALABRA);
			setState(126); match(SALTOLINEA);
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

	public static class MolerContext extends ParserRuleContext {
		public TerminalNode PAR_DE() { return getToken(CookParserParser.PAR_DE, 0); }
		public TerminalNode PAR_IZ() { return getToken(CookParserParser.PAR_IZ, 0); }
		public TerminalNode SALTOLINEA() { return getToken(CookParserParser.SALTOLINEA, 0); }
		public TerminalNode MOLER() { return getToken(CookParserParser.MOLER, 0); }
		public List<TerminalNode> PALABRA() { return getTokens(CookParserParser.PALABRA); }
		public TerminalNode PALABRA(int i) {
			return getToken(CookParserParser.PALABRA, i);
		}
		public TerminalNode COMA() { return getToken(CookParserParser.COMA, 0); }
		public MolerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moler; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitMoler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MolerContext moler() throws RecognitionException {
		MolerContext _localctx = new MolerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_moler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); match(MOLER);
			setState(129); match(PAR_IZ);
			setState(130); match(PALABRA);
			setState(131); match(COMA);
			setState(132); match(PALABRA);
			setState(133); match(PAR_DE);
			setState(134); match(SALTOLINEA);
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

	public static class PelarContext extends ParserRuleContext {
		public TerminalNode PAR_DE() { return getToken(CookParserParser.PAR_DE, 0); }
		public TerminalNode PAR_IZ() { return getToken(CookParserParser.PAR_IZ, 0); }
		public TerminalNode SALTOLINEA() { return getToken(CookParserParser.SALTOLINEA, 0); }
		public TerminalNode PALABRA() { return getToken(CookParserParser.PALABRA, 0); }
		public TerminalNode PELAR() { return getToken(CookParserParser.PELAR, 0); }
		public PelarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pelar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitPelar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PelarContext pelar() throws RecognitionException {
		PelarContext _localctx = new PelarContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pelar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); match(PELAR);
			setState(137); match(PAR_IZ);
			setState(138); match(PALABRA);
			setState(139); match(PAR_DE);
			setState(140); match(SALTOLINEA);
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

	public static class ServirContext extends ParserRuleContext {
		public TerminalNode PAR_DE() { return getToken(CookParserParser.PAR_DE, 0); }
		public TerminalNode SERVIR() { return getToken(CookParserParser.SERVIR, 0); }
		public TerminalNode PAR_IZ() { return getToken(CookParserParser.PAR_IZ, 0); }
		public TerminalNode SALTOLINEA() { return getToken(CookParserParser.SALTOLINEA, 0); }
		public TerminalNode PALABRA() { return getToken(CookParserParser.PALABRA, 0); }
		public ServirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_servir; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitServir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServirContext servir() throws RecognitionException {
		ServirContext _localctx = new ServirContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_servir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); match(SERVIR);
			setState(143); match(PAR_IZ);
			setState(144); match(PALABRA);
			setState(145); match(PAR_DE);
			setState(146); match(SALTOLINEA);
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

	public static class HervirContext extends ParserRuleContext {
		public TerminalNode PAR_DE() { return getToken(CookParserParser.PAR_DE, 0); }
		public TerminalNode PAR_IZ() { return getToken(CookParserParser.PAR_IZ, 0); }
		public List<TerminalNode> PALABRA() { return getTokens(CookParserParser.PALABRA); }
		public TerminalNode PALABRA(int i) {
			return getToken(CookParserParser.PALABRA, i);
		}
		public TerminalNode HERVIR() { return getToken(CookParserParser.HERVIR, 0); }
		public TerminalNode COMA() { return getToken(CookParserParser.COMA, 0); }
		public HervirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hervir; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitHervir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HervirContext hervir() throws RecognitionException {
		HervirContext _localctx = new HervirContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_hervir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(HERVIR);
			setState(149); match(PAR_IZ);
			setState(150); match(PALABRA);
			setState(151); match(COMA);
			setState(152); match(PALABRA);
			setState(153); match(PAR_DE);
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

	public static class Yo_creo_que_van_a_pelear_con_cuchillosContext extends ParserRuleContext {
		public TerminalNode SALTOLINEA() { return getToken(CookParserParser.SALTOLINEA, 0); }
		public TerminalNode DUELO_A_MUERTE_CON_CUCHILLOS() { return getToken(CookParserParser.DUELO_A_MUERTE_CON_CUCHILLOS, 0); }
		public List<TerminalNode> PALABRA() { return getTokens(CookParserParser.PALABRA); }
		public TerminalNode PALABRA(int i) {
			return getToken(CookParserParser.PALABRA, i);
		}
		public TerminalNode COMA(int i) {
			return getToken(CookParserParser.COMA, i);
		}
		public TerminalNode CUCHILLO() { return getToken(CookParserParser.CUCHILLO, 0); }
		public List<TerminalNode> COMA() { return getTokens(CookParserParser.COMA); }
		public Yo_creo_que_van_a_pelear_con_cuchillosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yo_creo_que_van_a_pelear_con_cuchillos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitYo_creo_que_van_a_pelear_con_cuchillos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Yo_creo_que_van_a_pelear_con_cuchillosContext yo_creo_que_van_a_pelear_con_cuchillos() throws RecognitionException {
		Yo_creo_que_van_a_pelear_con_cuchillosContext _localctx = new Yo_creo_que_van_a_pelear_con_cuchillosContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_yo_creo_que_van_a_pelear_con_cuchillos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155); match(DUELO_A_MUERTE_CON_CUCHILLOS);
			setState(156); match(CUCHILLO);
			setState(157); match(PALABRA);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(158); match(COMA);
				setState(159); match(PALABRA);
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165); match(SALTOLINEA);
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
		public TerminalNode IGUALAR() { return getToken(CookParserParser.IGUALAR, 0); }
		public TerminalNode DISTINGUIR() { return getToken(CookParserParser.DISTINGUIR, 0); }
		public TerminalNode ESTADO() { return getToken(CookParserParser.ESTADO, 0); }
		public TerminalNode PALABRA() { return getToken(CookParserParser.PALABRA, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); match(PALABRA);
			setState(168);
			_la = _input.LA(1);
			if ( !(_la==IGUALAR || _la==DISTINGUIR) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(169); match(ESTADO);
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
		public TerminalNode PAR_DE() { return getToken(CookParserParser.PAR_DE, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PAR_IZ() { return getToken(CookParserParser.PAR_IZ, 0); }
		public TerminalNode DO() { return getToken(CookParserParser.DO, 0); }
		public List<AccionContext> accion() {
			return getRuleContexts(AccionContext.class);
		}
		public TerminalNode STOP() { return getToken(CookParserParser.STOP, 0); }
		public AccionContext accion(int i) {
			return getRuleContext(AccionContext.class,i);
		}
		public TerminalNode SI() { return getToken(CookParserParser.SI, 0); }
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
		enterRule(_localctx, 38, RULE_quehacersi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); match(SI);
			setState(172); match(PAR_IZ);
			setState(173); condicion();
			setState(174); match(PAR_DE);
			setState(175); match(DO);
			setState(177); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(176); accion();
				}
				}
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WAITING) | (1L << SI) | (1L << PELAR) | (1L << HERVIR) | (1L << GIRO) | (1L << MOLER) | (1L << SERVIR) | (1L << DUELO_A_MUERTE_CON_CUCHILLOS))) != 0) );
			setState(181); match(STOP);
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
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PAR_IZ() { return getToken(CookParserParser.PAR_IZ, 0); }
		public List<AccionContext> accion() {
			return getRuleContexts(AccionContext.class);
		}
		public TerminalNode LLAVEDER() { return getToken(CookParserParser.LLAVEDER, 0); }
		public AccionContext accion(int i) {
			return getRuleContext(AccionContext.class,i);
		}
		public TerminalNode LLAVEIZQ() { return getToken(CookParserParser.LLAVEIZQ, 0); }
		public TerminalNode WAITING() { return getToken(CookParserParser.WAITING, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); match(WAITING);
			setState(184); match(PAR_IZ);
			setState(185); condicion();
			setState(186); match(PAR_DE);
			setState(187); match(LLAVEIZQ);
			setState(189); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(188); accion();
				}
				}
				setState(191); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WAITING) | (1L << SI) | (1L << PELAR) | (1L << HERVIR) | (1L << GIRO) | (1L << MOLER) | (1L << SERVIR) | (1L << DUELO_A_MUERTE_CON_CUCHILLOS))) != 0) );
			setState(193); match(LLAVEDER);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3F\u00c6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\6\2\61\n\2\r"+
		"\2\16\2\62\3\2\6\2\66\n\2\r\2\16\2\67\3\2\6\2;\n\2\r\2\16\2<\3\2\6\2@"+
		"\n\2\r\2\16\2A\3\2\6\2E\n\2\r\2\16\2F\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\5\ng\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\rs\n\r\3\16\3\16\3\16\3\16\3\16\6\16z\n\16\r\16\16\16{\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\7\23\u00a3\n\23\f\23\16\23\u00a6\13"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\6\25\u00b4"+
		"\n\25\r\25\16\25\u00b5\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\6\26\u00c0"+
		"\n\26\r\26\16\26\u00c1\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*\2\4\4\2\25\25\27\33\3\2?@\u00c0\2,\3\2\2\2\4J\3\2"+
		"\2\2\6N\3\2\2\2\bQ\3\2\2\2\nX\3\2\2\2\fZ\3\2\2\2\16]\3\2\2\2\20`\3\2\2"+
		"\2\22f\3\2\2\2\24h\3\2\2\2\26j\3\2\2\2\30r\3\2\2\2\32t\3\2\2\2\34\u0082"+
		"\3\2\2\2\36\u008a\3\2\2\2 \u0090\3\2\2\2\"\u0096\3\2\2\2$\u009d\3\2\2"+
		"\2&\u00a9\3\2\2\2(\u00ad\3\2\2\2*\u00b9\3\2\2\2,-\5\24\13\2-.\5\4\3\2"+
		".\60\5\6\4\2/\61\5\b\5\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63"+
		"\3\2\2\2\63\65\3\2\2\2\64\66\5\20\t\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65"+
		"\3\2\2\2\678\3\2\2\28:\3\2\2\29;\5\f\7\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2"+
		"<=\3\2\2\2=?\3\2\2\2>@\5\16\b\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2"+
		"\2BD\3\2\2\2CE\5\22\n\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2"+
		"\2\2HI\5\26\f\2I\3\3\2\2\2JK\7\4\2\2KL\7\37\2\2LM\7F\2\2M\5\3\2\2\2NO"+
		"\7\4\2\2OP\7!\2\2P\7\3\2\2\2QR\7\26\2\2RS\5\n\6\2ST\7\4\2\2TU\7\24\2\2"+
		"UV\7\7\2\2VW\7\t\2\2W\t\3\2\2\2XY\t\2\2\2Y\13\3\2\2\2Z[\7 \2\2[\\\7\7"+
		"\2\2\\\r\3\2\2\2]^\7\35\2\2^_\7\7\2\2_\17\3\2\2\2`a\7\"\2\2ab\7\7\2\2"+
		"b\21\3\2\2\2cg\5\30\r\2dg\5(\25\2eg\5*\26\2fc\3\2\2\2fd\3\2\2\2fe\3\2"+
		"\2\2g\23\3\2\2\2hi\7\f\2\2i\25\3\2\2\2jk\7\r\2\2k\27\3\2\2\2ls\5\"\22"+
		"\2ms\5\32\16\2ns\5$\23\2os\5\34\17\2ps\5\36\20\2qs\5 \21\2rl\3\2\2\2r"+
		"m\3\2\2\2rn\3\2\2\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2\2s\31\3\2\2\2tu\79\2\2"+
		"uv\7\'\2\2vy\7\7\2\2wx\7(\2\2xz\7\7\2\2yw\3\2\2\2z{\3\2\2\2{y\3\2\2\2"+
		"{|\3\2\2\2|}\3\2\2\2}~\7&\2\2~\177\7?\2\2\177\u0080\7\7\2\2\u0080\u0081"+
		"\7\t\2\2\u0081\33\3\2\2\2\u0082\u0083\7:\2\2\u0083\u0084\7\'\2\2\u0084"+
		"\u0085\7\7\2\2\u0085\u0086\7(\2\2\u0086\u0087\7\7\2\2\u0087\u0088\7&\2"+
		"\2\u0088\u0089\7\t\2\2\u0089\35\3\2\2\2\u008a\u008b\7\63\2\2\u008b\u008c"+
		"\7\'\2\2\u008c\u008d\7\7\2\2\u008d\u008e\7&\2\2\u008e\u008f\7\t\2\2\u008f"+
		"\37\3\2\2\2\u0090\u0091\7;\2\2\u0091\u0092\7\'\2\2\u0092\u0093\7\7\2\2"+
		"\u0093\u0094\7&\2\2\u0094\u0095\7\t\2\2\u0095!\3\2\2\2\u0096\u0097\7\66"+
		"\2\2\u0097\u0098\7\'\2\2\u0098\u0099\7\7\2\2\u0099\u009a\7(\2\2\u009a"+
		"\u009b\7\7\2\2\u009b\u009c\7&\2\2\u009c#\3\2\2\2\u009d\u009e\7>\2\2\u009e"+
		"\u009f\7#\2\2\u009f\u00a4\7\7\2\2\u00a0\u00a1\7(\2\2\u00a1\u00a3\7\7\2"+
		"\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7\t\2\2\u00a8"+
		"%\3\2\2\2\u00a9\u00aa\7\7\2\2\u00aa\u00ab\t\3\2\2\u00ab\u00ac\7\5\2\2"+
		"\u00ac\'\3\2\2\2\u00ad\u00ae\7\23\2\2\u00ae\u00af\7\'\2\2\u00af\u00b0"+
		"\5&\24\2\u00b0\u00b1\7&\2\2\u00b1\u00b3\7\20\2\2\u00b2\u00b4\5\22\n\2"+
		"\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6"+
		"\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7\21\2\2\u00b8)\3\2\2\2\u00b9"+
		"\u00ba\7\17\2\2\u00ba\u00bb\7\'\2\2\u00bb\u00bc\5&\24\2\u00bc\u00bd\7"+
		"&\2\2\u00bd\u00bf\7,\2\2\u00be\u00c0\5\22\n\2\u00bf\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c4\7-\2\2\u00c4+\3\2\2\2\r\62\67<AFfr{\u00a4\u00b5\u00c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}