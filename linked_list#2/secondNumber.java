import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.add(3);
    list.add(1);
    list.add(5);
    list.add(2);
    list.add(4);
    int min = Integer.MAX_VALUE;
    for (int x : list) {
      if (x < min) {
        min = x;
      }
    }

    list.removeFirstOccurrence(min);
    list.addFirst(min);
    System.out.println(list);
  }
}
