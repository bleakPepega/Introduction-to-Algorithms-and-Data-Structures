
interface Nameable {
    String getName();

    String getName1();


    public static final class DefaultImpls {
        public static String getName1( Nameable $this) {
            return $this.getName();
        }
    }
}
final class Car implements Nameable {
    private final String name;

    public String getName1() {
        return Nameable.DefaultImpls.getName1(this);
    }

    public String getName() {
        return this.name;
    }

    public Car( String name) {
        super();
        this.name = name;
    }
}

public final class InterfaceKt {
    public static void main(String[] args) {
        String var0 = (new Car("test")).getName1();
        System.out.println(var0);
    }

}
