package com.example.javafxscenechangerlib.example;

import com.example.javafxscenechangerlib.FXChanger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ExampleBasic0 extends Application {

    // implementation of the buttons from SceneBuilder
    public Button Basic1;
    public Button Basic2;

    public void ChangeBTNs(ActionEvent actionEvent) throws IOException {    // ChangeBTNs is the method that test if Buttons are clicked

        if (actionEvent.getSource() == Basic1) {    // Tests which Button is clicked from the Button fx:id
            FXChanger.ChangeScenes("changerExampleBasic1.fxml", "Basic1");    // Gives the ChangeScene Method the fxml and name of scene
        } else if (actionEvent.getSource() == Basic2) {
            FXChanger.ChangeScenes("changerExampleBasic2.fxml", "Basic2");
        }

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXChanger.StartScene("changerExampleMENU.fxml", "Basic0");
    }

    public static void main(String[] args) {
        launch();
    }

}