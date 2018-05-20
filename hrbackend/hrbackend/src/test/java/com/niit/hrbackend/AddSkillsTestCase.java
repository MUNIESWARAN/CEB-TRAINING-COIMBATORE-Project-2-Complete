package com.niit.hrbackend;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.hrbackend.model.Skills;
import com.niit.hrbackend.service.EmployeeService;
import com.niit.hrbackend.service.SkillsService;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=com.niit.hrbackend.config.DBconfig.class) 

public class AddSkillsTestCase {
	
	@Autowired
	private SkillsService skillsService;
	
	@Autowired
	private EmployeeService  employeeService;
	private Skills skills;

	@Before
	public void setUp() throws Exception {
		skills = new Skills();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		boolean flag = false;
			try {
				skills.setNoOfStudentsCertified("95");
				skills.setNoOfFactCleard("10");
				skills.setNoOfStudentsPlaced("31");
				skills.setYearsOfExperiance("5");
				skills.setHighestQualifaction("B.E IT");
				skills.setTechSkill1("JAVA");
				skills.setTechSkill2("J2EE");
				skills.setVendor1("OCJP7");
				skills.setVendor2("Not Applicable");
 				skills.setEmployee(employeeService.getEmployeeById(1));
 				skillsService.saveOrUpdateSkills(skills);
 				flag = true;
			}catch(Exception e) {
				System.out.println("Error during Skills Add Testing ... " + e);
			}
			assertEquals("Success",true, flag==true);
	}

}
