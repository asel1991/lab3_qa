package task15;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("red", 5);
        Square square = new Square("blue", 4);

        circle.describe();
        System.out.println();
        square.describe();
    }
}
