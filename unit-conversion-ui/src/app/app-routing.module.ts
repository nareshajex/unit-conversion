import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './home';
import { TemperaturesComponent } from './_components/temperatures/temperatures.component';
import { VolumesComponent } from './_components/volumes/volumes.component';

const routes: Routes = [
    { path: '', component: HomeComponent},
    {path: 'temperatures', component: TemperaturesComponent},
    {path: 'volumes', component: VolumesComponent},

    // otherwise redirect to home
    { path: '**', redirectTo: '' }
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule { }