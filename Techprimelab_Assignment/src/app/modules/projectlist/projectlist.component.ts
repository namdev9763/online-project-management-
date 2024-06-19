import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProjectDetails } from 'src/app/project-details';

@Component({
  selector: 'app-projectlist',
  templateUrl: './projectlist.component.html',
  styleUrls: ['./projectlist.component.css'],
  template:`<app-dashboard  [data]="allProject"></app-dashboard>`
})
export class ProjectlistComponent implements OnInit {

  Url="http://localhost:8080/";
  allProject:ProjectDetails[]=[];

  constructor(private http:HttpClient,private router:Router)
   {
    this.http.get(this.Url+"getAllProject") .subscribe
    (
      (data:any) =>
      {
        this.allProject=data;
        console.log(this.allProject);
      }
    );
   }

  ngOnInit(): void {}

  setstatus(ProjectDetails:any, change:string)
  {
    this.http.get(this.Url+"setstatus"+ProjectDetails.proId+'/'+change).subscribe
    (
      (data:any) =>
      {
        if(!data)
        {
          window.alert("someting is wrong");
        }
        else
        {
          ProjectDetails.status=change;
        }
      }
    );
  }
}
