package com.sunfra.verticals.productivetool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sunfra.verticals.productivetool.entity.Employee;
import com.sunfra.verticals.productivetool.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@RequestMapping("/login")
	public String loginPage() {

		return "Login";
	}

	@RequestMapping(value = "/EmployeeLoginPage",method = RequestMethod.POST)
	public String getLoginPage(@ModelAttribute("employee") Employee emp, ModelMap model) {

		System.out.println(emp.getEmail()+" "+emp.getPassword());
		String response;
		System.out.println("----------------------------------");
		Employee employee = service.getEmployee(401);
		System.out.println(employee);
		if(employee.getEmail().equalsIgnoreCase(emp.getEmail()) && employee.getPassword().equalsIgnoreCase(emp.getPassword())) {
			response = "Employee Logged in succesfully";
		} else {
			response = "Employee enter invalid creadentials";
		}
		model.addAttribute("response", response);
		return "Response";
		
	}
}
