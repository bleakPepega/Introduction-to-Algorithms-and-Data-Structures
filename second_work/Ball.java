package twolab;

// Ball.java
import org.jetbrains.annotations.NotNull;

public final class Ball {
    private double setY;
    private double setX;
    private double setXY;
    private double x;
    private double y;

    public final double getGetX() {
        return this.x;
    }

    public final double getGetY() {
        return this.y;
    }

    public final double getSetY() {
        return this.setY;
    }

    public final void setSetY(double value) {
        this.setY = value;
    }

    public final double getSetX() {
        return this.setX;
    }

    public final void setSetX(double value) {
        this.setX = value;
    }

    public final double getSetXY() {
        return this.setXY;
    }

    public final void setSetXY(double value) {
        this.setXY = value;
    }

    @NotNull
    public final String getMove() {
        return "мяч сдвинулся с точки " + this.x + " на " + this.setX + " и с точки " + this.y + " на точку " + this.setY;
    }

    public final double getX() {
        return this.x;
    }

    public final void setX(double var1) {
        this.x = var1;
    }

    public final double getY() {
        return this.y;
    }

    public final void setY(double var1) {
        this.y = var1;
    }

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static final class SevenKt {
        public static void main() {
            Ball ball = new Ball(0.0, 0.0);
            ball.setSetX(2.0);
            ball.setSetY(3.0);
            String var1 = ball.getMove();
            System.out.println(var1);
        }

        public static void main(String[] var0) {
            main();
        }
    }
}


