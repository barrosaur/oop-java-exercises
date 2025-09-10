import java.util.Scanner;

public class LE13 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    double bmr_female, bmr_male;

    System.out.println("LE13. Chocolate Bars\n");

    System.out.print("Enter weight (lbs): ");
    float weight = s.nextFloat();
    s.nextLine();
    System.out.print("Enter height (in): ");
    float height = s.nextFloat();
    s.nextLine();
    System.out.print("Enter age (yrs): ");
    int age = s.nextInt();

    bmr_female = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
    bmr_male = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);

    System.out.printf("The number of chocolate bars a female can consume: %d\n", (int) bmr_female / 230);
    System.out.printf("The number of chocolate bars a male can consume: %d\n", (int) bmr_male / 230);
  }
}
