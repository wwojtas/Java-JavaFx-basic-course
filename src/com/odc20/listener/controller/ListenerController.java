package com.odc20.listener.controller;

import com.odc17.properties.controller.Controller;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ListenerController implements Initializable{

    @FXML
    private Label nameLabel;

    @FXML
    private TextField nameTextField;

    @FXML
    private Label surnameLabel;

    @FXML
    private TextField surnameTextField;

    @FXML
    private Label ageLabel;

    @FXML
    private TextField yearTextField;

    @FXML
    private CheckBox confirmCheckBox;

    @FXML
    private Label yourYearAnswer;

    @FXML
    private Button loginButon;

    private BooleanProperty checkBoxProperty = new SimpleBooleanProperty();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        confirmCheckBox.selectedProperty().bindBidirectional(checkBoxProperty);
        nameTextField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String oldValue, String newValue) {
                System.out.println("Stara wartosc: " + oldValue);
                System.out.println("Nowa wartosc: " + newValue);
                if(newValue.isEmpty()){
                    surnameTextField.setText("");
                }
            }
        });
        surnameTextField.focusedProperty().addListener((observableValue, oldValue, newValue) -> {
            if(newValue) {
                System.out.println("Jestes w polu nazwisko");
            } else {
                System.out.println("Byles w polu nazwisko");
            }
        } );
        yearTextField.textProperty().addListener(ListenerController::yearTextFieldListener);

        checkBoxProperty.addListener((observableValue, oldValue, newValue) -> {
            if(newValue) {
                System.out.println("Zaznaczono");
            } else {
                System.out.println("Odznaczono");
            }
        });
    }

    private static void yearTextFieldListener(ObservableValue<? extends String> observableValue, String oldValue, String newValue){
        System.out.println("Tutaj: " + observableValue);
        System.out.println("Nowa wartość: " + newValue);
    }

}
