package com.demo.models;

import com.demo.entities.Language;

import java.util.ArrayList;
import java.util.List;

public class LanguageModel {
    public List<Language> findAll(){
        List<Language> languageList = new ArrayList<Language>();
        languageList.add(new Language("lang1", "Language 1"));
        languageList.add(new Language("lang2", "Language 2"));
        languageList.add(new Language("lang3", "Language 3"));
        languageList.add(new Language("lang4", "Language 4"));
        languageList.add(new Language("lang5", "Language 5"));
        languageList.add(new Language("lang6", "Language 6"));
        languageList.add(new Language("lang7", "Language 7"));

        return languageList;
    }
}
