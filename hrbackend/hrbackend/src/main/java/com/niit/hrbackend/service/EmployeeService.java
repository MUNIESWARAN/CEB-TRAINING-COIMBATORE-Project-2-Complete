package com.niit.hrbackend.service;

import java.util.ArrayList;

import com.niit.hrbackend.model.Employee;

public interface EmployeeService {
	public void saveOrUpdateEmployee(Employee employee);
	public Employee getEmployeeById(int employeeId);
	public ArrayList<Employee> getAllEmployees();
	public void deleteEmployee(int employeeId);
}
