package players;

import matches.MatchBox;

import java.util.Scanner;

public class Player {
    private String name;
    //private final int matchNumber = 2;
    /**
     * method get a MatchBox
     * method get an ownMatch - pull a match
     *
     */

    public Player() {}

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int pullMatchFromBox(MatchBox box) {
        int matchInBox = box.setAmount(box.getAmount() - userInput());
        System.out.println("Matches in box: " + box.getAmount());
        return matchInBox;
    }

    //TODO: add a strategy
    private int userInput() {
        int input = scanner().nextInt();
        return input;
    }

    private Scanner scanner() {
        return new Scanner(System.in);
    }
}
