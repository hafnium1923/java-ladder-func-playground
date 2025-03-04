package domain;

public class LadderGame {
    public static void main(String[] args) {
        int height = 4;
        int width = 4;
        Ladder ladder = new Ladder(height, width);
        ladder.print();
    }
}
