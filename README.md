# TP3: Calculadora de Notação Polonesa Inversa

## Lembretes:

- Comando para clonar esta branch: `git clone --single-branch --branch tp3-calculadora-notacao-polonesa https://github.com/lvmendess/prog3-time4/`
- Caso queira modificar um arquivo da `main`, crie uma branch separada com o nome da dupla e realize um pull request dos arquivos modificados. :)

## O que fazer?

Desenvolva um código capaz de receber como entrada uma expressão em notação pós-fixada e transformá-la em notação infixa ou notação convencional. Ao final, você deverá imprimir o resultado da expressão.

## Dicas

Use pilha para tratar a notação pós-fixada e, para auxiliar na conversão e montagem da expressão em notação convencional, utilize fila.

## Observações!

É necessária a utilização dos conceitos de OO, Pilha e Fila! Não podemos utilizar estruturas de dados prontas.

## Tarefas

Organizamos as tarefas da seguinte forma: dividimos o grupo em trios, e cada trio possui uma responsabilidade.

- Adicionar as classes `Cell`, `Variable` e `Operator` - Pedro Ribas, Lívia e Pedro Sanzio
- Adicionar as classes `Stack`, `Queue`, `Conversion`, `Tools` - Maria Eduarda, Luísa, Pedro Lopes
- Adicionar a classe `Main` e fazer um `Scanner` para receber a expressão pelo teclado - Maria Eduarda, Luísa, Pedro Lopes
- Criar um método na classe `Conversion` que receberá uma expressão polonesa como parâmetro, separará seus caracteres e os colocará, individualmente, na pilha - Pedro Ribas, Lívia e Pedro Sanzio
- Criar um método na classe `Tools` chamado `toDouble`, que recebe uma string como parâmetro e a converte para double. Caso a conversão para double dê errado, o método deve retornar null.
- Criar o método na classe `Conversion` que realizará a conversão da expressão polonesa para a expressão infixa, utilizando pilha e fila - Maria Eduarda, Luísa, Pedro Lopes
- Criar o método na classe `Conversion` que realizará as operações e adicionará o resultado na Fila - Pedro Ribas, Lívia e Pedro Sanzio
