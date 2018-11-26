import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PersonalService } from './personal.service';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
//import { PopupModule } from 'ng2-opd-popup';
import { from } from 'rxjs';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule,
    //PopupModule.forRoot(),
  ],
  providers: [PersonalService],
  bootstrap: [AppComponent]
})
export class AppModule { }
