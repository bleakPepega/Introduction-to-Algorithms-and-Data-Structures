package z_10;
// TranspotVehicleKt.java

final class TranspotVehicleKt {
    public static final void main() {
        OutPut car = (new Car(100)).time();
        String var1 = "Время в пути: " + car.getFirstNumber() + ",  Цена поездки: " + car.getSecondNumber();
        System.out.println(var1);
    }

    // $FF: synthetic method
    public static void main(String[] var0) {
        main();
    }
}

final class Train extends TransportVehicle {
    private final int cost = 100;
    private final int speed = 122;

    public int getCost() {
        return this.cost;
    }

    public int getSpeed() {
        return this.speed;
    }

    public OutPut time() {
        return super.time();
    }

    public Train(int distance) {
        super(distance);
    }
}
// OutPut.java


final class OutPut {
    private final double firstNumber;
    private final int secondNumber;

    public final double getFirstNumber() {
        return this.firstNumber;
    }

    public final int getSecondNumber() {
        return this.secondNumber;
    }

    public OutPut(double firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
}
// Car.java


final class Car extends TransportVehicle {
    private final int speed = 10;
    private final int cost = 100;

    public int getSpeed() {
        return this.speed;
    }

    public int getCost() {
        return this.cost;
    }

    public OutPut time() {
        return super.time();
    }

    public Car(int distance) {
        super(distance);
    }
}

final class Airplane extends TransportVehicle {
    private final int cost = 11;
    private final int speed = 12;

    public int getCost() {
        return this.cost;
    }

    public int getSpeed() {
        return this.speed;
    }

    public OutPut time() {
        return super.time();
    }

    public Airplane(int distance) {
        super(distance);
    }
}
// TransportVehicle.java

public abstract class TransportVehicle {
    private final int distance;

    public abstract int getSpeed();

    public abstract int getCost();

    public OutPut time() {
        return new OutPut((double)(this.distance / this.getCost()), this.distance / this.getCost() * this.getCost());
    }

    public TransportVehicle(int distance) {
        this.distance = distance;
    }
}
