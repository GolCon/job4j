package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int first, int second, int thrid) {
        return first > max(second, thrid) ? first : max(second, thrid);
    }

    public static int max(int first, int second, int thrid, int four) {
        return max(first, second) > max(thrid, four) ? max(first, second) : max(thrid, four);
    }
}
