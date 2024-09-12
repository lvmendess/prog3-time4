public class Main {
    public static void main(String args[]){
        ReadTxt txt = new ReadTxt();
        txt.read("dataset\\faroeste.txt");
        txt.read("dataset\\brasil.txt");

        BinaryTree  tree = new BinaryTree(); 

        Word node = new Word("A");
        tree.insert(node);

        System.out.print(" Pre Order: ");
        tree.preOrderPublic();
        System.out.println();

        System.out.print(" In Order: ");
        tree.inOrderPublic();
        System.out.println();

        System.out.print(" Post Order: ");
        tree.postOrderPublic();
        System.out.println();
    
    }
}
