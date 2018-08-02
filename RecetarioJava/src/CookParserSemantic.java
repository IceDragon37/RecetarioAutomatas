import java.util.HashMap;
import java.util.Map;

public class CookParserSemantic extends CookParserBaseVisitor<Object>{

	protected Map<String, String> _vars = new HashMap<String, String>();

	public CookParserSemantic() {}

	@Override
    public Object visitIniciar_cocina(CookParserParser.Iniciar_cocinaContext ctx) { 
<<<<<<< HEAD
		String iniciar = ctx.PREPARARINGREDIENTES().getText();
		
    	if(iniciar.equals("COMMENCER_LA_RECETTE"))   { 
			System.out.println("#include <stdio.h>");
			System.out.println("void main() {");
=======
		System.out.println("entre a iniciar");	
		if(ctx.PREPARARINGREDIENTES().getText().equals("COMMENCER_LA_RECETTE") ){
	    		System.out.println("Para comenzar la receta se necesitan:");
			System.out.println(" ");

>>>>>>> e95f6637c733528c62d4075ca74caf7f3ab12c29
		}
	    return null;
	}
	
	@Override
	public Object visitFinalizar_cocina(CookParserParser.Finalizar_cocinaContext ctx) {
		String finalizar = ctx.FINCOCINA().getText();
    	if(finalizar.equals("ACHEVEMENT_RECETTE"))    {
    		System.out.println("}");
		}
	    return null;
	}
	
	public Object visitTiempo(CookParserParser.TiempoContext ctx) {
		String declarar = ctx.TIEMPODECLARACION().getText();
		String numero = ctx.NUMERO().getText();
		String medida = ctx.MEDIDAS_TIEMPO().getText();
		
		if(declarar.equals("TEMPS")) {
			System.out.println("\t int tiempo_receta = "+numero+";");
			System.out.println("\t String medida_tiempo = "+medida+";");
		}
		return null;
	}
	
	public Object visitPorciones(CookParserParser.PorcionesContext ctx) {
		String numero = ctx.NUMERO().getText();
		String tipo = ctx.PORCION_TYPE().getText();
		
		System.out.println("\t String porciones = "+numero+" "+tipo+";");
		
		return null;
	}
	
	
	
	private String obtenerVarTiempo(String var_tiempo) {
		if(var_tiempo.equals("HRS"))
			return "%d";
		else if(var_tiempo.equals("real"))
			return "%f";
		else
			return "%s";
	}
	
	
	
	
	
/*	
	
	
	
	
	
	@Override
<<<<<<< HEAD
	public Object visitDeclaration(CookParserParser.DeclarationContext ctx) {
		String var_type = ctx.variable_type().getText();
        String id = ctx.ID().getText();

        if (!_vars.containsKey(id)) {
        		var_type = getVarType(var_type);
        		_vars.put(id, var_type);
        		System.out.println(String.format("\t%s %s;", var_type, id));
        } else {
        		throw new IllegalArgumentException("Variable '" + id + "' already exist");
        }
=======
	public Object visitTiempo(CookParserParser.TiempoContext ctx) {
		String tiempo = ctx.TIEMPODECLARACION().getText();
        int numero = Integer.parseInt(ctx.NUMERO().getText());
        String medida = ctx.MEDIDAS_TIEMPO().getText();
>>>>>>> e95f6637c733528c62d4075ca74caf7f3ab12c29
        
        System.out.println("El tiempo promedio para la elaboracion de la receta es: "+ numero + " "+medida);
		return null;
	}

	@Override
<<<<<<< HEAD
	public Object visitRead(CookParserParser.ReadContext ctx) {
		String id = ctx.ID().getText();
		if (_vars.containsKey(id)) {
			System.out.println(String.format("\tscanf(\"%s\", &%s);", getVarTypeMode(_vars.get(id)), id));
		} else {
    			throw new IllegalArgumentException("Variable '" + id + "' doesn't defined");
		}
		return null; 
=======
	public Object visitPorciones(CookParserParser.PorcionesContext ctx) {
		int numero = Integer.parseInt(ctx.NUMERO().getText());
		String porcionType = ctx.PORCION_TYPE().getText();
		//Declarar variable, revisar las weas del profe  
>>>>>>> e95f6637c733528c62d4075ca74caf7f3ab12c29
	}
	
	@Override
	public Object visitPrint(CookParserParser.PrintContext ctx) {
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
	public Object visitIf_block(CookParserParser.If_blockContext ctx) {
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
<<<<<<< HEAD
	*/
=======
	
	
	
	
	
	
	
	
	
	
>>>>>>> e95f6637c733528c62d4075ca74caf7f3ab12c29
}
