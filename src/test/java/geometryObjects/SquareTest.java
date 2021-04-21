package geometryObjects;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void calculateAreaTest() throws Exception {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 50);
        Point p3 = new Point(50, 50);
        Square square = new Square(p1, p2, p3);
        double expected = 2500;
        double actual = square.calculateArea();
        assertEquals(expected, actual, 0.00001);
    }

    @Test
    public void degenerateSquareTest() throws Exception {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 0);
        Point p3 = new Point(0, 0);
        Square square = new Square(p1, p2, p3);
        double expected = 0;
        double actual = square.calculateArea();
        assertEquals(expected, actual, 0.00001);
    }
}