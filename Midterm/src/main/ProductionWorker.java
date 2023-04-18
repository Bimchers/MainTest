package main;

public class ProductionWorker extends Worker{

	
	int shift; 
	double hourlyRate;
	double hoursWorked;
	
	
	
	// Constructors
	ProductionWorker(){
		
	}
	
	ProductionWorker(int shiftNum, double rate, double hours){
		this.shift = shiftNum;
		this.hourlyRate = rate;
		this.hoursWorked = hours;
	}
	
	// Setters
	
	void setShift(int shiftNum) {
		this.shift = shiftNum;
	}
	
	void setRate(double rate) {
		this.hourlyRate = rate;
	}
	
	void setHours(double hours) {
		this.hoursWorked = hours;
	}
	
	// Getters
	
	int getShift() {
		return this.shift;
	}
	
	double getRate() {
		return this.hourlyRate;
	}
	
	double getHours() {
		return this.hoursWorked;
	}
	

	
	double calculatePay() {
		double overTimeHours = 0;
		double overTimePay = 0;
		if (hoursWorked > 40) {
			overTimeHours = this.hoursWorked - 40;
			overTimePay = (overTimeHours * this.hourlyRate) * 2;
			return overTimePay + (this.hourlyRate * 40);
		}
		else 
			return this.hourlyRate * this.hoursWorked;
	}
	
}

