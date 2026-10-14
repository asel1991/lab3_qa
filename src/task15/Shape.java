package task15;

public class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    void describe() {
        System.out.println("This is a shape, color: " + color);
    }
}
