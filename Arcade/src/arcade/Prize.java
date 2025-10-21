package arcade;

public class Prize {
	private String prizeName;
	private int ticketCost;
	private int quantity;
	
	public Prize(String prizeName, int cost, int quantity) {
		this.prizeName = prizeName;
		this.ticketCost = cost;
		this.quantity = quantity;
	}
	
	public Prize(String prizeName) {
		this.prizeName = prizeName;
		this.ticketCost = 25;
		this.quantity = 5;
	}
	
	public String getPrizeName() {
		return this.prizeName;
	}
	
	public int getTicketCost() {
		return this.ticketCost;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public void redeem() {
		this.quantity -= 1;
	}
}
