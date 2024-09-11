public class BinaryTree {
    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    private Node insertNew(Node newNode, Node current) {
        if (current == null) {
            return newNode;
        }

        if (current.value > newNode.value) {
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

    private Node findElement(Node current, int value) { 
        if (current == null) {
            return null;
        }
        if (value > current.value) {
            if (current.right != null) {
                if (current.right.value == value) {
                    return current;
                }
            }
        } else {
            if (current.left != null) {
                if (current.left.value == value) {
                    return current;
                }
            }
        }
        if (current.value > value) {
            return findElement(current.right, value);
        }
        if (current.value < value) {
            return findElement(current.left, value);
        }
        return current;
    }

    public void findElementPublic(int value) {
        findElement(root, value);
    }

    private boolean remove(int value) {
        Node father;
        Node nodeX;
        if (root == null) {
            return false;
        } else {
            if (root.value == value) {
                father = root;
                nodeX = root;
            } else {
                father = findElement(root, value);
                if (father.value < value) {
                    nodeX = father.right;
                } else {
                    nodeX = father.left;
                }
            }
        }
        if (nodeX.right == null && nodeX.left == null) {// Case 1 - Sheet
            if (father.value < value) {
                father.right = null;
            } else {
                father.left = null;
            }

        } else {
            if (nodeX.right != null && nodeX.left != null) { // Case 3- Two children
                Node nodeFatherRightLeft = moreLeftPossible(nodeX, nodeX.right);
                Node substitute = nodeFatherRightLeft.left;
                nodeFatherRightLeft.left = null;
                substitute.right = nodeX.right;
                substitute.left = nodeX.left;
                nodeX.left = null;
                nodeX.right = null;
                if (father.value < value) {
                    father.right = substitute;
                } else {
                    father.left = substitute;
                }
            } else {// Case 2 - One Children
                if (nodeX.right == null) {
                    if (father.value < value) {
                        father.right = nodeX.left;
                    } else {
                        father.left = nodeX.left;
                    }
                    nodeX.left = null;
                }
                if (nodeX.left == null) {
                    if (father.value > value) {
                        father.right = nodeX.right;
                    } else {
                        father.left = nodeX.right;
                        nodeX.right = null;
                    }
                }
            }

        }
        return true;
    }

    public void removePublic(int value) {
        remove(value);
    }

    private Node moreLeftPossible(Node father, Node currentChildren) {
        if (currentChildren.left == null) {
            return father;
        }
        return moreLeftPossible(father, currentChildren);
    }

    private Node search(Node current, int value) {
        if (current == null) {
            return null;
        }
        if (current.value == value) {
            return current;
        }
        if (current.value < value) {
            return findElement(current.right, value);
        }
        if (current.value > value) {
            return findElement(current.left, value);
        }
        return current;
    }

    public Node searchPublic(int value) {
        return search(this.root, value);
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
