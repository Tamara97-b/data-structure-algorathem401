package linked.list;

public class Library<head> {
    public static void main (String[] args ){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.insert(4);
        linkedList.insert(7);
        linkedList.insert(8);
        linkedList.kthFromEnd(2);
        System.out.println("after k th function");
        System.out.println(linkedList);
        System.out.println("after insert append");
        linkedList.append(10);
        System.out.println(linkedList);
        System.out.println("after insert before");
        System.out.println(linkedList);
        linkedList. insertBefore(4,5);
        System.out.println("after insert after");
        linkedList.insertAfter(5,7);
        System.out.println(linkedList);
        System.out.println(linkedList.includes(7));}


    }

        


