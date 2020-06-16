package ua.innerbox;

public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {     // constructor
        this.x = x;
        this.y = y;
    }

    public double methodDistance(Point obj) {
        return Math.sqrt(Math.pow((obj.x - this.x), 2) + Math.pow((obj.y - this.y), 2));

    }
}
