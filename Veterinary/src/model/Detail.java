package model;

import java.util.ArrayList;
import java.time.*;
import java.util.*;
import java.time.temporal.ChronoUnit;

public class Detail {

	//----------------------------------------------------------------------
	// Constants
	//----------------------------------------------------------------------
	public final static int MINS_IN_A_DAY = 1440;

	//----------------------------------------------------------------------
	// Atributes
	//----------------------------------------------------------------------
	private String sympton;
	private String diagnostic;

	//----------------------------------------------------------------------
	// Relations
	//----------------------------------------------------------------------
	private DateP enter;
	private Pet visit;
	private ArrayList<Medicine> drug;
	

	// Constructor
	public Detail(String sympton, String diagnostic, DateP enter, Pet hist) {
		this.sympton = sympton;
		this.diagnostic = diagnostic;
		this.enter = enter;
		drug = new ArrayList<Medicine>();
	}
	
	//----------------------------------------------------------------------
	// Methods
	//----------------------------------------------------------------------

	// return the sympton.
	public String getSympton() {
		return sympton;
	}

	// param sympton the sympton to set.	
	public void setSympton(String sympton) {
		this.sympton = sympton;
	}

	// return the diagnostic.	
	public String getDiagnostic() {
		return diagnostic;
	}

	// param diagnostic the diagnostic to set.	
	public void setDiagnostic(String diagnostic) {
		this.diagnostic = diagnostic;
	}

	// return the enter.	
	public DateP getEnter() {
		return enter;
	}

	// param enter the enter to set.	
	public void setEnter(DateP enter) {
		this.enter = enter;
	}

	// reurn the visit.
	public Pet getVisit() {
		return visit;
	}

	// param visit the visit to set.
	public void setVisit(Pet visit) {
		this.visit = visit;
	}
	
	public double calculateCost() {
		double totalCost = 0;
		double parcialCost = 0;
		double mediCost = 0;
		int days = 0;
		int mins = 0;
		if (visit.getAnimalType() == Pet.CAT) {
			if (visit.getWeight()>=1 && visit.getWeight()<=3) {
				parcialCost = 10000;
			}else if (visit.getWeight()>3 && visit.getWeight()<=10) {
				parcialCost = 12000;
			}else if (visit.getWeight()>10 && visit.getWeight()<=20) {
				parcialCost = 15000;
			}else if (visit.getWeight()>20) {
				parcialCost = 20000;
			}
		}else if (visit.getAnimalType() == Pet.DOG) {
			if (visit.getWeight()>=1 && visit.getWeight()<=3) {
				parcialCost = 15000;
			}else if (visit.getWeight()>3 && visit.getWeight()<=10) {
				parcialCost = 17000;
			}else if (visit.getWeight()>10 && visit.getWeight()<=20) {
				parcialCost = 20000;
			}else if (visit.getWeight()>20) {
				parcialCost = 25000;
			}
		}else if (visit.getAnimalType() == Pet.BIRD) {
			if (visit.getWeight()>=1 && visit.getWeight()<=3) {
				parcialCost = 10000;
			}else if (visit.getWeight()>3 && visit.getWeight()<=10) {
				parcialCost = 12000;
			}else if (visit.getWeight()>10 && visit.getWeight()<=20) {
				parcialCost = 20000;
			}else if (visit.getWeight()>20) {
				parcialCost = 25000;
			}
		}else {
			if (visit.getWeight()>=1 && visit.getWeight()<=3) {
				parcialCost = 10000;
			}else if (visit.getWeight()>3 && visit.getWeight()<=10) {
				parcialCost = 17000;
			}else if (visit.getWeight()>10 && visit.getWeight()<=20) {
				parcialCost = 30000;
			}else if (visit.getWeight()>20) {
				parcialCost = 33000;
			}
		}
		LocalDate enterDay = LocalDate.of(enter.getYear(), enter.getMonth(), enter.getDay());
		LocalDate today = LocalDate.now();
		long day = ChronoUnit.DAYS.between(enterDay, today);
		days = (int)day;
		parcialCost = parcialCost * days;
		mins = days * MINS_IN_A_DAY;
		for (int i = 0;i<drug.size();i++) {
			mediCost += drug.get(i).getCostPerDose() * (mins / drug.get(i).getFrecuency());
		} 
		totalCost = parcialCost + mediCost;
		return totalCost;
	}

	public String drugsName(){
		String msg = "";
		if (drug.isEmpty()) {
			msg = "The animal doesn't need medicine.\n";
		}else {
			msg += "The prescribed medicines are : ";
			for (int i = 0;i < drug.size();i++) {
				msg += "|\t\t-" + drug.get(i).getName() + ".\n";
			}

		}
		return msg;
	}

	public String drugsInformation(){
		String msg = "";
		if (!drug.isEmpty()){
			msg += "|\tThe information about the medicines is:\n" ;
			for (int i = 0 ; i < drug.size() ; i++ ) {
				msg += drug.get(i).toString();
				msg += "|_________________________________________________________________________________________\n";
			}
		}else {
			msg = "";
		}
		return msg;
	}

	public void addMed(int choose) {
		switch(choose){
		 	case 1:
		 		drug.add(new Medicine("Meloxic", 10, 11900.0, 360));
		 	break;
		 	case 2:
		 		drug.add(new Medicine("Baxidin", 120, 17100.0, 720));
		 	break;
		 	case 3:
		 		drug.add(new Medicine("Dermosyn", 50, 24300, 480));
		 	break;
		 	case 4:
		 		drug.add(new Medicine("BraVecto", 100000, 66000.0, 2880));
		 	break;
		 	case 5:
		 		drug.add(new Medicine("Thyro Tabs", 25, 55700.0, 60));
		 	break;
		 	case 6:
		 		drug.add(new Medicine("Urofox", 30, 52600, 1440));
		 	break;
		 }
	}

	// show the String of this method
	public String toString() {
		String msg = "";
		msg += "__________________________________________________________________________________________\n";
		msg += "|\tEntry date: " + enter.toString() + ".\n";//NECESITO QUE CUANDO ENTRE ME DE FECHA DE ENTRADA
		msg += "|\tThe pet's symptoms are: " +  sympton + ".\n";
		msg += "|\tThe possible diagnosis of the pet is: " + diagnostic + ".\n";
		msg += "|\tThe prescription medications are: " + drugsName() + ".\n";
		
		return msg;
	}
}