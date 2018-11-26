import { Component, OnInit } from '@angular/core';
import { PersonalService } from './personal.service';
import { Personal } from './personal.model';
import { Education } from './education.model';
//import { Popup} from 'ng2-opd-popup';
import { from } from 'rxjs';
//import {Subject} from 'rxjs/Subject';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'details';
  private personal: Personal = new Personal();
  private education: Education = new Education();
  private active: Boolean;
  private buttonStatus: string;

  constructor(private personalService: PersonalService) { }//, private popup: Popup) { }



  ngOnInit() {
    this.active = false;
    this.buttonStatus = 'enabled';
  }

  save() {
    //  && this.personal.id != " " && this.personal.id == "[0-9]*"
    //this.active = true;
    // console.log("Personal Details are: " + this.personal.id, this.personal.name)
    this.buttonStatus = 'disabled';

    //console.log(form);
  }

  onSubmit() {
    // this.save();
    //this.fullSubmit();
  }

  saveEducation() {

    this.buttonStatus = 'disabled';
    //console.log("Education Details are: " + this.education.cgpa, this.education.qualification)
    //if (this.education.cgpa != null && this.education.cgpa != "" && this.education.cgpa != " " && this.education.cgpa == "[0-9]*") {
    //this.personalService.createEducation(this.education)
    //.subscribe(data => this.active = true, error => console.log(error));
    //this.education = new Education();
    //}
  }
  OnSubmitEducation() {
    this.saveEducation();
  }



  //constructor(private popup: Popup){}

  fullSubmit() {
    // if (this.active) {

    //this.popup.options = { color:"Blue"}
    //this.popup.show();
    console.log("fullsubmit")
    // this.personalService.createCustomer(this.personal)
    //   .subscribe(data => console.log(data), error => console.log(error));
    console.log("Personal Details are: " + this.personal.id, this.personal.name)

    if (this.personal.id != null && this.personal.id != "") {
      this.personalService.createCustomer(this.personal)
        .subscribe(data => this.active = true, error => console.log(error));
      this.personal = new Personal();

      alert("Personal details submitted!")

    } else {
      console.log("Education Details are: " + this.education.cgpa, this.education.qualification)

      this.education.cgpa != null && this.education.cgpa != "" && this.education.cgpa != " " && this.education.cgpa == "[0-9]*";
      this.personalService.createEducation(this.education)
        .subscribe(data => this.active = true, error => console.log(error));
      this.education = new Education();

      alert("Education details submitted!")
    }

    alert("Data Saved Successfully!")
    // this.personal = new Personal();
    //this.save();
    //this.saveEducation();
    //}
  }

}

