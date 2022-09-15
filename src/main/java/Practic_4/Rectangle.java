package Practic_4;

public class Rectangle extends Shape {

    String name;

    @Override
    public void print() {
        System.out.println("I is Rectangle");
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public Rectangle(int x, int y, String name) {
        super(x, y);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
