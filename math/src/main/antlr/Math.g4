grammar Math;

@header{ package com.hwloser.math; }

prog : stat+ ;

stat : expr NEWLINE
     | ID '=' expr NEWLINE
     | NEWLINE
     ;

expr : expr op=('*'|'/') expr