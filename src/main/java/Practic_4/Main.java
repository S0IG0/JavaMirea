package Practic_4;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(0, 0, "Circle");
        Rectangle rectangle = new Rectangle(1, 0, "Circle");
        Square square = new Square(0, 3, "Circle");
        Shape[] shapes = new Shape[] {circle, rectangle, square};

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);

        circle.print();
        rectangle.print();
        square.print();

        for (Shape shape: shapes){
            System.out.println(shape);
        }
    }
}
