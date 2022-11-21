package twenty;

import java.util.Scanner;

public final class QqqKt {
    public static void main(String[] var0) {
        qqq();
    }

    public static final void qqq() {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int q = Integer.parseInt(String.valueOf(num));
        if (q != 0) {
            if (q % 2 == 0) {
                System.out.println(q);
            }
            qqq();
        }

    }
}