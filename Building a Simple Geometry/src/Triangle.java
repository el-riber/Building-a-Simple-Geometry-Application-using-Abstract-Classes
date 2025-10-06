
public class Triangle extends Shape {

    private final double a, b, c;

    public Triangle(double a, double b, double c) {
        this(a, b, c, "Triangle");
    }

    public Triangle(double a, double b, double c, String name) {
        super(name);
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("All sides must be > 0");
        }
        // Triangle inequality: each side < sum of other two
        if (!(a + b > c && a + c > b && b + c > a)) {
            throw new IllegalArgumentException("Triangle inequality violated");
        }
        this.a = a; this.b = b; this.c = c;
    }

    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }

    @Override
    public double calculateArea() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }
}
