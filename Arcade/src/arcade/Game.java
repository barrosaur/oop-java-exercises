package arcade;

import java.util.Random;

public class Game {
	private String gameName;
	private int ticketReward, playsAvailable;
	private double gameFee;
	
	public Game(String name, int playsAvailable, double gameFee) {
		this.gameName = name;
		this.ticketReward = generateTcktRwrd();
		this.playsAvailable = playsAvailable;
		this.gameFee = gameFee;
	}
	
	public Game(String name) {
		this.gameName = name;
		this.ticketReward = generateTcktRwrd();
		this.playsAvailable = 3;
		this.gameFee = 30.00;
	}
	
	private int generateTcktRwrd() {
		Random r = new Random();
		int randNumTckt = r.nextInt(50);
		
		return randNumTckt;
	}
	
	public String getGameName() {
		return this.gameName;
	}
	
	public int getTicketReward() {
		return this.ticketReward;
	}
	
	public double getGameFee() {
		return this.gameFee;
	}
	
	public int getPlaysAvailable() {
		return this.playsAvailable;
	}
	
	public void playGame() {
		this.playsAvailable -= 1;
	}
}
