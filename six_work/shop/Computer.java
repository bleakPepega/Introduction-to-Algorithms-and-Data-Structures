package shop;
// Marks.java

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

enum Marks {
    ASUS,
    HP,
    APPLE;
}
// Shop.java

final class Shop {
    private final ArrayList computers;

    public final boolean search( Computer requiredComputer) {
        final Boolean[] flag = {false};
        for (Object i : computers) {
            if (i == requiredComputer) return true;
            System.out.println(computers);
        }
        return false;
    }

    public final void addComputers( Computer requiredComputer) {
        this.computers.add(requiredComputer);
    }

    public final void deleteComputer( Computer requiredComputer) {
        this.computers.remove(requiredComputer);
    }

    public Shop(ArrayList computers) {
        super();
        this.computers = computers;
    }
}



 final class ComputerKt {
    public static final void main() {
        ArrayList computers = (new ArrayList(Collections.singleton(new Computer(Marks.HP, new Processor(1444, "ASUS"), new Memory(1000, "ASUS"), new Monitor(32, "ASUS")))));

//        ArrayList computers = (new ArrayList(new Computer(Marks.APPLE, new Processor(1444, "ASUS"), new Memory(1000, "ASUS"), new Monitor(32, "ASUS")), new Computer(Marks.HP, new Processor(1444, "ASUS"), new Memory(1000, "ASUS"), new Monitor(32, "ASUS"))));
        boolean var1 = (new Shop(computers)).search(new Computer(Marks.ASUS, new Processor(1444, "ASUS"), new Memory(1000, "ASUS"), new Monitor(32, "ASUS")));

        System.out.println(var1);
    }

    // $FF: synthetic method
    public static void main(String[] var0) {
        main();
    }
}
// Memory.java

final class Memory {
    private final int volume;
    private final String brand;

    public boolean equals( Object other) {
        return other instanceof Memory && this.volume == ((Memory) other).volume && (Objects.equals(this.brand, ((Memory) other).brand));
    }

    public final int getVolume() {
        return this.volume;
    }

    public final String getBrand() {
        return this.brand;
    }

    public Memory(int volume,  String brand) {
        super();
        this.volume = volume;
        this.brand = brand;
    }
}
// Processor.java

final class Processor {
    private final int frequency;
    private final String brand;

    public boolean equals( Object other) {
        return other instanceof Processor ? this.frequency == ((Processor)other).frequency && (Objects.equals(this.brand, ((Processor) other).brand)) : false;
    }

    public final int getFrequency() {
        return this.frequency;
    }

    public final String getBrand() {
        return this.brand;
    }

    public Processor(int frequency,  String brand) {
        super();
        this.frequency = frequency;
        this.brand = brand;
    }
}

final class Monitor {
    private final int theSize;
    private final String brand;

    public boolean equals( Object other) {
        return other instanceof Monitor ? this.theSize == ((Monitor)other).theSize && (Objects.equals(this.brand, ((Monitor) other).brand)) : false;
    }

    public final int getTheSize() {
        return this.theSize;
    }

    public final String getBrand() {
        return this.brand;
    }

    public Monitor(int theSize,  String brand) {
        super();
        this.theSize = theSize;
        this.brand = brand;
    }
}
// Computer.java

public final class Computer {
    private final Marks marks;
    private final Processor processor;

    private final Memory memory;
    private final Monitor monitor;

    public boolean equals( Object other) {
        return other instanceof Computer ? this.marks == ((Computer)other).marks && (this.processor == ((Computer)other).processor) && (this.memory == ((Computer)other).memory) && (this.monitor == ((Computer)other).monitor) : false;
    }

    public final Marks getMarks() {
        return this.marks;
    }

    public final Processor getProcessor() {
        return this.processor;
    }

    public final Memory getMemory() {
        return this.memory;
    }

    public final Monitor getMonitor() {
        return this.monitor;
    }

    public Computer( Marks marks,  Processor processor,  Memory memory,  Monitor monitor) {
        super();
        this.marks = marks;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }
}
