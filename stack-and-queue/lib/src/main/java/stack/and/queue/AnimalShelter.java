package stack.and.queue;

public class AnimalShelter {
    Queue<Animal> catGroup=new Queue<>();
    Queue<Animal> dogGroup=new Queue<>();

    public void enqueue(Animal animal){

        if (animal instanceof Cat) {
            catGroup.enqueue(animal);
        } else if (animal instanceof Dog) {
            dogGroup.enqueue(animal);
        }else {
            System.out.println("errorr");
        }

    }

    public Animal dequeue(String pref){

        if (pref.equals("cat")) {
            return catGroup.dequeue();
        } else if (pref.equals("dog")) {
            return dogGroup.dequeue();
        }else{
            return null;
        }

    }

    @Override
    public String toString() {
        if (catGroup.isEmpty()&&dogGroup.isEmpty()){
            return null;
        }
        return "AnimalShelter[" +
                "catGroup=" + catGroup +
                ", dogGroup=" + dogGroup +
                ']';
    }
}
