package com.train;

import com.train.controller.FlowPaneController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class launcherFlowPane extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("view/FlowPane.fxml"));
        FlowPaneController controller = new FlowPaneController();
        loader.setController(controller);
        FlowPane flowPane = loader.load();
        Scene scene = new Scene(flowPane);
        stage.setScene(scene);
        stage.show();
    }
}
