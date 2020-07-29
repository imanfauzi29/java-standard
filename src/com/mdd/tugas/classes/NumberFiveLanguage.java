package com.mdd.tugas.classes;

import java.io.Reader;

public class NumberFiveLanguage {

    private static NumberFiveLanguage language;

    public  static NumberFiveLanguage instance() {
        if (language != null) language = new NumberFiveLanguage();
        return language;
    }

}
