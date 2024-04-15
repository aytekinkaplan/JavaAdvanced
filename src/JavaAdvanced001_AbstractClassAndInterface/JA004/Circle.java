package JavaAdvanced001_AbstractClassAndInterface.JA004;

// This class represents a Circle that implements the Shape interface.
// It stores the radius of the circle and provides methods to set and get the radius.
// It also implements the methods defined in the Shape interface to calculate the area and perimeter of the circle.

public class Circle implements Shape {
    private double radius; // The radius of the circle

    // Constructor to initialize the Circle with a given radius.
    public Circle(double radius) {
        this.radius = radius;
    }

    // Default constructor for Circle with no parameters.
    public Circle() {
        // Empty constructor
    }

    // Method to get the radius of the circle.
    public double getRadius() {
        return radius;
    }

    // Method to set the radius of the circle.
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate and return the area of the circle.
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate and return the perimeter of the circle.
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
