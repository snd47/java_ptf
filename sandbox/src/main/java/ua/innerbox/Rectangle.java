package ua.innerbox;

public class Rectangle {
    public double a;
    public double b;

    public Rectangle(double len1, double len2) {     // constructor
        this.a = len1;
        this.b = len2;
    }

    public double area() {
        return this.a*this.b;
    }
}
