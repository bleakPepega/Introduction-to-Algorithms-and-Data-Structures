import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Book {
    private final String author;
    private final String name;
    private final int year;

    public final String getAuthor() {
        return this.author;
    }

    public final String getName() {
        return this.name;
    }

    public final int getYear() {
        return this.year;
    }

    public Book(String author, String name, int year) {
        super();
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public static void main(String[] args) {
        System.out.println(new BookTable().getBookList());

    }
}

final class BookTable {
    private final List<Book> bookList = new ArrayList<>(List.of((new Book[]{
            new Book(
            "palanik",
            "the figth club",
            123),
            new Book(
                    "qq",
                    "the club",
                    1995)})));

    public List getBookList() {
        for (Object o : bookList) {
            System.out.println(o.toString());
        }

        Integer[] array = (Integer[]) bookList.stream().map(Book::getYear).toArray();
        bookList.stream();
        Arrays.stream(bookList.toArray(new Book[0]));

        return bookList;
    }
}
