import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    // Create a doubly linked list.
    LinkedList<Integer> list = new LinkedList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    // Create a new doubly linked list and insert the first element of the original list at the end.
    LinkedList<Integer> newList = new LinkedList<>();
    newList.add(list.removeFirst());
    newList.addAll(list);
    newList.addLast(newList.removeFirst());

    // Print the new doubly linked cyclic list.
    System.out.println(newList);
  }
}