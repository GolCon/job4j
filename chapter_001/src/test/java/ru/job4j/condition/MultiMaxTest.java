package ru.job4j.condition;


import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void SecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(4, 2, 8);
        assertThat(result, is(8));
    }
}
