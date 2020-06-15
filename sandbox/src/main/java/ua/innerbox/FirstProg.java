package ua.innerbox;

public class FirstProg {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Oleksandr");

        Square s = new Square();
        s.l = 5;

//        double b = 3;
        System.out.println("Площадь квадрата, co стороной " + s.l + " равна: " + area(s) );

        Rectangle r = new Rectangle();
        r.a = 7;
        r.b = 9;

//        double a1 = 4;
//        double a2 = 6;
        System.out.println("Площадь прямоугольника, co стороной " + r.a + " и " + r.b + " равна: " + area(r));
    }

    public static void hello(String something) {
//        String something = "world";
        System.out.println("Hello, " + something + "!");
    }

    public static double area(Square obj) {
        return obj.l*obj.l;
    }

    public static double area(Rectangle obj) {
        return obj.a*obj.b;
    }
}