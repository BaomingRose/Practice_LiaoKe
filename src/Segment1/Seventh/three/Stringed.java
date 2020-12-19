package Segment1.Seventh.three;

public class Stringed implements Instrument {
    @Override
    public void play() {
        System.out.println("Stringed.play()");
    }

    @Override
    public String what() {
        return "弦乐器";
    }

    @Override
    public void adjust() {
        System.out.println("Stringed.adjust()");
    }
}
