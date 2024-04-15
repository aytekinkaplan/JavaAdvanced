package JavaAdvanced001_AbstractClassAndInterface.JA004;

import java.util.Scanner;

public class ShapeRunner {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle".toUpperCase());
        Circle circle = new Circle(scanner.nextDouble());
        System.out.println("Area of the circle " + circle.getArea());
        System.out.println("Perimeter of the circle " + circle.getPerimeter());

        System.out.println("Enter the width and height of the rectangle".toUpperCase());
        Rectangle rectangle = new Rectangle(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Area of the rectangle " + rectangle.getArea());
        System.out.println("Perimeter of the rectangle " + rectangle.getPerimeter());

        System.out.println("Enter the length and width of the triangle".toUpperCase());
        Triangle triangle = new Triangle(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Area of the triangle " + triangle.getArea());
        System.out.println("Perimeter of the triangle " + triangle.getPerimeter());

        System.out.println("Enter the base and height of the square".toUpperCase());
        Square square = new Square(scanner.nextDouble());
        System.out.println("Area of the square " + square.getArea());
        System.out.println("Perimeter of the square " + square.getPerimeter());

        ShapeAreaComparator.compareAreas(circle.getArea(), rectangle.getArea(), triangle.getArea(), square.getArea());
    }
}
