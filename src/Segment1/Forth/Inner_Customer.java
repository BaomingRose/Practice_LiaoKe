package Segment1.Forth;

public class Inner_Customer extends Customer{
    @Override
    public double consume(double price) {
        return 0.8 * price;
    }
}
