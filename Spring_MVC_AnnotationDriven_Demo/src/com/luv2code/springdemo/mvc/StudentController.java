package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {

	// need a controller method to show the initial HTML form
	@RequestMapping("/showFormMapping")
	public String showFormMethod() {
		return "show-form";
	}

	// need a controller to process the form
	@RequestMapping("/processFormMapping")
	public String processFormMethod() {
		return "process-form";
	}

	@RequestMapping("/upperCaseConvertMapping")
	public String convertUpperMethod(HttpServletRequest http, Model model) {
		String studentName = http.getParameter("stdnt_name");
		String result = studentName.toUpperCase();
		result = "HEY , " + result + "!! Please do not enter the premises";
		model.addAttribute("upperCaseResultMessage", result);
		return "upper-case-form";

	}

	//using @RequestParam annotation
	@RequestMapping("/lowerCaseConvertMapping")
	public String convertLowerMethod(@RequestParam("stdnt_name") String studentName, Model model) {
		String result = studentName.toLowerCase();
		result = "HEY , " + result + "!! Please do not enter the premises";
		model.addAttribute("lowerCaseResultMessage", result);
		return "lower-case-form";

	}

}
