lexer grammar CookLexer;

fragment COCIDO	: 'CUIT'		;
fragment CRUDO	: 'BRUT'		;
fragment NAT		: [0-9]		;
fragment PUNTO		: '.'		;

FLOAT 	: NAT+ PUNTO NAT+	;
NUMERO	: NAT+	|	FLOAT		;
ESTADO 	: COCIDO | CRUDO		;
STRING 	: '"' .*? '"'		;

PALABRA			: [a-zA-Z]+						;
CONSEJOS		:  '$$'.PALABRA.'$$'			;
SALTOLINEA		: '\n'							;
ESPACIO 		: [\r]+							;
TABULACION		: [\t]+							;

//-----------INCIO Y FIN DE LA RECETA----------------

PREPARARINGREDIENTES		: 'COMMENCER_LA_RECETTE'    	;
FINCOCINA					: 'ACHEVEMENT_RECETTE'    ;

//---------------CONDICIONES Y CICLOS---------------

SINO 		: 'MAIS'	;
WAITING 	: 'ATTENDRE'	;
ENDWAIT		: 'RETOUR';
SI	 		: 'OUI'	;

//-------------VARIABLES Y MEDICIONES----------------
 
MEDICION 		    : 'ONZ' | 'gr.' | 'cc.' | 'tbsp'		;
CONDIMENTO_TYPE		: 'CONDIMENTOS'					        ;
DECLARACION			: 'INGREDIENT'					        ;
CARNE_TYPE 		   	: 'CARNE'						        ;
VEGETAL_TYPE 	   	: 'VEGETAL'					       	    ;
LEGUMBRE_TYPE 	 	: 'LEGUMBRE'					        ;
PESCADO_TYPE 	   	: 'PESCADO'						        ;
LIQUID_TYPE		   	: 'LIQUIDO'					        	;
RECIPIENTE_TYPE  	: 'RECIPIENTE'					        ;
CORTE_TYPE		  	: 'CORTE'						        ;
MEDIDAS_TIEMPO	 	: 'HRS' | 'S' | 'MIN'| 'DIAS'	  		;
APARATO_TYPE	   	: 'APARATO'						        ;
PORCION_TYPE		: 'PERSONA' | 'PERSONAS'				;

ESCRIBIR 	: 'ANOTAR'	  ;
LEER 		: 'INGRESE'	  ;

PAR_DE 		: ')';
PAR_IZ		: '(';
COMA		: ',';
PTOCOMA		: ';';
CORDER		: ']';
CORIZQ		: '[';


//-------OPERADORES LOGICOS-------

AND			: 'Y';
OR 			: 'O';


//-----------FUNCIONES------------

MAS			: 'AGREGAR'				      ;
MENOS		: 'QUITAR'				      ;
PARTIR		: 'PARTIR'				      ;
PELAR		: 'PELAR'				        ;
ENCEDER		: 'ENCENDER'			      ;
PREHOT		: 'PRECALENTAR'			    ;
HERVIR 		: 'HERVIR'				      ;
MACERAR		: 'MACERAR'				      ;
AMASAR		: 'AMASAR'				      ;
GIRO		: 'MEZCLAR'    			    ;
MOLER		: 'MOLER'				        ;
SERVIR		: 'SERVIR'				      ;
UNTAR	  	: 'UNTAR' | 'ENGRASAR'	;
EMPANIZAR	: 'EMPANIZAR'			      ;

//-----------FUNCIONES MATEMAGICAS-----------

IGUALAR		     : '='			;
DISTINGUIR	   : '!='			;
MAYOR 		     : '>'			;
MENOR		       : '<'			;
MAYEQ		       : '>='			;
MENEQ		       : '<='			;
ASIGNACION	   : '$'			;


