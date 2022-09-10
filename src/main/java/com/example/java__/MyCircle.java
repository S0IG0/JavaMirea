package com.example.java__;

import javafx.scene.paint.Color;

public class MyCircle extends Shape{
    int radius;

    public MyCircle(String color, int x, int y, Color color_, int radius) {
        super(color, x, y, color_);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
