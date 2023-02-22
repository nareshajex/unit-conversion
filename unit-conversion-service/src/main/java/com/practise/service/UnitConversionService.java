package com.practise.service;

import com.practise.payloads.UnitConversionRequestType;
import com.practise.payloads.UnitConversionResponseType;

public interface UnitConversionService {

    double unitConversionForTemperatures(UnitConversionRequestType unitConversionRequestType);

    double unitConversionForVolumes(UnitConversionRequestType unitConversionRequestType);


}
