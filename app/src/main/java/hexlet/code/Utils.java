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
}
