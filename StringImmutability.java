import java.util.Scanner;

public class StringImmutability {

  public StringImmutability() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Press any key to exit: ");
    scanner.nextLine();
    scanner.close();
  }

  public static void main(String[] args) {
    new StringImmutability();
  }
}
