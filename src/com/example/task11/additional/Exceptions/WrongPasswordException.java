package com.example.task11.additional.Exceptions;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(String message) {
        super(message);
    }

    public WrongPasswordException() {
    }
}
