package ru.job4j.sort;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@Ignore
public class MergeTest {
    @Test
    public void bothEmpty() {
        Merge algo = new Merge();
        int[] expect = new int[0];
        int[] result = algo.merge(
                new int[0],
                new int[0]
        );
        assertThat(result, is(expect));
    }

    @Test
    public void ascOrder() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 4};
        int[] result = algo.merge(
                new int[]{1, 2},
                new int[]{3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void leftLess() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 3, 4};
        int[] result = algo.merge(
                new int[]{1, 2, 3},
                new int[]{3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void leftGreat() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 4, 4};
        int[] result = algo.merge(
                new int[]{1, 2},
                new int[]{3, 4, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void leftEmpty() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 4};
        int[] result = algo.merge(
                new int[]{},
                new int[]{1, 2, 3, 4}
        );
        assertThat(result, is(expect));
    }
}
