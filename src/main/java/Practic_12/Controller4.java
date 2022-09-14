package Practic_12;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class Controller4 {
    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private Label name;

    @FXML
    private Label radius;

    @FXML
    private Label weight;

    @FXML
    void initialize() {
        Planet[] planets = new Planet[]{
                Planet.Earth,
                Planet.Jupiter,
                Planet.Mercury,
                Planet.Mars,
                Planet.Pluto,
                Planet.Neptune,
                Planet.Saturn,
                Planet.Uranus,
                Planet.Venus,
        };

        ObservableList<String> planetsList = FXCollections.observableArrayList();
        for(Planet planet: planets){
            planetsList.add(planet.getName());
        }
        comboBox.setItems(planetsList);


        comboBox.setOnAction(event -> {
            for(Planet planet: planets){
                if (comboBox.getValue().equals(planet.getName())){
                    weight.setText(String.format("%d", planet.getWeight()));
                    radius.setText(String.format("%d", planet.getRadius()));
                    name.setText(planet.getName());
                }
            }
        });
    }

}
