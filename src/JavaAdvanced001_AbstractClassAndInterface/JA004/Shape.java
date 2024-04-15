package JavaAdvanced001_AbstractClassAndInterface.JA004;

// This interface defines the behavior of geometric shapes.
// It declares two abstract methods: getArea() and getPerimeter().
// Any class that implements this interface must provide concrete implementations for these methods.

public interface Shape {

    // Abstract method to calculate and return the area of the shape.
    public double getArea();

    // Abstract method to calculate and return the perimeter of the shape.
    public double getPerimeter();
}
