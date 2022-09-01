package com.arquitectura.emergency.room.core.exception.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends ApiRestException {

    private static final String NOT_FOUND_ERROR_MESSAGE = "Resource not found";

    public NotFoundException() {
        this(NOT_FOUND_ERROR_MESSAGE);
    }

    public NotFoundException(String error) {
        super(HttpStatus.NOT_FOUND.value(), error);
    }

    public NotFoundException(String error, String url) {
        super(HttpStatus.NOT_FOUND.value(), error, url);
    }

}
