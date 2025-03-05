package view;

import domain.LadderHeight;
import domain.LadderWidth;
import java.util.Scanner;

public class InputView {
    private final Scanner scanner;

    public InputView() {
        scanner = new Scanner(System.in);
    }

    public LadderWidth askWidth() {
        System.out.println("사다리의 넓이는 몇 개인가요?");
        int input = Integer.parseInt(scanner.nextLine());
        return new LadderWidth(input);
    }

    public LadderHeight askHeight() {
        System.out.println("사다리의 높이는 몇 개인가요?");
        int input = Integer.parseInt(scanner.nextLine());
        return new LadderHeight(input);
    }
}
