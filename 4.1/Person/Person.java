package z4_4;
class Main {
    public static void main(String[] args) {
        new Person();
        new Person("qwee", 111).talk();
    }
}
public class Person {
    String fullName;
    Integer age;
    Person() {

    }
    Person(String fullName, Integer age) {
        this.age = age;
        this.fullName = fullName;
    }
    void move() {
    }
    void talk() {
        System.out.println("Говорит " + fullName);
    }

}
