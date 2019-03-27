package model;

import java.time.*;
import java.util.*;
import java.time.temporal.ChronoUnit;

public class Pet {
	//----------------------------------------------------------------------
	// Constants
	//----------------------------------------------------------------------
	public final static int DOG = 1;
	public final static int CAT = 2;
	public final static int BIRD = 3;
	public final static int OTHER = 4;

	//----------------------------------------------------------------------
	// Atributes
	//----------------------------------------------------------------------
	private String name;
	private int animalType;
	private double weight; 
	private String race;

	//----------------------------------------------------------------------
	// Relations
	//----------------------------------------------------------------------
	private DateP birthDate;
	private Person own;
	private History report;


	// Constructor
	public Pet(String name, int animalType, double weight, String race, DateP birthDate) {
		this.name = name;
		this.animalType = animalType;
		this.weight = weight;
		this.race = race;
		this.birthDate = birthDate;
	}

	//----------------------------------------------------------------------
	// Methods
	//----------------------------------------------------------------------
	
	// return the name.
	public String getName() {
		return name;
	}

	// param name the name to set.
	public void setName(String name) {
		this.name = name;
	}



	// return the animalType.
	public int getAnimalType() {
		return animalType;
	}

	// param animalType the animalType to set.
	public void setAnimalType(int animalType) {
		this.animalType = animalType;
	}

	// return the weight.
	public double getWeight() {
		return weight;
	}

	// param weight the weight to set.
	public void setWeight(double weight) {
		this.weight = weight;
	}

	// return the race.
	public String getRace() {
		return race;
	}

	// param race the weight to set.
	public void setRace(String race) {
		this.race = race;
	}

	// return the birthDate.
	public DateP getBirthDate() {
		return birthDate;
	}

	// param birthDate the birthDate to set.
	public void setBirthDate(DateP birthDate) {
		this.birthDate = birthDate;
	}

	// calculate the age of the animal.
	public long calculateAge() {
		LocalDate born = LocalDate.of(birthDate.getYear(), birthDate.getMonth(), birthDate.getDay());
		LocalDate today = LocalDate.now();
		long years = ChronoUnit.YEARS.between(born, today);
		return years;
	}

	public String ownerInformation() {
		String msg = "";
		msg += own.toString();
		return msg;
	}

	public String reports() {
		String msg = "";
		msg = report.toString();
		return msg;
	}

	public void addMed(int choose) {
		report.addMed(choose);
	}

	// show the String of this method
	public String toString() {
		String msg = "";
		msg += "\n\tANIMAL INFORMATION:\n";
		msg += "|\tName: " + name + ".\n";
		msg += "|\tType: " + animalType + ".\n";
		msg += "|\tRace: " + race + ".\n";
		msg += "|\tAge: " + calculateAge() + ".\n";
		msg += "|\tWeight: " + weight + ".\n";
		return msg;
	}
}