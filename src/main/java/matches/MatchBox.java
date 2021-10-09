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

    public int matchInBox() {
        System.out.println("The number of matches in this box: ");
        Random rand = new Random();
        int min = 4;
        int max = 40;
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }


}
