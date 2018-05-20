import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import {Employee} from './Employee'
import {Skills} from './Skills'

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};


@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private baseUrl = 'http://localhost:9585/hrfrontend/api/emp'; 
  
  selectedEmployee : Employee;
  skillsList : Skills[];
  constructor( private http: HttpClient ) { }

  getEmployees():Observable<Employee[]>{
      return this.http.get<Employee[]>(this.baseUrl)
  }

  public deleteEmployee(employee){
    return this.http.delete(this.baseUrl+"/del/"+employee.employeeId);
  }  

  public addEmployee(employee){
    return this.http.post<Employee>(this.baseUrl+"/addEmployee", employee)
  }

  public editEmployee(employee:Employee){
    return this.http.put<Employee>(this.baseUrl+"/updateEmployee/", employee)
  }
  

  public getEmployee(employeeId:number){
      return this.http.get<Employee>(this.baseUrl+"/getEmployee/"+employeeId);
  }

  public getSkillByEmployeeId(employeeId:number){
    return this.http.get<Skills>(this.baseUrl+"/getSkill/"+employeeId);
  }

  public getAllSkills():Observable<Skills[]>{
    return this.http.get<Skills[]>(this.baseUrl+"/getAllSkills/");
  }

  public addSkills(skills:Skills){
      alert("Service method called");
     
      return this.http.post<Skills>(this.baseUrl+"/addSkills", skills)
  }

  public editSkills(skills:Skills){
    return this.http.put<Skills>(this.baseUrl+"/updateSkills", skills)
}
}
