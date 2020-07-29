package com.mdd.tugas;

import com.mdd.tugas.classes.NumberTwoLanguage;

import java.io.Serializable;

public class NumberTwo {

    public static void main(String[] args) {
        countWord();
    }

    private void countWord() {


        var count = NumberTwoLanguage.instance();
        count.counts();
    }

    private String word() {
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
