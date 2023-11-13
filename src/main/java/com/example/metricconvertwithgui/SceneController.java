package com.example.metricconvertwithgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class SceneController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Label tempResult;
    @FXML
    private TextField tempTextInput;

    @FXML
    private Label weightResult;
    @FXML
    private TextField weightTextInput;

    @FXML
    private Label distanceOneResult;
    @FXML
    private TextField distanceOneTextInput;

    @FXML
    private Label distanceTwoResult;
    @FXML
    private TextField distanceTwoTextInput;

    double temp;
    double weight;
    double distance1;
    double distance2;

    public void tempConversion() {
        try {
            temp = Double.parseDouble(tempTextInput.getText());
            tempResult.setText(Conversion.tempConvert(temp));
        }
        catch (NumberFormatException e) {
            tempResult.setText("Please enter only numbers");
        }
        catch (Exception e) {
            tempResult.setText("Error");
        }
    }

    public void weightConversion() {
        try {
            weight = Double.parseDouble(weightTextInput.getText());
            weightResult.setText(Conversion.weightConvert(weight));
        }
        catch (NumberFormatException e) {
            weightResult.setText("Please enter only numbers");
        }
        catch (Exception e) {
            weightResult.setText("Error");
        }
    }

    public void distanceOneConversion() {
        try {
            distance1 = Double.parseDouble(distanceOneTextInput.getText());
            distanceOneResult.setText(Conversion.distanceOneConvert(distance1));
        }
        catch (NumberFormatException e) {
            distanceOneResult.setText("Please enter only numbers");
        }
        catch (Exception e) {
            distanceOneResult.setText("Error");
        }
    }

    public void distanceTwoConversion() {
        try {
            distance2 = Double.parseDouble(distanceTwoTextInput.getText());
            distanceTwoResult.setText(Conversion.distanceTwoConvert(distance2));
        }
        catch (NumberFormatException e) {
            distanceTwoResult.setText("Please enter only numbers");
        }
        catch (Exception e) {
            distanceTwoResult.setText("Error");
        }
    }

    public void switchToTempMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TempMenu.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToWeightMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("WeightMenu.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToDistanceMenu1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("DistanceMenu1.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToDistanceMenu2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("DistanceMenu2.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToStartMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("StartMenu.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void exit() {
        System.exit(0);
    }
}
