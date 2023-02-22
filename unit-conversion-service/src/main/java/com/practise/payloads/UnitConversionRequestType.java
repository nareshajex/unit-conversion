package com.practise.payloads;

import lombok.Data;

@Data
public class UnitConversionRequestType{

    private double teacherInput;
    private double studentInput;
    private String teacherUnit;
    private String studentUnit;
}
