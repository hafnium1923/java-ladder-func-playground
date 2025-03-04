package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Line {
    private final List<Boolean> points;

    public Line(int width) {
        this.points = createPoints(width);
    }

    private List<Boolean> createPoints(int width) {
        List<Boolean> points = new ArrayList<>();
        Random random = new Random();
        boolean previous = false;

        for (int i = 0; i < width - 1; i++) {
            boolean current = !previous && random.nextBoolean();
            points.add(current);
            previous = current;
        }
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
