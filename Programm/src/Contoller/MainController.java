package Contoller;

import Model.Monster;
import Model.Player;

public class MainController {

    private Player player;
    private Monster monster;

    public MainController(){

    }

    public void createPlayer(String name) {
        player = new Player(name, 2, 1, "");
    }

    public void createMonster(String name) {
        monster = new Monster(monster.setMonstername(), 2, 1);
    }

    public String getPlayerName() {
        return player.getName() ;
    }

    public int getPlayerVitality() {
        return player.getVitality();
    }

    public int getPlayerLevel() {
        return player.getLevel();
    }

    public String getMonsterName() {
        return monster.getName() ;
    }

    public int getMonsterVitality() {
        return monster.getVitality();
    }

    public int getMonsterLevel() {
        return monster.getLevel();
    }
}