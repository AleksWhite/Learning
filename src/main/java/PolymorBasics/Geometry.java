package PolymorBasics;

/*
Геометрия для чайников
*/

public class Geometry {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        shape.printInfo();
        circle.printInfo();
        rectangle.printInfo();
        triangle.printInfo();
    }
}