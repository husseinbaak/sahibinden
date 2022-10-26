package com.sahibinden.sahibinden.error;

import org.springframework.http.HttpStatus;

public class UserHand extends ExceptionBase {

    public UserHand(String message) {
        super(message);
    }

    @Override
    public HttpStatus getStatus() {
        return HttpStatus.NOT_FOUND;
    }
}
