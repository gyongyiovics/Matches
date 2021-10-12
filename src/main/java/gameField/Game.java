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
        //this is the amout of the matches players have in the box
        System.out.println("Pull some matches between 0 and " + matchBox.getAmount());

        while (matchBox.getAmount() > 1) {
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
        }
    }

}
