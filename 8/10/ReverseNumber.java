package ten;

public final class ReverseNumber {
    public static final void main() {
        String var0 = ten(12356789, "");
        System.out.println(var0);
    }

    public static void main(String[] var0) {
        main();
    }
    public static final String ten(int number, String finalNumber) {
        if (number == 0) {
            return finalNumber;
        } else {
            String string = finalNumber + String.valueOf(number % 10);
            int newNumber = number / 10;
            return ten(newNumber, string);
        }
    }
}
