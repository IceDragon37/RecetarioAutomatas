grammar CookParser;

import CookLexer;


receta	: iniciar_cocina tiempo porciones ingrediente+ utencilio+ aparato+ recipiente+ accion+ finalizar_cocina
		;

//-----------------------TIEMPO QUE DEMORA LA RECETA-------------------------
tiempo		: NUMERO MEDIDAS_TIEMPO PUNTO;

//----------------------PORCIONES(CANTIDAD DE PERSONAS)----------------------

porciones	: NUMERO PORCION_TYPE;

//-------------------------DECLARACION DE VARIABLES--------------------------

ingrediente		: DECLARACION tipo_ingrediente NUMERO MEDICION PALABRA SALTOLINEA
							;

tipo_ingrediente	: CARNE_TYPE
					| PESCADO_TYPE
					| CONDIMENTO_TYPE
					| VEGETAL_TYPE
					| LEGUMBRE_TYPE
					| LIQUID_TYPE
					;
				


aparato			:  APARATO_TYPE PALABRA;

recipiente		: RECIPIENTE_TYPE PALABRA;
				
utencilio	 	: UTENCILIO_TYPE PALABRA ;

accion		: operaciones
    		| quehacersi
    		| ciclosinfin
    		;

iniciar_cocina		: PREPARARINGREDIENTES
					;

finalizar_cocina	: FINCOCINA
					;

operaciones		: hervir 
				| mezclar
				| yo_creo_que_van_a_pelear_con_cuchillos
				| moler
				| pelar
				| servir 
				;

mezclar	: GIRO PAR_IZ PALABRA (COMA PALABRA)+ PAR_DE IGUALAR PALABRA SALTOLINEA;

moler	: MOLER PAR_IZ PALABRA COMA PALABRA PAR_DE SALTOLINEA;		
		
pelar 	: PELAR PAR_IZ PALABRA PAR_DE SALTOLINEA;

servir 	: SERVIR PAR_IZ PALABRA PAR_DE SALTOLINEA;		

hervir : HERVIR PAR_IZ PALABRA COMA PALABRA PAR_DE;

yo_creo_que_van_a_pelear_con_cuchillos: DUELO_A_MUERTE_CON_CUCHILLOS CUCHILLO PALABRA (COMA PALABRA)* SALTOLINEA; //funcion que se encarga de cortar todo lo que se le ingresa

condicion 	: PALABRA (DISTINGUIR | IGUALAR) ESTADO ;

quehacersi:  SI PAR_IZ condicion PAR_DE DO accion+ STOP ;

ciclosinfin : WAITING PAR_IZ condicion PAR_DE LLAVEIZQ accion+	LLAVEDER ;


//_------------------FOR PENDIENTE-------
