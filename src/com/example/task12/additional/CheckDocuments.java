package com.example.task12.additional;

import java.io.*;


public class CheckDocuments {
    public static void main(String[] args) throws IOException {
        File fileValid = new File("documentValid.txt");
        File fileIsNotValid = new File("documentIsNotValid.txt");

        FileWriter writerValid = new FileWriter(fileValid);
        FileWriter writerIsNotValid = new FileWriter(fileIsNotValid);

        String documentNumber;
        BufferedReader fileReader = new BufferedReader(new FileReader("nika.txt"));
        while (fileReader.ready()) {
            documentNumber = fileReader.readLine();
            if (documentNumber.length() == 15 && documentNumber.startsWith("docnum") ||
                    documentNumber.startsWith("contract")) {
                writerValid.write(documentNumber + "\n");
            } else {
                if (documentNumber.length() != 15) {
                    writerIsNotValid.write(documentNumber + " length document is not valid" +"\n");
                }
                else {
                    writerIsNotValid.write(documentNumber + " document is not start with docnum or contract" + "\n");
                }
            }
        }
        fileReader.close();
        writerValid.close();
        writerIsNotValid.close();
        String line;
        System.out.println("первый документ");
        BufferedReader newDocValidate = new BufferedReader(new FileReader("documentValid.txt"));
        while (newDocValidate.ready()){
            System.out.println(line= newDocValidate.readLine());
        }newDocValidate.close();
        String line2;
        System.out.println("второй документ");
        BufferedReader newDocIsNotValidate= new BufferedReader(new FileReader("documentIsNotValid.txt"));
        while (newDocIsNotValidate.ready()){
            System.out.println(line2= newDocIsNotValidate.readLine());
        }newDocIsNotValidate.close();
    }
}