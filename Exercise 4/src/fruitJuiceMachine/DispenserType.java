package fruitJuiceMachine;

public class DispenserType {
	private int numberOfItems, cost;
	
	public DispenserType() {
		this.numberOfItems = 50;
		this.cost = 50;
	}
	
	public DispenserType(int setNoOfItems, int setCost) {
		this.numberOfItems = setNoOfItems;
		this.cost = setCost;
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
}
