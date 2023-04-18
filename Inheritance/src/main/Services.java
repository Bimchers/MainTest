package main;

public class Services extends Customer{

	// member variables
	private
		double numberOfHours;
		double ratePerHour;
		
		
	// Constructors

	Services(){
		this.numberOfHours = 0;
		this.ratePerHour = 0;
	}
	
	Services(double hours, double rate){
		this.numberOfHours = hours;
		this.ratePerHour = rate;
	}
	
	// Setters
	
	void setHours(double hour) {
		this.numberOfHours = hour;
	}
	
	void setRate(double rate) {
		this.ratePerHour = rate;
	}
	
	// Getters

	public double getHours() {
		return this.numberOfHours;
	}
	public double getRate() {
		return this.ratePerHour;
	}
	
		
	public double calculateTotalSales() {
		return this.numberOfHours * this.ratePerHour;
	}
	
	@Override 
	public String toString() {
		return "Service Customer\nName: " + this.fullName + " \nCustomer DOB: " + this.DOB + 
				" \nCustomer Number: " + this.customerNum + " \nTotal Sales: $" + calculateTotalSales() + " " + " \nNumber of hours: "
			+ this.numberOfHours + " \nRate per hour: $" + this.ratePerHour;
	}
	
}

