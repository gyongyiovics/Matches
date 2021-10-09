package gameField;

import matches.Match;
import matches.MatchBox;
import players.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    Player player1;
    Player player2;

    MatchBox matchBox;

    /**
     * method to pull matches from the box
     */

    private void pullMatchFromBox(Player p1, Player p2, MatchBox m) {
        int low = 1;
        int amount = m.getAmount();

        List<Match> matchInTheBox = new ArrayList<>();


        System.out.println("Pull some matches between " + low + " and " + amount);
        //not the amount of matches in the box, but the match numbers
    }


    private String userInput() {
        String input = scanner().nextLine();
        return input;
    }

    private Scanner scanner() {
        return new Scanner(System.in);
    }
}
