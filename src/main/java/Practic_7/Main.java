package Practic_7;

public class Main {
    public static void main(String[] args) {
        Dish[] dishes = new Dish[]{
                new DishBlack("DishBlack", 20, 30),
                new DishBlack("DishBlack2", 15, 15),
                new DishWOW("DishBlack", 20, 30),
                new DishWOW("DishBlack", 20, 30),
        };


        for (Dish dish: dishes) {
            System.out.println(dish);
        }
    }
}
