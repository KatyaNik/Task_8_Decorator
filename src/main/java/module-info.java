module com.example.decorator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.decorator to javafx.fxml;
    exports com.example.decorator;
}