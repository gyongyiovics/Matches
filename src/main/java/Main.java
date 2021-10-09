import gameField.Game;
import matches.MatchBox;

public class Main {
    public static void main(String[] args) {
        MatchBox matchBox = new MatchBox(10);
        System.out.println(matchBox.matchInBox());

        Game game = new Game();
        game.pullMatchFromBox();

    }
}
