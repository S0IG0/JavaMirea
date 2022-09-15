package Practic_7;

public abstract class Dish {
    String name;
    int width;
    int height;

    public Dish(String name, int width, int height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "Dish{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
