// Generated from CookParser.g4 by ANTLR 4.6
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
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FLOAT=1, NUMERO=2, ESTADO=3, STRING=4, COMMENT=5, WS=6, CONSEJOS=7, PREPARARINGREDIENTES=8, 
		FINCOCINA=9, SINO=10, WAITING=11, DO=12, STOP=13, ENDWAIT=14, SI=15, MEDICION=16, 
		CONDIMENTO_TYPE=17, DECLARACION=18, CARNE_TYPE=19, VEGETAL_TYPE=20, LEGUMBRE_TYPE=21, 
		PESCADO_TYPE=22, LIQUID_TYPE=23, LACTEO_TYPE=24, CEREAL_TYPE=25, RECIPIENTE_TYPE=26, 
		CORTE_TYPE=27, MEDIDAS_TIEMPO=28, APARATO_TYPE=29, PORCION_TYPE=30, UTENCILIO_TYPE=31, 
		TIEMPODECLARACION=32, CUCHILLO=33, ESCRIBIR=34, LEER=35, PAR_DE=36, PAR_IZ=37, 
		COMA=38, PTOCOMA=39, CORDER=40, CORIZQ=41, LLAVEIZQ=42, LLAVEDER=43, AND=44, 
		OR=45, MAS=46, MENOS=47, PARTIR=48, PELAR=49, ENCEDER=50, PREHOT=51, HERVIR=52, 
		MACERAR=53, AMASAR=54, GIRO=55, MOLER=56, SERVIR=57, UNTAR=58, EMPANIZAR=59, 
		RALLAR=60, CORTAR=61, DUELO_A_MUERTE_CON_CUCHILLOS=62, IGUALAR=63, DISTINGUIR=64, 
		MAYOR=65, MENOR=66, MAYEQ=67, MENEQ=68, NOMBREVAR=69, PALABRA=70;
	public static final int
		RULE_receta = 0, RULE_iniciar_cocina = 1, RULE_finalizar_cocina = 2, RULE_tiempo = 3, 
		RULE_porciones = 4, RULE_ingrediente = 5, RULE_tipo_ingrediente = 6, RULE_aparato = 7, 
		RULE_recipiente = 8, RULE_utencilio = 9, RULE_accion = 10, RULE_operaciones = 11, 
		RULE_mezclar = 12, RULE_moler = 13, RULE_pelar = 14, RULE_servir = 15, 
		RULE_hervir = 16, RULE_declararcorte = 17, RULE_cortar = 18, RULE_yo_creo_que_van_a_pelear_con_cuchillos = 19, 
		RULE_condicion = 20, RULE_quehacersi = 21, RULE_ciclosinfin = 22;
	public static final String[] ruleNames = {
		"receta", "iniciar_cocina", "finalizar_cocina", "tiempo", "porciones", 
		"ingrediente", "tipo_ingrediente", "aparato", "recipiente", "utencilio", 
		"accion", "operaciones", "mezclar", "moler", "pelar", "servir", "hervir", 
		"declararcorte", "cortar", "yo_creo_que_van_a_pelear_con_cuchillos", "condicion", 
		"quehacersi", "ciclosinfin"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, "'COMMENCER_LA_RECETTE'", 
		"'ACHEVEMENT_RECETTE'", "'AUTRE'", "'ATTENDRE'", "'FAIRE'", "'ARRETEZ'", 
		"'RETOUR'", "'SI'", null, "'CONDIMENTOS'", "'INGREDIENT'", "'CARNE'", 
		"'VEGETAL'", "'LEGUMBRE'", "'PESCADO'", "'LIQUIDO'", "'LACTEO'", "'CEREAL'", 
		"'RECIPIENTE'", "'CORTE'", null, "'APARATO'", null, "'UTENCILIO'", "'TEMPS'", 
		null, "'ANOTAR'", "'INGRESE'", "')'", "'('", "','", "';'", "']'", "'['", 
		"'{'", "'}'", "'Y'", "'O'", "'AGREGAR'", "'QUITAR'", "'PARTIR'", "'PELAR'", 
		"'ENCENDER'", "'PRECALENTAR'", "'HERVIR'", "'MACERAR'", "'AMASAR'", "'MEZCLAR'", 
		"'MOLER'", "'SERVIR'", null, "'EMPANIZAR'", "'RALLAR'", "'CORTAR'", "'�DUELO-A-MUERTE-CON-CUCHILLOS?'", 
		"'='", "'!='", "'>'", "'<'", "'>='", "'<='", "'$'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "FLOAT", "NUMERO", "ESTADO", "STRING", "COMMENT", "WS", "CONSEJOS", 
		"PREPARARINGREDIENTES", "FINCOCINA", "SINO", "WAITING", "DO", "STOP", 
		"ENDWAIT", "SI", "MEDICION", "CONDIMENTO_TYPE", "DECLARACION", "CARNE_TYPE", 
		"VEGETAL_TYPE", "LEGUMBRE_TYPE", "PESCADO_TYPE", "LIQUID_TYPE", "LACTEO_TYPE", 
		"CEREAL_TYPE", "RECIPIENTE_TYPE", "CORTE_TYPE", "MEDIDAS_TIEMPO", "APARATO_TYPE", 
		"PORCION_TYPE", "UTENCILIO_TYPE", "TIEMPODECLARACION", "CUCHILLO", "ESCRIBIR", 
		"LEER", "PAR_DE", "PAR_IZ", "COMA", "PTOCOMA", "CORDER", "CORIZQ", "LLAVEIZQ", 
		"LLAVEDER", "AND", "OR", "MAS", "MENOS", "PARTIR", "PELAR", "ENCEDER", 
		"PREHOT", "HERVIR", "MACERAR", "AMASAR", "GIRO", "MOLER", "SERVIR", "UNTAR", 
		"EMPANIZAR", "RALLAR", "CORTAR", "DUELO_A_MUERTE_CON_CUCHILLOS", "IGUALAR", 
		"DISTINGUIR", "MAYOR", "MENOR", "MAYEQ", "MENEQ", "NOMBREVAR", "PALABRA"
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
	public String getGrammarFileName() { return "CookParser.g4"; }

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
		public Iniciar_cocinaContext iniciar_cocina() {
			return getRuleContext(Iniciar_cocinaContext.class,0);
		}
		public TiempoContext tiempo() {
			return getRuleContext(TiempoContext.class,0);
		}
		public PorcionesContext porciones() {
			return getRuleContext(PorcionesContext.class,0);
		}
		public Finalizar_cocinaContext finalizar_cocina() {
			return getRuleContext(Finalizar_cocinaContext.class,0);
		}
		public List<IngredienteContext> ingrediente() {
			return getRuleContexts(IngredienteContext.class);
		}
		public IngredienteContext ingrediente(int i) {
			return getRuleContext(IngredienteContext.class,i);
		}
		public List<UtencilioContext> utencilio() {
			return getRuleContexts(UtencilioContext.class);
		}
		public UtencilioContext utencilio(int i) {
			return getRuleContext(UtencilioContext.class,i);
		}
		public List<AparatoContext> aparato() {
			return getRuleContexts(AparatoContext.class);
		}
		public AparatoContext aparato(int i) {
			return getRuleContext(AparatoContext.class,i);
		}
		public List<RecipienteContext> recipiente() {
			return getRuleContexts(RecipienteContext.class);
		}
		public RecipienteContext recipiente(int i) {
			return getRuleContext(RecipienteContext.class,i);
		}
		public List<AccionContext> accion() {
			return getRuleContexts(AccionContext.class);
		}
		public AccionContext accion(int i) {
			return getRuleContext(AccionContext.class,i);
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
			setState(46);
			iniciar_cocina();
			setState(47);
			tiempo();
			setState(48);
			porciones();
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				ingrediente();
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DECLARACION );
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				utencilio();
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==UTENCILIO_TYPE );
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59);
				aparato();
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==APARATO_TYPE );
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64);
				recipiente();
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RECIPIENTE_TYPE );
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WAITING) | (1L << SI) | (1L << CORTE_TYPE) | (1L << PELAR) | (1L << HERVIR) | (1L << GIRO) | (1L << MOLER) | (1L << SERVIR) | (1L << CORTAR) | (1L << DUELO_A_MUERTE_CON_CUCHILLOS))) != 0)) {
				{
				{
				setState(69);
				accion();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			finalizar_cocina();
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
		enterRule(_localctx, 2, RULE_iniciar_cocina);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(PREPARARINGREDIENTES);
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
		enterRule(_localctx, 4, RULE_finalizar_cocina);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(FINCOCINA);
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
		public TerminalNode TIEMPODECLARACION() { return getToken(CookParserParser.TIEMPODECLARACION, 0); }
		public TerminalNode NUMERO() { return getToken(CookParserParser.NUMERO, 0); }
		public TerminalNode MEDIDAS_TIEMPO() { return getToken(CookParserParser.MEDIDAS_TIEMPO, 0); }
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
		enterRule(_localctx, 6, RULE_tiempo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(TIEMPODECLARACION);
			setState(82);
			match(NUMERO);
			setState(83);
			match(MEDIDAS_TIEMPO);
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
		enterRule(_localctx, 8, RULE_porciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(NUMERO);
			setState(86);
			match(PORCION_TYPE);
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
		public Tipo_ingredienteContext tipo_ingrediente() {
			return getRuleContext(Tipo_ingredienteContext.class,0);
		}
		public TerminalNode PALABRA() { return getToken(CookParserParser.PALABRA, 0); }
		public TerminalNode MEDICION() { return getToken(CookParserParser.MEDICION, 0); }
		public TerminalNode NUMERO() { return getToken(CookParserParser.NUMERO, 0); }
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
		enterRule(_localctx, 10, RULE_ingrediente);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(DECLARACION);
			setState(89);
			tipo_ingrediente();
			setState(90);
			match(PALABRA);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMERO) {
				{
				setState(91);
				match(NUMERO);
				}
			}

			setState(94);
			match(MEDICION);
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
		public TerminalNode CARNE_TYPE() { return getToken(CookParserParser.CARNE_TYPE, 0); }
		public TerminalNode PESCADO_TYPE() { return getToken(CookParserParser.PESCADO_TYPE, 0); }
		public TerminalNode CONDIMENTO_TYPE() { return getToken(CookParserParser.CONDIMENTO_TYPE, 0); }
		public TerminalNode VEGETAL_TYPE() { return getToken(CookParserParser.VEGETAL_TYPE, 0); }
		public TerminalNode LEGUMBRE_TYPE() { return getToken(CookParserParser.LEGUMBRE_TYPE, 0); }
		public TerminalNode LIQUID_TYPE() { return getToken(CookParserParser.LIQUID_TYPE, 0); }
		public TerminalNode LACTEO_TYPE() { return getToken(CookParserParser.LACTEO_TYPE, 0); }
		public TerminalNode CEREAL_TYPE() { return getToken(CookParserParser.CEREAL_TYPE, 0); }
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
		enterRule(_localctx, 12, RULE_tipo_ingrediente);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONDIMENTO_TYPE) | (1L << CARNE_TYPE) | (1L << VEGETAL_TYPE) | (1L << LEGUMBRE_TYPE) | (1L << PESCADO_TYPE) | (1L << LIQUID_TYPE) | (1L << LACTEO_TYPE) | (1L << CEREAL_TYPE))) != 0)) ) {
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
		enterRule(_localctx, 14, RULE_aparato);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(APARATO_TYPE);
			setState(99);
			match(PALABRA);
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
		public TerminalNode RECIPIENTE_TYPE() { return getToken(CookParserParser.RECIPIENTE_TYPE, 0); }
		public TerminalNode PALABRA() { return getToken(CookParserParser.PALABRA, 0); }
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
		enterRule(_localctx, 16, RULE_recipiente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(RECIPIENTE_TYPE);
			setState(102);
			match(PALABRA);
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
		enterRule(_localctx, 18, RULE_utencilio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(UTENCILIO_TYPE);
			setState(105);
			match(PALABRA);
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
		enterRule(_localctx, 20, RULE_accion);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CORTE_TYPE:
			case PELAR:
			case HERVIR:
			case GIRO:
			case MOLER:
			case SERVIR:
			case CORTAR:
			case DUELO_A_MUERTE_CON_CUCHILLOS:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				operaciones();
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				quehacersi();
				}
				break;
			case WAITING:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				ciclosinfin();
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

	public static class OperacionesContext extends ParserRuleContext {
		public HervirContext hervir() {
			return getRuleContext(HervirContext.class,0);
		}
		public MezclarContext mezclar() {
			return getRuleContext(MezclarContext.class,0);
		}
		public Yo_creo_que_van_a_pelear_con_cuchillosContext yo_creo_que_van_a_pelear_con_cuchillos() {
			return getRuleContext(Yo_creo_que_van_a_pelear_con_cuchillosContext.class,0);
		}
		public MolerContext moler() {
			return getRuleContext(MolerContext.class,0);
		}
		public PelarContext pelar() {
			return getRuleContext(PelarContext.class,0);
		}
		public ServirContext servir() {
			return getRuleContext(ServirContext.class,0);
		}
		public CortarContext cortar() {
			return getRuleContext(CortarContext.class,0);
		}
		public DeclararcorteContext declararcorte() {
			return getRuleContext(DeclararcorteContext.class,0);
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
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HERVIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				hervir();
				}
				break;
			case GIRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				mezclar();
				}
				break;
			case DUELO_A_MUERTE_CON_CUCHILLOS:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				yo_creo_que_van_a_pelear_con_cuchillos();
				}
				break;
			case MOLER:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				moler();
				}
				break;
			case PELAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				pelar();
				}
				break;
			case SERVIR:
				enterOuterAlt(_localctx, 6);
				{
				setState(117);
				servir();
				}
				break;
			case CORTAR:
				enterOuterAlt(_localctx, 7);
				{
				setState(118);
				cortar();
				}
				break;
			case CORTE_TYPE:
				enterOuterAlt(_localctx, 8);
				{
				setState(119);
				declararcorte();
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
		public TerminalNode GIRO() { return getToken(CookParserParser.GIRO, 0); }
		public TerminalNode PAR_IZ() { return getToken(CookParserParser.PAR_IZ, 0); }
		public List<TerminalNode> PALABRA() { return getTokens(CookParserParser.PALABRA); }
		public TerminalNode PALABRA(int i) {
			return getToken(CookParserParser.PALABRA, i);
		}
		public TerminalNode PAR_DE() { return getToken(CookParserParser.PAR_DE, 0); }
		public TerminalNode IGUALAR() { return getToken(CookParserParser.IGUALAR, 0); }
		public List<TerminalNode> COMA() { return getTokens(CookParserParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(CookParserParser.COMA, i);
		}
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
			setState(122);
			match(GIRO);
			setState(123);
			match(PAR_IZ);
			setState(124);
			match(PALABRA);
			setState(127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(125);
				match(COMA);
				setState(126);
				match(PALABRA);
				}
				}
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMA );
			setState(131);
			match(PAR_DE);
			setState(132);
			match(IGUALAR);
			setState(133);
			match(PALABRA);
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
		public TerminalNode MOLER() { return getToken(CookParserParser.MOLER, 0); }
		public TerminalNode PAR_IZ() { return getToken(CookParserParser.PAR_IZ, 0); }
		public List<TerminalNode> PALABRA() { return getTokens(CookParserParser.PALABRA); }
		public TerminalNode PALABRA(int i) {
			return getToken(CookParserParser.PALABRA, i);
		}
		public TerminalNode COMA() { return getToken(CookParserParser.COMA, 0); }
		public TerminalNode PAR_DE() { return getToken(CookParserParser.PAR_DE, 0); }
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
			setState(135);
			match(MOLER);
			setState(136);
			match(PAR_IZ);
			setState(137);
			match(PALABRA);
			setState(138);
			match(COMA);
			setState(139);
			match(PALABRA);
			setState(140);
			match(PAR_DE);
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
		public TerminalNode PELAR() { return getToken(CookParserParser.PELAR, 0); }
		public TerminalNode PAR_IZ() { return getToken(CookParserParser.PAR_IZ, 0); }
		public TerminalNode PALABRA() { return getToken(CookParserParser.PALABRA, 0); }
		public TerminalNode PAR_DE() { return getToken(CookParserParser.PAR_DE, 0); }
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
			setState(142);
			match(PELAR);
			setState(143);
			match(PAR_IZ);
			setState(144);
			match(PALABRA);
			setState(145);
			match(PAR_DE);
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
		public TerminalNode SERVIR() { return getToken(CookParserParser.SERVIR, 0); }
		public TerminalNode PAR_IZ() { return getToken(CookParserParser.PAR_IZ, 0); }
		public TerminalNode PALABRA() { return getToken(CookParserParser.PALABRA, 0); }
		public TerminalNode PAR_DE() { return getToken(CookParserParser.PAR_DE, 0); }
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
			setState(147);
			match(SERVIR);
			setState(148);
			match(PAR_IZ);
			setState(149);
			match(PALABRA);
			setState(150);
			match(PAR_DE);
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
		public TerminalNode HERVIR() { return getToken(CookParserParser.HERVIR, 0); }
		public TerminalNode PAR_IZ() { return getToken(CookParserParser.PAR_IZ, 0); }
		public List<TerminalNode> PALABRA() { return getTokens(CookParserParser.PALABRA); }
		public TerminalNode PALABRA(int i) {
			return getToken(CookParserParser.PALABRA, i);
		}
		public TerminalNode COMA() { return getToken(CookParserParser.COMA, 0); }
		public TerminalNode PAR_DE() { return getToken(CookParserParser.PAR_DE, 0); }
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
			setState(152);
			match(HERVIR);
			setState(153);
			match(PAR_IZ);
			setState(154);
			match(PALABRA);
			setState(155);
			match(COMA);
			setState(156);
			match(PALABRA);
			setState(157);
			match(PAR_DE);
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

	public static class DeclararcorteContext extends ParserRuleContext {
		public TerminalNode CORTE_TYPE() { return getToken(CookParserParser.CORTE_TYPE, 0); }
		public TerminalNode PALABRA() { return getToken(CookParserParser.PALABRA, 0); }
		public DeclararcorteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declararcorte; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitDeclararcorte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararcorteContext declararcorte() throws RecognitionException {
		DeclararcorteContext _localctx = new DeclararcorteContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declararcorte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(CORTE_TYPE);
			setState(160);
			match(PALABRA);
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

	public static class CortarContext extends ParserRuleContext {
		public TerminalNode CORTAR() { return getToken(CookParserParser.CORTAR, 0); }
		public TerminalNode PAR_IZ() { return getToken(CookParserParser.PAR_IZ, 0); }
		public List<TerminalNode> PALABRA() { return getTokens(CookParserParser.PALABRA); }
		public TerminalNode PALABRA(int i) {
			return getToken(CookParserParser.PALABRA, i);
		}
		public TerminalNode COMA() { return getToken(CookParserParser.COMA, 0); }
		public TerminalNode PAR_DE() { return getToken(CookParserParser.PAR_DE, 0); }
		public CortarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cortar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitCortar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CortarContext cortar() throws RecognitionException {
		CortarContext _localctx = new CortarContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cortar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(CORTAR);
			setState(163);
			match(PAR_IZ);
			setState(164);
			match(PALABRA);
			setState(165);
			match(COMA);
			setState(166);
			match(PALABRA);
			setState(167);
			match(PAR_DE);
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
		public TerminalNode DUELO_A_MUERTE_CON_CUCHILLOS() { return getToken(CookParserParser.DUELO_A_MUERTE_CON_CUCHILLOS, 0); }
		public List<TerminalNode> PALABRA() { return getTokens(CookParserParser.PALABRA); }
		public TerminalNode PALABRA(int i) {
			return getToken(CookParserParser.PALABRA, i);
		}
		public TerminalNode PAR_IZ() { return getToken(CookParserParser.PAR_IZ, 0); }
		public TerminalNode PAR_DE() { return getToken(CookParserParser.PAR_DE, 0); }
		public List<TerminalNode> COMA() { return getTokens(CookParserParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(CookParserParser.COMA, i);
		}
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
		enterRule(_localctx, 38, RULE_yo_creo_que_van_a_pelear_con_cuchillos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(DUELO_A_MUERTE_CON_CUCHILLOS);
			setState(170);
			match(PALABRA);
			setState(171);
			match(PAR_IZ);
			setState(172);
			match(PALABRA);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(173);
				match(COMA);
				setState(174);
				match(PALABRA);
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			match(PAR_DE);
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
		public TerminalNode PALABRA() { return getToken(CookParserParser.PALABRA, 0); }
		public TerminalNode ESTADO() { return getToken(CookParserParser.ESTADO, 0); }
		public TerminalNode DISTINGUIR() { return getToken(CookParserParser.DISTINGUIR, 0); }
		public TerminalNode IGUALAR() { return getToken(CookParserParser.IGUALAR, 0); }
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
		enterRule(_localctx, 40, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(PALABRA);
			setState(183);
			_la = _input.LA(1);
			if ( !(_la==IGUALAR || _la==DISTINGUIR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(184);
			match(ESTADO);
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
		public TerminalNode SI() { return getToken(CookParserParser.SI, 0); }
		public TerminalNode PAR_IZ() { return getToken(CookParserParser.PAR_IZ, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PAR_DE() { return getToken(CookParserParser.PAR_DE, 0); }
		public TerminalNode DO() { return getToken(CookParserParser.DO, 0); }
		public TerminalNode STOP() { return getToken(CookParserParser.STOP, 0); }
		public List<AccionContext> accion() {
			return getRuleContexts(AccionContext.class);
		}
		public AccionContext accion(int i) {
			return getRuleContext(AccionContext.class,i);
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
		enterRule(_localctx, 42, RULE_quehacersi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(SI);
			setState(187);
			match(PAR_IZ);
			setState(188);
			condicion();
			setState(189);
			match(PAR_DE);
			setState(190);
			match(DO);
			setState(192); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(191);
				accion();
				}
				}
				setState(194); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WAITING) | (1L << SI) | (1L << CORTE_TYPE) | (1L << PELAR) | (1L << HERVIR) | (1L << GIRO) | (1L << MOLER) | (1L << SERVIR) | (1L << CORTAR) | (1L << DUELO_A_MUERTE_CON_CUCHILLOS))) != 0) );
			setState(196);
			match(STOP);
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
		public TerminalNode WAITING() { return getToken(CookParserParser.WAITING, 0); }
		public TerminalNode PAR_IZ() { return getToken(CookParserParser.PAR_IZ, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PAR_DE() { return getToken(CookParserParser.PAR_DE, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(CookParserParser.LLAVEIZQ, 0); }
		public TerminalNode LLAVEDER() { return getToken(CookParserParser.LLAVEDER, 0); }
		public List<AccionContext> accion() {
			return getRuleContexts(AccionContext.class);
		}
		public AccionContext accion(int i) {
			return getRuleContext(AccionContext.class,i);
		}
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
		enterRule(_localctx, 44, RULE_ciclosinfin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(WAITING);
			setState(199);
			match(PAR_IZ);
			setState(200);
			condicion();
			setState(201);
			match(PAR_DE);
			setState(202);
			match(LLAVEIZQ);
			setState(204); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(203);
				accion();
				}
				}
				setState(206); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WAITING) | (1L << SI) | (1L << CORTE_TYPE) | (1L << PELAR) | (1L << HERVIR) | (1L << GIRO) | (1L << MOLER) | (1L << SERVIR) | (1L << CORTAR) | (1L << DUELO_A_MUERTE_CON_CUCHILLOS))) != 0) );
			setState(208);
			match(LLAVEDER);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3H\u00d5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\6\2\65\n\2\r\2\16\2\66\3\2\6\2:\n\2\r\2\16\2;\3\2\6\2?\n\2\r\2"+
		"\16\2@\3\2\6\2D\n\2\r\2\16\2E\3\2\7\2I\n\2\f\2\16\2L\13\2\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7_\n\7\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\5\fq\n"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r{\n\r\3\16\3\16\3\16\3\16\3\16\6"+
		"\16\u0082\n\16\r\16\16\16\u0083\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00b2\n\25\f\25\16\25\u00b5"+
		"\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\6\27"+
		"\u00c3\n\27\r\27\16\27\u00c4\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\6"+
		"\30\u00cf\n\30\r\30\16\30\u00d0\3\30\3\30\3\30\2\2\31\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\2\4\4\2\23\23\25\33\3\2AB\u00d0\2\60\3"+
		"\2\2\2\4O\3\2\2\2\6Q\3\2\2\2\bS\3\2\2\2\nW\3\2\2\2\fZ\3\2\2\2\16b\3\2"+
		"\2\2\20d\3\2\2\2\22g\3\2\2\2\24j\3\2\2\2\26p\3\2\2\2\30z\3\2\2\2\32|\3"+
		"\2\2\2\34\u0089\3\2\2\2\36\u0090\3\2\2\2 \u0095\3\2\2\2\"\u009a\3\2\2"+
		"\2$\u00a1\3\2\2\2&\u00a4\3\2\2\2(\u00ab\3\2\2\2*\u00b8\3\2\2\2,\u00bc"+
		"\3\2\2\2.\u00c8\3\2\2\2\60\61\5\4\3\2\61\62\5\b\5\2\62\64\5\n\6\2\63\65"+
		"\5\f\7\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3"+
		"\2\2\28:\5\24\13\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2="+
		"?\5\20\t\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2BD\5\22\n"+
		"\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FJ\3\2\2\2GI\5\26\f\2HG\3\2"+
		"\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\5\6\4\2N\3\3"+
		"\2\2\2OP\7\n\2\2P\5\3\2\2\2QR\7\13\2\2R\7\3\2\2\2ST\7\"\2\2TU\7\4\2\2"+
		"UV\7\36\2\2V\t\3\2\2\2WX\7\4\2\2XY\7 \2\2Y\13\3\2\2\2Z[\7\24\2\2[\\\5"+
		"\16\b\2\\^\7H\2\2]_\7\4\2\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7\22\2\2a"+
		"\r\3\2\2\2bc\t\2\2\2c\17\3\2\2\2de\7\37\2\2ef\7H\2\2f\21\3\2\2\2gh\7\34"+
		"\2\2hi\7H\2\2i\23\3\2\2\2jk\7!\2\2kl\7H\2\2l\25\3\2\2\2mq\5\30\r\2nq\5"+
		",\27\2oq\5.\30\2pm\3\2\2\2pn\3\2\2\2po\3\2\2\2q\27\3\2\2\2r{\5\"\22\2"+
		"s{\5\32\16\2t{\5(\25\2u{\5\34\17\2v{\5\36\20\2w{\5 \21\2x{\5&\24\2y{\5"+
		"$\23\2zr\3\2\2\2zs\3\2\2\2zt\3\2\2\2zu\3\2\2\2zv\3\2\2\2zw\3\2\2\2zx\3"+
		"\2\2\2zy\3\2\2\2{\31\3\2\2\2|}\79\2\2}~\7\'\2\2~\u0081\7H\2\2\177\u0080"+
		"\7(\2\2\u0080\u0082\7H\2\2\u0081\177\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7&"+
		"\2\2\u0086\u0087\7A\2\2\u0087\u0088\7H\2\2\u0088\33\3\2\2\2\u0089\u008a"+
		"\7:\2\2\u008a\u008b\7\'\2\2\u008b\u008c\7H\2\2\u008c\u008d\7(\2\2\u008d"+
		"\u008e\7H\2\2\u008e\u008f\7&\2\2\u008f\35\3\2\2\2\u0090\u0091\7\63\2\2"+
		"\u0091\u0092\7\'\2\2\u0092\u0093\7H\2\2\u0093\u0094\7&\2\2\u0094\37\3"+
		"\2\2\2\u0095\u0096\7;\2\2\u0096\u0097\7\'\2\2\u0097\u0098\7H\2\2\u0098"+
		"\u0099\7&\2\2\u0099!\3\2\2\2\u009a\u009b\7\66\2\2\u009b\u009c\7\'\2\2"+
		"\u009c\u009d\7H\2\2\u009d\u009e\7(\2\2\u009e\u009f\7H\2\2\u009f\u00a0"+
		"\7&\2\2\u00a0#\3\2\2\2\u00a1\u00a2\7\35\2\2\u00a2\u00a3\7H\2\2\u00a3%"+
		"\3\2\2\2\u00a4\u00a5\7?\2\2\u00a5\u00a6\7\'\2\2\u00a6\u00a7\7H\2\2\u00a7"+
		"\u00a8\7(\2\2\u00a8\u00a9\7H\2\2\u00a9\u00aa\7&\2\2\u00aa\'\3\2\2\2\u00ab"+
		"\u00ac\7@\2\2\u00ac\u00ad\7H\2\2\u00ad\u00ae\7\'\2\2\u00ae\u00b3\7H\2"+
		"\2\u00af\u00b0\7(\2\2\u00b0\u00b2\7H\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b5"+
		"\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00b7\7&\2\2\u00b7)\3\2\2\2\u00b8\u00b9\7H\2\2\u00b9"+
		"\u00ba\t\3\2\2\u00ba\u00bb\7\5\2\2\u00bb+\3\2\2\2\u00bc\u00bd\7\21\2\2"+
		"\u00bd\u00be\7\'\2\2\u00be\u00bf\5*\26\2\u00bf\u00c0\7&\2\2\u00c0\u00c2"+
		"\7\16\2\2\u00c1\u00c3\5\26\f\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2"+
		"\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7"+
		"\7\17\2\2\u00c7-\3\2\2\2\u00c8\u00c9\7\r\2\2\u00c9\u00ca\7\'\2\2\u00ca"+
		"\u00cb\5*\26\2\u00cb\u00cc\7&\2\2\u00cc\u00ce\7,\2\2\u00cd\u00cf\5\26"+
		"\f\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\7-\2\2\u00d3/\3\2\2\2\16"+
		"\66;@EJ^pz\u0083\u00b3\u00c4\u00d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}