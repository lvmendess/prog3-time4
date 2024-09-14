import java.io.FileWriter;
import java.io.IOException;
/**
 * Classe de controle que gerencia a leitura de arquivos, a construção da árvore e a gravação de árvores em arquivos.
 * 
 */
public class Control {
    /**
     * Leitor de arquivos de texto.
     */
    ReadTxt leitor;
    /**
     * Árvore binária.
     */
    BinaryTree tree;

    /**
     * Construtor da classe Control.  Inicializa o leitor de arquivos e a árvore binária. 

     */
    public Control() {
        leitor = new ReadTxt();
        tree = new BinaryTree();
    }

    /**
     * Inicializa a leitura de um arquivo e constrói a árvore binária.
     * 
     * @param filepath caminho do arquivo a ser lido
     */
    public void initialize(String filepath) {
        leitor.read(filepath, tree);
    }

    /**
     * Imprime a árvore com as palavras e o array com as linhas.
     */
    public void printTree() {
        tree.print();
    }

    /**
     * Salva a árvore binária em um arquivo de texto.
     * 
     * @param filename nome do arquivo a ser salvo
     */
    public void saveTreeToTxt(String filename) {
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(treeToString(tree));
            writer.close();
            System.out.println("Árvore salva no arquivo '" + filename + "'.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo: " + filename);
            e.printStackTrace();
        }
    }
    /**
     * Converte a árvore em uma string.
     * 
     * @param tree árvore a ser convertida
     * @return string representando a árvore
     */
    private String treeToString(BinaryTree tree) {
        return tree.buildString(tree.getRoot());
    }
}