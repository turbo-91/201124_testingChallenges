package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int summe = summe(10, 10);
        System.out.println(summe);
    }

    public static int summe(int a, int b) {
        return a+b;
    }

    public static boolean isEven (int number) {
        return number % 2 == 0;
    }

    public static int product(int a, int b) {
        return a * b;
    }

    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public static boolean isPositive (int number) {
        return number > 0;
    }

}