package twolab;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Dog {
    private final String nick;
    private final int age;


    public static void main(String[] args) {
        Dog dog = new Dog("pepega", 8);
        System.out.println(dog.getAge());
    }

    public Dog(String nick, int age) {
        this.nick = nick;
        this.age = age;
    }

    public String getNick() {
        return nick;
    }

    public int getAge() {
        return age * 8;
    }
}
class Tester {
     ArrayList<Dog> dog = new ArrayList<>(List.of((new Dog[]{new Dog("kekega", 9), new Dog("pepega", 9)})));
    public void setDog(ArrayList<Dog> dog) {
        this.dog = dog;
        System.out.println(dog);
    }
}
