package twolab;

public final class Author {
    private final String name;
    private final String email;
    private final char gender;

    public final String getGetName() {
        return this.name;
    }

    public final String getGetEmail() {
        return this.email;
    }

    public final String getGetGender() {
        return String.valueOf(this.gender);
    }

    public final String getName() {
        return this.name;
    }

    public final String getEmail() {
        return this.email;
    }

    public final char getGender() {
        return this.gender;
    }

    public Author(String name, String email, char gender) {
        super();
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public static final class SixKt {
        public static void main() {
            Author author = new Author("Pushka", "sergay@gmail", '2');
            String var2 = author.getGetName() + ", " + author.getGetEmail() + ", " + author.getGetGender();
            System.out.println(var2);
        }
        public static void main(String[] var0) {
            main();
        }
    }
}
