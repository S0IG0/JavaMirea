package Practic_11;


import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DialogPane;
import javafx.scene.layout.Region;

public class Controller2 {

    @FXML
    private DialogPane DIALOGPANEL;

    @FXML
    private Region CENTER;

    @FXML
    private Region EAST;

    @FXML
    private Region NORTH;

    @FXML
    private Region SOUTH;

    @FXML
    private Region WEST;

    @FXML
    void initialize() {
        CENTER.hoverProperty().addListener(event -> {
            System.out.println("Добро пожаловать в ЦАО");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);

            alert.setContentText("Добро пожаловать в ЦАО");
            alert.setTitle("Ваше полодение курсора");
            alert.setHeaderText("");
            alert.showAndWait();
        });

        WEST.hoverProperty().addListener(event -> {
            System.out.println("Добро пожаловать в ЗАО");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);

            alert.setContentText("Добро пожаловать в ЗАО");
            alert.setTitle("Ваше полодение курсора");
            alert.setHeaderText("");
            alert.showAndWait();
        });

        SOUTH.hoverProperty().addListener(event -> {
            System.out.println("Добро пожаловать ЮЗАО");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);

            alert.setContentText("Добро пожаловать ЮЗАО\"");
            alert.setTitle("Ваше полодение курсора");
            alert.setHeaderText("");
            alert.showAndWait();
        });

        NORTH.hoverProperty().addListener(event -> {
            System.out.println("Добро пожаловать в");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);

            alert.setContentText("Добро пожаловать в");
            alert.setTitle("Ваше полодение курсора");
            alert.setHeaderText("");
            alert.showAndWait();
        });

        EAST.hoverProperty().addListener(event -> {
            System.out.println("Добро пожаловать в СВАО");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);

            alert.setContentText("Добро пожаловать в СВАО");
            alert.setTitle("Ваше полодение курсора");
            alert.setHeaderText("");
            alert.showAndWait();
        });


    }

}
