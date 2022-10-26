package com.sahibinden.sahibinden.error;

import org.springframework.http.HttpStatus;

public class ExceptionNotFound extends ExceptionBase{
    public ExceptionNotFound(String message) {
        super(message);
    }

    @Override
    public HttpStatus getStatus() {
        return HttpStatus.NOT_FOUND;
    }
}
