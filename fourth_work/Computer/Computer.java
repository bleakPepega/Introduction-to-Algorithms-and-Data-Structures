package number5;

public class Computer {
    enum model{
        MAC_BOOK_PRO("Asus", new Processor(A22", "", 10, 32), new Memory("SSD", 4096), new Monitor("kek", 32, 60)),
                MAC_BOOK_AIR("MacBook Air", new Processor("M2", "chip", 10, 16), new Memory("SSD", 2048), new Monitor("Asus", 14.2, 60));

        private String name;
        private Processor processor;
        private Memory memory;
        private Monitor monitor;
        model(String name, Processor processor, Memory memory, Monitor monitor){
            this.name = name;
            this.processor = processor;
            this.memory = memory;
            this.monitor = monitor;
        }
    }
}

class Memory {
    private String type;
    private int GB;
    {
        this.type = "no type";
        this.GB = 0;
    }
    public Memory(String type, int GB) {
        this.type = type;
        this.GB = GB;
    }

    public int getGB() {
        return GB;
    }

    public void setGB(int GB) {
        this.GB = GB;
    }
}
class Processor {
    private String name;
    private String type;
    private int nucleuses;
    private int CPU;
    private int GPU;
    {
        this.nucleuses = 0;
        this.CPU = 0;
        this.GPU = 0;
    }
    Processor(String name, String type, int nucleuses){
        this.name = name;
        this.type = type;
    }
    Processor(String name, String type, int CPU, int GPU){
        this.name = name;
        this.type = type;
        this.CPU = CPU;
        this.GPU = GPU;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNucleuses() {
        return nucleuses;
    }

    public void setNucleuses(int nucleuses) {
        if(CPU == 0 && GPU == 0) {
            this.nucleuses = nucleuses;
        }
    }

    public int getCPU() {
        return CPU;
    }

    public void setCPU(int CPU) {
        if (nucleuses == 0) {
            this.CPU = CPU;
        }
    }

    public int getGPU() {
        return GPU;
    }

    public void setGPU(int GPU) {
        if (nucleuses == 0) {
            this.GPU = GPU;
        }
    }
}
class Monitor {
    private String type;
    private double diagonal;
    private int Hz;
    {
        this.type = "no type";
        this.diagonal = 0;
        this.Hz = 0;
    }public Monitor(String type, double diagonal, int hz) {
        this.type = type;
        this.diagonal = diagonal;
        Hz = hz;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public int getHz() {
        return Hz;
    }

    public void setHz(int hz) {
        Hz = hz;
    }
}
