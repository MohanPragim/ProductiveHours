package com.sunfra.verticals.productivetool.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sunfra.verticals.productivetool.util.HibernateUtil;

public class Client {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Employee employee = new Employee();
		employee.setId(401);
		employee.setName("Mohan");
		employee.setEmail("mohan@gmail.com");
		employee.setPassword("12345");
		session.save(employee);
		tx.commit();

	}
}
