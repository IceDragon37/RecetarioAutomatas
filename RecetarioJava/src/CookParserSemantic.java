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
/**
* funcion que sirve para inicializar la compilacion
*/
	@Override
    public Object visitIniciar_cocina(CookParserParser.Iniciar_cocinaContext ctx) {
	    	if(ctx.PREPARARINGREDIENTES().getText().equals("COMMENCER_LA_RECETTE"))    {
	    		System.out.println("Bienvenidos, comencemos a cocinar esta receta!");
			System.out.println(" ");

		}
	    return null;
	}

	/**
	 * funcion que sirve para finalizar la compilacion
	 */
	@Override
	public Object visitFinalizar_cocina(CookParserParser.Finalizar_cocinaContext ctx) {
	    	if(ctx.FINCOCINA().getText().equals("ACHEVEMENT_RECETTE"))    {
	    		System.out.println("");
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

		if(tipo.equals("MEZCLA"))
			return "MEZCLA_TYPE";

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


	/**
	 * Verifica que se ingrese un tiempo de estimacion de cuanto demora la receta
	 * Ademas verifica la medida en la que se ingresa
	 */
	@Override
	public Object visitTiempo(CookParserParser.TiempoContext ctx) {
        int numero = Integer.parseInt(ctx.NUMERO().getText());
        String medida = ctx.MEDIDAS_TIEMPO().getText();

        System.out.println("El tiempo promedio para la elaboracion de la receta es: "+ numero + " "+medida);
		return null;
	}

	/**
	 * Verifica que se ingresa una cantidad de personas 
	 */
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
		System.out.println("Los ingredientes, utencilios, aparatos y recipientes son los siguientes: ");
		return null;
	}

	/**
	 * Valida la creacion de un ingrediente, asegurandose que no exista previamente 
	 * Ademas tambien verifica el tipo de ingrediente y sus cantidades y medidas
	 */
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
        	System.out.println(numero+" "+medicion+" de "+nombre+" en estado crudo.");
        }
        else {
        	System.out.println(nombre+" a gusto.");
        }
		return null;
	}

	/**
	 * Valida la creacion de un utencilio, asegurandose que no exista previamente 
	 */
	@Override
	public Object visitUtencilio(CookParserParser.UtencilioContext ctx) {
        String nombre = ctx.PALABRA().getText();
        if (!_vars.containsKey(nombre)) {
                _vars.put(nombre, "UTENCILIO_TYPE");
        } else {
                throw new IllegalArgumentException("Ya tenemos la variable '" + nombre + "'");
        }
            System.out.println("1 " + nombre);
        return null;
    }
	
	/**
	 * Valida la creacion de un aparato, asegurandose que no exista previamente 
	 */
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
	
	/**
	 * Valida la creacion de un recipiente, asegurandose que no exista previamente 
	 */
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
        if(!_vars.containsKey(aparato)) {
            throw new IllegalArgumentException("No esta declarada la variable '"+aparato+"'");
        }
        if(!_vars.get(aparato).equals("APARATO_TYPE")) {
            throw new IllegalArgumentException("La variable '"+aparato+"' no es un aparato");
        }
        System.out.println("");
        System.out.println("Encender el aparato "+aparato+" a "+numero+" grado(s) "+temperatura);
        return null;
    }
	/**
	 * Funcion cortar recibe un tipo ingrediente y un tipo corte que debe realizarse sobre ese ingrediente.
	 */
	@Override
    public Object visitCortar(CookParserParser.CortarContext ctx) {
        String ingrediente = ctx.PALABRA(0).getText();
        String tipo_corte = ctx.PALABRA(1).getText();
        if(!_vars.containsKey(ingrediente)) {
            throw new IllegalArgumentException("No esta declarada la variable '"+ingrediente+"'");
        }//valida que la variable se encuentre y sea de tipo ingrediente
        else if(_vars.get(ingrediente).equals("CORTE_TYPE")
                || _vars.get(ingrediente).equals("UTENCILIO_TYPE")
                || _vars.get(ingrediente).equals("APARATO_TYPE")
                || _vars.get(ingrediente).equals("RECIPIENTE_TYPE")
                || _vars.get(ingrediente).equals("LIQUID_TYPE")) {
                    throw new IllegalArgumentException("'"+ingrediente+"' No es un tipo de variable ingrediente");
        }

        //verifica que la segunda variable exista y sea de tipo corte
        if(!_vars.containsKey(tipo_corte)) {
            throw new IllegalArgumentException("No esta declarada la variable '"+tipo_corte+"'");
        }
        else if(!_vars.get(tipo_corte).equals("CORTE_TYPE")) {
            throw new IllegalArgumentException("'"+tipo_corte+"' No es un tipo de variable CORTE");
        }

        System.out.println("");
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
				//si es mezcla debe tener liquido
				if(_mezc.containsKey(item)) {
					mezc=true;//flag para ser flojo
					ArrayList<String> items_mezcla= _mezc.get(item);
					Boolean flag = false;//falg es true si tiene un liquido al menos
					for(String id: items_mezcla) {
						if(!_vars.get(id).equals("LIQUID_TYPE"))
							flag=true;
					}
					if(!flag)
						throw new IllegalArgumentException("La mezcla "+item+" no tiene liquidos, no se puede hervir");


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
			System.out.println("");
			System.out.println("Cocer la mezcla "+item);
		}
		else {//los liquidos solos se hierven
			_states.put(item, "HERVIDO");
			System.out.println("");
			System.out.println("Hervir el liquido "+item);

		}
		return null;
	}
	
	/**
	 * Se encarga de verificar que se ingresen ingredientes y utencilios para moler
	 */
	@Override
	public Object visitMoler(CookParserParser.MolerContext ctx) {
		String item = ctx.PALABRA(0).getText();
		String utencilio = ctx.PALABRA(1).getText();

		if(!_vars.containsKey(item)) {
    		throw new IllegalArgumentException("'"+item+"' No se encuentra definida la variable.");
		}
		else {//si la variable existe verifica que sea un ingrediente.
			if(_vars.get(item).equals("CORTE_TYPE") || _vars.get(item).equals("UTENCILIO_TYPE") || _vars.get(item).equals("APARATO_TYPE") || _vars.get(item).equals("RECIPIENTE_TYPE") || _vars.get(item).equals("LIQUID_TYPE")) {
				throw new IllegalArgumentException("'"+item+"' No es una variable de tipo ingrediente o es un liquido.");
			}
		}
		if(!_vars.containsKey(utencilio)) {
    		throw new IllegalArgumentException("'"+utencilio+"' No se encuentra definida la variable.");

		}
		else {//si la variable existe verifica que sea un utencilio.
			if(!_vars.get(utencilio).equals("UTENCILIO_TYPE")){
			throw new IllegalArgumentException("'"+utencilio+"' No es una variable de tipo UTENCILIO.");
			}
		}
		System.out.println("");
		System.out.println("Utilizando el utencilio "+utencilio+" moler "+item+" hasta que estime conveniente.");

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
		System.out.println("");
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
		System.out.println("");
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
		System.out.println("");
		System.out.println("Precalentar el aparato "+item+" a "+numero+" grado(s) "+temperatura);
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

		System.out.println("");
		System.out.println("Usar el recipiente "+recipiente+" para macerar con "+liquido+" durante "+numero+" "+medidas+" los siguientes ingredientes: ");
		for(int i=0;i<ingredientes.size(); i++) {
			System.out.println("-"+ingredientes.get(i));
		}

		return null;
	}

	/**
	 * Esta funcion recibe un utencilio que se usara para hacer los cortes
	 * Ademas puede recibir muchos ingredientes y validarlos todos.
	 */
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

		System.out.println("");
		System.out.println("Utilizar el utencilio "+utencilio+" para cortar a gusto todos los ingredientes listados a continuacion: ");

		for(int i=0;i<ingredientes.size(); i++) {
			System.out.println("-"+ingredientes.get(i));
		}

		return null;
	}

	@Override
	public Object visitPelar(CookParserParser.PelarContext ctx) {
		String ingrediente = ctx.PALABRA().getText();
        if (!_vars.get(ingrediente).equals("UTENCILIO_TYPE") && !_vars.get(ingrediente).equals("APARATO_TYPE") && !_vars.get(ingrediente).equals("RECIPIENTE_TYPE") && !_vars.get(ingrediente).equals("LIQUID_TYPE") && !_vars.get(ingrediente).equals("CARNE_TYPE") && !_vars.get(ingrediente).equals("CONDIMENTO_TYPE") && !_vars.get(ingrediente).equals("CEREAL_TYPE") && !_vars.get(ingrediente).equals("LACTEO_TYPE")) {
        	System.out.println("");
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

		String comparativa = comparar(ctx.comparar().getText());
		String estado = ctx.ESTADO().getText();
		String estado_ing=null;
		boolean flag = false;
		if(!_vars.containsKey(ing))
			throw new IllegalArgumentException("No esta declarada la variable '"+ing+"'");
		String tipo= _vars.get(ing);
		//ver que sea ingrediente para comparar
		if(tipo.equals("APARATO_TYPE") ||tipo.equals("RECIPIENTE_TYPE") || tipo.equals("UTENCILIO_TYPE")|| tipo.equals("CORTE_TYPE")) {
			throw new IllegalArgumentException("La variable "+ing+" no es un ingrediente");
		//si no es liquido no es compatible con hervir
		}
		/*if(!estado.equals("BOUILLE") || !estado.equals("CUIT") || !estado.equals("BRUT")) {
			throw new IllegalArgumentException("La variable "+estado+" no es un estado de ingrediente");
		}*/

		if(estado.equals("BOUILLE") && !tipo.equals("LIQUID_TYPE")) {
			throw new IllegalArgumentException("La variable "+ing+" no se puede hervir.");
		}

		if(estado.equals("BOUILLE"))
			estado = "HERVIDO";

		if(estado.equals("CUIT"))
			estado = "COCIDO";

		if(estado.equals("BRUT"))
				estado = "CRUDO";
		if(_states.containsKey(ing)) {
			estado_ing = _states.get(ing);
		}
		if(estado_ing.equals(estado))
			flag = true;
		//if(flag) {
		//	if(comparativa.equals("DISTINGUIR"))
		//		System.out.println("Debe evitar que el/la "+ ing + " se encuentre "+estado);

		//	if(comparativa.equals("IGUALDAD"))
		//		System.out.println("Cuando el/la "+ing+" se encuentra "+estado+" entonces hacer lo siguiente");
		//}
		//else {
			//System.out.println("La comparacion no se ha cumplido. Oh no!!");
		//}
		return flag;//este flag sera utilizado en las funciones de quehacersi y ciclosinfin para delimitar la entrada de la condicion 
		
	}

	private String comparar(String queES) {

		if(queES.equals("NOPE"))
			return "DISTINGUIR";
		if(queES.equals("="))
			return "IGUALDAD";

		throw new IllegalArgumentException(queES+" no es un operador de desigualdad");
	}

	/**
	 *RECIBE VARIOS INGREDIENTE Y LOS GUARDA EN UNA LISTA 
	 * SE CREA UNA VARIABLE MEZCLA Y SE LE ASOCIA LA LISTA DENTRO DE UN MAPA 
	 */
	@Override
	public Object visitMezclar(CookParserParser.MezclarContext ctx) {
		ArrayList<String> ingredientes = new ArrayList<String>();
		int i;
		for(i=0;i<ctx.PALABRA().size() - 1; i++) {
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

		System.out.println("");
		System.out.println("Hacer una mezcla con los siguientes ingredientes: ");
		for(int j=0;j<ingredientes.size(); j++) {
			System.out.println("-"+ingredientes.get(j));
		}

		_mezc.put(ctx.PALABRA(i).getText(), ingredientes);
		_vars.put(ctx.PALABRA(i).getText(), "MEZCLA_TYPE");
		return null;
	}

//-------------------------DE ACA PARA ABAJO ES ADMINISTRATIVO--------------------
	
//----------------------------OPERACIONES------------------------------------------
	@Override
	public Object visitOperaciones(CookParserParser.OperacionesContext ctx) {
        //veo si existe el contexto de alguna de las operaciones y llama el visit de la accion.
        if(ctx.hervir() != null)
            visitHervir(ctx.hervir());
        else{
            if(ctx.mezclar() != null)
            visitMezclar(ctx.mezclar());
        else{
            if(ctx.yo_creo_que_van_a_pelear_con_cuchillos() != null)
            visitYo_creo_que_van_a_pelear_con_cuchillos(ctx.yo_creo_que_van_a_pelear_con_cuchillos());
        else{
            if(ctx.moler() != null)
            visitMoler(ctx.moler());
        else{
            if(ctx.pelar() != null)
            visitPelar(ctx.pelar());
        else{
            if(ctx.servir() != null)
            visitServir(ctx.servir());
        else{
            if(ctx.cortar() != null)
            visitCortar(ctx.cortar());
        else{
            if(ctx.declararcorte() != null)
            visitDeclararcorte(ctx.declararcorte());
        else{
            if(ctx.encender() != null)
            visitEncender(ctx.encender());
        else{
            if(ctx.precalentar() != null)
            visitPrecalentar(ctx.precalentar());
        else{
            if(ctx.macerar() != null)
            visitMacerar(ctx.macerar());
        else{
            if(ctx.rallar() != null)
                visitRallar(ctx.rallar());
        }}}}}}}}}}}
        return null;
    }

//--------------------------FUNCION CONDICIONAL--------------------------- 
	@Override
	public Object visitQuehacersi(CookParserParser.QuehacersiContext ctx) {

		Object flag = visitCondicion(ctx.condicion());
		if((boolean)flag) {
			for(int i=0 ;i < ctx.accion().size() ; i++) {
				visitAccion(ctx.accion(i));
			}
		}
		return null;
	}

	//-----------------------ACCIONES---------------------------------------
	@Override
	public Object visitAccion(CookParserParser.AccionContext ctx) {
		 if(ctx.operaciones() != null)
	            visitOperaciones(ctx.operaciones());
	        else{
	            if(ctx.quehacersi() != null)
	            visitQuehacersi(ctx.quehacersi());
	        else{
	            if(ctx.ciclosinfin() != null)
	            visitCiclosinfin(ctx.ciclosinfin());
	        	}
	        }
		 return null;
	}

	//-------------------------------FUNCION ITERATIVA------------------------
	@Override
	public Object visitCiclosinfin(CookParserParser.CiclosinfinContext ctx) {
		Object flag = visitCondicion(ctx.condicion());
		while((boolean)flag){
			for(int i=0 ;i < ctx.accion().size() ; i++) {
				visitAccion(ctx.accion(i));
				flag = visitCondicion(ctx.condicion());
			}
		}
		return null;
	}
}
