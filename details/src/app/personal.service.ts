import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { HttpClient } from "@angular/common/http";
import { $ } from "protractor";


@Injectable({
    providedIn: 'root'
})
export class PersonalService {

    private baseUrl = 'http://localhost:8080/api/';
    private issubmitted = false;

    constructor(private http: HttpClient) { }

    createCustomer(personal: Object): Observable<Object> {
        console.log(this.baseUrl);
        return this.http.post(`${this.baseUrl}` + `/addPersonal`, personal);
    }

    createEducation(education: Object): Observable<Object> {
        return this.http.post(`${this.baseUrl}` + `/addEducation`, education);
    }
}