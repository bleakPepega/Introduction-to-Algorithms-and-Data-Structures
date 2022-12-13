import java.util.Scanner;
import java.util.regex.Pattern;

public class StringManipulator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a string: ");
    String input = scanner.nextLine();

    System.out.println("Enter a regular expression: ");
    String regex = scanner.nextLine();

    String[] elements = input.split(regex);

    System.out.println("Elements: ");
    for (String element : elements) {
      System.out.println(element);
    }
  }
}