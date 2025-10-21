package carRental;

import java.util.Random;

public class Car {
	private String carMake, carType, carID;
	private int carYear;
	
	public Car(String make, int year, String carType) {
		this.carMake = make;
		this.carYear = year;
		this.carType = carType.toLowerCase();
		this.carID = generateCarId(this.carType);
	}
	
	public String getCarMake() {
		return this.carMake;
	}
	
	public String getCarType() {
		return this.carType;
	}
	
	public int getCarYear() {
		return this.carYear;
	}
	
	public String getCarID() {
		return this.carID;
	}
	
	private String generateCarId(String carType) {
		Random r = new Random();
		int numID = r.nextInt(999999);
		String ID = null;
		
		switch(carType.toLowerCase()) {
		case "truck":
			ID = "TRK - " + String.valueOf(numID);
			break;
		case "van":
			ID = "VAN  - " + String.valueOf(numID);
			break;
		case "sport":
			ID = "SPRT - " + String.valueOf(numID);
			break;
		case "suv":
			ID = "SUV - " + String.valueOf(numID);
			break;
		default:
			System.out.println("\nERROR: Invalid Car Type.\n");
		}
		
		return ID;
	}
}
