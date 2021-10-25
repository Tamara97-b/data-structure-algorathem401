package stack.and.queue.Animal;

public class Animal {
    private String pref;

    public String getPref() {
        return pref;
    }

    public void setPref(String pref) {
        this.pref = pref;
    }

    public Animal(String pref) {
        this.pref = pref;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "prev='" + pref + '\'' +
                '}';
    }
}
