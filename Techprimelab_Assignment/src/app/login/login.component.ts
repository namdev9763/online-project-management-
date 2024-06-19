import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Admin } from '../admin';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private http:HttpClient, private router:Router) { }
  username:string="";
  password:string=""; 
 admin:Admin;
Url="http://localhost:8080/";
  ngOnInit(): void 
  {
  }
  login()
  {
   this.http.get(this.Url+'login'+this.username+'/'+this.password).subscribe
   (
    (data:any) =>
    {
      if(data!=null)
      {
        this.admin=data;
        window.alert("login Successfully");
       this.router.navigate(['/home/dashboard']);
      }
      else
      {
          window.alert("check both username and password"); 
      }
    }
   );
  }

}
