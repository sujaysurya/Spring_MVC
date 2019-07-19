package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/animals")
public class AnimalController {
	
	// need a controller method to show the initial HTML form
	@RequestMapping("/showFormMapping")
	public String showFormMethod(Model theModel) {
		Animal myAnimalObj = new Animal();
		theModel.addAttribute("animals", myAnimalObj);
		System.out.println("Success");
		return "show-form-animal";
	}

	// need a method to process the form
	@RequestMapping("/processFormMapping")
	public String processFormMethod(@ModelAttribute("animals") Animal animal) {
		System.out.println("The animal's genus is:" + animal.getGenus());
		System.out.println("The animal's kingdom is:" + animal.getKingdom());
		System.out.println("The animal's species is:" + animal.getSpecies());
		System.out.println("The animal's threat Status is:" + animal.getThreatStatus());
		return "animal-confirmation";
	}

}
