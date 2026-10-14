package task15;

public class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    void describe() {
        super.describe();   // first the parent describe()
        System.out.println("It is a circle with radius " + radius);
    }
}
