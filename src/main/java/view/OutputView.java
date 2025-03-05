package view;

import domain.Ladder;
import domain.LadderResult;
import domain.Position;
import java.util.List;

public class OutputView {
    public void printLadder(Ladder ladder) {
        ladder.print();
    }

    public void printResult(LadderResult result) {
        List<Position> positions = result.getPositions();
        for (int i = 0; i < positions.size(); i++) {
            System.out.println(i + " -> " + positions.get(i).getValue());
        }
    }
}
