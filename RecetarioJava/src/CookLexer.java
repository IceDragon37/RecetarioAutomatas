// Generated from CookLexer.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CookLexer extends Lexer {
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
		MEDIDA_TEMPERATURA=30, TIEMPODECLARACION=31, PAR_DE=32, PAR_IZ=33, COMA=34, 
		PTOCOMA=35, CORDER=36, CORIZQ=37, LLAVEIZQ=38, LLAVEDER=39, AND=40, OR=41, 
		MAS=42, MENOS=43, PARTIR=44, PELAR=45, ENCENDER=46, PREHOT=47, HERVIR=48, 
		MACERAR=49, AMASAR=50, GIRO=51, MOLER=52, SERVIR=53, UNTAR=54, EMPANIZAR=55, 
		RALLAR=56, CORTAR=57, DUELO_A_MUERTE_CON_CUCHILLOS=58, IGUALAR=59, DISTINGUIR=60, 
		MAYOR=61, MENOR=62, MAYEQ=63, MENEQ=64, NOMBREVAR=65, PALABRA=66;
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
		"'CONDIMENTOS'", "'CARNE'", "'VEGETAL'", "'LEGUMBRE'", "'PESCADO'", "'LIQUIDO'", 
		"'LACTEO'", "'CEREAL'", "'RECIPIENTE'", "'CORTE'", null, "'APARATO'", 
		null, "'UTENCILIO'", null, "'TEMPS'", "')'", "'('", "','", "';'", "']'", 
		"'['", "'{'", "'}'", "'Y'", "'O'", "'AGREGAR'", "'QUITAR'", "'PARTIR'", 
		"'PELAR'", "'ENCENDER'", "'PRECALENTAR'", "'HERVIR'", "'MACERAR'", "'AMASAR'", 
		"'MEZCLAR'", "'MOLER'", "'SERVIR'", null, "'EMPANIZAR'", "'RALLAR'", "'CORTAR'", 
		"'�DUELO-A-MUERTE-CON-CUCHILLOS?'", "'='", "'!='", "'>'", "'<'", "'>='", 
		"'<='", "'$'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "FLOAT", "NUMERO", "ESTADO", "STRING", "COMMENT", "WS", "PREPARARINGREDIENTES", 
		"FINCOCINA", "SINO", "WAITING", "DO", "STOP", "ENDWAIT", "SI", "MEDICION", 
		"CONDIMENTO_TYPE", "CARNE_TYPE", "VEGETAL_TYPE", "LEGUMBRE_TYPE", "PESCADO_TYPE", 
		"LIQUID_TYPE", "LACTEO_TYPE", "CEREAL_TYPE", "RECIPIENTE_TYPE", "CORTE_TYPE", 
		"MEDIDAS_TIEMPO", "APARATO_TYPE", "PORCION_TYPE", "UTENCILIO_TYPE", "MEDIDA_TEMPERATURA", 
		"TIEMPODECLARACION", "PAR_DE", "PAR_IZ", "COMA", "PTOCOMA", "CORDER", 
		"CORIZQ", "LLAVEIZQ", "LLAVEDER", "AND", "OR", "MAS", "MENOS", "PARTIR", 
		"PELAR", "ENCENDER", "PREHOT", "HERVIR", "MACERAR", "AMASAR", "GIRO", 
		"MOLER", "SERVIR", "UNTAR", "EMPANIZAR", "RALLAR", "CORTAR", "DUELO_A_MUERTE_CON_CUCHILLOS", 
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


	public CookLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CookLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2D\u02a3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\6\7\u00a9\n\7\r\7\16\7\u00aa\3\7\3\7\6\7\u00af\n\7"+
		"\r\7\16\7\u00b0\3\b\6\b\u00b4\n\b\r\b\16\b\u00b5\3\b\5\b\u00b9\n\b\3\t"+
		"\3\t\3\t\5\t\u00be\n\t\3\n\3\n\7\n\u00c2\n\n\f\n\16\n\u00c5\13\n\3\n\3"+
		"\n\3\13\3\13\7\13\u00cb\n\13\f\13\16\13\u00ce\13\13\3\13\5\13\u00d1\n"+
		"\13\3\13\3\13\3\13\3\13\3\f\6\f\u00d8\n\f\r\f\16\f\u00d9\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u014c\n\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \5 \u01ab\n \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01c4\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,"+
		"\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38"+
		"\38\38\38\38\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;"+
		"\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u0255\n<\3=\3=\3=\3="+
		"\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@"+
		"\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@"+
		"\3@\3@\3@\3@\3@\3A\3A\3B\3B\3B\3C\3C\3D\3D\3E\3E\3E\3F\3F\3F\3G\3G\3H"+
		"\6H\u02a0\nH\rH\16H\u02a1\4\u00c3\u00cc\2I\3\2\5\2\7\2\t\2\13\2\r\3\17"+
		"\4\21\5\23\6\25\7\27\b\31\t\33\n\35\13\37\f!\r#\16%\17\'\20)\21+\22-\23"+
		"/\24\61\25\63\26\65\27\67\309\31;\32=\33?\34A\35C\36E\37G I!K\"M#O$Q%"+
		"S&U\'W(Y)[*]+_,a-c.e/g\60i\61k\62m\63o\64q\65s\66u\67w8y9{:};\177<\u0081"+
		"=\u0083>\u0085?\u0087@\u0089A\u008bB\u008dC\u008fD\3\2\6\3\2\62;\5\2\13"+
		"\f\17\17\"\"\4\2EEHH\4\2C\\c|\u02b3\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
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
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\3\u0091"+
		"\3\2\2\2\5\u0096\3\2\2\2\7\u009b\3\2\2\2\t\u00a3\3\2\2\2\13\u00a5\3\2"+
		"\2\2\r\u00a8\3\2\2\2\17\u00b8\3\2\2\2\21\u00bd\3\2\2\2\23\u00bf\3\2\2"+
		"\2\25\u00c8\3\2\2\2\27\u00d7\3\2\2\2\31\u00dd\3\2\2\2\33\u00f2\3\2\2\2"+
		"\35\u0105\3\2\2\2\37\u010b\3\2\2\2!\u0114\3\2\2\2#\u011a\3\2\2\2%\u0122"+
		"\3\2\2\2\'\u0129\3\2\2\2)\u014b\3\2\2\2+\u014d\3\2\2\2-\u0159\3\2\2\2"+
		"/\u015f\3\2\2\2\61\u0167\3\2\2\2\63\u0170\3\2\2\2\65\u0178\3\2\2\2\67"+
		"\u0180\3\2\2\29\u0187\3\2\2\2;\u018e\3\2\2\2=\u0199\3\2\2\2?\u01aa\3\2"+
		"\2\2A\u01ac\3\2\2\2C\u01c3\3\2\2\2E\u01c5\3\2\2\2G\u01cf\3\2\2\2I\u01d1"+
		"\3\2\2\2K\u01d7\3\2\2\2M\u01d9\3\2\2\2O\u01db\3\2\2\2Q\u01dd\3\2\2\2S"+
		"\u01df\3\2\2\2U\u01e1\3\2\2\2W\u01e3\3\2\2\2Y\u01e5\3\2\2\2[\u01e7\3\2"+
		"\2\2]\u01e9\3\2\2\2_\u01eb\3\2\2\2a\u01f3\3\2\2\2c\u01fa\3\2\2\2e\u0201"+
		"\3\2\2\2g\u0207\3\2\2\2i\u0210\3\2\2\2k\u021c\3\2\2\2m\u0223\3\2\2\2o"+
		"\u022b\3\2\2\2q\u0232\3\2\2\2s\u023a\3\2\2\2u\u0240\3\2\2\2w\u0254\3\2"+
		"\2\2y\u0256\3\2\2\2{\u0260\3\2\2\2}\u0267\3\2\2\2\177\u026e\3\2\2\2\u0081"+
		"\u028d\3\2\2\2\u0083\u028f\3\2\2\2\u0085\u0292\3\2\2\2\u0087\u0294\3\2"+
		"\2\2\u0089\u0296\3\2\2\2\u008b\u0299\3\2\2\2\u008d\u029c\3\2\2\2\u008f"+
		"\u029f\3\2\2\2\u0091\u0092\7E\2\2\u0092\u0093\7W\2\2\u0093\u0094\7K\2"+
		"\2\u0094\u0095\7V\2\2\u0095\4\3\2\2\2\u0096\u0097\7D\2\2\u0097\u0098\7"+
		"T\2\2\u0098\u0099\7W\2\2\u0099\u009a\7V\2\2\u009a\6\3\2\2\2\u009b\u009c"+
		"\7D\2\2\u009c\u009d\7Q\2\2\u009d\u009e\7W\2\2\u009e\u009f\7K\2\2\u009f"+
		"\u00a0\7N\2\2\u00a0\u00a1\7N\2\2\u00a1\u00a2\7G\2\2\u00a2\b\3\2\2\2\u00a3"+
		"\u00a4\t\2\2\2\u00a4\n\3\2\2\2\u00a5\u00a6\7\60\2\2\u00a6\f\3\2\2\2\u00a7"+
		"\u00a9\5\t\5\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\5\13\6\2\u00ad"+
		"\u00af\5\t\5\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\16\3\2\2\2\u00b2\u00b4\5\t\5\2\u00b3\u00b2"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b9\3\2\2\2\u00b7\u00b9\5\r\7\2\u00b8\u00b3\3\2\2\2\u00b8\u00b7\3\2"+
		"\2\2\u00b9\20\3\2\2\2\u00ba\u00be\5\3\2\2\u00bb\u00be\5\5\3\2\u00bc\u00be"+
		"\5\7\4\2\u00bd\u00ba\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be"+
		"\22\3\2\2\2\u00bf\u00c3\7$\2\2\u00c0\u00c2\13\2\2\2\u00c1\u00c0\3\2\2"+
		"\2\u00c2\u00c5\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c6"+
		"\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7$\2\2\u00c7\24\3\2\2\2\u00c8"+
		"\u00cc\7#\2\2\u00c9\u00cb\13\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00cf\u00d1\7\17\2\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3"+
		"\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\7\f\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d5\b\13\2\2\u00d5\26\3\2\2\2\u00d6\u00d8\t\3\2\2\u00d7\u00d6\3\2\2"+
		"\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\u00dc\b\f\2\2\u00dc\30\3\2\2\2\u00dd\u00de\7E\2\2\u00de"+
		"\u00df\7Q\2\2\u00df\u00e0\7O\2\2\u00e0\u00e1\7O\2\2\u00e1\u00e2\7G\2\2"+
		"\u00e2\u00e3\7P\2\2\u00e3\u00e4\7E\2\2\u00e4\u00e5\7G\2\2\u00e5\u00e6"+
		"\7T\2\2\u00e6\u00e7\7a\2\2\u00e7\u00e8\7N\2\2\u00e8\u00e9\7C\2\2\u00e9"+
		"\u00ea\7a\2\2\u00ea\u00eb\7T\2\2\u00eb\u00ec\7G\2\2\u00ec\u00ed\7E\2\2"+
		"\u00ed\u00ee\7G\2\2\u00ee\u00ef\7V\2\2\u00ef\u00f0\7V\2\2\u00f0\u00f1"+
		"\7G\2\2\u00f1\32\3\2\2\2\u00f2\u00f3\7C\2\2\u00f3\u00f4\7E\2\2\u00f4\u00f5"+
		"\7J\2\2\u00f5\u00f6\7G\2\2\u00f6\u00f7\7X\2\2\u00f7\u00f8\7G\2\2\u00f8"+
		"\u00f9\7O\2\2\u00f9\u00fa\7G\2\2\u00fa\u00fb\7P\2\2\u00fb\u00fc\7V\2\2"+
		"\u00fc\u00fd\7a\2\2\u00fd\u00fe\7T\2\2\u00fe\u00ff\7G\2\2\u00ff\u0100"+
		"\7E\2\2\u0100\u0101\7G\2\2\u0101\u0102\7V\2\2\u0102\u0103\7V\2\2\u0103"+
		"\u0104\7G\2\2\u0104\34\3\2\2\2\u0105\u0106\7C\2\2\u0106\u0107\7W\2\2\u0107"+
		"\u0108\7V\2\2\u0108\u0109\7T\2\2\u0109\u010a\7G\2\2\u010a\36\3\2\2\2\u010b"+
		"\u010c\7C\2\2\u010c\u010d\7V\2\2\u010d\u010e\7V\2\2\u010e\u010f\7G\2\2"+
		"\u010f\u0110\7P\2\2\u0110\u0111\7F\2\2\u0111\u0112\7T\2\2\u0112\u0113"+
		"\7G\2\2\u0113 \3\2\2\2\u0114\u0115\7H\2\2\u0115\u0116\7C\2\2\u0116\u0117"+
		"\7K\2\2\u0117\u0118\7T\2\2\u0118\u0119\7G\2\2\u0119\"\3\2\2\2\u011a\u011b"+
		"\7C\2\2\u011b\u011c\7T\2\2\u011c\u011d\7T\2\2\u011d\u011e\7G\2\2\u011e"+
		"\u011f\7V\2\2\u011f\u0120\7G\2\2\u0120\u0121\7\\\2\2\u0121$\3\2\2\2\u0122"+
		"\u0123\7T\2\2\u0123\u0124\7G\2\2\u0124\u0125\7V\2\2\u0125\u0126\7Q\2\2"+
		"\u0126\u0127\7W\2\2\u0127\u0128\7T\2\2\u0128&\3\2\2\2\u0129\u012a\7U\2"+
		"\2\u012a\u012b\7K\2\2\u012b(\3\2\2\2\u012c\u012d\7Q\2\2\u012d\u012e\7"+
		"P\2\2\u012e\u012f\7\\\2\2\u012f\u014c\7\60\2\2\u0130\u0131\7i\2\2\u0131"+
		"\u0132\7t\2\2\u0132\u014c\7\60\2\2\u0133\u0134\7e\2\2\u0134\u0135\7e\2"+
		"\2\u0135\u014c\7\60\2\2\u0136\u0137\7v\2\2\u0137\u0138\7d\2\2\u0138\u0139"+
		"\7u\2\2\u0139\u014c\7r\2\2\u013a\u013b\7R\2\2\u013b\u013c\7K\2\2\u013c"+
		"\u013d\7G\2\2\u013d\u013e\7E\2\2\u013e\u013f\7G\2\2\u013f\u014c\7U\2\2"+
		"\u0140\u0141\7i\2\2\u0141\u0142\7t\2\2\u0142\u0143\7u\2\2\u0143\u014c"+
		"\7\60\2\2\u0144\u0145\7c\2\2\u0145\u0146\7a\2\2\u0146\u0147\7i\2\2\u0147"+
		"\u0148\7w\2\2\u0148\u0149\7u\2\2\u0149\u014a\7v\2\2\u014a\u014c\7q\2\2"+
		"\u014b\u012c\3\2\2\2\u014b\u0130\3\2\2\2\u014b\u0133\3\2\2\2\u014b\u0136"+
		"\3\2\2\2\u014b\u013a\3\2\2\2\u014b\u0140\3\2\2\2\u014b\u0144\3\2\2\2\u014c"+
		"*\3\2\2\2\u014d\u014e\7E\2\2\u014e\u014f\7Q\2\2\u014f\u0150\7P\2\2\u0150"+
		"\u0151\7F\2\2\u0151\u0152\7K\2\2\u0152\u0153\7O\2\2\u0153\u0154\7G\2\2"+
		"\u0154\u0155\7P\2\2\u0155\u0156\7V\2\2\u0156\u0157\7Q\2\2\u0157\u0158"+
		"\7U\2\2\u0158,\3\2\2\2\u0159\u015a\7E\2\2\u015a\u015b\7C\2\2\u015b\u015c"+
		"\7T\2\2\u015c\u015d\7P\2\2\u015d\u015e\7G\2\2\u015e.\3\2\2\2\u015f\u0160"+
		"\7X\2\2\u0160\u0161\7G\2\2\u0161\u0162\7I\2\2\u0162\u0163\7G\2\2\u0163"+
		"\u0164\7V\2\2\u0164\u0165\7C\2\2\u0165\u0166\7N\2\2\u0166\60\3\2\2\2\u0167"+
		"\u0168\7N\2\2\u0168\u0169\7G\2\2\u0169\u016a\7I\2\2\u016a\u016b\7W\2\2"+
		"\u016b\u016c\7O\2\2\u016c\u016d\7D\2\2\u016d\u016e\7T\2\2\u016e\u016f"+
		"\7G\2\2\u016f\62\3\2\2\2\u0170\u0171\7R\2\2\u0171\u0172\7G\2\2\u0172\u0173"+
		"\7U\2\2\u0173\u0174\7E\2\2\u0174\u0175\7C\2\2\u0175\u0176\7F\2\2\u0176"+
		"\u0177\7Q\2\2\u0177\64\3\2\2\2\u0178\u0179\7N\2\2\u0179\u017a\7K\2\2\u017a"+
		"\u017b\7S\2\2\u017b\u017c\7W\2\2\u017c\u017d\7K\2\2\u017d\u017e\7F\2\2"+
		"\u017e\u017f\7Q\2\2\u017f\66\3\2\2\2\u0180\u0181\7N\2\2\u0181\u0182\7"+
		"C\2\2\u0182\u0183\7E\2\2\u0183\u0184\7V\2\2\u0184\u0185\7G\2\2\u0185\u0186"+
		"\7Q\2\2\u01868\3\2\2\2\u0187\u0188\7E\2\2\u0188\u0189\7G\2\2\u0189\u018a"+
		"\7T\2\2\u018a\u018b\7G\2\2\u018b\u018c\7C\2\2\u018c\u018d\7N\2\2\u018d"+
		":\3\2\2\2\u018e\u018f\7T\2\2\u018f\u0190\7G\2\2\u0190\u0191\7E\2\2\u0191"+
		"\u0192\7K\2\2\u0192\u0193\7R\2\2\u0193\u0194\7K\2\2\u0194\u0195\7G\2\2"+
		"\u0195\u0196\7P\2\2\u0196\u0197\7V\2\2\u0197\u0198\7G\2\2\u0198<\3\2\2"+
		"\2\u0199\u019a\7E\2\2\u019a\u019b\7Q\2\2\u019b\u019c\7T\2\2\u019c\u019d"+
		"\7V\2\2\u019d\u019e\7G\2\2\u019e>\3\2\2\2\u019f\u01a0\7J\2\2\u01a0\u01a1"+
		"\7T\2\2\u01a1\u01ab\7U\2\2\u01a2\u01ab\7U\2\2\u01a3\u01a4\7O\2\2\u01a4"+
		"\u01a5\7K\2\2\u01a5\u01ab\7P\2\2\u01a6\u01a7\7F\2\2\u01a7\u01a8\7K\2\2"+
		"\u01a8\u01a9\7C\2\2\u01a9\u01ab\7U\2\2\u01aa\u019f\3\2\2\2\u01aa\u01a2"+
		"\3\2\2\2\u01aa\u01a3\3\2\2\2\u01aa\u01a6\3\2\2\2\u01ab@\3\2\2\2\u01ac"+
		"\u01ad\7C\2\2\u01ad\u01ae\7R\2\2\u01ae\u01af\7C\2\2\u01af\u01b0\7T\2\2"+
		"\u01b0\u01b1\7C\2\2\u01b1\u01b2\7V\2\2\u01b2\u01b3\7Q\2\2\u01b3B\3\2\2"+
		"\2\u01b4\u01b5\7R\2\2\u01b5\u01b6\7G\2\2\u01b6\u01b7\7T\2\2\u01b7\u01b8"+
		"\7U\2\2\u01b8\u01b9\7Q\2\2\u01b9\u01ba\7P\2\2\u01ba\u01c4\7C\2\2\u01bb"+
		"\u01bc\7R\2\2\u01bc\u01bd\7G\2\2\u01bd\u01be\7T\2\2\u01be\u01bf\7U\2\2"+
		"\u01bf\u01c0\7Q\2\2\u01c0\u01c1\7P\2\2\u01c1\u01c2\7C\2\2\u01c2\u01c4"+
		"\7U\2\2\u01c3\u01b4\3\2\2\2\u01c3\u01bb\3\2\2\2\u01c4D\3\2\2\2\u01c5\u01c6"+
		"\7W\2\2\u01c6\u01c7\7V\2\2\u01c7\u01c8\7G\2\2\u01c8\u01c9\7P\2\2\u01c9"+
		"\u01ca\7E\2\2\u01ca\u01cb\7K\2\2\u01cb\u01cc\7N\2\2\u01cc\u01cd\7K\2\2"+
		"\u01cd\u01ce\7Q\2\2\u01ceF\3\2\2\2\u01cf\u01d0\t\4\2\2\u01d0H\3\2\2\2"+
		"\u01d1\u01d2\7V\2\2\u01d2\u01d3\7G\2\2\u01d3\u01d4\7O\2\2\u01d4\u01d5"+
		"\7R\2\2\u01d5\u01d6\7U\2\2\u01d6J\3\2\2\2\u01d7\u01d8\7+\2\2\u01d8L\3"+
		"\2\2\2\u01d9\u01da\7*\2\2\u01daN\3\2\2\2\u01db\u01dc\7.\2\2\u01dcP\3\2"+
		"\2\2\u01dd\u01de\7=\2\2\u01deR\3\2\2\2\u01df\u01e0\7_\2\2\u01e0T\3\2\2"+
		"\2\u01e1\u01e2\7]\2\2\u01e2V\3\2\2\2\u01e3\u01e4\7}\2\2\u01e4X\3\2\2\2"+
		"\u01e5\u01e6\7\177\2\2\u01e6Z\3\2\2\2\u01e7\u01e8\7[\2\2\u01e8\\\3\2\2"+
		"\2\u01e9\u01ea\7Q\2\2\u01ea^\3\2\2\2\u01eb\u01ec\7C\2\2\u01ec\u01ed\7"+
		"I\2\2\u01ed\u01ee\7T\2\2\u01ee\u01ef\7G\2\2\u01ef\u01f0\7I\2\2\u01f0\u01f1"+
		"\7C\2\2\u01f1\u01f2\7T\2\2\u01f2`\3\2\2\2\u01f3\u01f4\7S\2\2\u01f4\u01f5"+
		"\7W\2\2\u01f5\u01f6\7K\2\2\u01f6\u01f7\7V\2\2\u01f7\u01f8\7C\2\2\u01f8"+
		"\u01f9\7T\2\2\u01f9b\3\2\2\2\u01fa\u01fb\7R\2\2\u01fb\u01fc\7C\2\2\u01fc"+
		"\u01fd\7T\2\2\u01fd\u01fe\7V\2\2\u01fe\u01ff\7K\2\2\u01ff\u0200\7T\2\2"+
		"\u0200d\3\2\2\2\u0201\u0202\7R\2\2\u0202\u0203\7G\2\2\u0203\u0204\7N\2"+
		"\2\u0204\u0205\7C\2\2\u0205\u0206\7T\2\2\u0206f\3\2\2\2\u0207\u0208\7"+
		"G\2\2\u0208\u0209\7P\2\2\u0209\u020a\7E\2\2\u020a\u020b\7G\2\2\u020b\u020c"+
		"\7P\2\2\u020c\u020d\7F\2\2\u020d\u020e\7G\2\2\u020e\u020f\7T\2\2\u020f"+
		"h\3\2\2\2\u0210\u0211\7R\2\2\u0211\u0212\7T\2\2\u0212\u0213\7G\2\2\u0213"+
		"\u0214\7E\2\2\u0214\u0215\7C\2\2\u0215\u0216\7N\2\2\u0216\u0217\7G\2\2"+
		"\u0217\u0218\7P\2\2\u0218\u0219\7V\2\2\u0219\u021a\7C\2\2\u021a\u021b"+
		"\7T\2\2\u021bj\3\2\2\2\u021c\u021d\7J\2\2\u021d\u021e\7G\2\2\u021e\u021f"+
		"\7T\2\2\u021f\u0220\7X\2\2\u0220\u0221\7K\2\2\u0221\u0222\7T\2\2\u0222"+
		"l\3\2\2\2\u0223\u0224\7O\2\2\u0224\u0225\7C\2\2\u0225\u0226\7E\2\2\u0226"+
		"\u0227\7G\2\2\u0227\u0228\7T\2\2\u0228\u0229\7C\2\2\u0229\u022a\7T\2\2"+
		"\u022an\3\2\2\2\u022b\u022c\7C\2\2\u022c\u022d\7O\2\2\u022d\u022e\7C\2"+
		"\2\u022e\u022f\7U\2\2\u022f\u0230\7C\2\2\u0230\u0231\7T\2\2\u0231p\3\2"+
		"\2\2\u0232\u0233\7O\2\2\u0233\u0234\7G\2\2\u0234\u0235\7\\\2\2\u0235\u0236"+
		"\7E\2\2\u0236\u0237\7N\2\2\u0237\u0238\7C\2\2\u0238\u0239\7T\2\2\u0239"+
		"r\3\2\2\2\u023a\u023b\7O\2\2\u023b\u023c\7Q\2\2\u023c\u023d\7N\2\2\u023d"+
		"\u023e\7G\2\2\u023e\u023f\7T\2\2\u023ft\3\2\2\2\u0240\u0241\7U\2\2\u0241"+
		"\u0242\7G\2\2\u0242\u0243\7T\2\2\u0243\u0244\7X\2\2\u0244\u0245\7K\2\2"+
		"\u0245\u0246\7T\2\2\u0246v\3\2\2\2\u0247\u0248\7W\2\2\u0248\u0249\7P\2"+
		"\2\u0249\u024a\7V\2\2\u024a\u024b\7C\2\2\u024b\u0255\7T\2\2\u024c\u024d"+
		"\7G\2\2\u024d\u024e\7P\2\2\u024e\u024f\7I\2\2\u024f\u0250\7T\2\2\u0250"+
		"\u0251\7C\2\2\u0251\u0252\7U\2\2\u0252\u0253\7C\2\2\u0253\u0255\7T\2\2"+
		"\u0254\u0247\3\2\2\2\u0254\u024c\3\2\2\2\u0255x\3\2\2\2\u0256\u0257\7"+
		"G\2\2\u0257\u0258\7O\2\2\u0258\u0259\7R\2\2\u0259\u025a\7C\2\2\u025a\u025b"+
		"\7P\2\2\u025b\u025c\7K\2\2\u025c\u025d\7\\\2\2\u025d\u025e\7C\2\2\u025e"+
		"\u025f\7T\2\2\u025fz\3\2\2\2\u0260\u0261\7T\2\2\u0261\u0262\7C\2\2\u0262"+
		"\u0263\7N\2\2\u0263\u0264\7N\2\2\u0264\u0265\7C\2\2\u0265\u0266\7T\2\2"+
		"\u0266|\3\2\2\2\u0267\u0268\7E\2\2\u0268\u0269\7Q\2\2\u0269\u026a\7T\2"+
		"\2\u026a\u026b\7V\2\2\u026b\u026c\7C\2\2\u026c\u026d\7T\2\2\u026d~\3\2"+
		"\2\2\u026e\u026f\7\uffff\2\2\u026f\u0270\7F\2\2\u0270\u0271\7W\2\2\u0271"+
		"\u0272\7G\2\2\u0272\u0273\7N\2\2\u0273\u0274\7Q\2\2\u0274\u0275\7/\2\2"+
		"\u0275\u0276\7C\2\2\u0276\u0277\7/\2\2\u0277\u0278\7O\2\2\u0278\u0279"+
		"\7W\2\2\u0279\u027a\7G\2\2\u027a\u027b\7T\2\2\u027b\u027c\7V\2\2\u027c"+
		"\u027d\7G\2\2\u027d\u027e\7/\2\2\u027e\u027f\7E\2\2\u027f\u0280\7Q\2\2"+
		"\u0280\u0281\7P\2\2\u0281\u0282\7/\2\2\u0282\u0283\7E\2\2\u0283\u0284"+
		"\7W\2\2\u0284\u0285\7E\2\2\u0285\u0286\7J\2\2\u0286\u0287\7K\2\2\u0287"+
		"\u0288\7N\2\2\u0288\u0289\7N\2\2\u0289\u028a\7Q\2\2\u028a\u028b\7U\2\2"+
		"\u028b\u028c\7A\2\2\u028c\u0080\3\2\2\2\u028d\u028e\7?\2\2\u028e\u0082"+
		"\3\2\2\2\u028f\u0290\7#\2\2\u0290\u0291\7?\2\2\u0291\u0084\3\2\2\2\u0292"+
		"\u0293\7@\2\2\u0293\u0086\3\2\2\2\u0294\u0295\7>\2\2\u0295\u0088\3\2\2"+
		"\2\u0296\u0297\7@\2\2\u0297\u0298\7?\2\2\u0298\u008a\3\2\2\2\u0299\u029a"+
		"\7>\2\2\u029a\u029b\7?\2\2\u029b\u008c\3\2\2\2\u029c\u029d\7&\2\2\u029d"+
		"\u008e\3\2\2\2\u029e\u02a0\t\5\2\2\u029f\u029e\3\2\2\2\u02a0\u02a1\3\2"+
		"\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u0090\3\2\2\2\21\2"+
		"\u00aa\u00b0\u00b5\u00b8\u00bd\u00c3\u00cc\u00d0\u00d9\u014b\u01aa\u01c3"+
		"\u0254\u02a1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}