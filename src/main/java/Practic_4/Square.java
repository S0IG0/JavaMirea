package Practic_4;

public class Square extends Shape {

    String name;

    @Override
    public void print() {
        System.out.println("I is Square");
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public Square(int x, int y, String name) {
        super(x, y);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Square{" +
                "x=" + x +
                ", y=" + y +
                ", name='" + name + '\'' +
                '}';
    }
}
