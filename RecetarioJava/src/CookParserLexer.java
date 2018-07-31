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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"COCIDO", "CRUDO", "NAT", "PUNTO", "FLOAT", "NUMERO", "ESTADO", "STRING", 
		"COMMENT", "WS", "CONSEJOS", "PREPARARINGREDIENTES", "FINCOCINA", "SINO", 
		"WAITING", "DO", "STOP", "ENDWAIT", "SI", "MEDICION", "CONDIMENTO_TYPE", 
		"DECLARACION", "CARNE_TYPE", "VEGETAL_TYPE", "LEGUMBRE_TYPE", "PESCADO_TYPE", 
		"LIQUID_TYPE", "LACTEO_TYPE", "CEREAL_TYPE", "RECIPIENTE_TYPE", "CORTE_TYPE", 
		"MEDIDAS_TIEMPO", "APARATO_TYPE", "PORCION_TYPE", "UTENCILIO_TYPE", "MEDIDA_TEMPERATURA", 
		"TIEMPODECLARACION", "CUCHILLO", "ESCRIBIR", "LEER", "PAR_DE", "PAR_IZ", 
		"COMA", "PTOCOMA", "CORDER", "CORIZQ", "LLAVEIZQ", "LLAVEDER", "AND", 
		"OR", "MAS", "MENOS", "PARTIR", "PELAR", "ENCENDER", "PREHOT", "HERVIR", 
		"MACERAR", "AMASAR", "GIRO", "MOLER", "SERVIR", "UNTAR", "EMPANIZAR", 
		"RALLAR", "CORTAR", "DUELO_A_MUERTE_CON_CUCHILLOS", "IGUALAR", "DISTINGUIR", 
		"MAYOR", "MENOR", "MAYEQ", "MENEQ", "NOMBREVAR", "PALABRA"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2I\u02cb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\6\6\u00a9\n\6\r\6\16\6\u00aa\3\6\3\6\6\6\u00af\n\6\r\6\16"+
		"\6\u00b0\3\7\6\7\u00b4\n\7\r\7\16\7\u00b5\3\7\5\7\u00b9\n\7\3\b\3\b\5"+
		"\b\u00bd\n\b\3\t\3\t\7\t\u00c1\n\t\f\t\16\t\u00c4\13\t\3\t\3\t\3\n\3\n"+
		"\7\n\u00ca\n\n\f\n\16\n\u00cd\13\n\3\n\5\n\u00d0\n\n\3\n\3\n\3\n\3\n\3"+
		"\13\6\13\u00d7\n\13\r\13\16\13\u00d8\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0154\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u01be"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\5#\u01d7\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\5%\u01e7"+
		"\n%\3&\3&\3&\3&\3&\3&\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\38\38\38\38\38\38\38\38\38\39\39\39\39\39\39\39\39\39\39\3"+
		"9\39\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3"+
		"<\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u027d\n@\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3"+
		"D\3D\3E\3E\3F\3F\3F\3G\3G\3H\3H\3I\3I\3I\3J\3J\3J\3K\3K\3L\6L\u02c8\n"+
		"L\rL\16L\u02c9\4\u00c2\u00cb\2M\3\2\5\2\7\2\t\2\13\3\r\4\17\5\21\6\23"+
		"\7\25\b\27\t\31\n\33\13\35\f\37\r!\16#\17%\20\'\21)\22+\23-\24/\25\61"+
		"\26\63\27\65\30\67\319\32;\33=\34?\35A\36C\37E G!I\"K#M$O%Q&S\'U(W)Y*"+
		"[+],_-a.c/e\60g\61i\62k\63m\64o\65q\66s\67u8w9y:{;}<\177=\u0081>\u0083"+
		"?\u0085@\u0087A\u0089B\u008bC\u008dD\u008fE\u0091F\u0093G\u0095H\u0097"+
		"I\3\2\5\3\2\62;\5\2\13\f\17\17\"\"\4\2C\\c|\u02dc\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\3\u0099\3\2\2\2\5\u009e\3\2\2\2\7\u00a3\3\2\2\2\t\u00a5\3\2\2"+
		"\2\13\u00a8\3\2\2\2\r\u00b8\3\2\2\2\17\u00bc\3\2\2\2\21\u00be\3\2\2\2"+
		"\23\u00c7\3\2\2\2\25\u00d6\3\2\2\2\27\u00dc\3\2\2\2\31\u00e5\3\2\2\2\33"+
		"\u00fa\3\2\2\2\35\u010d\3\2\2\2\37\u0113\3\2\2\2!\u011c\3\2\2\2#\u0122"+
		"\3\2\2\2%\u012a\3\2\2\2\'\u0131\3\2\2\2)\u0153\3\2\2\2+\u0155\3\2\2\2"+
		"-\u0161\3\2\2\2/\u016c\3\2\2\2\61\u0172\3\2\2\2\63\u017a\3\2\2\2\65\u0183"+
		"\3\2\2\2\67\u018b\3\2\2\29\u0193\3\2\2\2;\u019a\3\2\2\2=\u01a1\3\2\2\2"+
		"?\u01ac\3\2\2\2A\u01bd\3\2\2\2C\u01bf\3\2\2\2E\u01d6\3\2\2\2G\u01d8\3"+
		"\2\2\2I\u01e6\3\2\2\2K\u01e8\3\2\2\2M\u01ee\3\2\2\2O\u01f0\3\2\2\2Q\u01f7"+
		"\3\2\2\2S\u01ff\3\2\2\2U\u0201\3\2\2\2W\u0203\3\2\2\2Y\u0205\3\2\2\2["+
		"\u0207\3\2\2\2]\u0209\3\2\2\2_\u020b\3\2\2\2a\u020d\3\2\2\2c\u020f\3\2"+
		"\2\2e\u0211\3\2\2\2g\u0213\3\2\2\2i\u021b\3\2\2\2k\u0222\3\2\2\2m\u0229"+
		"\3\2\2\2o\u022f\3\2\2\2q\u0238\3\2\2\2s\u0244\3\2\2\2u\u024b\3\2\2\2w"+
		"\u0253\3\2\2\2y\u025a\3\2\2\2{\u0262\3\2\2\2}\u0268\3\2\2\2\177\u027c"+
		"\3\2\2\2\u0081\u027e\3\2\2\2\u0083\u0288\3\2\2\2\u0085\u028f\3\2\2\2\u0087"+
		"\u0296\3\2\2\2\u0089\u02b5\3\2\2\2\u008b\u02b7\3\2\2\2\u008d\u02ba\3\2"+
		"\2\2\u008f\u02bc\3\2\2\2\u0091\u02be\3\2\2\2\u0093\u02c1\3\2\2\2\u0095"+
		"\u02c4\3\2\2\2\u0097\u02c7\3\2\2\2\u0099\u009a\7E\2\2\u009a\u009b\7W\2"+
		"\2\u009b\u009c\7K\2\2\u009c\u009d\7V\2\2\u009d\4\3\2\2\2\u009e\u009f\7"+
		"D\2\2\u009f\u00a0\7T\2\2\u00a0\u00a1\7W\2\2\u00a1\u00a2\7V\2\2\u00a2\6"+
		"\3\2\2\2\u00a3\u00a4\t\2\2\2\u00a4\b\3\2\2\2\u00a5\u00a6\7\60\2\2\u00a6"+
		"\n\3\2\2\2\u00a7\u00a9\5\7\4\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2"+
		"\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae"+
		"\5\t\5\2\u00ad\u00af\5\7\4\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\f\3\2\2\2\u00b2\u00b4\5\7\4\2"+
		"\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6"+
		"\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b9\5\13\6\2\u00b8\u00b3\3\2\2\2"+
		"\u00b8\u00b7\3\2\2\2\u00b9\16\3\2\2\2\u00ba\u00bd\5\3\2\2\u00bb\u00bd"+
		"\5\5\3\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\20\3\2\2\2\u00be"+
		"\u00c2\7$\2\2\u00bf\u00c1\13\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2"+
		"\2\2\u00c2\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c5\u00c6\7$\2\2\u00c6\22\3\2\2\2\u00c7\u00cb\7#\2\2"+
		"\u00c8\u00ca\13\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce"+
		"\u00d0\7\17\2\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3"+
		"\2\2\2\u00d1\u00d2\7\f\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\b\n\2\2\u00d4"+
		"\24\3\2\2\2\u00d5\u00d7\t\3\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2"+
		"\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db"+
		"\b\13\2\2\u00db\26\3\2\2\2\u00dc\u00dd\7&\2\2\u00dd\u00de\7&\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e0\13\2\2\2\u00e0\u00e1\5\u0097L\2\u00e1\u00e2"+
		"\13\2\2\2\u00e2\u00e3\7&\2\2\u00e3\u00e4\7&\2\2\u00e4\30\3\2\2\2\u00e5"+
		"\u00e6\7E\2\2\u00e6\u00e7\7Q\2\2\u00e7\u00e8\7O\2\2\u00e8\u00e9\7O\2\2"+
		"\u00e9\u00ea\7G\2\2\u00ea\u00eb\7P\2\2\u00eb\u00ec\7E\2\2\u00ec\u00ed"+
		"\7G\2\2\u00ed\u00ee\7T\2\2\u00ee\u00ef\7a\2\2\u00ef\u00f0\7N\2\2\u00f0"+
		"\u00f1\7C\2\2\u00f1\u00f2\7a\2\2\u00f2\u00f3\7T\2\2\u00f3\u00f4\7G\2\2"+
		"\u00f4\u00f5\7E\2\2\u00f5\u00f6\7G\2\2\u00f6\u00f7\7V\2\2\u00f7\u00f8"+
		"\7V\2\2\u00f8\u00f9\7G\2\2\u00f9\32\3\2\2\2\u00fa\u00fb\7C\2\2\u00fb\u00fc"+
		"\7E\2\2\u00fc\u00fd\7J\2\2\u00fd\u00fe\7G\2\2\u00fe\u00ff\7X\2\2\u00ff"+
		"\u0100\7G\2\2\u0100\u0101\7O\2\2\u0101\u0102\7G\2\2\u0102\u0103\7P\2\2"+
		"\u0103\u0104\7V\2\2\u0104\u0105\7a\2\2\u0105\u0106\7T\2\2\u0106\u0107"+
		"\7G\2\2\u0107\u0108\7E\2\2\u0108\u0109\7G\2\2\u0109\u010a\7V\2\2\u010a"+
		"\u010b\7V\2\2\u010b\u010c\7G\2\2\u010c\34\3\2\2\2\u010d\u010e\7C\2\2\u010e"+
		"\u010f\7W\2\2\u010f\u0110\7V\2\2\u0110\u0111\7T\2\2\u0111\u0112\7G\2\2"+
		"\u0112\36\3\2\2\2\u0113\u0114\7C\2\2\u0114\u0115\7V\2\2\u0115\u0116\7"+
		"V\2\2\u0116\u0117\7G\2\2\u0117\u0118\7P\2\2\u0118\u0119\7F\2\2\u0119\u011a"+
		"\7T\2\2\u011a\u011b\7G\2\2\u011b \3\2\2\2\u011c\u011d\7H\2\2\u011d\u011e"+
		"\7C\2\2\u011e\u011f\7K\2\2\u011f\u0120\7T\2\2\u0120\u0121\7G\2\2\u0121"+
		"\"\3\2\2\2\u0122\u0123\7C\2\2\u0123\u0124\7T\2\2\u0124\u0125\7T\2\2\u0125"+
		"\u0126\7G\2\2\u0126\u0127\7V\2\2\u0127\u0128\7G\2\2\u0128\u0129\7\\\2"+
		"\2\u0129$\3\2\2\2\u012a\u012b\7T\2\2\u012b\u012c\7G\2\2\u012c\u012d\7"+
		"V\2\2\u012d\u012e\7Q\2\2\u012e\u012f\7W\2\2\u012f\u0130\7T\2\2\u0130&"+
		"\3\2\2\2\u0131\u0132\7U\2\2\u0132\u0133\7K\2\2\u0133(\3\2\2\2\u0134\u0135"+
		"\7Q\2\2\u0135\u0136\7P\2\2\u0136\u0137\7\\\2\2\u0137\u0154\7\60\2\2\u0138"+
		"\u0139\7i\2\2\u0139\u013a\7t\2\2\u013a\u0154\7\60\2\2\u013b\u013c\7e\2"+
		"\2\u013c\u013d\7e\2\2\u013d\u0154\7\60\2\2\u013e\u013f\7v\2\2\u013f\u0140"+
		"\7d\2\2\u0140\u0141\7u\2\2\u0141\u0154\7r\2\2\u0142\u0143\7R\2\2\u0143"+
		"\u0144\7K\2\2\u0144\u0145\7G\2\2\u0145\u0146\7E\2\2\u0146\u0147\7G\2\2"+
		"\u0147\u0154\7U\2\2\u0148\u0149\7i\2\2\u0149\u014a\7t\2\2\u014a\u014b"+
		"\7u\2\2\u014b\u0154\7\60\2\2\u014c\u014d\7c\2\2\u014d\u014e\7a\2\2\u014e"+
		"\u014f\7i\2\2\u014f\u0150\7w\2\2\u0150\u0151\7u\2\2\u0151\u0152\7v\2\2"+
		"\u0152\u0154\7q\2\2\u0153\u0134\3\2\2\2\u0153\u0138\3\2\2\2\u0153\u013b"+
		"\3\2\2\2\u0153\u013e\3\2\2\2\u0153\u0142\3\2\2\2\u0153\u0148\3\2\2\2\u0153"+
		"\u014c\3\2\2\2\u0154*\3\2\2\2\u0155\u0156\7E\2\2\u0156\u0157\7Q\2\2\u0157"+
		"\u0158\7P\2\2\u0158\u0159\7F\2\2\u0159\u015a\7K\2\2\u015a\u015b\7O\2\2"+
		"\u015b\u015c\7G\2\2\u015c\u015d\7P\2\2\u015d\u015e\7V\2\2\u015e\u015f"+
		"\7Q\2\2\u015f\u0160\7U\2\2\u0160,\3\2\2\2\u0161\u0162\7K\2\2\u0162\u0163"+
		"\7P\2\2\u0163\u0164\7I\2\2\u0164\u0165\7T\2\2\u0165\u0166\7G\2\2\u0166"+
		"\u0167\7F\2\2\u0167\u0168\7K\2\2\u0168\u0169\7G\2\2\u0169\u016a\7P\2\2"+
		"\u016a\u016b\7V\2\2\u016b.\3\2\2\2\u016c\u016d\7E\2\2\u016d\u016e\7C\2"+
		"\2\u016e\u016f\7T\2\2\u016f\u0170\7P\2\2\u0170\u0171\7G\2\2\u0171\60\3"+
		"\2\2\2\u0172\u0173\7X\2\2\u0173\u0174\7G\2\2\u0174\u0175\7I\2\2\u0175"+
		"\u0176\7G\2\2\u0176\u0177\7V\2\2\u0177\u0178\7C\2\2\u0178\u0179\7N\2\2"+
		"\u0179\62\3\2\2\2\u017a\u017b\7N\2\2\u017b\u017c\7G\2\2\u017c\u017d\7"+
		"I\2\2\u017d\u017e\7W\2\2\u017e\u017f\7O\2\2\u017f\u0180\7D\2\2\u0180\u0181"+
		"\7T\2\2\u0181\u0182\7G\2\2\u0182\64\3\2\2\2\u0183\u0184\7R\2\2\u0184\u0185"+
		"\7G\2\2\u0185\u0186\7U\2\2\u0186\u0187\7E\2\2\u0187\u0188\7C\2\2\u0188"+
		"\u0189\7F\2\2\u0189\u018a\7Q\2\2\u018a\66\3\2\2\2\u018b\u018c\7N\2\2\u018c"+
		"\u018d\7K\2\2\u018d\u018e\7S\2\2\u018e\u018f\7W\2\2\u018f\u0190\7K\2\2"+
		"\u0190\u0191\7F\2\2\u0191\u0192\7Q\2\2\u01928\3\2\2\2\u0193\u0194\7N\2"+
		"\2\u0194\u0195\7C\2\2\u0195\u0196\7E\2\2\u0196\u0197\7V\2\2\u0197\u0198"+
		"\7G\2\2\u0198\u0199\7Q\2\2\u0199:\3\2\2\2\u019a\u019b\7E\2\2\u019b\u019c"+
		"\7G\2\2\u019c\u019d\7T\2\2\u019d\u019e\7G\2\2\u019e\u019f\7C\2\2\u019f"+
		"\u01a0\7N\2\2\u01a0<\3\2\2\2\u01a1\u01a2\7T\2\2\u01a2\u01a3\7G\2\2\u01a3"+
		"\u01a4\7E\2\2\u01a4\u01a5\7K\2\2\u01a5\u01a6\7R\2\2\u01a6\u01a7\7K\2\2"+
		"\u01a7\u01a8\7G\2\2\u01a8\u01a9\7P\2\2\u01a9\u01aa\7V\2\2\u01aa\u01ab"+
		"\7G\2\2\u01ab>\3\2\2\2\u01ac\u01ad\7E\2\2\u01ad\u01ae\7Q\2\2\u01ae\u01af"+
		"\7T\2\2\u01af\u01b0\7V\2\2\u01b0\u01b1\7G\2\2\u01b1@\3\2\2\2\u01b2\u01b3"+
		"\7J\2\2\u01b3\u01b4\7T\2\2\u01b4\u01be\7U\2\2\u01b5\u01be\7U\2\2\u01b6"+
		"\u01b7\7O\2\2\u01b7\u01b8\7K\2\2\u01b8\u01be\7P\2\2\u01b9\u01ba\7F\2\2"+
		"\u01ba\u01bb\7K\2\2\u01bb\u01bc\7C\2\2\u01bc\u01be\7U\2\2\u01bd\u01b2"+
		"\3\2\2\2\u01bd\u01b5\3\2\2\2\u01bd\u01b6\3\2\2\2\u01bd\u01b9\3\2\2\2\u01be"+
		"B\3\2\2\2\u01bf\u01c0\7C\2\2\u01c0\u01c1\7R\2\2\u01c1\u01c2\7C\2\2\u01c2"+
		"\u01c3\7T\2\2\u01c3\u01c4\7C\2\2\u01c4\u01c5\7V\2\2\u01c5\u01c6\7Q\2\2"+
		"\u01c6D\3\2\2\2\u01c7\u01c8\7R\2\2\u01c8\u01c9\7G\2\2\u01c9\u01ca\7T\2"+
		"\2\u01ca\u01cb\7U\2\2\u01cb\u01cc\7Q\2\2\u01cc\u01cd\7P\2\2\u01cd\u01d7"+
		"\7C\2\2\u01ce\u01cf\7R\2\2\u01cf\u01d0\7G\2\2\u01d0\u01d1\7T\2\2\u01d1"+
		"\u01d2\7U\2\2\u01d2\u01d3\7Q\2\2\u01d3\u01d4\7P\2\2\u01d4\u01d5\7C\2\2"+
		"\u01d5\u01d7\7U\2\2\u01d6\u01c7\3\2\2\2\u01d6\u01ce\3\2\2\2\u01d7F\3\2"+
		"\2\2\u01d8\u01d9\7W\2\2\u01d9\u01da\7V\2\2\u01da\u01db\7G\2\2\u01db\u01dc"+
		"\7P\2\2\u01dc\u01dd\7E\2\2\u01dd\u01de\7K\2\2\u01de\u01df\7N\2\2\u01df"+
		"\u01e0\7K\2\2\u01e0\u01e1\7Q\2\2\u01e1H\3\2\2\2\u01e2\u01e3\7\uffff\2"+
		"\2\u01e3\u01e7\7E\2\2\u01e4\u01e5\7\uffff\2\2\u01e5\u01e7\7H\2\2\u01e6"+
		"\u01e2\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7J\3\2\2\2\u01e8\u01e9\7V\2\2\u01e9"+
		"\u01ea\7G\2\2\u01ea\u01eb\7O\2\2\u01eb\u01ec\7R\2\2\u01ec\u01ed\7U\2\2"+
		"\u01edL\3\2\2\2\u01ee\u01ef\5G$\2\u01efN\3\2\2\2\u01f0\u01f1\7C\2\2\u01f1"+
		"\u01f2\7P\2\2\u01f2\u01f3\7Q\2\2\u01f3\u01f4\7V\2\2\u01f4\u01f5\7C\2\2"+
		"\u01f5\u01f6\7T\2\2\u01f6P\3\2\2\2\u01f7\u01f8\7K\2\2\u01f8\u01f9\7P\2"+
		"\2\u01f9\u01fa\7I\2\2\u01fa\u01fb\7T\2\2\u01fb\u01fc\7G\2\2\u01fc\u01fd"+
		"\7U\2\2\u01fd\u01fe\7G\2\2\u01feR\3\2\2\2\u01ff\u0200\7+\2\2\u0200T\3"+
		"\2\2\2\u0201\u0202\7*\2\2\u0202V\3\2\2\2\u0203\u0204\7.\2\2\u0204X\3\2"+
		"\2\2\u0205\u0206\7=\2\2\u0206Z\3\2\2\2\u0207\u0208\7_\2\2\u0208\\\3\2"+
		"\2\2\u0209\u020a\7]\2\2\u020a^\3\2\2\2\u020b\u020c\7}\2\2\u020c`\3\2\2"+
		"\2\u020d\u020e\7\177\2\2\u020eb\3\2\2\2\u020f\u0210\7[\2\2\u0210d\3\2"+
		"\2\2\u0211\u0212\7Q\2\2\u0212f\3\2\2\2\u0213\u0214\7C\2\2\u0214\u0215"+
		"\7I\2\2\u0215\u0216\7T\2\2\u0216\u0217\7G\2\2\u0217\u0218\7I\2\2\u0218"+
		"\u0219\7C\2\2\u0219\u021a\7T\2\2\u021ah\3\2\2\2\u021b\u021c\7S\2\2\u021c"+
		"\u021d\7W\2\2\u021d\u021e\7K\2\2\u021e\u021f\7V\2\2\u021f\u0220\7C\2\2"+
		"\u0220\u0221\7T\2\2\u0221j\3\2\2\2\u0222\u0223\7R\2\2\u0223\u0224\7C\2"+
		"\2\u0224\u0225\7T\2\2\u0225\u0226\7V\2\2\u0226\u0227\7K\2\2\u0227\u0228"+
		"\7T\2\2\u0228l\3\2\2\2\u0229\u022a\7R\2\2\u022a\u022b\7G\2\2\u022b\u022c"+
		"\7N\2\2\u022c\u022d\7C\2\2\u022d\u022e\7T\2\2\u022en\3\2\2\2\u022f\u0230"+
		"\7G\2\2\u0230\u0231\7P\2\2\u0231\u0232\7E\2\2\u0232\u0233\7G\2\2\u0233"+
		"\u0234\7P\2\2\u0234\u0235\7F\2\2\u0235\u0236\7G\2\2\u0236\u0237\7T\2\2"+
		"\u0237p\3\2\2\2\u0238\u0239\7R\2\2\u0239\u023a\7T\2\2\u023a\u023b\7G\2"+
		"\2\u023b\u023c\7E\2\2\u023c\u023d\7C\2\2\u023d\u023e\7N\2\2\u023e\u023f"+
		"\7G\2\2\u023f\u0240\7P\2\2\u0240\u0241\7V\2\2\u0241\u0242\7C\2\2\u0242"+
		"\u0243\7T\2\2\u0243r\3\2\2\2\u0244\u0245\7J\2\2\u0245\u0246\7G\2\2\u0246"+
		"\u0247\7T\2\2\u0247\u0248\7X\2\2\u0248\u0249\7K\2\2\u0249\u024a\7T\2\2"+
		"\u024at\3\2\2\2\u024b\u024c\7O\2\2\u024c\u024d\7C\2\2\u024d\u024e\7E\2"+
		"\2\u024e\u024f\7G\2\2\u024f\u0250\7T\2\2\u0250\u0251\7C\2\2\u0251\u0252"+
		"\7T\2\2\u0252v\3\2\2\2\u0253\u0254\7C\2\2\u0254\u0255\7O\2\2\u0255\u0256"+
		"\7C\2\2\u0256\u0257\7U\2\2\u0257\u0258\7C\2\2\u0258\u0259\7T\2\2\u0259"+
		"x\3\2\2\2\u025a\u025b\7O\2\2\u025b\u025c\7G\2\2\u025c\u025d\7\\\2\2\u025d"+
		"\u025e\7E\2\2\u025e\u025f\7N\2\2\u025f\u0260\7C\2\2\u0260\u0261\7T\2\2"+
		"\u0261z\3\2\2\2\u0262\u0263\7O\2\2\u0263\u0264\7Q\2\2\u0264\u0265\7N\2"+
		"\2\u0265\u0266\7G\2\2\u0266\u0267\7T\2\2\u0267|\3\2\2\2\u0268\u0269\7"+
		"U\2\2\u0269\u026a\7G\2\2\u026a\u026b\7T\2\2\u026b\u026c\7X\2\2\u026c\u026d"+
		"\7K\2\2\u026d\u026e\7T\2\2\u026e~\3\2\2\2\u026f\u0270\7W\2\2\u0270\u0271"+
		"\7P\2\2\u0271\u0272\7V\2\2\u0272\u0273\7C\2\2\u0273\u027d\7T\2\2\u0274"+
		"\u0275\7G\2\2\u0275\u0276\7P\2\2\u0276\u0277\7I\2\2\u0277\u0278\7T\2\2"+
		"\u0278\u0279\7C\2\2\u0279\u027a\7U\2\2\u027a\u027b\7C\2\2\u027b\u027d"+
		"\7T\2\2\u027c\u026f\3\2\2\2\u027c\u0274\3\2\2\2\u027d\u0080\3\2\2\2\u027e"+
		"\u027f\7G\2\2\u027f\u0280\7O\2\2\u0280\u0281\7R\2\2\u0281\u0282\7C\2\2"+
		"\u0282\u0283\7P\2\2\u0283\u0284\7K\2\2\u0284\u0285\7\\\2\2\u0285\u0286"+
		"\7C\2\2\u0286\u0287\7T\2\2\u0287\u0082\3\2\2\2\u0288\u0289\7T\2\2\u0289"+
		"\u028a\7C\2\2\u028a\u028b\7N\2\2\u028b\u028c\7N\2\2\u028c\u028d\7C\2\2"+
		"\u028d\u028e\7T\2\2\u028e\u0084\3\2\2\2\u028f\u0290\7E\2\2\u0290\u0291"+
		"\7Q\2\2\u0291\u0292\7T\2\2\u0292\u0293\7V\2\2\u0293\u0294\7C\2\2\u0294"+
		"\u0295\7T\2\2\u0295\u0086\3\2\2\2\u0296\u0297\7\uffff\2\2\u0297\u0298"+
		"\7F\2\2\u0298\u0299\7W\2\2\u0299\u029a\7G\2\2\u029a\u029b\7N\2\2\u029b"+
		"\u029c\7Q\2\2\u029c\u029d\7/\2\2\u029d\u029e\7C\2\2\u029e\u029f\7/\2\2"+
		"\u029f\u02a0\7O\2\2\u02a0\u02a1\7W\2\2\u02a1\u02a2\7G\2\2\u02a2\u02a3"+
		"\7T\2\2\u02a3\u02a4\7V\2\2\u02a4\u02a5\7G\2\2\u02a5\u02a6\7/\2\2\u02a6"+
		"\u02a7\7E\2\2\u02a7\u02a8\7Q\2\2\u02a8\u02a9\7P\2\2\u02a9\u02aa\7/\2\2"+
		"\u02aa\u02ab\7E\2\2\u02ab\u02ac\7W\2\2\u02ac\u02ad\7E\2\2\u02ad\u02ae"+
		"\7J\2\2\u02ae\u02af\7K\2\2\u02af\u02b0\7N\2\2\u02b0\u02b1\7N\2\2\u02b1"+
		"\u02b2\7Q\2\2\u02b2\u02b3\7U\2\2\u02b3\u02b4\7A\2\2\u02b4\u0088\3\2\2"+
		"\2\u02b5\u02b6\7?\2\2\u02b6\u008a\3\2\2\2\u02b7\u02b8\7#\2\2\u02b8\u02b9"+
		"\7?\2\2\u02b9\u008c\3\2\2\2\u02ba\u02bb\7@\2\2\u02bb\u008e\3\2\2\2\u02bc"+
		"\u02bd\7>\2\2\u02bd\u0090\3\2\2\2\u02be\u02bf\7@\2\2\u02bf\u02c0\7?\2"+
		"\2\u02c0\u0092\3\2\2\2\u02c1\u02c2\7>\2\2\u02c2\u02c3\7?\2\2\u02c3\u0094"+
		"\3\2\2\2\u02c4\u02c5\7&\2\2\u02c5\u0096\3\2\2\2\u02c6\u02c8\t\4\2\2\u02c7"+
		"\u02c6\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02c7\3\2\2\2\u02c9\u02ca\3\2"+
		"\2\2\u02ca\u0098\3\2\2\2\22\2\u00aa\u00b0\u00b5\u00b8\u00bc\u00c2\u00cb"+
		"\u00cf\u00d8\u0153\u01bd\u01d6\u01e6\u027c\u02c9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}