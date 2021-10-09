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

    public void pullMatchFromBox() {
        Player player1 = new Player("Gyufás Rufusz", 10);
        Player player2 = new Computer("Mikrobi", 10);
        MatchBox matchBox = new MatchBox(2); //this is the amout of the matches players get from the box

        /*int low = 0;
        int amount = matchBox.matchInBox();
        System.out.println("Pull some matches between " + low + " and " + amount);*/
        System.out.println("Pull some matches between 0 and " + matchBox.getAmount());

        player1.pullMatchFromBox(matchBox);
        player2.pullMatchFromBox(matchBox);
    }

    private String userInput() {
        String input = scanner().nextLine();
        return input;
    }

    private Scanner scanner() {
        return new Scanner(System.in);
    }
}
