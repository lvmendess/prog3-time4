public class Main {
    public static void main(String args[]){
        ReadTxt txt = new ReadTxt();
        txt.read("dataset\\faroeste.txt");
        txt.read("dataset\\brasil.txt");


        BinaryTree  tree = new BinaryTree(); 

        Node node = new Node(A);
        tree.insert(node);
        

        node = new Node(B);
        tree.insert(node);

        node = new Node(C);
        tree.insert(node);

        node = new Node(D);
        tree.insert(node);

        node = new Node(E);
        tree.insert(node);

        node = new Node(F);
        tree.insert(node);

        node = new Node(G);
        tree.insert(node);

       // tree.insert(new Node());
        //tree.removePublic(3); // esta dando problema de null pointer
        tree.findElementPublic(5);

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
