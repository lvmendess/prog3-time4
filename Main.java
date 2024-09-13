public class Main {
    public static void main(String args[]){
        ReadTxt txt = new ReadTxt();
        txt.read("dataset\\faroeste.txt");
        txt.read("dataset\\brasil.txt");

        BinaryTree  tree = new BinaryTree(); 

        Word node = new Word("A", 1);
        tree.insert(node);

        node = new Word("tres", 2);
        tree.insert(node);

        node = new Word("jesus", 4);
        tree.insert(node);

        node = new Word("jesus", 5);
        tree.insert(node);

        node = new Word("deus", 6);
        tree.insert(node);

        // System.out.print(" Pre Order: ");
        // tree.preOrderPublic();
        // System.out.println();

        // System.out.print(" In Order: ");
        // tree.inOrderPublic();
        // System.out.println();

        // System.out.print(" Post Order: ");
        // tree.postOrderPublic();
        // System.out.println('oi livia');

        tree.print();
        // String oi = node.wordLines.printAll();
        // System.out.println(oi);
    }
}
