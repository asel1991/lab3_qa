package task07;

public class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // calls the first constructor with (0, 0)
    Point() {
        this(0, 0);
    }

    // returns this, so we can write move(...).move(...)
    Point move(int dx, int dy) {
        x = x + dx;
        y = y + dy;
        return this;
    }

    void print() {
        System.out.println("Point(" + x + ", " + y + ")");
    }
}
