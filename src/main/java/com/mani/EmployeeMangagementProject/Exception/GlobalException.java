package com.mani.EmployeeMangagementProject.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
@ExceptionHandler(IdNotFoundException.class)
    public ResponseEntity<String> IdNotFound(IdNotFoundException ie){
    return new ResponseEntity<>(ie.getMessage(),HttpStatus.BAD_REQUEST);
}

}
