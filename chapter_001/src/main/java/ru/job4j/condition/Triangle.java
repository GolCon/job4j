package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        double summ1 =ab+ac;
        double summ2 =ac+bc;
        double summ3 =ab+bc;
        return summ1 > bc && summ2 > ab && summ3 > ac;
    }
}
