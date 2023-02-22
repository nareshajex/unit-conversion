import { Component, OnInit } from "@angular/core";
import { FormBuilder, Validators } from "@angular/forms";
import { UnitConversionService } from "src/app/services/unit-conversion.service";
import { UnitConversion } from "src/app/_models/unit-conversion";


@Component({ templateUrl: 'temperatures.component.html',
             styleUrls: ['/temperatures.component.scss']
})
export class TemperaturesComponent implements OnInit {

    teacherInput = 0;
    studentInput = 0;
    teacherUnit = '';
    studentUnit = '';
    result = '';
    converetedResult = 0;

    temperatues: any;
    errorMessage = '';

    temperatureUnits = ['Kelvin', 'Celsius', 'Fahrenheit', 'Rankine'];

    constructor(public fb: FormBuilder, public unitConversionService: UnitConversionService){

    }

    ngOnInit(): void {
        this.temperatues = this.fb.group({
            teacherInputName: ['0', [Validators.required]],
            teacherUnitName: ["", [Validators.required]],
            studentInputName: ['0', [Validators.required]],
            studentUnitName: ["", [Validators.required]]
          })
    }

    handleConversion = () => {
      this.errorMessage = '';
        this.teacherUnit = this.temperatues.controls.teacherUnitName.value;
        this.studentUnit = this.temperatues.controls.studentUnitName.value;
      
        let requestPayload: UnitConversion = {
          teacherInput: this.teacherInput,
          studentInput: this.studentInput,
          teacherUnit: this.teacherUnit,
          studentUnit: this.studentUnit
        }

        this.unitConversionService.calculateTemperatureUnitConversion(requestPayload).subscribe((response: UnitConversion) => {
          this.result = response.calculatedValue === this.studentInput ? "Correct" : "Incorrect";
          this.converetedResult = response.calculatedValue;
        }, error => {
          this.errorMessage = error.errorMessage;
        });

    }
}