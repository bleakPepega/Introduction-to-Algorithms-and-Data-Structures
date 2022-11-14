import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class secondNumber {
    public static void main(@NotNull String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int counter = in.nextInt();
        int[] arr = new int[counter];

        int sum;
        sum = counter;
        for( int i = 0; i < sum; ++i) {
            int input =  in.nextInt();
            arr[i] = input;
        }

        int i = 0;
        for(sum = 0; i < arr.length; ++i) {
            sum += arr[i];
        }
        int maxNumber = arr[0];
        for (int k : arr) {
            if (maxNumber <= k) {
                maxNumber = k;
            }
        }
        int minNumber = 1000;
        for (int k : arr) {
            if (minNumber >= k) {

                minNumber = k;
            }
        }


        System.out.println(sum + " " + maxNumber);
        System.out.println(maxNumber);
        System.out.println(minNumber);
    }
}
