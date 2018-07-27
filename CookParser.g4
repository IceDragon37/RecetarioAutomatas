grammar CookParser;

import CookLexer;


receta	: iniciar_cocina tiempo porciones ingredientes accion+ finalizar_cocina
		;

//-----------------------TIEMPO QUE DEMORA LA RECETA-------------------------
tiempo		: NUMBER MEDIDAS_TIEMPO PUNTO;

//----------------------PORCIONES(CANTIDAD DE PERSONAS)----------------------

porciones	: NUMERO PORCION_TYPE;

//-------------------------DECLARACION DE VARIABLES--------------------------

// quiero considerar el hecho de que hay que poner talvez los numero de ingrediente como variables.

ingredientes: DECLARACION tipo_ingrediente NUMERO MEDICION
							;

tipo_ingrediente: 	CARNE_TYPE
									| PESCADO_TYPE
									| CONDIMENTO_TYPE
									| VEGETAL_TYPE
									| LEGUMBRE_TYPE
									| LIQUID_TYPE
									;

tipo_utencilio:		RECIPIENTE_TYPE
								| APARATO_TYPE
								;

accion		: declarar
    		| operacion
    		| lectura
    		| escribe
    		| quehacersi
    		| asignacion
    		| operacion_logica
    		| ciclosinfin
    		| cicloconfin
    		;

iniciar_cocina		: BEGIN
					;

finalizar_cocina	: END
					;

operacion		: PALABRA
				| operacion OPER operacion
				| RANDOM PAR_IZ NUMBER COMMA NUMBER PAR_DE
            	| ABS PAR_IZ operacion PAR_DE
            	| CUADRADO PAR_IZ operacion PAR_DE
            	| RAIZ PAR_IZ operacion PAR_DE
				;

operacion_logica 	: operacion AND operacion
            		| operacion OR operacion;

declarar        : VAR tipo_variable PALABRA PTOCOMMA
				| CONST tipo_variable PALABRA PTOCOMMA
                ;

asignacion 		: PALABRA ASIGNACION valores ;

tipo_variable   : INT_TYPE
                | REAL_TYPE
                | STRING_TYPE
                | BOOL_TYPE
                ;

valores 		: PALABRA
				| NUMBER
				| STRING
				| BOOLEAN
				| FLOAT
				;

lectura: READ_RW PAR_IZ PALABRA PAR_DE PTOCOMMA;

escribe: WRITE_RW PAR_IZ PALABRA PAR_DE PTOCOMMA;


quehacersi 	: IF PAR_IZ condicion PAR_DE CORIZQ accion CORDER
			 (ELIF PAR_IZ condicion PAR_DE CORIZQ accion CORDER)*
			 (ELSE CORIZQ accion CORDER)?
			;

condicion	: operacion
			| STRING comparacion STRING
			| NUMBER comparacion NUMBER
			| PALABRA comparacion PALABRA
			| PALABRA comparacion NUMBER
			| NUMBER comparacion PALABRA
			;

comparacion : MAYOR
			| MENOR
			| EQUAL
			| DIST
			| MAYEQ
			| MENEQ
			;

ciclosinfin : WHILE PAR_IZ condicion PAR_DE CORIZQ accion CORDER;

cicloconfin : FOR PAR_IZ condicionfor PAR_DE CORIZQ accion CORDER;

condicionfor: asignacion CASH mientras CASH PALABRA MAS MAS
			| asignacion CASH mientras CASH PALABRA MENOS MENOS
			;

mientras 	: PALABRA comparacion (PALABRA | NUMBER);
