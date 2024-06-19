import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './layout/home/home.component';
import { DashboardComponent } from './modules/dashboard/dashboard.component';
import { ProjectlistComponent } from './modules/projectlist/projectlist.component';
import { CreateprojectComponent } from './modules/createproject/createproject.component';
import { ForgetpasswordComponent } from './forgetpassword/forgetpassword.component';

const routes: Routes = [
{path: '', component:LoginComponent},
{path:'forgetpassword', component: ForgetpasswordComponent},
{path: 'home', component:HomeComponent, 
children:[
  {path:'dashboard', component: DashboardComponent},
  {path:'projectList', component:ProjectlistComponent},
  {path:'createProject', component:CreateprojectComponent}
]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
