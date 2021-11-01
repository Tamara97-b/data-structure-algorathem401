/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package trees;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    public static void main(String[] args) {
        BinaryTree<String> newTree = new BinaryTree<>();

        Node<String> nodeD = new Node<>("D");
        Node<String> nodeE = new Node<>("E");
        Node<String> nodeB = new Node<>("B", nodeD, nodeE);
        Node<String> nodeF = new Node<>("F");
        Node<String> nodeC= new Node<>("C", nodeF, null);
        Node<String> newTreeRoot = new Node<>("A", nodeB, nodeC);
        System.out.println("preOrder: "+newTree.preOrder(newTreeRoot));
        System.out.println("inOrder: "+newTree.inOrder(newTreeRoot));
        System.out.println("postOrder: "+newTree.postOrder(newTreeRoot));
        System.out.println(newTree.toString());


        BinarySearchTree binarySearchTree = new BinarySearchTree();

        Node<Integer> searchNode0 = new Node<>(24);
        Node<Integer> searchNode1 = new Node<>(6);
        Node<Integer> searchNode2 = new Node<>(20, null, searchNode0);
        Node<Integer> searchNode3 = new Node<>(10, searchNode1, searchNode2);
        Node<Integer> searchNode5 = new Node<>(30);
        Node<Integer> searchNode7 = new Node<>(205);
        Node<Integer> searchNode6 = new Node<>(99, null, searchNode7);
        Node<Integer> searchNode4 = new Node<>(45, searchNode5, searchNode6);
        binarySearchTree.root = new Node<>(25, searchNode3, searchNode4);
        binarySearchTree.add(15);
        binarySearchTree.add(9);
        binarySearchTree.add(28);
        binarySearchTree.add(28);
        binarySearchTree.add(-1);
        System.out.println("preOrder: "+binarySearchTree.preOrder(binarySearchTree.root));
        System.out.println("inOrder: "+binarySearchTree.inOrder(binarySearchTree.root));
        System.out.println("postOrder: "+binarySearchTree.postOrder(binarySearchTree.root));
        System.out.println("The result is (false): " + binarySearchTree.contains(7));
        System.out.println("The result is (true): " + binarySearchTree.contains(205));
        System.out.println("The result is (false): " + binarySearchTree.contains(-15));
        System.out.println("The result is (true): " + binarySearchTree.contains(-1));
        System.out.println("The result is (false): " + binarySearchTree.contains(23));


        BinaryTree<Integer> newTree1 = new BinaryTree<>();
        newTree1.root = new Node<>(25);
        Node<Integer> node1 = new Node<>(5);
        Node<Integer> node2 = new Node<>(24);
        Node<Integer> node3 = new Node<>(20, node1, node2);
        Node<Integer> node5 = new Node<>(28);
        Node<Integer> node4 = new Node<>(50, node5, null);
        newTree1.root.rightChild = node4;
        newTree1.root.leftChild = node3;
        System.out.println("The max value is: "+newTree1.maximumValue());
    }
}

