package main;

public class ShiftSupervisor extends Worker {
	
	double annualSalary;
	double annualProductionBonus;
	
	
	ShiftSupervisor(){
		
	}
	
	ShiftSupervisor(double salary, double bonus){
		this.annualSalary = salary;
		this.annualProductionBonus = bonus;
	}
	
	// Setters
	
	void setSalary(double salary) {
		this.annualSalary = salary;
	}
	
	void setBonus(double bonus) {
		this.annualProductionBonus = bonus;
	}
	
	// Getters
	
	double getBonus() {
		return this.annualProductionBonus;
	}
	
	double getSalary() {
		return this.annualSalary;
	}
	
	double calculatePay() {
		return this.annualSalary + this.annualProductionBonus;
	}

}
