package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void factorialFive() {
        int result = Factorial.calc(5);
        assertThat(result, is(120));
    }

    @Test
    public void factorialZero() {
        int result = Factorial.calc(0);
        assertThat(result, is(1));
    }

    @Test
    public void FactorialOne() {
        int result = Factorial.calc(1);
        assertThat(result, is(1));
    }
}
