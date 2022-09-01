package com.arquitectura.emergency.room.core.exception.rest;


import com.arquitectura.emergency.room.core.exception.base.BaseLoggedException;

public class ApiRestException extends BaseLoggedException {
    private final int statusCode;
    private final String url;
    private String responseError;

    public ApiRestException(int statusCode, String responseError) {
        this(responseError, statusCode, responseError, null);
    }

    public ApiRestException(int statusCode, String responseError, String url) {
        this(responseError, statusCode, responseError, url);
    }

    public ApiRestException(String message, int statusCode, String responseError, String url) {
        this(message, new Throwable(), statusCode, responseError, url);
    }

    public ApiRestException(String message, Throwable cause, int statusCode, String responseError, String url) {
        super(message, cause);
        this.statusCode = statusCode;
        this.url = url;
        this.responseError = responseError;
    }

    public ApiRestException(String message, Throwable cause, int statusCode, String url) {
        super(message, cause);
        this.statusCode = statusCode;
        this.url = url;
    }

    public ApiRestException(String responseError, String message, int statusCode, Throwable cause) {
        this(message, cause, statusCode, responseError, null);
    }

    public ApiRestException(String responseError, String message, int statusCode) {
        this(message, statusCode, responseError, null);
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getUrl() {
        return url;
    }

    public String getErrorMessage() {
        return this.responseError;
    }

}
