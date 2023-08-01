package com.example.assignment2;

import com.example.assignment2.Models.RandomWord;
import com.example.assignment2.Models.Word;
import com.example.assignment2.Utilities.ApiUtility;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Views/word-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Choose your word!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Word word1 = ApiUtility.getWordFromApi("fate");
        RandomWord randomWord2 = ApiUtility.getRandomWordFromApi();
        System.out.println(randomWord2.getRandomWord());
        System.out.println(randomWord2.getResults());
        launch();
    }
}