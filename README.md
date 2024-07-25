<h1>TP2: Tweet sentiment</h1>
<h3>Como clonar essa branch?</h3>
<ul>
  <li>1. Abrir terminal do vscode</li>
  <li>2. Cole no terminal: git clone --single-branch --branch tp2-twitter-lista https://github.com/lvmendess/prog3-time4/</li>
</ul>
<h3>Como criar sua branch para não mexer na branch errada?</h3>
<ul>
  <li>Após clonar a branch, clique no botão "main" no canto inferior esquerdo do vscode</li>
  <li>Clique em "New Branch"</li>
  <li>Nomeie sua branch (favor colocar seu nome)</li>
</ul>
<h3>Como commitar direto do vscode?</h3>
<ul>
  <li>1. Abrir terminal</li>
  <li>2. git config --global user.name "seu_username_do_github"</li>
  <li>3. git config --global user.email "seu_email_do_github"</li>
  <li>4. confirmar login na janela do navegador que aparecer</li>
  <li>5. Clicar no botão azul "Commit" na barra lateral do vscode</li>
  <li>6. Escrever nota de commit e salvar (botão de V no canto superior direito do vscode)</li>
  <li>7. Clicar no botão azul "Sync changes"/"Publish Branch" na barra lateral do vscode</li>
</ul>
</br>
<h2>Perguntas à responder</h2>
<ul>
  <li>1. Qual o volume de tweets para cada idioma?</li>
  <li>2.1. Qual o volume total de tweets positivos?</li>
    <ul><li>2.2. E qual o volume total de tweets negativos?</li></ul>
  <li>3.1. Qual o idioma com mais tweets negativos?</li>
    <ul>
      <li>3.2. Qual o idioma com mais tweets positivos?</li>
      <li>3.3. É possível fazer um ranking dos idiomas?</li>
    </ul>
  <li>4.1. Algum tweeter teve registro em mais de um idioma?</li>
    <ul><li>4.2. Qual, quais e/ou quantos?</li></ul>
</ul>
<h2>Tarefas</h2>
<h3>DONE</h3>
<ul>
  <li>Criar classe Tweet (propriedades, construtores, getters, setters) *[DONE]* {Lívia}</li>
</ul>
<h3>TO-DO</h3>
<ul>
  <li>Classe List (tipo de lista a definir)</li>
  <li>Classe ListTweetsLanguage que une todos os tweets de um idioma //perguntas: 1, 3.1 e 3.2 {Duda}</li>
  <li>Classe Twetter; attributes: lista de tweets, annotatorId; construtor, getters e setters //perguntas 4.1 e 4.2 {Pedro Ribas e Luísa}</li>
  <li>Método contador de tweets por Handlabel (Classe ListTweetsLanguage) //perguntas 2.1, 2.2 {Sanzio}</li>
  <li>Método contador de tweets (Classe ListTweetsLanguage) //perguntas: 1, 3.1 e 3.2 {Pedro José}</li>
</ul>
