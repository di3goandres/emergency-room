package com.arquitectura.emergency.room.core.exception;

/**
 * Base Business Exception.
 */
public class ApiException extends Exception {
    private static final long serialVersionUID = 8632519550810310049L;

    private final String code;

    private final String description;

    private final Integer statusCode;

    /**
     * Creates a new instance, with provided fields.
     *
     * @param code        API error code.
     * @param description API error description.
     * @param statusCode  API error HTTP Status code.
     */
    public ApiException(String code, String description, Integer statusCode) {
        super(description);
        this.code = code;
        this.description = description;
        this.statusCode = statusCode;
    }

    /**
     * Creates a new instance, with provided fields.
     *
     * @param code        API error code.
     * @param description API error description.
     * @param statusCode  API error HTTP Status code.
     * @param cause       API error cause.
     */
    public ApiException(String code, String description, Integer statusCode, Throwable cause) {
        super(description, cause);
        this.code = code;
        this.description = description;
        this.statusCode = statusCode;
    }

    /**
     * @return API error code.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return API error description.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return API error HTTP Status code.
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }
}
