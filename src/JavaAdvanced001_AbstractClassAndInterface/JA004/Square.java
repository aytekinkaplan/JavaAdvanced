package JavaAdvanced001_AbstractClassAndInterface.JA004;

public class Square implements Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square() {

    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}
