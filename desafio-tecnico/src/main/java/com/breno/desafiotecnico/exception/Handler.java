package com.breno.desafiotecnico.exception;

import com.breno.desafiotecnico.dto.ExceptionResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.http.HttpStatus.*;

@ControllerAdvice
public class Handler {
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity badRequestExceptionHandler(BadRequestException e, HttpServletRequest request) {
        return ResponseEntity.status(BAD_REQUEST)
                .body(new ExceptionResponseDto(BAD_REQUEST.value(), e.getMessage(), request.getServletPath()));
    }
}
