package arcade;

public class Player {
	private String name;
	private double balance;
	private int ticket;
	
	public Player(String name, double balance, int ticket) {
		this.name = name;
		this.balance = balance;
		this.ticket = ticket;
	}
	
	public Player(String name) {
		this.name = name;
		this.balance = 100.00;
		this.ticket = 0;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public int getTicket() {
		return this.ticket;
	}
	
	public void play(Game game) {
		this.balance -= game.getGameFee();
		this.ticket += game.getTicketReward();
	}
}
