package Segment1.Seventh.one;

public class Test {
    public static void main(String[] args) {
        Woodwind woodwind = new Woodwind();
        woodwind.adjust();
        woodwind.play();
        System.out.println(woodwind.what());

        Brass brass = new Brass();
        brass.play();
        brass.adjust();
        System.out.println(brass.what());
    }
}
