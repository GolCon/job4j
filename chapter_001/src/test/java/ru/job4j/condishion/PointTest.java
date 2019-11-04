package ru.job4j.condishion;

import org.junit.Assert;
import org.junit.Test;
//import ru.job4j.condishion.Point;

public class PointTest {
    @Test
    public void distance() {
        int inX1 = 2;
        int inY1 = 0;
        int inX2 = 1;
        int inY2 = 0;
        double expected = Point.distance(inX1, inY1, inX2, inY2);
        int out = 1;
        Assert.assertEquals(out, expected, 0.01);


    }
}
