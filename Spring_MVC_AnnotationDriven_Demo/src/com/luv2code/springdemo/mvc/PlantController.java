package com.luv2code.springdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/plants")
public class PlantController {

	@Value("#{continentOptions}")
	private Map<String, String> continentOptions;

	// need a controller method to show the initial HTML form
	@RequestMapping("/showFormMapping")
	public String showFormMethod(Model theModel) {
		Plant myplant = new Plant();
		theModel.addAttribute("tthplant", myplant);
		theModel.addAttribute("donsContinentOptions", continentOptions);
		return "show-form-plant";
	}

	// need a method to process the form
	@RequestMapping("/processFormMapping")
	public String processFormMethod(@ModelAttribute("tthplant") Plant plant) {
		System.out.println("The plant's name is:" + plant.getName());
		System.out.println("The plant's type is:" + plant.getType());
		System.out.println("The plant's age is:" + plant.getLongevity());
		System.out.println("The plant's Native country location is:" + plant.getCountry());
		System.out.println("The plant's Native continent location is:" + plant.getContinent());
		System.out.println("The plant's oxygen percentage is:" + plant.getOxyRate());
		System.out.println("The plant's feasibility to contract disease is:" + plant.getDiseaseLiablity());
		return "plant-confirmation";
	}

}
