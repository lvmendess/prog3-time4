/**
 * Classe principal do programa que executa a leitura de arquivos, construção de árvores binárias e gravação de árvores em arquivos.
 * 
 * @author [Lívia Mendes, Luísa Duarte, Maria Eduarda, Pedro José, Pedro Ribas, Pedro Sanzio]
 */
public class Main {

    /**
     * Método principal do programa.
     */
    public static void main(String args[]) {
        // Cria instâncias da classe Control para todo os arquivos. A classe Control cria uma árvore e um ReadTxt para trabalhar o arquivo.
        Control control = new Control();
        control.initialize("dataset\\faroeste.txt");
        control.printTree();
        control.saveTreeToTxt("saida_faroeste.txt");

        System.out.println();

        Control control2 = new Control();
        control2.initialize("dataset\\lose-yourself.txt");
        control2.printTree();
        control2.saveTreeToTxt("saida_lose-yourself.txt");

        System.out.println();

        Control control3 = new Control();
        control3.initialize("dataset\\brasil.txt");
        control3.printTree();
        control3.saveTreeToTxt("saida_brasil.txt");

        System.out.println();

        Control control4 = new Control();
        control4.initialize("dataset\\joao-e-maria.txt");
        control4.printTree();
        control4.saveTreeToTxt("saida_joao-e-maria.txt");
    }
}