package com.luv2code.springdemo.mvc;


public class Animal {

	private String kingdom;
	private String genus;
	private String species;
	private String threatStatus;

	public Animal() {

	}

	public String getKingdom() {
		return kingdom;
	}

	public void setKingdom(String kingdom) {
		this.kingdom = kingdom;
	}

	public String getGenus() {
		return genus;
	}

	public void setGenus(String genus) {
		this.genus = genus;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getThreatStatus() {
		return threatStatus;
	}

	public void setThreatStatus(String threatStatus) {
		this.threatStatus = threatStatus;
	}

}
