package main;

public class Customer {
	
	// member variables
	
	protected String fullName;
	protected String DOB;
	protected int customerNum;
	
	// Constructors
	
	Customer(){
		//Customer a = new Customer();
		this.fullName = "Default Name";
		this.DOB = "00.00.0000";
		this.customerNum = 0;
	}
	
	Customer(String name, String birth, int num){
		//Customer a = new Customer();
		this.customerNum = num;
		this.DOB = birth;
		this.fullName = name;
	}
	
	// Setters
	
	void setName(String name){
		fullName = name;
	}
	
	void setDOB(String birth) {
		DOB = birth;
	}
	
	void setCustNum(int num) {
		customerNum = num;
	}
	

	// Getters
	
	public String getName() {
		return fullName;
	}
	
	public String getDOB() {
		return DOB;
	}
	
	public int getCustNum() {
		return customerNum;
	}
	
	
	
	@Override 
	public String toString() {
		return "Customer name: " + this.fullName + "Customer DOB: " + this.DOB + "Customer Number: " + this.customerNum + " ";
	}

	
}
