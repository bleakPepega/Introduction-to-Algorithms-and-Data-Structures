package zadanie_2.prak_6;

import zadanie_1.prak_6.Movable;
import zadanie_1.prak_6.MovablePoint;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottonRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottonRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public boolean isEqualsSpeed(){
        if (topLeft.getxSpeed() == bottonRight.getySpeed()){
            return true;
        }else {
            return false;
        }
    }
    @Override
    public void moveUp() {
        System.out.println("move up");
    }

    @Override
    public void moveDown() {
        System.out.println("move down");
    }

    @Override
    public void moveLeft() {
        System.out.println("move left");
    }

    @Override
    public void moveRight() {
        System.out.println("move right");
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottonRight=" + bottonRight +
                '}';
    }
}
