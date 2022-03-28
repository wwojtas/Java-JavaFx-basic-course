package com.odc20.listener;

import com.odc19.bindExample.controller.BindingController;
import com.odc20.listener.controller.ListenerController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("view/ListenerExample.fxml"));
        ListenerController listenerController = new ListenerController();
        loader.setController(listenerController);

        Scene scene = new Scene(loader.load());
        stage.setTitle("Listener");
        stage.setScene(scene);
        stage.show();
    }
}
