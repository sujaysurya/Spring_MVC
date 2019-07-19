package com.luv2code.springdemo.mvc;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/hospital")
public class HospitalController {

	// need a controller method to show the initial HTML form
	@RequestMapping("/showFormMapping")
	public String showFormMethod() {
		return "show-form-hospital";
	}

	// need a method to process the form
	@RequestMapping("/processFormMapping")
	public String processFormMethod() {
		return "process-form-hospital";
	}

	// need a method to register new patient
	@RequestMapping("/registerNewPatientMapping")
	public String processRegisterNewPatient(@RequestParam("patnt_name") String patientName,
			@RequestParam("patnt_age") String patientage, @RequestParam("patnt_gender") String patientGender,
			Model model) {
		long registrationNo = 0;
		String message = null;
		Random r = new Random();
		if (patientName != null && patientGender != null && patientage != null) {
			registrationNo = r.nextInt();
		}
		message = "New Patient is successfully registered";
		System.out.println(message + " and the patient ID is: " + registrationNo);

		model.addAttribute("newPatientInfo", message);
		model.addAttribute("newPatientID", registrationNo);
		return "new-patient-registration-form";
	}

	// need a method to sign-in an existing patient
	@RequestMapping("checkInExistingPatientMapping")
	public String processSignInExisitngPatient(@RequestParam("patnt_id") String patientID, Model model) {
		String message = "Existing Patient is successfully validated";
		model.addAttribute("exisitngPatientInfo", message);
		return "existing-patient-signIn-form";
	}

}
