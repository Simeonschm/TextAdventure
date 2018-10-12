package Model;

public class Player extends Figure {

    private String gender;

    public Player(String name, int Strength, int level, String gender) {
        super(name, Strength, level);
        this.gender = gender;
    }

}
