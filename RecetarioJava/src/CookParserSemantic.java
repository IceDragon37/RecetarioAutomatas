import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CookParserSemantic extends CookParserBaseVisitor<Object>{

	protected Map<String, String> _vars = new HashMap<String, String>();
	protected Map<String, String> _states = new HashMap<String, String>();
	protected Map<String, ArrayList<String>> _mezc= new HashMap<String, ArrayList<String>>();

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
        		_states.put(nombre, "CRUDO");
        		//System.out.println(String.format("\t%s %s;", tipo_ingrediente, nombre));
        } else {
        		throw new IllegalArgumentException("Ya tenemos la variable '" + nombre + "'");
        }
        	
        if(numero > 0 ) {
        	System.out.println(numero+" "+medicion+" de "+nombre+" crudo.");
        }
        else {
        	System.out.println(nombre+" a gusto.");
        }
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

	private String replace(String stat) {
		stat.replace("=", "==");
		stat.replace("<>", "!=");
		stat.replace("AND", "&&");
		stat.replace("OR", "&&");
		return stat;
	}
	
	@Override
	public Object visitUtencilio(CookParserParser.UtencilioContext ctx) {
        String nombre = ctx.PALABRA().getText();
        if (!_vars.containsKey(nombre)) {
                _vars.put(nombre, "UTENCILIO_TYPE");
        } else {
                throw new IllegalArgumentException("Ya tenemos la variable '" + nombre + "'");
        }
            System.out.println("Un " + nombre);
        return null;
    }
	@Override
	public Object visitAparato(CookParserParser.AparatoContext ctx) {
        String nombre = ctx.PALABRA().getText();
        if (!_vars.containsKey(nombre)) {
                _vars.put(nombre, "APARATO_TYPE");
        } else {
                throw new IllegalArgumentException("Ya tenemos la variable '" + nombre + "'");
        }
            System.out.println("1 " + nombre);
        return null;
    }
	
	@Override
	public Object visitRecipiente(CookParserParser.RecipienteContext ctx) {
        String nombre = ctx.PALABRA().getText();
        if (!_vars.containsKey(nombre)) {
                _vars.put(nombre, "RECIPIENTE_TYPE");
        } else {
                throw new IllegalArgumentException("Ya tenemos la variable '" + nombre + "'");
        }
            System.out.println("1 " + nombre);
        return null;
	}
	@Override
	/**
     * Sirve para encender algunos aparatos a una temperatura indicada.
     */
    public Object visitEncender(CookParserParser.EncenderContext ctx) {
        String aparato = ctx.PALABRA().getText();
        int numero = Integer.parseInt(ctx.NUMERO().getText());
        String temperatura = ctx.MEDIDA_TEMPERATURA().getText();

        System.out.println("Encender el "+aparato+" a "+numero+" "+temperatura);
        return null;
    }
	@Override
	public Object visitCortar(CookParserParser.CortarContext ctx) {
        String utencilio = ctx.PALABRA(0).getText();
        String ingrediente = ctx.PALABRA(1).getText();
        if (!_vars.get(ingrediente).equals("UTENCILIO_TYPE") && !_vars.get(ingrediente).equals("APARATO_TYPE") && !_vars.get(ingrediente).equals("RECIPIENTE_TYPE") && !_vars.get(ingrediente).equals("LIQUID_TYPE")) {
            System.out.println("Corte el ingrediente "+ingrediente+" con el utencilio "+utencilio);
        }
        else {
            throw new IllegalArgumentException("La variable '" + ingrediente + "' no se puede cortar");
        }
        return null;

	}

	
	@Override
	public 	String visitHervir(CookParserParser.HervirContext ctx) {
		String recipiente = ctx.PALABRA(1).getText();
		String item = ctx.PALABRA(0).getText();
		Boolean mezc=false;
		//Veo si esta la variable y si es recipiente
		if(!_vars.get(recipiente).equals("RECIPIENTE_TYPE")) {
    		throw new IllegalArgumentException("No tenemos un recipiente llamado "+recipiente);
		}
		//veo si esta el item a hervir
		if (!_vars.containsKey(item)) {
    		throw new IllegalArgumentException("No tenemos un liquido llamado "+item);
		}
		else {
			//veo si no existe la mezcla o no es liquido
			if(!(_mezc.containsKey(item) || _vars.get(item).equals("LIQUID_TYPE"))) {
	    		throw new IllegalArgumentException("No tenemos un liquido o mezcla llamado "+item+". ");
			}
			else {
				//si es mezcladebe tener liquido		
				if(_mezc.containsKey(item)) {
					mezc=true;//flag para ser flojo
					ArrayList<String> items_mezcla= _mezc.get(item);
					Boolean flag = false;//falg es true si tiene un liquido al menos
					for(String id: items_mezcla) {
						if(!_vars.get(id).equals("LIQUID_TYPE"))
							flag=true;
					}
					if(!flag)
						throw new IllegalArgumentException("La mezcla "+item+" no tiene líquidos, no se puede hervir");
				
				
				}
				
				//veo si es liquido
				else {
					if(!_vars.get(item).equals("LIQUID_TYPE")) {
						throw new IllegalArgumentException(item + " no es un liquido");
					}
				}
			}
		}
		if(mezc) {
			ArrayList<String> items_mezcla= _mezc.get(item);
			for(String id: items_mezcla) {
//				if(_vars.get(id).equals("LIQUID_TYPE"))
//					_states.put(id, "BOUILLE");
//				else
					_states.put(id, "CUIT");
			}
			System.out.println("Se ha Cocido la mezcla "+item);
		}
		else {
			_states.put(item, "BOUILLE");
			System.out.println("Se ha hervido el/la "+item);

		}
		return null;
	}
}
