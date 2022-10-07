package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Application extends javafx.application.Application {
    private Symptom symptom = new Symptom();
    private static final ArrayList<Disease> diseases = new ArrayList<>();
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
    protected void onCheckSymptom() {
        if(febre.selectedProperty().getValue() && !symptom.getAllSymptoms().contains("febre")){
            this.symptom.add("febre");
        }else if(dor_cabeca.selectedProperty().getValue() && !symptom.getAllSymptoms().contains("dor_cabeca")){
            this.symptom.add("dor_cabeca");
        }else if (falta_ar.selectedProperty().getValue() && !symptom.getAllSymptoms().contains("falta_ar")){
            this.symptom.add("falta_ar");
        }else if (congestao.selectedProperty().getValue() && !symptom.getAllSymptoms().contains("congestao")){
            this.symptom.add("congestao");
        }else if (tosse.selectedProperty().getValue() && !symptom.getAllSymptoms().contains("tosse")){
            this.symptom.add("tosse");
        }else if (espirro.selectedProperty().getValue() && !symptom.getAllSymptoms().contains("espirro")){
            this.symptom.add("espirro");
        }else if (confusao.selectedProperty().getValue() && !symptom.getAllSymptoms().contains("confusao")){
            this.symptom.add("confusao");
        }else if (perca_olfato.selectedProperty().getValue() && !symptom.getAllSymptoms().contains("perca_olfato")) {
            this.symptom.add("perca_olfato");
        }
    }

    @FXML
    protected void onHelloButtonClick() {
        System.out.println(this.symptom.getAllSymptoms());
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Disease covid = new Disease(1, "covid", List.of(new String[]{"dor_cabeca", "febre"}));
        diseases.add(covid);

        Disease gripeComum = new Disease(1, "gripe comum", List.of(new String[]{"coriza", "mal estar"}));
        diseases.add(gripeComum);


        System.out.println(diseases.get(0).getSymptoms());

        launch();
    }
}