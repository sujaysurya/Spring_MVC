package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	// need a controller method to show the initial HTML form
	@RequestMapping("/showFormMapping")
	public String showFormMethod(Model theModel) {
		Employee myEmployeeObj = new Employee();
		theModel.addAttribute("employee", myEmployeeObj);
		return "show-form-employee";
	}

	// need a method to process the form
	@RequestMapping("/processFormMapping")
	public String processFormMethod(@ModelAttribute("employee") Employee employee) {
		System.out.println("The employee's first name is:" + employee.getFirstName());
		System.out.println("The employee's last name is:" + employee.getLastName());
		System.out.println("The employee's SSN is:" + employee.getSocialSecurity());
		System.out.println("The employee's telephone number is:" + employee.getTelephoneNumber());
		System.out.println("The employee's ID is:" + employee.getEmployeeID());
		return "employee-confirmation";
	}

}
