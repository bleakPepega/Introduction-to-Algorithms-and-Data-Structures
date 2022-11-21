package eleven;


import java.util.Scanner;

public final class qqq {
    private int i;
    private int counter0;

    public final int getI() {
        return this.i;
    }

    public final void setI(int var1) {
        this.i = var1;
    }

    public final int getCounter0() {
        return this.counter0;
    }

    public final void setCounter0(int var1) {
        this.counter0 = var1;
    }

    public final void q() {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int q = Integer.parseInt(String.valueOf(num));
        int var10001;
        if (Integer.parseInt(String.valueOf(num)) == 1) {
            var10001 = this.i++;
            int var2 = this.i;
            System.out.println(var2);
        }

        if (Integer.parseInt(String.valueOf(num)) == 0) {
            var10001 = this.counter0++;
        } else {
            this.counter0 = 0;
        }

        if (this.counter0 != 2) {
            this.q();
        }

    }
    public static void main(String[] var0) {
        (new qqq()).q();
    }
}

    // $FF: synthetic method


