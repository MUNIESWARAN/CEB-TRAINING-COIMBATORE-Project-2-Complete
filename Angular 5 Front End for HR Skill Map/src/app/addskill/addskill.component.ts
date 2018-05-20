import { Component, OnInit } from '@angular/core';
import{EmployeeService} from '../employee.service'
import {Employee} from '../Employee';
import {Skills} from '../Skills';
import { Observable, of } from 'rxjs';
@Component({
  selector: 'app-addskill',
  templateUrl: './addskill.component.html',
  styleUrls: ['./addskill.component.css']
})
export class AddskillComponent implements OnInit {

  employee:Employee;
  selectedEmployee:Employee;
  skills:Skills;
  skillsList : Skills[];
  flag:boolean;
  editFlag:boolean;
  newFlag:boolean;
  showSubForm:boolean;
  constructor(private employeeService:EmployeeService) { }

  getEmployee(employeeId:number) : void{
        this.employeeService.getEmployee(employeeId).subscribe(emp => this.employee = emp);
        this.showSubForm=false;
  }
  
  loadEmployeeSkills(employeeId:number){
     this.flag=true;
     this.showSubForm=true;
     this.employeeService.getEmployee(employeeId).subscribe(emp=>this.selectedEmployee=emp);
     this.skills=new Skills();
     this.skillsList.forEach(skill => {
       if(skill.employee.employeeId==employeeId){
        this.employeeService.getSkillByEmployeeId(employeeId).subscribe(skil => this.skills = skil);
         this.flag=false;
         }
     });
    
    }

   
  populateSkillsList(){
    this.employeeService.getAllSkills().subscribe(skil=>this.skillsList=skil);
    }

    saveSkills():void{

      if(this.flag){
        alert("Calling POST method for Updation");
        this.employeeService.addSkills(this.skills).subscribe(data=>{alert("Skills Saved Successfully"); } );
          }else{
        alert("Calling PUT method for Updation");
        
        
        this.employeeService.editSkills(this.skills).subscribe(data=>{alert("Skills Updated Successfully");});
       }
      }
    
    addEmployee():void{
      this.employeeService.addEmployee(this.employee).subscribe(data=>{alert("Employee Registered Successfully"); });
    }
  

  ngOnInit() {
    this.populateSkillsList();
    this.showSubForm=false;
  }


}
