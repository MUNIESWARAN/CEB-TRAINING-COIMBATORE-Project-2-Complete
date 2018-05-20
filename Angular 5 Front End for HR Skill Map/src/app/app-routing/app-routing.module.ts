import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';

import { AddEmployeeComponent } from '../add-employee/add-employee.component';
import { EditEmployeeComponent } from '../edit-employee/edit-employee.component';
import { DeleteEmployeeComponent } from '../delete-employee/delete-employee.component';
import { GetEmployeeComponent } from '../get-employee/get-employee.component';
import { GetEmployeesComponent } from '../get-employees/get-employees.component';
import {AddskillComponent} from '../addskill/addskill.component'

const routes: Routes =[
  {path: 'ADDEMPLOYEE', component:AddEmployeeComponent},
  {path: 'DELETEEMPLOYEE', component:DeleteEmployeeComponent},
  {path: 'EDITEMPLOYEE', component:EditEmployeeComponent},
  {path: 'GETEMPLOYEE', component:GetEmployeeComponent},
  {path: 'LISTALLEMPLOYEES', component:GetEmployeesComponent},
  {path: 'ADDSKILLS', component:AddskillComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports:[RouterModule]
})
export class AppRoutingModule { }
