package com.train.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class StackPaneController implements Initializable {

    @FXML
    private Button button;

    public StackPaneController() {
        System.out.println("jestem kontrolerem");
    }

    //    @FXML
//    public void onButtonAction(ActionEvent e) {
//        System.out.println("Metoda onButtonAction " + e.getEventType() + " " + e.getSource());
//        if(e.getSource() instanceof Button) {
//            System.out.println("Dodatkowa informacja od button");
//        }
//    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        // wywoływanie akcji
        button.setText("Jestem button");

        // event po kliknięciu
        EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Button z Event Handler");
            }
        };
        button.addEventFilter(ActionEvent.ACTION ,handler); // uruchomienie akcji

        // event po najechaniu myszką
        EventHandler<MouseEvent> mouseEventEventHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("Handler z mouse event");
            }
        };

        // event za pomocą lambdy oraz usunięcie event Handler
        button.setOnAction(e->{
            System.out.println("Event z SetOnAction - z lambdy");
            button.removeEventHandler(MouseEvent.MOUSE_ENTERED, mouseEventEventHandler);
        });

    }
}
