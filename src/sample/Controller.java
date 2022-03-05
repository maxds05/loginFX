package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.awt.event.ActionEvent;

public class Controller {
    @FXML
    private TextField usernameInput;
    @FXML
    private TextField passInput;

    private void userInput(ActionEvent event) {
        String username = usernameInput.getText();
        String password = passInput.getText();




    }
}
