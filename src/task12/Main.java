package task12;

public class Main {
    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();

        System.out.printf("Circle (radius 5): %.2f%n", calc.area(5));
        System.out.printf("Rectangle (4 x 6): %.2f%n", calc.area(4, 6));
        System.out.printf("Triangle (base 6, height 3): %.2f%n", calc.area(6, 3, true));
    }
}
