package Practic_10;

public class Sample {
    public static boolean isSample(long x) {
        if (x == 2)
            return true;
        for (int i = 0; i < 100; i++) {
            long a = (long) (Math.random() % (x - 2)) + 2;
            if (gcd(a, x) != 1)
                return false;
            if (pow(a, x - 1, x) != 1)
                return false;
        }
        return true;
    }

    public static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static long mul(long a, long b, long m) {
        if (b == 1)
            return a;
        if (b % 2 == 0) {
            long t = mul(a, b / 2, m);
            return (2 * t) % m;
        }
        return (mul(a, b - 1, m) + a) % m;
    }

    public static long pow(long a, long b, long m) {
        if (b == 0)
            return 1;
        if (b % 2 == 0) {
            long t = pow(a, b / 2, m);
            return mul(t, t, m) % m;
        }
        return (mul(pow(a, b - 1, m), a, m)) % m;
    }
}
