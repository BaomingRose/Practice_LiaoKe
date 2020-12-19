package Segment1.Seventh.one;

public class Percussion extends Instrument {
    public void play() {
        System.out.println("Percussion.play()");
    }

    public String what() {
        return "敲击乐器";
    }

    public void adjust() {
        System.out.println("Percussion.adjust()");
    }
}
