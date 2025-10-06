
public abstract class Shape {

    private final String name;

    protected Shape(String name) {
        this.name = name == null || name.isBlank() ? "(unnamed shape)" : name;
    }


    public String getName() {
        return name;
    }


    public abstract double calculateArea();


    public abstract double calculatePerimeter();


    @Override
    public String toString() {
        return String.format(

                getName(), calculateArea(), calculatePerimeter()
        );
    }
}
