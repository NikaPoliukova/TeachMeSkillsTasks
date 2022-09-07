package com.example.task17.exception;

public class EmptyFolderException extends RuntimeException {
    public EmptyFolderException() {
        super();
    }

    public EmptyFolderException(String message) {
        super(message);
    }

    public EmptyFolderException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyFolderException(Throwable cause) {
        super(cause);
    }
}
