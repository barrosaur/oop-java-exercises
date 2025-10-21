package carRental;

public class Customer {
	private String name;
	private int numDaysBorrowed;
	private String carBorrowed;
	
	public Customer(String name, Car car) {
		this.name = name;
		this.carBorrowed = car.getCarMake() + " " + car.getCarID();
	}
	
	public String getCustomerName() {
		return this.name;
	}
	
	public int getNumDaysBorrowed() {
		return this.numDaysBorrowed;
	}
	
	public String getCarBorrowed() {
		return this.carBorrowed;
	}
	
	public void setNumDaysBorrowed(int days) {
		this.numDaysBorrowed = days;
	}
}
