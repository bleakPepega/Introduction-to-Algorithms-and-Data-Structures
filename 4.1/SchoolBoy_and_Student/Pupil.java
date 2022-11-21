package z_5;

import java.util.ArrayList;
import java.util.Collection;

class Main {
    public static void main(String[] args) {
       Pupil[] pupils = {new Student(1, "a"), new Schoolboy(2, "b")};
    }
}
abstract public class Pupil {
    String name;
    Integer age;
    Pupil(Integer age, String name) {
        this.name = name;
        this.age = age;
    }
}
class Student extends Pupil {
    Student(Integer age, String name) {
        super(age, name);
    }
}
class Schoolboy extends Pupil {
    Schoolboy(Integer age, String name) {
        super(age, name);
    }
}
