package task19;

public class Dog extends Animal {

    // same name, same parameters as in Animal -> overriding
    @Override
    void sound() {
        System.out.println("Dog says: Woof!");
    }

    // same name, but other paramiter list (int times) -> overloading
    void sound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.print("Woof! ");
        }
        System.out.println();
    }
}
