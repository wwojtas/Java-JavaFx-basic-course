package com.odc19.bindExample.controller;

import com.odc19.bindExample.model.PersonViewModel;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;

import java.net.URL;
import java.util.ResourceBundle;

public class BindingController implements Initializable {

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

    private PersonViewModel personViewModel = new PersonViewModel();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        nameTextField.textProperty().bindBidirectional(personViewModel.namePropertyProperty());
        surnameTextField.textProperty().bindBidirectional(personViewModel.surnamePropertyProperty());
        surnameTextField.disableProperty().bind(personViewModel.disableSurnamePropertyProperty());
        // konwerter do konwertowania string na Number
        StringConverter converter = new NumberStringConverter();
        // bindowanie z konwerterem - textProperty bindujemy z Integer Propeerty
        yearTextField.textProperty().bindBidirectional(personViewModel.yearPropertyProperty(), converter);
        // checkBox bindujemy z property typu bool
        confirmCheckBox.selectedProperty().bindBidirectional(personViewModel.confirmPropertyProperty());
        // label - age - bindujemy z property typu String - obliczona wartośc wieku
        ageLabel.textProperty().bind(personViewModel.agePropertyProperty());
        // dwa labele bindujemy  z property typu Boolean
        // sterujemy ich widocznością
        nameLabel.visibleProperty().bind(personViewModel.nameOkPropertyProperty());
        surnameLabel.visibleProperty().bind(personViewModel.surnameOkPropertyProperty());
        // button bindujemy z property typu Boolean
        loginButon.disableProperty().bind(personViewModel.buttonPropertyProperty());









    }
}
