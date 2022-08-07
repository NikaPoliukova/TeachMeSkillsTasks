package com.example.task10.additional2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ServiceAdditional2 {
    public static void findMinSymbol(String line) {
        String text = line.replaceAll("\\p{Punct}", "");
        String[] words = text.split(" ");
        String wordMinCharVar = words[0];
        int sizeMinCharVar = new HashSet<>(Arrays.asList(words[0].split(""))).size();

        for (String word : words) {
            Set<String> set = new HashSet<>(Arrays.asList(word.split("")));
            if (set.size() < sizeMinCharVar) {
                wordMinCharVar = word;
                sizeMinCharVar = set.size();
            }
        }
        System.out.println(wordMinCharVar);
    }
}
