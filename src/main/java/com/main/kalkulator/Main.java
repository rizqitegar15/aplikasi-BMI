package com.main.kalkulator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Memuat file FXML dari folder /fxml/
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/kalkulator.fxml"));
        
        primaryStage.setTitle("Kalkulator BMI");
        primaryStage.setScene(new Scene(root, 478, 595));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}