package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.condishion.Point;

public class TrgAreaTest {
    @Test
    public void testSqArea() {
        int aX = 0;
        int aY = 0;
        int bX = 2;
        int bY = 0;
        int cX = 0;
        int cY = 3;
        Point ap = new Point(aX, aY);
        Point bp = new Point(bX, bY);
        Point cp = new Point(cX, cY);
        TrgArea sqArea = new TrgArea(ap, bp, cp);
        double expected = sqArea.area();
        int out = 3;
        Assert.assertEquals(out, expected, 0.01);
    }
}
