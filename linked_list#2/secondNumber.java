import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    // Create a doubly linked list.
    LinkedList<Integer> list = new LinkedList<>();
    list.add(3);
    list.add(1);
    list.add(5);
    list.add(2);
    list.add(4);

    // Find the minimum value in the list.
    int min = Integer.MAX_VALUE;
    for (int x : list) {
      if (x < min) {
        min = x;
      }
    }

    // Remove the element with the minimum value from the list.
    list.removeFirstOccurrence(min);

    // Insert the element with the minimum value at the beginning of the list.
    list.addFirst(min);

    // Print the sorted doubly linked list.
    System.out.println(list);
  }
}