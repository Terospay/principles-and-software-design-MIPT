package geometryObjects;

public class Rectangle {
    protected Point p1;
    protected Point p2;
    protected Point p3;
    protected double a;
    protected double b;

    public Rectangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        fillData();
    }
    private void fillData() {
        a = Math.pow(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2), 0.5);
        b = Math.pow(Math.pow(p3.x - p2.x, 2) + Math.pow(p3.y - p2.y, 2), 0.5);
    }

    public double calculateArea() {
        return a * b;
    }



}
