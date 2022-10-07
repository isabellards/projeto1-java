package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
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