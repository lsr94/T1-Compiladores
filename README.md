<<<<<<< HEAD
## T1 - Analisador Léxico ##
Neste repositório, encontra-se o primeiro trabalho realizado na disciplina de Construção de Compiladores ofertada no 1º semestre de 2024 ministrada pelo Prof. Dr. Daniel Lucrédio.
O objetivo do mesmo é desenvolver um analisador léxico. Abaixo, encontra-se as instruções do que é necessário ter instalado na máquina pessoal para executar o analisador, assim como, compilar e executá-lo. Ademais, conterá a explicação da gramática criada mediante regras para atender aos casos de teste fornecidos pelo professor.
Espera-se que este analisador léxico funcione nos sistemas operacionais: Linux, Windows e macOS.

## Integrantes ##
Este trabalho foi desenvolvido pelas alunas:
- Lara Santiago Rodrigues, RA 769701 - Turma A
- Letícia Bossatto Marchezi, RA 791003 - Turma A

## Requisitos ##
Para a execução do analisador, é necessário ter instalado Java (aceitável qualquer versão a partir da *8*), Maven (*versão 3.6.3*) e ANTLR (*versão 4.13.1*).

- A dupla usou, especificadamente, a versão mais atual do Java, que no atual momento do trabalho é a *19.0.2*.

Verifique se o Java e Maven estão definidos nas variáveis de ambiente de seu sistema, dessa forma, será possível invocar os comandos em qualquer diretório.

## Instruções de uso ##
O trabalho foi desenvolvido usando a IDE Visual Studio Code e a execução ocorreu em dois sistemas operacionais diferentes: Linux (Ubuntu) e Windows 10.

