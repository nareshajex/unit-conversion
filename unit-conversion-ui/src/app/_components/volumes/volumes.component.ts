import { Component, OnInit } from "@angular/core";
import { FormBuilder, Validators } from "@angular/forms";
import { UnitConversionService } from "src/app/services/unit-conversion.service";
import { UnitConversion } from "src/app/_models/unit-conversion";


@Component({ templateUrl: 'volumes.component.html',
             styleUrls: ['/volumes.component.scss']
})
export class VolumesComponent implements OnInit {

    teacherInput = 0;
    studentInput = 0;
    teacherUnit = '';
    studentUnit = '';
    result = '';
    converetedResult = 0;

    volumes: any;
    errorMessage = '';

    volumeUnits = ['Liters', 'Tablespoons', 'Cubic-Inches', 'Cups', 'Cubic-Feet', 'Gallons'];

    constructor(public fb: FormBuilder, public unitConversionService: UnitConversionService){

    }

    ngOnInit(): void {
        this.volumes = this.fb.group({
            teacherInputName: ['0', [Validators.required]],
            teacherUnitName: ["", [Validators.required]],
            studentInputName: ['0', [Validators.required]],
            studentUnitName: ["", [Validators.required]]
          })
    }

    handleConversion = () => {
        this.errorMessage = '';
        this.teacherUnit = this.volumes.controls.teacherUnitName.value;
        this.studentUnit = this.volumes.controls.studentUnitName.value;
        let requestPayload: UnitConversion = {
            teacherInput: this.teacherInput,
            studentInput: this.studentInput,
            teacherUnit: this.teacherUnit,
            studentUnit: this.studentUnit
          }
  
          this.unitConversionService.calculateVolumeUnitConversion(requestPayload).subscribe((response: UnitConversion) => {
            this.result = response.calculatedValue === this.studentInput ? "Correct" : "Incorrect";
            this.converetedResult = response.calculatedValue;
          }, error => {
            console.log(error);
            this.errorMessage = error.errorMessage;
          });

    }
}