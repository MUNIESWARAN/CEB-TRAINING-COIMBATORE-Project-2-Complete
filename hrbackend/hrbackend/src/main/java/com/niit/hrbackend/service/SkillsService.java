package com.niit.hrbackend.service;

import java.util.ArrayList;

import com.niit.hrbackend.model.Skills;

public interface SkillsService {
	public void saveOrUpdateSkills(Skills skills);
	public Skills getSkillsByEmployeeId(int employeeId);
	public ArrayList<Skills> getAllSkilsOfAllEmployees();
	public void deleteSkillsOfEmployee(int skillId);
}
