import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Fac(n);
    }

    private static void Fac(int n) {
        int sum = 1;
        int k = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            k ++;

        }
        if (k !=0) {
            System.out.println(sum);
        }
        else System.out.println(0);
    }
    }
