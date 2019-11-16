package ru.job4j.condishion;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import ru.job4j.condishion.Point;

@Ignore
public class PointTest {
    @Test
    public void distance() {
        int aX = 2;
        int aY = 0;
        int bX = 1;
        int bY = 0;
        Point a1 = new Point(aX, aY);
        Point a2 = new Point(bX, bY);
        double expected = a1.distance(a2);
        double out = 1;
        Assert.assertEquals(out, expected, 0.01);
    }

    @Test
    public void distance3d() {
        int aX = 2;
        int aY = 0;
        int aZ = 1;
        int bX = 0;
        int bY = 1;
        int bZ = 0;
        Point a1 = new Point(aX, aY, aZ);
        Point a2 = new Point(bX, bY, bZ);
        double expected = a1.distance3d(a2);
        double out = 2.45;
        Assert.assertEquals(out, expected, 0.01);
    }
}