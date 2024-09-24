
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
    public int altura() {
        return calculateHeight(root, 0);
    }


    /**
     * Método auxiliar para calcular altura. Usa recursividade
     * 
     * @param atual  a palavra que está percorrendo
     * @param altura encontrada até então
     * @return a altura final
     */
    private int calculateHeight(Word current, int height) {
        if (current == null) {
            return height; // Se o nó for null, retorna a altura acumulada
        }
        //se o nó atual é uma folha
        if (current.getLeft() == null && current.getRight() == null) {
            return height + 1;
        }
        // Recursão para os filhos esquerda e direita
        int leftHeight = calculateHeight(current.getLeft(), height + 1);
        int rightHeight = calculateHeight(current.getRight(), height + 1);
        // Retorna a maior altura entre as subárvores esquerda e direita
        return Math.max(leftHeight, rightHeight);
    }


    /**
     * Verifica se a árvore a partir da raiz fornecida é balanceada.
     *
     * @param raiz O nó raiz da árvore.
     * @return true se a árvore é balanceada, false caso contrário.
     */
    public boolean isBalanced() {
        return checkBalancing(root);
    }

    /**
     * /**
     * Verifica se a árvore binária é balanceada. Método auxiliar recursivo
     *
     * @param atual O nó atual da árvore.
     * @return true se a árvore é balanceada, false caso contrário.
     */
    private boolean checkBalancing(Word current) {
        if (current == null) {
            return true;
        }

        int leftHeight = calculateHeight(current.getLeft(), 0);
        int rightHeight = calculateHeight(current.getRight(), 0);

        if (Math.abs(rightHeight - leftHeight) > 1) {
            return false; // Se a diferença de altura for maior que 1, não está balanceada
        }

        // Verifica recursivamente os filhos
        return checkBalancing(current.getLeft()) && checkBalancing(current.getRight());
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
        } else if (current.getValue().compareTo(newNode.getValue()) < 0) {
            current.setRight(insertNew(newNode, current.getRight()));
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
