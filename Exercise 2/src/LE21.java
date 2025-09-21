import java.util.Scanner;

public class LE21 {
  public static void main(String args[]) {
    System.out.println("LE21 Day of the Week.\n");
    Scanner s = new Scanner(System.in);

    // h - day of the week
    // q - day of month
    // m - month
    // j - year / 100
    // k year % 100 - century

    System.out.print("Enter year: ");
    int year = s.nextInt();
    System.out.print("Enter month (1-12): ");
    int month = s.nextInt();
    System.out.print("Enter day of month (1-31): ");
    int dayOfMonth = s.nextInt();

    if(month == 1) {
      month = 13;
      year -= 1;
    } else if (month == 2) {
      month = 14;
      year -= 1;
    }

    int dayOfWeek = (dayOfMonth + ((26 * (month + 1)) / 10) + (year % 100) + ((year%100)/4) + ((year / 100) / 4) + (5 * (year / 100))) % 7;
    System.out.print("Day of the week: ");

    switch(dayOfWeek) {
      case 0: {
        System.out.print("Saturday\n");
        break;
      }
      case 1: {
        System.out.println("Sunday\n");
        break;
      }
      case 2: {
        System.out.println("Monday\n");
        break;
      }
      case 3: {
        System.out.println("Tuesday\n");
        break;
      } case 4: {
        System.out.println("Wednesday\n");
        break;
      }
      case 5: {
        System.out.println("Thursday\n");
        break;
      }
      case 6: {
        System.out.println("Friday\n");
        break;
      }
      default: {
        System.out.println("Invalid!");
      }
    }

    s.close();
  }
}
