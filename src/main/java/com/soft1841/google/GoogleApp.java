package com.soft1841.google;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class GoogleApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        URL location = getClass().getResource("/fxml/main.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(location);
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root,1920,1080);
        scene.getStylesheets().addAll("/css/style.css");
        primaryStage.setTitle("Google");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

