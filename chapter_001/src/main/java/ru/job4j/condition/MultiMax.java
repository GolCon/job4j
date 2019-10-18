package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        boolean condition1 = first > second;
        int max1 = condition1 ? first : second;
        boolean condition2 = max1 > third;
        int result = condition2 ? max1 : third;
        return result;
    }
}
