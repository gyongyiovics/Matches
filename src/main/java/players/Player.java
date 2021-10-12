package players;

import matches.MatchBox;

public class Player {
    private String name;

    /**
     * method get a MatchBox
     * method get an ownMatch - pull a match
     *
     */

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int pullMatchFromBox(MatchBox box) {
        int matchInBox = box.setAmount(box.getAmount() - 1);
        System.out.println("Matches in box: " + box.getAmount());
        return matchInBox;
    }

    //TODO: add a strategy
}
