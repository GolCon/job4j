package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {
    @Test
    public void convertRE() {
        int in1 = 140;
        int expectedE = 2;
        int out = Converter.convertRE(in1);
        Assert.assertEquals(expectedE, out);
    }

    @Test
    public void convertRD() {
        int in = 180;
        int expected = 3;
        int out = Converter.convertRD(in);
        Assert.assertEquals(expected, out);

    }

    @Test
    public void convertDR() {
        int in = 3;
        int expected = 180;
        int out = Converter.convertDR(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void convertER() {
        int in = 2;
        int expected = 140;
        int out = Converter.convertER(in);
        Assert.assertEquals(expected, out);
    }
}

