package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        return height * 1.15;
    }

    public static double womanWeight(double height) {
        return height * 1.15;
    }

    public static void main(String[] args) {
        double man = manWeight(100);
        System.out.println("Man 100 is " + man);
        double woman = womanWeight(200);
        System.out.println("Woman 100 is " + woman);
    }

}
