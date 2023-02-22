package com.practise.service.impl;

import com.practise.payloads.UnitConversionRequestType;
import com.practise.service.UnitConversionService;
import org.springframework.stereotype.Service;

@Service
public class UnitConversionServiceImpl implements UnitConversionService {

    @Override
    public double unitConversionForTemperatures(UnitConversionRequestType unitConversionRequestType) {
        double teacherInput = unitConversionRequestType.getTeacherInput();
        String teacherUnit = unitConversionRequestType.getTeacherUnit();
        String studentUnit = unitConversionRequestType.getStudentUnit();
        double convertedValue = 0.0;
        if (teacherUnit.equalsIgnoreCase( "Kelvin")) {
            if (studentUnit.equalsIgnoreCase( "Celsius")) {
                convertedValue = (teacherInput - 273.15) * 10 / 10;
            } else if (studentUnit.equalsIgnoreCase( "Fahrenheit")) {
                convertedValue = (((teacherInput - 273.15) * 9/5 + 32) * 10) / 10;
            } else if (studentUnit.equalsIgnoreCase( "Rankine")) {
                convertedValue = ((teacherInput * 1.8) * 10) / 10;
            }
        } else if (teacherUnit.equalsIgnoreCase("Celsius")) {
            if (studentUnit.equalsIgnoreCase( "Kelvin")) {
                convertedValue = ((teacherInput + 273.15) * 10) / 10;
            } else if (studentUnit.equalsIgnoreCase( "Fahrenheit")) {
                convertedValue = (((teacherInput *  9/5) + 32) * 10) / 10;
            } else if (studentUnit.equalsIgnoreCase( "Rankine")) {
                convertedValue = ((teacherInput *  9/5 + 491.67) * 10) / 10;
            }
        } else if (teacherUnit.equalsIgnoreCase("Fahrenheit")) {
            if (studentUnit.equalsIgnoreCase( "Kelvin")) {
                convertedValue = ( ((teacherInput - 32) * 5/9 + 273.15) * 10 ) / 10;
            } else if (studentUnit.equalsIgnoreCase( "Celsius")) {
                convertedValue = (((teacherInput - 32) * 5/9) * 10) / 10;
            } else if (studentUnit.equalsIgnoreCase( "Rankine")) {
                convertedValue = ((teacherInput + 459.67) * 10) / 10;
            }
        } else if (teacherUnit.equalsIgnoreCase("Rankine")) {
            if (studentUnit.equalsIgnoreCase( "Kelvin")) {
                convertedValue = ((teacherInput * 5/9) * 10) / 10;
            } else if (studentUnit.equalsIgnoreCase( "Celsius")) {
                convertedValue = (((teacherInput -  491.67) * 5/9) * 10) / 10;
            } else if (studentUnit.equalsIgnoreCase( "Fahrenheit")) {
                convertedValue = ((teacherInput - 459.67) * 10) / 10;
            }
        }
        return convertedValue;
    }

