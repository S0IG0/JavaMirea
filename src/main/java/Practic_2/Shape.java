package Practic_2;

public class Shape {
    private final String type;

    public Shape(String type) {
        this.type = type;
    }

    @Override
    public String toString() {

        return String.format("Shape{type='%s'}\n", type);
    }
}
