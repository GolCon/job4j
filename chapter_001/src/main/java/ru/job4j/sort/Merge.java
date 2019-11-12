package ru.job4j.sort;

import java.util.Arrays;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int n = 0;
        while (i + n < left.length + right.length) {
            if (n == right.length & i < left.length) {
                rsl[i + n] = left[i];
                ++i;
            } else if (i == left.length & n < right.length) {
                rsl[i + n] = right[n];
                ++n;
            } else { //блок сравнения
                if (left[i] <= right[n]) {
                    rsl[i + n] = left[i];
                    ++i;
                } else {
                    rsl[i + n] = right[n];
                    ++n;
                }
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[]{1, 3, 5},
                new int[]{2, 4}
        );
        System.out.print(Arrays.toString(rsl));
    }
}


