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
		CONDIMENTO_TYPE=16, CARNE_TYPE=17, VEGETAL_TYPE=18, LEGUMBRE_TYPE=19, 
		PESCADO_TYPE=20, LIQUID_TYPE=21, LACTEO_TYPE=22, CEREAL_TYPE=23, RECIPIENTE_TYPE=24, 
		CORTE_TYPE=25, MEDIDAS_TIEMPO=26, APARATO_TYPE=27, PORCION_TYPE=28, UTENCILIO_TYPE=29, 
		MEDIDA_TEMPERATURA=30, TIEMPODECLARACION=31, CUCHILLO=32, ESCRIBIR=33, 
		LEER=34, PAR_DE=35, PAR_IZ=36, COMA=37, PTOCOMA=38, CORDER=39, CORIZQ=40, 
		LLAVEIZQ=41, LLAVEDER=42, AND=43, OR=44, MAS=45, MENOS=46, PARTIR=47, 
		PELAR=48, ENCENDER=49, PREHOT=50, HERVIR=51, MACERAR=52, AMASAR=53, GIRO=54, 
		MOLER=55, SERVIR=56, UNTAR=57, EMPANIZAR=58, RALLAR=59, CORTAR=60, DUELO_A_MUERTE_CON_CUCHILLOS=61, 
		IGUALAR=62, DISTINGUIR=63, MAYOR=64, MENOR=65, MAYEQ=66, MENEQ=67, NOMBREVAR=68, 
		PALABRA=69;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"COCIDO", "CRUDO", "HERVIDO", "NAT", "PUNTO", "FLOAT", "NUMERO", "ESTADO", 
		"STRING", "COMMENT", "WS", "PREPARARINGREDIENTES", "FINCOCINA", "SINO", 
		"WAITING", "DO", "STOP", "ENDWAIT", "SI", "MEDICION", "CONDIMENTO_TYPE", 
		"CARNE_TYPE", "VEGETAL_TYPE", "LEGUMBRE_TYPE", "PESCADO_TYPE", "LIQUID_TYPE", 
		"LACTEO_TYPE", "CEREAL_TYPE", "RECIPIENTE_TYPE", "CORTE_TYPE", "MEDIDAS_TIEMPO", 
		"APARATO_TYPE", "PORCION_TYPE", "UTENCILIO_TYPE", "MEDIDA_TEMPERATURA", 
		"TIEMPODECLARACION", "CUCHILLO", "ESCRIBIR", "LEER", "PAR_DE", "PAR_IZ", 
		"COMA", "PTOCOMA", "CORDER", "CORIZQ", "LLAVEIZQ", "LLAVEDER", "AND", 
		"OR", "MAS", "MENOS", "PARTIR", "PELAR", "ENCENDER", "PREHOT", "HERVIR", 
		"MACERAR", "AMASAR", "GIRO", "MOLER", "SERVIR", "UNTAR", "EMPANIZAR", 
		"RALLAR", "CORTAR", "DUELO_A_MUERTE_CON_CUCHILLOS", "IGUALAR", "DISTINGUIR", 
		"MAYOR", "MENOR", "MAYEQ", "MENEQ", "NOMBREVAR", "PALABRA"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'COMMENCER_LA_RECETTE'", "'ACHEVEMENT_RECETTE'", 
		"'AUTRE'", "'ATTENDRE'", "'FAIRE'", "'ARRETEZ'", "'RETOUR'", "'SI'", null, 
		"'CONDIMENTOS'", "'CARNE'", "'VEGETAL'", "'LEGUMBRE'", "'PESCADO'", "'LIQUIDO'", 
		"'LACTEO'", "'CEREAL'", "'RECIPIENTE'", "'CORTE'", null, "'APARATO'", 
		null, "'UTENCILIO'", null, "'TEMPS'", null, "'ANOTAR'", "'INGRESE'", "')'", 
		"'('", "','", "';'", "']'", "'['", "'{'", "'}'", "'Y'", "'O'", "'AGREGAR'", 
		"'QUITAR'", "'PARTIR'", "'PELAR'", "'ENCENDER'", "'PRECALENTAR'", "'HERVIR'", 
		"'MACERAR'", "'AMASAR'", "'MEZCLAR'", "'MOLER'", "'SERVIR'", null, "'EMPANIZAR'", 
		"'RALLAR'", "'CORTAR'", "'�DUELO-A-MUERTE-CON-CUCHILLOS?'", "'='", "'!='", 
		"'>'", "'<'", "'>='", "'<='", "'$'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "FLOAT", "NUMERO", "ESTADO", "STRING", "COMMENT", "WS", "PREPARARINGREDIENTES", 
		"FINCOCINA", "SINO", "WAITING", "DO", "STOP", "ENDWAIT", "SI", "MEDICION", 
		"CONDIMENTO_TYPE", "CARNE_TYPE", "VEGETAL_TYPE", "LEGUMBRE_TYPE", "PESCADO_TYPE", 
		"LIQUID_TYPE", "LACTEO_TYPE", "CEREAL_TYPE", "RECIPIENTE_TYPE", "CORTE_TYPE", 
		"MEDIDAS_TIEMPO", "APARATO_TYPE", "PORCION_TYPE", "UTENCILIO_TYPE", "MEDIDA_TEMPERATURA", 
		"TIEMPODECLARACION", "CUCHILLO", "ESCRIBIR", "LEER", "PAR_DE", "PAR_IZ", 
		"COMA", "PTOCOMA", "CORDER", "CORIZQ", "LLAVEIZQ", "LLAVEDER", "AND", 
		"OR", "MAS", "MENOS", "PARTIR", "PELAR", "ENCENDER", "PREHOT", "HERVIR", 
		"MACERAR", "AMASAR", "GIRO", "MOLER", "SERVIR", "UNTAR", "EMPANIZAR", 
		"RALLAR", "CORTAR", "DUELO_A_MUERTE_CON_CUCHILLOS", "IGUALAR", "DISTINGUIR", 
		"MAYOR", "MENOR", "MAYEQ", "MENEQ", "NOMBREVAR", "PALABRA"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2G\u02be\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\6\7\u00af\n\7\r\7\16\7\u00b0\3"+
		"\7\3\7\6\7\u00b5\n\7\r\7\16\7\u00b6\3\b\6\b\u00ba\n\b\r\b\16\b\u00bb\3"+
		"\b\5\b\u00bf\n\b\3\t\3\t\3\t\5\t\u00c4\n\t\3\n\3\n\7\n\u00c8\n\n\f\n\16"+
		"\n\u00cb\13\n\3\n\3\n\3\13\3\13\7\13\u00d1\n\13\f\13\16\13\u00d4\13\13"+
		"\3\13\5\13\u00d7\n\13\3\13\3\13\3\13\3\13\3\f\6\f\u00de\n\f\r\f\16\f\u00df"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0152\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \5 \u01b1\n \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01ca\n\"\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\5$\u01da\n$\3%\3%\3%\3%\3%\3%\3&\3&"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3*\3*\3+\3"+
		"+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\38\38\38\38\39"+
		"\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3<\3<"+
		"\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?"+
		"\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u0270\n?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@"+
		"\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C"+
		"\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3D"+
		"\3D\3E\3E\3E\3F\3F\3G\3G\3H\3H\3H\3I\3I\3I\3J\3J\3K\6K\u02bb\nK\rK\16"+
		"K\u02bc\4\u00c9\u00d2\2L\3\2\5\2\7\2\t\2\13\2\r\3\17\4\21\5\23\6\25\7"+
		"\27\b\31\t\33\n\35\13\37\f!\r#\16%\17\'\20)\21+\22-\23/\24\61\25\63\26"+
		"\65\27\67\309\31;\32=\33?\34A\35C\36E\37G I!K\"M#O$Q%S&U\'W(Y)[*]+_,a"+
		"-c.e/g\60i\61k\62m\63o\64q\65s\66u\67w8y9{:};\177<\u0081=\u0083>\u0085"+
		"?\u0087@\u0089A\u008bB\u008dC\u008fD\u0091E\u0093F\u0095G\3\2\5\3\2\62"+
		";\5\2\13\f\17\17\"\"\4\2C\\c|\u02cf\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2"+
		"s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\3\u0097\3\2\2\2\5\u009c\3\2\2"+
		"\2\7\u00a1\3\2\2\2\t\u00a9\3\2\2\2\13\u00ab\3\2\2\2\r\u00ae\3\2\2\2\17"+
		"\u00be\3\2\2\2\21\u00c3\3\2\2\2\23\u00c5\3\2\2\2\25\u00ce\3\2\2\2\27\u00dd"+
		"\3\2\2\2\31\u00e3\3\2\2\2\33\u00f8\3\2\2\2\35\u010b\3\2\2\2\37\u0111\3"+
		"\2\2\2!\u011a\3\2\2\2#\u0120\3\2\2\2%\u0128\3\2\2\2\'\u012f\3\2\2\2)\u0151"+
		"\3\2\2\2+\u0153\3\2\2\2-\u015f\3\2\2\2/\u0165\3\2\2\2\61\u016d\3\2\2\2"+
		"\63\u0176\3\2\2\2\65\u017e\3\2\2\2\67\u0186\3\2\2\29\u018d\3\2\2\2;\u0194"+
		"\3\2\2\2=\u019f\3\2\2\2?\u01b0\3\2\2\2A\u01b2\3\2\2\2C\u01c9\3\2\2\2E"+
		"\u01cb\3\2\2\2G\u01d9\3\2\2\2I\u01db\3\2\2\2K\u01e1\3\2\2\2M\u01e3\3\2"+
		"\2\2O\u01ea\3\2\2\2Q\u01f2\3\2\2\2S\u01f4\3\2\2\2U\u01f6\3\2\2\2W\u01f8"+
		"\3\2\2\2Y\u01fa\3\2\2\2[\u01fc\3\2\2\2]\u01fe\3\2\2\2_\u0200\3\2\2\2a"+
		"\u0202\3\2\2\2c\u0204\3\2\2\2e\u0206\3\2\2\2g\u020e\3\2\2\2i\u0215\3\2"+
		"\2\2k\u021c\3\2\2\2m\u0222\3\2\2\2o\u022b\3\2\2\2q\u0237\3\2\2\2s\u023e"+
		"\3\2\2\2u\u0246\3\2\2\2w\u024d\3\2\2\2y\u0255\3\2\2\2{\u025b\3\2\2\2}"+
		"\u026f\3\2\2\2\177\u0271\3\2\2\2\u0081\u027b\3\2\2\2\u0083\u0282\3\2\2"+
		"\2\u0085\u0289\3\2\2\2\u0087\u02a8\3\2\2\2\u0089\u02aa\3\2\2\2\u008b\u02ad"+
		"\3\2\2\2\u008d\u02af\3\2\2\2\u008f\u02b1\3\2\2\2\u0091\u02b4\3\2\2\2\u0093"+
		"\u02b7\3\2\2\2\u0095\u02ba\3\2\2\2\u0097\u0098\7E\2\2\u0098\u0099\7W\2"+
		"\2\u0099\u009a\7K\2\2\u009a\u009b\7V\2\2\u009b\4\3\2\2\2\u009c\u009d\7"+
		"D\2\2\u009d\u009e\7T\2\2\u009e\u009f\7W\2\2\u009f\u00a0\7V\2\2\u00a0\6"+
		"\3\2\2\2\u00a1\u00a2\7D\2\2\u00a2\u00a3\7Q\2\2\u00a3\u00a4\7W\2\2\u00a4"+
		"\u00a5\7K\2\2\u00a5\u00a6\7N\2\2\u00a6\u00a7\7N\2\2\u00a7\u00a8\7G\2\2"+
		"\u00a8\b\3\2\2\2\u00a9\u00aa\t\2\2\2\u00aa\n\3\2\2\2\u00ab\u00ac\7\60"+
		"\2\2\u00ac\f\3\2\2\2\u00ad\u00af\5\t\5\2\u00ae\u00ad\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b4\5\13\6\2\u00b3\u00b5\5\t\5\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3"+
		"\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\16\3\2\2\2\u00b8"+
		"\u00ba\5\t\5\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bf\5\r\7\2\u00be"+
		"\u00b9\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\20\3\2\2\2\u00c0\u00c4\5\3\2"+
		"\2\u00c1\u00c4\5\5\3\2\u00c2\u00c4\5\7\4\2\u00c3\u00c0\3\2\2\2\u00c3\u00c1"+
		"\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\22\3\2\2\2\u00c5\u00c9\7$\2\2\u00c6"+
		"\u00c8\13\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00ca\3"+
		"\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00cd\7$\2\2\u00cd\24\3\2\2\2\u00ce\u00d2\7#\2\2\u00cf\u00d1\13\2\2\2"+
		"\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d2\u00d0"+
		"\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d7\7\17\2\2"+
		"\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9"+
		"\7\f\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\b\13\2\2\u00db\26\3\2\2\2\u00dc"+
		"\u00de\t\3\2\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2"+
		"\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\b\f\2\2\u00e2"+
		"\30\3\2\2\2\u00e3\u00e4\7E\2\2\u00e4\u00e5\7Q\2\2\u00e5\u00e6\7O\2\2\u00e6"+
		"\u00e7\7O\2\2\u00e7\u00e8\7G\2\2\u00e8\u00e9\7P\2\2\u00e9\u00ea\7E\2\2"+
		"\u00ea\u00eb\7G\2\2\u00eb\u00ec\7T\2\2\u00ec\u00ed\7a\2\2\u00ed\u00ee"+
		"\7N\2\2\u00ee\u00ef\7C\2\2\u00ef\u00f0\7a\2\2\u00f0\u00f1\7T\2\2\u00f1"+
		"\u00f2\7G\2\2\u00f2\u00f3\7E\2\2\u00f3\u00f4\7G\2\2\u00f4\u00f5\7V\2\2"+
		"\u00f5\u00f6\7V\2\2\u00f6\u00f7\7G\2\2\u00f7\32\3\2\2\2\u00f8\u00f9\7"+
		"C\2\2\u00f9\u00fa\7E\2\2\u00fa\u00fb\7J\2\2\u00fb\u00fc\7G\2\2\u00fc\u00fd"+
		"\7X\2\2\u00fd\u00fe\7G\2\2\u00fe\u00ff\7O\2\2\u00ff\u0100\7G\2\2\u0100"+
		"\u0101\7P\2\2\u0101\u0102\7V\2\2\u0102\u0103\7a\2\2\u0103\u0104\7T\2\2"+
		"\u0104\u0105\7G\2\2\u0105\u0106\7E\2\2\u0106\u0107\7G\2\2\u0107\u0108"+
		"\7V\2\2\u0108\u0109\7V\2\2\u0109\u010a\7G\2\2\u010a\34\3\2\2\2\u010b\u010c"+
		"\7C\2\2\u010c\u010d\7W\2\2\u010d\u010e\7V\2\2\u010e\u010f\7T\2\2\u010f"+
		"\u0110\7G\2\2\u0110\36\3\2\2\2\u0111\u0112\7C\2\2\u0112\u0113\7V\2\2\u0113"+
		"\u0114\7V\2\2\u0114\u0115\7G\2\2\u0115\u0116\7P\2\2\u0116\u0117\7F\2\2"+
		"\u0117\u0118\7T\2\2\u0118\u0119\7G\2\2\u0119 \3\2\2\2\u011a\u011b\7H\2"+
		"\2\u011b\u011c\7C\2\2\u011c\u011d\7K\2\2\u011d\u011e\7T\2\2\u011e\u011f"+
		"\7G\2\2\u011f\"\3\2\2\2\u0120\u0121\7C\2\2\u0121\u0122\7T\2\2\u0122\u0123"+
		"\7T\2\2\u0123\u0124\7G\2\2\u0124\u0125\7V\2\2\u0125\u0126\7G\2\2\u0126"+
		"\u0127\7\\\2\2\u0127$\3\2\2\2\u0128\u0129\7T\2\2\u0129\u012a\7G\2\2\u012a"+
		"\u012b\7V\2\2\u012b\u012c\7Q\2\2\u012c\u012d\7W\2\2\u012d\u012e\7T\2\2"+
		"\u012e&\3\2\2\2\u012f\u0130\7U\2\2\u0130\u0131\7K\2\2\u0131(\3\2\2\2\u0132"+
		"\u0133\7Q\2\2\u0133\u0134\7P\2\2\u0134\u0135\7\\\2\2\u0135\u0152\7\60"+
		"\2\2\u0136\u0137\7i\2\2\u0137\u0138\7t\2\2\u0138\u0152\7\60\2\2\u0139"+
		"\u013a\7e\2\2\u013a\u013b\7e\2\2\u013b\u0152\7\60\2\2\u013c\u013d\7v\2"+
		"\2\u013d\u013e\7d\2\2\u013e\u013f\7u\2\2\u013f\u0152\7r\2\2\u0140\u0141"+
		"\7R\2\2\u0141\u0142\7K\2\2\u0142\u0143\7G\2\2\u0143\u0144\7E\2\2\u0144"+
		"\u0145\7G\2\2\u0145\u0152\7U\2\2\u0146\u0147\7i\2\2\u0147\u0148\7t\2\2"+
		"\u0148\u0149\7u\2\2\u0149\u0152\7\60\2\2\u014a\u014b\7c\2\2\u014b\u014c"+
		"\7a\2\2\u014c\u014d\7i\2\2\u014d\u014e\7w\2\2\u014e\u014f\7u\2\2\u014f"+
		"\u0150\7v\2\2\u0150\u0152\7q\2\2\u0151\u0132\3\2\2\2\u0151\u0136\3\2\2"+
		"\2\u0151\u0139\3\2\2\2\u0151\u013c\3\2\2\2\u0151\u0140\3\2\2\2\u0151\u0146"+
		"\3\2\2\2\u0151\u014a\3\2\2\2\u0152*\3\2\2\2\u0153\u0154\7E\2\2\u0154\u0155"+
		"\7Q\2\2\u0155\u0156\7P\2\2\u0156\u0157\7F\2\2\u0157\u0158\7K\2\2\u0158"+
		"\u0159\7O\2\2\u0159\u015a\7G\2\2\u015a\u015b\7P\2\2\u015b\u015c\7V\2\2"+
		"\u015c\u015d\7Q\2\2\u015d\u015e\7U\2\2\u015e,\3\2\2\2\u015f\u0160\7E\2"+
		"\2\u0160\u0161\7C\2\2\u0161\u0162\7T\2\2\u0162\u0163\7P\2\2\u0163\u0164"+
		"\7G\2\2\u0164.\3\2\2\2\u0165\u0166\7X\2\2\u0166\u0167\7G\2\2\u0167\u0168"+
		"\7I\2\2\u0168\u0169\7G\2\2\u0169\u016a\7V\2\2\u016a\u016b\7C\2\2\u016b"+
		"\u016c\7N\2\2\u016c\60\3\2\2\2\u016d\u016e\7N\2\2\u016e\u016f\7G\2\2\u016f"+
		"\u0170\7I\2\2\u0170\u0171\7W\2\2\u0171\u0172\7O\2\2\u0172\u0173\7D\2\2"+
		"\u0173\u0174\7T\2\2\u0174\u0175\7G\2\2\u0175\62\3\2\2\2\u0176\u0177\7"+
		"R\2\2\u0177\u0178\7G\2\2\u0178\u0179\7U\2\2\u0179\u017a\7E\2\2\u017a\u017b"+
		"\7C\2\2\u017b\u017c\7F\2\2\u017c\u017d\7Q\2\2\u017d\64\3\2\2\2\u017e\u017f"+
		"\7N\2\2\u017f\u0180\7K\2\2\u0180\u0181\7S\2\2\u0181\u0182\7W\2\2\u0182"+
		"\u0183\7K\2\2\u0183\u0184\7F\2\2\u0184\u0185\7Q\2\2\u0185\66\3\2\2\2\u0186"+
		"\u0187\7N\2\2\u0187\u0188\7C\2\2\u0188\u0189\7E\2\2\u0189\u018a\7V\2\2"+
		"\u018a\u018b\7G\2\2\u018b\u018c\7Q\2\2\u018c8\3\2\2\2\u018d\u018e\7E\2"+
		"\2\u018e\u018f\7G\2\2\u018f\u0190\7T\2\2\u0190\u0191\7G\2\2\u0191\u0192"+
		"\7C\2\2\u0192\u0193\7N\2\2\u0193:\3\2\2\2\u0194\u0195\7T\2\2\u0195\u0196"+
		"\7G\2\2\u0196\u0197\7E\2\2\u0197\u0198\7K\2\2\u0198\u0199\7R\2\2\u0199"+
		"\u019a\7K\2\2\u019a\u019b\7G\2\2\u019b\u019c\7P\2\2\u019c\u019d\7V\2\2"+
		"\u019d\u019e\7G\2\2\u019e<\3\2\2\2\u019f\u01a0\7E\2\2\u01a0\u01a1\7Q\2"+
		"\2\u01a1\u01a2\7T\2\2\u01a2\u01a3\7V\2\2\u01a3\u01a4\7G\2\2\u01a4>\3\2"+
		"\2\2\u01a5\u01a6\7J\2\2\u01a6\u01a7\7T\2\2\u01a7\u01b1\7U\2\2\u01a8\u01b1"+
		"\7U\2\2\u01a9\u01aa\7O\2\2\u01aa\u01ab\7K\2\2\u01ab\u01b1\7P\2\2\u01ac"+
		"\u01ad\7F\2\2\u01ad\u01ae\7K\2\2\u01ae\u01af\7C\2\2\u01af\u01b1\7U\2\2"+
		"\u01b0\u01a5\3\2\2\2\u01b0\u01a8\3\2\2\2\u01b0\u01a9\3\2\2\2\u01b0\u01ac"+
		"\3\2\2\2\u01b1@\3\2\2\2\u01b2\u01b3\7C\2\2\u01b3\u01b4\7R\2\2\u01b4\u01b5"+
		"\7C\2\2\u01b5\u01b6\7T\2\2\u01b6\u01b7\7C\2\2\u01b7\u01b8\7V\2\2\u01b8"+
		"\u01b9\7Q\2\2\u01b9B\3\2\2\2\u01ba\u01bb\7R\2\2\u01bb\u01bc\7G\2\2\u01bc"+
		"\u01bd\7T\2\2\u01bd\u01be\7U\2\2\u01be\u01bf\7Q\2\2\u01bf\u01c0\7P\2\2"+
		"\u01c0\u01ca\7C\2\2\u01c1\u01c2\7R\2\2\u01c2\u01c3\7G\2\2\u01c3\u01c4"+
		"\7T\2\2\u01c4\u01c5\7U\2\2\u01c5\u01c6\7Q\2\2\u01c6\u01c7\7P\2\2\u01c7"+
		"\u01c8\7C\2\2\u01c8\u01ca\7U\2\2\u01c9\u01ba\3\2\2\2\u01c9\u01c1\3\2\2"+
		"\2\u01caD\3\2\2\2\u01cb\u01cc\7W\2\2\u01cc\u01cd\7V\2\2\u01cd\u01ce\7"+
		"G\2\2\u01ce\u01cf\7P\2\2\u01cf\u01d0\7E\2\2\u01d0\u01d1\7K\2\2\u01d1\u01d2"+
		"\7N\2\2\u01d2\u01d3\7K\2\2\u01d3\u01d4\7Q\2\2\u01d4F\3\2\2\2\u01d5\u01d6"+
		"\7\uffff\2\2\u01d6\u01da\7E\2\2\u01d7\u01d8\7\uffff\2\2\u01d8\u01da\7"+
		"H\2\2\u01d9\u01d5\3\2\2\2\u01d9\u01d7\3\2\2\2\u01daH\3\2\2\2\u01db\u01dc"+
		"\7V\2\2\u01dc\u01dd\7G\2\2\u01dd\u01de\7O\2\2\u01de\u01df\7R\2\2\u01df"+
		"\u01e0\7U\2\2\u01e0J\3\2\2\2\u01e1\u01e2\5E#\2\u01e2L\3\2\2\2\u01e3\u01e4"+
		"\7C\2\2\u01e4\u01e5\7P\2\2\u01e5\u01e6\7Q\2\2\u01e6\u01e7\7V\2\2\u01e7"+
		"\u01e8\7C\2\2\u01e8\u01e9\7T\2\2\u01e9N\3\2\2\2\u01ea\u01eb\7K\2\2\u01eb"+
		"\u01ec\7P\2\2\u01ec\u01ed\7I\2\2\u01ed\u01ee\7T\2\2\u01ee\u01ef\7G\2\2"+
		"\u01ef\u01f0\7U\2\2\u01f0\u01f1\7G\2\2\u01f1P\3\2\2\2\u01f2\u01f3\7+\2"+
		"\2\u01f3R\3\2\2\2\u01f4\u01f5\7*\2\2\u01f5T\3\2\2\2\u01f6\u01f7\7.\2\2"+
		"\u01f7V\3\2\2\2\u01f8\u01f9\7=\2\2\u01f9X\3\2\2\2\u01fa\u01fb\7_\2\2\u01fb"+
		"Z\3\2\2\2\u01fc\u01fd\7]\2\2\u01fd\\\3\2\2\2\u01fe\u01ff\7}\2\2\u01ff"+
		"^\3\2\2\2\u0200\u0201\7\177\2\2\u0201`\3\2\2\2\u0202\u0203\7[\2\2\u0203"+
		"b\3\2\2\2\u0204\u0205\7Q\2\2\u0205d\3\2\2\2\u0206\u0207\7C\2\2\u0207\u0208"+
		"\7I\2\2\u0208\u0209\7T\2\2\u0209\u020a\7G\2\2\u020a\u020b\7I\2\2\u020b"+
		"\u020c\7C\2\2\u020c\u020d\7T\2\2\u020df\3\2\2\2\u020e\u020f\7S\2\2\u020f"+
		"\u0210\7W\2\2\u0210\u0211\7K\2\2\u0211\u0212\7V\2\2\u0212\u0213\7C\2\2"+
		"\u0213\u0214\7T\2\2\u0214h\3\2\2\2\u0215\u0216\7R\2\2\u0216\u0217\7C\2"+
		"\2\u0217\u0218\7T\2\2\u0218\u0219\7V\2\2\u0219\u021a\7K\2\2\u021a\u021b"+
		"\7T\2\2\u021bj\3\2\2\2\u021c\u021d\7R\2\2\u021d\u021e\7G\2\2\u021e\u021f"+
		"\7N\2\2\u021f\u0220\7C\2\2\u0220\u0221\7T\2\2\u0221l\3\2\2\2\u0222\u0223"+
		"\7G\2\2\u0223\u0224\7P\2\2\u0224\u0225\7E\2\2\u0225\u0226\7G\2\2\u0226"+
		"\u0227\7P\2\2\u0227\u0228\7F\2\2\u0228\u0229\7G\2\2\u0229\u022a\7T\2\2"+
		"\u022an\3\2\2\2\u022b\u022c\7R\2\2\u022c\u022d\7T\2\2\u022d\u022e\7G\2"+
		"\2\u022e\u022f\7E\2\2\u022f\u0230\7C\2\2\u0230\u0231\7N\2\2\u0231\u0232"+
		"\7G\2\2\u0232\u0233\7P\2\2\u0233\u0234\7V\2\2\u0234\u0235\7C\2\2\u0235"+
		"\u0236\7T\2\2\u0236p\3\2\2\2\u0237\u0238\7J\2\2\u0238\u0239\7G\2\2\u0239"+
		"\u023a\7T\2\2\u023a\u023b\7X\2\2\u023b\u023c\7K\2\2\u023c\u023d\7T\2\2"+
		"\u023dr\3\2\2\2\u023e\u023f\7O\2\2\u023f\u0240\7C\2\2\u0240\u0241\7E\2"+
		"\2\u0241\u0242\7G\2\2\u0242\u0243\7T\2\2\u0243\u0244\7C\2\2\u0244\u0245"+
		"\7T\2\2\u0245t\3\2\2\2\u0246\u0247\7C\2\2\u0247\u0248\7O\2\2\u0248\u0249"+
		"\7C\2\2\u0249\u024a\7U\2\2\u024a\u024b\7C\2\2\u024b\u024c\7T\2\2\u024c"+
		"v\3\2\2\2\u024d\u024e\7O\2\2\u024e\u024f\7G\2\2\u024f\u0250\7\\\2\2\u0250"+
		"\u0251\7E\2\2\u0251\u0252\7N\2\2\u0252\u0253\7C\2\2\u0253\u0254\7T\2\2"+
		"\u0254x\3\2\2\2\u0255\u0256\7O\2\2\u0256\u0257\7Q\2\2\u0257\u0258\7N\2"+
		"\2\u0258\u0259\7G\2\2\u0259\u025a\7T\2\2\u025az\3\2\2\2\u025b\u025c\7"+
		"U\2\2\u025c\u025d\7G\2\2\u025d\u025e\7T\2\2\u025e\u025f\7X\2\2\u025f\u0260"+
		"\7K\2\2\u0260\u0261\7T\2\2\u0261|\3\2\2\2\u0262\u0263\7W\2\2\u0263\u0264"+
		"\7P\2\2\u0264\u0265\7V\2\2\u0265\u0266\7C\2\2\u0266\u0270\7T\2\2\u0267"+
		"\u0268\7G\2\2\u0268\u0269\7P\2\2\u0269\u026a\7I\2\2\u026a\u026b\7T\2\2"+
		"\u026b\u026c\7C\2\2\u026c\u026d\7U\2\2\u026d\u026e\7C\2\2\u026e\u0270"+
		"\7T\2\2\u026f\u0262\3\2\2\2\u026f\u0267\3\2\2\2\u0270~\3\2\2\2\u0271\u0272"+
		"\7G\2\2\u0272\u0273\7O\2\2\u0273\u0274\7R\2\2\u0274\u0275\7C\2\2\u0275"+
		"\u0276\7P\2\2\u0276\u0277\7K\2\2\u0277\u0278\7\\\2\2\u0278\u0279\7C\2"+
		"\2\u0279\u027a\7T\2\2\u027a\u0080\3\2\2\2\u027b\u027c\7T\2\2\u027c\u027d"+
		"\7C\2\2\u027d\u027e\7N\2\2\u027e\u027f\7N\2\2\u027f\u0280\7C\2\2\u0280"+
		"\u0281\7T\2\2\u0281\u0082\3\2\2\2\u0282\u0283\7E\2\2\u0283\u0284\7Q\2"+
		"\2\u0284\u0285\7T\2\2\u0285\u0286\7V\2\2\u0286\u0287\7C\2\2\u0287\u0288"+
		"\7T\2\2\u0288\u0084\3\2\2\2\u0289\u028a\7\uffff\2\2\u028a\u028b\7F\2\2"+
		"\u028b\u028c\7W\2\2\u028c\u028d\7G\2\2\u028d\u028e\7N\2\2\u028e\u028f"+
		"\7Q\2\2\u028f\u0290\7/\2\2\u0290\u0291\7C\2\2\u0291\u0292\7/\2\2\u0292"+
		"\u0293\7O\2\2\u0293\u0294\7W\2\2\u0294\u0295\7G\2\2\u0295\u0296\7T\2\2"+
		"\u0296\u0297\7V\2\2\u0297\u0298\7G\2\2\u0298\u0299\7/\2\2\u0299\u029a"+
		"\7E\2\2\u029a\u029b\7Q\2\2\u029b\u029c\7P\2\2\u029c\u029d\7/\2\2\u029d"+
		"\u029e\7E\2\2\u029e\u029f\7W\2\2\u029f\u02a0\7E\2\2\u02a0\u02a1\7J\2\2"+
		"\u02a1\u02a2\7K\2\2\u02a2\u02a3\7N\2\2\u02a3\u02a4\7N\2\2\u02a4\u02a5"+
		"\7Q\2\2\u02a5\u02a6\7U\2\2\u02a6\u02a7\7A\2\2\u02a7\u0086\3\2\2\2\u02a8"+
		"\u02a9\7?\2\2\u02a9\u0088\3\2\2\2\u02aa\u02ab\7#\2\2\u02ab\u02ac\7?\2"+
		"\2\u02ac\u008a\3\2\2\2\u02ad\u02ae\7@\2\2\u02ae\u008c\3\2\2\2\u02af\u02b0"+
		"\7>\2\2\u02b0\u008e\3\2\2\2\u02b1\u02b2\7@\2\2\u02b2\u02b3\7?\2\2\u02b3"+
		"\u0090\3\2\2\2\u02b4\u02b5\7>\2\2\u02b5\u02b6\7?\2\2\u02b6\u0092\3\2\2"+
		"\2\u02b7\u02b8\7&\2\2\u02b8\u0094\3\2\2\2\u02b9\u02bb\t\4\2\2\u02ba\u02b9"+
		"\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd"+
		"\u0096\3\2\2\2\22\2\u00b0\u00b6\u00bb\u00be\u00c3\u00c9\u00d2\u00d6\u00df"+
		"\u0151\u01b0\u01c9\u01d9\u026f\u02bc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}