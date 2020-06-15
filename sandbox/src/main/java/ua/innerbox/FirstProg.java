package ua.innerbox;

public class FirstProg {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Oleksandr");
        double b = 3;
        System.out.println("Площадь квадрата, co стороной " + b+ " равна: " + area(b) );

        double a1 = 4;
        double a2 = 6;
        System.out.println("Площадь прямоугольника, co стороной " + a1 + " и " + a2 + " равна: " + area(a1,a2));
    }

    public static void hello(String something) {
//        String something = "world";
        System.out.println("Hello, " + something + "!");
    }

    public static double area(double b) {
        return b*b;
    }

    public static double area(double a, double b) {
        return a*b;
    }
}