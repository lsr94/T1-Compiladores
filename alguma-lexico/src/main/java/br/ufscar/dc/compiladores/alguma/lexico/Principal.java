/*
1º trabalho prático da disciplina Construção de Compiladores - 2024/1
Desenvolvido por:
- Lara Santiago Rodrigues, 769701
- Letícia Bossatto Marchezi, 791003
*/

package br.ufscar.dc.compiladores.alguma.lexico;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import java.io.File;

import java.io.FileWriter;

//import main.java.br.ufscar.dc.compiladores.alguma.lexico.CustomErrorListener;

public class Principal {
    
    // Criação de buffer para armazenar a saída
    private static StringBuilder buffer = new StringBuilder();
    
    public static void main(String[] args) {
        // Verificação de quantidade de argumentos válidos
        if (args.length < 2) {
            System.out.println("Uso: java -jar analisador-lexido-compilado.jar "
                    + "<caminho para o arquivo de entrada> " + "<caminho para o arquivo de saída>");
            System.exit(0);
        }

        // Definição do caminho de saída
        String name_result_file = args[1];
        
        // Criação do diretório de saída
        File file = new File(name_result_file);
        String directoryPath = file.getParent();
        File directory = new File(directoryPath);
        directory.mkdirs();

        // Criação de hook que garante a escrita dos dados no arquivo de saída
        // caso System.exit(-1) seja invocado por erro de sintaxe (classe CustomErrorListener)
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            
            // Escrita do conteúdo do buffer no arquivo de saída
            try (FileWriter writer = new FileWriter(name_result_file)) {

                writer.write(buffer.toString());
                System.err.println("Arquivo escrito.");

            } catch (Exception e) {

                System.err.println("Failed to write buffer to file: " + e.getMessage());
            }
        }));

        try {
            
            // Leitura dos caracteres
            CharStream cs = CharStreams.fromFileName(args[0]);
            AlgumaLexer lex = new AlgumaLexer(cs);
            
            Token t = null;
            String vocab_type = "";

            // Remove a classe padrão de listeners para erros  
            lex.removeErrorListeners();
            // Adicionando a classe CustomErrorListener com método customizado para erros de sintaxe (syntaxError)
            lex.addErrorListener(new CustomErrorListener(buffer));
            
            // ------------------------------------------------------
            // TO-DO: SE O TOKEN FOR INICIO DE COMENTÁRIO, IGNORAR ELE!
            // ------------------------------------------------------

            // Análise a cada token
            while ((t = lex.nextToken()).getType() != Token.EOF) {
                // Definição do tipo do token
                // Caso o token seja palavra reservada, o nome do seu tipo é o próprio token
                // Senão, busca o nome do tipo do token no vocabulário
                if (t.getType() == 1 || t.getType() == 2 || t.getType() == 3 || t.getType() == 4 || t.getType() == 5) {
                    vocab_type = "\'"+t.getText()+"\'";
                } else {
                    vocab_type = AlgumaLexer.VOCABULARY.getDisplayName(t.getType());
                }

                // Formata o texto para a especificação <'token', tipo>
                String textToAppend = String.format("<'%s',%s>%n", t.getText(), vocab_type);
                // Adiciona o novo token ao buffer
                buffer.append(textToAppend);
            }
               
        } catch (Exception ex) {
            System.err.println("An error occurred: " + ex.getMessage());
        }
    }
}
