package br.ufscar.dc.compiladores.alguma.lexico;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.RecognitionException;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

import main.java.br.ufscar.dc.compiladores.alguma.lexico.CustomErrorListener;

public class Principal {
    
    private static StringBuilder buffer = new StringBuilder();
    
    public static void main(String[] args) {


        // Escreve no arquivo com o buffer mesmo após a execução de system.exit()
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println(buffer);
            try (FileWriter writer = new FileWriter("D:\\Documentos\\UFSCar\\Compiladores-2024.1\\alguma-lexico\\temp\\saida.txt")) {
                
                writer.write(buffer.toString());
            } catch (Exception e) {
                System.err.println("Failed to write buffer to file: " + e.getMessage());
            }
        }));

        try {
            
            // Reading program 
            CharStream cs = CharStreams.fromFileName(args[0]);
            AlgumaLexer lex = new AlgumaLexer(cs);
            
            Token t = null;
            String vocab_type = "";


            // Removing and setting custom throwing error function  
            lex.removeErrorListeners();
            lex.addErrorListener(new CustomErrorListener(buffer));
            

            // Analyze token by token
            while ((t = lex.nextToken()).getType() != Token.EOF) {
                // Defining the type name 
                // If the token matches with the first grammar rule, then the type is its own name
                if (t.getType()==1){
                    vocab_type = "\'"+t.getText()+"\'";
                }else{
                    vocab_type = AlgumaLexer.VOCABULARY.getDisplayName(t.getType());
                }

                String textToAppend = String.format("<'%s',%s>%n", t.getText(), vocab_type);
                buffer.append(textToAppend);
            }
               
        } catch (Exception ex) {
            System.err.println("An error occurred: " + ex.getMessage());
        }
    }
}