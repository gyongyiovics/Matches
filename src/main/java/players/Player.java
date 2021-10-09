package players;

import matches.Match;

import java.util.ArrayList;
import java.util.List;

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

}
