package stack.and.queue.Animal;


import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class AnimalShelter {
    Queue<Animal> animals = new Queue<Animal>();

    public void enqueue(Animal animal){
        animals.enqueue(animal);
    }

}
