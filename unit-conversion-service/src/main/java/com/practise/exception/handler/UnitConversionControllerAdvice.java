package com.practise.exception.handler;

import com.practise.exception.UnitConversionValidationException;
import com.practise.payloads.UnitConversionResponseType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class UnitConversionControllerAdvice {

    @ExceptionHandler(UnitConversionValidationException.class)
    public ResponseEntity<UnitConversionResponseType> handleValidationException(UnitConversionValidationException exception){
        log.error("Exception Occurred: ", exception);
        UnitConversionResponseType response = new UnitConversionResponseType();
        response.setStatus("FAILURE");
        response.setMessage(exception.getErrorMessage());
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<UnitConversionResponseType> handleApplicationException(Throwable exception){
        log.error("Exception Occurred: ", exception);
        UnitConversionResponseType response = new UnitConversionResponseType();
        response.setStatus("FAILURE");
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
