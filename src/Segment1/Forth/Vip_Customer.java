package Segment1.Forth;

public class Vip_Customer extends Customer{
    @Override
    public double consume(double price) {
        return 0.9 * price;
    }
}
