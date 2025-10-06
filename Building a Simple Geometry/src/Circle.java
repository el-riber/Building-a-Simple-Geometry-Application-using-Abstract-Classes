/**
 * Circle shape with a radius.
 * Area = π * r^2
 * Perimeter = 2 * π * r
 */
public class Circle extends Shape {

    private final double radius;

    public Circle(double radius) {
        this(radius, "Circle");
    }

    public Circle(double radius, String name) {
        super(name);
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be > 0");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
