package geometryObjects;

import static org.junit.Assert.*;
import org.junit.Test;

public class CircleTest {

    @Test
    public void calculateAreaTest() {
        Point point = new Point(0, 0);
        Circle circle = new Circle(point, 3);
        double expected = Math.PI * Math.pow(3, 2);
        double actual = circle.calculateArea();
        assertEquals(expected, actual, 0.00001);
    }

    @Test
    public void degenerateCircleTest() {
        Point point = new Point(0,0);
        Circle cicle = new Circle(point, 0);
        double expecetd = 0;
        double actual = cicle.calculateArea();
        assertEquals(expecetd, actual, 0.00001);
    }
}