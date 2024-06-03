package Day09.Shape;


public class ShapeTest {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        Rectangle r = new Rectangle(5);
        Triangle t = new Triangle(3,5);

        System.out.println(c.calculateArea());
        System.out.println(r.calculateArea());
        System.out.println(t.calculateArea());
    }
}
