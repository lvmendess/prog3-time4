
/**
 * Uma classe para representar uma árvore binária de palavras.
 */
public class BalancedBinaryTree {

    /**
     * A raiz da árvore binária.
     */
    private Word root;

    /**
     * Construtor padrão.
     */
    public BalancedBinaryTree() {
        this.root = null;
    }
 /**
     * Método auxiliar para inserir uma nova palavra na árvore.
     * 
     * @param newNode a palavra a ser inserida
     * @param current o nó atual da árvore
     * @return o nó atualizado da árvore
     */
    private Word insertNew(Word newNode, Word current) {
        if (current == null) {
            return newNode;
        }
        if (current.getValue().compareTo(newNode.getValue()) > 0) {
            current.setLeft(insertNew(newNode, current.getLeft()));
            balanceTree();
        } else if (current.getValue().compareTo(newNode.getValue()) < 0) {
            current.setRight(insertNew(newNode, current.getRight()));
            balanceTree();
            return current;
           
        }
 
        return current;
    }

    /**
     * Insere uma nova palavra na árvore.
     *
     * @param newNode a palavra a ser inserida
     */
    public void insert(Word newNode) {
        Word w = exists(newNode);
        if (w == null) {
            root = insertNew(newNode, root);
        } else {
            w.addLineAtList(newNode.getLines());
        }

    }
    /**
     * Verifica se uma palavra já existe na árvore.
     *
     * @param w a palavra a ser verificada
     * @return a palavra encontrada na árvore, ou null se não existir
     */
    public Word exists(Word w) {
        return wordExists(w, root);
    }

    /**
     * Método auxiliar para verificar se uma palavra existe na árvore.
     *
     * @param w       a palavra a ser verificada
     * @param current o nó atual da árvore
     * @return a palavra encontrada na árvore, ou null se não existir
     */
    private Word wordExists(Word w, Word current) {
        if (current == null) {
            return null;
        } else if (current.getValue().equals(w.getValue())) {
            return current;
        } else {
            if (current.getValue().compareTo(w.getValue()) > 0) {
                return wordExists(w, current.getLeft());
            } else if (current.getValue().compareTo(w.getValue()) < 0) {
                return wordExists(w, current.getRight());
            } else {
                return null;
            }
        }
    }

    /**
     * Método para calcular altura na árvore.
     * 
     * @return a altura da árvore
     */
    public int height() {
        return calculateHeight(root);
    }

    /**
     * Método auxiliar para calcular altura. Usa recursividade
     * 
     * @param atual a palavra que está percorrendo
     * @return a altura final
     */
    private int calculateHeight(Word current) {
        if (current == null) {
            return 0; // Se o nó for null, retorna 0
        }
        // Recursão para os filhos esquerda e direita
        int leftHeight = calculateHeight(current.getLeft()) + (current.getLeft() == null ? 0 : 1);
        int rightHeight = calculateHeight(current.getRight()) + (current.getLeft() == null ? 0 : 1);
        // Retorna a maior altura entre as subárvores esquerda e direita
        return Math.max(leftHeight, rightHeight);
    }

    /**
     * Faz balanceamento na árvore inteira.
     *
     * @param raiz O nó raiz da árvore.
     */
    public void balanceTree() {
        checkBalancing(root);
    }

    /**
     * /**
     * Verifica se a árvore binária é balanceada. Método auxiliar recursivo
     *
     * @param atual O nó atual da árvore.
     */
    private void checkBalancing(Word current) {
        if (current == null) {
            return;
        }
        int balancing = calculateHeight(current.getRight()) - calculateHeight(current.getLeft());
        current.setBalancingFactor(balancing);
        if (Math.abs(balancing) > 1) {
            orderBalancingFactor(current);
        }
        checkBalancing(current.getRight());
        checkBalancing(current.getLeft());
    }

    private void orderBalancingFactor(Word current){
        if(current.getBalancingFactor()==-2){
            if(current.getLeft().getBalancingFactor()==-1||current.getBalancingFactor()==0){
                rotationLeftLeft();
            } else if (current.getRight().getBalancingFactor()==1) {
                rotationLeftRight();
            }
        }else if(current.getBalancingFactor()==2){
            if(current.getLeft().getBalancingFactor()==1||current.getBalancingFactor()==0){
                rotationRightRight();
            } else if (current.getRight().getBalancingFactor()==-1) {
                rotationRightLeft();
            }

        }
    }
    private void rotationLeftLeft(){

    }
    private void rotationRightRight(){

    }
    private void rotationLeftRight(){

    }
    private void rotationRightLeft(){

    }

   

    /**
     * Método auxiliar private (usado pelo preOrderPublic()) para percorrer em
     * pré-ordem na árvore.Usa recursividade.
     * 
     * @param noX o nó atual da árvore
     */
    private void preOrder(Word noX) {
        if (noX != null) {
            System.out.print(noX.getValue() + " ");
            preOrder(noX.getLeft());
            preOrder(noX.getRight());
        }
    }

    /**
     * Percorre em pré-ordem na árvore e imprime os valores das palavras em
     * pré-ordem.
     */
    public void preOrderPublic() {
        preOrder(root);
    }

    /**
     * Método auxiliar private (usado pelo inOrderPublic()) para percorrer em ordem
     * na árvore. Usa recursividade.
     * 
     * @param noX o nó atual da árvore
     */
    private void inOrder(Word noX) {
        if (noX != null) {
            inOrder(noX.getLeft());
            System.out.print(noX.getValue() + " ");
            inOrder(noX.getRight());
        }
    }

    /**
     * Percorre em ordem na árvore e imprime os valores das palavras.
     */
    public void inOrderPublic() {
        inOrder(root);
    }

    /**
     * Método auxiliar private (usado pelo postOrderPublic()) para percorrer em
     * pós-ordem na árvore.Usa recursividade.
     * 
     * @param noX o nó atual da árvore
     */
    private void postOrder(Word noX) {
        if (noX != null) {
            postOrder(noX.getLeft());
            postOrder(noX.getRight());
            System.out.print(noX.getValue() + " ");
        }
    }

    /**
     * Percorre em pós-ordem na árvore e imprime os valores das palavras.
     */
    public void postOrderPublic() {
        postOrder(root);
    }

    /**
     * Método auxiliar private (usado pelo print()) para imprimir todas as palavras
     * da árvore, junto com suas linhas. Usa recursividade.
     * 
     * @param noX o nó atual da árvore
     */
    private void printAll(Word noX) {
        if (noX != null) {
            printAll(noX.getLeft());
            System.out.print(noX.getValue() + " " + noX.getWordLines().printAll() + '\n');
            printAll(noX.getRight());
        }
    }

    /**
     * Imprime todas as palavras da árvore, junto com suas linhas.
     */
    public void print() {
        printAll(root);
    }

    /**
     * Constrói uma string representando a árvore binária. Usa recursividade para
     * percorrer os nós.
     * 
     * @param node o nó atual da árvore
     * @return a string representando a árvore binária
     */
    public String buildString(Word node) {
        if (node == null) {
            return "";
        }
        String leftString = buildString(node.getLeft());
        String currentString = node.getValue() + " " + node.getWordLines().printAll() + "\n";
        String rightString = buildString(node.getRight());
        return leftString + currentString + rightString;
    }

    /**
     * Retorna a raiz da árvore binária.
     * 
     * @return a raiz da árvore binária
     */
    public Word getRoot() {
        return root;
    }
}
