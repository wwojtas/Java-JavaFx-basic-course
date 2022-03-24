package com.train;

import com.train.controller.StackPaneController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Launcher extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("view/StackPaneWindow.fxml"));

        StackPaneController controller = new StackPaneController();
        loader.setController(controller);

        StackPane stackPane = loader.load();
        Scene scene = new Scene(stackPane);
        primaryStage.setScene(scene);

        primaryStage.setTitle("Okno aplikacji");
        primaryStage.show();
    }
}
