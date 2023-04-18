package main;

public abstract class Worker {
	
	protected
		String workerName = "Default Name";
		int workerNumber = 00;
		String hireDate = "00/00/0000";
		
		
		// Constructors
	
		Worker(){
			
		}
		
		Worker(String name, int number, String hire){
			workerName = name;
			workerNumber = number;
			hireDate = hire;
		}
		
		// Getters
		String getName(){
			return this.workerName;
		}
		
		int getNumber() {
			return this.workerNumber;
		}
		
		String getDate() {
			return this.hireDate;
		}
	
		// Setters
		
		void setName(String name) {
			this.workerName = name;
		}
		
		void setNumber(int number) {
			this.workerNumber = number;
		}
		void setDate(String date) {
			this.hireDate = date;
		}
		
		
		abstract double calculatePay();
		
}
