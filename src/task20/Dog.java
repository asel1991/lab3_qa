package task20;

public class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog says: Woof!");
    }

    // this method exists only in Dog
    void fetch() {
        System.out.println("Dog brings the ball");
    }
}
