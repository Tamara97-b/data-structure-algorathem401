package stack.and.queue;

public class Cat extends Animal{


    public Cat(String name) {
        super(name,null,0);
    }

    @Override
    public String toString() {
        return    "Cat{" +
                "name= " + getName()
                + '}';
    }
}