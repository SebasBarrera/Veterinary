package model;

import java.util.ArrayList;
import java.util.Arrays;

public class Veterinary {
	//----------------------------------------------------------------------
	// Constants
	//----------------------------------------------------------------------
	public final static int NUMBER_OF_ROOMS = 7;
	public final static int NUMBER_OF_DRUGS = 5;

	//----------------------------------------------------------------------
	// Atributes
	//----------------------------------------------------------------------
	
	//----------------------------------------------------------------------
	// Relations
	//----------------------------------------------------------------------
	private ArrayList<Person> client;
	private ArrayList<Pet> patient;
	private ArrayList<History> record;
	private Medicine[] meds;
	private MiniRooms[] rooms;

	// Constructor
	public Veterinary(/*String name*/) {
		//this.name = name;
		client = new ArrayList<Person>();
		patient = new ArrayList<Pet>();
		record = new ArrayList<History>();
		rooms = new MiniRooms[NUMBER_OF_ROOMS];
		meds = new Medicine[NUMBER_OF_DRUGS];



		DateP date1 = new DateP(28, 02, 2010);
		Person person1 = new Person("Sebastián", 1144105003, "Cra 68 # 16 - 07", "3214650140", true);
		Pet pet1 = new Pet("Luna", 1, 1.5, "Pinsher doverman minuatura", date1);

		
		MiniRooms room1 = new MiniRooms(true, 1, pet1);
		MiniRooms room2 = new MiniRooms(true, 2, null);
		MiniRooms room3 = new MiniRooms(true, 3, null);
		MiniRooms room4 = new MiniRooms(true, 4, null);
		MiniRooms room5 = new MiniRooms(true, 5, null);
		MiniRooms room6 = new MiniRooms(true, 6, null);
		MiniRooms room7 = new MiniRooms(true, 7, null);
		MiniRooms room8 = new MiniRooms(true, 8, null);

		Medicine med1 = new Medicine("Meloxic", 10, 11900.0, 360);
		Medicine med2 = new Medicine("Baxidin", 120, 17100.0, 720);
		Medicine med3 = new Medicine("Dermosyn", 50, 24300, 480);
		Medicine med4 = new Medicine("BraVecto", 100000, 66000.0, 2880);
		Medicine med5 = new Medicine("Thyro Tabs", 25, 55700.0, 60);
		Medicine med6 = new Medicine("Urofox", 30, 52600, 1440);


	}
	
	//----------------------------------------------------------------------
	// Methods
	//----------------------------------------------------------------------
	
	// return the rooms.	
	public MiniRooms[] getRooms() {
		return rooms;
	}
	
	// param rooms the rooms to set.	
	public void setRooms(MiniRooms[] rooms) {
		this.rooms = rooms;
	}
	// add a new client
	public void addClient(String name, int id, String direction, String phone, boolean active){
		client.add(new Person(name, id, direction, phone, active));
	}
	// add a new pet
	public String addPet(String petName, int animalType, double weight, String race, DateP x, String name){
		String msg = "";
		for (int i = 0;i<client.size();i++ ) {
			if (client.get(i).getName().equalsIgnoreCase(name)) {
				client.get(i).addPet(petName, animalType, weight, race, x);
				msg = "the pet has been added";
			}
		}
		return msg;
	}
	// add a new animal
	public void addAnimal(String petName, int animalType, double weight, String race, DateP x){
		patient.add(new Pet(petName, animalType, weight, race, x));
	}
	// verify if there are minirooms able
	public boolean verifyMiniRooms() {
		boolean aible = false;
		for (int i=0;i<NUMBER_OF_ROOMS && aible;i++) {
			if (rooms[i].getAvailability() == false) {
				aible = true;
			}
		}
		return aible;
	}
	// String of pets names
	public String petNames() {
		String msg = "";
		for (int i=0;i<patient.size();i++) {
			msg += patient.get(i).getName() + ".\n";
		}
		return msg;
	}
	// String of clients names
	public String personNames() {
		String msg = "";
		for (int i=0;i<client.size();i++) {
			msg += client.get(i).getName() + ".\n";
		}
		return msg;
	}
	// object pet
	public Pet choosePet(String current) {
		Pet x = null;
		for (int i = 0;i<patient.size();i++ ) {
			if (patient.get(i).getName().equalsIgnoreCase(current)) {
				x = patient.get(i);
			}		
		}
		return x;
	}
	// object person
	public Person choosePerson(String current) {
		Person x = null;
		for (int i = 0;i<client.size();i++ ) {
			if (client.get(i).getName().equalsIgnoreCase(current)) {
				x = client.get(i);
			}		
		}
		return x;
	}
	// choose the toString of a client with the pet name
	public String choosePetOwnerInformation(String current) {
		String msg = "";
		for (int i = 0;i<patient.size();i++ ) {
			if (patient.get(i).getName().equalsIgnoreCase(current)) {
				msg += patient.get(i).ownerInformation();
			}		
		}
		return msg;
	}
	// choose the toString of a client
	public String petInformation(String current) {
		String msg = "";
		for (int i = 0;i<patient.size();i++ ) {
			if (patient.get(i).getName().equalsIgnoreCase(current)) {
				msg = patient.get(i).toString();
			}		
		}
		return msg;
	}
	// choose the toString of a client
	public String choosePersonInformation(String current) {
		String msg = "";
		for (int i = 0;i<client.size();i++ ) {
			if (client.get(i).getName().equalsIgnoreCase(current)) {
				msg += client.get(i).toString();
			}		
		}
		return msg;
	}

