package com.odc19.bindExample;

import com.odc19.bindExample.controller.BindingController;
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
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("view/Binding.fxml"));
        BindingController bindingController = new BindingController();
        loader.setController(bindingController);

        Scene scene = new Scene(loader.load());
        stage.setTitle("Binding");
        stage.setScene(scene);
        stage.show();


    }

}
