import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    LinkedList<Integer> newList = new LinkedList<>();
    newList.add(list.removeFirst());
    newList.addAll(list);
    newList.addLast(newList.removeFirst());

    System.out.println(newList);
  }
}