    @Override
    public double unitConversionForVolumes(UnitConversionRequestType unitConversionRequestType) {
        double teacherInput = unitConversionRequestType.getTeacherInput();
        String teacherUnit = unitConversionRequestType.getTeacherUnit();
        String studentUnit = unitConversionRequestType.getStudentUnit();
        double convertedValue = 0;
        if (teacherUnit.equalsIgnoreCase( "Liters")) {
            if (studentUnit.equalsIgnoreCase("Tablespoons")) {
                convertedValue = (teacherInput * 67.628  *  10) / 10;
            } else if (studentUnit.equalsIgnoreCase("Cubic-Inches")) {
                convertedValue = (teacherInput * 61.024  *  10) / 10;
            } else if (studentUnit.equalsIgnoreCase("Cups")) {
                convertedValue = (teacherInput * 4.167  *  10) / 10;
            } else if (studentUnit.equalsIgnoreCase("Cubic-Feet")) {
                convertedValue = (teacherInput / 28.317  *  10) / 10;
            } else if (studentUnit.equalsIgnoreCase("Gallons")) {
                convertedValue = (teacherInput / 3.785  *  10) / 10;
            }
        } else if (teacherUnit.equalsIgnoreCase("Tablespoons")) {
            if (studentUnit.equalsIgnoreCase("Liters")) {
                convertedValue = (teacherInput / 67.628  *  10) / 10;
            } else if (studentUnit.equalsIgnoreCase("Cubic-Inches")) {
                convertedValue = (teacherInput / 1.108  *  10) / 10;
            } else if (studentUnit.equalsIgnoreCase("Cups")) {
                convertedValue = (teacherInput / 16.231  *  10) / 10;
            } else if (studentUnit.equalsIgnoreCase("Cubic-Feet")) {
                convertedValue = (teacherInput / 1915  *  10) / 10;
            } else if (studentUnit.equalsIgnoreCase("Gallons")) {
                convertedValue = (teacherInput / 256  *  10) / 10;
            }
        } else if (teacherUnit.equalsIgnoreCase("Cubic-Inches")) {
            if (studentUnit.equalsIgnoreCase("Liters")) {
                convertedValue = (teacherInput / 61.024  *  10) / 10;
            } else if (studentUnit.equalsIgnoreCase("Tablespoons")) {
                convertedValue = (teacherInput * 3.325  *  10) / 10;
            } else if (studentUnit.equalsIgnoreCase("Cups")) {
                convertedValue = (teacherInput / 14.646  *  10) / 10;
            } else if (studentUnit.equalsIgnoreCase("Cubic-Feet")) {
                convertedValue = (teacherInput / 1728  *  10) / 10;
            } else if (studentUnit.equalsIgnoreCase("Gallons")) {
                convertedValue = (teacherInput / 231  *  10) / 10;
            }
        } else if (teacherUnit.equalsIgnoreCase("Cups")) {
            if (studentUnit.equalsIgnoreCase("Liters")) {
                convertedValue = (teacherInput / 4.167  *  10) / 10;
            } else if (studentUnit.equalsIgnoreCase("Tablespoons")) {
                convertedValue = (teacherInput * 16.231  *  10) / 10;
            } else if (studentUnit.equalsIgnoreCase("Cubic-Inches")) {
                convertedValue = (teacherInput * 14.646  *  10) / 10;
            } else if (studentUnit.equalsIgnoreCase("Cubic-Feet")) {
                convertedValue = (teacherInput / 118  *  10) / 10;
            } else if (studentUnit.equalsIgnoreCase("Gallons")) {
                convertedValue = (teacherInput / 15.773  *  10) / 10;
            }
        } else if (teacherUnit.equalsIgnoreCase("Cubic-Feet")) {
            if (studentUnit.equalsIgnoreCase("Liters")) {
                convertedValue = (teacherInput * 28.317  *  10) / 10;
            } else if (studentUnit.equalsIgnoreCase("Tablespoons")) {
                convertedValue = (teacherInput * 1915  *  10) / 10;
            } else if (studentUnit.equalsIgnoreCase("Cups")) {
                convertedValue = (teacherInput * 118  *  10) / 10;
            } else if (studentUnit.equalsIgnoreCase("Cubic-Inches")) {
                convertedValue = (teacherInput * 1728  *  10) / 10;
            } else if (studentUnit.equalsIgnoreCase("Gallons")) {
                convertedValue = (teacherInput * 7.481  *  10) / 10;
            }
        } else if (teacherUnit.equalsIgnoreCase("gallon")) {
            if (studentUnit.equalsIgnoreCase("Liters")) {
                convertedValue = (teacherInput * 3.785  *  10) / 10;
            } else if (studentUnit.equalsIgnoreCase("Tablespoons")) {
                convertedValue = (teacherInput * 768  *  10) / 10;
            } else if (studentUnit.equalsIgnoreCase("Cups")) {
                convertedValue = (teacherInput * 15.773  *  10) / 10;
            } else if (studentUnit.equalsIgnoreCase("Cubic-Feet")) {
                convertedValue = (teacherInput / 7.481  *  10) / 10;
            } else if (studentUnit.equalsIgnoreCase("Cubic-Inches")) {
                convertedValue = (teacherInput / 231  *  10) / 10;
            }
        }
        return convertedValue;
    }
}
