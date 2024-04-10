package br.ufscar.dc.compiladores.alguma.lexico;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.io.FileWriter;


//import main.java.br.ufscar.dc.compiladores.alguma.lexico.CustomErrorListener;

public class Principal {
    
    private static StringBuilder buffer = new StringBuilder();
    
    public static void main(String[] args) {
        String name_result_file = args.length > 1
        ? args[1]+args[0].split("entrada")[1]
        : args[0].split("entrada")[1];

        
        //String name_result_file = args[0].split("casos-de-teste")[0] + "temp\\saidaProduzida\\saida_t1\\"+ args[0].split("entrada")[1];
        //System.out.println(name_result_file);
        // Escreve no arquivo com o buffer mesmo após a execução de system.exit()
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println(buffer);
            try (FileWriter writer = new FileWriter(name_result_file)) {
                
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
            System.out.println(args[0]);

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