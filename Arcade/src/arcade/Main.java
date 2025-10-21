package arcade;

public class Main {

	public static void main(String[] args) {
		Game game1 = new Game("Mario Kart");
		Game game2 = new Game("Phasmophobia", 2, 35.00);
		Game game3 = new Game("Minecraft");
		
		Prize prize1 = new Prize("Keychain");
		Prize prize2 = new Prize("Laser", 50, 2);
		
		Player player1 = new Player("Skizz", 800.00, 100);
		
		player1.play(game3);
		
		System.out.println(player1.getBalance());
		System.out.println(player1.getTicket());
		prize1.redeem();
		System.out.println(prize1.getQuantity());
	}

}
