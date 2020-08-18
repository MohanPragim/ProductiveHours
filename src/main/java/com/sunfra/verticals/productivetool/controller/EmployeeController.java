package com.sunfra.verticals.productivetool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sunfra.verticals.productivetool.entity.Employee;
import com.sunfra.verticals.productivetool.service.EmployeeService;

@Controller
public class EmployeeController {

	private final EmployeeService employeeService;

	public EmployeeController(final EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping("/")
	public String indexPage() {
		return "index";
	}

	@RequestMapping("/login")
	public String loginPage() {
		return "login";
	}

	@RequestMapping(value = "/validate-user",method = RequestMethod.POST)
	public String getLoginPage(@ModelAttribute("employee") Employee inputEmployee, ModelMap model) {
		String response;
		Employee employee = employeeService.getEmployee(401);
		if(employee.getEmail().equalsIgnoreCase(inputEmployee.getEmail())
				&& employee.getPassword().equalsIgnoreCase(inputEmployee.getPassword())) {
			response = "Employee Logged in successfully";
		} else {
			response = "Employee entered invalid credentials";
		}
		model.addAttribute("response", response);
		return "Response";

	}
}
