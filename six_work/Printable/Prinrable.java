package Printable;

// WwwKt.java

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class WwwKt {
    public static final void main() {
        ArrayList q = new ArrayList(List.of(new Prinrable[]{(Prinrable) (new Book("www")), (Prinrable) (new Shoopp("wsww"))}));
        Iterator var2 = q.iterator();

        while(var2.hasNext()) {
            Prinrable i = (Prinrable)var2.next();
            i.print();
        }
    }

    public static void main(String[] var0) {
        main();
    }
}


public interface Prinrable {
    String getQ();

    void print();


    public static final class DefaultImpls {
        public static void print( Prinrable $this) {
            String var1 = $this.getQ();
            System.out.println(var1);
        }
    }
}



final class Book implements Prinrable {
    private final String q;

    public void print() {
        Prinrable.DefaultImpls.print(this);
    }

    public String getQ() {
        return this.q;
    }

    public Book( String q) {
        super();
        this.q = q;
    }
}
// Shoopp.java



final class Shoopp implements Prinrable {
    private final String q;

    public void print() {
        Prinrable.DefaultImpls.print(this);
    }

    public String getQ() {
        return this.q;
    }

    public Shoopp( String q) {
        super();
        this.q = q;
    }
}

