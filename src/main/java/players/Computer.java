package players;

import matches.MatchBox;

import java.util.Random;

public class Computer extends Player{
    private final int MAX = 4;
    private final int MIN = 1;

    public Computer(){}

    public Computer(String name) {
        super(name);
    }

    @Override
    public int pullMatchFromBox(MatchBox box) {
        Random rand = new Random();
        int randomNum = rand.nextInt((MAX - MIN) + 1) + MIN;
        int matchInBox = box.setAmount(box.getAmount() - randomNum);
        System.out.println(this.getName() + " pulled " + randomNum + " matches.");
        System.out.println("The number of matches in this box: " + box.getAmount());
        return matchInBox;
    }
}
