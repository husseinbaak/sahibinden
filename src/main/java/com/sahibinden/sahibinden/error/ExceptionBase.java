package com.sahibinden.sahibinden.error;

import org.springframework.http.HttpStatus;

public abstract class ExceptionBase extends RuntimeException{
    public ExceptionBase(String message) {
        super(message);
    }
    public  abstract HttpStatus getStatus();
}
