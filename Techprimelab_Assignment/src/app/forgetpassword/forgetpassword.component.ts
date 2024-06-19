import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Admin } from '../admin';


@Component({
  selector: 'app-forgetpassword',
  templateUrl: './forgetpassword.component.html',
  styleUrls: ['./forgetpassword.component.css']
})
export class ForgetpasswordComponent implements OnInit {

  username:string="";
  newPassword:string="";
 admin:Admin;
  Url="http://localhost:8080/";
  hide = true;

  constructor(private http:HttpClient,private router:Router) {}

  ngOnInit(): void 
  {

  }
  forgotpassword()
  {
    this.http.get(this.Url+'forgotPassword'+this.username+'/'+this.newPassword) .subscribe
    (
      (data:any) =>
      {
        if(data!=null)
        {
        console.log(data);
        this.admin=data;
        window.alert("Forgot Password successfully");
        this.router.navigate(['']);
        }
        else
        {
          window.alert("this password is already used please create another password");
        }
      }
    );
   
  }

}
