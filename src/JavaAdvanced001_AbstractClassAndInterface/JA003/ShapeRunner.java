package JavaAdvanced001_AbstractClassAndInterface.JA003;

public class ShapeRunner {
    public static void main(String[] args) {
        AllForThem circle = new Circle(5);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        AllForThem rectangle = new Rectangle(5, 10);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        AllForThem triangle = new Triangle(5, 10);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());

        AllForThem square = new Square(5);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
    }
}
