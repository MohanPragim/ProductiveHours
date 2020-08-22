package com.sunfra.verticals.productivetool.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunfra.verticals.productivetool.dao.EmployeeDao;
import com.sunfra.verticals.productivetool.entity.Employee;
import com.sunfra.verticals.productivetool.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeeDao employeeDao;

	@Autowired
	public EmployeeServiceImpl(final EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public Employee getEmployee(int id) {
		return employeeDao.findOne(id);
	}

}
