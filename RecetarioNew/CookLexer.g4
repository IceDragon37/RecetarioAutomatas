lexer grammar CookLexer;

fragment COCIDO	: 'CUIT'		;
fragment CRUDO	: 'BRUT'		;
fragment HERVIDO: 'BOUILLE'		;
fragment NAT		: [0-9]		;
fragment PUNTO		: '.'		;

FLOAT 	: NAT+ PUNTO NAT+				;
NUMERO	: NAT+	|	FLOAT				;
ESTADO 	: COCIDO | CRUDO | HERVIDO		;
STRING 	: '"' .*? '"'					;
COMMENT	:  '!' .*? '\r'? '\n' -> skip	;
WS 		: [ \t\r\n]+ -> skip 			;


//-----------INCIO Y FIN DE LA RECETA----------------

PREPARARINGREDIENTES		: 'COMMENCER_LA_RECETTE'  	;
FINCOCINA					: 'ACHEVEMENT_RECETTE'   	;

//---------------CONDICIONES Y CICLOS---------------

SINO 		: 'AUTRE'		;
WAITING 	: 'ATTENDRE'	;
DO 			: 'FAIRE'		;
STOP		: 'ARRETEZ'		;
ENDWAIT		: 'RETOUR'		;
SI	 		: 'SI'			; 
	
//-------------VARIABLES Y MEDICIONES----------------
 
MEDICION 		    : 'ONZ.' | 'gr.' | 'cc.' | 'tbsp' | 'PIECES'| 'grs.' | 'a_gusto'	;
CONDIMENTO_TYPE		: 'CONDIMENTOS'					        ;
DECLARACION			: 'INGREDIENT'					        ;
CARNE_TYPE 		   	: 'CARNE'						        ;
VEGETAL_TYPE 	   	: 'VEGETAL'					       	    ;
LEGUMBRE_TYPE 	 	: 'LEGUMBRE'					        ;
PESCADO_TYPE 	   	: 'PESCADO'						        ;
LIQUID_TYPE		   	: 'LIQUIDO'					        	;
LACTEO_TYPE			: 'LACTEO'								;
CEREAL_TYPE			: 'CEREAL'								;
RECIPIENTE_TYPE  	: 'RECIPIENTE'					        ;
CORTE_TYPE		  	: 'CORTE'						        ;
MEDIDAS_TIEMPO	 	: 'HRS' | 'S' | 'MIN'| 'DIAS'	  		;
APARATO_TYPE	   	: 'APARATO'						        ;
PORCION_TYPE		: 'PERSONA' | 'PERSONAS'				;
UTENCILIO_TYPE		: 'UTENCILIO'							;
MEDIDA_TEMPERATURA 	: '°C' | '°F'							;
TIEMPODECLARACION	: 'TEMPS'						 	 	;



CUCHILLO	:	UTENCILIO_TYPE;
 
ESCRIBIR 	: 'ANOTAR'	  ;
LEER 		: 'INGRESE'	  ;

PAR_DE 		: ')';
PAR_IZ		: '(';
COMA		: ',';
PTOCOMA		: ';';
CORDER		: ']';
CORIZQ		: '[';
LLAVEIZQ	: '{';
LLAVEDER	: '}';


//-------OPERADORES LOGICOS-------

AND			: 'Y';
OR 			: 'O';


//-----------FUNCIONES------------

MAS			: 'AGREGAR'				    ;
MENOS		: 'QUITAR'				    ;
PARTIR		: 'PARTIR'				    ;
PELAR		: 'PELAR'				    ;
ENCENDER	: 'ENCENDER'			    ;
PREHOT		: 'PRECALENTAR'			    ;
HERVIR 		: 'HERVIR'				    ;
MACERAR		: 'MACERAR'				    ;
AMASAR		: 'AMASAR'				    ;
GIRO		: 'MEZCLAR'    			    ;
MOLER		: 'MOLER'				    ;
SERVIR		: 'SERVIR'				    ;
UNTAR	  	: 'UNTAR' | 'ENGRASAR'		;
EMPANIZAR	: 'EMPANIZAR'			    ;
RALLAR		: 'RALLAR'					;
CORTAR		: 'CORTAR'					;

//---POR LOS LOLES, CORTA TODO---
DUELO_A_MUERTE_CON_CUCHILLOS: '¿DUELO-A-MUERTE-CON-CUCHILLOS?';

//-----------FUNCIONES MATEMAGICAS-----------

IGUALAR		   : '='			;
DISTINGUIR	   : '!='			;
MAYOR 		   : '>'			;
MENOR		   : '<'			;
MAYEQ		   : '>='			;
MENEQ		   : '<='			;
NOMBREVAR	   : '$'			;


//--------------------POR EL EXTRA----------

PALABRA			: [a-zA-Z]+ 						;
