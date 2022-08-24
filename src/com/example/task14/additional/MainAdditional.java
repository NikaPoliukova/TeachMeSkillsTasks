package com.example.task14.additional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainAdditional {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        ServiceForFunctionalInterface ob = new ServiceForFunctionalInterface();
        Interface inter = ob.method(number);
        try {
            System.out.println(inter.getValue("4"));
        } catch (Exception e) {
            System.out.println("Exception! Incorrect input value");
        }
    }
}