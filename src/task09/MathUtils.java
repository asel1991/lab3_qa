package task09;

public class MathUtils {

    static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // long, because factorial grows very fast
    static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
