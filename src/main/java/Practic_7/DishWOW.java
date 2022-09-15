package Practic_7;

public class DishWOW extends Dish{
    final String color = "White";
    final int numberOfBranches = 5;
    int endurance = 100;


    public DishWOW(String name, int width, int height) {
        super(name, width, height);
    }

    public boolean IsBroken(){
        return endurance == 0;
    }

    @Override
    public String toString() {
        return "DishWOW{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", numberOfBranches=" + numberOfBranches +
                ", endurance=" + endurance +
                '}';
    }
}
