// Ibrahim Useinovski
// OOP
// 02/07/23
// Create a superclass and two other classes that derivce from the superclass. A customer class and services / supplies that 
// extends from class.
package main;
import java.util.ArrayList;
import java.util.Scanner;

public class source {

	public static void main(String[] args) {
		// Main method to call functions
		
		// Initialize Vairbales / Objects
		int numOfCustomers = 0;
		int servOrSupp = 0;
		int tempNum = 0;
		String tempLetter = "";
		ArrayList<Object> listOfCustomers = new ArrayList<Object>();
		Scanner en = new Scanner(System.in).useDelimiter("\n");
		
		
		
		// Ask first question to user
		System.out.println("How many Customers would you like to add?");
		numOfCustomers = en.nextInt();
		
		// Loop to show which customer is getting an object, will ask user to fill in all information 
		// for the current customer in loop
		for (int i = 0; i < numOfCustomers; i++) {
			System.out.println("For Customer " + (i+1) );
			System.out.println("What object would you like to put into the array? Service(1) or Supplies(2)");
			servOrSupp = en.nextInt();
			
			if (servOrSupp == 1) {
				Services userService = new Services();
				System.out.println("What is the number of hours?");
				tempNum = en.nextInt();
				userService.setHours(tempNum);
				
				System.out.println("What is the rate per hour?");
				tempNum = en.nextInt();
				userService.setRate(tempNum);
				
				System.out.println("What is the Customers Full Name?");
				tempLetter = en.next();
				userService.setName(tempLetter);
				System.out.println("What is the Customers DOB?");
				tempLetter = en.next();
				userService.setDOB(tempLetter);
				System.out.println("What is the Customers Number?");
				tempLetter = en.next();
				userService.setCustNum(tempNum); 
				
				listOfCustomers.add(userService);
				
			}
			else if (servOrSupp == 2) {
				Supplies userSupplies = new Supplies();
				System.out.println("What is the number of items?");
				tempNum = en.nextInt();
				userSupplies.setItems(tempNum);
				
				
				System.out.println("What is the price of the Item?");
				tempNum = en.nextInt();
				userSupplies.setPrice(tempNum);
				
				System.out.println("What is the Customers Full Name?");
				tempLetter = en.next();
				userSupplies.setName(tempLetter);
				System.out.println("What is the Customers DOB?");
				tempLetter = en.next();
				userSupplies.setDOB(tempLetter);
				System.out.println("What is the Customers Number?");
				tempLetter = en.next();
				userSupplies.setCustNum(tempNum);
				
				listOfCustomers.add(userSupplies);
				
			}
			// Make user try again if not 1 or 2	
		}
		
		
		// Loop to Print out information of each customer created
		for (Object o : listOfCustomers) {
			
			if (o instanceof Customer) {
				System.out.print((((Customer) o).toString()));
			}
//			 else if ( o instanceof Supplies) {
//				System.out.print("\tCustomer:  " + (((Customer) o).toString()));
//			}else if ( o instanceof Services) {
//				System.out.print("\tCustomer:  " + (((Customer) o).toString()));
//			}
			
			System.out.println("");
		}	
	}
}
