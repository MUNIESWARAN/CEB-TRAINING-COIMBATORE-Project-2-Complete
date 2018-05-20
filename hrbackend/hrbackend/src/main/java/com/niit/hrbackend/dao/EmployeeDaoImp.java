package com.niit.hrbackend.dao;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.hrbackend.model.Employee;

@Repository
@Transactional
public class EmployeeDaoImp implements EmployeeDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void saveOrUpdateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(employee);
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return (Employee)sessionFactory.getCurrentSession().get(Employee.class, employeeId);
	}

	@Override
	public ArrayList<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return  (ArrayList<Employee>) sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
	}

	@Override
	public void deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Employee employee = (Employee) session.load(Employee.class, employeeId);
		if (null != employee) {
			session.delete(employee);
		}
	}
}
