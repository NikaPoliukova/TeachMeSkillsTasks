package com.example.task11.additional;

import com.example.task11.additional.Exceptions.WrongLoginException;
import com.example.task11.additional.Exceptions.WrongPasswordException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InformationAboutPersonService {
    public static boolean validateInputParams(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        if (login == null || password == null || confirmPassword == null) {
            throw new NullPointerException("Одно из значений равно null");
        }
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Login не соответствует заданным требованиям");
        }
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern .matcher(password);
        if (password.length() >= 20 || password.contains(" ") || !(password.equals(confirmPassword))
                || (!(matcher.find()))) {
            throw new WrongPasswordException("Password не соответствует заданным требованиям");
        } else {
            System.out.println("Everything ok");
        }
        return true;
    }
}
