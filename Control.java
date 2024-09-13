public class Control {
    ReadTxt leitor;
    BinaryTree tree;

    public Control(){
        leitor = new ReadTxt();
        tree = new BinaryTree();
    }

    public void initialize(String filepath){
        leitor.read(filepath, tree);
    }

    public void printTree(){
        tree.print();
    }
}
