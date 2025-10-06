# Simple Geometry Application (Abstract Classes)

A small Java app demonstrating **abstract classes, inheritance, and method overriding** using geometric shapes.

## Design
- `Shape` (abstract): enforces `calculateArea()` and `calculatePerimeter()`, and provides a concrete `getName()` + `toString()`.
- `Circle`, `Rectangle`, `Triangle`: implement the abstract methods with appropriate formulas.
  - Input validation:
    - Circle: radius > 0
    - Rectangle: length, width > 0
    - Triangle: all sides > 0 and satisfy the triangle inequality
- `Main`: creates sample shapes, prints name/area/perimeter, and shows edge cases.

## Files
- `Shape.java`
- `Circle.java`
- `Rectangle.java`
- `Triangle.java`
- `Main.java`

## Build & Run
```bash
javac Shape.java Circle.java Rectangle.java Triangle.java Main.java
java Main
