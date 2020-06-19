package ua.innerbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {
    @Test
    public void testArea() {
        Square s = new Square(5);
//        assert s.area() == 24;
//        if (s.area() != 24) throw new AssertionError();
        Assert.assertEquals(s.area(), 25);
    }

}

