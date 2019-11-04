package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void value5() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 10, 3};
        int value = 5;
        int result = find.index1(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void value11() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 10, 3};
        int value = 11;
        int result = find.index1(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void startFinish() {
        int[] input = new int[]{5, 2, 10, 2, 4};
        FindLoop find = new FindLoop();
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = find.index2(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }
}

