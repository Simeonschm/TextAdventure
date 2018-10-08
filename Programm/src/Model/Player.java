package Model;

public class Player extends Figure {

    private String name;

    public Player(String name){
        this.name = name;
    }

    public String getPlayerName() {
        return name;
    }
}
