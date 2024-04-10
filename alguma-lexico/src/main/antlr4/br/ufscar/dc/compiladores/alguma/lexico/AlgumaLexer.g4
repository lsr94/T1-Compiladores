lexer grammar AlgumaLexer;


PALAVRA_CHAVE 
	:	'declare' | 'algoritmo' | 'inteiro' | 'literal'  | 'leia' | 'escreva' | 'fim_algoritmo'
	; 


NUMINT	: ('+'|'-')?('0'..'9')+
	;
NUMREAL	: ('+'|'-')?('0'..'9')+ ('.' ('0'..'9')+)?
	;
IDENT : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*
	 ;
CADEIA 	: '\'' ( ESC_SEQ | ~('\''|'\\') )* '\''
	;

fragment

ESC_SEQ	: '\\\'';

COMENTARIO
    :   '{' .*? '}' -> skip
    ;


WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {skip();}
    ;
OP_REL	:	'>' | '>=' | '<' | '<=' | '<>' | '='
	;
OP_ARIT	:	'+' | '-' | '*' | '/'
	;
DELIM	:	':'
	;
ABREPAR :	'('
	;
FECHAPAR:	')'
	;