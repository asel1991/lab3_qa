package task07;

public class Main {
    public static void main(String[] args) {
        Point p = new Point();     // x = 0, y = 0
        p.print();
        p.move(1, 2).move(3, 4).print();   // 0+1+3 = 4, 0+2+4 = 6

        Point p2 = new Point(10, 10);
        p2.move(-5, 5).move(2, 2).print();
    }
}
