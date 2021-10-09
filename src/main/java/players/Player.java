package players;

import matches.Match;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private Match ownMatch;

    /**
     * method get a MatchBox
     * method get an ownMatch - pull a match
     *
     */

    public Player(Match ownMatch) {
        this.ownMatch = ownMatch;
    }

    public Match getOwnMatch() {
        return ownMatch;
    }

    private List<Match> onwMatches(int num) {
        List<Match> matches = new ArrayList<>();
        //num -> matches.length
        return matches;
    }
}
