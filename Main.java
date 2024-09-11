public class Main {
    public static void main(String args[]){
        ReadTxt txt = new ReadTxt();
        txt.read("dataset\\faroeste.txt");
        txt.read("dataset\\brasil.txt");


        BinaryTree  tree = new BinaryTree(); 

        Node node = new Node(40);
        tree.insert(node);
        

        node = new Node(20);
        tree.insert(node);

        node = new Node(60);
        tree.insert(node);

        node = new Node(10);
        tree.insert(node);

        node = new Node(30);
        tree.insert(node);

        node = new Node(50);
        tree.insert(node);

        node = new Node(70);
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
