package Practic_5;

public class Main {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(0, 0, "None");
        MovablePoint movablePoint = new MovablePoint(0, 0);

        System.out.println(circle);
        System.out.println(movablePoint);

        circle.Move(1, 1);
        movablePoint.Move(10, 10);

        System.out.println(circle);
        System.out.println(movablePoint);
    }
}
