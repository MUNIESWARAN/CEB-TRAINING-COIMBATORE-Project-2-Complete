package com.niit.hrbackend.dao;

import java.util.ArrayList;

import com.niit.hrbackend.model.Skills;
 
public interface SkillsDao {
	public void saveOrUpdateSkills(Skills skills);
	public Skills getSkillsByEmployeeId(int employeeId);
	public ArrayList<Skills> getAllSkilsOfAllEmployees();
	public void deleteSkillsOfEmployee(int skillId);
}
