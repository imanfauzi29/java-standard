package com.mdd.tugas;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberFive {

    public static void main(String[] args) {
        convertCSV();
    }

    public static void convertCSV() {
        try {
            Stream<String> stream = Files.lines(Paths.get("src/com/mdd/tugas/file.csv"));
            var str = stream.skip(1)
                    .map(data -> data.split(","))
                    .map(NumberFive::apply).collect(Collectors.toList());

            makeJSON(str.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void makeJSON(String s) {
        try {
            var file = "src/com/mdd/tugas/result.json";
            FileOutputStream out = new FileOutputStream(file);
            out.write(s.getBytes());
            System.out.println("success saved in " + file);

        }catch (Exception e) {
            e.getMessage();
        }
    }

    private static Object apply(String[] d) {

        return String.format("{\"name\": \"%s\",\"category\":\"%s\",\"price\":%s}", d[0], d[1], d[2]);

    }
}
