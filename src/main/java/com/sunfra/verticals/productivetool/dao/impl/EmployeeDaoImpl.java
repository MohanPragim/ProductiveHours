package com.sunfra.verticals.productivetool.dao.impl;

import com.sunfra.verticals.productivetool.dao.EmployeeDao;
import com.sunfra.verticals.productivetool.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	private final SessionFactory factory;

	@Autowired
	public EmployeeDaoImpl(final SessionFactory factory) {
		this.factory = factory;
	}

	public Employee findOne(int id) {
		Session session = factory.openSession();
		return session.load(Employee.class, id);
	}

}
