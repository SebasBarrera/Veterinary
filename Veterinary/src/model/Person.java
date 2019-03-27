 package model;

import java.util.ArrayList;

public class Person {
	//----------------------------------------------------------------------
	// Constants
	//----------------------------------------------------------------------

	//----------------------------------------------------------------------
	// Atributes
	//----------------------------------------------------------------------
	private String name;
	private int id;
	private String direction;
	private String phone;
	private boolean active;

	//----------------------------------------------------------------------
	// Relations
	//----------------------------------------------------------------------
	private ArrayList<Pet> owner;

	// Constructor
	public Person(String name, int id, String direction, String phone, boolean active) {
		this.name = name;
		this.id = id;
		this.direction = direction;
		this.phone = phone;
		this.active = active;
		owner = new ArrayList<Pet>();
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

	// return the id.
	public int getId() {
		return id;
	}

	// param id the id to set.
	public void setId(int id) {
		this.id = id;
	}

	// return the direction.
	public String getDirection() {
		return direction;
	}

	// param direction the direction to set.
	public void setDirection(String direction) {
		this.direction = direction;
	}

	// return the phone.
	public String getPhone() {
		return phone;
	}

	// param phone the phone to set.
	public void setPhone(String phone) {
		this.phone = phone;
	}

	// return the active.
	public boolean getActive() {
		return active;
	}

	// param active the active to set.
	public void setActive(boolean active) {
		this.active = active;
	}

	// return the owner.
	public ArrayList<Pet> getOwner() {
		return owner;
	}

	// param owner the owner to set.
	public void setOwner(ArrayList<Pet> owner) {
		this.owner = owner;
	}

	public void addPet(String petName, int animalType, double weight, String race, DateP x) {
		owner.add(new Pet(petName, animalType, weight, race, x));
	}

	public String withOut() {
		String msg = "";
		for (int i =0;i<owner.size() ;i++) {
			if (owner.isEmpty()) {
				msg += "\t-" + name + ".\n";
			}
		}
		return msg;
	}

	public void removePet(String current) { 
		for (int i = 0;i<owner.size();i++ ) {
			if (owner.get(i).getName().equalsIgnoreCase(current)) {
				owner.remove(i);
			}
		}
	}

	// show the String of this method
	public String toString() {
		String msg = "";
		msg += "\nCLIENT INFORMATION:\n";
		msg += "Name: " + name + ".\n";
		msg += "ID: " + id + ".\n";
		msg += "Direction: " + direction + ".\n";
		msg += "Phone number: " + phone + ".\n";
		return msg;
	}
}