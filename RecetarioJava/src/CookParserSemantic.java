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

//	private String getVarType(String var_type) {
//		if(var_type.equals("entero") || var_type.equals("logico"))
//			return "int";
//		else if(var_type.equals("real"))
//			return "float";
//		else
//			return "char";
//	}
//
//	private String replace(String stat) {
//		stat.replace("=", "==");
//		stat.replace("<>", "!=");
//		stat.replace("AND", "&&");
//		stat.replace("OR", "&&");
//		return stat;
//	}
	
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
        String ingrediente = ctx.PALABRA(0).getText();
        String tipo_corte = ctx.PALABRA(1).getText();
        if(!_vars.containsKey(ingrediente)) {
            throw new IllegalArgumentException("No esta declarada la variable '"+ingrediente+"'");
        }
        else if(_vars.get(ingrediente).equals("CORTE_TYPE") 
                || _vars.get(ingrediente).equals("UTENCILIO_TYPE") 
                || _vars.get(ingrediente).equals("APARATO_TYPE") 
                || _vars.get(ingrediente).equals("RECIPIENTE_TYPE") 
                || _vars.get(ingrediente).equals("LIQUID_TYPE")) {
                    throw new IllegalArgumentException("'"+ingrediente+"' No es un tipo de variable ingrediente");
        }


        if(!_vars.containsKey(tipo_corte)) {
            throw new IllegalArgumentException("No esta declarada la variable '"+tipo_corte+"'");
        }
        else if(!_vars.get(tipo_corte).equals("CORTE_TYPE")) {
            throw new IllegalArgumentException("'"+tipo_corte+"' No es un tipo de variable CORTE");
        }

        System.out.println("Corte el ingrediente "+ingrediente+" con el metodo "+tipo_corte);

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
		if(mezc) {//las mezclas se cocinan
			ArrayList<String> items_mezcla= _mezc.get(item);
			for(String id: items_mezcla) {
//				if(_vars.get(id).equals("LIQUID_TYPE"))
//					_states.put(id, "BOUILLE");
//				else
					_states.put(id, "COCIDO");
			}
			System.out.println("Se ha Cocido la mezcla "+item);
		}
		else {//los liquidos solos se hierven
			_states.put(item, "HERVIDO");
			System.out.println("Se ha hervido el/la "+item);

		}
		return null;
	}
	@Override
	public Object visitMoler(CookParserParser.MolerContext ctx) {
		String item = ctx.PALABRA(0).getText();
		String utencilio = ctx.PALABRA(1).getText();
		
		if(!_vars.containsKey(item)) {
    		throw new IllegalArgumentException("'"+item+"' No se encuentra definida la variable.");
		}
		else {
			if(_vars.get(item).equals("CORTE_TYPE") || _vars.get(item).equals("UTENCILIO_TYPE") || _vars.get(item).equals("APARATO_TYPE") || _vars.get(item).equals("RECIPIENTE_TYPE") || _vars.get(item).equals("LIQUID_TYPE")) {
				throw new IllegalArgumentException("'"+item+"' No es una variable de tipo ingrediente.");
			}
		}
		if(!_vars.containsKey(utencilio)) {
    		throw new IllegalArgumentException("'"+utencilio+"' No se encuentra definida la variable.");

		}
		else {
			if(!_vars.get(utencilio).equals("UTENCILIO_TYPE")){
			throw new IllegalArgumentException("'"+utencilio+"' No es una variable de tipo UTENCILIO.");
			}
		}
		System.out.print("Utilizando el "+utencilio+" moler "+item+" hasta que estime conveniente.");

		return null;
	}
	
	@Override
	public Object visitServir(CookParserParser.ServirContext ctx) {
		String item = ctx.PALABRA().getText();
		
		if(!_vars.containsKey(item)) {
    		throw new IllegalArgumentException("'"+item+"' No se encuentra definida la variable.");
		}
		else {
			if(_vars.get(item).equals("CORTE_TYPE") || _vars.get(item).equals("UTENCILIO_TYPE") || _vars.get(item).equals("APARATO_TYPE") || _vars.get(item).equals("RECIPIENTE_TYPE") || _vars.get(item).equals("LIQUID_TYPE")) {
				throw new IllegalArgumentException("'"+item+"' No es una variable de tipo ingrediente.");
			}
		}	
		System.out.println("El plato de "+item+" esta listo!!");
		
		return null;
	}
	@Override
	public Object visitDeclararcorte(CookParserParser.DeclararcorteContext ctx) {
		String corte = ctx.PALABRA().getText();
		
		if (!_vars.containsKey(corte)) {
            _vars.put(corte, "CORTE_TYPE");
		} else {
            throw new IllegalArgumentException("Ya tenemos la variable '" +corte+ "'");
		}
		System.out.println("Se necesita realizar un corte de tipo "+corte);
		
		return null;
	}
	@Override
	public Object visitPrecalentar(CookParserParser.PrecalentarContext ctx) {
		String item = ctx.PALABRA().getText();
		int numero = Integer.parseInt(ctx.NUMERO().getText());
		String temperatura = ctx.MEDIDA_TEMPERATURA().getText();
		
		if(!_vars.containsKey(item)) {
			throw new IllegalArgumentException("No esta declarada la variable '"+item+"'");
		}
		else if(!_vars.get(item).equals("APARATO_TYPE")) {
    		throw new IllegalArgumentException("'"+item+"' No es un tipo de variable APARATO");
		}
		System.out.println("Precalentar el/la "+item+" a "+numero+" grado(s) "+temperatura);
		return null;
	}
	@Override
	public Object visitMacerar(CookParserParser.MacerarContext ctx) {
		String recipiente = ctx.PALABRA(0).getText();
		String liquido = ctx.PALABRA(1).getText();
		int numero = Integer.parseInt(ctx.NUMERO().getText());
		String medidas = ctx.MEDIDAS_TIEMPO().getText();
		ArrayList<String> ingredientes = new ArrayList<String>();
		for(int i=2;i<ctx.PALABRA().size(); i++) {
			String ing = ctx.PALABRA(i).getText();
			if(!_vars.containsKey(ing)) {
				throw new IllegalArgumentException("No esta declarada la variable '"+ing+"'");
			}
			else {
				if(_vars.get(ing).equals("APARATO_TYPE") || _vars.get(ing).equals("RECIPIENTE_TYPE") || _vars.get(ing).equals("UTENCILIO_TYPE") || _vars.get(ing).equals("CORTE_TYPE")) {
					throw new IllegalArgumentException("La variable '"+ing+"' no es de tipo ingrediente");
				}
			}
			ingredientes.add(ing);
		}
		
		if(!_vars.containsKey(recipiente)) {
			throw new IllegalArgumentException("No esta declarada la variable '"+recipiente+"'");
		}
		else if (!_vars.get(recipiente).equals("RECIPIENTE_TYPE")){
			throw new IllegalArgumentException("La variable '"+recipiente+"' no es de tipo RECIPIENTE");
		}
		
		if(!_vars.containsKey(liquido)) {
			throw new IllegalArgumentException("No esta declarada la variable '"+liquido+"'");
		}
		else if (!_vars.get(liquido).equals("LIQUID_TYPE")){
			throw new IllegalArgumentException("La variable '"+liquido+"' no es de tipo LIQUIDO");
		}
		
		System.out.println("Usar "+recipiente+" para macerar con "+liquido+" durante "+numero+" "+medidas+" los siguientes ingredientes: ");
		for(int i=2;i<ctx.PALABRA().size(); i++) {
			System.out.println("-"+ingredientes.get(i));
		}
		
		return null;
	}
	
	@Override
	public Object visitYo_creo_que_van_a_pelear_con_cuchillos(CookParserParser.Yo_creo_que_van_a_pelear_con_cuchillosContext ctx) {
		String utencilio = ctx.PALABRA(0).getText();
		ArrayList<String> ingredientes = new ArrayList<String>();
		for(int i=1;i<ctx.PALABRA().size(); i++) {
			String ing = ctx.PALABRA(i).getText();
			if(!_vars.containsKey(ing)) {
				throw new IllegalArgumentException("No esta declarada la variable '"+ing+"'");
			}
			else {
				if(_vars.get(ing).equals("APARATO_TYPE") || _vars.get(ing).equals("RECIPIENTE_TYPE") || _vars.get(ing).equals("UTENCILIO_TYPE") || _vars.get(ing).equals("CORTE_TYPE")) {
					throw new IllegalArgumentException("La variable '"+ing+"' no es de tipo ingrediente");
				}
			}
			ingredientes.add(ing);
		}
		
		if(!_vars.containsKey(utencilio)) {
			throw new IllegalArgumentException("No esta declarada la variable '"+utencilio+"'");
		}
		else if (!_vars.get(utencilio).equals("UTENCILIO_TYPE")){
			throw new IllegalArgumentException("La variable '"+utencilio+"' no es de tipo UTENCILIO");
		}
		
		System.out.println("NUNCA HABIA ESCUCHADO ESO");
		System.out.println("Utilizar el/la "+utencilio+" para cortar a gusto todos los ingredientes listados a continuacion: ");
		
		for(int i=1;i<ctx.PALABRA().size(); i++) {
			System.out.println("-"+ingredientes.get(i));
		}
		
		return null;
	}
	
	@Override
	public Object visitPelar(CookParserParser.PelarContext ctx) {
        String ingrediente = ctx.PALABRA().getText();
        if (!_vars.get(ingrediente).equals("UTENCILIO_TYPE") && !_vars.get(ingrediente).equals("APARATO_TYPE") && !_vars.get(ingrediente).equals("RECIPIENTE_TYPE") && !_vars.get(ingrediente).equals("LIQUID_TYPE") && !_vars.get(ingrediente).equals("CARNE_TYPE") && !_vars.get(ingrediente).equals("CONDIMENTO_TYPE") && !_vars.get(ingrediente).equals("CEREAL_TYPE") && !_vars.get(ingrediente).equals("LACTEO_TYPE")) {
            System.out.println("Pelar el ingrediente "+ingrediente);
        }
        else {
            throw new IllegalArgumentException("La variable '" + ingrediente + "' no se puede pelar");
        }

        return null;
    }
	@Override
	public Object visitCondicion(CookParserParser.CondicionContext ctx) {
		String ing = ctx.PALABRA().getText();
		String estado = ctx.ESTADO().getText();
		if(!_vars.containsKey(ing))
			throw new IllegalArgumentException("No esta declarada la variable '"+ing+"'");
		String tipo= _vars.get(ing);
		//ver que sea ingrediente para comparar
		if(tipo.equals("APARATO_TYPE") ||tipo.equals("RECIPIENTE_TYPE") || tipo.equals("UTENCILIO_TYPE")|| tipo.equals("CORTE_TYPE"))
			throw new IllegalArgumentException("La variable "+ing+" no es un ingrediente");
		//si no es liquido no es compatible con hervir
		if(estado.equals("HERVIDO") && !tipo.equals("LIQUID_TYPE"))
			throw new IllegalArgumentException("La variable "+ing+" no es un ingrediente");
		
		return null;
	}
	
	private Boolean comparar(CookParserParser.CondicionContext ctx) {
		String ing = ctx.PALABRA().getText();
		String estado = ctx.ESTADO().getText();
		String distinguir = ctx.DISTINGUIR().getText();
		String igualar = ctx.IGUALAR().getText();
		
		if(igualar.equals("="))
			if(!_states.get(ing).equals(estado))
				return false;
		if(distinguir.equals("!="))
			if(_states.get(ing).equals(estado))
				return false;
		return true;
	}

	@Override
	public Object visitOperaciones(CookParserParser.OperacionesContext ctx) {
		//veo si existe el contexto de alguna de las operaciones y llama el visit de la accion.
		if(!ctx.hervir().isEmpty()){
			visitHervir(ctx.hervir());
		}
		if(!ctx.mezclar().isEmpty()){
			visitMezclar(ctx.mezclar());
		}
		if(!ctx.yo_creo_que_van_a_pelear_con_cuchillos().isEmpty()){
			visitYo_creo_que_van_a_pelear_con_cuchillos(ctx.yo_creo_que_van_a_pelear_con_cuchillos());
		}
		if(!ctx.moler().isEmpty()){
			visitMoler(ctx.moler());
		}
		if(!ctx.pelar().isEmpty()){
			System.out.println("Linea 482");//testing

			visitPelar(ctx.pelar());
		}
		if(!ctx.servir().isEmpty()){
			visitServir(ctx.servir());
		}
		if(!ctx.cortar().isEmpty()){
			visitCortar(ctx.cortar());
		}
		if(!ctx.declararcorte().isEmpty()){
			visitDeclararcorte(ctx.declararcorte());
		}
		if(!ctx.encender().isEmpty()){
			visitEncender(ctx.encender());
		}
		if(!ctx.precalentar().isEmpty()){
			visitPrecalentar(ctx.precalentar());
		}
		if(!ctx.macerar().isEmpty()){
			visitMacerar(ctx.macerar());
		}
		if(!ctx.rallar().isEmpty()){
			visitRallar(ctx.rallar());
		}
		
		return null;
	}
}
