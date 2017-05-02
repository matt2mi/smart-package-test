import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {FormsModule} from '@angular/forms';
import {HttpModule} from '@angular/http';

import { BsDropdownModule } from 'ngx-bootstrap/dropdown';

import {AppComponent} from './app.component';
import {HomeComponent} from './pages/home.component';
import {HotelService} from './pages/home.service';

@NgModule({
    declarations: [
        AppComponent,
        HomeComponent
    ],
    imports: [
        BrowserModule,
        FormsModule,
        HttpModule,
        BsDropdownModule.forRoot()
    ],
    providers: [HotelService],
    bootstrap: [AppComponent]
})
export class AppModule {
}
