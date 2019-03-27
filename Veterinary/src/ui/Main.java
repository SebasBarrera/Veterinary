package ui;

import model.*; 
import java.util.*;
import java.util.Scanner;

public class Main {
	//----------------------------------------------------------------------
	// Constants
	//----------------------------------------------------------------------

	//----------------------------------------------------------------------
	// Atributes
	//----------------------------------------------------------------------
	Scanner scanStr = new Scanner(System.in);
	Scanner scanInt = new Scanner(System.in);
	Scanner scanDou = new Scanner(System.in);

	//----------------------------------------------------------------------
	// Relations
	//----------------------------------------------------------------------
	private Veterinary shop;
	
	// Constructor
	public Main(/*String name*/) {
		shop = new Veterinary();
	}

	public static void main(String[] args) {
		Main main = new Main(/*name*/);
		main.showHeader();
		main.selectOption();
	}
	// The header of the menu.
	public void showHeader() {
		System.out.println("                      ████████									");	
		System.out.println("               ███████        █████████							");
		System.out.println("             ██                        ████						");
		System.out.println("            ██                             ██					");
		System.out.println("           █                                  ██				");
		System.out.println("          ██                                   ██				");
		System.out.println("          ██  ██                      ██          ██			");
		System.out.println("        ██  ██   ████         ████    ██          ████			");
		System.out.println("      ██   ██  ████  ██     ████  ██ ██             ███			");
		System.out.println("     ██   ██    ████         ████   ██               ██			");
		System.out.println("     ██   ██                        ██               ██			");
		System.out.println("     ██    ██                       ██             ██			");
		System.out.println("       ██  ██    ██████             ██           ███			");
		System.out.println("        ██  ██  ██      ██           ██         ██				");
		System.out.println("        ██  ██  ██      ██           ██       ██				");
		System.out.println("          ████    ██████             ████    ████				");
		System.out.println("          ████                     ██  ██    ███				");
		System.out.println("           ██ ████████████     ████      ████ ██				");
		System.out.println("             ██   ██      █████               ██				");
		System.out.println("             ██     ███████                    ██				");
		System.out.println("             ██                                ██				");
		System.out.println("            ██                                 ██				");
		System.out.println("            ██                                 ██				");
		System.out.println("            ██                                   █				");
		System.out.println("            ██                                   ██				");
		System.out.println("          ██                         ██           █			       █                        ███▓");
		System.out.println("          ██          ██           ██             ██			    █  ██                      ███▓");
		System.out.println("       ██  ██        ██         ██               ██			     ██████                   ███▓");
		System.out.println("     ██    ██          ██       ██               ██			      ███████                ███▓");
		System.out.println("     ██    ██            ██   ██                 ██			      █◉██████               ██▓");
		System.out.println("   ██      ██             ██ ██       ██         ██			    ██████████               ██▓");
		System.out.println("   ██      ██        ██    ███        ██         ██			    ██████████                ██▓");
		System.out.println("   ██      ██        ██    ███       ██          ██			     █████████          █████████");
		System.out.println("    ██      ██        ██               ██          ██			         ██████     ██████████████");
		System.out.println("    ██      ██        ██               ██            █			         ██████████████████████████");
		System.out.println(" ████       ██        ██               ██            ██			         ██████████████████████████");
		System.out.println("█   ██      ██        ████           ████            ██			         ██████████████████████████");
		System.out.println("█   ██      ██        ██  ██       ██  ██            ██			         ██████████████████████████");
		System.out.println(" █████      ██        ██    ██   ██     ██           ██			          ████████████▓▓▓▓█████████");
		System.out.println("    ██      ██        ██      ██       ██           ██			          ███████▓▓▓▓▓    ▓████████");
		System.out.println("    ██      ██        ██     ██        ██           ██			         █████▓▓▓          ▓████████");
		System.out.println("  ██        ██        ████████   ██████  ██         ██			         ███▓▓██            ▓▓██████");
		System.out.println("  ██        ██        ██      ███      ████         ██			        ███▓ ███             █▓▓▓████");
		System.out.println("██        ██          ██         ██████  ██          █			        ███  ███             ███  ███");
		System.out.println("██      ██          ███████████████      ██          █			       ███    ██             ███   ██");
		System.out.println("██ ██ ███          ██             ███████  ██         █			       ██     ███            ██    ██");
		System.out.println(" ███████           ██                      ██        ██			      ███      ██           ███    ██");
		System.out.println("     ██  ██  ██  ██ █                      ██          ██		     ███       ██           ██     ██");
		System.out.println("      ████  █   █  ██                      ██            █		     ██         ██         ██      ██");
		System.out.println("       ██   █   █  █                        ██ █  ██  ██  █		    ███         ██        ███      ██");
		System.out.println("         ██████████                          ██ █ ████████		 彡███        彡███      彡███    彡███");
		System.out.println("****************************************************************************************************************************************************************************");
		System.out.println("****************************************************************************************************************************************************************************");
		System.out.println("*************************************************************************█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█*****************************************************************************");
		System.out.println("*************************************************************************█░░╦ ╦╔╗╦ ╔╗╔╗╔╦╗╔╗░░█*****************************************************************************");
		System.out.println("*************************************************************************█░░║║║╠ ║ ║ ║║║║║╠ ░░█*****************************************************************************");
		System.out.println("*************************************************************************█░░╚╩╝╚╝╚╝╚╝╚╝╩ ╩╚╝░░█*****************************************************************************");
		System.out.println("*************************************************************************█▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄█*****************************************************************************");
		System.out.println("****************************************************** P L E A S E * P R E S S * E N T E R * T O * C O N T I N U E *********************************************************");
		System.out.println("****************************************************************************************************************************************************************************");
		System.out.println("****************************************************************************************************************************************************************************");
		String contin = scanStr.nextLine();
	}
	// Complete menu.
	public void showMenu() {
		Calendar c1 = GregorianCalendar.getInstance();
		System.out.println("																		" + c1.getTime().toLocaleString() + "																		");
		System.out.println("____________________________________________________________________________________________________________________________________________________________________________");
		System.out.println("|                                                                                                                                                                          |");
		System.out.println("|                                                                              OPTIONS MENU                                                                                |");
		System.out.println("|                                                                    CHOOSE AN OPTION WITH THE NUMBER                                                                      |");
		System.out.println("|__________________________________________________________________________________________________________________________________________________________________________|");
		System.out.println("|                  |                  |                  |                  |                  |                  |                  |                  |                  |");
		System.out.println("| Register a client|    Hospitalize   |     Report of    |    Consult the   |  Calculate the   |    Discharge     |  Hospitalization |    Mini rooms    |        GET       |");
		System.out.println("|   and his pets   |       a pet      |  medical records |  owner's contact |   cost of the    |      a pet       |      income      |    information   |        OUT       |");
		System.out.println("|                  |                  |                  |    information   | hospitalization  |                  |                  |                  |                  |");
		System.out.println("|         1        |        2         |        3         |        4         |        5         |        6         |        7         |        8         |         0        |");
		System.out.println("|__________________|__________________|__________________|__________________|__________________|__________________|__________________|__________________|__________________|");
		System.out.println("|                  |                  |                  |                  |                  |                  |                  |                  |                  |");
		System.out.println("|    Register a    |   Consult pet    |  Clients whitout |      Remove      |    inactivate    |      Report      |                  |                  |                  |");
		System.out.println("|     new Pet      |   information    |       pets       |      a pet       |     a client     |        all       |                  |                  |                  |");
		System.out.println("|                  |                  |                  |                  |                  |                  |                  |                  |                  |");
		System.out.println("|         9        |        10        |         11       |        12        |        13        |        14        |                  |                  |                  |");
		System.out.println("|__________________|__________________|__________________|__________________|__________________|__________________|__________________|__________________|__________________|");		
	}
	// Options of the menu.
	public void selectOption() {
		boolean back = false;
		while (!back) {
			showMenu();
			try {
				int option = scanInt.nextInt();
				scanInt.nextLine();
				switch (option) {
					case 1:
						registerAClient();
					break;
					case 2:
						hospitalizeAPet();
					break;
					case 3:
						reportsMedicalRecords();
					break;
					case 4:
						consultContactInformation();
					break;
					case 5:
						calculateHospitalizationCost();
					break;
					case 6:
						dischargeAPet();
					break;
					case 7:
						hospitalizationIncome();
					break;
					case 8:
						miniRoomsInformation();
					break;
					case 0:
						System.out.print("\033[H\033[2J");  
    					System.out.flush(); 
						back = true;
					break;
					case 9:
						registerAPet();
					break;
					case 10:
						showPetInformation();
					break;
					case 11:
						showClientsWithOut();
					break;
					case 12:
						removeAPet();
					break;
					case 13:
						inactivateAclient();
					break;
					case 14:
						reportAll();
					break;
					default:
						System.out.println("Only numbers between 0 and 14");
				}
			} catch (InputMismatchException e) {
            	System.out.println("You have to write a number");
            	scanInt.nextLine();
            }
		}
	}
	// Register a client and his pets.
	public void registerAClient() {
		System.out.println("Name:");
		String name = scanStr.nextLine();
		System.out.println("ID:");
		int id = scanInt.nextInt();
		scanInt.nextLine();
		System.out.println("Direction:");
		String direction = scanStr.nextLine();
		System.out.println("Phone:");
		String phone = scanStr.nextLine();
		boolean active = true;
		shop.addClient(name, id, direction, phone, active);
		Person z = new Person(name, id, direction, phone, active);
		System.out.println("How many pets do you have?");
		int amount = scanInt.nextInt();
		for (int i=0;i<amount-1;i++) {
			System.out.println("Now register the pet");
			System.out.println("Name:");
			String petName = scanStr.nextLine();
			System.out.println("Animal Type:(please, write 1 for dogs, 2 for cats, 3 for birds and 4 for other)");
			int animalType = scanInt.nextInt();
			scanInt.nextLine();
			System.out.println("Weight:");
			double weight = scanDou.nextDouble();
			scanDou.nextLine();
			System.out.println();
			String race = scanStr.nextLine();
			System.out.println("Birthdate");
			System.out.println("Day:");
			int day = scanInt.nextInt();
			scanInt.nextLine();
			System.out.println("Month: (in numbers)");
			int month = scanInt.nextInt();
			scanInt.nextLine();
			System.out.println("Year:");
			int year = scanInt.nextInt();
			scanInt.nextLine();
			DateP x = new DateP(day, month, year);
			System.out.println(shop.addPet(petName, animalType, weight, race, x, name));//AYUDA
			shop.addAnimal(petName, animalType, weight, race, x);//ADYUA
		}
	}
	// hospitalice a pet.
	public void hospitalizeAPet() {		
		if (shop.verifyMiniRooms()) {
			System.out.println("Entry day:");
			System.out.println("Day");
			int day = scanInt.nextInt();
			scanInt.nextLine();
			System.out.println("Month");
			int month = scanInt.nextInt();
			scanInt.nextLine();
			System.out.println("Year");
			int year = scanInt.nextInt();
			scanInt.nextLine();
			DateP x = new DateP(day, month, year);
			System.out.println("What pet do you want to hospitalize");
			System.out.println("Please write one of this pets names:");
			System.out.println(shop.petNames());
			String current = scanStr.nextLine();
			System.out.println("who's the owner?");
			System.out.println(shop.personNames()); 
			String name = scanStr.nextLine();
			shop.assignRoom(shop.choosePet(current));
			shop.hospitalizeAPet(x, shop.choosePerson(name), shop.choosePet(current), true);
		}else {
			System.out.println("There is no mini rooms aible");
		}
	}
	// reports of the medical records
	public void reportsMedicalRecords() {
		System.out.println("for what pet do you want see the report?");
		System.out.println(shop.petNames());
		String current = scanStr.nextLine();
		System.out.println(shop.medicalRecords(current));

	}
	// consult contact information
	public void consultContactInformation() {
		System.out.println("For see contact information of the owner of:");
		System.out.println("1. Person  ||  2. Pet");
		try {
			int option = scanInt.nextInt();
			scanStr.nextInt();
			switch (option) {
				case 1:
					personOption();
				break;
				case 2:
					petOption();
				break;
				default:
					System.out.println("Only numbers between 1 and 2");
			}
		} catch (InputMismatchException e) {
				System.out.println("You have to write a number");
				scanInt.nextLine();
		}	
	}
	// for the person choose
	public void personOption() {
		System.out.println("Please write one of this names:");
		System.out.println(shop.personNames()); 
		String current = scanStr.nextLine();
		System.out.println(shop.choosePersonInformation(current));
	}
	// for the pet choose
	public void petOption() {
		System.out.println("Please write one of this names:");
		System.out.println(shop.petNames());
		String current = scanStr.nextLine();
		System.out.println(shop.choosePetOwnerInformation(current));
	}
	// calculate hospitalization cost
	public void calculateHospitalizationCost() {
		System.out.println("Please write one of this names:");
		System.out.println(shop.petNames());
		String current = scanStr.nextLine();

	}
	// to discharge a pet
	public void dischargeAPet() {
		System.out.println("Please write one of this pets names:");
		System.out.println(shop.petNames());
		String current = scanStr.nextLine();
		System.out.println("Choose the amount of medicine that have the animal");
		int amount = scanInt.nextInt();
		scanInt.nextLine();
		for (int i=0;i<amount-1;i++) {
			System.out.println("choose the medicine:");
			System.out.println(shop.drugNames());
			int choose = scanInt.nextInt();
			scanInt.nextLine();
			shop.addMed(current, choose);
		}
		System.out.println(shop.dischargeAPet(current));
	}
	// total hospitalization income
	public void hospitalizationIncome() {
		System.out.println(shop.totalIncome());
	}
	// minirooms information
	public void miniRoomsInformation() {
		System.out.println(shop.roomsInformation());
	}
	// regist a new pet
	public void registerAPet() {
		System.out.println("who's the owner?");
		System.out.println(shop.personNames()); 
		String name = scanStr.nextLine();
		System.out.println("Now register the pet");
		System.out.println("Name:");
		String petName = scanStr.nextLine();
		System.out.println("Animal Type:(please, write 1 for dogs, 2 for cats, 3 for birds and 4 for other)");
		int animalType = scanInt.nextInt();
		scanInt.nextLine();
		System.out.println("Weight:");
		double weight = scanDou.nextDouble();
		scanDou.nextLine();
		System.out.println();
		String race = scanStr.nextLine();
		System.out.println("Birthdate");
		System.out.println("Day:");
		int day = scanInt.nextInt();
		scanInt.nextLine();
		System.out.println("Month: (in numbers)");
		int month = scanInt.nextInt();
		scanInt.nextLine();
		System.out.println("Year:");
		int year = scanInt.nextInt();
		scanInt.nextLine();
		DateP x = new DateP(day, month, year);
		System.out.println(shop.addPet(petName, animalType, weight, race, x, name));
		shop.addAnimal(petName, animalType, weight, race, x);
	}
	// clients with out pets
	public void showClientsWithOut() {
		System.out.println(shop.withOut());
	}
	// remove a pet
	public void removeAPet() {
		System.out.println("Please write one of this pets names:");
		System.out.println(shop.petNames());
		String current = scanStr.nextLine();
		System.out.println("who's the owner?");
		System.out.println(shop.personNames()); 
		String name = scanStr.nextLine();
		System.out.println(shop.eliminateAPet(current, name));
	}
	// inactivate a client
	public void inactivateAclient() {
		System.out.println("Please write one of this names:");
		System.out.println(shop.personNames()); 
		String current = scanStr.nextLine();
		System.out.println(shop.inactive(current));
	}
	// pets information
	public void showPetInformation() {
		System.out.println("Please write one of this pets names:");
		System.out.println(shop.petNames());
		String current = scanStr.nextLine();
		System.out.println(shop.petInformation(current));
	}
	// report all information
	public void reportAll() {
		System.out.println(shop.reportAll());
	}
}