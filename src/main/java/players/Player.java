package players;

import matches.MatchBox;

public class Player {
    private String name;
    private int ownMatch;

    /**
     * method get a MatchBox
     * method get an ownMatch - pull a match
     *
     */

    public Player(String name, int ownMatch) {
        this.name = name;
        this.ownMatch = ownMatch;
    }

    public String getName() {
        return name;
    }

    public int getOwnMatch() {
        return ownMatch;
    }

    public void setOwnMatch(int ownMatch) {
        this.ownMatch = ownMatch;
    }

    public void pullMatchFromBox(MatchBox box) {
        while (box.getAmount() > 0) {
            this.setOwnMatch(this.getOwnMatch() + 1);
            box.setAmount(box.getAmount() - 1);
            System.out.println("Matches in box: " + box.getAmount());
            System.out.println("Matches of " + this.getName() + " are " + this.getOwnMatch());
        }
        //System.out.println("Matches in box: " + box.getAmount());
        //System.out.println("Matches of " + this.getName() + " are " + this.getOwnMatch());
    }
}
