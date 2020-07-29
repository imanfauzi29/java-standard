package com.mdd.tugas.classes;

public class PalindromLanguage {

//    List<String> fw = List.of();

    private static  PalindromLanguage language;

    public static PalindromLanguage instance() {
        if(language == null) language = new PalindromLanguage();

        return language;
    }

    public void check(String text) {
        String s, data;
        s = text.toLowerCase().replaceAll("\\W", "");

        StringBuffer buffer = new StringBuffer(s);
        buffer.reverse();
        data = buffer.toString();

        if (s.equals(data)) {
            System.out.println(text + " is palindrom");
        }else {
            System.out.println(text + " not palindrom");
        }
    }
}
