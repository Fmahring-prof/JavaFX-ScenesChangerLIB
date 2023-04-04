package com.example.javafxscenechangerlib;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FXChanger{

    public static Stage oldStage;  // old stage to be used as middleman to change scenes

    // MMethod to set the StarterScene
    public static void StartScene(String fxml, String SceneTitle) throws IOException {
        FXMLLoader loader = new FXMLLoader(FXChanger.class.getResource(fxml));    // Loads the fxml file
        Parent root = loader.load();
        Stage primaryStage = new Stage();
        primaryStage.setTitle(SceneTitle);  // sets the title of the new stage
        primaryStage.setScene(new Scene(root));
        primaryStage.centerOnScreen();  // sets the center of the scene to the center of the screen
        primaryStage.show();    // shows the new stage
        oldStage = primaryStage;    // sets the new stage on the old stage
    }



    // Method to change the Scene, needs the .fxml file and the name of the new scene
    public static void ChangeScenes(String fxml, String SceneTitle) throws IOException {
        FXMLLoader loader = new FXMLLoader(FXChanger.class.getResource(fxml));    // Loads the fxml file
        Parent root = loader.load();
        oldStage.close();   // closes the old stage
        Stage primaryStage = new Stage();
        oldStage = primaryStage;    // sets the new stage on the old stage
        primaryStage.setTitle(SceneTitle);  // sets the title of the new stage
        primaryStage.setScene(new Scene(root));
        primaryStage.centerOnScreen();  // sets the center of the scene to the center of the screen
        primaryStage.show();    // shows the new stage
    }

}
