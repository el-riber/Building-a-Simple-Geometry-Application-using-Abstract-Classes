
public class Rectangle extends Shape {

    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this(length, width, "Rectangle");
    }

    public Rectangle(double length, double width, String name) {
        super(name);
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be > 0");
        }
        this.length = length;
        this.width = width;
    }

    public double getLength() { return length; }
    public double getWidth() { return width; }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
