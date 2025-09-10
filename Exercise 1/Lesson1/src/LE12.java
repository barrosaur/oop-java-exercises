import java.util.Scanner;

public class LE12 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    System.out.println("LE12. Multiply The Digits");
    System.out.println();
    System.out.print("Enter a number between (0-1000): ");
    int num = s.nextInt();

    int digit_1 = num / 100;
    int digit_2 = ((num % 100) - (num % 10)) / 10;
    int digit_3 = num % 10;

    System.out.println(digit_1);
    System.out.println(digit_2);
    System.out.println(digit_3);
    System.out.println("The product of all digits in " + num + " is " + (digit_1 * digit_2 * digit_3));

  }
}