	/*public String petOwnerInformation(Pet x) {
		String msg = "";
		msg += patien.get(x).ownerInformation();
		return msg;
	}

	public String personInformation(Person x) {
		String msg = "";
		msg += client.get(x).toString();
		return msg;
	}*/
	// to assign a room
	public String assignRoom(Pet x) {
		String msg = "";
		boolean ward = true;
		for (int i=0;i<NUMBER_OF_ROOMS && ward;i++) {
			if (rooms[i].getAvailability() == true) {
				rooms[i].setAvailability(false);
				rooms[i].setService(x);
				ward = false;
				msg = "Now, the pet is hospilizated";	
			}else {
				msg = "There's no Mini Rooms aible";
			}		
		}
		return msg;
	}

	// to discharge a pet
	public String dischargeAPet(String current){
		String msg = "";
		boolean ward = true;
		for (int i=0 ;i<NUMBER_OF_ROOMS && ward;i++) {
			if (rooms[i].petName().equalsIgnoreCase(current)) {
				rooms[i].setAvailability(false);
				rooms[i].setService(null);
				msg = "The pet has been discharge.";
				ward = false;
			}else {
				msg = "We don't find the pet";	
			}
		}

		return msg;
	}
	// to show the information rooms
	public String roomsInformation(){
		String msg = "";
		msg += "The actual information of the mini rooms:\n";
		for (int i = 0;i<NUMBER_OF_ROOMS;i++) {
			msg += rooms[i].toString(); 
		}
		msg += "__________________________________________________________________________________________\n";
		return msg;
	}
	// show the clients that doesn't have pets
	public String withOut() {
		String msg = "";
		for (int i = 0;i<client.size();i++) {
			msg += client.get(i).withOut();
		}
		return msg;
	}
	// for inactive a client
	public String inactive(String current) {
		String msg = "";
		for (int i = 0;i<client.size();i++ ) {
			if (client.get(i).getName().equalsIgnoreCase(current)) {
				client.get(i).setActive(false);
				msg = "The client has been inactivated";
			}else {
					msg = "invalid name";
			}
		}
		return msg;
	}
	// when a pet dies, this method eliminate it
	public String eliminateAPet(String current, String name) {
		String msg = "";
		for (int i = 0;i<patient.size();i++ ) {
			if (patient.get(i).getName().equalsIgnoreCase(current)) {
				patient.remove(i);
				msg = "The pet has been removed";
			}else {
				msg = "invalid pet";
			}
		}
		for (int i = 0;i<client.size();i++) {
			if (client.get(i).getName().equalsIgnoreCase(name)) {
				client.get(i).removePet(current);
			}
		}
		return msg;
	}
	// report of the clients and his pets
	public String reportAll() {
		String msg = "";
		int count = 0;
		msg += "______________________________________________________________________________________________________________________\n";
		for (int i = 0;i<client.size();i++) {
			msg += "|\tclient #" + count + ": " + client.get(i).getName() + " identify with: " + client.get(i).getId() + ".\n\n|\tPets: ";
			ArrayList<Pet> pets = client.get(i).getOwner();
			for (int k = 0;i<pets.size();i++) {
				msg += pets.get(k).getName();
				if (k==pets.size()-1) {
					msg += ".\n";
				}else{
					msg += ", ";
				}
			}
		}
		msg += "|____________________________________________________________________________________________________________________|\n";

		return msg;
	}
	// the records of the patiens
	public String medicalRecords(String current) {
		String msg = "";
		for (int i = 0;i<patient.size();i++) {
			if (patient.get(i).getName().equalsIgnoreCase(current)) {
				patient.get(i).reports();
			}
		}
		return msg;
	}
	// the income of the hospitalization
	public double totalIncome() {
		double cost = 0.0;
		for (int i = 0;i<record.size() ;i++ ) {
			cost += record.get(i).costPerAnimal();
		}
		return cost;
	}
	// hospitalize a pet
	public void hospitalizeAPet(DateP admission, Person owner, Pet pet, boolean status) {
		History x = new History(admission, pet, owner, status);
	}
	// show a name of the drugs in a String
	public String drugNames() {
		String msg = "";
		int count = 1;
		for (int i=0;i<NUMBER_OF_DRUGS;i++) {
			msg += count + meds[i].getName() + ".\n";
			count++;
		}
		return msg;
	}
	// add drugs to the array
	public void addMed(String current, int choose) {
		for (int i = 0;i<patient.size();i++ ) {
			if (patient.get(i).getName().equalsIgnoreCase(current)) {
				patient.get(i).addMed(choose);
			}
		}
	}
}