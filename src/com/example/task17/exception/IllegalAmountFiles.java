package com.example.task17.exception;

public class IllegalAmountFiles extends RuntimeException {
    public IllegalAmountFiles() {
        super();
    }

    public IllegalAmountFiles(String message) {
        super(message);
    }

    public IllegalAmountFiles(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalAmountFiles(Throwable cause) {
        super(cause);
    }
}
