package com.odc17.properties.controller;

import com.odc17.properties.model.Person;
import javafx.beans.Observable;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

// working without properties

public class Controller implements Initializable {

    private Person person = new Person();

    @FXML
    private Label label;
    @FXML
    private Label labelName;
    @FXML
    private TextField textField;

    @FXML
    void write() {
        person.propertyTextFieldProperty();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        textField.textProperty().bindBidirectional(person.propertyTextFieldProperty());
        labelName.textProperty().bind(person.propertyTextFieldProperty());
    }
}



