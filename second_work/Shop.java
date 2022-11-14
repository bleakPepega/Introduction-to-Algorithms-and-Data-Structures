package twolab;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.jetbrains.annotations.NotNull;


public final class Shop {
    @NotNull
    private final ArrayList comp;

    public Shop(@NotNull ArrayList comp) {
        this.comp = comp;
    }

    public final void add(@NotNull String name) {
        Collection var2 = (Collection)this.comp;
        var2.add(name);
    }

    public final void remove(@NotNull String name) {
        this.comp.remove(name);
    }

    public final String find(@NotNull String name) {
        @NotNull ArrayList test = this.comp;
        final Boolean[] flag = {false};
        test.stream().forEach((it) -> {
            if (it == name) {
                flag[0] = true;

            }
                ;}
                );
        if (flag[0]) {
            return "find";
        }
        else return "not find";
        }

}
class Tester2 {
    public static void main(String[] args) {
        Shop shop = new Shop( new ArrayList(List.of(new String[]{"1", "2", "3", "4", "pepega"})));
        System.out.println(shop.find("pepega"));
        shop.remove("pepega");
        System.out.println(shop.find("pepega"));

    }
}
