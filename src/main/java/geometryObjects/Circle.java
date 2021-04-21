package geometryObjects;

public class Circle {
    private Point center;
    private double radius;

    public Circle(Point p, double r) {
        center = p;
        radius = r;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
