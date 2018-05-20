package com.niit.hrbackend.dao;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.hrbackend.model.Employee;
import com.niit.hrbackend.model.Skills;

@Repository
@Transactional
public class SkillsDaoImp implements SkillsDao {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void saveOrUpdateSkills(Skills skills) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(skills);
	}

	@Override
	public Skills getSkillsByEmployeeId(int employeeId) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		Skills skill =  new Skills();
		ArrayList<Skills> skillsList = new ArrayList<Skills>();
		skillsList = getAllSkilsOfAllEmployees();
		for( Skills temp : skillsList) {
			if(temp.getEmployee().getEmployeeId()==employeeId);
				skill = temp;
				break;
		}
		System.out.println("Trying to fetch getSkillsByEmployeeId...");
		return skill;
	}

	@Override
	public ArrayList<Skills> getAllSkilsOfAllEmployees() {
		// TODO Auto-generated method stub
		return  (ArrayList<Skills>) sessionFactory.getCurrentSession().createCriteria(Skills.class).list();
	}

	@Override
	public void deleteSkillsOfEmployee(int skillId) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Skills skills = (Skills) session.load(Skills.class, skillId);
		if (null != skills) {
			session.delete(skills);
		}
		
	}

}
