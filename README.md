# JFX-SceneChangerLIB

Quick and dirty SceneChanger for JavaFX


IMPORTANT!!

Use 
  
    FXChanger.oldStage = primaryStage;
  
in the start Method


to change scenes use:

    FXChanger.ChangeScenes("fxml", "SceneTitle");
 
in fxml use your fxml-file


put 
  
    opens <your main class path> to javafx.fxml;
    exports <your main class path + folder inside>;

in the module-java.info file
