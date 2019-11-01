package ru.job4j.calculator;

/**
 * Calculate
 *
 * @autor Constantin Golovnev (GolovnevKI@yandex.ru)
 */
public class Calculator {
    /**
     * Method add.
     *
     * @param first  - простое число, первое слогаемое.
     * @param second - простое число, второе слогаемое.
     */
    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + "+" + second + "=" + result);
    }

    /**
     * Method div.
     *
     * @param first  - простое число, делимое.
     * @param second - простое число, делитель.
     */
    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + ":" + second + "=" + result);
    }

    /**
     * Method multiply.
     *
     * @param first  - простое число, первый множетель.
     * @param second - простое число. второй множетель.
     */
    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + "*" + second + "=" + result);
    }

    /**
     * Method subtruck.
     *
     * @param first  - простое число, уменьшаемое.
     * @param second - простое число, вычитаемое.
     */
    public static void subtrack(double first, double second) {
        double result = first - second;
        System.out.println(first + "-" + second + "=" + result);
    }

    /**
     * Main.
     *
     * @param args - args.
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtrack(10, 5);
    }
}
