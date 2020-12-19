package Segment1.Seventh.three;

public class Percussion implements Instrument {
    @Override
    public void play() {
        System.out.println("Percussion.play()");
    }

    @Override
    public String what() {
        return "敲击乐器";
    }

    @Override
    public void adjust() {
        System.out.println("Percussion.adjust()");
    }
}
