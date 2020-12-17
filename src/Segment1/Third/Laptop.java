package Segment1.Third;

public class Laptop extends Computer {
    private double thickness;
    private double weight;

    public Laptop(String number, String category, String name, double price, String memory, String processorName, double thickness, double weight) {
        super(number, category, name, price, memory, processorName);
        this.thickness = thickness;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() +
                "thickness=" + thickness +
                "cm, weight=" + weight + "kg";
    }
}
