import java.util.Scanner;
public class First {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number A: ");
    int numA = scanner.nextInt();
    System.out.println("Enter a number B: ");
    int numB = scanner.nextInt();
    int result = numA*numB;
    System.out.println("The result of multiplication is: ");
    System.out.println(result);

  }
}