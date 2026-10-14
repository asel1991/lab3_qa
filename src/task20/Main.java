package task20;

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();

        a.sound();
        // prediction: prints "Dog says: Woof!" because the real object is Dog (overriding)

        // a.fetch();
        // This line does NOT compile. I put it in a comment, otherwise the whole program will not run.
        // Error: cannot find symbol - symbol: method fetch(), location: variable a of type Animal
        // Why: the compiler looks at the type of the variable (Animal), not at the real object.
        // The class Animal has no fetch() method, so the compiler does not allow to call it,
        // even if inside the variable there is a Dog.

        ((Dog) a).fetch();
        // This line works. We cast a to Dog, so now the compiler knows that fetch() exists.
        // prediction: prints "Dog brings the ball"
    }
}
