package matches;

import players.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MatchBox {
    private int amount;

    /**
     * method to fetch random number of random matches
     */

    public MatchBox(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    private int matchInBox() {
        Random rand = new Random();
        int min = 4;
        int max = 40;
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    private void playerPullMatchFromBox(Player player) {
        while (this.getAmount() > 0) {
            player.setOwnMatch(1);
            this.setAmount(-1);
        }
        System.out.println("Matches in box: " + this.getAmount());
        System.out.println("Matches of " + player.getName() + " are " + player.getOwnMatch());
    }
}
