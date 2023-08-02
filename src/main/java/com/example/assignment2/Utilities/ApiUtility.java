package com.example.assignment2.Utilities;

import com.example.assignment2.Models.RandomWord;
import com.example.assignment2.Models.Word;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiUtility {

    /**
     * Makes an API call and returns an inputted word with info about it
     * @return word
     */
    public static Word getWordFromApi(String searchName){
        searchName = searchName.replace(" ", "%20");
        String url = "https://wordsapiv1.p.rapidapi.com/words/" + searchName + "/definitions";

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(url))
                .header("X-RapidAPI-Key", "bdef38e416msh11c4e157ba7c91fp1d43dejsneb7c3e097847")
                .header("X-RapidAPI-Host", "wordsapiv1.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();

        try {
            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
            return gson.fromJson(response.body(), Word.class);
        } catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    /**
     * Makes an API call and returns a random word with info about it
     * @return random word
     */
    public static RandomWord getRandomWordFromApi(){
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create("https://wordsapiv1.p.rapidapi.com/words/?random=true"))
                .header("X-RapidAPI-Key", "bdef38e416msh11c4e157ba7c91fp1d43dejsneb7c3e097847")
                .header("X-RapidAPI-Host", "wordsapiv1.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();

        try {
            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
            return gson.fromJson(response.body(), RandomWord.class);
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
