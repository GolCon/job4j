package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {
    @Test
    public void rubleToEuro() {
        int in1 = 140;
        int expectedE = 2;
        int out = Converter.rubleToEuro(in1);
        Assert.assertEquals(expectedE, out);
    }

    @Test
    public void rubleToDollar() {
        int in = 180;
        int expected = 3;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);

    }

    @Test
    public void dollarToEuro() {
        int in = 3;
        int expected = 180;
        int out = Converter.dollarToRuble(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void euroToRuble() {
        int in = 2;
        int expected = 140;
        int out = Converter.euroToRuble(in);
        Assert.assertEquals(expected, out);
    }
}

