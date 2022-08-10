package com.example.task10.additional1;

import java.util.Collections;

public class ServiceAdditional1 {
    public static void findMaxAndMinWord(String line) {
        String text = line.replaceAll("\\p{Punct}", "");
        String theBiggestWord = new String();
        String[] words = text.split(" ");
        String theSmallestWord = new String(words[0]);
        for (int i = 0; i < words.length; i++) {
            if (theBiggestWord.length() <= words[i].length()) {
                theBiggestWord = words[i];
            }
        }
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() <= theSmallestWord.length()) {
                theSmallestWord = words[i];
            }
        }
        System.out.println("самое маленькое слово : " + theSmallestWord);
        System.out.println("самое большое слово : " + theBiggestWord);
    }
}
