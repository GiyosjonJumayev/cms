package com.example.cms.exception;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Smart on 23.06.2020.
 */
//
//@ResponseStatus(HttpStatus.NOT_FOUND)
public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException(String message) {
        super(message);
    }
}
