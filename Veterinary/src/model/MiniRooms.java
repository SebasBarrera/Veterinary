package model;

public class MiniRooms {
	//----------------------------------------------------------------------
	// Constants
	//----------------------------------------------------------------------

	//----------------------------------------------------------------------
	// Atributes
	//----------------------------------------------------------------------
	private boolean availability;
	private int number;

	//----------------------------------------------------------------------
	// Relations
	//----------------------------------------------------------------------
	private Pet service;
	
	// Constructor
	public MiniRooms(boolean availability, int number, Pet service) {
		this.availability = availability;
		this.number = number;
		this.service = service;
	}
	
	//----------------------------------------------------------------------
	// Methods
	//----------------------------------------------------------------------
	
	// return the availability.	
	public boolean getAvailability() {
		return availability;
	}
	
	// param availability the availability to set.	
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	
	// return the number.	
	public int getNumber() {
		return number;
	}
	
	// param number the number to set.	
	public void setNumber(int number) {
		this.number = number;
	}

	// return the service.	
	public Pet getService() {
		return service;
	}
	
	// param service the service to set.	
	public void setService(Pet service) {
		this.service = service;
	}

	public String petName(){
		String msg = "";
		if (service != null) {
			msg = service.getName();
		}
		return msg; 
	}

	// show the String of this method
	public String toString() {
		String msg = "";	
		msg += "__________________________________________________________________________________________\n";
		msg += "|THIS IS THE ROOM NUMBER: " + number + "\n";
		if (service != null) {
			msg += service.toString();
		}else {
			msg += "there is no pets in this room.\n";
		}
		return msg;
	}
}