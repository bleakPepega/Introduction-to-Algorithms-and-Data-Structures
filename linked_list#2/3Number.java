import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    // Create a doubly linked cyclic list.
    LinkedList<Integer> list = new LinkedList<>();
    list.add(3);
    list.add(1);
    list.add(5);
    list.add(2);
    list.add(4);
    list.addLast(list.removeFirst());

    // Sort the list using permutation of neighboring elements.
    boolean sorted = false;
    while (!sorted) {
      sorted = true;

      // Iterate over the list and permute each pair of neighboring elements.
      for (int i = 0; i < list.size() - 1; i++) {
        int x = list.get(i);
        int y = list.get(i + 1);
        if (x > y) {
          list.set(i, y);
          list.set(i + 1, x);
          sorted = false;
        }
      }
    }

    // Print the sorted doubly linked cyclic list.
    System.out.println(list);
  }
}