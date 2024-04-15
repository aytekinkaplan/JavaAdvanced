package JavaAdvanced001_AbstractClassAndInterface.JA003;

public class Triangle implements AllForThem {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public Triangle() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }

    @Override
    public double getPerimeter() {
        return base + height + Math.sqrt(base * base + height * height);
    }
}
