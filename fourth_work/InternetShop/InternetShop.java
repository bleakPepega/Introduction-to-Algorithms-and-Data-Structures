package number_4;

import java.io.InputStream;
import java.util.*;

public class InternetShop {
    public static void main(String[] args) {
      if (new User().auntification("user1", "1")) {
          new Collection().basket();
//        new Collection().buy("Book");
          new Collection().buy();
      }
      else System.out.println("Аунтификация провалена");

    }
}
class Collection {
    Map<String, Integer> map = new HashMap<>();
    ArrayList<String> busket = new ArrayList<String>();
    {
        Map<String, Integer> map = new HashMap<>();
        map.put("Book", 500);
        map.put("Clothes", 1000);
        map.put("Toy", 300);
        this.map = map;
    }
    void basket() {
        for (Map.Entry entry: map.entrySet()) {
            System.out.println("Товар: " + entry.getKey() + " Цена: " + entry.getValue().toString());
            }
        }
        void buy() {
            Scanner in = new Scanner( System.in);
            String stuf = in.nextLine();
            while (!Objects.equals(stuf, "exit")) {
                stuf = in.nextLine();

            for (Map.Entry entry: map.entrySet()) {
                if (Objects.equals(entry.getKey().toString(), stuf)) {
                    busket.add(stuf);
                    System.out.println("Ваша корзина: ");
                    busket.stream().forEach(it -> System.out.println(it));

                }
            }
            }
        }
}

class User {
    Map<String, String> map = new HashMap<>();
    {
        Map <String, String> map = new HashMap<>();
        map.put("pepega" ,"qwert1111");
        map.put("kekega", "1111111");
        map.put("user1", "1");
        this.map = map;
    }
    boolean auntification(String name, String password) {
        for (Map.Entry entry: map.entrySet()) {
            if (Objects.equals(entry.getValue().toString(), password) && Objects.equals(entry.getKey().toString(), name)) {
                return true;
            };

        }
        return false;
    }
}
