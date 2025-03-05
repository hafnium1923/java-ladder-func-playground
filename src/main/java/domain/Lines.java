package domain;

import java.util.List;

public class Lines {
    private final List<Line> lines;

    public Lines(List<Line> lines) {
        this.lines = lines;
    }

    public void print() {
        for (Line line : lines) {
            line.print();
        }
    }
}
