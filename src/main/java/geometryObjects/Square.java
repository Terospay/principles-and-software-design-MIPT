package geometryObjects;

public class Square extends Rectangle {
    public Square(Point p1, Point p2, Point p3) throws Exception {
        super(p1, p2, p3);
        if (this.a != this.b) {
            throw new Exception("Sides aren't equal");
        }
    }

    public double calculateArea() {
        return a * a;
    }
}
