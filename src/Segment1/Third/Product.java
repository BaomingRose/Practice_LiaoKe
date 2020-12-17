package Segment1.Third;

public class Product {
    private String number;
    private String category;
    private String name;
    private double price;

    public Product(String number, String category, String name, double price) {
        this.number = number;
        this.category = category;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "number='" + number + '\'' +
                ", category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price + "RMB, ";
    }
}
