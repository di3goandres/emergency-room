package com.arquitectura.emergency.room.core.exception.base;



public class BaseLoggedException extends Exception {

    public BaseLoggedException(String message) {
        super(message);
    }

    public BaseLoggedException(String message, Exception ex) {
        super(message, ex);
    }

    public BaseLoggedException(String message, Throwable cause) {
        super(message, cause);
    }

}
