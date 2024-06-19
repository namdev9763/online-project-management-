import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SidebarComponent } from './component/sidebar/sidebar.component';
import { MatIconModule } from '@angular/material/icon';
import {MatMenuModule} from '@angular/material/menu';
import {MatButtonModule} from '@angular/material/button';
import {MatListModule} from "@angular/material/list";
import {MatToolbarModule} from '@angular/material/toolbar';



@NgModule({
  declarations: [
    SidebarComponent,
  ],
  imports: [
    CommonModule,
    MatToolbarModule,
   MatMenuModule,
   MatIconModule,
  MatButtonModule,
  MatListModule,
  ],
  exports :[
SidebarComponent    
  ]
})
export class SharedModule { }
