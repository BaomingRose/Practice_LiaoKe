package Segment1.Seventh.one;

public class Wind extends Instrument {
    public void play() {
        System.out.println("Wind.play()");
    }

    public String what() {
        return "管乐器";
    }

    public void adjust() {
        System.out.println("Wind.adjust()");
    }
}
