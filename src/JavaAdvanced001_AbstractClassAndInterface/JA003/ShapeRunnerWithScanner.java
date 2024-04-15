package JavaAdvanced001_AbstractClassAndInterface.JA003;

import java.util.Scanner;

public class ShapeRunnerWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select your shape".toUpperCase() + "\n" + "1. Circle".toUpperCase() + "\n" + "2. Rectangle".toUpperCase() + "\n" + "3. Triangle".toUpperCase() + "\n" + "4. Square".toUpperCase());
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter radius");
                Circle circle = new Circle(scanner.nextDouble());
                System.out.println("Area: " + circle.getArea());
                System.out.println("Perimeter: " + circle.getPerimeter());
                break;
            case 2:
                System.out.println("Enter width");
                Rectangle rectangle = new Rectangle(scanner.nextDouble(), scanner.nextDouble());
                System.out.println("Area: " + rectangle.getArea());
                System.out.println("Perimeter: " + rectangle.getPerimeter());
                break;
            case 3:
                System.out.println("Enter base");
                Triangle triangle = new Triangle(scanner.nextDouble(), scanner.nextDouble());
                System.out.println("Area: " + triangle.getArea());
                System.out.println("Perimeter: " + triangle.getPerimeter());
                break;
            case 4:
                System.out.println("Enter side");
                Square square = new Square(scanner.nextDouble());
                System.out.println("Area: " + square.getArea());
                System.out.println("Perimeter: " + square.getPerimeter());
                break;
            default:
        }
    }
}
