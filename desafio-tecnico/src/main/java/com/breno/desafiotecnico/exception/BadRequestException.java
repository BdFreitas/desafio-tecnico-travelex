package com.breno.desafiotecnico.exception;

public class BadRequestException extends RuntimeException{
    private String message;

    public BadRequestException(String message) {
        this.message = message;
    }

    public BadRequestException(String message, String message1) {
        super(message);
        this.message = message1;
    }

    public BadRequestException(String message, Throwable cause, String message1) {
        super(message, cause);
        this.message = message1;
    }

    public BadRequestException(Throwable cause, String message) {
        super(cause);
        this.message = message;
    }

    public BadRequestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String message1) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.message = message1;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
