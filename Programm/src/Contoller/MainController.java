package Contoller;

import Model.Player;

public class MainController {

    private Player player;

    public MainController(){

    }

    public void createPlayer(String name) {
        player = new Player(name, 1, 1, "");
    }

    public String getPlayerName() {
        return player.getName() ;
    }

    public int getPlayerStrength() {
        return player.getVitality();
    }

    public int getPlayerLevel() {
        return player.getLevel();

    }
}