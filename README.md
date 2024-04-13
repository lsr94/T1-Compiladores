## T1 - Analisador Léxico ##
Neste repositório, encontra-se o primeiro trabalho realizado na disciplina de Construção de Compiladores ofertada no 1º semestre de 2024 ministrada pelo Prof. Dr. Daniel Lucrédio.
O objetivo do mesmo é desenvolver um analisador léxico. Abaixo, encontra-se as instruções do que é necessário ter instalado na máquina pessoal para executar o analisador, assim como, compilar e executá-lo. Ademais, conterá a explicação da gramática criada mediante regras para atender aos casos de teste fornecidos pelo professor.
Espera-se que este analisador léxico funcione nos sistemas operacionais: Linux, Windows e macOS.

## O que é necessário instalar na máquina ##
Para a execução do analisador, é necessário ter instalado Java (aceitável qualquer versão a partir da *8*) e Maven (*versão 3.6.3*).
- A dupla usou, especificadamente, a versão mais atual do Java, que no atual momento do trabalho é a *19.0.2*.

## Instruções de uso ##
O trabalho foi desenvolvido usando a IDE Visual Studio Code, logo é esperado que para manter a integridade do código, a execução seja realizada no mesmo ambiente de desenvolvimento. Além disso, a execução ocorreu em dois sistemas operacionais diferentes: Linux (Ubuntu) e Windows.

Para facilitar o *download* do trabalho, acesse a pasta: [T1](https://drive.google.com/drive/folders/1dt64yya21XOnIvliX9bcZ54lf7g7lkDs?usp=drive_link).

Após realizar o *download*, o projeto pode ser aberto no VS (visual studio). Veja abaixo como fazer:
![](https://github.com/letMarchezi/T1/assets/110498717/c3dd0f2a-c792-4519-96a6-775352a1e38e)


* Avisos: coloque a pasta baixada em um diretório de fácil acesso e que não possua um caminho muito longo, pois isso pode dificultar o entendimento para a linguagem Java e gerar erros.

### Como executar? ###
Para executar é necessário localizar o arquivo **alguma-lexico-1.0-SNAPSHOT-jar-with-dependencies.jar** na pasta _target_. Após localizar o arquivo, a execução poderá ser realizada da seguinte forma (independente do sistema operacional).
* Abra um _prompt_ de comando e digite o seguinte comando:

		java -jar (diretório do arquivo .jar) (diretório do caso de teste) (diretório do arquivo de saída)

Onde:
	* O diretório do arquivo .jar é a localização do arquivo alguma-lexico-1.0-SNAPSHOT-jar-with-dependencies.jar;
	* O diretório do caso de teste é a localização de um arquivo.txt que contém um algoritmo que será analisado pelo programa;
	* O diretório do arquivo de saída é a localização do arquivo.txt onde será apresentado o resultado da análise. Caso o arquivo não exista ainda, ele será criado.

Um exemplo de execução é a seguinte:
- Linux

  		java -jar home/lara/Documentos/t1-analisador-lexico/alguma-lexico/target/alguma-lexico-1.0-SNAPSHOT-jar-with-dependencies.jar home/lara/Documentos/t1-analisador-lexico/alguma-lexico/casos-de-teste/1.casos_teste_t1/entrada/4-algoritmo_3-1_apostila_LA.txt home/lara/Documentos/t1-analisador-lexico/alguma-lexico/resultado

- Windows

			coloque o seu :)

Este é um exemplo executando apenas um teste. Há 37 casos a serem testados para este trabalho, todos passados pelo professor. Acesse a pasta completa em: [casos-de-teste](https://drive.google.com/drive/folders/1zY3y4j8-SUVzVTt4kj6t695kdJlFLd1L?usp=drive_link). 
Veja que, além dos testes de entrada, há também uma pasta para o que é esperado (saida), assim é possível comparar com a saída que realmente obtivemos.

## Gramática ##
A gramática utilizada no desenvolvimento do trabalho foi a especificada nos casos de teste apresentados acima e vista em sala de aula. Para conferir a gramática em mais detalhes, recomenda-se a visualização do arquivo __ COLOCAR LINK PARA O DRIVE __. Abaixo, há uma breve explicação da gramática criada:

- PALAVRA_CHAVE: são encontradas todas as palavras-chave utilizadas nos algoritmos de teste. Ela devem ser imprimidas na forma <'palavra-chave','palavra-chave'>;
- OP_ARIT, OP_REL, OP_LOG: nestes padrões são especificados, respectivamente, os operadores aritméticos, relacionais e lógicos que são utilizados nos algoritmos de teste. Estes devem ser imprimidos da seguinte forma <'operador','operador'>;
- CARACTERE_ESP: são caracteres especiais utilizados ao longo dos algoritmos e sem uma semântica específica por trás deles (como vírgulas, pontos, ponto e vírgula);
- NUM_INT e NUM_REAL: nestes padrões são especificados os formatos de valores inteiros e reais, respectivamente. Ambos devem ser imprimidos na forma <'numero',NUM_INT> ou <'numero',NUM_REAL>;
- IDENT: este padrão é responsável por definir o que pode ser considerado um identificador (ou variável) dentro dos algoritmos. Identificadores são cadeias iniciadas por letras e seguidar por letras ou números, além do símbolo de _. Devem ser imprimidos da forma <'exemplo111',IDENT>;
- CADEIA: este padrão identifica uma cadeia de caracteres (ou string) dentro dos algoritmos. As cadeias são definidas por sequências de quaisquer símbolos que estão entre aspas duplas. Devem ser imprimidos da forma <'"string"',CADEIA>;
- COMENTARIO: os comentários são ignorados pelo analisador léxico, de modo que não geram tokens. São identificados por caracteres que estão entre chaves. São reconhecidos pelo padrão { comentario };
- WS: define espaços em branco, quebras de linha e tabulações, que também são ignorados pelo analisar léxico;
