package work11;
final class ConvertableKt {
    public static void main() {
        String var0 = (new Convert(22.0)).convert();
        System.out.println(var0);
    }

    // $FF: synthetic method
    public static void main(String[] var0) {
        main();
    }
}

interface Convertable {
    double getTemp();

    String convert();


    public static final class DefaultImpls {
        public static String convert( Convertable $this) {
            return "Температура по фаренгейту: " + ($this.getTemp() * (double)9 / (double)5 + (double)32) + ", По кельвину: " + ($this.getTemp() + 273.15);
        }
    }
}

public final class Convert implements Convertable {
    private final double temp;

    public double getTemp() {
        return this.temp;
    }

    public Convert(double temp) {
        this.temp = temp;
    }

    public String convert() {
        return Convertable.DefaultImpls.convert(this);
    }
}

