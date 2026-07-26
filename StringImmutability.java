import java.util.Scanner;

public class StringImmutability {

  public StringImmutability() {
    Scanner scanner = new Scanner(System.in);
    String string = "a";  // +1
    string = "aa";        // +1
    string = "aaa";       // +1
    string = "a";         // +0 (existing string)
    string = "aa";        // +0 (existing string)
    string = "bb";        // +1
    System.out.println(string);
    System.out.print("Press any key to exit: ");
    scanner.nextLine();
    scanner.close();
  }

  public static void main(String[] args) {
    new StringImmutability();
  }
}
