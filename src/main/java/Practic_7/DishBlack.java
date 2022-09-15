package Practic_7;

public class DishBlack extends Dish {
    final String color = "Black";


    public DishBlack(String name, int width, int height) {
        super(name, width, height);
    }

    @Override
    public String toString() {
        return "DishBlack{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
