package com.example.task10.additional3;


import java.util.Scanner;

public class ServiceAdditional3 {
    public static void checkForPalindrome(String line) {
        String text = line.replaceAll("\\p{Punct}", "");
        String[] words = text.split(" ");
        Scanner scanner = new Scanner(System.in);
        int numberWord = scanner.nextInt();
        if (numberWord > 0 && numberWord <= words.length) {
            String word = words[(numberWord) - 1];
            if (word.equals(new StringBuilder(word).reverse().toString())) {
                System.out.println(" Слово под номером " + numberWord + " в строке является палиндромом : " + word);
            } else {
                System.out.println(" Слово под номером " + numberWord + " в строке не является палиндромом");
            }
        } else {
            System.out.println("Введенное число выходит за пределы количества слов в строке");
        }
    }
}
