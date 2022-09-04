package com.example.task16;

import java.util.ArrayList;
import java.util.List;

public class Document {
    List<String> numbersDocument = new ArrayList<>();
    String phoneNumber;
    String email;

    public Document() {
    }
    public List<String> getNumbersDocument() {
        return numbersDocument;
    }
    public void setNumbersDocument(List<String> numbersDocument) {
        this.numbersDocument = numbersDocument;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
