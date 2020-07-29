package com.mdd.tugas;

import com.mdd.tugas.classes.NumberTwoLanguage;

public class NumberTwo {

    public static void main(String[] args) {
        countWord();
    }

    private static void countWord() {

        var count = NumberTwoLanguage.instance();
        count.counts();
    }


}
