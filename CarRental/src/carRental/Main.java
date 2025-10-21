package carRental;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean isRunning = true;
		Scanner s = new Scanner(System.in);
		
		Car car1 = new Car("Toyota Supra", 2025, "Sport");
		Car car2 = new Car("Toyota Veloz", 2023, "Van");
		Car car3 = new Car("BYD Shark", 2020, "Truck");
		Car car4 = new Car("BYD Atto 3", 2022, "SUV");
		
		Car selected = null;
		Customer cstmr;
		
		while(isRunning) {
			System.out.println("\nRent a car!");
			System.out.println("Choose car:");
			showCars();
			System.out.print("Enter choice: ");
			int choice = s.nextInt();
			s.nextLine();
						
			// customer 
			System.out.print("\nEnter customer name: ");
			String name = s.nextLine();
			System.out.print("Number of days for car to be borrowed: ");
			int days = s.nextInt();
			s.nextLine();
			
			// statements for which car
			switch(choice) {
			case 1: {
				selected = car1; 
				break;
			}
			case 2: {
				selected = car2; 
				break;
			}
			case 3: {
				selected = car3; 
				break;
			}
			case 4: {
				selected = car4; 
				break;
			}
			}
			
			if(selected != null) {
				cstmr = new Customer(name, selected);
				cstmr.setNumDaysBorrowed(days);
				Rental rntl = new Rental(cstmr, selected);
				rntl.printReceipt();
			}
			
			isRunning = false;
			
		}
	}

	private static void showCars() {
		System.out.println("[1] Toyota Supra - Sport");
		System.out.println("[2] Toyota Veloz - Van");
		System.out.println("[3] BYD Shark - Truck");
		System.out.println("[4] BYD Atto 3 - SUV");
	}
}
