package com.example.task16.servises;

import com.example.task16.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.example.task16.servises.Utils.findFiles;

public class DocumentService {
    private static final Pattern PATTERN_NUMBER_DOCUMENT =
            Pattern.compile("\\d{4}-\\D{3}-\\d{4}-\\D{3}-\\d\\D\\d\\D");
    private static final Pattern PATTERN_NUMBER_PHONE = Pattern.compile("\\+\\(\\d{2}\\)\\d{7}");

    public static boolean isValidDocumentNumber(final String docNumber) {
        Matcher matcherNumber = PATTERN_NUMBER_DOCUMENT.matcher(docNumber);
        return matcherNumber.find();
    }

    public static boolean isValidPhoneNumber(final String phoneNumber) {
        Matcher matcherNumber = PATTERN_NUMBER_PHONE.matcher(phoneNumber);
        return matcherNumber.find();
    }

    public List<String> takeFilesFromDisk(String folderPath, String fileExtension, int amount) {
        List<String> source = findFiles(folderPath, fileExtension);

        List<String> destination;
        if (source.size() < amount) {
            destination = new ArrayList<>(source);
        } else {
            destination = source.subList(0, amount);
        }
        return destination;
    }

    public String takeDocumentName(String fileNameWithExtension) {
        String[] fileNameWithoutExtension = fileNameWithExtension.split("\\.");
        return fileNameWithoutExtension[0];
    }

    public void setDocumentNames(Document doc, String docName) {
        List<String> name = doc.getNumbersDocument(); //получаем имя из док
        name.add(docName); //изменяем лист с номерами документов
        doc.setNumbersDocument(name);
    }

    public void checkDocumentParams(Document doc, String param) {
        if (isValidDocumentNumber(param)) {
            setDocumentNames(doc, param);
        }
        if (isValidPhoneNumber(param)) {
            doc.setPhoneNumber(param);
        } else if (param.contains("@")) {
            doc.setEmail(param);
        }
    }

    public void fillDocumentParams(Document doc, List<String> lines) {
        for (String line : lines) {
            List<String> splitWords = List.of(line.split(" "));
            for (String word : splitWords) {
                checkDocumentParams(doc, word);
            }
        }
    }
}
