grammar Lenguaje;

inicio: LIBRERIA? CLASE ID PAR_A PAR_C bloque ;

bloque:
    llave_A
    instrucciones*
    llave_C
;
llave_A:
    LLAVE_A;

llave_C:
    LLAVE_C;

instrucciones
: declaracion
| asignacion
| impresion
| if_condicion
| ciclo_while
| declarar_y_asignar
| bloque
 ;

 if_condicion
 : IF  condicion (ELSE IF condicion)* (ELSE bloque_condicion)?
 ;

 ciclo_while: WHILE PAR_A expr PAR_C bloque_condicion
 ;


condicion
: PAR_A expr PAR_C bloque_condicion;

bloque_condicion
: bloque
;

incremento
: ID expr MASMAS PYC;

declarar_y_asignar:
TIPO_DATO ID IGUAL expr PYC
;

declaracion
: TIPO_DATO ID PYC
  ;



asignacion
: ID IGUAL expr PYC
;


impresion: PRINT (operaciones|strings) PYC
;
strings: PAR_A STRING PAR_C                                            #imprimir
;
operaciones: expr                                                      #imprimir2
;



  expr
  : MENOS expr                                                  #expresion_negativa
  | NOT expr                                                    #exprNot
  | expr op=(POR|DIV) expr                                      #mulDiv
  | expr op=(MAS| MENOS)  expr                                  #sumRes
  | expr op=(MENOR_QUE|MAYOR_QUE|MENOR_IGUAL|MAYOR_IGUAL) expr  #expresion_Relacional
  | expr op=(IGUAL_IGUAL| DIFERENTE_QUE) expr                   #expresion_igual
  | expr AND expr                                               #exprAnd
  | expr OR expr                                                #exprOr
  | INT                                                         #int
  | FLOTA                                                       #float
  | VERDADERO                                                   #verdad
  | FALSO                                                       #fake
  | ID                                                          #id
  |PAR_A expr PAR_C                                             #parentesisExpr
  ;

  LIBRERIA: 'libreria principal';
  CLASE: 'clase';
  TIPO_DATO: 'int' | 'float' | 'String'| 'Double';
  PRINT: 'print';
  IF: 'if';
  ELSE: 'else';
  WHILE: 'while';

  MASMAS: '++';
  MENOSMENOS: '--';

  AND: '&&';
  OR: '||';
  NOT: '!';
  VERDADERO: 'true';
  FALSO: 'false';
  ID: [a-zA-Z]+ ;
  STRING: '"' ( ESC | . )*? '"';
  fragment ESC: '\\' [btnr"\\] ;
  LINE_COMMENT: '//' .*? '\n' -> skip;
  COMMENT : '/*' .*? '*/' -> skip;


  MAYOR_QUE: '>';
  MENOR_QUE: '<';
  MAYOR_IGUAL: '>=';
  MENOR_IGUAL: '<=';
  IGUAL_IGUAL: '==';
  DIFERENTE_QUE: '!=';

  IGUAL: '=';
  POR: '*';
  DIV: '/';
  MAS: '+';
  MENOS: '-';
  FLOTA: [0-9]+ '.' [0-9]* | '.' [0.9]+ ;
  INT: [0-9]+;


  LLAVE_A: '{';
  LLAVE_C: '}';
  PAR_A: '(';
  PAR_C: ')';
  PYC: ';';

  NUM: [0-9]+;
  ESPACIOS: [ \t\n\r]+ -> skip;