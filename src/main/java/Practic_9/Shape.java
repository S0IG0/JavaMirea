package Practic_9;

import javafx.scene.paint.Color;

public abstract class Shape {
    String color;
    int x;
    int y;
    Color color_;

    public Shape(String color, int x, int y, Color color_) {
        this.color = color;
        this.color_ = color_;
        this.x = x;
        this.y = y;
    }

    public Color getColor_() {
        return color_;
    }

    public void setColor_(Color color_) {
        this.color_ = color_;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
