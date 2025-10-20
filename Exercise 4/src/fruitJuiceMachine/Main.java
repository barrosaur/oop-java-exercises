package fruitJuiceMachine;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean isRunning = true;
		Scanner scanner = new Scanner(System.in);
		
		DispenserType appleJuice = new DispenserType(30,45, "Apple Juice");
		DispenserType orangeJuice = new DispenserType("Orange Juice");
		DispenserType mangoLassi = new DispenserType(60,30, "Mango Lassi");
		DispenserType fruitPunch = new DispenserType("Fruit Punch");
		
		CashRegister cReg = new CashRegister(1000);
		
		while(isRunning) {
			System.out.println("\nWelcome to Ell's Fruit Juice Shop!");
			System.out.println("\nWhat would you like to do?");
			System.out.println("[1] - Buy Juice\n[2] - Exit shop");
			System.out.print("Your choice? ");
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1: {
				System.out.println("\nWhat would you like?");
				showSelection();
				System.out.print("\nEnter choice: ");
				int selection = scanner.nextInt();
				
				switch(selection) {
				case 1:
					sellProduct(appleJuice, cReg);
					break;
				case 2:
					sellProduct(orangeJuice, cReg);
					break;
				case 3:
					sellProduct(mangoLassi, cReg);
					break;
				case 4:
					sellProduct(fruitPunch, cReg);
					break;
				}
				
				break;
			}
			case 2: {
				System.out.println("\nExiting shop...");
				isRunning = false;
				break;
			}
			default:
				System.out.println("\nInvalid Choice");
			}
		}
		
		scanner.close();
	}
	
	private static void showSelection() {
		System.out.println("[1] - Apple Juice");
		System.out.println("[2] - Orange Juice");
		System.out.println("[3] - Mango Lassi");
		System.out.println("[4] - Fruit Punch");
	}
	
	private static void sellProduct(DispenserType item, CashRegister cReg) {
		int tries = 0;
		Scanner scanner = new Scanner(System.in);
		
		if(item.getNoOfItems() == 0) {
			System.out.println("Sold out");
			return;
		} else {
			while(tries < 2) {
				
				System.out.println("Cost: " + item.getCost());
				System.out.print("\nEnter payment: ");
				int payment = scanner.nextInt();
				
				if(payment == item.getCost()) {
					item.makeSale();
					cReg.acceptAmount(payment);
					System.out.println("Enjoy your " + item.getName() + "!\n");
					break;
				} else {
					if(payment < item.getCost()) {
						System.out.println("\nPayment insufficient: " + (item.getCost() - payment) + " missing");
						tries++;
					} else if(payment > item.getCost()) {
						int change = payment - item.getCost();
						System.out.println("\nYour change: " + change);
						cReg.acceptAmount(item.getCost());
						System.out.println("Enjoy your " + item.getName() + "!");
						break;
					}
				}
			}
			if(tries >= 2) {
				System.out.println("Transaction failed. Returning money...");
				System.out.println("Thank you!");
			}
			
		}
	
	}

}
