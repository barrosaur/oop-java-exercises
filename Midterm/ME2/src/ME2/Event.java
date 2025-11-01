package ME2;

public class Event {
	public final static int pricePerGuest = 35;
	public final static int maxGuest = 50;
	private String eventNum;
	private int numOfGuests;
	private double price;
	
	public Event() {
		this.eventNum = "A000";
		this.numOfGuests = 0;
		this.price = setGuests(this.numOfGuests);
	}
	
	public Event(String eventNum, int numGuest) {
		this.eventNum = eventNum;
		this.numOfGuests = numGuest;
		this.price = setGuests(numGuest);
	}
	
	public String getEventNum() {
		return this.eventNum;
	}
	
	public int getNumOfGuests() {
		return this.numOfGuests;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setEventNum(String eventNum) {
		this.eventNum = eventNum;
	}
	
	public double setGuests(int numGuest) {
		if(numGuest > maxGuest) {
			System.out.println("Guest number exceeded");
			return 0;
		}
		
		this.numOfGuests = numGuest;
		return numGuest * pricePerGuest;
	}
}
