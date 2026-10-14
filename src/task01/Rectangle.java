package task01;

// Task 1: class Rectangle with 4 methods
public class Rectangle {
    double length;
    double width;

    // constructor, so we can set length and width when we create the object
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // takes nothing, returns nothing
    void printInfo() {
        System.out.println("Rectangle: length = " + length + ", width = " + width);
    }

    // takes nothing, returns double
    double area() {
        return length * width;
    }

    // takes a value, returns nothing
    void scale(double factor) {
        length = length * factor;
        width = width * factor;
    }

    // takes nothing, returns boolean
    boolean isSquare() {
        return length == width;
    }
}
