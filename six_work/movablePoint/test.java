package zadanie_1.prak_6;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovablePoint movablePoint = new MovablePoint();
        movablePoint.setX(scanner.nextInt());
        movablePoint.setY(scanner.nextInt());
        movablePoint.setxSpeed(scanner.nextInt());
        movablePoint.setySpeed(scanner.nextInt());
        MovableCircle movableCircle = new MovableCircle(scanner.nextInt(), movablePoint);
        movableCircle.moveRight();
        movableCircle.moveUp();
    }
}
