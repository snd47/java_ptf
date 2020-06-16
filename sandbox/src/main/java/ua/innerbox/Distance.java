package ua.innerbox;

public class Distance {
    public static void main(String[] args) {

        Point p1 = new Point(1,3);
        Point p2 = new Point(5,3);

        Point p3 = new Point(2,4);
        Point p4 = new Point(4,5);

        System.out.println("Дистанция между точками равна: " + distance(p1,p2));
        System.out.println("Дистанция между точками равна: " + Math.round(p3.methodDistance(p4)*100.0)/100.0);

    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));

    }
}
