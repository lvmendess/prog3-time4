import java.io.FileWriter;
import java.io.IOException;

public class Control {
    ReadTxt leitor;
    BinaryTree tree;

    public Control() {
        leitor = new ReadTxt();
        tree = new BinaryTree();
    }

    public void initialize(String filepath) {
        leitor.read(filepath, tree);
    }

    public void printTree() {
        tree.print();
    }

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
    private String treeToString(BinaryTree tree) {
        return tree.buildString(tree.getRoot());
    }
}
