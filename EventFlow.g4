grammar EventFlow;

// Regra inicial
programa: definicao+ EOF;

definicao: config_def | event_def | platform_def | pipeline_def;

// Bloco de configuração de variáveis
config_def: 'config' '{' prop_list '}' ;

// Bloco EVENT (agora pode usar variáveis)
event_def: 'EVENT' STRING '{' prop_list '}' ;

// Bloco de plataforma para geração de código
platform_def: 'PLATFORM' STRING '{' platform_stmt+ '}';
platform_stmt: 'generate' 'file' 'from_template' '(' value ')' 'to' value
             | 'generate' 'json' value 'with' '{' prop_list '}';

// Bloco PIPELINE com suporte a if/else
pipeline_def: 'PIPELINE' '{' stage_def+ '}';
stage_def: 'stage' STRING '{' command+ '}';
command: run_stmt | if_stmt;
run_stmt: 'run' value ';';
if_stmt: 'if' '(' condition ')' '{' command+ '}' ( 'else' '{' command+ '}' )?;
condition: value '==' value;

// Estruturas genéricas
prop_list: prop_stmt*;
prop_stmt: ID ':' value ';';

// A regra 'value' define os tipos de valores que uma propriedade pode ter
value: literal
     | ID ('.' ID)* // Para acessar variáveis como config.app_version
     | func_call
     | env_var;

literal: STRING | INT | BOOL;
func_call: ID '(' value ')'; // Permite funções aninhadas se necessário
env_var: '${' 'env.' ID '}';

// Tokens (Analisador Léxico)
ID:         [a-zA-Z_] [a-zA-Z0-9_]*;
STRING:     '"' ( ~[\\"] | '\\' . )*? '"'; // Regra robusta para strings com escapes
INT:        [0-9]+;
BOOL:       'true' | 'false';
WS:         [ \t\r\n]+ -> skip;
COMMENT:    '//' .*? '\n' -> skip;