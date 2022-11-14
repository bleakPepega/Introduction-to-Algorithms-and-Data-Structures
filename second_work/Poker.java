package twolab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

final class Card {
    String clubs = "Clubs";
    String diamonds = "diamonds";
    String hearts = "hearts";
    String spades = "spades";
    ArrayList<String> numbers = new ArrayList<String>();
    public Card(String values) {
        numbers.add(values + " " + clubs);
        numbers.add(values + " " + diamonds);
        numbers.add(values + " " + hearts);
        numbers.add(values + " " + spades);
    }
    public final ArrayList<String> getY() {
        return this.numbers;
    }


}
public class Poker {
    public static ArrayList<String> card() {
        ArrayList<String> numbers = new ArrayList<String>();
        for (int values = 2; values <= 10; values++) {
            numbers.addAll(new Card(String.valueOf(values)).numbers);
        }
        numbers.addAll(new Card(String.valueOf("V")).numbers);
        numbers.addAll(new Card(String.valueOf("Q")).numbers);
        numbers.addAll(new Card(String.valueOf("K")).numbers);
        numbers.addAll(new Card(String.valueOf("T")).numbers);;
        Collections.shuffle(numbers);
        return numbers;
    }

    public static void main(String[] args) {
        System.out.println("Введите количество игроков");
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        if (count <= 23) {
            ArrayList<String> numbers = card();
            for (int i = 0; i <= count * 2 - 1 ; i += 2) {
                System.out.println(numbers.get(i) + " " + numbers.get(i + 1) + "\n");
            }
        }
        else {
            System.out.println("Слишком большое количество игроков");
            System.exit(0);
        }

    }
}
