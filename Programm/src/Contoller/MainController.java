package Contoller;

import Model.Player;

public class MainController {

    private Player player;

    public MainController(){

    }

    public void createPlayer(String name) {
        player = new Player(name);
    }

    public String getPlayerName() {
        return player.getPlayerName() ;
    }
}