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

CADEIA : ('"' ( ESC_SEQ | ~('"'|'\\'|'\n') )* '"' ) | ('\'' ( ESC_SEQ_SQ | ~('\''|'\\'|'\n') )* '\'');

fragment ESC_SEQ : '\\"';
fragment ESC_SEQ_SQ : '\\\'';

COMENTARIO : '{' ~('\n'|'}')* '}' -> skip;

CADEIA_NAO_FECHADA: ('\'' (ESC_SEQ_SQ | ~('\n'|'\''|'\\'))* '\n') | ('"' ( ESC_SEQ | ~('\n'|'"'|'\\'))* '\n');

COMENTARIO_NAO_FECHADO: '{' (~('\n'|'}'))* '\n';

WS: (' ' | '\t' | '\r' | '\n') {skip();};

ERRO: . ;