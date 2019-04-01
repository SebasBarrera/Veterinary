package model;

import java.util.ArrayList;

public class History {
	//----------------------------------------------------------------------
	// Constants
	//----------------------------------------------------------------------

	//----------------------------------------------------------------------
	// Atributes
	//----------------------------------------------------------------------
	private boolean status;

	//----------------------------------------------------------------------
	// Relations
	//----------------------------------------------------------------------
	private DateP admission;
	private Pet hist;
	private Person petOwner;
	private ArrayList<Detail> details;

	// Constructor
	public History(DateP admission, Pet hist, Person petOwner, boolean status) {
		this.status = status;
		this.hist = hist;
		this.petOwner = petOwner;
		this. admission = admission;
		details = new ArrayList<Detail>();
	}

	//----------------------------------------------------------------------
	// Methods
	//----------------------------------------------------------------------

	// return the admission.	
	public DateP getAdmission() {
		return admission;
	}

	// param admission the admission to set.	
	public void setAdmission(DateP admission) {
		this.admission = admission;
	}

	// return the hist.
	public Pet getHist() {
		return hist;
	}

	// param hist the hist to set.
	public void setHist(Pet hist) {
		this.hist = hist;
	}

	// return the status.
	public boolean getStatus() {
		return status;
	}

	// param status the status to set.
	public void setStatus(boolean status) {
		this.status = status;
	}

	// return the petOwner.
	public Person getPetOwner() {
		return petOwner;
	}

	// param petOwnerhe petOwner to set.
	public void setPetOwner(Person petOwner) {
		this.petOwner = petOwner;
	}

	public String detailsInformation(){
		String msg = "";
			if (details.isEmpty()){
				msg = "the animal doesn't have any hospitalization";
			}else {
				for (int i = 0; i < details.size() ; i++ ) {
					msg += details.get(i).toString();
				}
			}
		return msg;
	}
	// to put the open or close
	public String openClose() {
		String msg = "";
		if (getStatus() == true) {
			msg = "OPEN";
		}else {
			msg = "CLOSE";
		}
		return msg;
	}
	// the cost per aniaml
	public double costPerAnimal() {
		double cost = 0.0;
		for (int i = 0;i<details.size() ;i++ ) {
			cost += details.get(i).calculateCost();
		}
		return cost;
	}

	// the cost per aniaml
	public String costPerAnimal1() {
		String cost = "";
		for (int i = 0;i<details.size() ;i++ ) {
			cost += hist.get(i).getName() + " : " + details.get(i).calculateCost();
		}
		return cost;
	}

	public void addMed(int choose) {
		details.get(details.size()).addMed(choose);
	}
	
	// show the String of this method
	public String toString() {
		String msg = "";
		msg += "The admission date is" + admission.toString() + ".\n";
		msg += "The owner information is: \n";
		msg += petOwner.toString();
		msg += "The information of the pet is: \n";
		msg += hist.toString();
		msg += "The status is: " + openClose();
		msg += "|_________________________________________________________________________________________\n";
		return msg;
	}
}