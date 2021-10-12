package matches;

import java.util.Random;

public class MatchBox {
    private int amount;
    private final int MIN = 4;
    private final int MAX = 10;

    /**
     * method to fetch random number of random matches
     */

    public MatchBox() {
        this.amount = matchInBox();
    }

    public int getAmount() {
        return amount;
    }

    public int setAmount(int amount) {
        this.amount = amount;
        return amount;
    }

    public int matchInBox() {
        Random rand = new Random();
        int randomNum = rand.nextInt((MAX - MIN) + 1) + MIN;
        System.out.println("The number of matches in this box: " + randomNum);
        return randomNum;
    }
}
