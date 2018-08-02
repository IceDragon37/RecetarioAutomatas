import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Cook {
	private static String load(String preCodeFile)
			  throws java.io.IOException {
		return new String(
				java.nio.file.Files.readAllBytes(
						java.nio.file.Paths.get(preCodeFile)),
				java.nio.charset.Charset.forName("UTF-8"));
	}

	public static void main(String[] args) {
		try {
			System.out.println("Scanning file...");
			ANTLRInputStream input = new ANTLRInputStream (load("examples/ejemplo.receta")) ;
			CookParserLexer lexer = new CookParserLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			CookParserParser parser = new CookParserParser(tokens);
			ParseTree tree = parser.receta();


			CookParserSemantic semantic = new CookParserSemantic();
			semantic.visit(tree);

		} catch (Exception e) {
			System.err.print(e);
		}
	}
}
