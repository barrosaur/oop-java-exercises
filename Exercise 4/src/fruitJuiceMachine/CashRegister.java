package fruitJuiceMachine;

public class CashRegister {
	private int cashOnHand;
	
	public CashRegister() {
		this.cashOnHand = 500;
	}
	
	public CashRegister(int cashIn) {
		this.cashOnHand = cashIn;
	}
	
	public int getCurrentBalance() {
		return this.cashOnHand;
	}
	
	public void acceptAmount(int amountIn) {
		this.cashOnHand += amountIn;
	}
}
