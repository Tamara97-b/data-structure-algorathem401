package stack.and.queue;

public class PseudoQueue<T> {
    Stack<T> stack1=new Stack<>();
    Stack<T> stack2=new Stack<>();

    // add an item to the back Node of the queue
    public void enqueue(T value){

        stack1.push(value);

    }

    // removing the front Node of the queue.
    public T dequeue(){
        T dequeueValue = null;
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            dequeueValue = stack2.pop();
            while (!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
        }
        return dequeueValue;
    }



    @Override
    public String toString() {
        if (stack1.top.value==null){
            return "null";
        }else {
            StringBuilder PseudoQueueList = new StringBuilder("PseudoQueue: back=");
            Node<T> current = stack1.top;
            while (current.next != null) {
                PseudoQueueList.append("[").append(current.value).append("]").append("-->");
                current = current.next;
            }
            return PseudoQueueList.append("[").append(current.value)+"]=front";
        }

    }
}