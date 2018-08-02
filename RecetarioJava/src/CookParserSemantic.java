import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CookParserSemantic extends CookParserBaseVisitor<Object>{

	protected Map<String, String> _vars = new HashMap<String, String>();

	public CookParserSemantic() {}

	@Override
    public Object visitIniciar_cocina(CookParserParser.Iniciar_cocinaContext ctx) { 
		System.out.println("entre a iniciar");	
		if(ctx.PREPARARINGREDIENTES().getText().equals("COMMENCER_LA_RECETTE") ){
	    		System.out.println("Para comenzar la receta se necesitan:");
			System.out.println(" ");

		}
	    return null;
	}
	
	@Override
	public Object visitFinalizar_cocina(CookParserParser.Finalizar_cocinaContext ctx) {
	    	if(ctx.FINCOCINA().getText().equals("ACHEVEMENT_RECETTE"))    {
	    		System.out.println("ULALAAAA!!");
			System.out.println("TASTY");
		}
	    return null;
	}
	
	@Override
	public Object visitTiempo(CookParserParser.TiempoContext ctx) {
		String tiempo = ctx.TIEMPODECLARACION().getText();
        int numero = Integer.parseInt(ctx.NUMERO().getText());
        String medida = ctx.MEDIDAS_TIEMPO().getText();
        
        System.out.println("El tiempo promedio para la elaboracion de la receta es: "+ numero + " "+medida);
		return null;
	}

	@Override
	public Object visitPorciones(CookParserParser.PorcionesContext ctx) {
		int numero = Integer.parseInt(ctx.NUMERO().getText());
		String porcionType = ctx.PORCION_TYPE().getText();
		//Declarar variable, revisar las weas del profe  
	}
	
	@Override
	public Object visitPrint(MileParserParser.PrintContext ctx) {
		if (ctx.ID().size() > 0) {
			String id, format = "", args = "";
			for (int i = 0; i < ctx.ID().size(); i++) {
				id = ctx.ID(i).getText();
				if (_vars.containsKey(id)) {
					format += getVarTypeMode(_vars.get(id)) + " ";
					args += id + ", ";
				} else {
	    				throw new IllegalArgumentException("Variable '" + id + "' doesn't defined");
				}
			}
			System.out.println(String.format("\tprintf(\"%s\", %s);", format.substring(0, format.length() - 1), args.substring(0, args.length() - 2)));
		} else {
			String text = ctx.STRING().getText();
			if(text != null) {
				System.out.println(String.format("\tprintf(%s);", text));
			}
		}
		return null;  
	}
	
	@Override
	public Object visitIf_block(MileParserParser.If_blockContext ctx) {
		// Completar
		return null; 
	}
	
	private String getVarType(String var_type) {
		if(var_type.equals("entero") || var_type.equals("logico"))
			return "int";
		else if(var_type.equals("real"))
			return "float";
		else
			return "char";
	}
	
	private String getVarTypeMode(String var_type) {
		if(var_type.equals("int"))
			return "%d";
		else if(var_type.equals("real"))
			return "%f";
		else
			return "%s";
	}
	
	private String replace(String stat) {
		stat.replace("=", "==");
		stat.replace("<>", "!=");
		stat.replace("AND", "&&");
		stat.replace("OR", "&&");
		return stat;
	}
	
	
	
	
	
	
	
	
	
	
}
