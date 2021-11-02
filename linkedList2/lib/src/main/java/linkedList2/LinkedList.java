package linkedList2;

import java.util.ArrayList;

public class LinkedList<T> {

    Node head;
    public LinkedList(){
        this.head = null;
    }

    public void insert(T value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }


    public String kthFromEnd(int k){
        int size = 0;
        ArrayList<Integer> listlinked = new ArrayList<>();
        Node current = head;
        if (current == null){
            return "empty";
        }
        while (current!=null){
            current = current.next;
            size++;
        }
        if(k > listlinked.size() || k < 0){
            return"error";
        }
        return "number that" + k + "from tail" + listlinked.get((size-1)-k);
    }

    @Override
    public String toString() {
        Node current = head;
        String result = "";
        while (current != null) {
            result += "{" + current.value + "}--->";
            current = current.next;
        }
        result+="NULL";
        return result;
    }
    public static LinkedList ziplists(LinkedList one, LinkedList two) {
        Node oneCurrent = one.head;
        Node twoCurrent = two.head;
        Node temp1;
        Node temp2;
        // if list are empty
        if (oneCurrent == null) return two;
        if (twoCurrent == null) return one;
        while(true){
            temp1 = oneCurrent.next;
            temp2 = twoCurrent.next;
            oneCurrent.next = twoCurrent;
            oneCurrent = temp1;
            if (oneCurrent == null) break;
            twoCurrent.next = oneCurrent;
            twoCurrent = temp2;
            if (twoCurrent == null) break;
        }
        return one;
    }
    }

