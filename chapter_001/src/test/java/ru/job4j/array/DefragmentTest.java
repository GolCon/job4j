package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DefragmentTest {
    @Test
    public void nullEnd() {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }

    @Test
    public void nullFirst() {
        String[] input = {null, "I", "wanna", null, "be", null, "compressed"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }

}
