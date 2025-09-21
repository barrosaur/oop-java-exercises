import java.util.Scanner;

public class LE23 {
  public static void main(String args[]) {
    System.out.println("Decimal to Hexadecimal\n");
    Scanner s = new Scanner(System.in);

    System.out.print("Enter decimal: ");
    int decimal = s.nextInt();
    int remainder;
    String hex = "";
    StringBuilder hexFinal;

    while (decimal > 0) {
      remainder = decimal % 16;
      String hexChar;

      if(remainder < 10) {
        hexChar = String.valueOf(remainder);
      } else {
        hexChar = hexCharFunc(remainder);
      }

      hex += hexChar;
      decimal /= 16;
    }
    hexFinal = new StringBuilder(hex);
    System.out.println("Hexadecimal number: " + hexFinal.reverse());
  }

  private static String hexCharFunc(int remainder) {
    switch(remainder) {
      case 10: return "A";
      case 11: return "B";
      case 12: return "C";
      case 13: return "D";
      case 14: return "E";
      case 15: return "F";
    }
    return "";
  }
}
