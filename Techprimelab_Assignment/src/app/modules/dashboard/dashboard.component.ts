import { Component, OnInit } from '@angular/core';
import { ProjectlistComponent } from '../projectlist/projectlist.component';
import { ProjectDetails } from 'src/app/project-details';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  Url="http://localhost:8080/";
  allProject:ProjectDetails[]=[];
  runningCount:number=0;
  closedCount:number=0;
  CancelledCount=0;
  totalproject=0;
  constructor(private http:HttpClient,private router:Router) 
  {
    this.http.get(this.Url+"getAllStatus").subscribe
    (
      (data:any) =>
      {
        this.totalproject=data[0];
        console.log(this.totalproject);
        this.closedCount=data[1];
        console.log(this.closedCount);
        this.runningCount=data[2];
        console.log(this.runningCount);
        this.CancelledCount=data[3];
        console.log(this.CancelledCount);
      }
    );

  //   this.http.get(this.Url+"getAllProject") .subscribe
  //   (
  //     (data:any) =>
  //     {
  //       for(let i=0;i<data.length;i++)
  //       {
  //         if(data[i].status==="Running")
  //         {
  //           this.runningCount++;
  //         }
  //         else if(data[i].status==="closed")
  //         {
  //          this.closedCount++; 
  //         }
  //         else if(data[i].status==="Cancelled")
  //         {
  //           this.CancelledCount++;
  //         }  
  //         this.totalproject=data.length;
  //       }
    
  //     }
  //   );
   }
  
  ngOnInit(): void {
   const username = new FormControl('', [Validators.required, Validators.email]);
  }

}
