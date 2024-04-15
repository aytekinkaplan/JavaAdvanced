package JavaAdvanced001_AbstractClassAndInterface.JA004;

// This class represents a Square that implements the Shape interface.
// It stores the length of the side of the square and provides methods to set and get the side length.
// It also implements the methods defined in the Shape interface to calculate the area and perimeter of the square.

public class Square implements Shape {
    private double side; // The length of the side of the square

    // Constructor to initialize the Square with a given side length.
    public Square(double side) {
        this.side = side;
    }

    // Default constructor for Square with no parameters.
    public Square() {
        // Empty constructor
    }

    // Method to get the side length of the square.
    public double getSide() {
        return side;
    }

    // Method to set the side length of the square.
    public void setSide(double side) {
        this.side = side;
    }

    // Method to calculate and return the area of the square.
    @Override
    public double getArea() {
        return side * side;
    }

    // Method to calculate and return the perimeter of the square.
    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}
