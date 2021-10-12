package gameField;

import matches.MatchBox;
import players.Computer;
import players.Player;

import java.util.Scanner;

public class Game {
    Player player1 = null;
    Player player2 = null;

    MatchBox matchBox;

    /**
     * method to pull matches from the box
     *
     * TODO: put the while here instead of the player
     */

    public void pullMatchFromBox() {
        player1 = new Player("Gyufás Rufusz");
        player2 = new Computer("Mikrobi");
        matchBox = new MatchBox();
        //this is the amout of the matches players have in the box
        System.out.println("Pull some matches between 0 and " + matchBox.getAmount());

        while (matchBox.getAmount() > 1) {
            player1.pullMatchFromBox(matchBox);
            player2.pullMatchFromBox(matchBox);
        }
    }

    private String userInput() {
        String input = scanner().nextLine();
        return input;
    }

    private Scanner scanner() {
        return new Scanner(System.in);
    }
}
