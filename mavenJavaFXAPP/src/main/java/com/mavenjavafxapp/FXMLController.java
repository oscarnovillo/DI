package com.mavenjavafxapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class FXMLController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private ComboBox<String> combo;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("title");
        alert.setHeaderText("Information Alert");
        String s = "This is an example of JavaFX 8 Dialogs... ";
        alert.setContentText(s);
        alert.show();
    }

    @FXML
    private void handleCombo(ActionEvent event) {
        System.out.println(combo.getSelectionModel().getSelectedItem());
        label.setText("Hello World!");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        combo.getItems().addAll(
                "Option 4",
                "Option 5",
                "Option 6"
        );
    }
}
