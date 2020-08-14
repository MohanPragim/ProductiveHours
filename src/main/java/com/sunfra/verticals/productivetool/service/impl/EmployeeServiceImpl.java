package com.sunfra.verticals.productivetool.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunfra.verticals.productivetool.Dal.EmployeeDao;
import com.sunfra.verticals.productivetool.entity.Employee;
import com.sunfra.verticals.productivetool.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao dao;

	public Employee getEmployee(int id) {

		Employee employee = dao.findOne(id);
		return employee;
	}

}
