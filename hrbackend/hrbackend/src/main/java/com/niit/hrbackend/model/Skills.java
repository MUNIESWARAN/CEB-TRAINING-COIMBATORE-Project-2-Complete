package com.niit.hrbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Skills {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int skillsId;
	
	private String noOfStudentsCertified;
	private String noOfFactCleard;
	private String noOfStudentsPlaced;
	private String yearsOfExperiance;
	private String highestQualifaction;
	private String techSkill1;
	private String techSkill2;
	private String vendor1;
	private String vendor2;
	
	@OneToOne
	@JoinColumn(name="employeeId")
	private Employee employee;

	
	
	public Skills() {
		super();
	}



	public int getSkillsId() {
		return skillsId;
	}



	public void setSkillsId(int skillsId) {
		this.skillsId = skillsId;
	}



	public String getNoOfStudentsCertified() {
		return noOfStudentsCertified;
	}



	public void setNoOfStudentsCertified(String noOfStudentsCertified) {
		this.noOfStudentsCertified = noOfStudentsCertified;
	}



	public String getNoOfFactCleard() {
		return noOfFactCleard;
	}



	public void setNoOfFactCleard(String noOfFactCleard) {
		this.noOfFactCleard = noOfFactCleard;
	}



	public String getNoOfStudentsPlaced() {
		return noOfStudentsPlaced;
	}



	public void setNoOfStudentsPlaced(String noOfStudentsPlaced) {
		this.noOfStudentsPlaced = noOfStudentsPlaced;
	}



	public String getYearsOfExperiance() {
		return yearsOfExperiance;
	}



	public void setYearsOfExperiance(String yearsOfExperiance) {
		this.yearsOfExperiance = yearsOfExperiance;
	}



	public String getHighestQualifaction() {
		return highestQualifaction;
	}



	public void setHighestQualifaction(String highestQualifaction) {
		this.highestQualifaction = highestQualifaction;
	}



	public String getTechSkill1() {
		return techSkill1;
	}



	public void setTechSkill1(String techSkill1) {
		this.techSkill1 = techSkill1;
	}



	public String getTechSkill2() {
		return techSkill2;
	}



	public void setTechSkill2(String techSkill2) {
		this.techSkill2 = techSkill2;
	}



	public String getVendor1() {
		return vendor1;
	}



	public void setVendor1(String vendor1) {
		this.vendor1 = vendor1;
	}



	public String getVendor2() {
		return vendor2;
	}



	public void setVendor2(String vendor2) {
		this.vendor2 = vendor2;
	}



	public Employee getEmployee() {
		return employee;
	}



	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	
	
	}
