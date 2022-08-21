package com.example.task13;


import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        List<String> files = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter file path ");
        String filePath;
        String fileName;
        while (!(filePath = reader.readLine()).equals("0")) {
            System.out.println("Enter file name");
            fileName = reader.readLine();
            String fullFileName = filePath + "\\" + fileName;
            files.add(fullFileName);
            System.out.println("Enter file path");
        }
        System.out.println("Input finished");
        reader.close();
        Map<String, String> documents = new HashMap<>();
        Set<String> setList = new HashSet<>();

        final String VALIDATE_IS_GOOD = "Document is validate";
        final String MISTAKE_LENGTH = " length document is not valid";
        final String MISTAKE_START_DOCUMENT = "document is not start with 'docum' or 'contract'";
        final int DOCUMENT_LENGTH = 15;
        for (String file : files) {
            File f = new File(file);
            BufferedReader fileReader = new BufferedReader(new FileReader(f));
            while (fileReader.ready()) {
                setList.add(fileReader.readLine());
            }
            for (String document : setList) {
                if (document.length() == DOCUMENT_LENGTH && document.startsWith("docnum") ||
                        document.startsWith("contract")) {
                    documents.put(document, VALIDATE_IS_GOOD);
                } else {
                    if (document.length() != DOCUMENT_LENGTH) {
                        documents.put(document, MISTAKE_LENGTH);
                    } else {
                        documents.put(document, MISTAKE_START_DOCUMENT);
                    }
                }
            }
            fileReader.close();
        }
        File file = new File("D:\\project\\TeachMeSkillsTasks\\TeachMeSkillsTasks\\finalReport.txt");
        FileWriter fileWriter = new FileWriter(file);

        for (Map.Entry<String, String> entry : documents.entrySet()) {
            fileWriter.write(entry.getKey() + " - " + entry.getValue() + "\n");
        }
        fileWriter.close();
    }
}


