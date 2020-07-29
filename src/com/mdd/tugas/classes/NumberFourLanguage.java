package com.mdd.tugas.classes;


public class NumberFourLanguage {
    String name = "";

    private static NumberFourLanguage language;

    public  static NumberFourLanguage instance() {
        if (language != null) language = new NumberFourLanguage();
        return language;
    }

    public void showAll() {

    }
}
