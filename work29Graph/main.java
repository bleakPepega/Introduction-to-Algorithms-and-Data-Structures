import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Read the number of cities.
    int n = scanner.nextInt();

    // Initialize the number of roads to 0.
    int roads = 0;

    // Read the connectivity matrix.
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        int x = scanner.nextInt();

        // If there is a road between city i and city j,
        // increment the number of roads.
        if (x == 1) {
          roads++;
        }
      }
    }

    // Print the number of roads.
    System.out.println(roads);
  }
}