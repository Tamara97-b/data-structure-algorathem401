package trees;

import java.util.ArrayList;

public class BinaryTree<T> {

    ArrayList<T> preOrderList = new ArrayList<>();
    ArrayList<T> inOrderList = new ArrayList<>();
    ArrayList<T> postOrderList = new ArrayList<>();

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
    public int maxNumber(Node <Integer> rootNode) {
        if(rootNode==null) {
            return Integer.MIN_VALUE;
        }

        int maxNum=rootNode.value;
        int maxNumLeft= maxNumber(rootNode.leftChild);
        int maxNumRight=maxNumber(rootNode.rightChild);
        if(maxNumLeft>maxNum){
            maxNum=maxNumLeft;}
        if(maxNumRight>maxNum){
            maxNum=maxNumRight;}
        return maxNum;
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
