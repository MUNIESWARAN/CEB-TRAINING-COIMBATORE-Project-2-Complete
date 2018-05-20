package com.niit.hrbackend;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.hrbackend.model.Employee;
import com.niit.hrbackend.service.EmployeeService;


@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=com.niit.hrbackend.config.DBconfig.class) 

public class AddEmployeeTestCase {

	@Autowired
	private EmployeeService employeeService;
	
	private Employee employee;
	
	@Before
	public void setUp() throws Exception {
	employee = new Employee();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		boolean flag = false;
		try {
			employee.setFirstName("Nokia");
			employee.setLastName("Samsung");
			employee.setDateOfBirth("03/08/1989");
			employee.setGender("FEMALE");
			employee.setCommAddress("Madurai");
			employee.setEmailid("nokia@gmail.com");
			employee.setPassword("password");
			employee.setContact("9947812345");
			employee.setUserType("TRAINER");
			employee.setStatus("APPROVED");
			employeeService.saveOrUpdateEmployee(employee);
			flag=true;
		}catch(Exception e) {
			System.out.println("Error Testcase : AddEmployeeTestCase:"+e);
		}
		assertEquals("Success",true, flag==true);
	}

}
