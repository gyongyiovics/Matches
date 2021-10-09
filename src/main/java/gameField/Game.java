package gameField;

import matches.MatchBox;
import players.Computer;
import players.Player;

import java.util.Scanner;

public class Game {
    Player player1 = new Player("Gyufás Rufusz", 10);
    Player player2 = new Computer("Mikrobi", 10);

    MatchBox matchBox;

    /**
     * method to pull matches from the box
     */

    private void pullMatchFromBox(Player p1, Player p2, MatchBox m) {
        int low = 1;
        int amount = m.getAmount();

        System.out.println("Pull some matches between " + low + " and " + amount);
    }

    private String userInput() {
        String input = scanner().nextLine();
        return input;
    }

    private Scanner scanner() {
        return new Scanner(System.in);
    }
}
