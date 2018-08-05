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
		FLOAT=1, NUMERO=2, ESTADO=3, STRING=4, COMMENT=5, WS=6, PREPARARINGREDIENTES=7, 
		FINCOCINA=8, SINO=9, WAITING=10, DO=11, STOP=12, ENDWAIT=13, SI=14, MEDICION=15, 
		MEZCLA_TYPE=16, CONDIMENTO_TYPE=17, CARNE_TYPE=18, VEGETAL_TYPE=19, LEGUMBRE_TYPE=20, 
		PESCADO_TYPE=21, LIQUID_TYPE=22, LACTEO_TYPE=23, CEREAL_TYPE=24, RECIPIENTE_TYPE=25, 
		CORTE_TYPE=26, MEDIDAS_TIEMPO=27, APARATO_TYPE=28, PORCION_TYPE=29, UTENCILIO_TYPE=30, 
		MEDIDA_TEMPERATURA=31, TIEMPODECLARACION=32, PAR_DE=33, PAR_IZ=34, COMA=35, 
		PTOCOMA=36, CORDER=37, CORIZQ=38, LLAVEIZQ=39, LLAVEDER=40, AND=41, OR=42, 
		MAS=43, MENOS=44, PARTIR=45, PELAR=46, ENCENDER=47, PREHOT=48, HERVIR=49, 
		MACERAR=50, AMASAR=51, GIRO=52, MOLER=53, SERVIR=54, UNTAR=55, EMPANIZAR=56, 
		RALLAR=57, CORTAR=58, DUELO_A_MUERTE_CON_CUCHILLOS=59, IGUALAR=60, DISTINGUIR=61, 
		MAYOR=62, MENOR=63, MAYEQ=64, MENEQ=65, NOMBREVAR=66, PALABRA=67;
	public static final int
		RULE_receta = 0, RULE_iniciar_cocina = 1, RULE_finalizar_cocina = 2, RULE_tiempo = 3, 
		RULE_porciones = 4, RULE_ingrediente = 5, RULE_tipo_ingrediente = 6, RULE_aparato = 7, 
		RULE_recipiente = 8, RULE_utencilio = 9, RULE_accion = 10, RULE_operaciones = 11, 
		RULE_precalentar = 12, RULE_encender = 13, RULE_macerar = 14, RULE_rallar = 15, 
		RULE_mezclar = 16, RULE_moler = 17, RULE_pelar = 18, RULE_servir = 19, 
		RULE_hervir = 20, RULE_declararcorte = 21, RULE_cortar = 22, RULE_yo_creo_que_van_a_pelear_con_cuchillos = 23, 
		RULE_comparar = 24, RULE_condicion = 25, RULE_quehacersi = 26, RULE_ciclosinfin = 27;
	public static final String[] ruleNames = {
		"receta", "iniciar_cocina", "finalizar_cocina", "tiempo", "porciones", 
		"ingrediente", "tipo_ingrediente", "aparato", "recipiente", "utencilio", 
		"accion", "operaciones", "precalentar", "encender", "macerar", "rallar", 
		"mezclar", "moler", "pelar", "servir", "hervir", "declararcorte", "cortar", 
		"yo_creo_que_van_a_pelear_con_cuchillos", "comparar", "condicion", "quehacersi", 
		"ciclosinfin"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'COMMENCER_LA_RECETTE'", "'ACHEVEMENT_RECETTE'", 
		"'AUTRE'", "'ATTENDRE'", "'FAIRE'", "'ARRETEZ'", "'RETOUR'", "'SI'", null, 
		"'MEZCLA'", "'CONDIMENTOS'", "'CARNE'", "'VEGETAL'", "'LEGUMBRE'", "'PESCADO'", 
		"'LIQUIDO'", "'LACTEO'", "'CEREAL'", "'RECIPIENTE'", "'CORTE'", null, 
		"'APARATO'", null, "'UTENCILIO'", null, "'TEMPS'", "')'", "'('", "','", 
		"';'", "']'", "'['", "'{'", "'}'", "'Y'", "'O'", "'AGREGAR'", "'QUITAR'", 
		"'PARTIR'", "'PELAR'", "'ENCENDER'", "'PRECALENTAR'", "'HERVIR'", "'MACERAR'", 
		"'AMASAR'", "'MEZCLAR'", "'MOLER'", "'SERVIR'", null, "'EMPANIZAR'", "'RALLAR'", 
		"'CORTAR'", "'DUELO-A-MUERTE-CON-CUCHILLOS'", "'='", "'!='", "'>'", "'<'", 
		"'>='", "'<='", "'$'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "FLOAT", "NUMERO", "ESTADO", "STRING", "COMMENT", "WS", "PREPARARINGREDIENTES", 
		"FINCOCINA", "SINO", "WAITING", "DO", "STOP", "ENDWAIT", "SI", "MEDICION", 
		"MEZCLA_TYPE", "CONDIMENTO_TYPE", "CARNE_TYPE", "VEGETAL_TYPE", "LEGUMBRE_TYPE", 
		"PESCADO_TYPE", "LIQUID_TYPE", "LACTEO_TYPE", "CEREAL_TYPE", "RECIPIENTE_TYPE", 
		"CORTE_TYPE", "MEDIDAS_TIEMPO", "APARATO_TYPE", "PORCION_TYPE", "UTENCILIO_TYPE", 
		"MEDIDA_TEMPERATURA", "TIEMPODECLARACION", "PAR_DE", "PAR_IZ", "COMA", 
		"PTOCOMA", "CORDER", "CORIZQ", "LLAVEIZQ", "LLAVEDER", "AND", "OR", "MAS", 
		"MENOS", "PARTIR", "PELAR", "ENCENDER", "PREHOT", "HERVIR", "MACERAR", 
		"AMASAR", "GIRO", "MOLER", "SERVIR", "UNTAR", "EMPANIZAR", "RALLAR", "CORTAR", 
		"DUELO_A_MUERTE_CON_CUCHILLOS", "IGUALAR", "DISTINGUIR", "MAYOR", "MENOR", 
		"MAYEQ", "MENEQ", "NOMBREVAR", "PALABRA"
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
			setState(56);
			iniciar_cocina();
			setState(57);
			tiempo();
			setState(58);
			porciones();
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59);
				ingrediente();
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MEZCLA_TYPE) | (1L << CONDIMENTO_TYPE) | (1L << CARNE_TYPE) | (1L << VEGETAL_TYPE) | (1L << LEGUMBRE_TYPE) | (1L << PESCADO_TYPE) | (1L << LIQUID_TYPE) | (1L << LACTEO_TYPE) | (1L << CEREAL_TYPE))) != 0) );
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64);
				utencilio();
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==UTENCILIO_TYPE );
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69);
				aparato();
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==APARATO_TYPE );
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74);
				recipiente();
				}
				}
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RECIPIENTE_TYPE );
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WAITING) | (1L << SI) | (1L << CORTE_TYPE) | (1L << PELAR) | (1L << ENCENDER) | (1L << PREHOT) | (1L << HERVIR) | (1L << MACERAR) | (1L << GIRO) | (1L << MOLER) | (1L << SERVIR) | (1L << RALLAR) | (1L << CORTAR) | (1L << DUELO_A_MUERTE_CON_CUCHILLOS))) != 0)) {
				{
				{
				setState(79);
				accion();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
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
			setState(87);
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
			setState(89);
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
			setState(91);
			match(TIEMPODECLARACION);
			setState(92);
			match(NUMERO);
			setState(93);
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
			setState(95);
			match(NUMERO);
			setState(96);
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
			setState(98);
			tipo_ingrediente();
			setState(99);
			match(PALABRA);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMERO) {
				{
				setState(100);
				match(NUMERO);
				}
			}

			setState(103);
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
		public TerminalNode MEZCLA_TYPE() { return getToken(CookParserParser.MEZCLA_TYPE, 0); }
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
			setState(105);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MEZCLA_TYPE) | (1L << CONDIMENTO_TYPE) | (1L << CARNE_TYPE) | (1L << VEGETAL_TYPE) | (1L << LEGUMBRE_TYPE) | (1L << PESCADO_TYPE) | (1L << LIQUID_TYPE) | (1L << LACTEO_TYPE) | (1L << CEREAL_TYPE))) != 0)) ) {
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
			setState(107);
			match(APARATO_TYPE);
			setState(108);
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
			setState(110);
			match(RECIPIENTE_TYPE);
			setState(111);
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
			setState(113);
			match(UTENCILIO_TYPE);
			setState(114);
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
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CORTE_TYPE:
			case PELAR:
			case ENCENDER:
			case PREHOT:
			case HERVIR:
			case MACERAR:
			case GIRO:
			case MOLER:
			case SERVIR:
			case RALLAR:
			case CORTAR:
			case DUELO_A_MUERTE_CON_CUCHILLOS:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				operaciones();
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				quehacersi();
				}
				break;
			case WAITING:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
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
		public EncenderContext encender() {
			return getRuleContext(EncenderContext.class,0);
		}
		public PrecalentarContext precalentar() {
			return getRuleContext(PrecalentarContext.class,0);
		}
		public MacerarContext macerar() {
			return getRuleContext(MacerarContext.class,0);
		}
		public RallarContext rallar() {
			return getRuleContext(RallarContext.class,0);
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
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HERVIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				hervir();
				}
				break;
			case GIRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				mezclar();
				}
				break;
			case DUELO_A_MUERTE_CON_CUCHILLOS:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				yo_creo_que_van_a_pelear_con_cuchillos();
				}
				break;
			case MOLER:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				moler();
				}
				break;
			case PELAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(125);
				pelar();
				}
				break;
			case SERVIR:
				enterOuterAlt(_localctx, 6);
				{
				setState(126);
				servir();
				}
				break;
			case CORTAR:
				enterOuterAlt(_localctx, 7);
				{
				setState(127);
				cortar();
				}
				break;
			case CORTE_TYPE:
				enterOuterAlt(_localctx, 8);
				{
				setState(128);
				declararcorte();
				}
				break;
			case ENCENDER:
				enterOuterAlt(_localctx, 9);
				{
				setState(129);
				encender();
				}
				break;
			case PREHOT:
				enterOuterAlt(_localctx, 10);
				{
				setState(130);
				precalentar();
				}
				break;
			case MACERAR:
				enterOuterAlt(_localctx, 11);
				{
				setState(131);
				macerar();
				}
				break;
			case RALLAR:
				enterOuterAlt(_localctx, 12);
				{
				setState(132);
				rallar();
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
			setState(135);
			match(PREHOT);
			setState(136);
			match(PAR_IZ);
			setState(137);
			match(PALABRA);
			setState(138);
			match(COMA);
			setState(139);
			match(NUMERO);
			setState(140);
			match(MEDIDA_TEMPERATURA);
			setState(141);
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
			setState(143);
			match(ENCENDER);
			setState(144);
			match(PAR_IZ);
			setState(145);
			match(PALABRA);
			setState(146);
			match(COMA);
			setState(147);
			match(NUMERO);
			setState(148);
			match(MEDIDA_TEMPERATURA);
			setState(149);
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
			setState(151);
			match(MACERAR);
			setState(152);
			match(PAR_IZ);
			setState(153);
			match(PALABRA);
			setState(154);
			match(COMA);
			setState(155);
			match(PALABRA);
			setState(156);
			match(MENOR);
			setState(157);
			match(PALABRA);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(158);
				match(COMA);
				setState(159);
				match(PALABRA);
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			match(MAYOR);
			setState(166);
			match(NUMERO);
			setState(167);
			match(MEDIDAS_TIEMPO);
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
			setState(170);
			match(RALLAR);
			setState(171);
			match(PAR_IZ);
			setState(172);
			match(PALABRA);
			setState(173);
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
			setState(175);
			match(GIRO);
			setState(176);
			match(PAR_IZ);
			setState(177);
			match(PALABRA);
			setState(180); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(178);
				match(COMA);
				setState(179);
				match(PALABRA);
				}
				}
				setState(182); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMA );
			setState(184);
			match(PAR_DE);
			setState(185);
			match(IGUALAR);
			setState(186);
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
			setState(188);
			match(MOLER);
			setState(189);
			match(PAR_IZ);
			setState(190);
			match(PALABRA);
			setState(191);
			match(COMA);
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
			setState(195);
			match(PELAR);
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
			setState(200);
			match(SERVIR);
			setState(201);
			match(PAR_IZ);
			setState(202);
			match(PALABRA);
			setState(203);
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
			setState(205);
			match(HERVIR);
			setState(206);
			match(PAR_IZ);
			setState(207);
			match(PALABRA);
			setState(208);
			match(COMA);
			setState(209);
			match(PALABRA);
			setState(210);
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
			setState(212);
			match(CORTE_TYPE);
			setState(213);
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
			setState(215);
			match(CORTAR);
			setState(216);
			match(PAR_IZ);
			setState(217);
			match(PALABRA);
			setState(218);
			match(COMA);
			setState(219);
			match(PALABRA);
			setState(220);
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
			setState(222);
			match(DUELO_A_MUERTE_CON_CUCHILLOS);
			setState(223);
			match(PALABRA);
			setState(224);
			match(PAR_IZ);
			setState(225);
			match(PALABRA);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(226);
				match(COMA);
				setState(227);
				match(PALABRA);
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233);
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

	public static class CompararContext extends ParserRuleContext {
		public TerminalNode DISTINGUIR() { return getToken(CookParserParser.DISTINGUIR, 0); }
		public TerminalNode IGUALAR() { return getToken(CookParserParser.IGUALAR, 0); }
		public CompararContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CookParserVisitor ) return ((CookParserVisitor<? extends T>)visitor).visitComparar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompararContext comparar() throws RecognitionException {
		CompararContext _localctx = new CompararContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_comparar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_la = _input.LA(1);
			if ( !(_la==IGUALAR || _la==DISTINGUIR) ) {
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

	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode PALABRA() { return getToken(CookParserParser.PALABRA, 0); }
		public CompararContext comparar() {
			return getRuleContext(CompararContext.class,0);
		}
		public TerminalNode ESTADO() { return getToken(CookParserParser.ESTADO, 0); }
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
		enterRule(_localctx, 50, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(PALABRA);
			setState(238);
			comparar();
			setState(239);
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
		enterRule(_localctx, 52, RULE_quehacersi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(SI);
			setState(242);
			match(PAR_IZ);
			setState(243);
			condicion();
			setState(244);
			match(PAR_DE);
			setState(245);
			match(DO);
			setState(247); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(246);
				accion();
				}
				}
				setState(249); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WAITING) | (1L << SI) | (1L << CORTE_TYPE) | (1L << PELAR) | (1L << ENCENDER) | (1L << PREHOT) | (1L << HERVIR) | (1L << MACERAR) | (1L << GIRO) | (1L << MOLER) | (1L << SERVIR) | (1L << RALLAR) | (1L << CORTAR) | (1L << DUELO_A_MUERTE_CON_CUCHILLOS))) != 0) );
			setState(251);
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
		enterRule(_localctx, 54, RULE_ciclosinfin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(WAITING);
			setState(254);
			match(PAR_IZ);
			setState(255);
			condicion();
			setState(256);
			match(PAR_DE);
			setState(257);
			match(LLAVEIZQ);
			setState(259); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(258);
				accion();
				}
				}
				setState(261); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WAITING) | (1L << SI) | (1L << CORTE_TYPE) | (1L << PELAR) | (1L << ENCENDER) | (1L << PREHOT) | (1L << HERVIR) | (1L << MACERAR) | (1L << GIRO) | (1L << MOLER) | (1L << SERVIR) | (1L << RALLAR) | (1L << CORTAR) | (1L << DUELO_A_MUERTE_CON_CUCHILLOS))) != 0) );
			setState(263);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3E\u010c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\6\2?\n\2\r\2"+
		"\16\2@\3\2\6\2D\n\2\r\2\16\2E\3\2\6\2I\n\2\r\2\16\2J\3\2\6\2N\n\2\r\2"+
		"\16\2O\3\2\7\2S\n\2\f\2\16\2V\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\7\3\7\3\7\5\7h\n\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\5\fz\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u0088\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\7\20\u00a3\n\20\f\20\16\20\u00a6\13\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\6\22"+
		"\u00b7\n\22\r\22\16\22\u00b8\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u00e7\n\31\f\31\16\31\u00ea"+
		"\13\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\6\34\u00fa\n\34\r\34\16\34\u00fb\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\6\35\u0106\n\35\r\35\16\35\u0107\3\35\3\35\3\35\2\2\36\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\4\3\2\22\32"+
		"\3\2>?\u0107\2:\3\2\2\2\4Y\3\2\2\2\6[\3\2\2\2\b]\3\2\2\2\na\3\2\2\2\f"+
		"d\3\2\2\2\16k\3\2\2\2\20m\3\2\2\2\22p\3\2\2\2\24s\3\2\2\2\26y\3\2\2\2"+
		"\30\u0087\3\2\2\2\32\u0089\3\2\2\2\34\u0091\3\2\2\2\36\u0099\3\2\2\2 "+
		"\u00ac\3\2\2\2\"\u00b1\3\2\2\2$\u00be\3\2\2\2&\u00c5\3\2\2\2(\u00ca\3"+
		"\2\2\2*\u00cf\3\2\2\2,\u00d6\3\2\2\2.\u00d9\3\2\2\2\60\u00e0\3\2\2\2\62"+
		"\u00ed\3\2\2\2\64\u00ef\3\2\2\2\66\u00f3\3\2\2\28\u00ff\3\2\2\2:;\5\4"+
		"\3\2;<\5\b\5\2<>\5\n\6\2=?\5\f\7\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2"+
		"\2\2AC\3\2\2\2BD\5\24\13\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3"+
		"\2\2\2GI\5\20\t\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LN"+
		"\5\22\n\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PT\3\2\2\2QS\5\26\f\2"+
		"RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\5\6\4\2"+
		"X\3\3\2\2\2YZ\7\t\2\2Z\5\3\2\2\2[\\\7\n\2\2\\\7\3\2\2\2]^\7\"\2\2^_\7"+
		"\4\2\2_`\7\35\2\2`\t\3\2\2\2ab\7\4\2\2bc\7\37\2\2c\13\3\2\2\2de\5\16\b"+
		"\2eg\7E\2\2fh\7\4\2\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7\21\2\2j\r\3\2"+
		"\2\2kl\t\2\2\2l\17\3\2\2\2mn\7\36\2\2no\7E\2\2o\21\3\2\2\2pq\7\33\2\2"+
		"qr\7E\2\2r\23\3\2\2\2st\7 \2\2tu\7E\2\2u\25\3\2\2\2vz\5\30\r\2wz\5\66"+
		"\34\2xz\58\35\2yv\3\2\2\2yw\3\2\2\2yx\3\2\2\2z\27\3\2\2\2{\u0088\5*\26"+
		"\2|\u0088\5\"\22\2}\u0088\5\60\31\2~\u0088\5$\23\2\177\u0088\5&\24\2\u0080"+
		"\u0088\5(\25\2\u0081\u0088\5.\30\2\u0082\u0088\5,\27\2\u0083\u0088\5\34"+
		"\17\2\u0084\u0088\5\32\16\2\u0085\u0088\5\36\20\2\u0086\u0088\5 \21\2"+
		"\u0087{\3\2\2\2\u0087|\3\2\2\2\u0087}\3\2\2\2\u0087~\3\2\2\2\u0087\177"+
		"\3\2\2\2\u0087\u0080\3\2\2\2\u0087\u0081\3\2\2\2\u0087\u0082\3\2\2\2\u0087"+
		"\u0083\3\2\2\2\u0087\u0084\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2"+
		"\2\2\u0088\31\3\2\2\2\u0089\u008a\7\62\2\2\u008a\u008b\7$\2\2\u008b\u008c"+
		"\7E\2\2\u008c\u008d\7%\2\2\u008d\u008e\7\4\2\2\u008e\u008f\7!\2\2\u008f"+
		"\u0090\7#\2\2\u0090\33\3\2\2\2\u0091\u0092\7\61\2\2\u0092\u0093\7$\2\2"+
		"\u0093\u0094\7E\2\2\u0094\u0095\7%\2\2\u0095\u0096\7\4\2\2\u0096\u0097"+
		"\7!\2\2\u0097\u0098\7#\2\2\u0098\35\3\2\2\2\u0099\u009a\7\64\2\2\u009a"+
		"\u009b\7$\2\2\u009b\u009c\7E\2\2\u009c\u009d\7%\2\2\u009d\u009e\7E\2\2"+
		"\u009e\u009f\7A\2\2\u009f\u00a4\7E\2\2\u00a0\u00a1\7%\2\2\u00a1\u00a3"+
		"\7E\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7@"+
		"\2\2\u00a8\u00a9\7\4\2\2\u00a9\u00aa\7\35\2\2\u00aa\u00ab\7#\2\2\u00ab"+
		"\37\3\2\2\2\u00ac\u00ad\7;\2\2\u00ad\u00ae\7$\2\2\u00ae\u00af\7E\2\2\u00af"+
		"\u00b0\7#\2\2\u00b0!\3\2\2\2\u00b1\u00b2\7\66\2\2\u00b2\u00b3\7$\2\2\u00b3"+
		"\u00b6\7E\2\2\u00b4\u00b5\7%\2\2\u00b5\u00b7\7E\2\2\u00b6\u00b4\3\2\2"+
		"\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\u00bb\7#\2\2\u00bb\u00bc\7>\2\2\u00bc\u00bd\7E\2\2\u00bd"+
		"#\3\2\2\2\u00be\u00bf\7\67\2\2\u00bf\u00c0\7$\2\2\u00c0\u00c1\7E\2\2\u00c1"+
		"\u00c2\7%\2\2\u00c2\u00c3\7E\2\2\u00c3\u00c4\7#\2\2\u00c4%\3\2\2\2\u00c5"+
		"\u00c6\7\60\2\2\u00c6\u00c7\7$\2\2\u00c7\u00c8\7E\2\2\u00c8\u00c9\7#\2"+
		"\2\u00c9\'\3\2\2\2\u00ca\u00cb\78\2\2\u00cb\u00cc\7$\2\2\u00cc\u00cd\7"+
		"E\2\2\u00cd\u00ce\7#\2\2\u00ce)\3\2\2\2\u00cf\u00d0\7\63\2\2\u00d0\u00d1"+
		"\7$\2\2\u00d1\u00d2\7E\2\2\u00d2\u00d3\7%\2\2\u00d3\u00d4\7E\2\2\u00d4"+
		"\u00d5\7#\2\2\u00d5+\3\2\2\2\u00d6\u00d7\7\34\2\2\u00d7\u00d8\7E\2\2\u00d8"+
		"-\3\2\2\2\u00d9\u00da\7<\2\2\u00da\u00db\7$\2\2\u00db\u00dc\7E\2\2\u00dc"+
		"\u00dd\7%\2\2\u00dd\u00de\7E\2\2\u00de\u00df\7#\2\2\u00df/\3\2\2\2\u00e0"+
		"\u00e1\7=\2\2\u00e1\u00e2\7E\2\2\u00e2\u00e3\7$\2\2\u00e3\u00e8\7E\2\2"+
		"\u00e4\u00e5\7%\2\2\u00e5\u00e7\7E\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea"+
		"\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00eb\u00ec\7#\2\2\u00ec\61\3\2\2\2\u00ed\u00ee\t\3\2\2"+
		"\u00ee\63\3\2\2\2\u00ef\u00f0\7E\2\2\u00f0\u00f1\5\62\32\2\u00f1\u00f2"+
		"\7\5\2\2\u00f2\65\3\2\2\2\u00f3\u00f4\7\20\2\2\u00f4\u00f5\7$\2\2\u00f5"+
		"\u00f6\5\64\33\2\u00f6\u00f7\7#\2\2\u00f7\u00f9\7\r\2\2\u00f8\u00fa\5"+
		"\26\f\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\7\16\2\2\u00fe\67\3\2\2"+
		"\2\u00ff\u0100\7\f\2\2\u0100\u0101\7$\2\2\u0101\u0102\5\64\33\2\u0102"+
		"\u0103\7#\2\2\u0103\u0105\7)\2\2\u0104\u0106\5\26\f\2\u0105\u0104\3\2"+
		"\2\2\u0106\u0107\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\7*\2\2\u010a9\3\2\2\2\17@EJOTgy\u0087\u00a4"+
		"\u00b8\u00e8\u00fb\u0107";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}