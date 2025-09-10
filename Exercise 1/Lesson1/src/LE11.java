import java.util.Scanner;

public class LE11 {
  public static void main(String args[]) {
    System.out.println("LE11. Change Denomination\n");
    Scanner s = new Scanner(System.in);
    int quarter, dime, nickel, penny;

    System.out.print("Enter coin: ");
    int coins = s.nextInt();

    quarter = coins / 25;
    coins %= 25;

    dime = coins / 10;
    coins %= 10;

    nickel = coins / 5;
    nickel %= 5;

    // change this when u see the logic
    penny =  coins / 1;
    penny %= 1;

    System.out.println("Quarter: " + quarter);
    System.out.println("Dime: " + dime);
    System.out.println("Nickel: " + nickel);
    System.out.println("Penny: " + penny);
  }
}
