package Segment1.Seventh.three;

public class Woodwind extends Wind {
    public void play() {
        System.out.println("Woodwind.play()");
    }

    public String what() {
        return "木管乐器";
    }

    public void adjust() {
        System.out.println("Woodwind.adjust()");
    }
}
