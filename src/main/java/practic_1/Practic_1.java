package practic_1;

//Задание на практическую работу №1
//1. Создать проект в IntelliJ IDEA
//2. Cоздать собственный Git репозитарий
//3. Написать программу, в результате которой считается сумма элементов целочисленного массива с помощью циклов for, while, do while, результат выводится на экран.
//4. Написать программу, в результате которой выводятся на экран аргументы командной строки в цикле for.
//5. Написать программу, в результате работы которой выводятся  на экран первые 10 чисел гармонического ряда (форматировать вывод).
//6. Написать программу, в результате которой генерируется массив целых чисел случайным образом, вывести его на экран, отсортировать его, и снова вывести на экран (использовать два подхода к генерации случайных чисел – метод random() класса Math и класс Random).
//7. Написать программу, которая с помощью метода, вычисляет факториал числа (использовать управляющую конструкцию цикла), проверить работу метода.
//8. Результаты выполнения практической работы залить через IDE в свой репозитарий и продемонстрировать преподавателю.


import java.util.Random;

public class Practic_1 {

    public static int sumArrayFor(int[] array){
        int result = 0;

        for (int digit: array) {
            result += digit;
        }

        return result;
    }

    public static int sumArrayWhile(int[] array){
        int result = 0;

        int i = 0;
        while (i < array.length) {
            result += array[i];
            i++;
        }

        return result;
    }

    public static int sumArrayDoWhile(int[] array){
        int result = 0;

        int i = 0;
        do {
            result += array[i];
            i++;
        }
        while (i < array.length);

        return result;
    }

    public static double[] getHarmonicSeries(int n){
        double[] array = new double[n];
        array[0] = 1;
        for (int i = 1; i < n; i++) {
            array[i] = array[i - 1] + (1.0 / (i + 1));

        }

        return array;
    }

    public static void printHarmonicSeries(double[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Сумма гармонического ряда при n = %d | %.3f\n", i, array[i]);
        }
    }

    public static int[] createArrayMathRandom(int n){
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int)(Math.random() * n);
        }

        return array;
    }

    public static int[] createArrayRandomRandom(int n){
        Random random = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(n);
        }

        return array;
    }

    public static int factorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
	// write your code here
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(sumArrayFor(array));
        System.out.println(sumArrayWhile(array));
        System.out.println(sumArrayDoWhile(array));
        System.out.println();

        for (String arg: args){
            System.out.println(arg);
        }
        System.out.println();
        printHarmonicSeries(getHarmonicSeries(10));
        System.out.println();

        for (int item: createArrayMathRandom(10)){
            System.out.printf("%d, ", item);
        }
        System.out.println();
        for (int item: createArrayRandomRandom(10)){
            System.out.printf("%d, ", item);
        }
        System.out.println();

        System.out.println(factorial(10));

    }
}
