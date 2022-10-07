package com.example.demo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class HelloController {
    public CheckBox febre;
    public CheckBox dor_cabeca;
    public CheckBox falta_ar;
    public CheckBox congestao;
    public CheckBox tosse;
    public CheckBox espirro;
    public CheckBox confusao;
    public CheckBox perca_olfato;
    public Button buttonDiagnosis;
    @FXML
    private Label welcomeText;
    @FXML
    private TextArea textArea;

    @FXML
    protected void onHelloButtonClick() {
        String customText = textArea.getText();

        welcomeText.setText(customText);
    }

    public void onCheckSymptoms(ActionEvent actionEvent) {
        if(febre.selectedProperty().getValue() == true){

        }
    }

}