lexer grammar BasicLex;

// Keywords
INT    : 'int';
IF     : 'if';
ELSE   : 'else';

// Identifiers
ID     : [a-zA-Z_][a-zA-Z0-9_]*;

// Literals
NUMBER : [0-9]+;

// Operators
ASSIGN : '=';

// Punctuation
SEMI   : ';';
LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';

// Whitespace
WS     : [ \t\r\n]+ -> skip;

// Error Recovery Rule: catch invalid characters (MUST be last)
ERROR_TOKEN : . { System.err.println("Skipping invalid character: " + getText()); } -> skip;
