package com.example.javafxscenechangerlib.example;

import com.example.javafxscenechangerlib.FXChanger;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import java.io.IOException;

public class ExampleBasic2 {

    // implementation of the buttons from SceneBuilder
    public Button Basic1;
    public Button MenuBTN;

    public void ChangeBTNs(ActionEvent actionEvent) throws IOException {    // ChangeBTNs is the method that test if Buttons are clicked

        if (actionEvent.getSource() == Basic1) {    // Tests which Button is clicked from the Button fx:id
            FXChanger.ChangeScenes("changerExampleBasic1.fxml", "Basic1");    // Gives the ChangeScene Method the fxml and name of scene
        } else if (actionEvent.getSource() == MenuBTN) {
            FXChanger.ChangeScenes("changerExampleMENU.fxml", "Menu");
        }
    }
}
