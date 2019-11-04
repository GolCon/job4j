package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriagleTest {
    @Test
    public void Exist() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(false));
    }
}
