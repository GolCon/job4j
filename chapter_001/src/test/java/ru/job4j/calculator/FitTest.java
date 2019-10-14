package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWaight() {
        double in = 100;
        double out = 115;
        double expected = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void womanWaight() {
        double in = 200;
        double out = 230;
        double expected = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}
