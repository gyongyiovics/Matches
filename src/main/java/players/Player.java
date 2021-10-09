package players;

import matches.Match;

public class Player {
    private Match ownMatch;

    public Player(Match ownMatch) {
        this.ownMatch = ownMatch;
    }

    public Match getOwnMatch() {
        return ownMatch;
    }
}
