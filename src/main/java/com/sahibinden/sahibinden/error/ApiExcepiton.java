package com.sahibinden.sahibinden.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;
@ControllerAdvice
public class ApiExcepiton extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ExceptionBase.class)
    public ResponseEntity<Object> getException(ExceptionBase ex, WebRequest request){
        ErrorDetails details=new ErrorDetails(ex.getMessage(),
                                                request.getDescription(false));
//        return new ResponseEntity<>(details,ex.getStatus());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(details);
    }
}
