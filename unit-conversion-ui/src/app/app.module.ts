import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home';
import { TemperaturesComponent } from './_components/temperatures/temperatures.component';
import { VolumesComponent } from './_components/volumes/volumes.component';

@NgModule({
    imports: [
        BrowserModule,
        ReactiveFormsModule,
        HttpClientModule,
        AppRoutingModule,
        FormsModule
    ],
    declarations: [
        AppComponent,
        HomeComponent,
        TemperaturesComponent,
        VolumesComponent
    ],
    providers: [
    ],
    bootstrap: [AppComponent]
})
export class AppModule { };