import { Component, OnInit } from '@angular/core';
import { AppService } from './app.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {


  title='webapp';
  email:string='';
  password:string='';
 
readFormData(data:any){

  console.log(data.form.value);
}

}