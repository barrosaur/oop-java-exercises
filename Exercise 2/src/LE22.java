import java.util.Scanner;
import java.util.Random;

public class LE22 {
  public static void main(String args[]) {
    System.out.println("LE22 Simulation: Heads or Tails\n");
    Scanner s = new Scanner(System.in);
    int flipTimes = 2000000;

    System.out.print("Start program? (y/n): ");
    String choice = s.nextLine();

    if(choice.equals('n')) {
      System.out.println("Exiting...");
      System.exit(0);
    }

    String[] coin = {"Head", "Tail"};
    int headCount = 0, tailCount = 0;
    Random r = new Random();

    for(int i = 0; i < flipTimes; i++) {
      int randIdx = r.nextInt(2);
      String result = coin[randIdx];

      if(result == "Head") {
        headCount++;
      } else if(result == "Tail") {
        tailCount++;
      }
    }

    System.out.println("Heads: " + headCount);
    System.out.println("Tails: " + tailCount);
  }
}
