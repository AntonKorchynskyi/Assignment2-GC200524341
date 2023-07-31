package com.example.assignment2.Models;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class Word {
    @SerializedName("word")
    private String wordName;

    @SerializedName("definitions")
    private Definitions[] definitions;

    public String getWordName() {
        return wordName;
    }

    public Definitions[] getDefinitions() {
        return definitions;
    }

    @Override
    public String toString() {
        return "Word{" +
                "wordName='" + wordName + '\'' +
                ", definitions=" + Arrays.toString(definitions) +
                '}';
    }
}
