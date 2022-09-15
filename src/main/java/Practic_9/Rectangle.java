package Practic_9;

import javafx.scene.paint.Color;

public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(String color, int x, int y, Color color_, int width, int height) {
        super(color, x, y, color_);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
