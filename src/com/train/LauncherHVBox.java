package com.train;

import com.train.controller.HboxVBoxController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LauncherHVBox extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("view/HboxVBox.fxml"));
        HboxVBoxController hboxVBoxController = new HboxVBoxController();
        loader.setController(hboxVBoxController);
        HBox hBox = loader.load();
//        VBox vBox = loader.load();
        Scene  scene =new Scene(hBox);
        stage.setScene(scene);
        stage.show();




    }
}
