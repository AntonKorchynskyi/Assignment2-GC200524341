package com.example.assignment2.Controllers;

import com.example.assignment2.Models.Definitions;
import com.example.assignment2.Models.Word;
import com.example.assignment2.Utilities.ApiUtility;
import com.example.assignment2.Utilities.SceneChanger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class WordController {

    @FXML
    private Label definitionsLabel;

    @FXML
    private Label mainLabel;

    @FXML
    private ListView<Definitions> listView;

    @FXML
    private Button randomBtn;

    @FXML
    private Button searchBtn;

    @FXML
    private TextField textField;

    /**
     * Changes scenes
     * @param event
     * @throws IOException
     */
    @FXML
    void random_onClick(ActionEvent event) throws IOException {
        SceneChanger.changeScene(event, "random-word-view.fxml", "Random Word!");
    }

    /**
     * Searches for the inputted word
     * @param event
     */
    @FXML
    void search_onClick(ActionEvent event) {
        listView.getItems().clear();
        String searchText = textField.getText();

        Word newWord = ApiUtility.getWordFromApi(searchText);

        if(newWord.getDefinitions() == null){
            mainLabel.setText("No Word Found!");
        } else{
            listView.getItems().addAll(newWord.getDefinitions());
            mainLabel.setText("Choose Your Word!");
        }
    }
}