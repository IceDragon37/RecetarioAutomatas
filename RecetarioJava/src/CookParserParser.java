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
		MEDIDA_TEMPERATURA=32, TIEMPODECLARACION=33, CUCHILLO=34, ESCRIBIR=35, 
		LEER=36, PAR_DE=37, PAR_IZ=38, COMA=39, PTOCOMA=40, CORDER=41, CORIZQ=42, 
		LLAVEIZQ=43, LLAVEDER=44, AND=45, OR=46, MAS=47, MENOS=48, PARTIR=49, 
		PELAR=50, ENCENDER=51, PREHOT=52, HERVIR=53, MACERAR=54, AMASAR=55, GIRO=56, 
		MOLER=57, SERVIR=58, UNTAR=59, EMPANIZAR=60, RALLAR=61, CORTAR=62, DUELO_A_MUERTE_CON_CUCHILLOS=63, 
		IGUALAR=64, DISTINGUIR=65, MAYOR=66, MENOR=67, MAYEQ=68, MENEQ=69, NOMBREVAR=70, 
		PALABRA=71;
	public static final int
		RULE_receta = 0, RULE_iniciar_cocina = 1, RULE_finalizar_cocina = 2, RULE_tiempo = 3, 
		RULE_porciones = 4, RULE_ingrediente = 5, RULE_tipo_ingrediente = 6, RULE_aparato = 7, 
		RULE_recipiente = 8, RULE_utencilio = 9, RULE_accion = 10, RULE_operaciones = 11, 
		RULE_precalentar = 12, RULE_encender = 13, RULE_macerar = 14, RULE_rallar = 15, 
		RULE_mezclar = 16, RULE_moler = 17, RULE_pelar = 18, RULE_servir = 19, 
		RULE_hervir = 20, RULE_declararcorte = 21, RULE_cortar = 22, RULE_yo_creo_que_van_a_pelear_con_cuchillos = 23, 
		RULE_condicion = 24, RULE_quehacersi = 25, RULE_ciclosinfin = 26;
	public static final String[] ruleNames = {
		"receta", "iniciar_cocina", "finalizar_cocina", "tiempo", "porciones", 
		"ingrediente", "tipo_ingrediente", "aparato", "recipiente", "utencilio", 
		"accion", "operaciones", "precalentar", "encender", "macerar", "rallar", 
		"mezclar", "moler", "pelar", "servir", "hervir", "declararcorte", "cortar", 
		"yo_creo_que_van_a_pelear_con_cuchillos", "condicion", "quehacersi", "ciclosinfin"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, "'COMMENCER_LA_RECETTE'", 
		"'ACHEVEMENT_RECETTE'", "'AUTRE'", "'ATTENDRE'", "'FAIRE'", "'ARRETEZ'", 
		"'RETOUR'", "'SI'", null, "'CONDIMENTOS'", "'INGREDIENT'", "'CARNE'", 
		"'VEGETAL'", "'LEGUMBRE'", "'PESCADO'", "'LIQUIDO'", "'LACTEO'", "'CEREAL'", 
		"'RECIPIENTE'", "'CORTE'", null, "'APARATO'", null, "'UTENCILIO'", null, 
		"'TEMPS'", null, "'ANOTAR'", "'INGRESE'", "')'", "'('", "','", "';'", 
		"']'", "'['", "'{'", "'}'", "'Y'", "'O'", "'AGREGAR'", "'QUITAR'", "'PARTIR'", 
		"'PELAR'", "'ENCENDER'", "'PRECALENTAR'", "'HERVIR'", "'MACERAR'", "'AMASAR'", 
		"'MEZCLAR'", "'MOLER'", "'SERVIR'", null, "'EMPANIZAR'", "'RALLAR'", "'CORTAR'", 
		"'�DUELO-A-MUERTE-CON-CUCHILLOS?'", "'='", "'!='", "'>'", "'<'", "'>='", 
		"'<='", "'$'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "FLOAT", "NUMERO", "ESTADO", "STRING", "COMMENT", "WS", "CONSEJOS", 
		"PREPARARINGREDIENTES", "FINCOCINA", "SINO", "WAITING", "DO", "STOP", 
		"ENDWAIT", "SI", "MEDICION", "CONDIMENTO_TYPE", "DECLARACION", "CARNE_TYPE", 
		"VEGETAL_TYPE", "LEGUMBRE_TYPE", "PESCADO_TYPE", "LIQUID_TYPE", "LACTEO_TYPE", 
		"CEREAL_TYPE", "RECIPIENTE_TYPE", "CORTE_TYPE", "MEDIDAS_TIEMPO", "APARATO_TYPE", 
		"PORCION_TYPE", "UTENCILIO_TYPE", "MEDIDA_TEMPERATURA", "TIEMPODECLARACION", 
		"CUCHILLO", "ESCRIBIR", "LEER", "PAR_DE", "PAR_IZ", "COMA", "PTOCOMA", 
		"CORDER", "CORIZQ", "LLAVEIZQ", "LLAVEDER", "AND", "OR", "MAS", "MENOS", 
		"PARTIR", "PELAR", "ENCENDER", "PREHOT", "HERVIR", "MACERAR", "AMASAR", 
		"GIRO", "MOLER", "SERVIR", "UNTAR", "EMPANIZAR", "RALLAR", "CORTAR", "DUELO_A_MUERTE_CON_CUCHILLOS", 
		"IGUALAR", "DISTINGUIR", "MAYOR", "MENOR", "MAYEQ", "MENEQ", "NOMBREVAR", 
		"PALABRA"
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
			setState(54);
			iniciar_cocina();
			setState(55);
			tiempo();
			setState(56);
			porciones();
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				ingrediente();
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DECLARACION );
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				utencilio();
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==UTENCILIO_TYPE );
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				aparato();
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==APARATO_TYPE );
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				recipiente();
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RECIPIENTE_TYPE );
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WAITING) | (1L << SI) | (1L << CORTE_TYPE) | (1L << PELAR) | (1L << HERVIR) | (1L << GIRO) | (1L << MOLER) | (1L << SERVIR) | (1L << CORTAR) | (1L << DUELO_A_MUERTE_CON_CUCHILLOS))) != 0)) {
				{
				{
				setState(77);
				accion();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
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
			setState(85);
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
			setState(87);
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
			setState(89);
			match(TIEMPODECLARACION);
			setState(90);
			match(NUMERO);
			setState(91);
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
			setState(93);
			match(NUMERO);
			setState(94);
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
			setState(96);
			match(DECLARACION);
			setState(97);
			tipo_ingrediente();
			setState(98);
			match(PALABRA);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMERO) {
				{
				setState(99);
				match(NUMERO);
				}
			}

			setState(102);
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
			setState(104);
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
			setState(106);
			match(APARATO_TYPE);
			setState(107);
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
			setState(109);
			match(RECIPIENTE_TYPE);
			setState(110);
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
			setState(112);
			match(UTENCILIO_TYPE);
			setState(113);
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
			setState(118);
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
				setState(115);
				operaciones();
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				quehacersi();
				}
				break;
			case WAITING:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
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
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HERVIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				hervir();
				}
				break;
			case GIRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				mezclar();
				}
				break;
			case DUELO_A_MUERTE_CON_CUCHILLOS:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				yo_creo_que_van_a_pelear_con_cuchillos();
				}
				break;
			case MOLER:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				moler();
				}
				break;
			case PELAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				pelar();
				}
				break;
			case SERVIR:
				enterOuterAlt(_localctx, 6);
				{
				setState(125);
				servir();
				}
				break;
			case CORTAR:
				enterOuterAlt(_localctx, 7);
				{
				setState(126);
				cortar();
				}
				break;
			case CORTE_TYPE:
				enterOuterAlt(_localctx, 8);
				{
				setState(127);
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

	public static class PrecalentarContext extends ParserRuleContext {
		public TerminalNode PREHOT() { return getToken(CookParserParser.PREHOT, 0); }
		public TerminalNode PAR_IZ() { return getToken(CookParserParser.PAR_IZ, 0); }
		public TerminalNode PALABRA() { return getToken(CookParserParser.PALABRA, 0); }
		public TerminalNode COMA() { return getToken(CookParserParser.COMA, 0); }
		public TerminalNode NUMERO() { return getToken(CookParserParser.NUMERO, 0); }
		public TerminalNode MEDIDA_TEMPERATURA() { return getToken(CookParserParser.MEDIDA_TEMPERATURA, 0); }
		public TerminalNode PAR_DE() { return getToken(CookParserParser.PAR_DE, 0); }
		public PrecalentarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precalentar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitPrecalentar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrecalentarContext precalentar() throws RecognitionException {
		PrecalentarContext _localctx = new PrecalentarContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_precalentar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(PREHOT);
			setState(131);
			match(PAR_IZ);
			setState(132);
			match(PALABRA);
			setState(133);
			match(COMA);
			setState(134);
			match(NUMERO);
			setState(135);
			match(MEDIDA_TEMPERATURA);
			setState(136);
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

	public static class EncenderContext extends ParserRuleContext {
		public TerminalNode ENCENDER() { return getToken(CookParserParser.ENCENDER, 0); }
		public TerminalNode PAR_IZ() { return getToken(CookParserParser.PAR_IZ, 0); }
		public TerminalNode PALABRA() { return getToken(CookParserParser.PALABRA, 0); }
		public TerminalNode COMA() { return getToken(CookParserParser.COMA, 0); }
		public TerminalNode NUMERO() { return getToken(CookParserParser.NUMERO, 0); }
		public TerminalNode MEDIDA_TEMPERATURA() { return getToken(CookParserParser.MEDIDA_TEMPERATURA, 0); }
		public TerminalNode PAR_DE() { return getToken(CookParserParser.PAR_DE, 0); }
		public EncenderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encender; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitEncender(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncenderContext encender() throws RecognitionException {
		EncenderContext _localctx = new EncenderContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_encender);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(ENCENDER);
			setState(139);
			match(PAR_IZ);
			setState(140);
			match(PALABRA);
			setState(141);
			match(COMA);
			setState(142);
			match(NUMERO);
			setState(143);
			match(MEDIDA_TEMPERATURA);
			setState(144);
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

	public static class MacerarContext extends ParserRuleContext {
		public TerminalNode MACERAR() { return getToken(CookParserParser.MACERAR, 0); }
		public TerminalNode PAR_IZ() { return getToken(CookParserParser.PAR_IZ, 0); }
		public List<TerminalNode> PALABRA() { return getTokens(CookParserParser.PALABRA); }
		public TerminalNode PALABRA(int i) {
			return getToken(CookParserParser.PALABRA, i);
		}
		public List<TerminalNode> COMA() { return getTokens(CookParserParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(CookParserParser.COMA, i);
		}
		public TerminalNode MENOR() { return getToken(CookParserParser.MENOR, 0); }
		public TerminalNode MAYOR() { return getToken(CookParserParser.MAYOR, 0); }
		public TerminalNode NUMERO() { return getToken(CookParserParser.NUMERO, 0); }
		public TerminalNode MEDIDAS_TIEMPO() { return getToken(CookParserParser.MEDIDAS_TIEMPO, 0); }
		public TerminalNode PAR_DE() { return getToken(CookParserParser.PAR_DE, 0); }
		public MacerarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macerar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitMacerar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacerarContext macerar() throws RecognitionException {
		MacerarContext _localctx = new MacerarContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_macerar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(MACERAR);
			setState(147);
			match(PAR_IZ);
			setState(148);
			match(PALABRA);
			setState(149);
			match(COMA);
			setState(150);
			match(PALABRA);
			setState(151);
			match(MENOR);
			setState(152);
			match(PALABRA);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(153);
				match(COMA);
				setState(154);
				match(PALABRA);
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(MAYOR);
			setState(161);
			match(NUMERO);
			setState(162);
			match(MEDIDAS_TIEMPO);
			setState(163);
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

	public static class RallarContext extends ParserRuleContext {
		public TerminalNode RALLAR() { return getToken(CookParserParser.RALLAR, 0); }
		public TerminalNode PAR_IZ() { return getToken(CookParserParser.PAR_IZ, 0); }
		public TerminalNode PALABRA() { return getToken(CookParserParser.PALABRA, 0); }
		public TerminalNode PAR_DE() { return getToken(CookParserParser.PAR_DE, 0); }
		public RallarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rallar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitRallar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RallarContext rallar() throws RecognitionException {
		RallarContext _localctx = new RallarContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_rallar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(RALLAR);
			setState(166);
			match(PAR_IZ);
			setState(167);
			match(PALABRA);
			setState(168);
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
		enterRule(_localctx, 32, RULE_mezclar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(GIRO);
			setState(171);
			match(PAR_IZ);
			setState(172);
			match(PALABRA);
			setState(175); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(173);
				match(COMA);
				setState(174);
				match(PALABRA);
				}
				}
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMA );
			setState(179);
			match(PAR_DE);
			setState(180);
			match(IGUALAR);
			setState(181);
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
		enterRule(_localctx, 34, RULE_moler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(MOLER);
			setState(184);
			match(PAR_IZ);
			setState(185);
			match(PALABRA);
			setState(186);
			match(COMA);
			setState(187);
			match(PALABRA);
			setState(188);
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
		enterRule(_localctx, 36, RULE_pelar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(PELAR);
			setState(191);
			match(PAR_IZ);
			setState(192);
			match(PALABRA);
			setState(193);
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
		enterRule(_localctx, 38, RULE_servir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(SERVIR);
			setState(196);
			match(PAR_IZ);
			setState(197);
			match(PALABRA);
			setState(198);
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
		enterRule(_localctx, 40, RULE_hervir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(HERVIR);
			setState(201);
			match(PAR_IZ);
			setState(202);
			match(PALABRA);
			setState(203);
			match(COMA);
			setState(204);
			match(PALABRA);
			setState(205);
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
		enterRule(_localctx, 42, RULE_declararcorte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(CORTE_TYPE);
			setState(208);
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
		enterRule(_localctx, 44, RULE_cortar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(CORTAR);
			setState(211);
			match(PAR_IZ);
			setState(212);
			match(PALABRA);
			setState(213);
			match(COMA);
			setState(214);
			match(PALABRA);
			setState(215);
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
		enterRule(_localctx, 46, RULE_yo_creo_que_van_a_pelear_con_cuchillos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(DUELO_A_MUERTE_CON_CUCHILLOS);
			setState(218);
			match(PALABRA);
			setState(219);
			match(PAR_IZ);
			setState(220);
			match(PALABRA);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(221);
				match(COMA);
				setState(222);
				match(PALABRA);
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
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
		enterRule(_localctx, 48, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(PALABRA);
			setState(231);
			_la = _input.LA(1);
			if ( !(_la==IGUALAR || _la==DISTINGUIR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(232);
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
		enterRule(_localctx, 50, RULE_quehacersi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(SI);
			setState(235);
			match(PAR_IZ);
			setState(236);
			condicion();
			setState(237);
			match(PAR_DE);
			setState(238);
			match(DO);
			setState(240); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(239);
				accion();
				}
				}
				setState(242); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WAITING) | (1L << SI) | (1L << CORTE_TYPE) | (1L << PELAR) | (1L << HERVIR) | (1L << GIRO) | (1L << MOLER) | (1L << SERVIR) | (1L << CORTAR) | (1L << DUELO_A_MUERTE_CON_CUCHILLOS))) != 0) );
			setState(244);
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
		enterRule(_localctx, 52, RULE_ciclosinfin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(WAITING);
			setState(247);
			match(PAR_IZ);
			setState(248);
			condicion();
			setState(249);
			match(PAR_DE);
			setState(250);
			match(LLAVEIZQ);
			setState(252); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(251);
				accion();
				}
				}
				setState(254); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WAITING) | (1L << SI) | (1L << CORTE_TYPE) | (1L << PELAR) | (1L << HERVIR) | (1L << GIRO) | (1L << MOLER) | (1L << SERVIR) | (1L << CORTAR) | (1L << DUELO_A_MUERTE_CON_CUCHILLOS))) != 0) );
			setState(256);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3I\u0105\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\6\2=\n\2\r\2\16\2>\3\2"+
		"\6\2B\n\2\r\2\16\2C\3\2\6\2G\n\2\r\2\16\2H\3\2\6\2L\n\2\r\2\16\2M\3\2"+
		"\7\2Q\n\2\f\2\16\2T\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\5\7g\n\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\5\fy\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u0083\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\7\20\u009e\n\20\f\20\16\20\u00a1\13\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\6\22\u00b2\n\22\r\22\16"+
		"\22\u00b3\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\7\31\u00e2\n\31\f\31\16\31\u00e5\13\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\6\33\u00f3\n\33\r\33"+
		"\16\33\u00f4\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\6\34\u00ff\n\34\r"+
		"\34\16\34\u0100\3\34\3\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\66\2\4\4\2\23\23\25\33\3\2BC\u00fd\28\3\2\2\2"+
		"\4W\3\2\2\2\6Y\3\2\2\2\b[\3\2\2\2\n_\3\2\2\2\fb\3\2\2\2\16j\3\2\2\2\20"+
		"l\3\2\2\2\22o\3\2\2\2\24r\3\2\2\2\26x\3\2\2\2\30\u0082\3\2\2\2\32\u0084"+
		"\3\2\2\2\34\u008c\3\2\2\2\36\u0094\3\2\2\2 \u00a7\3\2\2\2\"\u00ac\3\2"+
		"\2\2$\u00b9\3\2\2\2&\u00c0\3\2\2\2(\u00c5\3\2\2\2*\u00ca\3\2\2\2,\u00d1"+
		"\3\2\2\2.\u00d4\3\2\2\2\60\u00db\3\2\2\2\62\u00e8\3\2\2\2\64\u00ec\3\2"+
		"\2\2\66\u00f8\3\2\2\289\5\4\3\29:\5\b\5\2:<\5\n\6\2;=\5\f\7\2<;\3\2\2"+
		"\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@B\5\24\13\2A@\3\2\2\2BC\3\2"+
		"\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EG\5\20\t\2FE\3\2\2\2GH\3\2\2\2HF\3"+
		"\2\2\2HI\3\2\2\2IK\3\2\2\2JL\5\22\n\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN"+
		"\3\2\2\2NR\3\2\2\2OQ\5\26\f\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2"+
		"SU\3\2\2\2TR\3\2\2\2UV\5\6\4\2V\3\3\2\2\2WX\7\n\2\2X\5\3\2\2\2YZ\7\13"+
		"\2\2Z\7\3\2\2\2[\\\7#\2\2\\]\7\4\2\2]^\7\36\2\2^\t\3\2\2\2_`\7\4\2\2`"+
		"a\7 \2\2a\13\3\2\2\2bc\7\24\2\2cd\5\16\b\2df\7I\2\2eg\7\4\2\2fe\3\2\2"+
		"\2fg\3\2\2\2gh\3\2\2\2hi\7\22\2\2i\r\3\2\2\2jk\t\2\2\2k\17\3\2\2\2lm\7"+
		"\37\2\2mn\7I\2\2n\21\3\2\2\2op\7\34\2\2pq\7I\2\2q\23\3\2\2\2rs\7!\2\2"+
		"st\7I\2\2t\25\3\2\2\2uy\5\30\r\2vy\5\64\33\2wy\5\66\34\2xu\3\2\2\2xv\3"+
		"\2\2\2xw\3\2\2\2y\27\3\2\2\2z\u0083\5*\26\2{\u0083\5\"\22\2|\u0083\5\60"+
		"\31\2}\u0083\5$\23\2~\u0083\5&\24\2\177\u0083\5(\25\2\u0080\u0083\5.\30"+
		"\2\u0081\u0083\5,\27\2\u0082z\3\2\2\2\u0082{\3\2\2\2\u0082|\3\2\2\2\u0082"+
		"}\3\2\2\2\u0082~\3\2\2\2\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081"+
		"\3\2\2\2\u0083\31\3\2\2\2\u0084\u0085\7\66\2\2\u0085\u0086\7(\2\2\u0086"+
		"\u0087\7I\2\2\u0087\u0088\7)\2\2\u0088\u0089\7\4\2\2\u0089\u008a\7\"\2"+
		"\2\u008a\u008b\7\'\2\2\u008b\33\3\2\2\2\u008c\u008d\7\65\2\2\u008d\u008e"+
		"\7(\2\2\u008e\u008f\7I\2\2\u008f\u0090\7)\2\2\u0090\u0091\7\4\2\2\u0091"+
		"\u0092\7\"\2\2\u0092\u0093\7\'\2\2\u0093\35\3\2\2\2\u0094\u0095\78\2\2"+
		"\u0095\u0096\7(\2\2\u0096\u0097\7I\2\2\u0097\u0098\7)\2\2\u0098\u0099"+
		"\7I\2\2\u0099\u009a\7E\2\2\u009a\u009f\7I\2\2\u009b\u009c\7)\2\2\u009c"+
		"\u009e\7I\2\2\u009d\u009b\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2"+
		"\u00a3\7D\2\2\u00a3\u00a4\7\4\2\2\u00a4\u00a5\7\36\2\2\u00a5\u00a6\7\'"+
		"\2\2\u00a6\37\3\2\2\2\u00a7\u00a8\7?\2\2\u00a8\u00a9\7(\2\2\u00a9\u00aa"+
		"\7I\2\2\u00aa\u00ab\7\'\2\2\u00ab!\3\2\2\2\u00ac\u00ad\7:\2\2\u00ad\u00ae"+
		"\7(\2\2\u00ae\u00b1\7I\2\2\u00af\u00b0\7)\2\2\u00b0\u00b2\7I\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\7\'\2\2\u00b6\u00b7\7B\2\2\u00b7"+
		"\u00b8\7I\2\2\u00b8#\3\2\2\2\u00b9\u00ba\7;\2\2\u00ba\u00bb\7(\2\2\u00bb"+
		"\u00bc\7I\2\2\u00bc\u00bd\7)\2\2\u00bd\u00be\7I\2\2\u00be\u00bf\7\'\2"+
		"\2\u00bf%\3\2\2\2\u00c0\u00c1\7\64\2\2\u00c1\u00c2\7(\2\2\u00c2\u00c3"+
		"\7I\2\2\u00c3\u00c4\7\'\2\2\u00c4\'\3\2\2\2\u00c5\u00c6\7<\2\2\u00c6\u00c7"+
		"\7(\2\2\u00c7\u00c8\7I\2\2\u00c8\u00c9\7\'\2\2\u00c9)\3\2\2\2\u00ca\u00cb"+
		"\7\67\2\2\u00cb\u00cc\7(\2\2\u00cc\u00cd\7I\2\2\u00cd\u00ce\7)\2\2\u00ce"+
		"\u00cf\7I\2\2\u00cf\u00d0\7\'\2\2\u00d0+\3\2\2\2\u00d1\u00d2\7\35\2\2"+
		"\u00d2\u00d3\7I\2\2\u00d3-\3\2\2\2\u00d4\u00d5\7@\2\2\u00d5\u00d6\7(\2"+
		"\2\u00d6\u00d7\7I\2\2\u00d7\u00d8\7)\2\2\u00d8\u00d9\7I\2\2\u00d9\u00da"+
		"\7\'\2\2\u00da/\3\2\2\2\u00db\u00dc\7A\2\2\u00dc\u00dd\7I\2\2\u00dd\u00de"+
		"\7(\2\2\u00de\u00e3\7I\2\2\u00df\u00e0\7)\2\2\u00e0\u00e2\7I\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\7\'\2\2\u00e7"+
		"\61\3\2\2\2\u00e8\u00e9\7I\2\2\u00e9\u00ea\t\3\2\2\u00ea\u00eb\7\5\2\2"+
		"\u00eb\63\3\2\2\2\u00ec\u00ed\7\21\2\2\u00ed\u00ee\7(\2\2\u00ee\u00ef"+
		"\5\62\32\2\u00ef\u00f0\7\'\2\2\u00f0\u00f2\7\16\2\2\u00f1\u00f3\5\26\f"+
		"\2\u00f2\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\7\17\2\2\u00f7\65\3\2\2\2\u00f8"+
		"\u00f9\7\r\2\2\u00f9\u00fa\7(\2\2\u00fa\u00fb\5\62\32\2\u00fb\u00fc\7"+
		"\'\2\2\u00fc\u00fe\7-\2\2\u00fd\u00ff\5\26\f\2\u00fe\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\u0103\7.\2\2\u0103\67\3\2\2\2\17>CHMRfx\u0082\u009f\u00b3\u00e3"+
		"\u00f4\u0100";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}