import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";

@Injectable({
    providedIn: 'root'
  })
  export class UnitConversionService {

    API_HOST_NAME = "http://localhost:8080/unit-conversion";
  
    constructor(private http:HttpClient) {}
  
    calculateTemperatureUnitConversion(data: any): Observable<any> {
        const url = this.API_HOST_NAME + "/temperatures/conversion";
        return this.http.post(url, data);
    }

    calculateVolumeUnitConversion(data: any): Observable<any> {
        const url = this.API_HOST_NAME + "/volumes/conversion";
        return this.http.post(url, data);
    }
  }