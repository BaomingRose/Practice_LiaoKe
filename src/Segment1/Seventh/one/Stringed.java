package Segment1.Seventh.one;

public class Stringed extends Instrument {
    public void play() {
        System.out.println("Stringed.play()");
    }

    public String what() {
        return "弦乐器";
    }

    public void adjust() {
        System.out.println("Stringed.adjust()");
    }
}
