package com.example.assignment2.Models;

import java.util.Arrays;

public class Results {
    private String definition;
    private String partOfSpeech;
    private String[] synonyms;
    private String[] typeOf;

    public String getDefinition() {
        return definition;
    }

    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public String[] getSynonyms() {
        return synonyms;
    }

    public String[] getTypeOf() {
        return typeOf;
    }

    @Override
    public String toString() {
        return "Definition: " + definition + '\n' +
                "Part Of Speech: " + partOfSpeech + '\n' +
                "Synonyms: " + Arrays.toString(synonyms) + '\n' +
                "Type Of: " + Arrays.toString(typeOf);
    }
}