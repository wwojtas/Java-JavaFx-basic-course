package com.odc17.properties.model;

import javafx.beans.property.ReadOnlyStringProperty;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {

    // working without properties
   private StringProperty propertyTextField = new SimpleStringProperty(this, "nameProperty", "Roman");

   private ReadOnlyStringWrapper propertyWrapper = new ReadOnlyStringWrapper(this, "readOnly", "tylko odczyt");
   private ReadOnlyStringProperty readOnlyString = propertyWrapper.getReadOnlyProperty();

   public ReadOnlyStringProperty getReadOnlyString(){
       return readOnlyString;
   }

    public Person(){
        propertyWrapper.set("Jednak zmieniam wartość");
        readOnlyString.get();
    }

    public String getPropertyTextField() {
        return propertyTextField.get();
    }

    public StringProperty propertyTextFieldProperty() {
        return propertyTextField;
    }

    public void setPropertyTextField(String propertyTextField) {
        this.propertyTextField.set(propertyTextField);
    }
}
