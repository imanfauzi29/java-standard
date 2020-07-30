package com.mdd.tugas;

import com.mdd.tugas.classes.NumberTwoLanguage;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class NumberTwo {

    public static void main(String[] args) {
        count();
    }

    private static void count() {
        List<String> words = List.of("Aku", "ingin", "la...");
        words.stream().map(NumberTwo::get).forEach(System.out::println);
    }

    public static String get(String s) {
        var countWord = NumberTwoLanguage.instance();
        return countWord.count(s, songs());
    }


    private static String songs() {
        var lyric = "Aku ingin begini\n" +
                "Aku ingin begitu\n" +
                "Ingin ini itu banyak sekali\n\n" +
                "Semua semua semua\n" +
                "Dapat dikabulkan\n" +
                "Dapat dikabulkan\n" +
                "Dengan kantong ajaib\n\n" +
                "Aku ingin terbang bebas\n" +
                "Di angkasa\n" +
                "Hei… baling baling bambu\n\n" +
                "La... la... la...\n" +
                "Aku sayang sekali\n" +
                "Doraemon\n\n" +
                "La... la... la...\n" +
                "Aku sayang sekali";

        return lyric;
    }
}
