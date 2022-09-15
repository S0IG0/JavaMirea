package Practic_3;

public class CircleTest {

    public static void main(String[] args) {
        Circle circle = new Circle(0, 0, 5);
        System.out.println(circle);
        circle.setRadius(10);
        System.out.println(circle);
        System.out.println(circle.getX());

    }
}
