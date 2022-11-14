package twolab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.System.in;

public class howMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String buff = "";
        buff = scanner.nextLine();
        AtomicInteger pepega = new AtomicInteger();
        Arrays.stream(buff.split(" ")).forEach(it -> pepega.getAndIncrement());
        System.out.println(pepega);
    }
}
