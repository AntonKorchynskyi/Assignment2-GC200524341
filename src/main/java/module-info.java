module com.example.assignment2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires java.net.http;


    opens com.example.assignment2 to javafx.fxml, com.google.gson;
    exports com.example.assignment2;
    exports com.example.assignment2.Models;
    opens com.example.assignment2.Models to com.google.gson, javafx.fxml;
    exports com.example.assignment2.Utilities;
    opens com.example.assignment2.Utilities to com.google.gson, javafx.fxml;
    exports com.example.assignment2.Controllers;
    opens com.example.assignment2.Controllers to com.google.gson, javafx.fxml;
}