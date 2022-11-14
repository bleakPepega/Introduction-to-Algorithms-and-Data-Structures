package twolab;

import java.util.Arrays;
import java.util.Scanner;

final class Circle {
    private final Point point = new Point(1, 1);

    public final Point getPoint() {
        return this.point;
    }
}
// Point.java


public final class Point {
    private int x;
    private final int y;

    public final int getX() {
        return this.x;
    }

    public final void setX(int var1) {
        this.x = var1;
    }

    public final int getY() {
        return this.y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Tester1{
    public static void main(String[] args) {
        Circle[] var10000 = new Circle[]{new Circle(), new Circle()};
        Arrays.stream(var10000).forEach((it) -> System.out.println("X: " + it.getPoint().getX() + " " +"Y: " + it.getPoint().getY()));
    }
}