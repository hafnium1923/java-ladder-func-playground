package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Line {
    private final List<Boolean> points;

    public Line(int width, Line previousLine) {
        this.points = createPoints(width, previousLine);
    }

    private List<Boolean> createPoints(int width, Line previousLine) {
        List<Boolean> points = new ArrayList<>();
        Random random = new Random();
        boolean previous = false;
        List<Boolean> previousPoints = previousLine != null ? previousLine.getPoints() : null;

        for (int i = 0; i < width - 1; i++) {
            boolean current = !previous && random.nextBoolean();
            if (previousPoints != null && previousPoints.get(i)) {
                current = false;
            }
            points.add(current);
            previous = current;
        }
        return points;
    }

    public List<Boolean> getPoints() {
        return points;
    }

    public void print() {
        StringBuilder builder = new StringBuilder("|");
        for (boolean point : points) {
            builder.append(point ? "-----|" : "     |");
        }
        System.out.println(builder);
    }
}
