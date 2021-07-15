grammar Lenguaje;

inicio: LIBRERIA? CLASE ID PAR_A PAR_C LLAVE_A cuerpo LLAVE_C;

cuerpo: instrucciones*;

instrucciones
: declaracion
| asignacion
| impresion
| if_condicion
| ciclo_while
 ;

 if_condicion
 : IF  condicion (ELSE IF condicion)* (ELSE bloque_condicion)?
 ;

condicion
: PAR_A expr PAR_C bloque_condicion;

bloque_condicion
: LLAVE_A cuerpo LLAVE_C
;

incremento
: ID expr MASMAS PYC;


declaracion
: TIPO_DATO ID (IGUAL expr)? PYC
  ;
asignacion
: ID IGUAL expr PYC
;

ciclo_while: WHILE PAR_A expr PAR_C bloque_condicion
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

  INT: [0-9]+;
  FLOTA: [0-9]+ '.' [0-9]* | '.' [0.9]+ ;

  LLAVE_A: '{';
  LLAVE_C: '}';
  PAR_A: '(';
  PAR_C: ')';
  PYC: ';';

  NUM: [0-9]+;
  ESPACIOS: [ \t\n\r]+ -> skip;