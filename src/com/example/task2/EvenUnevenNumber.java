package com.example.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class EvenUnevenNumber {
    public static void checkToEvenNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (!((line = reader.readLine()).equals("exit"))) {
            int number = Integer.parseInt(line);
            if (number % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Uneven number");
            }
        }
    }
}
