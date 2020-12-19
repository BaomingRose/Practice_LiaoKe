package Segment1.Seventh.three;

public class Wind implements Instrument {
    @Override
    public void play() {
        System.out.println("Wind.play()");
    }

    @Override
    public String what() {
        return "管乐器";
    }

    @Override
    public void adjust() {
        System.out.println("Wind.adjust()");
    }
}
