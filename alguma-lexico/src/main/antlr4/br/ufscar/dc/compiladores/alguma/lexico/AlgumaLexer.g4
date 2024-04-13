lexer grammar AlgumaLexer;

PALAVRA_CHAVE :	'algoritmo' | 'declare' | 'inteiro' | 'real' | 'literal'  | 'leia' | 'escreva' | 'fim_algoritmo' |
 'logico' | 'se' | 'entao' | 'senao' | 'fim_se' | 'fim_caso' | 'seja' | 'caso' | 'para' | 'ate' | 'faca' |
 'fim_para' | 'enquanto' | 'fim_enquanto' | 'registro' | 'fim_registro' | 'tipo' | 'procedimento' | 'funcao' |
 'retorne' | 'constante' | 'var' | 'fim_procedimento' | 'fim_funcao'; 

OP_REL:	'>' | '>=' | '<' | '<=' | '<>' | '=';

OP_ARIT: '+' | '-' | '*' | '/' | '%' | '^';

OP_LOG: 'e' | 'nao' | 'ou' | 'falso' | 'verdadeiro';

CARACTERE_ESP: ',' | ':' | '(' | ')' | '<-' | '-' | '..' | '.' | '[' | ']' | '&';

NUM_INT: ('0'..'9')+;

NUM_REAL: ('0'..'9')+ ('.' ('0'..'9')+)?;

IDENT: ('a'..'z'|'A'..'Z') ('_'|'a'..'z'|'A'..'Z'|'0'..'9')*;

CADEIA : '"' ( ESC_SEQ | ~('"'|'\\'|'\n') )* '"';
fragment ESC_SEQ	: '\\"';

COMENTARIO : '{' ~('\n'|'}')* '}' -> skip;

WS: (' ' | '\t' | '\r' | '\n') {skip();};
