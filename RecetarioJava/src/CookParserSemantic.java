import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CookParserSemantic extends CookParserBaseVisitor<Object>{

	protected Map<String, String> _vars = new HashMap<String, String>();

	public CookParserSemantic() {}

	@Override
    public Object visitIniciar_cocina(CookParserParser.Iniciar_cocinaContext ctx) {
	    	if(ctx.PREPARARINGREDIENTES().getText().equals("COMMENCER_LA_RECETTE"))    {
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

	/**
	 * FUNCION QUE DEVUELVE LE TIPO DE INGREDIENTE SOLICITADO.
	 * @return
	 */
	public String getTipo_ingrediente(String tipo) {


		if(tipo.equals("CARNE"))
			return "CARNE_TYPE";

		if(tipo.equals("PESCADO"))
			return "PESCADO_TYPE";

		if(tipo.equals("CONDIMENTOS"))
			return "CONDIMENTO_TYPE";

		if(tipo.equals("VEGETAL"))
			return "VEGETAL_TYPE";

		if(tipo.equals("LEGUMBRE"))
			return "LEGUMBRE_TYPE";

		if(tipo.equals("LIQUIDO"))
			return "LIQUID_TYPE";

		if(tipo.equals("LACTEO"))
			return "LACTEO_TYPE";

		if(tipo.equals("CEREAL"))
			return "CEREAL_TYPE";

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
		if(porcionType.equals("PERSONAS")) {
			System.out.println("La receta esta contemplada para preparar "+numero+" platos");
		}
		else {
			System.out.println("La receta esta contemplada para preparar "+numero+" plato");
		}
		System.out.println("");
		System.out.println("Los ingredientes son: ");
		System.out.println("");
		return null;
	}

	@Override
	public Object visitIngrediente(CookParserParser.IngredienteContext ctx) {
		String tipo_ingrediente = getTipo_ingrediente(ctx.tipo_ingrediente().getText());
		String nombre = ctx.PALABRA().getText();
		String medicion = ctx.MEDICION().getText();
		int numero = 0;
		if(ctx.NUMERO() != null) {
			numero = Integer.parseInt(ctx.NUMERO().getText());
		}
		//System.out.println( numero + " "+medicion);
        if (!_vars.containsKey(nombre)) {
        		_vars.put(nombre, tipo_ingrediente);
        		//System.out.println(String.format("\t%s %s;", tipo_ingrediente, nombre));
        } else {
        		throw new IllegalArgumentException("Ya tenemos la variable '" + nombre + "'");
        }
        	
        if(numero > 0 ) {
        	System.out.println(numero+" "+medicion+" de "+nombre+".");
        }
        else {
        	System.out.println(nombre+" a gusto.");
        }
		return null;
	}

	@Override
	public Object visitRead(MileParserParser.ReadContext ctx) {
		String id = ctx.ID().getText();
		if (_vars.containsKey(id)) {
			System.out.println(String.format("\tscanf(\"%s\", &%s);", getVarTypeMode(_vars.get(id)), id));
		} else {
    			throw new IllegalArgumentException("Variable '" + id + "' doesn't defined");
		}
		return null;
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
