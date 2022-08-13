package com.example.task12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        final int DOCUMENT_LENGTH = 15;
        String fileName;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        fileName = reader.readLine();
        reader.close();
        File file = new File(fileName);
        String documentNumber;
        BufferedReader fileReader = new BufferedReader(new FileReader(file));
        while (fileReader.ready()) {
            documentNumber = fileReader.readLine();

            if (documentNumber.length() == DOCUMENT_LENGTH && documentNumber.startsWith("docnum") ||
                    documentNumber.startsWith("contract")) {
                System.out.println("Document is valid");
            } else {
                System.out.println("Document is not valid");
            }
        }
        fileReader.close();
    }
}