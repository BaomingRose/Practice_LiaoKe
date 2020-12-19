package Segment1.Eighth;

public class Test {
    public static void main(String[] args) {
        Game game = new Game();
        new Thread(game::rand_judge).start();
        new Thread(game::guess).start();
    }
}
