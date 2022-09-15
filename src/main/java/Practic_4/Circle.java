package Practic_4;

public class Circle extends Shape {

    String name;

    @Override
    public void print() {
        System.out.println("I is Circle");
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public Circle(int x, int y, String name) {
        super(x, y);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
