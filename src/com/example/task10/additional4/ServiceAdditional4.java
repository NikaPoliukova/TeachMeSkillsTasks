package com.example.task10.additional4;


public class ServiceAdditional4 {
    public static void enterEachDuplicatedLetter(String line) {
        String text = line.replaceAll("\\p{Punct}", "");
        char[] letters = text.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (Character letter : letters) {
            stringBuilder.append(letter).append(letter);
        }
        System.out.println(stringBuilder);
    }
}