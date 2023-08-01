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

public class WordController implements Initializable {

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

    @FXML
    void random_onClick(ActionEvent event) throws IOException {
        SceneChanger.changeScene(event, "random-word-view.fxml", "Random Word!");
    }

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        listView.getItems().addAll(ApiUtility.getWordFromApi("fate").getDefinitions());
    }
}