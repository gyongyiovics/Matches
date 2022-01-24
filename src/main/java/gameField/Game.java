package gameField;

import matches.MatchBox;
import players.Computer;
import players.Player;

public class Game {
    Player player1 = null;
    Player player2 = null;
    MatchBox matchBox;

    public void pullMatchFromBox() {
        player1 = new Player("Gyufás Rufusz");
        player2 = new Computer("Mikrobi");
        matchBox = new MatchBox();
        int matches = matchBox.matchInBox();
        //this is the amout of the matches players have in the box
        System.out.println("Pull some matches between 0 and " + matches);

        //TODO: while (true)
        //TODO: do not make in infinite!
        /*while (*//*matchBox.getAmount() > 1*//*true) {
            Player player = new Player();
            Player enemy = new Player();

            player = player1;
            enemy = player2;
            System.out.println(player1.getName() + " pull from the box:");
            player1.pullMatchFromBox(matchBox);

            player = player2;
            enemy = player1;
            System.out.println(player2.getName() + " pull from the box:");
            player2.pullMatchFromBox(matchBox);

            if(matchBox.getAmount() == 1 | matchBox.getAmount() == 0 | matchBox.getAmount() == -1) {
                System.out.println(enemy.getName() + " won!");
            }
        }*/

        while (matches >= 0) {
            System.out.println("Matches on the table: " + matchBox.getAmount());
            System.out.println("Take 1-3 matches!");
            int playerMatches = player1.pullMatchFromBox(matchBox);
            matches -= playerMatches;

            if (matches == 1) {
                System.out.println("You won!");
                break;
            }

            int enemyMatches = player2.pullMatchFromBox(matchBox);
            matches -= enemyMatches;

            System.out.println("Computer took " + enemyMatches + " matches.");

            if (matches == 1) {
                System.out.println("Computer won!");
                break;
            }

        } /*while (true);*/
        System.out.println("remaining matches: " + matches);
    }

}
