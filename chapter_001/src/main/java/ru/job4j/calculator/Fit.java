package ru.job4j.calculator;

public class Fit {
    public static double man(double height) {
        return height * 1.15;
    }

    public static double woman(double height) {
        return height * 1.15;
    }

    public static void main(String[] args) {
        double man = man(100);
        System.out.println("Man 100 is " + man);
        double woman = woman(200);
        System.out.println("Woman 100 is " + woman);
    }

}
