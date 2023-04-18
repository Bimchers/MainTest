package main;

public class Supplies extends Customer{

	// member variables
	private
		double numberOfItems;
		double pricePerItem;
		
		
	// Constructors

	Supplies(){
		this.numberOfItems = 0;
		this.pricePerItem = 0;
	}
	
	Supplies(double items, double price){
		this.numberOfItems = items;
		this.pricePerItem = price;
	}
	// Setters
	
	void setItems(double items) {
		this.numberOfItems = items;
	}

	void setPrice(double price) {
		this.pricePerItem = price;
		
	}
		
	// Getters
	
	double getItems() {
		return this.numberOfItems;
	}
	double getPrice() {
		return this.pricePerItem;
	}
	
		
	public double calculateTotalSales() {
		return this.numberOfItems * this.pricePerItem;
	}
	
	@Override
	public String toString() {
		return "Supply Customer \nName: " + this.fullName + " \nCustomer DOB: " + this.DOB + 
				" \nCustomer Number: " + this.customerNum + " \nTotal Sales: $" + calculateTotalSales() + " " + " \nNumber of Items: "
			+ this.numberOfItems + " \nPrice per item: $" + this.pricePerItem;
	}
	
}
