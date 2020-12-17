package Segment1.Third;

public class Computer extends Product {
    private String memory;
    private String processorName;

    public Computer(String number, String category, String name, double price, String memory, String processorName) {
        super(number, category, name, price);
        this.memory = memory;
        this.processorName = processorName;
    }

    @Override
    public String toString() {
        return super.toString() + "memory='" + memory + '\'' +
                ", processorName='" + processorName + '\'' + " ";
    }
}
