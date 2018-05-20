import { Component, OnInit } from '@angular/core';
import {LogService} from '../log.service';
import {Router} from '@angular/router';
import {Employee} from '../Employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {

  employee:Employee = new Employee();
  editEmployeeFlag = false;
  constructor(private router:Router, private employeeService: EmployeeService) { 
     
  }



  addEmployee():void{
    this.employeeService.addEmployee(this.employee).subscribe(data=>{alert("Employee Registered Successfully"); });
  }


  ngOnInit() {
  }


}
