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

public class Principal {
    
    // Criação de buffer para armazenar a saída
    private static StringBuilder buffer = new StringBuilder();
    
    public static void main(String[] args) {
        // Validação da quantidade de argumentos
        if (args.length < 2) {
            System.out.println("Uso: java -jar analisador-lexido-compilado.jar "
                    + "<caminho para o arquivo de entrada> " + "<caminho para o arquivo de saída>");
            System.exit(0);
        }
        
        // Criação do diretório de saída
        createOutputDirectory(args[1]);

        try {
            // Leitura dos caracteres
            CharStream cs = CharStreams.fromFileName(args[0]);
            AlgumaLexer lex = new AlgumaLexer(cs);
            Token t;
            String vocab_type;

            // Análise a cada token
            while ((t = lex.nextToken()).getType() != Token.EOF) {
                // Detecta erros e interrompe o programa
                // Caso o token seja palavra reservada, o nome do seu tipo é o próprio texto do token
                // Senão, utiliza o nome do tipo do token no vocabulário

                // Definição do nome do tipo do símbolo
                String token_type = AlgumaLexer.VOCABULARY.getDisplayName(t.getType());

                // Erro: não reconhecimento de símbolo. Finaliza o programa.
                if(token_type.equals("ERRO")) {
                    buffer.append("Linha "+t.getLine()+": "+t.getText()+" - simbolo nao identificado\n");
                    break;
                } 

                // Erro: cadeia literal não fechada. Finaliza o programa.  
                else if(token_type.equals("CADEIA_NAO_FECHADA")) { 
                    buffer.append("Linha "+t.getLine()+": cadeia literal nao fechada\n");
                    break;
                }

                // Erro: comentário não fechado. Finaliza o programa.  
                else if(token_type.equals("COMENTARIO_NAO_FECHADO")){
                    buffer.append("Linha "+t.getLine()+": comentario nao fechado\n");
                    break;
                }

                // Reconhece palavras reservadas (PALAVRA_CHAVE), Operadores relacionais (OP_REL), aritméticos (OP_ARIT),
                // lógicos (OP_LOG) e caracteres especiais (CARACTERE_ESP) 
                // Escreve no formato <texto_token,texto_token>
                else if (token_type.equals("PALAVRA_CHAVE") || token_type.equals("OP_REL") || token_type.equals("OP_ARIT") || token_type.equals("OP_LOG") || token_type.equals("CARACTERE_ESP") ) {
                    vocab_type = "\'"+t.getText()+"\'";
                } 

                // Escreve no formato <texto_token,nome_tipo_token>
                else {
                    vocab_type = token_type;
                }

                // Formata e adiciona o novo token ao buffer
                String textToAppend = String.format("<'%s',%s>%n", t.getText(), vocab_type);
                buffer.append(textToAppend);

            }
        } catch (Exception ex) {
            // Detecção de exceções
            System.err.println("Erro: " + ex.getMessage());
        }

        // Escreve o resultado do buffer no arquivo de saída
        writeOutputToFile(args[1]);
    }

    /**
     * Cria o(s) diretório(s) pai do arquivo dado caso não exista(m).
     * @param filePath caminho do arquivo a ter os diretórios pai criados.
     */
    private static void createOutputDirectory(String filePath) {
        File file = new File(filePath);
        // Definição do diretório
        String directoryPath = file.getParent();
        File directory = new File(directoryPath);
        // Criação do diretório de saída
        directory.mkdirs();
    }

    /**
     * Escreve o conteúdo do buffer no arquivo destino.
     * Garante que os recursos serão liberados após o procedimento ao usar try-with-resources, além
     * da detecção de exceções ao escrever no arquivo, além de imprimir o erro no terminal.
     * @param filePath caminho do arquivo de saída a ser escrito.
     */
    private static void writeOutputToFile(String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(buffer.toString());
        } catch (Exception e) {
            System.err.println("Erro " + e.getMessage()+" ao escrever no arquivo "+filePath);
        }
    }
}