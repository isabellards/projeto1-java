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
        if(febre.selectedProperty().getValue() == true){
            System.out.println("febre");
        }else if(dor_cabeca.selectedProperty().getValue() == true){
            System.out.println("dor cabeca");
        }else if (falta_ar.selectedProperty().getValue() == true){
            System.out.println("falta_ar");
        }else if (congestao.selectedProperty().getValue() == true){

        }else if (tosse.selectedProperty().getValue() == true){

        }else if (espirro.selectedProperty().getValue() == true){

        }else if (confusao.selectedProperty().getValue() == true){

        }else if (perca_olfato.selectedProperty().getValue() == true){

        }
    }
    @FXML
    protected void onHelloButtonClick() {
        System.out.println("teste");
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
        Pathologies covid = new Pathologies(1, "covid", List.of(new String[]{"dor de cabeça", "febre"}));
        Pathologies gripeComum = new Pathologies(1, "gripe comum", List.of(new String[]{"coriza", "mal estar"}));


        System.out.println(covid.getSymptoms());
        System.out.println(gripeComum.getSymptoms());

        launch();
    }
}