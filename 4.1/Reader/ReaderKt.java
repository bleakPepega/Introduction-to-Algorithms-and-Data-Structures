package z_book;


import java.util.Arrays;

public final class ReaderKt {
    public static final void main() {
        (new Reader("qq", 1, "ww", 22, 11)).returnBook("www", "wwwww", "wwwwwww");
    }

    // $FF: synthetic method
    public static void main(String[] var0) {
        main();
    }
}

final class Reader {
    private final String phio;
    private final int ticket;
    private final String fuculty;
    private final int date;
    private final int number;

    public final void takeBook(int countBook) {
        String var2 = this.phio + " взял " + countBook + " книг";
        System.out.println(var2);
    }

    public final void takeBook( String... string) {
        String var2 = this.phio + " взял " + string;
        System.out.println(var2);
    }

    public final void returnBook(int countBook) {
        String var2 = this.phio + " вернул " + countBook + " книг";
        System.out.println(var2);
    }

    public void returnBook( String... string) {
        StringBuilder buf = new StringBuilder();
        for (String i : string) {
            buf.append(i).append(" ");
        }

        String var10 = this.phio + " вернул " + buf;
        System.out.println(var10);
    }

    public final String getPhio() {
        return this.phio;
    }

    public final int getTicket() {
        return this.ticket;
    }

    public final String getFuculty() {
        return this.fuculty;
    }

    public final int getDate() {
        return this.date;
    }

    public final int getNumber() {
        return this.number;
    }

    public Reader( String phio, int ticket, String fuculty, int date, int number) {
        super();
        this.phio = phio;
        this.ticket = ticket;
        this.fuculty = fuculty;
        this.date = date;
        this.number = number;
    }
}

