package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void Max1To2() {
        assertThat(Max.max(1, 2), is(2));
    }
}
