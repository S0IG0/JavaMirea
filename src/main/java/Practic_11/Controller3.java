package Practic_11;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;

public class Controller3 {


    @FXML
    private Button button;

    @FXML
    private ComboBox<String> comboBoxColor;

    @FXML
    private ComboBox<String> comboBoxFonts;

    @FXML
    private TextArea textArea;

    @FXML
    void initialize() {
        ObservableList<String> colors = FXCollections.observableArrayList(
                "синий",
                "красный",
                "черный"
        );
        comboBoxColor.setItems(colors);

        ObservableList<String> fonts = FXCollections.observableArrayList(
                "Times New Roman",
                "MS Sans Serif",
                "Courier New"
        );
        comboBoxFonts.setItems(fonts);

        comboBoxColor.setOnAction(event -> {
            if (comboBoxColor.getValue().equals("синий")) {
                textArea.setStyle("-fx-text-fill: blue;");
            } else if (comboBoxColor.getValue().equals("красный")) {
                textArea.setStyle("-fx-text-fill: red;");
            } else if (comboBoxColor.getValue().equals("черный")) {
                textArea.setStyle("-fx-text-fill: black;");
            }
        });

        comboBoxFonts.setOnAction(event -> {
            if (comboBoxFonts.getValue().equals("Times New Roman")) {
                textArea.setFont(Font.font("Times New Roman"));
            } else if (comboBoxFonts.getValue().equals("MS Sans Serif")) {
                textArea.setFont(Font.font("MS Sans Serif"));
            } else if (comboBoxFonts.getValue().equals("Courier New")) {
                textArea.setFont(Font.font("Courier New"));

            }
        });
    }

}
