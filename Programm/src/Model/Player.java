package Model;

public class Player extends Figure {

    private String gender;
    public Player(String name, int strength, int level, String gender) {
        super(name, strength, level);
        this.gender = gender;
    }
}
