package com.sunfra.verticals.productivetool.Dal.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.sunfra.verticals.productivetool.Dal.EmployeeDao;
import com.sunfra.verticals.productivetool.entity.Employee;
import com.sunfra.verticals.productivetool.util.HibernateUtil;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	public Employee findOne(int id) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Employee employee = session.load(Employee.class, id);
		return employee;
	}

}
