import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int roads = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        int x = scanner.nextInt();

        if (x == 1) {
          roads++;
        }
      }
    }
    System.out.println(roads);
  }
}
