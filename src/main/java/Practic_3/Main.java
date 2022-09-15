package Practic_3;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(
                new Head(10, "white"),
                new Leg(12, "white"),
                new Hand(13, "white")
        );

        System.out.println(human);
    }
}
