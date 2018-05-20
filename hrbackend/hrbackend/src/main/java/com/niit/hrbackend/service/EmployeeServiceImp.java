package com.niit.hrbackend.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.hrbackend.dao.EmployeeDao;
import com.niit.hrbackend.model.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	
	@Override
	public void saveOrUpdateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.saveOrUpdateEmployee(employee);
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeById(employeeId);
	}

	@Override
	public ArrayList<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.getAllEmployees();
	}

	@Override
	public void deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		  employeeDao.deleteEmployee(employeeId);
	}

}
