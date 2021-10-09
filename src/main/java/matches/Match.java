package matches;

public class Match {
    //is this class necesssary?
    private int idNumber; //number of the matches -> 1-40
    private String color;

    public Match(int idNumber, String color) {
        this.idNumber = idNumber;
        this.color = color;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getColor() {
        return color;
    }
}
