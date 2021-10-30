package stack.and.queue;

public class Queue<T> {
    Node<T> front;
    Node<T> back;


    public void  enqueue(T value){
        Node<T> newNode=new Node<>(value);
        if(front==null){
            front=newNode;
        }else {
            back.next=newNode;
        }
        back=newNode;
    }


    public T dequeue(){
        try{
            Node<T> temp=front;
            front=front.next;
            temp.next=null;
            return temp.value;
        } catch (NullPointerException e) {
            return null;
        }
    }

    public T peek(){
        try{
            return front.value;
        } catch (NullPointerException e) {
            return null;
        }
    }

    public boolean isEmpty(){
        return front==null;
    }

    @Override
    public String toString() {

        if (front==null){
            return null;
        }
        StringBuilder queueList= new StringBuilder("Queue: front=");
        Node<T> current=front;
        while (current.next!=null){
            queueList.append("[").append(current.value).append("]").append("-->");
            current=current.next;
        }
        queueList.append("[").append(back.value).append("]");
        return queueList+"=back";

    }
}