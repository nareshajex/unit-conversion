package com.practise.payloads;

import lombok.Data;

@Data
public class UnitConversionResponseType {

    private double teacherInput;
    private double studentInput;
    private String teacherUnit;
    private String studentUnit;
    private double calculatedValue;
    private String status;
    private String message;
}
