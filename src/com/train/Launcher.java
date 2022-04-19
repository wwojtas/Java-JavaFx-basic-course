package com.train;

import com.train.controller.StackPaneController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;

public class Launcher extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("view/StackPaneWindow.fxml"));

        StackPaneController controller = new StackPaneController();
        loader.setController(controller);

        StackPane stackPane = loader.load();
        Scene scene = new Scene(stackPane);
        primaryStage.setScene(scene);

        primaryStage.setTitle("Okno aplikacji");
        primaryStage.show();
//        =============================
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm").withLocale(Locale.getDefault());
        System.out.println(dtf.format(localTime));
//        ======================================
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh'h'mm a", Locale.ENGLISH);
//     ========================================
        System.out.println(ZoneId.systemDefault());
        System.out.println(ZoneId.of("Europe/Rome"));
        System.out.println(LocalTime.now(ZoneId.of("Asia/Shanghai")));

        ZoneId userTimezone = ZoneId.of("Europe/Rome"); // To provide as parameter
        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("dd/MM/yyyy HH:mm")
                .withZone(userTimezone);

//        String formattedDateTime = new ZonedDateTime.format();

        Instant instant = Instant.now();
        ZoneId z = ZoneId.of( "America/Montreal" );
        ZonedDateTime nowMontreal = instant.atZone( z );
        String output = DateTimeFormatter
                .ofLocalizedDate( FormatStyle.SHORT )
                .withLocale( Locale.forLanguageTag("pl") )
                .format ( nowMontreal )
                ;
        System.out.println(output);

    }
}
