package stack.and.queue;

public class Queue<T> {
    Node<T> front  ;
    Node<T> back;
    public  void enqueue( T value){

        Node node = new Node(value);
        if(front==null){
            front =node;
        }
        else {
            back.next = node;
        }
        back=node;
    }
    public T dequeue(){
        try{
            Node<T> temp = front;
            front = front.next;
            temp.next = null;
            return temp.value;
            }
        catch (NullPointerException e) {
            System.out.print("Caught the NullPointerException");
            return null;
        }



    }
    public T peek(){
        try{
            return front.value;
        }
        catch (NullPointerException e) {
            System.out.print("Caught the NullPointerException");
            return null;
        }
    }



    public  boolean isempty(){

            return front==null;
        }

    @Override
    public String toString() {
        if (front==null){
            return null;
        }
        StringBuilder QueueList= new StringBuilder("Queue: front=");
        Node<T> current=front;
        while (current.next!=null){
           QueueList.append("[").append(current.value).append("]").append("-->");
            current=current.next;
        }
        QueueList.append(back.value);
        return  QueueList.toString();
    }
}


