package Practic_11;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Controller {

    @FXML
    private Button buttonUser;

    @FXML
    private TextField inputUser;

    @FXML
    private Label labelSystem;

    @FXML
    private Label labelUser;

    @FXML
    void initialize() {
        Random random = new Random();
        AtomicInteger randX = new AtomicInteger(random.nextInt(20));
        AtomicInteger attempts = new AtomicInteger(3);

        buttonUser.setOnAction(event -> {
            if (buttonUser.getText().equals("Начать заново")){
                randX.set(random.nextInt(20));
                buttonUser.setText("УГАДАТЬ!");
                inputUser.setVisible(true);
                inputUser.setText("");
                labelUser.setText("");
                labelSystem.setText("Игра угадайка у тебя есть 3 попытки чтобы угадать число от 0 до 20");
                attempts.set(3);
            }
            else {
                if (inputUser.getCharacters().toString().equals("")) {
                    labelUser.setText("Введите число от 0 до 20");
                }
                else {
                    if (attempts.get() == 0){
                        labelUser.setText(String.format("Вы проиграли число %d", randX.get()));
                        labelSystem.setText("Вы проиграли");
                        inputUser.setVisible(false);
                        buttonUser.setText("Начать заново");
                    }
                    else {
                        try {
                            int x = Integer.parseInt(inputUser.getCharacters().toString());
                            if (x > randX.get()) {
                                labelUser.setText("Загаданное число меньше");
                                attempts.set(attempts.get() - 1);
                                labelSystem.setText(String.format("У вас отсалось %d попыток", attempts.get()));
                                if (attempts.get() == 0){
                                    labelUser.setText(String.format("Вы проиграли число %d", randX.get()));
                                    labelSystem.setText("Вы проиграли");
                                    inputUser.setVisible(false);
                                    buttonUser.setText("Начать заново");
                                }
                            } else if (x < randX.get()) {
                                labelUser.setText("Загаданное число больше");
                                attempts.set(attempts.get() - 1);
                                labelSystem.setText(String.format("У вас отсалось %d попыток", attempts.get()));
                                if (attempts.get() == 0){
                                    labelUser.setText(String.format("Вы проиграли число %d", randX.get()));
                                    labelSystem.setText("Вы проиграли");
                                    inputUser.setVisible(false);
                                    buttonUser.setText("Начать заново");
                                }
                            } else {
                                labelUser.setText("Вы угадали");
                                labelSystem.setText("Вы угадали");
                                inputUser.setVisible(false);
                                buttonUser.setText("Начать заново");

                            }
                        }
                        catch (NumberFormatException exception) {
                            labelUser.setText("Введите число от 0 до 20");
                        }

                    }
                }
            }
        });
    }

}
