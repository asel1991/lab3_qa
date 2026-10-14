package task01;

public class Main {
    public static void main(String[] args) {
        // three objects
        Rectangle r1 = new Rectangle(5, 3);
        Rectangle r2 = new Rectangle(4, 4);
        Rectangle r3 = new Rectangle(10, 2.5);

        System.out.println("--- r1 ---");
        r1.printInfo();
        System.out.println("Area: " + r1.area());
        r1.scale(2);
        System.out.println("After scale(2):");
        r1.printInfo();
        System.out.println("Is square? " + r1.isSquare());

        System.out.println("--- r2 ---");
        r2.printInfo();
        System.out.println("Area: " + r2.area());
        r2.scale(0.5);
        System.out.println("After scale(0.5):");
        r2.printInfo();
        System.out.println("Is square? " + r2.isSquare());

        System.out.println("--- r3 ---");
        r3.printInfo();
        System.out.println("Area: " + r3.area());
        r3.scale(3);
        System.out.println("After scale(3):");
        r3.printInfo();
        System.out.println("Is square? " + r3.isSquare());
    }
}
