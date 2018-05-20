import { Component, OnInit, Input } from '@angular/core';
import {Employee} from '../Employee';
import { EmployeeService} from '../employee.service';
@Component({
  selector: 'app-update-detail',
  templateUrl: './update-detail.component.html',
  styleUrls: ['./update-detail.component.css']
})
export class UpdateDetailComponent implements OnInit {

  @Input() employee:Employee;
  
  constructor(private employeeService: EmployeeService) { }

  addEmployee():void{
    this.employeeService.addEmployee(this.employee).subscribe(data=>{alert("Employee Registered Successfully"); });
  }

  editEmployee():void{
    this.employeeService.editEmployee(this.employee).subscribe(data=>{alert("Employee Updated Successfully");
  });
  
  }

  


  ngOnInit() {
  }



}
