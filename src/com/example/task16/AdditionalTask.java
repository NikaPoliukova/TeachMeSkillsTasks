package com.example.task16;


import com.example.task16.servises.DocumentService;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class AdditionalTask {
    final static String FILE_EXTENSION = ".txt";

    public static void main(String[] args) throws IOException {
        DocumentService documentService = new DocumentService();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countNotValidDoc = 0;

        System.out.println("Enter path file");
        String folderPath = reader.readLine();
        System.out.println("Enter count documents");
        int amount = Integer.parseInt(reader.readLine());
        List<String> files = documentService.takeFilesFromDisk(folderPath, FILE_EXTENSION, amount);

        Map<String, Document> documents = new HashMap<>();
        for (String fileName : files) {
            Path path = Paths.get(folderPath + "\\" + fileName);
            List<String> allStringInFile = Files.readAllLines(path);//читаем все строчки в файле

            Document doc = new Document();
            String nameDocument = documentService.takeDocumentName(fileName);
            documentService.fillDocumentParams(doc, allStringInFile);

            if (doc.getNumbersDocument().isEmpty()) {
                countNotValidDoc++;
            } else {
                documents.put(nameDocument, doc);
            }
        }
        System.out.println("Count doc is Not Valid = " + countNotValidDoc);
        System.out.println("Count doc is  Valid = " + documents.size());
    }
}

