package com.mdd.tugas.classes;

import java.util.List;
import java.util.Scanner;

public class NumberTwoLanguage {

    public List<Object> name = List.of();

    private static  NumberTwoLanguage language;

    public static NumberTwoLanguage instance() {
        if(language == null) language = new NumberTwoLanguage();

        return language;
    }

    public String count(String s, String songs) {
        var wordToLow = s.toLowerCase();
        var replace = songs.replace("\\n", "").toLowerCase();
        Scanner in = new Scanner(replace);

        int wordCount = 0;
        while (in.hasNext()) if(in.next().equals(wordToLow)) wordCount++;

        return s + " : " + wordCount;
    }
}
