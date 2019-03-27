package model;

public class DateP {
	//----------------------------------------------------------------------
	// Constants
	//----------------------------------------------------------------------

	//----------------------------------------------------------------------
	// Atributes
	//----------------------------------------------------------------------
	private int day;
	private int month;
	private int year;

	//----------------------------------------------------------------------
	// Relations
	//----------------------------------------------------------------------
	
	// Constructor
	public DateP(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	//----------------------------------------------------------------------
	// Methods
	//----------------------------------------------------------------------

	// return the day.
	public int getDay() {
		return day;
	}
	
	// param day the day to set.
	public void setDay(int day) {
		this.day = day;
	}
	
	// return the month.
	public int getMonth() {
		return month;
	}
	
	// param month the month to set.
	public void setMonth(int month) {
		this.month = month;
	}
	
	// return the year.
	public int getYear() {
		return year;
	}

	// param year the year to set.
	public void setYear(int year) {
		this.year = year;
	}

	// show the String of this method
	public String toString() {
		String msg = "";
		msg += day + "/" + month + "/" + year ;
		return msg;
	}
}