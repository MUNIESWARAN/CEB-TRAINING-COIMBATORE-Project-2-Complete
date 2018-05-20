import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import{FormsModule} from '@angular/forms'
import {RouterModule, Routes} from '@angular/router'
import { AppComponent } from './app.component';
import { AddEmployeeComponent } from './add-employee/add-employee.component';
import { EditEmployeeComponent } from './edit-employee/edit-employee.component';
import { DeleteEmployeeComponent } from './delete-employee/delete-employee.component';
import { GetEmployeeComponent } from './get-employee/get-employee.component';
import { GetEmployeesComponent } from './get-employees/get-employees.component';
import { AppRoutingModule } from './app-routing/app-routing.module';
import { LogService } from './log.service';
import { LogCompComponent } from './log-comp/log-comp.component';
import { HttpClientModule }    from '@angular/common/http';
import { UpdateDetailComponent } from './update-detail/update-detail.component';
import { AddskillComponent } from './addskill/addskill.component';
 
@NgModule({
  declarations: [
    AppComponent,
    AddEmployeeComponent,
    EditEmployeeComponent,
    DeleteEmployeeComponent,
    GetEmployeeComponent,
    GetEmployeesComponent,
    LogCompComponent,
    UpdateDetailComponent,
    AddskillComponent
  ],
  imports: [
    BrowserModule, FormsModule,AppRoutingModule, HttpClientModule
  ],
  providers: [LogService],
  bootstrap: [AppComponent]
})
export class AppModule { }
