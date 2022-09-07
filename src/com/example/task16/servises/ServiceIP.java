package com.example.task16.servises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ServiceIP {
    public static void validationIP(String ip) {
        Pattern pattern = Pattern.compile("\\d{1,4}.\\d{1,4}.\\d{1,4}.\\d{1,4}.");
        Matcher matcher = pattern.matcher(ip);
        if (matcher.matches()) {
            System.out.println(ip);
        } else {
            System.out.println("не корректный");
        }
    }
}
