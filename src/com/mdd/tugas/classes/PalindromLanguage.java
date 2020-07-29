package com.mdd.tugas.classes;

public class PalindromLanguage {

    private static  PalindromLanguage language;

    public static PalindromLanguage instance() {
        if(language == null) language = new PalindromLanguage();

        return language;
    }

    public boolean check(String text) {
        String s, data;
        s = text.toLowerCase().replaceAll("\\W", "");

        StringBuilder builder = new StringBuilder(s);
        builder.reverse();
        data = builder.toString();

        return (s.equals(data));
    }

    public String get(String s) {
        return (this.check(s)) ? s + ": is Palindrom? " + this.check(s) : s + ": is Palindrom? " + this.check(s);
    }
}
