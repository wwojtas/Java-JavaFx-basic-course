package com.myProperty;

import com.myProperty.controller.SetLocation;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Launcher extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("view/SetLocation.fxml"));
        SetLocation setLocationController = new SetLocation();
        loader.setController(setLocationController);

        Parent parent = loader.load();
        Scene scene = new Scene(parent);
        stage.setTitle("Lokalizacja");
        stage.setScene(scene);
        stage.show();
    }
}
