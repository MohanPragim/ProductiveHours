package com.sunfra.verticals.productivetool.Dal;

import com.sunfra.verticals.productivetool.entity.Employee;

public interface EmployeeDao {

	public abstract Employee findOne(int id); 
}
