import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HomeComponent } from './home.component';
import { DashboardComponent } from 'src/app/modules/dashboard/dashboard.component';
import { ProjectlistComponent } from 'src/app/modules/projectlist/projectlist.component';
import { CreateprojectComponent } from 'src/app/modules/createproject/createproject.component';
import { RouterModule } from '@angular/router';
import {MatSidenavModule} from '@angular/material/sidenav';
import { MatIconModule } from '@angular/material/icon';
import {MatInputModule} from '@angular/material/input';
import {MatSelectModule} from '@angular/material/select';
import { SharedModule } from 'src/app/shared/shared.module';
import {FormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';




@NgModule({
  declarations: [
    HomeComponent,
    DashboardComponent,
    ProjectlistComponent,
    CreateprojectComponent
  ],
  imports: [
    CommonModule,
    RouterModule,
    MatSidenavModule,
    MatIconModule,
   MatInputModule,
   MatSelectModule,
   SharedModule,
   FormsModule,
   HttpClientModule
   
    
  ]
})
export class HomeModule { }
