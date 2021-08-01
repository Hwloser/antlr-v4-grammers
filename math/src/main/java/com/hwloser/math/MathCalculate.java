package com.hwloser.math;

import com.hwloser.math.MathParser.ProgContext;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class MathCalculate {
  public static void main(String[] args) {
    String input = "12+2+12\r\n";

    CharStream inputCharStream = CharStreams.fromString(input);
    MathLexer lexer = new MathLexer(inputCharStream);

    CommonTokenStream tokenStream = new CommonTokenStream(lexer);
    MathParser parser = new MathParser(tokenStream);

    ProgContext prog = parser.prog();

  }
}
