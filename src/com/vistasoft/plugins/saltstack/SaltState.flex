package com.vistasoft.plugins.saltstack;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.vistasoft.plugins.saltstack.psi.SaltStateTypes;
import com.intellij.psi.TokenType;

%%

%class SaltStateLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

%{
    private String stringBuffer;
%}

//CRLF= \n|\r|\r\n
//WHITE_SPACE=[\ \t\f]
//FIRST_VALUE_CHARACTER=[^ \n\r\f\\] | "\\"{CRLF} | "\\".
//VALUE_CHARACTER=[^\n\r\f\\] | "\\"{CRLF} | "\\".
//END_OF_LINE_COMMENT=("#"|"!")[^\r\n]*
//SEPARATOR=[:=]
//KEY_CHARACTER=[^:=\ \n\r\t\f\\] | "\\"{CRLF} | "\\".

INDENT          = [ \t]+
WHITE_SPACE     = [ \t]
CLRF            = \r|\n|\r\n
COMMENT         = "#" [^\r\n]*

IDENTIFIER      = [a-zA-Z0-9\._] [a-zA-Z0-9\._\-]*
KEY             = {IDENTIFIER} ":"
LIST_NODE       = "-"

STRING          = \'[^\'\n,]*\'|\"(\\.|[^\"{}\\\n,])*\"

%%

<YYINITIAL> {
    {COMMENT}           { yybegin(YYINITIAL); return SaltStateTypes.COMMENT; }
    {KEY}               { yybegin(YYINITIAL); return SaltStateTypes.KEY; }
    {LIST_NODE}         { yybegin(YYINITIAL); return SaltStateTypes.LIST_NODE; }
    {IDENTIFIER}        { yybegin(YYINITIAL); return SaltStateTypes.IDENTIFIER; }
    {STRING}            { yybegin(YYINITIAL); return SaltStateTypes.STRING; }
    {CLRF}              { yybegin(YYINITIAL); }
    {WHITE_SPACE}       { yybegin(YYINITIAL); }
    ^{INDENT}           { yybegin(YYINITIAL); return SaltStateTypes.INDENT; }
}

.                       { return TokenType.BAD_CHARACTER; }