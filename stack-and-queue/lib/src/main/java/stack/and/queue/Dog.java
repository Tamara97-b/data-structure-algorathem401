package stack.and.queue;


public class Dog extends Animal{
    public Dog(String name) {
        super(name,null, 0);
    }

    @Override
    public String toString() {
        return  "Dog{" +
                "name= " + getName()
                + '}';
    }

}