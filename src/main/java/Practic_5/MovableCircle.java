package Practic_5;

import Practic_4.Circle;

public class MovableCircle extends Circle implements Movable {
    public MovableCircle(int x, int y, String name) {
        super(x, y, name);
    }

    @Override
    public void Move(int x, int y) {
        this.setX(x);
        this.setY(y);
    }
}
