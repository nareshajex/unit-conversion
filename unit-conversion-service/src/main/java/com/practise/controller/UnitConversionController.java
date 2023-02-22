package com.practise.controller;

import com.practise.payloads.UnitConversionRequestType;
import com.practise.payloads.UnitConversionResponseType;
import com.practise.service.UnitConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@CrossOrigin("*")
@RequestMapping("/unit-conversion")
@RestController
public class UnitConversionController {

    @Autowired
    private UnitConversionService unitConversionService;

    @PostMapping(value = "/temperatures/conversion")
    public ResponseEntity<UnitConversionResponseType> unitConversionForTemperature(@RequestBody UnitConversionRequestType unitConversionRequestType){
        validateRequest(unitConversionRequestType);
        double calculatedValue = unitConversionService.unitConversionForTemperatures(unitConversionRequestType);
        return ResponseEntity.ok(convert(unitConversionRequestType, calculatedValue));
    }

    @PostMapping(value = "/volumes/conversion")
    public ResponseEntity<UnitConversionResponseType> unitConversionForVolumes(@RequestBody UnitConversionRequestType unitConversionRequestType){
        validateRequest(unitConversionRequestType);
        double calculatedValue = unitConversionService.unitConversionForVolumes(unitConversionRequestType);
        return ResponseEntity.ok(convert(unitConversionRequestType, calculatedValue));
    }


    private void validateRequest(UnitConversionRequestType unitConversionRequestType){
        List<String> temperatureUnits = Arrays.asList("Kelvin", "Celsius", "Fahrenheit", "Rankine");
        if(unitConversionRequestType != null){
            if(!temperatureUnits.contains(unitConversionRequestType.getTeacherUnit())){

            }

            if(!temperatureUnits.contains(unitConversionRequestType.getStudentUnit())){

            }
        }
    }

    private UnitConversionResponseType convert(UnitConversionRequestType unitConversionRequestType, double calculatedValue){
        UnitConversionResponseType unitConversionResponseType = new UnitConversionResponseType();
        unitConversionResponseType.setTeacherUnit(unitConversionRequestType.getTeacherUnit());
        unitConversionResponseType.setTeacherInput(unitConversionRequestType.getTeacherInput());
        unitConversionResponseType.setStudentUnit(unitConversionRequestType.getStudentUnit());
        unitConversionResponseType.setStudentInput(unitConversionRequestType.getStudentInput());
        unitConversionResponseType.setCalculatedValue(calculatedValue);
        return unitConversionResponseType;
    }

}
