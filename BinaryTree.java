public class BinaryTree {
    private Word root;

    public BinaryTree() {
        this.root = null;
    }

    /*TODO: conferir se word já existe na árvore 
        - criar método exists(Word w) - DONE
        - adicionar verificação de existência (chamar método exists()) ao método de inserção - TO-DO
            * se existe: acessar lista de linhas da word presente na árvore e adicionar linha
            * se não: adicionar word à árvore
     */

    public Word exists(Word w){
        return wordExists(w, root);
    }

    private Word wordExists(Word w, Word current){ //testar, não sei se funciona
        if(current==null){ //se chegar em nó terminal/folha
            return null;
        }else if(current.value.equals(w.value)){ //palavra à inserir é igual à raiz
            return current;
        }else{
            if(current.value.compareTo(w.value)>0){//procura na sub-árvore esquerda
                return wordExists(w, current.left);
            }else if(current.value.compareTo(w.value)<0){//procura na sub-árvore direita
                return wordExists(w, current.right);
            }else{
                return null;
            }
        }
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
        Word w = exists(newNode);
        if (w == null){
            root = insertNew(newNode, root);
        } 
        else {
            w.addLineAtList(newNode.getLines());
        }
        
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

    private void inOrder(Word noX) {
        if (noX != null) {
            inOrder(noX.left);
            System.out.print(noX.value + " ");
            inOrder(noX.right);
        }
    }

    public void inOrderPublic(){
        inOrder(root);
    }

    private void postOrder(Word noX) {
        if (noX != null) {
            postOrder(noX.left);
            postOrder(noX.right);
            System.out.print(noX.value + " ");
        }
    }
    public void postOrderPublic(){
        postOrder(root);
    }

    private void printAll(Word noX){
        if (noX != null) {
            printAll(noX.left);
            System.out.print(noX.value + " " + noX.wordLines.printAll() + '\n');
            printAll(noX.right);
        }
    }

    public void print(){
        printAll(root);
    }
}
