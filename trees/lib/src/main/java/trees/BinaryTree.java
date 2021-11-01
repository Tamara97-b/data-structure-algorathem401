package trees;

import java.util.ArrayList;

public class BinaryTree<T> {

    ArrayList<T> preOrderList = new ArrayList<>();
    ArrayList<T> inOrderList = new ArrayList<>();
    ArrayList<T> postOrderList = new ArrayList<>();
    Node<Integer> root;
    public ArrayList<T> preOrder(Node<T> root) {

        if (root != null) {
            preOrderList.add(root.value);
            preOrder(root.leftChild);
            preOrder(root.rightChild);
        }
        else{
            System.out.println("error");
        }
            return preOrderList;
        }

    public ArrayList<T> inOrder(Node<T> root) {

            if (root != null) {
                inOrder(root.leftChild);
                inOrderList.add(root.value);
                inOrder(root.rightChild);
            }
            else{
                System.out.println("error");
            }

        return inOrderList;
    }

    public ArrayList<T> postOrder(Node<T> root) {

            if (root != null) {
                postOrder(root.leftChild);
                postOrder(root.rightChild);
                postOrderList.add(root.value);
            }

            else{
                System.out.println("error");
            }
        return postOrderList;
    }


    public int maximumValue() {
        if (root == null){
            return 0;
        }
        if (root.leftChild == null || root.rightChild == null){
            return root.value;
        }
        int maxValue = 0;
        ArrayList<Integer> maxList = (ArrayList<Integer>) postOrder((Node<T>) root);
        for (Integer integer : maxList) {
            if (integer >= maxValue) {
                maxValue = integer;
            }
        }
        return maxValue;
    }


    public void  binaryTree() {
        root = null;
    }

    void printLevelOrder()
    {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++)
            breadthfirst(root, i);
    }


    int height(Node root)
    {
        if (root == null)
            return 0;
        else {
            int lheight = height(root.leftChild);
            int rheight = height(root.rightChild);

            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }


    void  breadthfirst(Node root, int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.value + " ");
        else if (level > 1) {
            breadthfirst(root.leftChild, level - 1);
            breadthfirst(root.rightChild, level - 1);
        }
    }
    @Override
    public String toString() {
        if (preOrderList.isEmpty()&&inOrderList.isEmpty()&&postOrderList.isEmpty()) return "empty tree lists";
        else return "BinaryTree{" +
                ", preOrderList=" + preOrderList +
                ", inOrderList=" + inOrderList +
                ", postOrderList=" + postOrderList +
                '}';
    }
}
