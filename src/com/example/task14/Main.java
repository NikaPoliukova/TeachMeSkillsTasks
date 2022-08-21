package com.example.task14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String date = reader.readLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy, MM, dd");
        LocalDate localDate = LocalDate.parse(date, formatter);
        String dayOfWeek = String.valueOf(localDate.getDayOfWeek());
        System.out.println(date + " -corresponds to the day of the week - " + dayOfWeek);

        if (dayOfWeek.equals("TUESDAY")) {
            localDate = localDate.plusWeeks(1);
        } else {
            while (!(dayOfWeek.equals("TUESDAY"))) {
                localDate = localDate.plusDays(1);
                dayOfWeek = String.valueOf(localDate.getDayOfWeek());
            }
        }
        System.out.println("next tuesday will be -" + localDate);
    }
}
