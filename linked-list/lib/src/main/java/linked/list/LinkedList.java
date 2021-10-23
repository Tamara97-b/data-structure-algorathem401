package linked.list;

import java.util.Stack;

public class LinkedList<T>{
    Node head;

    public LinkedList(){

        head = null;
    }

    public void insert(T value){
        Node newNode = new Node(value);
        newNode.next= head;
        head= newNode;
    }

    public boolean includes(T value){
        Node current = head;
        while (current !=null){
            if(current.value==value){
                return true;
            }
            else{
                current=current.next;
            }
        }
        return false;

    }

    @Override
    public String toString() {
        Node current = head;
        String result = "";
        while (current!=null){
            result+="{ "+current.value+"}->";
            current= current.next;
        }
        result+="null";
        return result;
    }
    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

    }

    public void insertBefore(int value, int newValue) {
        Node newNode = new Node(newValue);

        if (head.value.equals(value)) {
            Node newPosition = head;
            head = newNode;
            newNode.next = newPosition;

        } else {
            Node current = head;
            while (current.next != null) {
                if (current.next.value.equals( value)) {
                    Node newPosition = current.next;
                    current.next = newNode;
                    newNode.next = newPosition;

                }
                current = current.next;

            }
        }
    }


    public void insertAfter(int value, int newValue) {
        Node newNode = new Node(newValue);

        Node current = head;
        while (current != null) {
            if (current.value.equals(value)) {
                Node newPosition= current.next;
                current.next = newNode;
                newNode.next = newPosition;
            }
            current = current.next;

        }

    }

}






