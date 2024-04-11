lexer grammar AlgumaLexer;

PALAVRA_CHAVE :	'algoritmo' | 'declare' | 'inteiro' | 'real' | 'literal'  | 'leia' | 'escreva' | 'fim_algoritmo' |
 'logico' | 'se' | 'entao' | 'senao' | 'fim_se' | 'fim_caso' | 'seja' | 'caso' | 'para' | 'ate' | 'faca' |
 'fim_para' | 'enquanto' | 'fim_enquanto'; 

NUMINT: ('+'|'-')?('0'..'9')+;

NUMREAL: ('+'|'-')?('0'..'9')+ ('.' ('0'..'9')+)?;

IDENT: ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*;

CADEIA 	: '\'' ( ESC_SEQ | ~('\''|'\\') )* '\'';
fragment ESC_SEQ: '\\\'';

COMENTARIO:   '%' ~('\n'|'\r')* '\r'? '\n' {skip();};

WS: (' ' | '\t' | '\r' | '\n') {skip();};

OP_REL:	'>' | '>=' | '<' | '<=' | '<>' | '=';

OP_ARIT: '+' | '-' | '*' | '/' | '%' | '^';

OP_LOG: 'e' | 'nao' | 'ou';

CARACTERE_ESP: ':' | '(' | ')' | ',' | '<-' | '-' | '..' | '&';
