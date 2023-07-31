package com.example.assignment2.Models;

public class Definitions {
    private String definition;
    private String partOfSpeech;

    public String getDefinition() {
        return definition;
    }

    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    @Override
    public String toString() {
        return definition + " - " + partOfSpeech;
    }
}