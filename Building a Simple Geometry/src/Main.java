
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Simple Geometry Application ===\n");

        // ----- Normal test cases -----
        System.out.println("Normal Cases:");
        Shape circle = new Circle(3.0, "Circle r=3");
        Shape rectangle = new Rectangle(4.0, 5.0, "Rectangle 4x5");
        Shape triangle = new Triangle(3.0, 4.0, 5.0, "Triangle 3-4-5");
        printShape(circle);
        printShape(rectangle);
        printShape(triangle);

        // ----- Edge test cases (handled via exceptions/validation) -----
        System.out.println("\nEdge Cases:");
        // 1) Zero or negative dimensions
        try {
            Shape badCircle = new Circle(0);
            printShape(badCircle);
        } catch (IllegalArgumentException ex) {
            System.out.println("Edge 1 (Bad Circle): " + ex.getMessage());
        }

        // 2) Triangle inequality violation
        try {
            Shape badTriangle = new Triangle(1, 2, 3, "Degenerate Triangle");
            printShape(badTriangle);
        } catch (IllegalArgumentException ex) {
            System.out.println("Edge 2 (Bad Triangle): " + ex.getMessage());
        }

        // 3) Very large values (just to see computation; should handle without overflow)
        try {
            Shape bigRect = new Rectangle(1e154, 2e154, "Huge Rectangle");
            printShape(bigRect);
        } catch (IllegalArgumentException ex) {
            System.out.println("Edge 3 (Huge Rectangle): " + ex.getMessage());
        }
    }

    private static void printShape(Shape s) {
        System.out.println(s.toString());
    }
}
