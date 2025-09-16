import java.util.Scanner;

public class LE12 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    System.out.println("LE12. Multiply The Digits\n");
    System.out.println();
    System.out.print("Enter a number between (0-1000): ");
    int num = s.nextInt();
    int digit_1, digit_2, digit_3;

    if(num == 1000) {
      System.out.println("1");
      System.out.println("0");
      System.out.println("0");
      System.out.println("0");
      System.out.println("The product of all digits in " + num + " is " + "0");
    } else if (num < 10) {
      System.out.println(num);
      System.out.println("The product of all digits in " + num + " is " + num);
    } else if (num < 100) {
      digit_1 = num % 10;
      digit_2 = num / 10;
      System.out.println(digit_1);
      System.out.println(digit_2);
      System.out.println("The product of all digits in " + num + " is " + (digit_1 * digit_2));
    } else {
      digit_1 = num / 100;
      digit_2 = ((num % 100) - (num % 10)) / 10;
      digit_3 = num % 10;

      System.out.println(digit_1);
      System.out.println(digit_2);
      System.out.println(digit_3);
      System.out.println("The product of all digits in " + num + " is " + (digit_1 * digit_2 * digit_3));
    }
  }
}
