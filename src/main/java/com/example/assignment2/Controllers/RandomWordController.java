package com.example.assignment2.Controllers;

import com.example.assignment2.Models.RandomWord;
import com.example.assignment2.Models.Results;
import com.example.assignment2.Utilities.ApiUtility;
import com.example.assignment2.Utilities.SceneChanger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RandomWordController implements Initializable {

    @FXML
    private Button goBackButton;

    @FXML
    private Label mainLabel;

    @FXML
    private Button randomBtn;

    @FXML
    private Label wordLabel;

    @FXML
    private ListView<Results> listView;

    /**
     * Changes scenes
     * @param event
     * @throws IOException
     */
    @FXML
    void goBack_onClick(ActionEvent event) throws IOException {
        SceneChanger.changeScene(event, "word-view.fxml", "Choose your word!");
    }

    /**
     * Returns random word with info about it
     * @param event
     */
    @FXML
    void random_onClick(ActionEvent event) {
        listView.getItems().clear();

        RandomWord newRandomWord = ApiUtility.getRandomWordFromApi();

        wordLabel.setText(newRandomWord.getRandomWord());
        if (newRandomWord.getResults() == null) {
            mainLabel.setText("No information on the word was found!");
        }
        else {
            mainLabel.setText("Random Word!");
            listView.getItems().addAll(newRandomWord.getResults());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        random_onClick(new ActionEvent());
    }
}