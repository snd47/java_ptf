package ua.innerbox;

public class FirstProg {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Oleksandr");

        Square s = new Square(5);
//        s.l = 5;


        System.out.println("Площадь квадрата, co стороной " + s.l + " равна: " + s.area() );

        Rectangle r = new Rectangle(7,9);
//        r.a = 7;
//        r.b = 9;

        System.out.println("Площадь прямоугольника, co стороной " + r.a + " и " + r.b + " равна: " + r.area());
    }

    public static void hello(String something) {

        System.out.println("Hello, " + something + "!");
    }

//    public static double area(Square obj) {
//        return obj.l*obj.l;
//    }

//    public static double area(Rectangle obj) {
//        return obj.a*obj.b;
//    }
}