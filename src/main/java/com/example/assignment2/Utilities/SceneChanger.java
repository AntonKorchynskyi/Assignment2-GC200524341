package com.example.assignment2.Utilities;

import com.example.assignment2.Controllers.RandomWordController;
import com.example.assignment2.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneChanger {
    public static void changeScene(ActionEvent event, String fxmlFile, String viewTitle) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Views/" + fxmlFile));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle(viewTitle);
        stage.setScene(scene);
        stage.show();
    }
}