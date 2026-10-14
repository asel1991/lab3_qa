package task09;

public class Main {
    public static void main(String[] args) {
        // no objects here, we call static methods with the class name
        System.out.println("max(7, 12) = " + MathUtils.max(7, 12));
        System.out.println("max(-3, -8) = " + MathUtils.max(-3, -8));

        System.out.println("isEven(10) = " + MathUtils.isEven(10));
        System.out.println("isEven(7) = " + MathUtils.isEven(7));

        System.out.println("factorial(5) = " + MathUtils.factorial(5));
        System.out.println("factorial(10) = " + MathUtils.factorial(10));
        System.out.println("factorial(0) = " + MathUtils.factorial(0));

        System.out.println("isPrime(17) = " + MathUtils.isPrime(17));
        System.out.println("isPrime(18) = " + MathUtils.isPrime(18));
        System.out.println("isPrime(1) = " + MathUtils.isPrime(1));
    }
}
