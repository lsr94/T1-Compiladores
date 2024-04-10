package main.java.br.ufscar.dc.compiladores.alguma.lexico;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;


public class CustomErrorListener extends BaseErrorListener {
    public StringBuilder buffer;

    public CustomErrorListener(StringBuilder buffer){
        this.buffer=buffer;
    }
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg, RecognitionException e){
        
        //System.out.println(msg.split("'")[1]);                        
        String symbolText = msg == null ? "unknown" : msg.split("'")[1];
        buffer.append("Linha " + line + ": "+symbolText+" - simbolo nao identificado '");                     
        System.exit(-1);
    }
}
