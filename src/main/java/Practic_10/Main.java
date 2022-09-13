package Practic_10;

import java.util.Scanner;

public class Main {

    public static void monotonyF(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(String.format("%d, ", i).repeat(i));
        }
        System.out.println();
    }

    public static void printOneToN(int n) {
        for (int i = 1; i < n; i++) {
            System.out.printf("%d, ", i);
        }
        System.out.println();
    }

    public static void printAToB(int a, int b) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        for (int i = a; i <= b; i++) {
            System.out.printf("%d, ", i);
        }
        System.out.println();
    }

    public static int sumDigits(int x) {
        int sum = 0;
        if (x != 0) {
            sum += x % 10;
            sum += sumDigits(x / 10);
        }
        return sum;
    }

    public static void countSumDigits(int numberChar, int result) {
        for (int i = (int) Math.pow(10, numberChar - 1); i < Math.pow(10, numberChar); i++) {
            if (sumDigits(i) == result) {
                System.out.printf("Сумма цифр в числе %d = %d\n", i, result);
            }
        }
    }

    public static void isSimple(int x) {
        if (x > 1 && Sample.isSample(x)) {

            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void factorization(int x) {
        if (Sample.isSample(x)) {
            System.out.printf("%d ", x);
        } else {
            int res = 1;
            for (int i = 2; i < x; i++) {
                if (x % i == 0 && Sample.isSample(i)) {
                    System.out.printf("%d * ", i);
                    res *= i;
                }
            }
            if (x / res != 1) {
                factorization(x / res);
            } else {
                System.out.print("\b\b");
            }
        }
    }

    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static int withoutTwoZeros(int a, int b) {
        // Базовый случай
        if (a > b + 1) {
            return 0;
        }
        // Базовый случай
        if (a == 0 || b == 0) {
            return 1;
        }
        // Шаг рекурсии / рекурсивное условие
        return withoutTwoZeros(a, b - 1) + withoutTwoZeros(a - 1, b - 1);
    }

    public static int reverse(int n, int i) {
        return (n == 0) ? i : reverse(n / 10, i * 10 + n % 10);
    }

    public static int countOnes() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n == 1) {
            int m = in.nextInt();
            // Базовый случай
            if (m == 1) {
                // Шаг рекурсии / рекурсивное условие
                return countOnes() + n + m;
            } else {
                int k = in.nextInt();
                // Базовый случай
                if (k == 1) {
                    // Шаг рекурсии / рекурсивное условие
                    return countOnes() + n + m + k;
                } else {
                    return n + m + k;
                }
            }
        } else {
            int m = in.nextInt();
            // Базовый случай
            if (m == 1) {
                // Шаг рекурсии / рекурсивное условие
                return countOnes() + n + m;
            } else {
                return n + m;
            }
        }
    }

    public static void oddNumbers() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n > 0) {
            // Шаг рекурсии / рекурсивное условие
            if (n % 2 == 1) {
                System.out.println(n);
                oddNumbers();
            } else {
                oddNumbers();
            }
        }
    }

    public static void oddNumbersOfNumbers() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n > 0) {
            int m = in.nextInt();
            System.out.println(n);
            // Базовый случай
            if (m > 0) {
                // Шаг рекурсии / рекурсивное условие
                oddNumbersOfNumbers();
            }
        }
    }

    public static String leftToRight(int n) {
        // Базовый случай
        if (n < 10) {
            return Integer.toString(n);
        } // Шаг рекурсии / рекурсивное условие
        else {
            return leftToRight(n / 10) + " " + n % 10;
        }
    }

    public static int rightToLeft(int n) {
        // Базовый случай
        if (n < 10) {
            return n;
        }// Шаг рекурсии / рекурсивное условие
        else {
            System.out.print(n % 10 + " ");
            return rightToLeft(n / 10);
        }
    }

    public static void numberOfElementsEqualToTheMaximum(int max, int count) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n > 0) {
            // Шаг рекурсии / рекурсивное условие
            if (n > max) {
                numberOfElementsEqualToTheMaximum(n, 1);
            } // Шаг рекурсии / рекурсивное условие
            else if (n == max) {
                numberOfElementsEqualToTheMaximum(max, ++count);
            } // Шаг рекурсии / рекурсивное условие
            else {
                numberOfElementsEqualToTheMaximum(max, count);
            }
        } else {
            System.out.println(count);
        }
    }

    public static int maximumSequence() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n == 0) {
            return 0;
        } // Шаг рекурсии / рекурсивное условие
        else {
            return Math.max(n, maximumSequence());
        }
    }

    public static void main(String[] args) {
        int n = 56568456;
        monotonyF(10);
        printOneToN(10);
        printAToB(5, 1);
        System.out.println(sumDigits(55));
        countSumDigits(1, 4);
        isSimple(525);
        factorization(n);
        System.out.printf("= %d\n", n);
        System.out.println(isPalindrome("ANA"));
        System.out.println(withoutTwoZeros(10, 10));
        System.out.println(reverse(1234, 0));
        System.out.println(countOnes());
        oddNumbers();
        oddNumbersOfNumbers();
        System.out.println(leftToRight(123));
        System.out.println(rightToLeft(123));
        numberOfElementsEqualToTheMaximum(0, 0);
        System.out.println(maximumSequence());
    }
}
