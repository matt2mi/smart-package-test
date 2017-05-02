import {Injectable} from "@angular/core";
import {Observable} from "rxjs";
import {Http, Response} from "@angular/http";
import "rxjs/add/operator/map";

@Injectable()
export class HotelService {

    constructor(private _http: Http) {
    }

    /**
     * Function to return list of people
     *
     * @returns {Observable<R>}
     */
    fetch(): Observable<any> {
        return this._http.get('/api/hotel')
            .map((res: Response) => {
                if (res.status === 200) {
                    return res.json();
                } else {
                    return [];
                }
            });
    }

}