Para facilitar o *download* do trabalho, acesse a pasta: ![T1](https://github.com/letMarchezi/T1-Construcao-Compiladores/tree/main).

Após realizar o *download*, o projeto pode ser aberto no VS (visual studio). Veja abaixo como fazer:
![](https://github.com/letMarchezi/T1/assets/110498717/c3dd0f2a-c792-4519-96a6-775352a1e38e)


* Avisos: coloque a pasta baixada em um diretório curto e sem espaços em branco para evitar erros.

## Compilação ##

Para compilar o projeto é necessário executar o segundo comando no diretório **alguma-lexico**:

	mvn clean package

Assim, será gerado o arquivo do analisador sintático empacotado com as dependências dentro da pasta _alguma\_lexico/target_. Este arquivo será utilizado nos passos futuros para a execução.

## Como executar? ##

### Execução manual ###
Para executar é necessário localizar o analisador léxico, que foi empacotado no arquivo **compiladores-corretor-automatico-1.0-SNAPSHOT-jar-with-dependencies.jar** na pasta _alguma\_lexico/target_. 

O analisador léxico recebe dois parâmetros, sendo o primeiro o caminho do arquivo de entrada que será analisado, e o segundo o caminho do arquivo de saída. Ambos os caminhos dos arquivos devem ser completos (*absolute path*). 

Após localizar o analisador léxico, a execução poderá ser realizada da seguinte forma (independente do sistema operacional).

* Abra um _prompt_ de comando e digite o seguinte comando:

		java -jar (caminho do analisador .jar) (caminho do arquivo de teste) (caminho do arquivo de saída)

Onde:
- O caminho do analisador .jar é a localização do arquivo compiladores-corretor-automatico-1.0-SNAPSHOT-jar-with-dependencies.jar;
- O caminho do arquivo de teste é o caminho absoluto do arquivo .txt que contém um algoritmo que será analisado pelo programa;
- O caminho do arquivo de saída é o caminho absoluto do arquivo .txt onde será armazenado o resultado da análise. Caso o diretório final ou o arquivo não existam, eles serão criados.

Um exemplo de execução é a seguinte:
- Linux

  		java -jar home/lara/Documentos/t1-analisador-lexico/alguma-lexico/target/alguma-lexico-1.0-SNAPSHOT-jar-with-dependencies.jar home/lara/Documentos/t1-analisador-lexico/alguma-lexico/casos-de-teste/1.casos_teste_t1/entrada/4-algoritmo_3-1_apostila_LA.txt home/lara/Documentos/t1-analisador-lexico/alguma-lexico/resultado

- Windows

		java -jar target\alguma-lexico-1.0-SNAPSHOT-jar-with-dependencies.jar casos-de-teste\1.casos_teste_t1\entrada\1-algoritmo_2-2_apostila_LA.txt D:\Documentos\UFSCar\Compiladores-2024.1\T1\alguma-lexico\temp\1-algoritmo_2-2_apostila_LA.txt


### Correção automática ###

A análise léxica também pode ser realizada por meio do ![corretor automatico](https://github.com/dlucredio/compiladores-corretor-automatico/tree/master), executando o analisador em lotes em conjunto com a correção dos resultados, comparando a saída gerada com o resultado esperado. 

Há 37 casos a serem testados para este trabalho. Acesse a pasta completa em: ![casos-de-teste](https://github.com/letMarchezi/T1-Construcao-Compiladores/tree/main/alguma-lexico/casos-de-teste/1.casos_teste_t1). 

A execução do corretor automático é feita com o seguinte comando:


		java -jar (caminho do corretor) "java -jar (caminho analisador .jar)" (caminho gcc) (diretorio de saída) (diretorio dos casos de teste) (RA dos alunos) (nome do trabalho)


Onde:
- O caminho corretor é a localização do arquivo compiladores-corretor-automatico-1.0-SNAPSHOT-jar-with-dependencies.jar;
- O caminho do analisador .jar é a localização do arquivo compiladores-corretor-automatico-1.0-SNAPSHOT-jar-with-dependencies.jar;
- O caminho gcc é a localização do executável do compilador gcc em seu sistema. Caso o comando *gcc* seja reconhecido, este poderá ser utilizado;
- O diretorio de saída é o caminho absoluto para armazenamento dos resultados do analisador;
- O diretorio dos casos de teste é o caminho absoluto da pasta **casos-de-teste**;
- RA dos alunos é uma string com o RA dos membros separados por vírgula
- Nome do trabalho é uma das opções entre t1, t2, t3, t4 ou t5. 

Exemplos:

- Linux

		java -jar home/lara/Documentos/t1-analisador-lexico/alguma-lexico/compiladores-corretor-automatico-1.0-SNAPSHOT-jar-with-dependencies.jar "java -jar home/lara/Documentos/t1-analisador-lexico/alguma-lexico/target/alguma-lexico-1.0-SNAPSHOT-jar-with-dependencies.jar" gcc home/lara/Documentos/t1-analisador-lexico/alguma-lexico/temp home/lara/Documentos/t1-analisador-lexico/alguma-lexico/casos-de-teste "769701, 791003" t1

- Windows

		java -jar D:\Documentos\T1-Compiladores\alguma-lexico\compiladores-corretor-automatico-1.0-SNAPSHOT-jar-with-dependencies.jar "java -jar D:\Documentos\T1-Compiladores\alguma-lexico\target\alguma-lexico-1.0-SNAPSHOT-jar-with-dependencies.jar" gcc temp casos-de-teste "769701, 791003" t1


## Gramática ##
A gramática utilizada no desenvolvimento do trabalho foi a especificada nos casos de teste apresentados acima e vista em sala de aula. Para conferir a gramática em mais detalhes, recomenda-se a visualização do arquivo **AlgumaLexer.g4**. Abaixo, há uma breve explicação da gramática criada:

- PALAVRA_CHAVE: são encontradas todas as palavras-chave utilizadas nos algoritmos de teste. Ela devem ser imprimidas na forma <'palavra-chave','palavra-chave'>;
- OP_ARIT, OP_REL, OP_LOG: nestes padrões são especificados, respectivamente, os operadores aritméticos, relacionais e lógicos que são utilizados nos algoritmos de teste. Estes devem ser imprimidos da seguinte forma <'operador','operador'>;
- CARACTERE_ESP: são caracteres especiais utilizados ao longo dos algoritmos e sem uma semântica específica por trás deles (como vírgulas, pontos, ponto e vírgula);
- NUM_INT e NUM_REAL: nestes padrões são especificados os formatos de valores inteiros e reais, respectivamente. Ambos devem ser imprimidos na forma <'numero',NUM_INT> ou <'numero',NUM_REAL>;
- IDENT: este padrão é responsável por definir o que pode ser considerado um identificador (ou variável) dentro dos algoritmos. Identificadores são cadeias iniciadas por letras e seguidar por letras ou números, além do símbolo de _. Devem ser imprimidos da forma <'exemplo111',IDENT>;
- CADEIA: este padrão identifica uma cadeia de caracteres (ou string) dentro dos algoritmos. As cadeias são definidas por sequências de quaisquer símbolos que estão entre aspas simples ou duplas. Devem ser imprimidos da forma <'"string"',CADEIA>;
- COMENTARIO: os comentários são ignorados pelo analisador léxico, de modo que não geram tokens. São identificados por caracteres que estão entre chaves. São reconhecidos pelo padrão { comentario };
- CADEIA_NAO_FECHADA: Cadeias de aspas duplas ou aspas simples que não foram fechadas na mesma linha que foram iniciadas. Exemplo:

	'imprimindo a sequencia\n
- COMENTARIO_NAO_FECHADO: Identifica comentários que não foram fechados na mesma linha. Exemplo:

	{ comentario. 
- WS: define espaços em branco, quebras de linha e tabulações, que também são ignorados pelo analisar léxico;
- ERRO: Identificador coringa que detecta qualquer padrão que não foi identificado nas regras anteriores;
=======
# T1-Compiladores
1º Trabalho Prático da Disciplina de Construção de Compiladores ofertada em 2024/1
>>>>>>> a671de792870210a4de6b35c732534b5f22c3477
