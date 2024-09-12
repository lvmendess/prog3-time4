public class BinaryTree {
    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    private Node insertNew(Node newNode, Node current) {
        if (current == null) {
            return newNode;
        }

        if (current.value.equals(newNode.value)) {
            current.left = insertNew(newNode, current.left);
        } else {
            if (current.value != newNode.value) {
                current.right = insertNew(newNode, current.right);
                return current;
            }
        }

        return current;
    }

    public void insert(Node newNode) {
        root = insertNew(newNode, root);
    }
    
    private void preOrder(Node noX) {
        if (noX != null) {
            System.out.print(noX.value + " ");
            preOrder(noX.left);
            preOrder(noX.right);
        }
    }
    public void preOrderPublic(){
        preOrder(root);
    }

    private void inOrder(Node noX) {// ALGO ERRADO
        if (noX != null) {
            inOrder(noX.left);
            System.out.print(noX.value + " ");
            inOrder(noX.right);
        }
    }
    public void inOrderPublic(){
        inOrder(root);
    }

    private void postOrder(Node noX) {// ALGO ERRADO
        if (noX != null) {
            postOrder(noX.left);
            postOrder(noX.right);
            System.out.print(noX.value + " ");
        }
    }
    public void postOrderPublic(){
        postOrder(root);
    }
}
