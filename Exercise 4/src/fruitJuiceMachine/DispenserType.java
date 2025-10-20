package fruitJuiceMachine;

public class DispenserType {
	private int numberOfItems, cost;
	private String name;
	
	public DispenserType() {
		this.numberOfItems = 50;
		this.cost = 50;
		this.name = "";
	}
	
	public DispenserType(int setNoOfItems, int setCost, String name) {
		this.numberOfItems = setNoOfItems;
		this.cost = setCost;
		this.name = name;
	}
	
	public DispenserType(String name) {
		this.numberOfItems = 50;
		this.cost = 50;
		this.name = name;
	}
	
	public int getNoOfItems() {
		return this.numberOfItems;
	}
	
	public int getCost() {
		return this.cost;
	}
	
	public void makeSale() {
		this.numberOfItems--;
	}
	
	public String getName() {
		return this.name;
	}
}
