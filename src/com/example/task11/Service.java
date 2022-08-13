package com.example.task11;


import com.example.task11.Exceptions.Numbers555NotFoundException;
import com.example.task11.Exceptions.SequenceNotFoundException;
import com.example.task11.Exceptions.SymbolsABCNotFoundException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Service {

    public static void findABCInString(String numberDocument) throws SymbolsABCNotFoundException {
        Pattern pat = Pattern.compile(".*abc.*");
        Matcher matcher = pat.matcher(numberDocument.toLowerCase());
        if (matcher.matches()) {
            System.out.println("Нашел!");
        } else {
            throw new SymbolsABCNotFoundException("Номер документа не удовлетворяет условию, символы abc не найдены");
        }
    }
    public static void checkStartOfStringForNumber(String numberDocument) throws Numbers555NotFoundException {
        Pattern pattern2 = Pattern.compile("^555.*");
        Matcher matcher2 = pattern2.matcher(numberDocument);
        if (matcher2.matches()) {
            System.out.println("начинается!");
        } else {
            throw new Numbers555NotFoundException("Номер документа не удовлетворяет условию, последовательность цифр 555 не найдена");
        }
    }

    public static void checkEndOfLineCharacters(String numberDocument) throws SequenceNotFoundException {
        Pattern pattern3 = Pattern.compile(".*1a2b$");
        Matcher matcher3 = pattern3.matcher(numberDocument);
        if (matcher3.matches()) {
            System.out.println("содержит!");
        } else {
            throw new SequenceNotFoundException("Номер документа не удовлетворяет условию, " +
                    "последовательность символов 1a2b не найдена");
        }
    }


    public static void outputNumbers(String numberDocument) {
        Pattern patternNumbers = Pattern.compile("\\d{4}");
        Matcher m = patternNumbers.matcher(numberDocument);
        while (m.find()) {
            System.out.print((m.group()));
        }
    }

    public static void outputWithLetterSubstitution(String numberDocument) {
        System.out.println(numberDocument.replaceAll("([a-zA-Z]{3})", "***"));
    }

    public static void outputLettersInLowercase(String numberDocument) {
        System.out.println((numberDocument.replaceAll
                ("-?\\d{4}-?|-\\d|\\d", "/").substring(1)).toLowerCase());
    }

    public static void outputLettersInUpperCase(String numberDocument) {
        StringBuilder stringBuilder = new StringBuilder
                ((numberDocument.replaceAll("-?\\d{4}-?|-\\d|\\d", "/")).toUpperCase());
        System.out.println("Letters: " + stringBuilder);
    }
}



