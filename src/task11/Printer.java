package task11;

// Task 11: four overloaded print methods
public class Printer {

    void print(int x) {
        System.out.println("print(int) was called, value = " + x);
    }

    void print(String s) {
        System.out.println("print(String) was called, value = " + s);
    }

    void print(double d) {
        System.out.println("print(double) was called, value = " + d);
    }

    void print(boolean b) {
        System.out.println("print(boolean) was called, value = " + b);
    }
}
