package com.mdd.tugas.classes;

public class NumberTwoLanguage {

    private static NumberTwoLanguage language;

    public static NumberTwoLanguage instance() {
        if(language != null) language = new NumberTwoLanguage();
        return language;
    }

    public void counts() {
//
//        lyric = lyric.replace("\n", " ").toLowerCase();

//        return lyric;
        System.out.println("ok");

    }
}
