package com.nie.csd.exception;

public class IdNotPresentException {
    private String message;

    public IdNotPresentException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
