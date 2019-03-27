package model;

public class Medicine {
	//----------------------------------------------------------------------
	// Constants
	//----------------------------------------------------------------------

	//----------------------------------------------------------------------
	// Atributes
	//----------------------------------------------------------------------
	private String name; 
	private int dose;
	private double costPerDose;
	private int frecuency;

	//----------------------------------------------------------------------
	// Relations
	//----------------------------------------------------------------------

	// Constructor
	public Medicine(String name, int dose, double costPerDose, int frecuency) {
		this.name = name;
		this.dose = dose;
		this.costPerDose = costPerDose;
		this.frecuency = frecuency;
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

	// return the dose.
	public int getDose() {
		return dose;
	}

	// param dose the dose to set.
	public void setDose(int dose) {
		this.dose = dose;
	}

	// return the costPerDose.
	public double getCostPerDose() {
		return costPerDose;
	}

	// param costPerDose the costPerDose to set.
	public void setCostPerDose(double costPerDose) {
		this.costPerDose = costPerDose;
	}

	// return the frecuency.
	public int getFrecuency() {
		return frecuency;
	}

	// param frecuency the frecuency to set.
	public void setFrecuency(int frecuency) {
		this.frecuency = frecuency;
	}

	// show the String of this method
	public String toString() {
		String msg = "";
		msg += "|\tThe name of this medicine is: " + name + ".\n";
		msg += "|\tThe prescribed dose is: " + dose + ".\n";
		msg += "|\tThe cost per dose is: " + costPerDose + ".\n";
		msg += "|\tThe apply frecuency is: " + frecuency + ".\n";
		return msg;
	}
}