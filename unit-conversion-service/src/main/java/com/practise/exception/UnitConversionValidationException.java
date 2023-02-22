package com.practise.exception;

public class UnitConversionValidationException extends RuntimeException{

    private String errorMessage;

    public UnitConversionValidationException(String errorMessage){
        super(errorMessage);
        this.errorMessage = errorMessage;
    }

    public UnitConversionValidationException(Throwable throwable){
        super(throwable);
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
