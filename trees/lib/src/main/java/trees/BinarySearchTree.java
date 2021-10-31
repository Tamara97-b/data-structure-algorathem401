package trees;

public class BinarySearchTree extends BinaryTree {

    public Node<Integer> root;
    public void add(Integer value) {
        if (root.value == null) {
            root = new Node<>(value);
        } else {
            Node<Integer> node = root;
            Node<Integer> newNode = new Node<>(value);
            while (!value.equals(node.value) &&
                    (node.rightChild != newNode ||
                           node.leftChild != newNode)) {

                if (value < node.value) {
                    if (node.leftChild == null) {
                        node.leftChild = newNode;
                    } else {
                        node = node.leftChild;
                    }
                } else {
                    if (node.rightChild == null) {
                        node.rightChild = newNode;
                    } else {
                        node = node.rightChild;
                    }
                }
            }
        }
    }

    public boolean contains(Integer value) {
        if (root == null) {
            return false;
        }
        if (value.equals(root.value)) {
            return true;
        }

        Node<Integer> node = root;
        while (node.leftChild != null || node.rightChild != null) {
            if (value < node.value && node.leftChild != null) {
                node = node.leftChild;
            } else if (value > node.value && node.rightChild != null) {
                node = node.rightChild;
            } else {
                return false;
            }
            if (value.equals(node.value)) {
                return true;
            }
        }
        return false;
    }
}

