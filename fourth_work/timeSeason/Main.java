public class Main {
    enum TimeSeason {
        SUMMER("20"),
        WINTER("@2"),
        SPRING("22"),
        AUTUMN("22");
        String currency;

        TimeSeason(String currency) {
            this.currency = currency;
        }
    }
    public static void main(String[] args) {
        enum Winter {
            COLD,
            WINTER,
            WHITE
        }
        Winter[] winter = Winter.values();
        for (Winter i : winter) {
            System.out.println(i);
        }
        new Initcialiation(TimeSeason.AUTUMN).detectedTimeSeason();


        new Initcialiation(TimeSeason.valueOf("SPRING").currency);
        new Initcialiation(TimeSeason.SUMMER).getDescription();
        for (TimeSeason country : TimeSeason.values()) {
            System.out.println(country + ", " + country.currency);
        }
    }

}
class Initcialiation {
    static String timeSeason;
    static String midleTempreture;
    Initcialiation(Main.TimeSeason timeSeason) {
        Initcialiation.timeSeason = String.valueOf(timeSeason);
    }
    public void getDescription() {
        switch (midleTempreture) {
            case ("SUMMER"):
                System.out.println("Теплое время года");
            case ("WINTER"):
                System.out.println("Холодное время года");
        }
    }

    public Initcialiation(String spring) {
        Initcialiation.midleTempreture = String.valueOf(spring);
        System.out.println(midleTempreture);
    }

    public static void detectedTimeSeason() {
        switch (timeSeason) {
            case ("SPRING"):
                System.out.println("Я люблю весну");
                break;
            case ("WINTER"):
                System.out.println("Я люблю зиму");
            case ("SUMMER"):
                System.out.println("Я люблю лето");
            case ("AUTUMN"):
                System.out.println("Я люблю осень");

        }
        }
    }
