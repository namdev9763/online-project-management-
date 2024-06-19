import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { Data } from 'src/app/data';


@Component({
  selector: 'app-createproject',
  templateUrl: './createproject.component.html',
  styleUrls: ['./createproject.component.css']
})
export class CreateprojectComponent implements OnInit {

  constructor(private http:HttpClient, private router:Router) { }
  Url="http://localhost:8080/";

  project:Data=new Data();

  ngOnInit(): void 
  {
  }

  saveproject()
  {
    this.http.post(this.Url+'save',this.project).subscribe
    (
      (data:any) =>
      {
        if(data==true)
        {
          console.log(this.project);
          console.log(data);
          window.alert("project is save");
          this.project.projectname="";
        }
        else
        {
          window.alert("something is wrong");
        }
       
      }
    );
  }

}
