package carRental;

public class Rental {
	private Car carBorrowed;
	private double rate;
	private Customer customer;
	private double finalPrice;
	
	public Rental(Customer cstmr, Car car) {
		this.carBorrowed = car;
		this.customer = cstmr;
		this.rate = setCarPrice();
		setFinalPrice();
	}
	
	public void setFinalPrice() {
		this.finalPrice = customer.getNumDaysBorrowed() * rate;
	}
	
	public double getFinalPrice() {
		return this.finalPrice;
	}
	
	public double getCarRate() {
		return this.rate;
	}
	
	private double setCarPrice() {
		switch(carBorrowed.getCarType().toLowerCase()) {
		case "truck":
			rate = 500.00;
			break;
		case "van":
			rate = 1250.00;
			break;
		case "suv":
			rate = 855.00;
			break;
		case "sport":
			rate = 2500.00;
			break;
		}
		
		return rate;
	}
	
	public void printReceipt() {
		System.out.println("\n=========== OFFICIAL RECEIPT ===========");
		System.out.println("Customer name: " + customer.getCustomerName());
		System.out.println("Car Borrowed: " + customer.getCarBorrowed());
		System.out.println("Number of days borrowed: " + customer.getNumDaysBorrowed());
		System.out.println("Car rate: P" + getCarRate());
		System.out.println("Total price: P" + getFinalPrice());
		System.out.println("========================================\n");
	}
}
