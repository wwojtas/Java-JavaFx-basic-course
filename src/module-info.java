module train1 {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;

    opens com.train;
    opens com.train.view;
    opens com.train.controller;
}