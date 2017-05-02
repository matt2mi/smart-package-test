import {Component, OnInit} from '@angular/core';
import {HotelService} from './home.service';

@Component({
    selector: 'home',
    templateUrl: './home.component.html',
    styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

    hotels: Array<any>;

    constructor(private hotelService: HotelService) {

    }

    ngOnInit(): void {
        this.hotelService
            .fetch()
            .subscribe(hotels => {
                    this.hotels = hotels;
                }
            );
    }

}
