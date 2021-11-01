package linked.list;

public class LinkedList<T>{
    Node head;
    int size;

    public int getSize() {
        return size;
    }

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


//    public Node kthFromEnd(int index) {
//
//       Node current = head;
//        if (head == null) {
//            System.out.println("The list is empty");
//        }
//        if (index > getSize() - 1 || index < 0) {
//            System.out.println("exception");
//        }
//        int i = 0;
//        while (i < (getSize() - index - 1)) {
//            current = current.next;
//            i++;
//        }
//        return current.next ;
//    }
//    public String kthFromEnd(int k) {
//        if (head == null) {
//            return "the node is empty";
//        }
//        Node<T> current = head;
//        int counter = 0;
//        while (current.next != null) {
//            current = current.next;
//            counter++;
//        }
//
//        if (k > counter || k < 0) {
//            return "Exception";
//        } else {
//            current = head;
//            for (int i = 0; i <= counter - k; i++) {
//                if (i == counter - k) {
//                    return "{" + current.value + "}";
//                }
//                current = current.next;
//            }
//        }
//        return "Exception";
//    }

}








