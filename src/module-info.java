module train1 {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;

    opens com.train;
    opens com.train.view;
    opens com.train.controller;
//    odc.17
    opens com.odc17.properties.controller;
    opens com.odc17.properties.view;
    opens com.odc17.properties;
}