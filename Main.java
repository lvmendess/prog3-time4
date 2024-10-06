/**
 * Classe principal do programa que executa a leitura de arquivos, construção de árvores binárias e gravação de árvores em arquivos.
 *
 * @author [Lívia Mendes, Luísa Duarte, Maria Eduarda, Pedro José, Pedro Ribas, Pedro Sanzio]
 */
public class Main {
    /**
     * Metodo que inicia o programa
     * @param args String
     */
    public static void main(String args[]) {
        // Cria instâncias da classe Control para todo os arquivos. A classe Control cria uma árvore e um ReadTxt para trabalhar o arquivo.
        Control control = new Control();
        control.initialize("C:\\Users\\user\\Documents\\BSI\\2024\\prog3\\tree\\prog3-time4\\dataset\\faroeste.txt");
        control.printTree();
        control.saveTreeToTxt("saida_faroeste.txt");

        // System.out.println();

        /*Control control2 = new Control();
        control2.initialize("dataset\\brasil.txt");
        control2.printTree();
        control2.saveTreeToTxt("saida_brasil.txt");*/
    }
}