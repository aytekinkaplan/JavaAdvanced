package JavaAdvanced001_AbstractClassAndInterface.JA004;

// This class represents a Triangle that implements the Shape interface.
// It stores the base and height of the triangle and provides methods to set and get these dimensions.
// It also implements the methods defined in the Shape interface to calculate the area and perimeter of the triangle.

public class Triangle implements Shape {
    private double base;   // The base length of the triangle
    private double height; // The height of the triangle

    // Constructor to initialize the Triangle with given base and height.
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Default constructor for Triangle with no parameters.
    public Triangle() {
        // Empty constructor
    }

    // Method to get the base length of the triangle.
    public double getBase() {
        return base;
    }

    // Method to set the base length of the triangle.
    public void setBase(double base) {
        this.base = base;
    }

    // Method to get the height of the triangle.
    public double getHeight() {
        return height;
    }

    // Method to set the height of the triangle.
    public void setHeight(double height) {
        this.height = height;
    }

    // Method to calculate and return the area of the triangle.
    @Override
    public double getArea() {
        return base * height / 2;
    }

    // Method to calculate and return the perimeter of the triangle.
    @Override
    public double getPerimeter() {
        return base + height + Math.sqrt(base * base + height * height);
    }
}
