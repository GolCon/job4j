package ru.job4j.condition;

import ru.job4j.condishion.Point;

public class TrgArea {
    private static Point first;
    private static Point second;
    private static Point thrid;

    public TrgArea(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.thrid = cp;
    }

    public static double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public static double area() {
        double a = first.distance(second);
        double b = first.distance(thrid);
        double c = second.distance(thrid);
        double p = period(a, b, c);
        if (exist(a, b, c)) {
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        } else return -1;
    }

    public static boolean exist(double a, double b, double c) {
        if (a + b > c & b + c > a & c + a > a) {
            return true;
        } else return false;
    }
}



