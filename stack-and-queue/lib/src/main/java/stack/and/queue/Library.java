/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.queue;


public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        Queue<Integer> queue=new Queue<>();
        queue.enqueue(5);
        queue.enqueue(2);
        queue.enqueue(7);
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());

        PseudoQueue<Integer> pseudoQueue=new PseudoQueue<>();
        pseudoQueue.enqueue(1);
        pseudoQueue.enqueue(2);
        pseudoQueue.enqueue(3);
        pseudoQueue.enqueue(4);
        System.out.println(pseudoQueue.toString());
        System.out.println(pseudoQueue.dequeue());
        System.out.println(pseudoQueue.toString());


        AnimalShelter animalShelter=new AnimalShelter();
        System.out.println(animalShelter.toString());
        Dog dog=new Dog("roni");
        System.out.println(dog);
        animalShelter.enqueue(dog);
        System.out.println(animalShelter);
        Cat cat=new Cat("flora");
        System.out.println(cat);
        animalShelter.enqueue(cat);
        System.out.println(animalShelter);
        Cat cat2=new Cat("losi");
        System.out.println(cat2);
        animalShelter.enqueue(cat2);
        System.out.println(animalShelter);
        animalShelter.dequeue("cat");
        System.out.println(animalShelter);


        StackQueueBrackets validator =new StackQueueBrackets();
        System.out.println(validator.validateBrackets("[[y{a()za}n]]"));


    }




}

