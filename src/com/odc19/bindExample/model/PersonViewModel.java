package com.odc19.bindExample.model;

import javafx.beans.binding.When;
import javafx.beans.property.*;

import java.time.LocalDate;

public class PersonViewModel {

    // textfield name
    private StringProperty nameProperty = new SimpleStringProperty();
    // label OK - name
    private BooleanProperty nameOkProperty = new SimpleBooleanProperty(false);
    // textfield surname
    private StringProperty surnameProperty = new SimpleStringProperty();
    // on/off surname-field
    private BooleanProperty disableSurnameProperty = new SimpleBooleanProperty(true);
    // label OK surname
    private BooleanProperty surnameOkProperty = new SimpleBooleanProperty(false);
    // textfield - year of Birth
    private IntegerProperty yearProperty = new SimpleIntegerProperty();
    // checkBox Value
    private BooleanProperty confirmProperty = new SimpleBooleanProperty(false);
    // year`s value in field
    private StringProperty ageProperty = new SimpleStringProperty();
    // button login
    private BooleanProperty buttonProperty = new SimpleBooleanProperty(false);
    // current year
    private IntegerProperty actualYearProperty = new SimpleIntegerProperty(LocalDate.now().getYear());

    public PersonViewModel(){
        nameOkProperty.bind(nameProperty.isNotEmpty());
        surnameOkProperty.bind(surnameProperty.isNotEmpty());
        disableSurnameProperty.bind(nameProperty.isEmpty());
        buttonProperty.bind(confirmProperty.not());
        ageProperty.bind(new When(yearProperty.isNotEqualTo(0))
                .then(actualYearProperty.subtract(yearProperty).asString()).otherwise(""));


    }

    public String getNameProperty() {
        return nameProperty.get();
    }

    public StringProperty namePropertyProperty() {
        return nameProperty;
    }

    public void setNameProperty(String nameProperty) {
        this.nameProperty.set(nameProperty);
    }

    public boolean isNameOkProperty() {
        return nameOkProperty.get();
    }

    public BooleanProperty nameOkPropertyProperty() {
        return nameOkProperty;
    }

    public void setNameOkProperty(boolean nameOkProperty) {
        this.nameOkProperty.set(nameOkProperty);
    }

    public String getSurnameProperty() {
        return surnameProperty.get();
    }

    public StringProperty surnamePropertyProperty() {
        return surnameProperty;
    }

    public void setSurnameProperty(String surnameProperty) {
        this.surnameProperty.set(surnameProperty);
    }

    public boolean isDisableSurnameProperty() {
        return disableSurnameProperty.get();
    }

    public BooleanProperty disableSurnamePropertyProperty() {
        return disableSurnameProperty;
    }

    public void setDisableSurnameProperty(boolean disableSurnameProperty) {
        this.disableSurnameProperty.set(disableSurnameProperty);
    }

    public boolean isSurnameOkProperty() {
        return surnameOkProperty.get();
    }

    public BooleanProperty surnameOkPropertyProperty() {
        return surnameOkProperty;
    }

    public void setSurnameOkProperty(boolean surnameOkProperty) {
        this.surnameOkProperty.set(surnameOkProperty);
    }

    public int getYearProperty() {
        return yearProperty.get();
    }

    public IntegerProperty yearPropertyProperty() {
        return yearProperty;
    }

    public void setYearProperty(int yearProperty) {
        this.yearProperty.set(yearProperty);
    }

    public boolean isConfirmProperty() {
        return confirmProperty.get();
    }

    public BooleanProperty confirmPropertyProperty() {
        return confirmProperty;
    }

    public void setConfirmProperty(boolean confirmProperty) {
        this.confirmProperty.set(confirmProperty);
    }

    public StringProperty agePropertyProperty() {
        return ageProperty;
    }

    public void setAgeProperty(String ageProperty) {
        this.ageProperty.set(ageProperty);
    }

    public boolean isButtonProperty() {
        return buttonProperty.get();
    }

    public BooleanProperty buttonPropertyProperty() {
        return buttonProperty;
    }


    public IntegerProperty actualYearPropertyProperty() {
        return actualYearProperty;
    }

}
