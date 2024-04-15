package JavaAdvanced001_AbstractClassAndInterface.JA004;

import java.util.Scanner;

// This class contains the main method to run the program.
// It prompts the user to enter dimensions for different shapes, calculates their areas and perimeters, and compares the areas of the shapes.

public class ShapeRunner {
    static Scanner scanner; // Scanner object to read user input

    public static void main(String[] args) {
        scanner = new Scanner(System.in); // Initialize scanner to read input from the console

        // Prompt the user to enter the radius of the circle
        System.out.println("Enter the radius of the circle".toUpperCase());
        Circle circle = new Circle(scanner.nextDouble()); // Create a Circle object with the given radius
        System.out.println("Area of the circle " + circle.getArea()); // Print the area of the circle
        System.out.println("Perimeter of the circle " + circle.getPerimeter()); // Print the perimeter of the circle

        // Prompt the user to enter the width and height of the rectangle
        System.out.println("Enter the width and height of the rectangle".toUpperCase());
        Rectangle rectangle = new Rectangle(scanner.nextDouble(), scanner.nextDouble()); // Create a Rectangle object with the given dimensions
        System.out.println("Area of the rectangle " + rectangle.getArea()); // Print the area of the rectangle
        System.out.println("Perimeter of the rectangle " + rectangle.getPerimeter()); // Print the perimeter of the rectangle

        // Prompt the user to enter the length and width of the triangle
        System.out.println("Enter the length and width of the triangle".toUpperCase());
        Triangle triangle = new Triangle(scanner.nextDouble(), scanner.nextDouble()); // Create a Triangle object with the given dimensions
        System.out.println("Area of the triangle " + triangle.getArea()); // Print the area of the triangle
        System.out.println("Perimeter of the triangle " + triangle.getPerimeter()); // Print the perimeter of the triangle

        // Prompt the user to enter the base and height of the square
        System.out.println("Enter the base and height of the square".toUpperCase());
        Square square = new Square(scanner.nextDouble()); // Create a Square object with the given base
        System.out.println("Area of the square " + square.getArea()); // Print the area of the square
        System.out.println("Perimeter of the square " + square.getPerimeter()); // Print the perimeter of the square

        // Compare the areas of the shapes and print the smallest one
        ShapeAreaComparator.compareAreas(circle.getArea(), rectangle.getArea(), triangle.getArea(), square.getArea());
    }
}
