import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.add(3);
    list.add(1);
    list.add(5);
    list.add(2);
    list.add(4);
    list.addLast(list.removeFirst());
    boolean sorted = false;
    while (!sorted) {
      sorted = true;
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

    System.out.println(list);
  }
}
