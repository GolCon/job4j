package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        for (int i = 2; i <= finish; ++i) {
            for (int in = 2; in <= i; ++in) {
                if (i % in == 0 && i != in) {
                    break;
                } else if (i == in) {
                    count++;
                }
            }
        }
        return count;
    }
}
