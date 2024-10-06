# TP5: Árvore Binária Balanceada

## Lembretes:

- Comando para clonar esta branch: `git clone --single-branch --branch tp5-binary-tree-balanced https://github.com/lvmendess/prog3-time4/`
- Caso queira modificar um arquivo da branch, crie uma branch separada com seu nome e realize um pull request dos arquivos modificados. :))

## O que fazer?

O trabalho consiste em implementar a árvore que criamos no tp4 de forma balanceada.

## Observações!

É necessária a utilização dos conceitos de Árvore Binária e Balanceamento de árvore! Não podemos utilizar estruturas de dados prontas.

## Tarefas

Decidi manter as duplas que foram utilizadas no tp4, dividi as tarefas da seguinte forma:

1- Criar método que calcula altura dos nós; Pedro Ribas e Pedro José

2- Criar método que verifica o balanceamento de cada nó; Pedro Ribas e Pedro José

3- Criar método de Rotação LL (direita simples); Lívia Mendes e Pedro Sanzio

4- Criar método de Rotação RR (esquerda simples); Duda e Luísa

5- Criar método de Rotação LR (esquerda-direita-dupla); Lívia Mendes e Pedro Sanzio

6- Criar método de Rotação RL (direita-esquerda-dupla); Pedro Ribas e Pedro José

7- Criar método que verifica os fatores de balanceamento e chama o método de rotação correto;  Duda e Luísa

8- Ajustar método de inserção para garantir que a árvore esteja reequilibrada após cada inserção; Lívia Mendes e Pedro Sanzio


## Autores

- [@pedrogribas](https://www.github.com/pedrogribas)
- [@lvmendess](https://www.github.com/lvmendess)
- [@luisads4](https://www.github.com/luisads4)
- [@phsanzio](https://www.github.com/phsanzio)
- [@PedroHL19](https://www.github.com/PedroHL19)
- [@DudaMatiasS ](https://github.com/DudaMatiasS)


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

