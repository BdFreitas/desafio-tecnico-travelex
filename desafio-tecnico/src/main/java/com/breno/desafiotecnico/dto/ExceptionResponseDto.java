package com.breno.desafiotecnico.dto;

public class ExceptionResponseDto {
    private int httpCode;
    private String message;

    private String path;

    public ExceptionResponseDto(int httpCode, String message, String path) {
        this.httpCode = httpCode;
        this.message = message;
        this.path = path;
    }

    public int getHttpCode() {
        return httpCode;
    }

    public String getMessage() {
        return message;
    }

    public String getPath() {
        return path;
    }
}
