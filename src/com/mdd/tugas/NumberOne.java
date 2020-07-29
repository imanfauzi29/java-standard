package com.mdd.tugas;

import com.mdd.tugas.classes.PalindromLanguage;

import java.util.List;

public class NumberOne {

    public static void main(String[] args) {
        palindromText();
    }

    private static void palindromText() {
        var list = List.of("ibu ratna antar ubi",
                "kasur ini rusak",
                "A nut for a jar of tuna.",
                "Borrow or rob?",
                "Was it a car or a cat I saw?",
                "Yo, banana boy!",
                "UFO tofu?");


        var palindrom = PalindromLanguage.instance();
        list.stream().map(palindrom::get).forEach(System.out::println);
    }
}
