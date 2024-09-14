# TP4: Árvore Binária

## Lembretes:

- Comando para clonar esta branch: `git clone --single-branch --branch tp4-binary-tree https://github.com/lvmendess/prog3-time4/`
- Caso queira modificar um arquivo da branch, crie uma branch separada com seu nome e realize um pull request dos arquivos modificados. :)

## O que fazer?

consiste em implementar uma Árvore de Pesquisa sem Balanceamento, onde cada nodo irá armazenar uma palavra e uma lista de números das linhas onde ela aparece (use o TAD Lista para isso). A medida que as palavra são lidas, o seu algoritmo deve pesquisar a árvore para ver se a palavra já está presente. Se estiver, adiciona o novo número de linha à lista dessa palavra. Se não estiver presente, cria um novo nodo na árvore e inicia a lista de linhas com esta. O uso da árvore de pesquisa é indicado pois a sua estrutura será bastante dinâmica e no final você precisará imprimir as palavras em ordem alfabética.
## Dicas

Use os métodos de árvore nos slides.

## Observações!

É necessária a utilização dos conceitos de Árvore Binária! Não podemos utilizar estruturas de dados prontas.

## Tarefas

Organizei as tarefas em duplas. Após perceber desenvolvimento maior de alguns alunos e menos de outros do grupo. Dividi duplas em revisor -> programador. Onde o revisor solicita, depois lê o código do programador, avalia e faz alterações necessárias (evitando o máximo possivel programar).

As duplas e as tarefas para cada foram: (Revisor / Programador respectivamente)

- Lívia Mendes e Pedro Sanzio: Lógica de insert de palavras na árvore e print no console;
- Duda e Luísa: Criação das classes de estrutura e adaptação (BinaryTree, ListaSEL, Lines);
- Pedro Ribas e Pedro José: Criação do ReadTxt e conversão do resultado final em txt;

## Autores

- [@pedrogribas](https://www.github.com/octokatherine)
- [@lvmendess](https://www.github.com/lvmendess)
- [@luisads4](https://www.github.com/luisads4)
- [@phsanzio](https://www.github.com/phsanzio)
- [@PedroHL19](https://www.github.com/PedroHL19)


## Uso

### Criar um Arquivo TXT

Crie um arquivo de texto com o nome desejado (por exemplo, meu_arquivo.txt) e adicione o conteúdo que você deseja ler. Certifique-se de que o arquivo esteja no formato correto para ser lido pelo programa. (.txt)

### Alterar o Código

Abra o arquivo Main.java e localize a linha que começa com control.initialize("dataset\\faroeste.txt");. Substitua "dataset\\faroeste.txt" com o caminho e nome do seu arquivo txt personalizado (por exemplo, "meu_arquivo.txt").

````
    Control control = new Control();
    control.initialize("dataset\\meu_arquivo.txt");
    control.printTree();
    control.saveTreeToTxt("meu_arquivo.txt");
````

### Compilar e Executar o Programa

Compile o programa usando seu compilador Java preferido e execute a classe Main.

### Verificar o Resultado

O programa irá ler o arquivo txt personalizado, construir uma árvore binária, imprimir a árvore e salvar a árvore em um arquivo txt com o nome saida_meu_arquivo.txt (ou o nome que você escolher).


````
    Control control = new Control();
    control.initialize("dataset\\meu_arquivo.txt");
    control.printTree();
    control.saveTreeToTxt("nome_que_escolher_do_txt.txt");
````


### Dicas

Certifique-se de que o arquivo txt esteja no mesmo diretório que o programa ou especifique o caminho completo do arquivo.
Verifique se o arquivo txt está no formato correto para ser lido pelo programa.
Se você quiser ler vários arquivos, basta criar instâncias adicionais da classe Control e inicializá-las com os nomes dos arquivos desejados.

