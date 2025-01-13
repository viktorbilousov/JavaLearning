package example;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square(5);
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());

        Shape circle = new Circle(3);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());

        Rotatable rotatablePolygon = new Square(4);
        rotatablePolygon.rotate(45);
    }
}
