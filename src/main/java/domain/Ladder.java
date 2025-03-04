package domain;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
    private final List<Line> lines;

    public Ladder(int height, int width) {
        this.lines = createLadder(height, width);
    }

    private List<Line> createLadder(int height, int width) {
        List<Line> ladder = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            ladder.add(new Line(width));
        }
        return ladder;
    }

    public void print() {
        for (Line line : lines) {
            line.print();
        }
    }
}
