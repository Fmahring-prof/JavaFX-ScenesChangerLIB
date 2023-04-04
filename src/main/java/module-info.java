module com.example.javafxscenechangerlib {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxscenechangerlib to javafx.fxml;
    exports com.example.javafxscenechangerlib;

    opens com.example.javafxscenechangerlib.example to javafx.graphics;
    exports com.example.javafxscenechangerlib.example;
}