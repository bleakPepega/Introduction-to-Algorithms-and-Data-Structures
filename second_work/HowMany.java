package twolab;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(str);
        String[] strinToArr = str.split(" ");
        int counter = 0;
        for (String s : strinToArr) {
            counter ++;
        }
        System.out.println(counter);
    }
}
