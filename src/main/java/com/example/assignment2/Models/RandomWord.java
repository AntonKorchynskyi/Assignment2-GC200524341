package com.example.assignment2.Models;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class RandomWord {

    @SerializedName("word")
    private String randomWord;

    private Results[] results;

    public String getRandomWord() {
        return randomWord;
    }

    public Results[] getResults() {
        return results;
    }
}
