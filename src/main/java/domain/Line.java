package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Line {
    private final List<Bridge> bridges;

    public Line(LadderWidth ladderWidth, Line previousLine) {
        this.bridges = createBridges(ladderWidth, previousLine);
    }

    private List<Bridge> createBridges(LadderWidth ladderWidth, Line previousLine) {
        List<Bridge> list = new ArrayList<>();
        Random random = new Random();
        boolean previousConnected = false;
        List<Bridge> previousBridges = null;
        if (previousLine != null) {
            previousBridges = previousLine.getBridges();
        }
        for (int i = 0; i < ladderWidth.getValue() - 1; i++) {
            boolean connected = determineConnection(previousConnected, random, previousBridges, i);
            list.add(Bridge.fromBoolean(connected));
            previousConnected = connected;
        }
        return list;
    }

    private boolean determineConnection(boolean previousConnected, Random random, List<Bridge> previousBridges, int index) {
        if (previousConnected) {
            return false;
        }
        if (previousBridges != null && previousBridges.get(index) == Bridge.CONNECTED) {
            return false;
        }
        return random.nextBoolean();
    }

    public List<Bridge> getBridges() {
        return bridges;
    }

    public void print() {
        StringBuilder builder = new StringBuilder();
        builder.append("|");
        for (Bridge bridge : bridges) {
            builder.append(bridge.display());
            builder.append("|");
        }
        System.out.println(builder.toString());
    }
}
