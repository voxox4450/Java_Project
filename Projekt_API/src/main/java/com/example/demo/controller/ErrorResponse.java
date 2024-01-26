package com.example.demo.controller;

import org.springframework.validation.ObjectError;

import java.util.List;

public class ErrorResponse {
    private final String message;
    private final List<ObjectError> errors;

    public ErrorResponse(String message, List<ObjectError> errors) {
        this.message = message;
        this.errors = errors;
    }

    public String getMessage() {
        return message;
    }

    public List<ObjectError> getErrors() {
        return errors;
    }
}
