package com.example.task11.additional.Exceptions;

public class WrongLoginException extends  Exception{

    public WrongLoginException(String message) {
        super(message);
    }

    public WrongLoginException() {
    }
}
