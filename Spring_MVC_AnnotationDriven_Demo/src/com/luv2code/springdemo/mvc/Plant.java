package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Plant {
	private String name;
	private String type;
	private String longevity;
	private String country;
	private String continent;
	private String oxyRate;
	private String[] diseaseLiablity;
	private LinkedHashMap<String, String> nativeLocation;

	public Plant() {
		nativeLocation = new LinkedHashMap<>();
		nativeLocation.put("BR", "Brazil");
		nativeLocation.put("FR", "France");
		nativeLocation.put("GE", "Germany");
		nativeLocation.put("AF", "Africa");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLongevity() {
		return longevity;
	}

	public void setLongevity(String longevity) {
		this.longevity = longevity;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public LinkedHashMap<String, String> getNativeLocation() {
		return nativeLocation;
	}

	public String getOxyRate() {
		return oxyRate;
	}

	public void setOxyRate(String oxyRate) {
		this.oxyRate = oxyRate;
	}

	public String[] getDiseaseLiablity() {
		return diseaseLiablity;
	}

	public void setDiseaseLiablity(String[] diseaseLiablity) {
		this.diseaseLiablity = diseaseLiablity;
	}

}
