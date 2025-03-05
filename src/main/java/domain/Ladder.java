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
        Line previousLine = null;

        for (int i = 0; i < height; i++) {
            Line currentLine = new Line(width, previousLine);
            ladder.add(currentLine);
            previousLine = currentLine;
        }
        return ladder;
    }

    public void print() {
        for (Line line : lines) {
            line.print();
        }
    }
}
