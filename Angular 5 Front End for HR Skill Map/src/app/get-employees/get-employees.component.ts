import { Component, OnInit } from '@angular/core';
import {EmployeeService} from '../employee.service';
import { Employee } from '../Employee';

@Component({
  selector: 'app-get-employees',
  templateUrl: './get-employees.component.html',
  styleUrls: ['./get-employees.component.css']
})
export class GetEmployeesComponent implements OnInit {

  employeeList : Employee[];
  selectedEmployee: Employee;
  constructor(private employeeService: EmployeeService) { }

  populateEmployeeList(){
      this.employeeService.getEmployees().subscribe(temp => this.employeeList=temp);
  }
 
  deleteEmployee(employee: Employee):void{
    this.employeeService.deleteEmployee(employee).subscribe(
        data => {this.employeeList = this.employeeList.filter(emp =>emp!==employee );
        }
    )
  }
    updateEmployee(employee:Employee):void{
      this.selectedEmployee = employee;
    }
  

  ngOnInit() {
    this.populateEmployeeList();
  }


  
}
