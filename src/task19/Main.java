package task19;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();     // Animal version

        Dog dog = new Dog();
        dog.sound();        // OVERRIDING: Dog replaced the sound() from Animal
        dog.sound(3);       // OVERLOADING: new method sound(int times) with a different parameter list
    }
}
