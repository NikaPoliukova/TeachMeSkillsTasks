package com.example.task11;


import com.example.task11.Exceptions.NumberNotFoundException;
import com.example.task11.Exceptions.SequenceNotFoundException;
import com.example.task11.Exceptions.SymbolNotFoundException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Service {

    public static boolean findRegularExpression(String document, String regex) {
        Pattern pat = Pattern.compile(regex);
        Matcher matcher = pat.matcher(document.toLowerCase());
        return matcher.matches();
    }

    public static void findABCInString(String document) throws SymbolNotFoundException {
        if (findRegularExpression(document, ".*abc.*")) {
            System.out.println("�����!");
        } else {
            throw new SymbolNotFoundException("����� ��������� �� ������������� �������, ������� abc �� �������");
        }
    }

    public static void checkStartOfStringForNumber(String document) throws NumberNotFoundException {
        if (findRegularExpression(document, "^555.*")) {
            System.out.println("����������!");
        } else {
            throw new NumberNotFoundException("����� ��������� �� ������������� �������, ������������������ " +
                    "���� 555 �� �������");
        }
    }

    public static void checkEndOfLineCharacters(String document) throws SequenceNotFoundException {
        if (findRegularExpression(document, ".*1a2b$")) {
            System.out.println("��������!");
        } else {
            throw new SequenceNotFoundException("����� ��������� �� ������������� �������, " +
                    "������������������ �������� 1a2b �� �������");
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



