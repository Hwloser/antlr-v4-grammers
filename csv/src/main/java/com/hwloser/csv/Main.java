package com.hwloser.csv;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {

  public static void main(String[] args) {
    // 1. 转化字符流
    CodePointCharStream charStream = CharStreams.fromString("aaa,bbb,ccc");

    // 2. 词法解析
    CSVLexer lexer = new CSVLexer(charStream);

    // 3. 词法解析转化为token流
    CommonTokenStream tokenStream = new CommonTokenStream(lexer);

    // 4. token流语法解析
    CSVParser parser = new CSVParser(tokenStream);

    // 5. 创建walker，准备进行walk through AST
    ParseTreeWalker walker = new ParseTreeWalker();

    // 6. 创建walker便利AST时的listener行为
    // TODO: implement listener concrete actions
    CSVBaseListener listener = new CSVBaseListener();

    // 7. walk through parser tree [AST]
    walker.walk(listener,parser.csvFile());
  }
}
