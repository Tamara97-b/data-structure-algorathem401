package stack.and.queue;

public class Stack<T>{
    int size;
Node<T> top;
    public void push(T value){
        Node<T> newNode=new Node<T>(value);
        newNode.next=top;
        top=newNode;
    }

    public int getSize() {

        return size;
    }



    public T pop(){
        try {
            Node<T> temp = top;
            top = top.next;
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
           return top.value;
        }
       catch (NullPointerException e) {
           System.out.print("Caught the NullPointerException");
          return  null;
       }

    }



    public boolean isEmpty(){
        return top==null;
    }

    @Override
    public String toString() {
        if (top==null){
            return null;
        }
        StringBuilder stackList= new StringBuilder("Stack: top=");
        Node<T> current=top;
        while (current!=null){
            stackList.append("[").append(current.value).append("]").append("-->");
            current=current.next;
        }
        return stackList+"NULL";
    }



}
