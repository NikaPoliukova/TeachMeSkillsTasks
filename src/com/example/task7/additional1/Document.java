package com.example.task7.additional1;


import java.text.SimpleDateFormat;
import java.util.Date;


public abstract class Document {
    private int documentNumber;
    private Date dateDocument;

    public Document() {
        dateDocument = new Date();
    }

    public Document(int documentNumber, Date dateDocument) {
        this.documentNumber = documentNumber;
        this.dateDocument = dateDocument;
    }

    public int getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Date getDateDocument() {
        return dateDocument;
    }

    public void setDateDocument(Date dateDocument) {
        this.dateDocument = dateDocument;
    }

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy. -- H:kk");
        return "Date dateDocument = " + simpleDateFormat.format(getDateDocument()) + "\n" +
                "DocumentNumber = " + getDocumentNumber();
    }
}
