package matches;

public class MatchBox {
    private int amount;
    private Match match;

    /**
     * method to fetch random number of random matches
     */

    public MatchBox(int amount, Match match) {
        this.amount = amount;
        this.match = match;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }
}
