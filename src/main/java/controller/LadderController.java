package controller;

import domain.Ladder;
import domain.LadderHeight;
import domain.LadderWidth;
import view.InputView;
import view.OutputView;

public class LadderController {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        LadderWidth width = inputView.askWidth();
        LadderHeight height = inputView.askHeight();
        Ladder ladder = new Ladder(height, width);
        outputView.printLadder(ladder);
    }
}
