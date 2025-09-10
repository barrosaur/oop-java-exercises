import java.util.Scanner;

public class LE14 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("LE14. Distance between Two points\n");

    System.out.print("Enter x1 and y1: ");
    float x1 = s.nextFloat(), y1 = s.nextFloat();
    s.nextLine();
    System.out.print("Enter x2 and y2: ");
    float x2 = s.nextFloat(), y2 = s.nextFloat();

    double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

    System.out.println("The distance between the two points is " + distance);
  }
}
