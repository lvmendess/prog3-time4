public class BinaryTree {
    private Word root;

    public BinaryTree() {
        this.root = null;
    }

    private Word insertNew(Word newNode, Word current) {
        if (current == null) {
            return newNode;
        }
        if (current.value.compareTo(newNode.value)>0) {
            current.left = insertNew(newNode, current.left);
        } else if(current.value.compareTo(newNode.value)<0){
            current.right = insertNew(newNode, current.right);
            return current;
        
        }

        return current;
    }

    public void insert(Word newNode) {
        root = insertNew(newNode, root);
    }
    
    private void preOrder(Word noX) {
        if (noX != null) {
            System.out.print(noX.value + " ");
            preOrder(noX.left);
            preOrder(noX.right);
        }
    }
    public void preOrderPublic(){
        preOrder(root);
    }

    private void inOrder(Word noX) {// ALGO ERRADO
        if (noX != null) {
            inOrder(noX.left);
            System.out.print(noX.value + " ");
            inOrder(noX.right);
        }
    }
    public void inOrderPublic(){
        inOrder(root);
    }

    private void postOrder(Word noX) {// ALGO ERRADO
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
