package Practic_9;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;


public class ComplexShape extends Application {

    public static Shape[] createShapes(int max) {
        MyCircle[] circles = new MyCircle[(int) (Math.random() * max)];
        Rectangle[] rectangles = new Rectangle[max - circles.length];

        for (int i = 0; i < circles.length; i++) {
            circles[i] = new MyCircle(
                    "Black",
                    (int)(Math.random() * 800),
                    (int)(Math.random() * 800),
                    Color.rgb((int)(Math.random() * 255),(int)(Math.random() * 255),(int)(Math.random() * 255)),
                    (int)(Math.random() * 200)
            );
            System.out.println(circles[i]);
        }

        for (int i = 0; i < rectangles.length; i++) {
            rectangles[i] = new Rectangle(
                    "Black",
                    (int)(Math.random() * 800),
                    (int)(Math.random() * 800),
                    Color.rgb((int)(Math.random() * 255),(int)(Math.random() * 255),(int)(Math.random() * 255)),
                    (int)(Math.random() * 200),
                    (int)(Math.random() * 200)
            );
            System.out.println(rectangles[i]);
        }

        Circle[] circles1 = new Circle[circles.length];
        javafx.scene.shape.Rectangle[] rectangles1 = new javafx.scene.shape.Rectangle[rectangles.length];
        for (int i = 0; i < circles1.length; i++) {
            circles1[i] = new Circle(circles[i].getX(), circles[i].getY(), circles[i].getRadius());
            circles1[i].setFill(circles[i].getColor_());
        }

        for (int i = 0; i < rectangles.length; i++) {
            rectangles1[i] = new javafx.scene.shape.Rectangle(
                    rectangles[i].getX(),
                    rectangles[i].getY(),
                    rectangles[i].getWidth(),
                    rectangles[i].getHeight()
            );
            rectangles1[i].setFill(rectangles[i].getColor_());
        }

        Shape[] shapes = new Shape[rectangles1.length + circles1.length];
        System.arraycopy(rectangles1, 0, shapes, 0, rectangles1.length);
        System.arraycopy(circles1, 0, shapes, rectangles1.length, circles1.length);

        return shapes;
    }

    @Override
    public void start(Stage stage) {


        Button button = new Button("Click");

        Group root = new Group(createShapes(20));
        root.getChildren().addAll(button);
        Scene scene = new Scene(root, 800 ,800);

        button.setOnAction(event -> {
            Group root1 = new Group(createShapes(20));
            root1.getChildren().addAll(button);
            Scene scene1 = new Scene(root1, 800, 800);
            stage.setScene(scene1);
            stage.show();
        });


        stage.setTitle("practice 9");
        stage.setScene(scene);
        stage.show();
}
public static void main(String[] args){
    launch(args);
}
}