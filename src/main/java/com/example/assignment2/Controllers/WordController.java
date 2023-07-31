package com.example.assignment2.Controllers;

import com.example.assignment2.Models.Definitions;
import com.example.assignment2.Utilities.ApiUtility;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class WordController implements Initializable {

    @FXML
    private ListView<Definitions> listView;

    @FXML
    private Button randomBtn;

    @FXML
    private Button searchBtn;

    @FXML
    private TextField textField;

    @FXML
    void random_onClick(ActionEvent event) {

    }

    @FXML
    void search_onClick(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listView.getItems().addAll(ApiUtility.getWordFromApi("fate").getDefinitions());
    }
}