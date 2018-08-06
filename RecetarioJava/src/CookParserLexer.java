// Generated from CookParser.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CookParserLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"COCIDO", "CRUDO", "HERVIDO", "NAT", "PUNTO", "FLOAT", "NUMERO", "ESTADO", 
		"STRING", "COMMENT", "WS", "PREPARARINGREDIENTES", "FINCOCINA", "SINO", 
		"WAITING", "DO", "STOP", "ENDWAIT", "SI", "MEDICION", "MEZCLA_TYPE", "CONDIMENTO_TYPE", 
		"CARNE_TYPE", "VEGETAL_TYPE", "LEGUMBRE_TYPE", "PESCADO_TYPE", "LIQUID_TYPE", 
		"LACTEO_TYPE", "CEREAL_TYPE", "RECIPIENTE_TYPE", "CORTE_TYPE", "MEDIDAS_TIEMPO", 
		"APARATO_TYPE", "PORCION_TYPE", "UTENCILIO_TYPE", "MEDIDA_TEMPERATURA", 
		"TIEMPODECLARACION", "PAR_DE", "PAR_IZ", "COMA", "PTOCOMA", "CORDER", 
		"CORIZQ", "LLAVEIZQ", "LLAVEDER", "AND", "OR", "MAS", "MENOS", "PARTIR", 
		"PELAR", "ENCENDER", "PREHOT", "HERVIR", "MACERAR", "AMASAR", "GIRO", 
		"MOLER", "SERVIR", "UNTAR", "EMPANIZAR", "RALLAR", "CORTAR", "DUELO_A_MUERTE_CON_CUCHILLOS", 
		"IGUALAR", "DISTINGUIR", "MAYOR", "MENOR", "MAYEQ", "MENEQ", "NOMBREVAR", 
		"PALABRA"
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
		"'CORTAR'", "'DUELO-A-MUERTE-CON-CUCHILLOS'", "'='", "'NOPE'", "'>'", 
		"'<'", "'>='", "'<='", "'$'"
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


	public CookParserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CookParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2E\u02ac\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\6\7\u00ab\n\7\r\7\16\7\u00ac\3\7\3\7\6\7\u00b1"+
		"\n\7\r\7\16\7\u00b2\3\b\6\b\u00b6\n\b\r\b\16\b\u00b7\3\b\5\b\u00bb\n\b"+
		"\3\t\3\t\3\t\5\t\u00c0\n\t\3\n\3\n\7\n\u00c4\n\n\f\n\16\n\u00c7\13\n\3"+
		"\n\3\n\3\13\3\13\7\13\u00cd\n\13\f\13\16\13\u00d0\13\13\3\13\5\13\u00d3"+
		"\n\13\3\13\3\13\3\13\3\13\3\f\6\f\u00da\n\f\r\f\16\f\u00db\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u014e\n\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u01b4\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01cd\n#\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*"+
		"\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\39\3"+
		"9\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3<\3<\3<\3"+
		"<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u025e\n=\3>\3>\3"+
		">\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3A\3"+
		"A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3A\3A\3A\3B\3B\3C\3C\3C\3C\3C\3D\3D\3E\3E\3F\3F\3F\3G\3G\3G\3H\3"+
		"H\3I\6I\u02a9\nI\rI\16I\u02aa\4\u00c5\u00ce\2J\3\2\5\2\7\2\t\2\13\2\r"+
		"\3\17\4\21\5\23\6\25\7\27\b\31\t\33\n\35\13\37\f!\r#\16%\17\'\20)\21+"+
		"\22-\23/\24\61\25\63\26\65\27\67\309\31;\32=\33?\34A\35C\36E\37G I!K\""+
		"M#O$Q%S&U\'W(Y)[*]+_,a-c.e/g\60i\61k\62m\63o\64q\65s\66u\67w8y9{:};\177"+
		"<\u0081=\u0083>\u0085?\u0087@\u0089A\u008bB\u008dC\u008fD\u0091E\3\2\6"+
		"\3\2\62;\5\2\13\f\17\17\"\"\4\2EEHH\4\2C\\c|\u02bc\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2"+
		"\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2"+
		"}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2"+
		"\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f"+
		"\3\2\2\2\2\u0091\3\2\2\2\3\u0093\3\2\2\2\5\u0098\3\2\2\2\7\u009d\3\2\2"+
		"\2\t\u00a5\3\2\2\2\13\u00a7\3\2\2\2\r\u00aa\3\2\2\2\17\u00ba\3\2\2\2\21"+
		"\u00bf\3\2\2\2\23\u00c1\3\2\2\2\25\u00ca\3\2\2\2\27\u00d9\3\2\2\2\31\u00df"+
		"\3\2\2\2\33\u00f4\3\2\2\2\35\u0107\3\2\2\2\37\u010d\3\2\2\2!\u0116\3\2"+
		"\2\2#\u011c\3\2\2\2%\u0124\3\2\2\2\'\u012b\3\2\2\2)\u014d\3\2\2\2+\u014f"+
		"\3\2\2\2-\u0156\3\2\2\2/\u0162\3\2\2\2\61\u0168\3\2\2\2\63\u0170\3\2\2"+
		"\2\65\u0179\3\2\2\2\67\u0181\3\2\2\29\u0189\3\2\2\2;\u0190\3\2\2\2=\u0197"+
		"\3\2\2\2?\u01a2\3\2\2\2A\u01b3\3\2\2\2C\u01b5\3\2\2\2E\u01cc\3\2\2\2G"+
		"\u01ce\3\2\2\2I\u01d8\3\2\2\2K\u01da\3\2\2\2M\u01e0\3\2\2\2O\u01e2\3\2"+
		"\2\2Q\u01e4\3\2\2\2S\u01e6\3\2\2\2U\u01e8\3\2\2\2W\u01ea\3\2\2\2Y\u01ec"+
		"\3\2\2\2[\u01ee\3\2\2\2]\u01f0\3\2\2\2_\u01f2\3\2\2\2a\u01f4\3\2\2\2c"+
		"\u01fc\3\2\2\2e\u0203\3\2\2\2g\u020a\3\2\2\2i\u0210\3\2\2\2k\u0219\3\2"+
		"\2\2m\u0225\3\2\2\2o\u022c\3\2\2\2q\u0234\3\2\2\2s\u023b\3\2\2\2u\u0243"+
		"\3\2\2\2w\u0249\3\2\2\2y\u025d\3\2\2\2{\u025f\3\2\2\2}\u0269\3\2\2\2\177"+
		"\u0270\3\2\2\2\u0081\u0277\3\2\2\2\u0083\u0294\3\2\2\2\u0085\u0296\3\2"+
		"\2\2\u0087\u029b\3\2\2\2\u0089\u029d\3\2\2\2\u008b\u029f\3\2\2\2\u008d"+
		"\u02a2\3\2\2\2\u008f\u02a5\3\2\2\2\u0091\u02a8\3\2\2\2\u0093\u0094\7E"+
		"\2\2\u0094\u0095\7W\2\2\u0095\u0096\7K\2\2\u0096\u0097\7V\2\2\u0097\4"+
		"\3\2\2\2\u0098\u0099\7D\2\2\u0099\u009a\7T\2\2\u009a\u009b\7W\2\2\u009b"+
		"\u009c\7V\2\2\u009c\6\3\2\2\2\u009d\u009e\7D\2\2\u009e\u009f\7Q\2\2\u009f"+
		"\u00a0\7W\2\2\u00a0\u00a1\7K\2\2\u00a1\u00a2\7N\2\2\u00a2\u00a3\7N\2\2"+
		"\u00a3\u00a4\7G\2\2\u00a4\b\3\2\2\2\u00a5\u00a6\t\2\2\2\u00a6\n\3\2\2"+
		"\2\u00a7\u00a8\7\60\2\2\u00a8\f\3\2\2\2\u00a9\u00ab\5\t\5\2\u00aa\u00a9"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00b0\5\13\6\2\u00af\u00b1\5\t\5\2\u00b0\u00af\3"+
		"\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\16\3\2\2\2\u00b4\u00b6\5\t\5\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2"+
		"\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00bb"+
		"\5\r\7\2\u00ba\u00b5\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\20\3\2\2\2\u00bc"+
		"\u00c0\5\3\2\2\u00bd\u00c0\5\5\3\2\u00be\u00c0\5\7\4\2\u00bf\u00bc\3\2"+
		"\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\22\3\2\2\2\u00c1\u00c5"+
		"\7$\2\2\u00c2\u00c4\13\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c8\u00c9\7$\2\2\u00c9\24\3\2\2\2\u00ca\u00ce\7#\2\2\u00cb\u00cd"+
		"\13\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cf\3\2\2\2"+
		"\u00ce\u00cc\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d3"+
		"\7\17\2\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2"+
		"\u00d4\u00d5\7\f\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\b\13\2\2\u00d7\26"+
		"\3\2\2\2\u00d8\u00da\t\3\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\b\f"+
		"\2\2\u00de\30\3\2\2\2\u00df\u00e0\7E\2\2\u00e0\u00e1\7Q\2\2\u00e1\u00e2"+
		"\7O\2\2\u00e2\u00e3\7O\2\2\u00e3\u00e4\7G\2\2\u00e4\u00e5\7P\2\2\u00e5"+
		"\u00e6\7E\2\2\u00e6\u00e7\7G\2\2\u00e7\u00e8\7T\2\2\u00e8\u00e9\7a\2\2"+
		"\u00e9\u00ea\7N\2\2\u00ea\u00eb\7C\2\2\u00eb\u00ec\7a\2\2\u00ec\u00ed"+
		"\7T\2\2\u00ed\u00ee\7G\2\2\u00ee\u00ef\7E\2\2\u00ef\u00f0\7G\2\2\u00f0"+
		"\u00f1\7V\2\2\u00f1\u00f2\7V\2\2\u00f2\u00f3\7G\2\2\u00f3\32\3\2\2\2\u00f4"+
		"\u00f5\7C\2\2\u00f5\u00f6\7E\2\2\u00f6\u00f7\7J\2\2\u00f7\u00f8\7G\2\2"+
		"\u00f8\u00f9\7X\2\2\u00f9\u00fa\7G\2\2\u00fa\u00fb\7O\2\2\u00fb\u00fc"+
		"\7G\2\2\u00fc\u00fd\7P\2\2\u00fd\u00fe\7V\2\2\u00fe\u00ff\7a\2\2\u00ff"+
		"\u0100\7T\2\2\u0100\u0101\7G\2\2\u0101\u0102\7E\2\2\u0102\u0103\7G\2\2"+
		"\u0103\u0104\7V\2\2\u0104\u0105\7V\2\2\u0105\u0106\7G\2\2\u0106\34\3\2"+
		"\2\2\u0107\u0108\7C\2\2\u0108\u0109\7W\2\2\u0109\u010a\7V\2\2\u010a\u010b"+
		"\7T\2\2\u010b\u010c\7G\2\2\u010c\36\3\2\2\2\u010d\u010e\7C\2\2\u010e\u010f"+
		"\7V\2\2\u010f\u0110\7V\2\2\u0110\u0111\7G\2\2\u0111\u0112\7P\2\2\u0112"+
		"\u0113\7F\2\2\u0113\u0114\7T\2\2\u0114\u0115\7G\2\2\u0115 \3\2\2\2\u0116"+
		"\u0117\7H\2\2\u0117\u0118\7C\2\2\u0118\u0119\7K\2\2\u0119\u011a\7T\2\2"+
		"\u011a\u011b\7G\2\2\u011b\"\3\2\2\2\u011c\u011d\7C\2\2\u011d\u011e\7T"+
		"\2\2\u011e\u011f\7T\2\2\u011f\u0120\7G\2\2\u0120\u0121\7V\2\2\u0121\u0122"+
		"\7G\2\2\u0122\u0123\7\\\2\2\u0123$\3\2\2\2\u0124\u0125\7T\2\2\u0125\u0126"+
		"\7G\2\2\u0126\u0127\7V\2\2\u0127\u0128\7Q\2\2\u0128\u0129\7W\2\2\u0129"+
		"\u012a\7T\2\2\u012a&\3\2\2\2\u012b\u012c\7U\2\2\u012c\u012d\7K\2\2\u012d"+
		"(\3\2\2\2\u012e\u012f\7Q\2\2\u012f\u0130\7P\2\2\u0130\u0131\7\\\2\2\u0131"+
		"\u014e\7\60\2\2\u0132\u0133\7i\2\2\u0133\u0134\7t\2\2\u0134\u014e\7\60"+
		"\2\2\u0135\u0136\7e\2\2\u0136\u0137\7e\2\2\u0137\u014e\7\60\2\2\u0138"+
		"\u0139\7v\2\2\u0139\u013a\7d\2\2\u013a\u013b\7u\2\2\u013b\u014e\7r\2\2"+
		"\u013c\u013d\7R\2\2\u013d\u013e\7K\2\2\u013e\u013f\7G\2\2\u013f\u0140"+
		"\7E\2\2\u0140\u0141\7G\2\2\u0141\u014e\7U\2\2\u0142\u0143\7i\2\2\u0143"+
		"\u0144\7t\2\2\u0144\u0145\7u\2\2\u0145\u014e\7\60\2\2\u0146\u0147\7c\2"+
		"\2\u0147\u0148\7a\2\2\u0148\u0149\7i\2\2\u0149\u014a\7w\2\2\u014a\u014b"+
		"\7u\2\2\u014b\u014c\7v\2\2\u014c\u014e\7q\2\2\u014d\u012e\3\2\2\2\u014d"+
		"\u0132\3\2\2\2\u014d\u0135\3\2\2\2\u014d\u0138\3\2\2\2\u014d\u013c\3\2"+
		"\2\2\u014d\u0142\3\2\2\2\u014d\u0146\3\2\2\2\u014e*\3\2\2\2\u014f\u0150"+
		"\7O\2\2\u0150\u0151\7G\2\2\u0151\u0152\7\\\2\2\u0152\u0153\7E\2\2\u0153"+
		"\u0154\7N\2\2\u0154\u0155\7C\2\2\u0155,\3\2\2\2\u0156\u0157\7E\2\2\u0157"+
		"\u0158\7Q\2\2\u0158\u0159\7P\2\2\u0159\u015a\7F\2\2\u015a\u015b\7K\2\2"+
		"\u015b\u015c\7O\2\2\u015c\u015d\7G\2\2\u015d\u015e\7P\2\2\u015e\u015f"+
		"\7V\2\2\u015f\u0160\7Q\2\2\u0160\u0161\7U\2\2\u0161.\3\2\2\2\u0162\u0163"+
		"\7E\2\2\u0163\u0164\7C\2\2\u0164\u0165\7T\2\2\u0165\u0166\7P\2\2\u0166"+
		"\u0167\7G\2\2\u0167\60\3\2\2\2\u0168\u0169\7X\2\2\u0169\u016a\7G\2\2\u016a"+
		"\u016b\7I\2\2\u016b\u016c\7G\2\2\u016c\u016d\7V\2\2\u016d\u016e\7C\2\2"+
		"\u016e\u016f\7N\2\2\u016f\62\3\2\2\2\u0170\u0171\7N\2\2\u0171\u0172\7"+
		"G\2\2\u0172\u0173\7I\2\2\u0173\u0174\7W\2\2\u0174\u0175\7O\2\2\u0175\u0176"+
		"\7D\2\2\u0176\u0177\7T\2\2\u0177\u0178\7G\2\2\u0178\64\3\2\2\2\u0179\u017a"+
		"\7R\2\2\u017a\u017b\7G\2\2\u017b\u017c\7U\2\2\u017c\u017d\7E\2\2\u017d"+
		"\u017e\7C\2\2\u017e\u017f\7F\2\2\u017f\u0180\7Q\2\2\u0180\66\3\2\2\2\u0181"+
		"\u0182\7N\2\2\u0182\u0183\7K\2\2\u0183\u0184\7S\2\2\u0184\u0185\7W\2\2"+
		"\u0185\u0186\7K\2\2\u0186\u0187\7F\2\2\u0187\u0188\7Q\2\2\u01888\3\2\2"+
		"\2\u0189\u018a\7N\2\2\u018a\u018b\7C\2\2\u018b\u018c\7E\2\2\u018c\u018d"+
		"\7V\2\2\u018d\u018e\7G\2\2\u018e\u018f\7Q\2\2\u018f:\3\2\2\2\u0190\u0191"+
		"\7E\2\2\u0191\u0192\7G\2\2\u0192\u0193\7T\2\2\u0193\u0194\7G\2\2\u0194"+
		"\u0195\7C\2\2\u0195\u0196\7N\2\2\u0196<\3\2\2\2\u0197\u0198\7T\2\2\u0198"+
		"\u0199\7G\2\2\u0199\u019a\7E\2\2\u019a\u019b\7K\2\2\u019b\u019c\7R\2\2"+
		"\u019c\u019d\7K\2\2\u019d\u019e\7G\2\2\u019e\u019f\7P\2\2\u019f\u01a0"+
		"\7V\2\2\u01a0\u01a1\7G\2\2\u01a1>\3\2\2\2\u01a2\u01a3\7E\2\2\u01a3\u01a4"+
		"\7Q\2\2\u01a4\u01a5\7T\2\2\u01a5\u01a6\7V\2\2\u01a6\u01a7\7G\2\2\u01a7"+
		"@\3\2\2\2\u01a8\u01a9\7J\2\2\u01a9\u01aa\7T\2\2\u01aa\u01b4\7U\2\2\u01ab"+
		"\u01b4\7U\2\2\u01ac\u01ad\7O\2\2\u01ad\u01ae\7K\2\2\u01ae\u01b4\7P\2\2"+
		"\u01af\u01b0\7F\2\2\u01b0\u01b1\7K\2\2\u01b1\u01b2\7C\2\2\u01b2\u01b4"+
		"\7U\2\2\u01b3\u01a8\3\2\2\2\u01b3\u01ab\3\2\2\2\u01b3\u01ac\3\2\2\2\u01b3"+
		"\u01af\3\2\2\2\u01b4B\3\2\2\2\u01b5\u01b6\7C\2\2\u01b6\u01b7\7R\2\2\u01b7"+
		"\u01b8\7C\2\2\u01b8\u01b9\7T\2\2\u01b9\u01ba\7C\2\2\u01ba\u01bb\7V\2\2"+
		"\u01bb\u01bc\7Q\2\2\u01bcD\3\2\2\2\u01bd\u01be\7R\2\2\u01be\u01bf\7G\2"+
		"\2\u01bf\u01c0\7T\2\2\u01c0\u01c1\7U\2\2\u01c1\u01c2\7Q\2\2\u01c2\u01c3"+
		"\7P\2\2\u01c3\u01cd\7C\2\2\u01c4\u01c5\7R\2\2\u01c5\u01c6\7G\2\2\u01c6"+
		"\u01c7\7T\2\2\u01c7\u01c8\7U\2\2\u01c8\u01c9\7Q\2\2\u01c9\u01ca\7P\2\2"+
		"\u01ca\u01cb\7C\2\2\u01cb\u01cd\7U\2\2\u01cc\u01bd\3\2\2\2\u01cc\u01c4"+
		"\3\2\2\2\u01cdF\3\2\2\2\u01ce\u01cf\7W\2\2\u01cf\u01d0\7V\2\2\u01d0\u01d1"+
		"\7G\2\2\u01d1\u01d2\7P\2\2\u01d2\u01d3\7E\2\2\u01d3\u01d4\7K\2\2\u01d4"+
		"\u01d5\7N\2\2\u01d5\u01d6\7K\2\2\u01d6\u01d7\7Q\2\2\u01d7H\3\2\2\2\u01d8"+
		"\u01d9\t\4\2\2\u01d9J\3\2\2\2\u01da\u01db\7V\2\2\u01db\u01dc\7G\2\2\u01dc"+
		"\u01dd\7O\2\2\u01dd\u01de\7R\2\2\u01de\u01df\7U\2\2\u01dfL\3\2\2\2\u01e0"+
		"\u01e1\7+\2\2\u01e1N\3\2\2\2\u01e2\u01e3\7*\2\2\u01e3P\3\2\2\2\u01e4\u01e5"+
		"\7.\2\2\u01e5R\3\2\2\2\u01e6\u01e7\7=\2\2\u01e7T\3\2\2\2\u01e8\u01e9\7"+
		"_\2\2\u01e9V\3\2\2\2\u01ea\u01eb\7]\2\2\u01ebX\3\2\2\2\u01ec\u01ed\7}"+
		"\2\2\u01edZ\3\2\2\2\u01ee\u01ef\7\177\2\2\u01ef\\\3\2\2\2\u01f0\u01f1"+
		"\7[\2\2\u01f1^\3\2\2\2\u01f2\u01f3\7Q\2\2\u01f3`\3\2\2\2\u01f4\u01f5\7"+
		"C\2\2\u01f5\u01f6\7I\2\2\u01f6\u01f7\7T\2\2\u01f7\u01f8\7G\2\2\u01f8\u01f9"+
		"\7I\2\2\u01f9\u01fa\7C\2\2\u01fa\u01fb\7T\2\2\u01fbb\3\2\2\2\u01fc\u01fd"+
		"\7S\2\2\u01fd\u01fe\7W\2\2\u01fe\u01ff\7K\2\2\u01ff\u0200\7V\2\2\u0200"+
		"\u0201\7C\2\2\u0201\u0202\7T\2\2\u0202d\3\2\2\2\u0203\u0204\7R\2\2\u0204"+
		"\u0205\7C\2\2\u0205\u0206\7T\2\2\u0206\u0207\7V\2\2\u0207\u0208\7K\2\2"+
		"\u0208\u0209\7T\2\2\u0209f\3\2\2\2\u020a\u020b\7R\2\2\u020b\u020c\7G\2"+
		"\2\u020c\u020d\7N\2\2\u020d\u020e\7C\2\2\u020e\u020f\7T\2\2\u020fh\3\2"+
		"\2\2\u0210\u0211\7G\2\2\u0211\u0212\7P\2\2\u0212\u0213\7E\2\2\u0213\u0214"+
		"\7G\2\2\u0214\u0215\7P\2\2\u0215\u0216\7F\2\2\u0216\u0217\7G\2\2\u0217"+
		"\u0218\7T\2\2\u0218j\3\2\2\2\u0219\u021a\7R\2\2\u021a\u021b\7T\2\2\u021b"+
		"\u021c\7G\2\2\u021c\u021d\7E\2\2\u021d\u021e\7C\2\2\u021e\u021f\7N\2\2"+
		"\u021f\u0220\7G\2\2\u0220\u0221\7P\2\2\u0221\u0222\7V\2\2\u0222\u0223"+
		"\7C\2\2\u0223\u0224\7T\2\2\u0224l\3\2\2\2\u0225\u0226\7J\2\2\u0226\u0227"+
		"\7G\2\2\u0227\u0228\7T\2\2\u0228\u0229\7X\2\2\u0229\u022a\7K\2\2\u022a"+
		"\u022b\7T\2\2\u022bn\3\2\2\2\u022c\u022d\7O\2\2\u022d\u022e\7C\2\2\u022e"+
		"\u022f\7E\2\2\u022f\u0230\7G\2\2\u0230\u0231\7T\2\2\u0231\u0232\7C\2\2"+
		"\u0232\u0233\7T\2\2\u0233p\3\2\2\2\u0234\u0235\7C\2\2\u0235\u0236\7O\2"+
		"\2\u0236\u0237\7C\2\2\u0237\u0238\7U\2\2\u0238\u0239\7C\2\2\u0239\u023a"+
		"\7T\2\2\u023ar\3\2\2\2\u023b\u023c\7O\2\2\u023c\u023d\7G\2\2\u023d\u023e"+
		"\7\\\2\2\u023e\u023f\7E\2\2\u023f\u0240\7N\2\2\u0240\u0241\7C\2\2\u0241"+
		"\u0242\7T\2\2\u0242t\3\2\2\2\u0243\u0244\7O\2\2\u0244\u0245\7Q\2\2\u0245"+
		"\u0246\7N\2\2\u0246\u0247\7G\2\2\u0247\u0248\7T\2\2\u0248v\3\2\2\2\u0249"+
		"\u024a\7U\2\2\u024a\u024b\7G\2\2\u024b\u024c\7T\2\2\u024c\u024d\7X\2\2"+
		"\u024d\u024e\7K\2\2\u024e\u024f\7T\2\2\u024fx\3\2\2\2\u0250\u0251\7W\2"+
		"\2\u0251\u0252\7P\2\2\u0252\u0253\7V\2\2\u0253\u0254\7C\2\2\u0254\u025e"+
		"\7T\2\2\u0255\u0256\7G\2\2\u0256\u0257\7P\2\2\u0257\u0258\7I\2\2\u0258"+
		"\u0259\7T\2\2\u0259\u025a\7C\2\2\u025a\u025b\7U\2\2\u025b\u025c\7C\2\2"+
		"\u025c\u025e\7T\2\2\u025d\u0250\3\2\2\2\u025d\u0255\3\2\2\2\u025ez\3\2"+
		"\2\2\u025f\u0260\7G\2\2\u0260\u0261\7O\2\2\u0261\u0262\7R\2\2\u0262\u0263"+
		"\7C\2\2\u0263\u0264\7P\2\2\u0264\u0265\7K\2\2\u0265\u0266\7\\\2\2\u0266"+
		"\u0267\7C\2\2\u0267\u0268\7T\2\2\u0268|\3\2\2\2\u0269\u026a\7T\2\2\u026a"+
		"\u026b\7C\2\2\u026b\u026c\7N\2\2\u026c\u026d\7N\2\2\u026d\u026e\7C\2\2"+
		"\u026e\u026f\7T\2\2\u026f~\3\2\2\2\u0270\u0271\7E\2\2\u0271\u0272\7Q\2"+
		"\2\u0272\u0273\7T\2\2\u0273\u0274\7V\2\2\u0274\u0275\7C\2\2\u0275\u0276"+
		"\7T\2\2\u0276\u0080\3\2\2\2\u0277\u0278\7F\2\2\u0278\u0279\7W\2\2\u0279"+
		"\u027a\7G\2\2\u027a\u027b\7N\2\2\u027b\u027c\7Q\2\2\u027c\u027d\7/\2\2"+
		"\u027d\u027e\7C\2\2\u027e\u027f\7/\2\2\u027f\u0280\7O\2\2\u0280\u0281"+
		"\7W\2\2\u0281\u0282\7G\2\2\u0282\u0283\7T\2\2\u0283\u0284\7V\2\2\u0284"+
		"\u0285\7G\2\2\u0285\u0286\7/\2\2\u0286\u0287\7E\2\2\u0287\u0288\7Q\2\2"+
		"\u0288\u0289\7P\2\2\u0289\u028a\7/\2\2\u028a\u028b\7E\2\2\u028b\u028c"+
		"\7W\2\2\u028c\u028d\7E\2\2\u028d\u028e\7J\2\2\u028e\u028f\7K\2\2\u028f"+
		"\u0290\7N\2\2\u0290\u0291\7N\2\2\u0291\u0292\7Q\2\2\u0292\u0293\7U\2\2"+
		"\u0293\u0082\3\2\2\2\u0294\u0295\7?\2\2\u0295\u0084\3\2\2\2\u0296\u0297"+
		"\7P\2\2\u0297\u0298\7Q\2\2\u0298\u0299\7R\2\2\u0299\u029a\7G\2\2\u029a"+
		"\u0086\3\2\2\2\u029b\u029c\7@\2\2\u029c\u0088\3\2\2\2\u029d\u029e\7>\2"+
		"\2\u029e\u008a\3\2\2\2\u029f\u02a0\7@\2\2\u02a0\u02a1\7?\2\2\u02a1\u008c"+
		"\3\2\2\2\u02a2\u02a3\7>\2\2\u02a3\u02a4\7?\2\2\u02a4\u008e\3\2\2\2\u02a5"+
		"\u02a6\7&\2\2\u02a6\u0090\3\2\2\2\u02a7\u02a9\t\5\2\2\u02a8\u02a7\3\2"+
		"\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab"+
		"\u0092\3\2\2\2\21\2\u00ac\u00b2\u00b7\u00ba\u00bf\u00c5\u00ce\u00d2\u00db"+
		"\u014d\u01b3\u01cc\u025d\u02aa\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}