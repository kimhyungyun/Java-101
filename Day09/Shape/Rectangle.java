package Day09.Shape;

public class Rectangle extends Shape{

   private double side;

    public Rectangle(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return this.side * this.side;
    }
}
