package geometryObjects;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void calculateAreaTest() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 10);
        Point p3 = new Point(20, 10);
        Rectangle rectangle = new Rectangle(p1, p2, p3);
        double expected = 200;
        double actual = rectangle.calculateArea();
        assertEquals(expected, actual , 0.00001);
    }

    @Test
    public void degenerateRectangleTest() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 0);
        Point p3 = new Point(0, 0);
        Rectangle rectangle = new Rectangle(p1, p2, p3);
        double expected = 0;
        double actual = rectangle.calculateArea();
        assertEquals(expected, actual , 0.00001);
    }
}