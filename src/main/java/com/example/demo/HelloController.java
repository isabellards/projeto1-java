package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextArea textArea;

    @FXML
    protected void onHelloButtonClick() {
        String customText = textArea.getText();

        welcomeText.setText(customText);
    }
}