package Segment1.Seventh.two;

public class Test {
    public static void main(String[] args) {
        Instrument woodwind = new Woodwind();
        woodwind.adjust();
        woodwind.play();
        System.out.println(woodwind.what());

        Instrument brass = new Brass();
        brass.play();
        brass.adjust();
        System.out.println(brass.what());
    }
}
