module com.example.demoapp1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demoapp1 to javafx.fxml;
    exports com.example.demoapp1;
}