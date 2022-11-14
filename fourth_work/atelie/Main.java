package number3;

import java.util.Arrays;
import java.util.Objects;

public class Main {
    enum Closes {
        XXS("32"),
        XS("34"),
        S("36"),
        M("38"),
        L("40");

        public String hasCurrency() {
            if (Objects.equals(size, "32")) {
                return "Детсикй размер";
            } else if (Objects.equals(size, 40)) {
                return "Взролсый размер";

            }

            return "";
        }

        String size;

        Closes(String size) {
            this.size = size;
        }
    }
    public static void main(String[] args) {
        Clothes[] clothes = {new Tie("XXS", 22, "RED"), new Skirt("M", 1233, "blue"),
                new Pants("M", 1233, "blue"), new Tshirt("L", 1233, "blue")};
            new Atelier(clothes).dressMan();

        }
    }

interface menClothing {
    default String dressMan(String sizeClothes, int price, String color) {
        return womenClothing.Switch(sizeClothes, price, color);
    }
}
interface womenClothing {
    default String dressWoman(String sizeClothes, int price, String color) {
        return Switch(sizeClothes, price, color);
    }
    public static String Switch(String sizeClothes, int price, String color) {
        switch (sizeClothes) {
            case ("L"):
                return (Main.Closes.L + "  Взрослый размер" + " " + price + " " + color + "\n");
            case ("M"):
                return (Main.Closes.M + " " + price + " " + color + "\n");
            case ("S"):
                return (Main.Closes.S + " " + price + " " + color + "\n");
            case ("XS"):
                return (Main.Closes.XS + " " + price + " " + color + "\n");
            case ("XXS"):
                return (Main.Closes.XXS + "  Детский размер" + " " + price + " " + color + "\n");
        }
        return sizeClothes;
    }
}

    class Dress implements menClothing {
    }
    class DressWoman implements womenClothing {}

    abstract class Clothes {
        String size;
        int price;
        String color;

        Clothes(String size, int price, String color) {
            this.size = size;
            this.price = price;
            this.color = color;
        }
    }

    class Tshirt extends Clothes {

        Tshirt(String size, int price, String color) {
            super(size, price, color);
            menClothing dress = new Dress();
            dress.dressMan(super.size, super.price, super.color);
        }


    }

    class Pants extends Clothes {
        Pants(String size, int price, String color) {
            super(size, price, color);
            menClothing dress = new Dress();
            dress.dressMan(super.size, super.price, super.color);
        }
    }

    class Skirt extends Clothes {
        Skirt(String size, int price, String color) {
            super(size, price, color);
            womenClothing dress = new DressWoman();
            dress.dressWoman(super.size, super.price, super.color);
        }
    }

    class Tie extends Clothes {
        Tie(String size, int price, String color) {
            super(size, price, color);
            menClothing dress = new Dress();
            dress.dressMan(super.size, super.price, super.color);
        }
    }

    class Atelier {
    Clothes[] clothes;
    Atelier( Clothes[] clothes) {
        this.clothes = clothes;
    }

        public void dressMan() {
            Arrays.stream(clothes).forEach(it -> {
                if (!it.getClass().getSimpleName().equals("Skirt")) {
                    menClothing dress = new Dress();
                    System.out.println(dress.dressMan(it.size, it.price, it.color));
                }
            });
        }
        public void dressWoman() {
            Arrays.stream(clothes).forEach(it -> {
                if (!it.getClass().getSimpleName().equals("Tie")) {
                    womenClothing dress = new DressWoman();
                    System.out.println(dress.dressWoman(it.size, it.price, it.color));
                }
            });
        }

}
