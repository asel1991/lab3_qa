package task15;

public class Square extends Shape {
    double side;

    Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    void describe() {
        super.describe();   // first the parent describe()
        System.out.println("It is a square with side " + side);
    }
}
