package com.example.cms.api;

import com.example.cms.exception.AplicationError;
import com.example.cms.exception.CustomerNotFoundException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * Created by Smart on 24.06.2020.
 */
@ControllerAdvice
@RestController
public class ErrorHandler extends ResponseEntityExceptionHandler{

    @Value("${api_doc_url}")
    private String details;

    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<AplicationError> handleCustomerNotFoundException(CustomerNotFoundException exception, WebRequest webRequest) {

        AplicationError error = new AplicationError();
        error.setCode(101);
        error.setMessage(exception.getMessage());
        error.setDetails(details);

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
