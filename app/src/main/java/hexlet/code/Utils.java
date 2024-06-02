package hexlet.code;

public class Utils {

    public static int getGcd(int a, int b) {
        int gcd;
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        while (b != 0) {
            gcd = a % b;
            a = b;
            b = gcd;
        }
        return a;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            int remainder = number % i;
            if (remainder == 0) {
                return false;
            }
        }
        return true;
    }
}
