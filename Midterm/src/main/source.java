// Ibrahim Useinovski
// OOP Lewis
// 2/27/23
// Midterm Project to show what we have learned since the beginning of the class

package main;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class source {

	public static void main(String[] args) {
		// Initialize/ declare variables, scanners, array list etc.

		Scanner sn = new Scanner(System.in);
		ArrayList<Object> listOfWorkers = new ArrayList<Object>();
		int numOfWorkers;
		int typeOfWorker;
		int shift;
		double rate;
		double hours;
		int number;
		String name = "";
		String date;
		double annualSalary;
		double bonus;
		int decision;
		String fileName;
		

		// Ask user how many workers to add

		System.out.println("How many workers would you like to add?");
		numOfWorkers = sn.nextInt();

		// Ask user information about the worker, store into object, then add to list

		for (int i = 0; i < numOfWorkers; i++) {

			System.out.println("Add a Production Worker(1) or Shift Suporvisor(2)?");
			typeOfWorker = sn.nextInt();
			name = sn.nextLine();

			if (typeOfWorker == 1) {
				ProductionWorker temp = new ProductionWorker();

				System.out.println("Enter Name: ");
				name = sn.nextLine();

				System.out.println("Enter Worker Number: ");
				number = sn.nextInt();

				System.out.println("Enter Hire Date: ");
				date = sn.next();

				System.out.println("Enter Shift Type <1> day || <2> night");
				shift = sn.nextInt();

				System.out.println("Enter the hourly rate: ");
				rate = sn.nextDouble();

				System.out.println("Enter number of hours worked: ");
				hours = sn.nextDouble();

				temp.setName(name);
				temp.setHours(hours);
				temp.setNumber(number);
				temp.setDate(date);
				temp.setShift(shift);
				temp.setRate(rate);
				temp.setHours(hours);

				listOfWorkers.add(temp);

			} else {
				ShiftSupervisor temp2 = new ShiftSupervisor();

				System.out.println("Enter Name: ");
				name = sn.nextLine();

				System.out.println("Enter Worker Number: ");
				number = sn.nextInt();

				System.out.println("Enter Hire Date: ");
				date = sn.next();

				System.out.println("Enter annual salary: "); //
				annualSalary = sn.nextDouble();

				System.out.println("Enter bonus:  "); //
				bonus = sn.nextDouble();

				temp2.setName(name);
				temp2.setNumber(number);
				temp2.setDate(date);
				temp2.setSalary(annualSalary);
				temp2.setBonus(bonus);

				listOfWorkers.add(temp2);
			}

		}

		// Print out objects to console or file based on user decision

		System.out.println("Would you like to print to console <1> or file? <2>");
		decision = sn.nextInt();

		if (decision == 1) {
			for (Object o : listOfWorkers) {

				if (o instanceof ProductionWorker) {

					System.out.println("");
					System.out.println("");
					System.out.println("Full Name: " + (((ProductionWorker) o).getName()));
					System.out.println("Worker Number: " + (((ProductionWorker) o).getNumber()));
					System.out.println("Worker Type: Production Worker");
					System.out.println("Pay: " + (((ProductionWorker) o).calculatePay()));
				} else if (o instanceof ShiftSupervisor) {
					System.out.println("");
					System.out.println("");
					System.out.println("Full Name: " + (((ShiftSupervisor) o).getName()));
					System.out.println("Worker Number: " + (((ShiftSupervisor) o).getNumber()));
					System.out.println("Worker Type: Shift Supervisor");
					System.out.println("Anual Salary + Bonus: " + (((ShiftSupervisor) o).calculatePay()));
				}

			}
		}

		else if (decision == 2) {

			// Ask user for file name
			System.out.println("What would you like to name the file?");
			fileName = sn.next();

			try {
				PrintWriter out = new PrintWriter(new File(fileName));

				for (Object o : listOfWorkers) {

					if (o instanceof ProductionWorker) {

						out.println("");
						out.println("");
						out.println("Full Name: " + (((ProductionWorker) o).getName()));
						out.println("Worker Number: " + (((ProductionWorker) o).getNumber()));
						out.println("Worker Type: Production Worker");
						out.println("Pay: $" + (((ProductionWorker) o).calculatePay()));
					} else if (o instanceof ShiftSupervisor) {
						out.println("");
						out.println("");
						out.println("Full Name: " + (((ShiftSupervisor) o).getName()));
						out.println("Worker Number: " + (((ShiftSupervisor) o).getNumber()));
						out.println("Worker Type: Shift Supervisor");
						out.println("Anual Salary + Bonus: $" + (((ShiftSupervisor) o).calculatePay()));
					}

				}
				out.close();

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}