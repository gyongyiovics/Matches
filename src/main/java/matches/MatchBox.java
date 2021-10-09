package matches;

public class MatchBox {
    private int amount;

    /**
     * method to add player to box
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
}
