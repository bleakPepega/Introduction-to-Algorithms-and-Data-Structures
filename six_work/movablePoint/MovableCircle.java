package zadanie_1.prak_6;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;
    {
        this.radius = 0;
        this.center = new MovablePoint();
    }
    MovableCircle(){}

    public MovableCircle(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MovablePoint getCenter() {
        return center;
    }

    public void setCenter(MovablePoint center) {
        this.center = center;
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
        System.out.println("move lest");
    }

    @Override
    public void moveRight() {
        System.out.println("move right");
    }
}
