package JavaAdvanced001_AbstractClassAndInterface.JA004;

// This class represents a Rectangle that implements the Shape interface.
// It stores the width and height of the rectangle and provides methods to set and get these dimensions.
// It also implements the methods defined in the Shape interface to calculate the area and perimeter of the rectangle.

public class Rectangle implements Shape {
    private double width;  // The width of the rectangle
    private double height; // The height of the rectangle

    // Constructor to initialize the Rectangle with given width and height.
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Default constructor for Rectangle with no parameters.
    public Rectangle() {
        // Empty constructor
    }

    // Method to get the width of the rectangle.
    public double getWidth() {
        return width;
    }

    // Method to set the width of the rectangle.
    public void setWidth(double width) {
        this.width = width;
    }

    // Method to get the height of the rectangle.
    public double getHeight() {
        return height;
    }

    // Method to set the height of the rectangle.
    public void setHeight(double height) {
        this.height = height;
    }

    // Method to calculate and return the area of the rectangle.
    @Override
    public double getArea() {
        return width * height;
    }

    // Method to calculate and return the perimeter of the rectangle.
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
