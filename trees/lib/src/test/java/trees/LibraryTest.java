/*
 * This Java source file was generated by the Gradle 'init' task.
 */
/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void returnTrueMethod() {
        Library test = new Library();
        assertTrue(test.someLibraryMethod(), " true");
    }

    @Test void emptyMethod() {
        BinaryTree<Integer> newTree = new BinaryTree<>();
        assertTrue(newTree instanceof BinaryTree);
        assertEquals("empty tree lists" , newTree.toString());
    }

    @Test void rootMethod() {
        BinaryTree<Integer> newTree = new BinaryTree<>();
        Node<Integer> root = new Node<>(1);
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(1);
        assertEquals(testList , newTree.inOrder(root));
        assertEquals(1, root.value);
        assertEquals(null , root.leftChild);
        assertEquals(null ,root.rightChild);
    }

    @Test void childMethod() {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> treeRoot = new Node<>(3, node1 , node2);
        assertEquals( 3 , treeRoot.value);
        assertEquals( 1 , treeRoot.leftChild.value);
        assertEquals( 2 , treeRoot.rightChild.value);
    }

    @Test void traversalMethod() {

        BinaryTree<Integer> tree = new BinaryTree<>();
        Node<Integer> node1 = new Node<>(2);
        Node<Integer> node2 = new Node<>(3);
        Node<Integer> node3 = new Node<>(1, node1, node2);
        Node<Integer> node5 = new Node<>(6);
        Node<Integer> node4 = new Node<>(4, node5, null);
        Node<Integer> treeRoot = new Node<>(5, node3, node4);

        List<Integer> preTestList = new ArrayList<>();
        preTestList.add(5);
        preTestList.add(1);
        preTestList.add(2);
        preTestList.add(3);
        preTestList.add(4);
        preTestList.add(6);
        assertEquals( preTestList , tree.preOrder(treeRoot));

        List<Integer> inTestList = new ArrayList<>();
        inTestList.add(2);
        inTestList.add(1);
        inTestList.add(3);
        inTestList.add(5);
        inTestList.add(6);
        inTestList.add(4);
        assertEquals( inTestList , tree.inOrder(treeRoot));

        List<Integer> postTestList = new ArrayList<>();
        postTestList.add(2);
        postTestList.add(3);
        postTestList.add(1);
        postTestList.add(6);
        postTestList.add(4);
        postTestList.add(5);
        assertEquals( postTestList , tree.postOrder(treeRoot));

        String test = "BinaryTree{, preOrderList=[5, 1, 2, 3, 4, 6], inOrderList=[2, 1, 3, 5, 6, 4], postOrderList=[2, 3, 1, 6, 4, 5]}";
        assertEquals(test , tree.toString());
    }

}
