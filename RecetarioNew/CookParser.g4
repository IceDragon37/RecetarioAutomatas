grammar CookParser;

import CookLexer;


receta	: iniciar_cocina tiempo porciones ingrediente+ utencilio+ aparato+ recipiente+ accion* finalizar_cocina;

iniciar_cocina		: PREPARARINGREDIENTES;

finalizar_cocina	: FINCOCINA; 
 
//-----------------------TIEMPO QUE DEMORA LA RECETA-------------------------

tiempo : TIEMPODECLARACION NUMERO MEDIDAS_TIEMPO ;

//----------------------PORCIONES(CANTIDAD DE PERSONAS)----------------------

porciones	: NUMERO PORCION_TYPE;

//-------------------------DECLARACION DE VARIABLES--------------------------

ingrediente		: DECLARACION tipo_ingrediente PALABRA NUMERO? MEDICION 
							;

tipo_ingrediente	: CARNE_TYPE
					| PESCADO_TYPE 
					| CONDIMENTO_TYPE
					| VEGETAL_TYPE
					| LEGUMBRE_TYPE
					| LIQUID_TYPE
					| LACTEO_TYPE
					| CEREAL_TYPE
					;
				
aparato			:  APARATO_TYPE PALABRA;

recipiente		: RECIPIENTE_TYPE PALABRA;
				
utencilio	 	: UTENCILIO_TYPE PALABRA ;

//-----------------------ACCIONES Y FUNCIONES--------------------------------

accion		: operaciones
    		| quehacersi
    		| ciclosinfin
    		;


operaciones		: hervir 
				| mezclar
				| yo_creo_que_van_a_pelear_con_cuchillos
				| moler
				| pelar
				| servir 
				| cortar
				| declararcorte
				;



precalentar : PREHOT PAR_IZ PALABRA COMA NUMERO MEDIDA_TEMPERATURA PAR_DE ;

encender: ENCENDER PAR_IZ PALABRA COMA NUMERO MEDIDA_TEMPERATURA PAR_DE ; 

macerar	: MACERAR PAR_IZ PALABRA COMA PALABRA MENOR PALABRA (COMA PALABRA)* MAYOR NUMERO MEDIDAS_TIEMPO PAR_DE ; //FUENTE EN LA QUE SE AMACERA + LIQUIDO QUE SE AMACERA + INGREDIENTES + TIEMPO 

rallar 	: RALLAR PAR_IZ PALABRA PAR_DE ;

mezclar	: GIRO PAR_IZ PALABRA (COMA PALABRA)+ PAR_DE IGUALAR PALABRA ;

moler	: MOLER PAR_IZ PALABRA COMA PALABRA PAR_DE ;		
		
pelar 	: PELAR PAR_IZ PALABRA PAR_DE ;

servir 	: SERVIR PAR_IZ PALABRA PAR_DE ;		

hervir 	: HERVIR PAR_IZ PALABRA COMA PALABRA PAR_DE ;

declararcorte: CORTE_TYPE PALABRA;

cortar	: CORTAR PAR_IZ PALABRA COMA PALABRA PAR_DE ;

yo_creo_que_van_a_pelear_con_cuchillos: DUELO_A_MUERTE_CON_CUCHILLOS PALABRA PAR_IZ PALABRA (COMA PALABRA)* PAR_DE ; //funcion que se encarga de cortar todo lo que se le ingresa

condicion 	: PALABRA (DISTINGUIR | IGUALAR) ESTADO ;

quehacersi	: SI PAR_IZ condicion PAR_DE DO accion+ STOP ;

ciclosinfin : WAITING PAR_IZ condicion PAR_DE LLAVEIZQ accion+	LLAVEDER ;


//-------------------FOR PENDIENTE-------



