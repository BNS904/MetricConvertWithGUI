package com.example.metricconvertwithgui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableRow;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

       /* Text welcome = new Text(200, 90, "Welcome to the Metric Converter!\nplease click your desired conversion ");


        Button tempButton = new Button();
        tempButton.setText("F° to C°");
        tempButton.setTranslateX(100);
        tempButton.setTranslateY(250);

        Button weightButton = new Button();
        weightButton.setText("Kg to Lbs");
        weightButton.setTranslateX(200);
        weightButton.setTranslateY(250);

        Button distanceButton1 = new Button();
        distanceButton1.setText("Km to Miles");
        distanceButton1.setTranslateX(300);
        distanceButton1.setTranslateY(250);

        Button distanceButton2 = new Button();
        distanceButton2.setText("M to Ft");
        distanceButton2.setTranslateX(400);
        distanceButton2.setTranslateY(250);
        */

        Parent root = new FXMLLoader().load(getClass().getResource("StartMenu"));
        Scene scene = new Scene(root);

        //stage.setTitle("Metric Converter");

        stage.setScene(scene);
        stage.show();
    }
}